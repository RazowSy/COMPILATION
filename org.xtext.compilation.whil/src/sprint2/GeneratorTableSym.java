
package sprint2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Affectation;
import org.xtext.example.mydsl.myDsl.Commande;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Condition;
import org.xtext.example.mydsl.myDsl.ElemSimple;
import org.xtext.example.mydsl.myDsl.ExprSimple;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Fonction;
import org.xtext.example.mydsl.myDsl.For;
import org.xtext.example.mydsl.myDsl.ForEach;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.Input;
import org.xtext.example.mydsl.myDsl.Lexpr;
import org.xtext.example.mydsl.myDsl.Nop;
import org.xtext.example.mydsl.myDsl.Output;
import org.xtext.example.mydsl.myDsl.Program;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.While;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class GeneratorTableSym {
	// MAIN //
	HashMap<String, tableSymFun> table = new HashMap<String, tableSymFun>();
	HashMap<String, String> symboles = new HashMap<String, String>();
	
	int indice_val=1;
	int indice_sym=1;
	int indice_fun=0;

	public static void main(String[] args) {
		Injector injector = new MyDslStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		GeneratorTableSym main = injector.getInstance(GeneratorTableSym.class);
		
		main.createSymTable("simple.wh");

	}

	// getter 
	public HashMap<String, tableSymFun> getHashMap() {
		return table;
	}
	
	public HashMap<String, String> getTabSymb(){
		return symboles;
	}
	// ajout d'un symbole dans la table des symboles
	public void putSymb(String var, int val) {
		if(!symboles.containsKey(var)) {
			String valeur = "s"+val;
			symboles.put(var, valeur);
		}
	}

	public String symbToString() {
		return "Symboles : " + symboles.toString();
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private JavaIoFileSystemAccess fileAccess;

	public void createSymTable(String fichier) {

		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(fichier), true);
		
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.out.println(issue);
			}
			return;
}

		TreeIterator<EObject> tree = resource.getAllContents();

		while (tree.hasNext()) {
			EObject next = tree.next();
			if (next instanceof Program)
				generateTable((Program) next); // Parcours l'AST du 'Program'
		}
	}

	// programme
	private void generateTable(Program program) {
		
		for (Fonction f : program.getFonctions()) {
			symboles.put(f.getNom(), "f" + Integer.toString(indice_fun));
			indice_fun++;
		}

		for (Fonction f : program.getFonctions()) {
			generateTable(f);
			indice_val=1;
		}
		
		System.out.println(table);
		System.out.println(symbToString());
	}

	// fonction
	private void generateTable(Fonction fonction) {
		String name = fonction.getNom();
		if (table.containsKey(name)) {
			System.out.println("Erreur nom de fonction déjà existante");
		} else {
			tableSymFun tableSym = new tableSymFun(name);
			generateTable(fonction.getIn(), tableSym);
			generateTable(fonction.getCommandes(), tableSym);
			generateTable(fonction.getOut(), tableSym);
			table.put(tableSym.getId(), tableSym);
		}

	}

	// read
	private void generateTable(Input read, tableSymFun tbSym) {

		EList<String> varsR = read.getIn();
		tbSym.setIn(varsR.size());

		for (String var : varsR) {
			String valeur = "v"+indice_val;
			tbSym.putVar(var,valeur);
			indice_val++;

			ThreeAddr c= new ThreeAddr (Operator.READ,"_",tbSym.getValeurs().get(var),"_");
			tbSym.addThreeAddr(c);
		}

	}

	// write
	private void generateTable(Output write, tableSymFun tbSym) {
		EList<String> varsW = write.getOut();
		tbSym.setOut(varsW.size());

		for (String var : varsW) {
			if(!tbSym.getValeurs().containsKey(var)) {
				String valeur = "v"+indice_val;
				tbSym.putVar(var,valeur);
				indice_val++;

			}
			ThreeAddr c= new ThreeAddr (Operator.WRITE,"_",tbSym.getValeurs().get(var),"_");
			tbSym.addThreeAddr(c);
		}

	}

	// commandes
	private void generateTable(Commandes cmds, tableSymFun tbSym) {
		if (!cmds.getCommandes().isEmpty()) {
			generateTable(cmds.getCommande(), tbSym);
			for (Commande cmd : cmds.getCommandes()) {
				generateTable(cmd, tbSym);

			}
		}

		else {
			generateTable(cmds.getCommande(), tbSym);
		}

	}

	// commande
	private void generateTable(Commande cmd, tableSymFun tbSym) {
		EObject obj = cmd.getCommande();
		if (cmd.getCommande() instanceof Nop) {

			ThreeAddr c= new ThreeAddr (Operator.NOP,"_","_","_");
			tbSym.addThreeAddr(c);
		}

		if (cmd.getCommande() instanceof Affectation) {

			generateTable((Affectation) obj, tbSym);
		}

		if (cmd.getCommande() instanceof If) {
			generateTable((If) obj, tbSym);
		}
		if (cmd.getCommande() instanceof For) {
			generateTable((For) obj, tbSym);
		}
		if (cmd.getCommande() instanceof While) {
			generateTable((While) obj, tbSym);
		}
		if (cmd.getCommande() instanceof ForEach) {
			generateTable((ForEach) obj, tbSym);
		}
	}

	
	// affectation
	private void generateTable(Affectation aff_cmd, tableSymFun tbSym) {
		List<Variable> vars = aff_cmd.getVariable();
		List<Expression> expr = aff_cmd.getElm();

		Iterator<Variable> itVar = vars.iterator();
		Iterator<Expression> itExpr = expr.iterator();
		String var;
		boolean elemsimple=false;
		while (itVar.hasNext() && (itExpr.hasNext() | elemsimple) ) {
			Expression exp= itExpr.next();
			 if (exp.getExprs()!=null && exp.getExprs().getElemSimple()!=null) {
				elemsimple=true;
				afunction(exp.getExprs().getElemSimple(), vars, tbSym);
				if(!itExpr.hasNext()) {
					
					break;
				}
			}
			 var = itVar.next().getVariable();

			// ajout de la variable dans la table des variables
			if(!tbSym.getValeurs().containsKey(var)) {
				String valeur = "v"+indice_val;
				tbSym.putVar(var,valeur);
				indice_val++;

			}
			
			generateTable(exp, tbSym, var);
		}
		while(itVar.hasNext()) {
			 var = itVar.next().getVariable();
			 if(!tbSym.getValeurs().containsKey(var)) {
					String valeur = "v"+indice_val;
					tbSym.putVar(var,valeur);
					indice_val++;

				}
		}
	}


	// expression
	private void generateTable(Expression expr, tableSymFun tbSym, String var) {
		if (expr.getExprs() != null) {
			generateTable(expr.getExprs(), tbSym, var);
		} else if (expr.getCond() != null) {
			generateTable(expr.getCond(), tbSym,var);
		}

	}


	// condition
	private void generateTable(Condition cond, tableSymFun tbSym, String var) {
		Operator op;
		if (cond.getComp().getComparateur().equals("or")){
			 op=Operator.OR;
		}
		else if (cond.getComp().getComparateur().equals("and")){
			 op=Operator.AND;
		}
		else {
			 op=Operator.EQUAL;
		}
		
		// condition composée
		if(cond.getE2().getCond()!=null){
			// affectation ou pas
			if(!tbSym.getValeurs().containsKey(var)){
			generateTable(cond.getE2().getCond(), tbSym, "bidule");
			ThreeAddr c= new ThreeAddr (op,"t"+indice_val,getAddr(cond.getE1(), tbSym),"t"+ (indice_val-1));
			tbSym.addThreeAddr(c);
			indice_val++;

			}
			else {
				generateTable(cond.getE2().getCond(), tbSym, "bidule");
				ThreeAddr c= new ThreeAddr (op,tbSym.getValeurs().get(var),getAddr(cond.getE1(), tbSym),"t"+ (indice_val-1));
				tbSym.addThreeAddr(c);
				indice_val++;
			}
		}
		else {
			// affectation ou pas
			if(!tbSym.getValeurs().containsKey(var)){
			ThreeAddr c= new ThreeAddr (op,"t"+ indice_val,getAddr(cond.getE1(), tbSym),getAddr(cond.getE2().getExprs(), tbSym));
			tbSym.addThreeAddr(c);
			indice_val++;
			}
			else {
				ThreeAddr c= new ThreeAddr (op,tbSym.getValeurs().get(var),getAddr(cond.getE1(), tbSym),getAddr(cond.getE2().getExprs(), tbSym));
				indice_val++;
				tbSym.addThreeAddr(c);
			}
		}

	}


	// expressions simples
	private void generateTable(ExprSimple expr, tableSymFun tbSym, String var) {
		
		Operator op;
		
		// arbre binaire (liste ou cons)
		if (expr.getAbin() != null) {
			if(expr.getAbin().getOp().getOp().equals("cons")){
				op=Operator.CONS;
				
			} else {
				op = Operator.LIST;
			}

			ThreeAddr c= new ThreeAddr (op, tbSym.getValeurs().get(var),getAddr(expr.getAbin().getE1().getExprs(), tbSym),getAddr(expr.getAbin().getE2().getExprs(), tbSym));
			tbSym.addThreeAddr(c);

		}

		// NIL
		if (expr.getNil() != null) {
			ThreeAddr c= new ThreeAddr (Operator.AFFECT, tbSym.getValeurs().get(var),"none", "_");
			tbSym.addThreeAddr(c);
		}
		

		// affectation de variable
		if (expr.getVariable() != null) {

			ThreeAddr c= new ThreeAddr (Operator.AFFECT, tbSym.getValeurs().get(var),getAddr(expr, tbSym),"_");
			tbSym.addThreeAddr(c);
			tbSym.putVar(var, getAddr(expr,tbSym));
		}

		// affectation de symbole
		if (expr.getSymb() != null) {
			ThreeAddr c= new ThreeAddr (Operator.AFFECT, tbSym.getValeurs().get(var),getAddr(expr, tbSym),"_");
			tbSym.addThreeAddr(c);

		}

		// Accesseurs
		if (expr.getAccsucc() != null) {
			
			if(expr.getAccsucc().getOp().getOp().equals("hd")){
				op = Operator.HD;

			} else {
				op = Operator.TL;
			}
			
			ThreeAddr c= new ThreeAddr (op,tbSym.getValeurs().get(var),getAddr(expr.getAccsucc().getExpr(),tbSym),"_");
			tbSym.addThreeAddr(c);

		}
		
		
	}
	
	// Appel de fonction
	private void afunction (ElemSimple elem, List<Variable> output, tableSymFun tbSym) {
		
		
	
		if(!symboles.containsKey(elem.getSymb()) || !symboles.get(elem.getSymb()).startsWith("f")) {
			// faudrait faire autre chose
			System.out.println(" !!! Erreur appel de fonction impossible, fonction " + elem.getSymb() + " inexistante");
		}
		else {
		Iterator<Variable> it = output.iterator();
		String out="";
		String var="";

		while(it.hasNext()) {
			var=it.next().getVariable();
			 if(!tbSym.getValeurs().containsKey(var)) {
					String valeur = "v"+indice_val;
					tbSym.putVar(var,valeur);
					indice_val++;

				}
			if (!it.hasNext()) {
			out+=tbSym.getValeurs().get(var);
			}
			else {
				out+=tbSym.getValeurs().get(var)+", ";
			}
		}
		Lexpr l = elem.getLexpr();
		String in="";
		while (l!=null) {
			if (l.getLexpr()!=null) {
				in+= getAddr(l.getE1(),tbSym)+ ", ";
			}
			else {
				in+= getAddr(l.getE1(),tbSym);
			}
			l = l.getLexpr();
			
		}
		ThreeAddr c = new ThreeAddr (Operator.CALL, out,symboles.get(elem.getSymb()),in);
		tbSym.addThreeAddr(c);
		}
	}
	// fonction qui récupère l'adresse de l'expression
	private String getAddr (ExprSimple expr, tableSymFun tbSym){
		Operator op;
		
		// arbre binaire (cons ou List)
		if (expr.getAbin() != null) {
			if(expr.getAbin().getOp().getOp().equals("cons")){
				op = Operator.CONS;
				
			} else {
				op = Operator.LIST;
			}
			
			String addr= "t"+indice_val;
			indice_val++;
			ThreeAddr c= new ThreeAddr (op,addr,getAddr(expr.getAbin().getE1().getExprs(), tbSym),getAddr(expr.getAbin().getE2().getExprs(), tbSym));
			tbSym.addThreeAddr(c);
			return addr;

		}

		// Nil
		if (expr.getNil() != null) {
			return "None";
		}

		// variable
		if (expr.getVariable() != null) {
			if(tbSym.getValeur(expr.getVariable().getVariable())!=null) {
				return tbSym.getValeur(expr.getVariable().getVariable());				
			}
			else {
				return "null";
			}
		}

		// symbole
		if (expr.getSymb() != null) {
			if(! symboles.containsKey(expr.getSymb())) {
				putSymb(expr.getSymb(), indice_sym);
				indice_sym++;
			}
			return symboles.get(expr.getSymb());

		}

		// accesseurs
		if (expr.getAccsucc() != null) {
			
			if(expr.getAccsucc().getOp().getOp().equals("hd")){
				op = Operator.HD;
				

			} else {
				op = Operator.TL;

			}
			String addr= "t" +Integer.toString(indice_val);
			indice_val++;
			ThreeAddr c= new ThreeAddr (op,addr,getAddr(expr.getAccsucc().getExpr(),tbSym),"_");
			tbSym.addThreeAddr(c);
			return addr;


		}

		if (expr.getElemSimple() != null) {

		}
		return "bouchon";
	}

	private void generateTable(If if_cmd, tableSymFun tbSym) {
		Commandes cmds1 = if_cmd.getCmdsIf();
		generateTable(if_cmd.getCond(),tbSym,"bidule");
		int tmp=indice_val-1;
		List<ThreeAddr> listTmp = tbSym.getCode();
		tbSym.setCode(new LinkedList<ThreeAddr>());
		generateTable(cmds1, tbSym);
		ThreeAddr c= new ThreeAddr (Operator.IF,"_","t"+tmp,new Pair(tbSym.getCode(), new LinkedList<ThreeAddr>()));
		if(if_cmd.getCmdsElse()!=null) {
			Commandes cmds2 = if_cmd.getCmdsElse();
			tbSym.setCode(new LinkedList<ThreeAddr>());
			generateTable(cmds2, tbSym);
			c.p.setlFalse(tbSym.getCode());
			
		}
		tbSym.setCode(listTmp);
		tbSym.addThreeAddr(c);

	}

	private void generateTable(For for_cmd, tableSymFun tbSym) {
		List<ThreeAddr> listTmp = tbSym.getCode();
		String evalCond= getAddr(for_cmd.getCond().getExprs(),tbSym);
		tbSym.setCode(new LinkedList<ThreeAddr>());
		Commandes cmds = for_cmd.getCmdsFor();
		generateTable(cmds, tbSym);
		ThreeAddr c= new ThreeAddr (Operator.FOR,"_",evalCond, tbSym.getCode());
		tbSym.setCode(listTmp);
		tbSym.addThreeAddr(c);
	}

	private void generateTable(While while_cmd, tableSymFun tbSym) {
		Commandes cmds = while_cmd.getCmdsWh();
		List<ThreeAddr> listTmp = tbSym.getCode();
		tbSym.setCode(new LinkedList<ThreeAddr>());
		generateTable(cmds, tbSym);
		ThreeAddr c= new ThreeAddr (Operator.WHILE,"_","bouchon",new LinkedList<ThreeAddr>());
		tbSym.setCode(listTmp);
		tbSym.addThreeAddr(c);
	}

	private void generateTable(ForEach foreach_cmd, tableSymFun tbSym) {
		Commandes cmds = foreach_cmd.getCmdsFor();
		generateTable(cmds, tbSym);
	}
	/*
	private String numberOfCons(Expression expr) {
		int i=0;
		while(expr.getExprs().getAbin() != null) {
			i+=1;
			expr = expr.getExprs().getAbin().getE1();
		}
		return Integer.toString(i);
	}
	*/

}