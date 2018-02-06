package sprint3;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.io.FileUtils;

import sprint2.GeneratorTableSym;
import sprint2.Operator;
import sprint2.ThreeAddr;
import sprint2.tableSymFun;

public class traduction3a {
	
	private final static String retourchariot ="\n";
	private final static String tab= "\t";
	// numéro de la fonction suivante
	private static int number=1;
	private static boolean lastFun=false;
	
	// création d'une longue string qui contiendra tout le code python
	private static StringBuilder stb = new StringBuilder();
	// récupération table de fonctions
	protected static GeneratorTableSym code;
	protected static int nbImbrication=0;

	

	// fonction annexe
	public static String getKey (String valeur, HashMap<String,String> map) {
		for (String o : map.keySet()) {
		      if (map.get(o).equals(valeur)) {
		        return o;
		      }
		    }
		    return null;
		  }
	//implémentation du fichier python
	public static void translate (String fichier){
		stb.append("import sys\n");
		stb.append("from libwh import *\n");
		stb.append(retourchariot);
		stb.append("################################################################################");
		stb.append(retourchariot);
		stb.append("##                                                                            ##");
		stb.append(retourchariot);
		stb.append("##         Projet COMP - groupe Python                                        ##");
		stb.append(retourchariot);
		stb.append("##         Auteurs : Brunoy Sophy , Connan Hugues , Heye Erwan                ##" );
		stb.append(retourchariot);
		stb.append("##                   Keroullas Solenn, Le Yhuelic Matthias , Melin Victor     ##");
		stb.append(retourchariot);
		stb.append("##                                                                            ##");
		stb.append(retourchariot);
		stb.append("################################################################################\n");
		// parcours de la table de fonction
		HashMap<String, tableSymFun> symTable=code.getHashMap();
		Iterator<tableSymFun>iteratortabsymfun =symTable.values().iterator();
		HashMap<String, String> tabsym = code.getTabSymb();
		
		// declaration des symboles
				boolean existsymbol=false;
				String symboles="global ";
				Iterator<String> it = tabsym.values().iterator();
				List<String> listsymb = new ArrayList<String>();
				int i=0;
				while (it.hasNext()) {
					String sym = it.next().toString();
					if(!sym.contains("f")) {
						existsymbol=true;
						listsymb.add(sym);
						if(i ==0) {
						symboles += sym ;
						i++;
						}
						else {
							symboles += ", "+sym ;
						}
					}
					
				}
				
				for( int k =0; k< listsymb.size();k++) {
					symboles+= " \n" + listsymb.get(k) + "=\"" +  getKey(listsymb.get(k),tabsym) +"\"" ;
				}
				if(existsymbol) {
				stb.append(symboles);
				}
		// parcours du code de chaque fonction
		
			tableSymFun previous=null;
		while (iteratortabsymfun.hasNext()){
			tableSymFun tabfonc= iteratortabsymfun.next();
			if(!iteratortabsymfun.hasNext()) lastFun=true;
			trans_code(tabfonc,tabsym,stb);
			previous=tabfonc;
		}
		stb.append("\n \n#Partie main \n\n");
		// 1 a modifié quand on aura le main.
		if(previous.getIn()<1){
			System.out.println("nb de paramètres insufisant");
		}
		else{
			String param="(";
			for(int j=1; j< previous.getIn()+1; j++){
				if (j==previous.getIn()) param+="toList(sys.argv["+j+"])))";
				else param+="toList(sys.argv["+j+"]), ";
			}
			stb.append("print (f" +previous.getId() +param);
		} 
		//System.out.println(stb);
		// récupération du code 3a et ecriture des fonctions
		
		
		File file= new File(fichier+".py");
		try {
			FileUtils.writeStringToFile(file, stb.toString(), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	// pour traduire à partir de la table des symboles le code avec switch case sur les differentes fonctions
public static void trans_code(tableSymFun tabfonc,HashMap<String, String> tabsymb, StringBuilder st){
		
		// création de la fonction , ajout à la string finale 
		st.append(retourchariot);
		String def = "def "+ tabsymb.get(tabfonc.getnamefunction()) + " (";
		
		
		number =number+1; 
		String indent = tab; 
		st.append(retourchariot);
		
		// récupération du code 3 addr de la fonction 
		List<ThreeAddr> allcode3a =tabfonc.getCode();
		//iteration du code 3a 
		Iterator<ThreeAddr> it = allcode3a.iterator(); 
		String code="";
		String retour = "return (";
		//indice nb variable pour le return
		int k=0;
		
		//indice nb variable pour le read
		int i=0;
		
		code =iteration (it,st,indent,def,code,retour,k,i);
		
		
		// tant qu'on a encore des operator dans la fonction
			}
		public static String iteration (Iterator<ThreeAddr> iter,StringBuilder st, String indent, String def, String code, String retour, int k, int i ){
			int nblist=0;
			String msg =""; 
			while (iter.hasNext()){
				ThreeAddr code3a = iter.next();
				//System.out.println(code3a.getOp());
				
				switch (code3a.getOp()){
			
				case READ: 
					if(i==0) {
						i++;
						def = def +code3a.getrRead1();
					}
					else {
						def+=",";
					def = def +code3a.getrRead1();
					}
					break;
					
				
				case NOP: 
					code = code + indent +"pass"; 
					code = code + retourchariot;
					break;
				
				case NIL : 
					code = code + indent + "None";
					code=code + retourchariot;
					break;
					
				case HD:
					code += indent + code3a.getrWrite()  + " = " + code3a.getrRead1() +"[0]";
					code += retourchariot;
					break;
					
				case TL:
					code += indent + code3a.getrWrite()  + " = " + code3a.getrRead1() +"[1]";
					code += retourchariot;
					break;
				
				case AND:
					code += indent + code3a.getrWrite()  + " = " + "redefAnd("+code3a.getrRead1() +"," + code3a.getrRead2() + ")";
					code += retourchariot;
					break;
					
				case OR:
					code += indent + code3a.getrWrite()  + " = " + "redefOr(" + code3a.getrRead1() +"," + code3a.getrRead2() +")";
					code += retourchariot;
					break;
					
				case EQUAL:
					code += indent + code3a.getrWrite()  + " = " + code3a.getrRead1() +" == " + code3a.getrRead2();
					code += retourchariot;
					break;
					
				case IF:
					nbImbrication++;
					code += indent + "if " + code3a.getrRead1() + " :" + retourchariot;
					List<ThreeAddr> ifcode3a =code3a.getIf();
					Iterator<ThreeAddr> it = ifcode3a.iterator(); 
					code += iteration(it,st,indent+"\t","","","",k,i);
					if( !code3a.getElse().isEmpty()) {
						code += indent + "else : " + retourchariot;
						List<ThreeAddr> elsecode3a =code3a.getElse();
						 it = elsecode3a.iterator(); 
						code+=iteration(it,st,indent+ "\t","","","",k,i);
					}
					nbImbrication--;
					break;
					
				case FOR:
					nbImbrication++;
					code += indent + "for i in range(0," + "numberOfCons(" +code3a.getrRead1() + ")) :" + retourchariot;
					List<ThreeAddr> forcode3a =code3a.getList();
					it = forcode3a.iterator();
					code +=iteration(it,st,indent+"\t","","","",k,i);
					nbImbrication--;
					break;
					
				case CONS:
					code += indent + code3a.getrWrite()  + " = " +"[" +code3a.getrRead1() +", " + code3a.getrRead2()+"]";
					code += retourchariot;
					break;
					
				case LIST	:
					String lis= indent + code3a.getrWrite() +"=";
					ListIterator <ThreeAddr> blop= (ListIterator<ThreeAddr>) iter;

					if (nblist==0){
						nblist=1; 
						msg =  "[" + code3a.getrRead1()+",[ " + code3a.getrRead2()+", None ]]";
						if (blop.next().getOp().compareTo(Operator.LIST)!=0){
							code+= lis+msg ;
							code += retourchariot;
							nblist=0;
							
						}
						blop.previous();
					}else{

							if (blop.next().getOp().compareTo(Operator.LIST)==0 ){
								blop.previous();
								if (code3a.getrWrite()==blop.next().getrRead2()){
								msg= "[" + code3a.getrRead1()+","+msg+"]" ;
								blop.previous();
								}else {
									msg= "[" + code3a.getrRead2()+","+msg+"]" ;
									blop.previous();
								}
							}else {
								blop.previous();
								blop.previous();
								if (blop.previous().getrWrite()==code3a.getrRead2()){
									code+= lis+"[" + code3a.getrRead1()+","+msg+"]"  ;
									code += retourchariot;
									blop.next();
								}else{
									code+= lis+"[" + code3a.getrRead2()+","+msg+"]"  ;
									code += retourchariot;
									blop.next();
								}
								if (blop.next().getOp().compareTo(Operator.LIST)==0 ){
									nblist=0;
									
								}
							}
							
					}
					break;
					
				case WRITE: 
					if(lastFun){
					if (k==0){
						k+=1; 
						retour=retour+ "toWhile("+ code3a.getrRead1() +")";
					}else {
						retour+=",";
						retour=retour+  "toWhile(" + code3a.getrRead1()+ ")";
					}}
					else {
						if (k==0){
							k+=1; 
							retour=retour+ code3a.getrRead1() ;
						}else {
							retour+=",";
							retour=retour+ code3a.getrRead1();
						}
					}
			
					
					break;
				
				case AFFECT: 
		
					code = code +indent +code3a.getrWrite()+" = "+ code3a.getrRead1();
					code = code + retourchariot;
					break;
					
				case CALL:
					code +=  indent + code3a.getrWrite() + " = " + code3a.getrRead1() + "(" + code3a.getrRead2() + ")" + retourchariot;
					break;
					
				default:
					System.out.println("coucou");
					break;
			}
			
		}
			if(nbImbrication==0){
			st.append(def + ") :" + retourchariot);
			st.append(code);
			st.append(indent + retour + ")");
			
			}			
			return code;
		}

}