/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.ABin;
import org.xtext.example.mydsl.myDsl.AccSucc;
import org.xtext.example.mydsl.myDsl.Affectation;
import org.xtext.example.mydsl.myDsl.COMPARATEUR;
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
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Nill;
import org.xtext.example.mydsl.myDsl.Nop;
import org.xtext.example.mydsl.myDsl.Not;
import org.xtext.example.mydsl.myDsl.OpAccSucc;
import org.xtext.example.mydsl.myDsl.OpConstructeur;
import org.xtext.example.mydsl.myDsl.Output;
import org.xtext.example.mydsl.myDsl.Program;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.While;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ABIN:
				sequence_ABin(context, (ABin) semanticObject); 
				return; 
			case MyDslPackage.ACC_SUCC:
				sequence_AccSucc(context, (AccSucc) semanticObject); 
				return; 
			case MyDslPackage.AFFECTATION:
				sequence_Affectation(context, (Affectation) semanticObject); 
				return; 
			case MyDslPackage.COMPARATEUR:
				sequence_COMPARATEUR(context, (COMPARATEUR) semanticObject); 
				return; 
			case MyDslPackage.COMMANDE:
				sequence_Commande(context, (Commande) semanticObject); 
				return; 
			case MyDslPackage.COMMANDES:
				sequence_Commandes(context, (Commandes) semanticObject); 
				return; 
			case MyDslPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case MyDslPackage.ELEM_SIMPLE:
				sequence_ElemSimple(context, (ElemSimple) semanticObject); 
				return; 
			case MyDslPackage.EXPR_SIMPLE:
				sequence_ExprSimple(context, (ExprSimple) semanticObject); 
				return; 
			case MyDslPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case MyDslPackage.FONCTION:
				sequence_Fonction(context, (Fonction) semanticObject); 
				return; 
			case MyDslPackage.FOR:
				sequence_For(context, (For) semanticObject); 
				return; 
			case MyDslPackage.FOR_EACH:
				sequence_ForEach(context, (ForEach) semanticObject); 
				return; 
			case MyDslPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case MyDslPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case MyDslPackage.LEXPR:
				sequence_Lexpr(context, (Lexpr) semanticObject); 
				return; 
			case MyDslPackage.NILL:
				sequence_Nill(context, (Nill) semanticObject); 
				return; 
			case MyDslPackage.NOP:
				sequence_Nop(context, (Nop) semanticObject); 
				return; 
			case MyDslPackage.NOT:
				if (rule == grammarAccess.getConditionRule()) {
					sequence_Condition_Not(context, (Not) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNotRule()) {
					sequence_Not(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.OP_ACC_SUCC:
				sequence_OpAccSucc(context, (OpAccSucc) semanticObject); 
				return; 
			case MyDslPackage.OP_CONSTRUCTEUR:
				sequence_OpConstructeur(context, (OpConstructeur) semanticObject); 
				return; 
			case MyDslPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case MyDslPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case MyDslPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case MyDslPackage.WHILE:
				sequence_While(context, (While) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ABin returns ABin
	 *
	 * Constraint:
	 *     (op=OpConstructeur e1=Expression e2=Expression)
	 */
	protected void sequence_ABin(ISerializationContext context, ABin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ABIN__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ABIN__OP));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ABIN__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ABIN__E1));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ABIN__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ABIN__E2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getABinAccess().getOpOpConstructeurParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getABinAccess().getE1ExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getABinAccess().getE2ExpressionParserRuleCall_3_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AccSucc returns AccSucc
	 *
	 * Constraint:
	 *     (op=OpAccSucc expr=ExprSimple)
	 */
	protected void sequence_AccSucc(ISerializationContext context, AccSucc semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACC_SUCC__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACC_SUCC__OP));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACC_SUCC__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACC_SUCC__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAccSuccAccess().getOpOpAccSuccParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAccSuccAccess().getExprExprSimpleParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Affectation returns Affectation
	 *
	 * Constraint:
	 *     (variable+=Variable variable+=Variable* elm+=Expression elm+=Expression*)
	 */
	protected void sequence_Affectation(ISerializationContext context, Affectation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     COMPARATEUR returns COMPARATEUR
	 *
	 * Constraint:
	 *     (comparateur='=?' | comparateur='or' | comparateur='and')
	 */
	protected void sequence_COMPARATEUR(ISerializationContext context, COMPARATEUR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commande returns Commande
	 *
	 * Constraint:
	 *     (
	 *         commande=Nop | 
	 *         commande=Affectation | 
	 *         commande=If | 
	 *         commande=While | 
	 *         commande=For | 
	 *         commande=ForEach
	 *     )
	 */
	protected void sequence_Commande(ISerializationContext context, Commande semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Commandes
	 *
	 * Constraint:
	 *     (commande=Commande commandes+=Commande*)
	 */
	protected void sequence_Commandes(ISerializationContext context, Commandes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (e1=ExprSimple comp=COMPARATEUR e2=Expression)
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONDITION__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONDITION__E1));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONDITION__COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONDITION__COMP));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CONDITION__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CONDITION__E2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getE1ExprSimpleParserRuleCall_1_0_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getConditionAccess().getCompCOMPARATEURParserRuleCall_1_1_0(), semanticObject.getComp());
		feeder.accept(grammarAccess.getConditionAccess().getE2ExpressionParserRuleCall_1_2_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Not
	 *
	 * Constraint:
	 *     (not='not' expr=Expression)
	 */
	protected void sequence_Condition_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT__NOT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getNotNotKeyword_0(), semanticObject.getNot());
		feeder.accept(grammarAccess.getConditionAccess().getExprExpressionParserRuleCall_0_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElemSimple returns ElemSimple
	 *
	 * Constraint:
	 *     (symb=SYMBOL lexpr=Lexpr)
	 */
	protected void sequence_ElemSimple(ISerializationContext context, ElemSimple semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ELEM_SIMPLE__SYMB) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ELEM_SIMPLE__SYMB));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ELEM_SIMPLE__LEXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ELEM_SIMPLE__LEXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElemSimpleAccess().getSymbSYMBOLTerminalRuleCall_1_0(), semanticObject.getSymb());
		feeder.accept(grammarAccess.getElemSimpleAccess().getLexprLexprParserRuleCall_2_0(), semanticObject.getLexpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExprSimple returns ExprSimple
	 *
	 * Constraint:
	 *     (
	 *         nil=Nill | 
	 *         variable=Variable | 
	 *         abin=ABin | 
	 *         symb=SYMBOL | 
	 *         accsucc=AccSucc | 
	 *         elemSimple=ElemSimple
	 *     )
	 */
	protected void sequence_ExprSimple(ISerializationContext context, ExprSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (cond=Condition | exprs=ExprSimple)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fonction returns Fonction
	 *
	 * Constraint:
	 *     (nom=SYMBOL in=Input commandes=Commandes out=Output)
	 */
	protected void sequence_Fonction(ISerializationContext context, Fonction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__NOM));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__IN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__IN));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__COMMANDES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__COMMANDES));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FONCTION__OUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FONCTION__OUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFonctionAccess().getNomSYMBOLTerminalRuleCall_1_0(), semanticObject.getNom());
		feeder.accept(grammarAccess.getFonctionAccess().getInInputParserRuleCall_4_0(), semanticObject.getIn());
		feeder.accept(grammarAccess.getFonctionAccess().getCommandesCommandesParserRuleCall_6_0(), semanticObject.getCommandes());
		feeder.accept(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_9_0(), semanticObject.getOut());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ForEach returns ForEach
	 *
	 * Constraint:
	 *     (elem=Expression ensemble=Expression cmdsFor=Commandes)
	 */
	protected void sequence_ForEach(ISerializationContext context, ForEach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__ELEM));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__ENSEMBLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__ENSEMBLE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR_EACH__CMDS_FOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR_EACH__CMDS_FOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForEachAccess().getElemExpressionParserRuleCall_1_0(), semanticObject.getElem());
		feeder.accept(grammarAccess.getForEachAccess().getEnsembleExpressionParserRuleCall_3_0(), semanticObject.getEnsemble());
		feeder.accept(grammarAccess.getForEachAccess().getCmdsForCommandesParserRuleCall_5_0(), semanticObject.getCmdsFor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     For returns For
	 *
	 * Constraint:
	 *     (cond=Expression cmdsFor=Commandes)
	 */
	protected void sequence_For(ISerializationContext context, For semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR__COND));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FOR__CMDS_FOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FOR__CMDS_FOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForAccess().getCondExpressionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getForAccess().getCmdsForCommandesParserRuleCall_3_0(), semanticObject.getCmdsFor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     If returns If
	 *
	 * Constraint:
	 *     (cond=Expression cmdsIf=Commandes cmdsElse=Commandes?)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (in+=MAJ in+=MAJ*)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lexpr returns Lexpr
	 *
	 * Constraint:
	 *     (e1=ExprSimple lexpr=Lexpr?)
	 */
	protected void sequence_Lexpr(ISerializationContext context, Lexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Nill returns Nill
	 *
	 * Constraint:
	 *     nil='nil'
	 */
	protected void sequence_Nill(ISerializationContext context, Nill semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NILL__NIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NILL__NIL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNillAccess().getNilNilKeyword_0(), semanticObject.getNil());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Nop returns Nop
	 *
	 * Constraint:
	 *     nop='nop'
	 */
	protected void sequence_Nop(ISerializationContext context, Nop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOP__NOP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOP__NOP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNopAccess().getNopNopKeyword_0(), semanticObject.getNop());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Not returns Not
	 *
	 * Constraint:
	 *     not='not'
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT__NOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getNotNotKeyword_0(), semanticObject.getNot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OpAccSucc returns OpAccSucc
	 *
	 * Constraint:
	 *     (op='hd' | op='tl')
	 */
	protected void sequence_OpAccSucc(ISerializationContext context, OpAccSucc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OpConstructeur returns OpConstructeur
	 *
	 * Constraint:
	 *     (op='cons' | op='list')
	 */
	protected void sequence_OpConstructeur(ISerializationContext context, OpConstructeur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (out+=MAJ out+=MAJ*)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     fonctions+=Fonction+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     variable=MAJ
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getVariableMAJTerminalRuleCall_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     While returns While
	 *
	 * Constraint:
	 *     (cond=Expression cmdsWh=Commandes)
	 */
	protected void sequence_While(ISerializationContext context, While semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WHILE__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WHILE__COND));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WHILE__CMDS_WH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WHILE__CMDS_WH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileAccess().getCondExpressionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getWhileAccess().getCmdsWhCommandesParserRuleCall_3_0(), semanticObject.getCmdsWh());
		feeder.finish();
	}
	
	
}
