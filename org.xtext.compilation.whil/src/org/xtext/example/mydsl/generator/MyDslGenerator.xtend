/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Affectation
import org.xtext.example.mydsl.myDsl.Commande
import org.xtext.example.mydsl.myDsl.Commandes
import org.xtext.example.mydsl.myDsl.Condition
import org.xtext.example.mydsl.myDsl.ExprSimple
import org.xtext.example.mydsl.myDsl.Expression
import org.xtext.example.mydsl.myDsl.Fonction
import org.xtext.example.mydsl.myDsl.For
import org.xtext.example.mydsl.myDsl.ForEach
import org.xtext.example.mydsl.myDsl.If
import org.xtext.example.mydsl.myDsl.Nop
import org.xtext.example.mydsl.myDsl.Program
import org.xtext.example.mydsl.myDsl.While

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
	int nbCmdImbrique=0;
	int indentALl=2;
	int indentFOR=2;
	int indentIF=2;
	int indentWHILE=2;
	int indentFOREACH=2;
	
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context ) {
 	for (e : resource.allContents.toIterable.filter(typeof(Program))){	
			fsa.generateFile(resource.className +".whpp",	e.compile);
		}
	}
	
	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, int all, int si, int pour, int pourEach, int tq ) {
 	indentALl=all;
	indentFOR=pour;
	indentIF=si;
    indentWHILE=tq;
	indentFOREACH=pourEach;
 	for (e : resource.allContents.toIterable.filter(typeof(Program))){	
			fsa.generateFile(resource.className +".whpp",	e.compile);
		}
	}
	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
}
	def doGenerate (Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, String sortie, int all, int si, int pour, int pourEach, int tq) {
		for (e : resource.allContents.toIterable.filter(typeof(Program))){
			fsa.generateFile(sortie, e.compile)
		}
}
	
	def compile (Program program){
		var result=""
		for( f: program.fonctions) result+=f.compile
		return result
	}
	
	def compile(Fonction fonction){
		'''
		function �fonction.nom�:
		read �FOR param :fonction.in.in SEPARATOR ', '��param��ENDFOR�
		%
		�fonction.commandes.compile�
		%
		write �FOR result :fonction.out.out SEPARATOR ', '��result��ENDFOR�
		'''
	}
	def compile(Commandes cmds){
		var affichage=""
		if(!cmds.commandes.empty){
		    affichage=cmds.commande.compile + " ;\n"
			var nbCommandes=0
			for(Commande cmd : cmds.commandes){
				if(nbCommandes==cmds.commandes.size -1 ){
						// derni�re commmande a executer pas de ; ni \n
					affichage+= cmd.compile()
				}
				else{
					affichage+=cmd.compile +" ;\n"
					nbCommandes++
				}
			}
		}
		else {
		      affichage =cmds.commande.compile
		}
		return affichage
	}

	def compile(Commande cmd){
		if ( cmd.commande instanceof Nop) return indentation(nbCmdImbrique+1,"all")+"nop";
		
	    if(cmd.commande instanceof Affectation)	return  indentation(nbCmdImbrique+1,"all")+(cmd.commande as Affectation).compile
	  	
	  	if(cmd.commande instanceof If)return (cmd.commande as If).compile
	 
	  	if(cmd.commande instanceof For)	return (cmd.commande as For).compile
	  	
	  	if(cmd.commande instanceof While) return (cmd.commande as While).compile
		
	  	if(cmd.commande instanceof ForEach)	return (cmd.commande as ForEach).compile
	}
	def compile(ForEach poureach){
		nbCmdImbrique++
		var result= indentation(nbCmdImbrique,"foreach") + "foreach " + poureach.elem.compile + " in " +
		poureach.ensemble.compile + " do\n"
		+  poureach.cmdsFor.compile + "\n" + indentation(nbCmdImbrique,"foreach")+ "od"
		nbCmdImbrique--
		return result
	}
	def compile(While tq){
		nbCmdImbrique++
		var result=indentation(nbCmdImbrique,"while") +"while " + tq.cond.compile + " do\n"
		+ tq.cmdsWh.compile + "\n" + indentation(nbCmdImbrique,"while")+ "od"
		nbCmdImbrique--
		return result
	}
	
	def compile(For pour){
		nbCmdImbrique++
		var result= indentation(nbCmdImbrique,"for") + "for " + pour.cond.compile+" do\n"
		+  pour.cmdsFor.compile + "\n" + indentation(nbCmdImbrique,"for")+ "od"
		nbCmdImbrique--
		return result
	}
	def compile(If si){
		nbCmdImbrique++
		var result= indentation(nbCmdImbrique,"if") + 'if ' + si.cond.compile+" then\n"
	     + si.cmdsIf.compile
		if (si.cmdsElse!=null)  result+="\n"+  indentation(nbCmdImbrique,"if") +"else\n" + si.cmdsElse.compile
		result+="\n" + indentation(nbCmdImbrique,"if")+ "fi"
		nbCmdImbrique--		
		return result
	}
	def compile(Affectation affect){
		var result=""
		if(affect.variable==1){
			// Simple affectation
			return affect.variable.get(0).variable + " := " + affect.elm.get(0).compile
		}else {
			//Affectation multiple
			for(i:0 ..< affect.variable.size){
				if (i <  affect.variable.size -1)	result+=affect.variable.get(i).variable + ", "
				else result+= affect.variable.get(i).variable +" := "			
			}
			for(i:0 ..< affect.elm.size){
				if (i <  affect.elm.size -1)	result+=affect.elm.get(i).compile + ", "
				else result+= affect.elm.get(i).compile		
			}
		}
		return result
		
	}
	def compile(Expression expression){
		if (expression.exprs!=null) return expression.exprs.compile
		else if (expression.cond!=null) return expression.cond.compile
	}
	def compile(Condition cond){
		if(cond.e1!=null) return cond.e1.compile +" " + cond.comp.comparateur + " " +cond.e2.compile
		else  return  " pas encore fait �a bug "
	}
	def compile(ExprSimple expr){
		if(expr.abin!=null)	return "(" + expr.abin.op.op+" " +expr.abin.e1.compile +" " + expr.abin.e2.compile + ")"
			
		if(expr.nil!=null) return "nil"
	
		if(expr.variable!=null)	return expr.variable.variable
		
		if(expr.symb!=null )return expr.symb
		
		if(expr.accsucc!=null)return "(" + expr.accsucc.op.op +" " +expr.accsucc.expr.compile + ")"
		
		if(expr.elemSimple !=null)return  "(" +expr.elemSimple.symb +" " + expr.elemSimple.lexpr
		 +" " +expr.elemSimple + ")"

		}
		def indentation(int nb, String type){
			var i=1
			var result=""
			if(type.equals("all")){
				while (i <nb *indentALl){
				result+=" "
				i++
			}
			}
			if(type.equals("while")){
				while (i <nb * indentWHILE){
				result+=" "
				i++
			}
			}
			if(type.equals("for")){
				while (i <nb * indentFOR){
				result+=" "
				i++
			}
			}
			if(type.equals("if")){
				while (i <nb * indentIF){
				result+=" "
				i++
			}
			}
			if(type.equals("foreach")){
				while (i <nb * indentFOREACH){
				result+=" "
				i++
			}
			}
			return result
		}
}
