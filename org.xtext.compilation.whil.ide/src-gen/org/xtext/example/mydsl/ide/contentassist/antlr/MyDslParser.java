/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandeAccess().getAlternatives(), "rule__Commande__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getExprSimpleAccess().getAlternatives(), "rule__ExprSimple__Alternatives");
					put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
					put(grammarAccess.getOpAccSuccAccess().getAlternatives_1(), "rule__OpAccSucc__Alternatives_1");
					put(grammarAccess.getOpConstructeurAccess().getAlternatives_1(), "rule__OpConstructeur__Alternatives_1");
					put(grammarAccess.getCOMPARATEURAccess().getAlternatives(), "rule__COMPARATEUR__Alternatives");
					put(grammarAccess.getFonctionAccess().getGroup(), "rule__Fonction__Group__0");
					put(grammarAccess.getCommandesAccess().getGroup(), "rule__Commandes__Group__0");
					put(grammarAccess.getCommandesAccess().getGroup_1(), "rule__Commandes__Group_1__0");
					put(grammarAccess.getAffectationAccess().getGroup(), "rule__Affectation__Group__0");
					put(grammarAccess.getAffectationAccess().getGroup_0(), "rule__Affectation__Group_0__0");
					put(grammarAccess.getAffectationAccess().getGroup_0_1(), "rule__Affectation__Group_0_1__0");
					put(grammarAccess.getAffectationAccess().getGroup_2(), "rule__Affectation__Group_2__0");
					put(grammarAccess.getAffectationAccess().getGroup_2_1(), "rule__Affectation__Group_2_1__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_4(), "rule__If__Group_4__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
					put(grammarAccess.getForEachAccess().getGroup(), "rule__ForEach__Group__0");
					put(grammarAccess.getLexprAccess().getGroup(), "rule__Lexpr__Group__0");
					put(grammarAccess.getElemSimpleAccess().getGroup(), "rule__ElemSimple__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_0(), "rule__Condition__Group_0__0");
					put(grammarAccess.getConditionAccess().getGroup_1(), "rule__Condition__Group_1__0");
					put(grammarAccess.getABinAccess().getGroup(), "rule__ABin__Group__0");
					put(grammarAccess.getAccSuccAccess().getGroup(), "rule__AccSucc__Group__0");
					put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
					put(grammarAccess.getOutputAccess().getGroup_1(), "rule__Output__Group_1__0");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
					put(grammarAccess.getOpAccSuccAccess().getGroup(), "rule__OpAccSucc__Group__0");
					put(grammarAccess.getOpConstructeurAccess().getGroup(), "rule__OpConstructeur__Group__0");
					put(grammarAccess.getProgramAccess().getFonctionsAssignment(), "rule__Program__FonctionsAssignment");
					put(grammarAccess.getFonctionAccess().getNomAssignment_1(), "rule__Fonction__NomAssignment_1");
					put(grammarAccess.getFonctionAccess().getInAssignment_4(), "rule__Fonction__InAssignment_4");
					put(grammarAccess.getFonctionAccess().getCommandesAssignment_6(), "rule__Fonction__CommandesAssignment_6");
					put(grammarAccess.getFonctionAccess().getOutAssignment_9(), "rule__Fonction__OutAssignment_9");
					put(grammarAccess.getCommandesAccess().getCommandeAssignment_0(), "rule__Commandes__CommandeAssignment_0");
					put(grammarAccess.getCommandesAccess().getCommandesAssignment_1_1(), "rule__Commandes__CommandesAssignment_1_1");
					put(grammarAccess.getCommandeAccess().getCommandeAssignment_0(), "rule__Commande__CommandeAssignment_0");
					put(grammarAccess.getCommandeAccess().getCommandeAssignment_1(), "rule__Commande__CommandeAssignment_1");
					put(grammarAccess.getCommandeAccess().getCommandeAssignment_2(), "rule__Commande__CommandeAssignment_2");
					put(grammarAccess.getCommandeAccess().getCommandeAssignment_3(), "rule__Commande__CommandeAssignment_3");
					put(grammarAccess.getCommandeAccess().getCommandeAssignment_4(), "rule__Commande__CommandeAssignment_4");
					put(grammarAccess.getCommandeAccess().getCommandeAssignment_5(), "rule__Commande__CommandeAssignment_5");
					put(grammarAccess.getAffectationAccess().getVariableAssignment_0_0(), "rule__Affectation__VariableAssignment_0_0");
					put(grammarAccess.getAffectationAccess().getVariableAssignment_0_1_1(), "rule__Affectation__VariableAssignment_0_1_1");
					put(grammarAccess.getAffectationAccess().getElmAssignment_2_0(), "rule__Affectation__ElmAssignment_2_0");
					put(grammarAccess.getAffectationAccess().getElmAssignment_2_1_1(), "rule__Affectation__ElmAssignment_2_1_1");
					put(grammarAccess.getIfAccess().getCondAssignment_1(), "rule__If__CondAssignment_1");
					put(grammarAccess.getIfAccess().getCmdsIfAssignment_3(), "rule__If__CmdsIfAssignment_3");
					put(grammarAccess.getIfAccess().getCmdsElseAssignment_4_1(), "rule__If__CmdsElseAssignment_4_1");
					put(grammarAccess.getWhileAccess().getCondAssignment_1(), "rule__While__CondAssignment_1");
					put(grammarAccess.getWhileAccess().getCmdsWhAssignment_3(), "rule__While__CmdsWhAssignment_3");
					put(grammarAccess.getForAccess().getCondAssignment_1(), "rule__For__CondAssignment_1");
					put(grammarAccess.getForAccess().getCmdsForAssignment_3(), "rule__For__CmdsForAssignment_3");
					put(grammarAccess.getForEachAccess().getElemAssignment_1(), "rule__ForEach__ElemAssignment_1");
					put(grammarAccess.getForEachAccess().getEnsembleAssignment_3(), "rule__ForEach__EnsembleAssignment_3");
					put(grammarAccess.getForEachAccess().getCmdsForAssignment_5(), "rule__ForEach__CmdsForAssignment_5");
					put(grammarAccess.getNopAccess().getNopAssignment(), "rule__Nop__NopAssignment");
					put(grammarAccess.getExpressionAccess().getCondAssignment_0(), "rule__Expression__CondAssignment_0");
					put(grammarAccess.getExpressionAccess().getExprsAssignment_1(), "rule__Expression__ExprsAssignment_1");
					put(grammarAccess.getExprSimpleAccess().getNilAssignment_0(), "rule__ExprSimple__NilAssignment_0");
					put(grammarAccess.getExprSimpleAccess().getVariableAssignment_1(), "rule__ExprSimple__VariableAssignment_1");
					put(grammarAccess.getExprSimpleAccess().getAbinAssignment_2(), "rule__ExprSimple__AbinAssignment_2");
					put(grammarAccess.getExprSimpleAccess().getSymbAssignment_3(), "rule__ExprSimple__SymbAssignment_3");
					put(grammarAccess.getExprSimpleAccess().getAccsuccAssignment_4(), "rule__ExprSimple__AccsuccAssignment_4");
					put(grammarAccess.getExprSimpleAccess().getElemSimpleAssignment_5(), "rule__ExprSimple__ElemSimpleAssignment_5");
					put(grammarAccess.getVariableAccess().getVariableAssignment(), "rule__Variable__VariableAssignment");
					put(grammarAccess.getLexprAccess().getE1Assignment_0(), "rule__Lexpr__E1Assignment_0");
					put(grammarAccess.getLexprAccess().getLexprAssignment_1(), "rule__Lexpr__LexprAssignment_1");
					put(grammarAccess.getElemSimpleAccess().getSymbAssignment_1(), "rule__ElemSimple__SymbAssignment_1");
					put(grammarAccess.getElemSimpleAccess().getLexprAssignment_2(), "rule__ElemSimple__LexprAssignment_2");
					put(grammarAccess.getConditionAccess().getExprAssignment_0_1(), "rule__Condition__ExprAssignment_0_1");
					put(grammarAccess.getConditionAccess().getE1Assignment_1_0(), "rule__Condition__E1Assignment_1_0");
					put(grammarAccess.getConditionAccess().getCompAssignment_1_1(), "rule__Condition__CompAssignment_1_1");
					put(grammarAccess.getConditionAccess().getE2Assignment_1_2(), "rule__Condition__E2Assignment_1_2");
					put(grammarAccess.getABinAccess().getOpAssignment_1(), "rule__ABin__OpAssignment_1");
					put(grammarAccess.getABinAccess().getE1Assignment_2(), "rule__ABin__E1Assignment_2");
					put(grammarAccess.getABinAccess().getE2Assignment_3(), "rule__ABin__E2Assignment_3");
					put(grammarAccess.getAccSuccAccess().getOpAssignment_1(), "rule__AccSucc__OpAssignment_1");
					put(grammarAccess.getAccSuccAccess().getExprAssignment_2(), "rule__AccSucc__ExprAssignment_2");
					put(grammarAccess.getOutputAccess().getOutAssignment_0(), "rule__Output__OutAssignment_0");
					put(grammarAccess.getOutputAccess().getOutAssignment_1_1(), "rule__Output__OutAssignment_1_1");
					put(grammarAccess.getInputAccess().getInAssignment_0(), "rule__Input__InAssignment_0");
					put(grammarAccess.getInputAccess().getInAssignment_1_1(), "rule__Input__InAssignment_1_1");
					put(grammarAccess.getNillAccess().getNilAssignment(), "rule__Nill__NilAssignment");
					put(grammarAccess.getOpAccSuccAccess().getOpAssignment_1_0(), "rule__OpAccSucc__OpAssignment_1_0");
					put(grammarAccess.getOpAccSuccAccess().getOpAssignment_1_1(), "rule__OpAccSucc__OpAssignment_1_1");
					put(grammarAccess.getNotAccess().getNotAssignment(), "rule__Not__NotAssignment");
					put(grammarAccess.getOpConstructeurAccess().getOpAssignment_1_0(), "rule__OpConstructeur__OpAssignment_1_0");
					put(grammarAccess.getOpConstructeurAccess().getOpAssignment_1_1(), "rule__OpConstructeur__OpAssignment_1_1");
					put(grammarAccess.getCOMPARATEURAccess().getComparateurAssignment_0(), "rule__COMPARATEUR__ComparateurAssignment_0");
					put(grammarAccess.getCOMPARATEURAccess().getComparateurAssignment_1(), "rule__COMPARATEUR__ComparateurAssignment_1");
					put(grammarAccess.getCOMPARATEURAccess().getComparateurAssignment_2(), "rule__COMPARATEUR__ComparateurAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}