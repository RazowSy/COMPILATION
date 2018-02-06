package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_SEP", "RULE_MAJ", "RULE_ESPACE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'nop'", "'('", "')'", "'nil'", "'hd'", "'tl'", "'not'", "'cons'", "'list'", "'=?'", "'or'", "'and'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SEP=5;
    public static final int RULE_MAJ=6;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_ESPACE=7;
    public static final int RULE_SYMBOL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_fonctions_0_0= ruleFonction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_fonctions_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_fonctions_0_0= ruleFonction ) )* )
            // InternalMyDsl.g:78:2: ( (lv_fonctions_0_0= ruleFonction ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_fonctions_0_0= ruleFonction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_fonctions_0_0= ruleFonction )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_fonctions_0_0= ruleFonction )
            	    // InternalMyDsl.g:80:4: lv_fonctions_0_0= ruleFonction
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getProgramAccess().getFonctionsFonctionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_fonctions_0_0=ruleFonction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getProgramRule());
            	      				}
            	      				add(
            	      					current,
            	      					"fonctions",
            	      					lv_fonctions_0_0,
            	      					"org.xtext.example.mydsl.MyDsl.Fonction");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFonction"
    // InternalMyDsl.g:100:1: entryRuleFonction returns [EObject current=null] : iv_ruleFonction= ruleFonction EOF ;
    public final EObject entryRuleFonction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonction = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleFonction= ruleFonction EOF )
            // InternalMyDsl.g:101:2: iv_ruleFonction= ruleFonction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFonctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFonction=ruleFonction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFonction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // InternalMyDsl.g:107:1: ruleFonction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' otherlv_3= 'read' ( (lv_in_4_0= ruleInput ) ) otherlv_5= '%' ( (lv_commandes_6_0= ruleCommandes ) ) otherlv_7= '%' otherlv_8= 'write' ( (lv_out_9_0= ruleOutput ) ) ) ;
    public final EObject ruleFonction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_in_4_0 = null;

        EObject lv_commandes_6_0 = null;

        EObject lv_out_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' otherlv_3= 'read' ( (lv_in_4_0= ruleInput ) ) otherlv_5= '%' ( (lv_commandes_6_0= ruleCommandes ) ) otherlv_7= '%' otherlv_8= 'write' ( (lv_out_9_0= ruleOutput ) ) ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' otherlv_3= 'read' ( (lv_in_4_0= ruleInput ) ) otherlv_5= '%' ( (lv_commandes_6_0= ruleCommandes ) ) otherlv_7= '%' otherlv_8= 'write' ( (lv_out_9_0= ruleOutput ) ) )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' otherlv_3= 'read' ( (lv_in_4_0= ruleInput ) ) otherlv_5= '%' ( (lv_commandes_6_0= ruleCommandes ) ) otherlv_7= '%' otherlv_8= 'write' ( (lv_out_9_0= ruleOutput ) ) )
            // InternalMyDsl.g:115:3: otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' otherlv_3= 'read' ( (lv_in_4_0= ruleInput ) ) otherlv_5= '%' ( (lv_commandes_6_0= ruleCommandes ) ) otherlv_7= '%' otherlv_8= 'write' ( (lv_out_9_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFonctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalMyDsl.g:119:3: ( (lv_nom_1_0= RULE_SYMBOL ) )
            // InternalMyDsl.g:120:4: (lv_nom_1_0= RULE_SYMBOL )
            {
            // InternalMyDsl.g:120:4: (lv_nom_1_0= RULE_SYMBOL )
            // InternalMyDsl.g:121:5: lv_nom_1_0= RULE_SYMBOL
            {
            lv_nom_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_nom_1_0, grammarAccess.getFonctionAccess().getNomSYMBOLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFonctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"nom",
              						lv_nom_1_0,
              						"org.xtext.example.mydsl.MyDsl.SYMBOL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFonctionAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFonctionAccess().getReadKeyword_3());
              		
            }
            // InternalMyDsl.g:145:3: ( (lv_in_4_0= ruleInput ) )
            // InternalMyDsl.g:146:4: (lv_in_4_0= ruleInput )
            {
            // InternalMyDsl.g:146:4: (lv_in_4_0= ruleInput )
            // InternalMyDsl.g:147:5: lv_in_4_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFonctionAccess().getInInputParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_in_4_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFonctionRule());
              					}
              					set(
              						current,
              						"in",
              						lv_in_4_0,
              						"org.xtext.example.mydsl.MyDsl.Input");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFonctionAccess().getPercentSignKeyword_5());
              		
            }
            // InternalMyDsl.g:168:3: ( (lv_commandes_6_0= ruleCommandes ) )
            // InternalMyDsl.g:169:4: (lv_commandes_6_0= ruleCommandes )
            {
            // InternalMyDsl.g:169:4: (lv_commandes_6_0= ruleCommandes )
            // InternalMyDsl.g:170:5: lv_commandes_6_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFonctionAccess().getCommandesCommandesParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_commandes_6_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFonctionRule());
              					}
              					set(
              						current,
              						"commandes",
              						lv_commandes_6_0,
              						"org.xtext.example.mydsl.MyDsl.Commandes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFonctionAccess().getPercentSignKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getFonctionAccess().getWriteKeyword_8());
              		
            }
            // InternalMyDsl.g:195:3: ( (lv_out_9_0= ruleOutput ) )
            // InternalMyDsl.g:196:4: (lv_out_9_0= ruleOutput )
            {
            // InternalMyDsl.g:196:4: (lv_out_9_0= ruleOutput )
            // InternalMyDsl.g:197:5: lv_out_9_0= ruleOutput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFonctionAccess().getOutOutputParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_out_9_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFonctionRule());
              					}
              					set(
              						current,
              						"out",
              						lv_out_9_0,
              						"org.xtext.example.mydsl.MyDsl.Output");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleCommandes"
    // InternalMyDsl.g:218:1: entryRuleCommandes returns [EObject current=null] : iv_ruleCommandes= ruleCommandes EOF ;
    public final EObject entryRuleCommandes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandes = null;


        try {
            // InternalMyDsl.g:218:50: (iv_ruleCommandes= ruleCommandes EOF )
            // InternalMyDsl.g:219:2: iv_ruleCommandes= ruleCommandes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommandes=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandes"


    // $ANTLR start "ruleCommandes"
    // InternalMyDsl.g:225:1: ruleCommandes returns [EObject current=null] : ( ( (lv_commande_0_0= ruleCommande ) ) (this_SEP_1= RULE_SEP ( (lv_commandes_2_0= ruleCommande ) ) )* ) ;
    public final EObject ruleCommandes() throws RecognitionException {
        EObject current = null;

        Token this_SEP_1=null;
        EObject lv_commande_0_0 = null;

        EObject lv_commandes_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:231:2: ( ( ( (lv_commande_0_0= ruleCommande ) ) (this_SEP_1= RULE_SEP ( (lv_commandes_2_0= ruleCommande ) ) )* ) )
            // InternalMyDsl.g:232:2: ( ( (lv_commande_0_0= ruleCommande ) ) (this_SEP_1= RULE_SEP ( (lv_commandes_2_0= ruleCommande ) ) )* )
            {
            // InternalMyDsl.g:232:2: ( ( (lv_commande_0_0= ruleCommande ) ) (this_SEP_1= RULE_SEP ( (lv_commandes_2_0= ruleCommande ) ) )* )
            // InternalMyDsl.g:233:3: ( (lv_commande_0_0= ruleCommande ) ) (this_SEP_1= RULE_SEP ( (lv_commandes_2_0= ruleCommande ) ) )*
            {
            // InternalMyDsl.g:233:3: ( (lv_commande_0_0= ruleCommande ) )
            // InternalMyDsl.g:234:4: (lv_commande_0_0= ruleCommande )
            {
            // InternalMyDsl.g:234:4: (lv_commande_0_0= ruleCommande )
            // InternalMyDsl.g:235:5: lv_commande_0_0= ruleCommande
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandesAccess().getCommandeCommandeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_commande_0_0=ruleCommande();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandesRule());
              					}
              					set(
              						current,
              						"commande",
              						lv_commande_0_0,
              						"org.xtext.example.mydsl.MyDsl.Commande");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:252:3: (this_SEP_1= RULE_SEP ( (lv_commandes_2_0= ruleCommande ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_SEP) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:253:4: this_SEP_1= RULE_SEP ( (lv_commandes_2_0= ruleCommande ) )
            	    {
            	    this_SEP_1=(Token)match(input,RULE_SEP,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_SEP_1, grammarAccess.getCommandesAccess().getSEPTerminalRuleCall_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:257:4: ( (lv_commandes_2_0= ruleCommande ) )
            	    // InternalMyDsl.g:258:5: (lv_commandes_2_0= ruleCommande )
            	    {
            	    // InternalMyDsl.g:258:5: (lv_commandes_2_0= ruleCommande )
            	    // InternalMyDsl.g:259:6: lv_commandes_2_0= ruleCommande
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandesAccess().getCommandesCommandeParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_commandes_2_0=ruleCommande();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"commandes",
            	      							lv_commandes_2_0,
            	      							"org.xtext.example.mydsl.MyDsl.Commande");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandes"


    // $ANTLR start "entryRuleCommande"
    // InternalMyDsl.g:281:1: entryRuleCommande returns [EObject current=null] : iv_ruleCommande= ruleCommande EOF ;
    public final EObject entryRuleCommande() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommande = null;


        try {
            // InternalMyDsl.g:281:49: (iv_ruleCommande= ruleCommande EOF )
            // InternalMyDsl.g:282:2: iv_ruleCommande= ruleCommande EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommande=ruleCommande();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommande; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommande"


    // $ANTLR start "ruleCommande"
    // InternalMyDsl.g:288:1: ruleCommande returns [EObject current=null] : ( ( (lv_commande_0_0= ruleNop ) ) | ( (lv_commande_1_0= ruleAffectation ) ) | ( (lv_commande_2_0= ruleIf ) ) | ( (lv_commande_3_0= ruleWhile ) ) | ( (lv_commande_4_0= ruleFor ) ) | ( (lv_commande_5_0= ruleForEach ) ) ) ;
    public final EObject ruleCommande() throws RecognitionException {
        EObject current = null;

        EObject lv_commande_0_0 = null;

        EObject lv_commande_1_0 = null;

        EObject lv_commande_2_0 = null;

        EObject lv_commande_3_0 = null;

        EObject lv_commande_4_0 = null;

        EObject lv_commande_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:294:2: ( ( ( (lv_commande_0_0= ruleNop ) ) | ( (lv_commande_1_0= ruleAffectation ) ) | ( (lv_commande_2_0= ruleIf ) ) | ( (lv_commande_3_0= ruleWhile ) ) | ( (lv_commande_4_0= ruleFor ) ) | ( (lv_commande_5_0= ruleForEach ) ) ) )
            // InternalMyDsl.g:295:2: ( ( (lv_commande_0_0= ruleNop ) ) | ( (lv_commande_1_0= ruleAffectation ) ) | ( (lv_commande_2_0= ruleIf ) ) | ( (lv_commande_3_0= ruleWhile ) ) | ( (lv_commande_4_0= ruleFor ) ) | ( (lv_commande_5_0= ruleForEach ) ) )
            {
            // InternalMyDsl.g:295:2: ( ( (lv_commande_0_0= ruleNop ) ) | ( (lv_commande_1_0= ruleAffectation ) ) | ( (lv_commande_2_0= ruleIf ) ) | ( (lv_commande_3_0= ruleWhile ) ) | ( (lv_commande_4_0= ruleFor ) ) | ( (lv_commande_5_0= ruleForEach ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case RULE_MAJ:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:296:3: ( (lv_commande_0_0= ruleNop ) )
                    {
                    // InternalMyDsl.g:296:3: ( (lv_commande_0_0= ruleNop ) )
                    // InternalMyDsl.g:297:4: (lv_commande_0_0= ruleNop )
                    {
                    // InternalMyDsl.g:297:4: (lv_commande_0_0= ruleNop )
                    // InternalMyDsl.g:298:5: lv_commande_0_0= ruleNop
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandeAccess().getCommandeNopParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_commande_0_0=ruleNop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandeRule());
                      					}
                      					set(
                      						current,
                      						"commande",
                      						lv_commande_0_0,
                      						"org.xtext.example.mydsl.MyDsl.Nop");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:316:3: ( (lv_commande_1_0= ruleAffectation ) )
                    {
                    // InternalMyDsl.g:316:3: ( (lv_commande_1_0= ruleAffectation ) )
                    // InternalMyDsl.g:317:4: (lv_commande_1_0= ruleAffectation )
                    {
                    // InternalMyDsl.g:317:4: (lv_commande_1_0= ruleAffectation )
                    // InternalMyDsl.g:318:5: lv_commande_1_0= ruleAffectation
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandeAccess().getCommandeAffectationParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_commande_1_0=ruleAffectation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandeRule());
                      					}
                      					set(
                      						current,
                      						"commande",
                      						lv_commande_1_0,
                      						"org.xtext.example.mydsl.MyDsl.Affectation");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:336:3: ( (lv_commande_2_0= ruleIf ) )
                    {
                    // InternalMyDsl.g:336:3: ( (lv_commande_2_0= ruleIf ) )
                    // InternalMyDsl.g:337:4: (lv_commande_2_0= ruleIf )
                    {
                    // InternalMyDsl.g:337:4: (lv_commande_2_0= ruleIf )
                    // InternalMyDsl.g:338:5: lv_commande_2_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandeAccess().getCommandeIfParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_commande_2_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandeRule());
                      					}
                      					set(
                      						current,
                      						"commande",
                      						lv_commande_2_0,
                      						"org.xtext.example.mydsl.MyDsl.If");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:356:3: ( (lv_commande_3_0= ruleWhile ) )
                    {
                    // InternalMyDsl.g:356:3: ( (lv_commande_3_0= ruleWhile ) )
                    // InternalMyDsl.g:357:4: (lv_commande_3_0= ruleWhile )
                    {
                    // InternalMyDsl.g:357:4: (lv_commande_3_0= ruleWhile )
                    // InternalMyDsl.g:358:5: lv_commande_3_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandeAccess().getCommandeWhileParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_commande_3_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandeRule());
                      					}
                      					set(
                      						current,
                      						"commande",
                      						lv_commande_3_0,
                      						"org.xtext.example.mydsl.MyDsl.While");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:376:3: ( (lv_commande_4_0= ruleFor ) )
                    {
                    // InternalMyDsl.g:376:3: ( (lv_commande_4_0= ruleFor ) )
                    // InternalMyDsl.g:377:4: (lv_commande_4_0= ruleFor )
                    {
                    // InternalMyDsl.g:377:4: (lv_commande_4_0= ruleFor )
                    // InternalMyDsl.g:378:5: lv_commande_4_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandeAccess().getCommandeForParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_commande_4_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandeRule());
                      					}
                      					set(
                      						current,
                      						"commande",
                      						lv_commande_4_0,
                      						"org.xtext.example.mydsl.MyDsl.For");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:396:3: ( (lv_commande_5_0= ruleForEach ) )
                    {
                    // InternalMyDsl.g:396:3: ( (lv_commande_5_0= ruleForEach ) )
                    // InternalMyDsl.g:397:4: (lv_commande_5_0= ruleForEach )
                    {
                    // InternalMyDsl.g:397:4: (lv_commande_5_0= ruleForEach )
                    // InternalMyDsl.g:398:5: lv_commande_5_0= ruleForEach
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandeAccess().getCommandeForEachParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_commande_5_0=ruleForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandeRule());
                      					}
                      					set(
                      						current,
                      						"commande",
                      						lv_commande_5_0,
                      						"org.xtext.example.mydsl.MyDsl.ForEach");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommande"


    // $ANTLR start "entryRuleAffectation"
    // InternalMyDsl.g:419:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalMyDsl.g:419:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalMyDsl.g:420:2: iv_ruleAffectation= ruleAffectation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalMyDsl.g:426:1: ruleAffectation returns [EObject current=null] : ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )* ) otherlv_3= ':=' ( ( (lv_elm_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )* ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variable_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_elm_4_0 = null;

        EObject lv_elm_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:432:2: ( ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )* ) otherlv_3= ':=' ( ( (lv_elm_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )* ) ) )
            // InternalMyDsl.g:433:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )* ) otherlv_3= ':=' ( ( (lv_elm_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )* ) )
            {
            // InternalMyDsl.g:433:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )* ) otherlv_3= ':=' ( ( (lv_elm_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )* ) )
            // InternalMyDsl.g:434:3: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )* ) otherlv_3= ':=' ( ( (lv_elm_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )* )
            {
            // InternalMyDsl.g:434:3: ( ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )* )
            // InternalMyDsl.g:435:4: ( (lv_variable_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )*
            {
            // InternalMyDsl.g:435:4: ( (lv_variable_0_0= ruleVariable ) )
            // InternalMyDsl.g:436:5: (lv_variable_0_0= ruleVariable )
            {
            // InternalMyDsl.g:436:5: (lv_variable_0_0= ruleVariable )
            // InternalMyDsl.g:437:6: lv_variable_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_0_0_0());
              					
            }
            pushFollow(FOLLOW_12);
            lv_variable_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getAffectationRule());
              						}
              						add(
              							current,
              							"variable",
              							lv_variable_0_0,
              							"org.xtext.example.mydsl.MyDsl.Variable");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalMyDsl.g:454:4: (otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:455:5: otherlv_1= ',' ( (lv_variable_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getCommaKeyword_0_1_0());
            	      				
            	    }
            	    // InternalMyDsl.g:459:5: ( (lv_variable_2_0= ruleVariable ) )
            	    // InternalMyDsl.g:460:6: (lv_variable_2_0= ruleVariable )
            	    {
            	    // InternalMyDsl.g:460:6: (lv_variable_2_0= ruleVariable )
            	    // InternalMyDsl.g:461:7: lv_variable_2_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_0_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_variable_2_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAffectationRule());
            	      							}
            	      							add(
            	      								current,
            	      								"variable",
            	      								lv_variable_2_0,
            	      								"org.xtext.example.mydsl.MyDsl.Variable");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            otherlv_3=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAffectationAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalMyDsl.g:484:3: ( ( (lv_elm_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )* )
            // InternalMyDsl.g:485:4: ( (lv_elm_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )*
            {
            // InternalMyDsl.g:485:4: ( (lv_elm_4_0= ruleExpression ) )
            // InternalMyDsl.g:486:5: (lv_elm_4_0= ruleExpression )
            {
            // InternalMyDsl.g:486:5: (lv_elm_4_0= ruleExpression )
            // InternalMyDsl.g:487:6: lv_elm_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getAffectationAccess().getElmExpressionParserRuleCall_2_0_0());
              					
            }
            pushFollow(FOLLOW_14);
            lv_elm_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getAffectationRule());
              						}
              						add(
              							current,
              							"elm",
              							lv_elm_4_0,
              							"org.xtext.example.mydsl.MyDsl.Expression");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalMyDsl.g:504:4: (otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:505:5: otherlv_5= ',' ( (lv_elm_6_0= ruleExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getAffectationAccess().getCommaKeyword_2_1_0());
            	      				
            	    }
            	    // InternalMyDsl.g:509:5: ( (lv_elm_6_0= ruleExpression ) )
            	    // InternalMyDsl.g:510:6: (lv_elm_6_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:510:6: (lv_elm_6_0= ruleExpression )
            	    // InternalMyDsl.g:511:7: lv_elm_6_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAffectationAccess().getElmExpressionParserRuleCall_2_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_elm_6_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAffectationRule());
            	      							}
            	      							add(
            	      								current,
            	      								"elm",
            	      								lv_elm_6_0,
            	      								"org.xtext.example.mydsl.MyDsl.Expression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:534:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:534:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:535:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:541:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_cmdsIf_3_0= ruleCommandes ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommandes ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_1_0 = null;

        EObject lv_cmdsIf_3_0 = null;

        EObject lv_cmdsElse_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:547:2: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_cmdsIf_3_0= ruleCommandes ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommandes ) ) )? otherlv_6= 'fi' ) )
            // InternalMyDsl.g:548:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_cmdsIf_3_0= ruleCommandes ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommandes ) ) )? otherlv_6= 'fi' )
            {
            // InternalMyDsl.g:548:2: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_cmdsIf_3_0= ruleCommandes ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommandes ) ) )? otherlv_6= 'fi' )
            // InternalMyDsl.g:549:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_cmdsIf_3_0= ruleCommandes ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommandes ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalMyDsl.g:553:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalMyDsl.g:554:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalMyDsl.g:554:4: (lv_cond_1_0= ruleExpression )
            // InternalMyDsl.g:555:5: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCondExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_cond_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"org.xtext.example.mydsl.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
              		
            }
            // InternalMyDsl.g:576:3: ( (lv_cmdsIf_3_0= ruleCommandes ) )
            // InternalMyDsl.g:577:4: (lv_cmdsIf_3_0= ruleCommandes )
            {
            // InternalMyDsl.g:577:4: (lv_cmdsIf_3_0= ruleCommandes )
            // InternalMyDsl.g:578:5: lv_cmdsIf_3_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCmdsIfCommandesParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_cmdsIf_3_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"cmdsIf",
              						lv_cmdsIf_3_0,
              						"org.xtext.example.mydsl.MyDsl.Commandes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:595:3: (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommandes ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:596:4: otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommandes ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalMyDsl.g:600:4: ( (lv_cmdsElse_5_0= ruleCommandes ) )
                    // InternalMyDsl.g:601:5: (lv_cmdsElse_5_0= ruleCommandes )
                    {
                    // InternalMyDsl.g:601:5: (lv_cmdsElse_5_0= ruleCommandes )
                    // InternalMyDsl.g:602:6: lv_cmdsElse_5_0= ruleCommandes
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getCmdsElseCommandesParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_cmdsElse_5_0=ruleCommandes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"cmdsElse",
                      							lv_cmdsElse_5_0,
                      							"org.xtext.example.mydsl.MyDsl.Commandes");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalMyDsl.g:628:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalMyDsl.g:628:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalMyDsl.g:629:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalMyDsl.g:635:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsWh_3_0= ruleCommandes ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_cmdsWh_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:641:2: ( (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsWh_3_0= ruleCommandes ) ) otherlv_4= 'od' ) )
            // InternalMyDsl.g:642:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsWh_3_0= ruleCommandes ) ) otherlv_4= 'od' )
            {
            // InternalMyDsl.g:642:2: (otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsWh_3_0= ruleCommandes ) ) otherlv_4= 'od' )
            // InternalMyDsl.g:643:3: otherlv_0= 'while' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsWh_3_0= ruleCommandes ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalMyDsl.g:647:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalMyDsl.g:648:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalMyDsl.g:648:4: (lv_cond_1_0= ruleExpression )
            // InternalMyDsl.g:649:5: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getCondExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cond_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"org.xtext.example.mydsl.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
              		
            }
            // InternalMyDsl.g:670:3: ( (lv_cmdsWh_3_0= ruleCommandes ) )
            // InternalMyDsl.g:671:4: (lv_cmdsWh_3_0= ruleCommandes )
            {
            // InternalMyDsl.g:671:4: (lv_cmdsWh_3_0= ruleCommandes )
            // InternalMyDsl.g:672:5: lv_cmdsWh_3_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getCmdsWhCommandesParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_cmdsWh_3_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"cmdsWh",
              						lv_cmdsWh_3_0,
              						"org.xtext.example.mydsl.MyDsl.Commandes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // InternalMyDsl.g:697:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalMyDsl.g:697:44: (iv_ruleFor= ruleFor EOF )
            // InternalMyDsl.g:698:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalMyDsl.g:704:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsFor_3_0= ruleCommandes ) ) otherlv_4= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_cmdsFor_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:710:2: ( (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsFor_3_0= ruleCommandes ) ) otherlv_4= 'od' ) )
            // InternalMyDsl.g:711:2: (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsFor_3_0= ruleCommandes ) ) otherlv_4= 'od' )
            {
            // InternalMyDsl.g:711:2: (otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsFor_3_0= ruleCommandes ) ) otherlv_4= 'od' )
            // InternalMyDsl.g:712:3: otherlv_0= 'for' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_cmdsFor_3_0= ruleCommandes ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
              		
            }
            // InternalMyDsl.g:716:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalMyDsl.g:717:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalMyDsl.g:717:4: (lv_cond_1_0= ruleExpression )
            // InternalMyDsl.g:718:5: lv_cond_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getCondExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_cond_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_1_0,
              						"org.xtext.example.mydsl.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
              		
            }
            // InternalMyDsl.g:739:3: ( (lv_cmdsFor_3_0= ruleCommandes ) )
            // InternalMyDsl.g:740:4: (lv_cmdsFor_3_0= ruleCommandes )
            {
            // InternalMyDsl.g:740:4: (lv_cmdsFor_3_0= ruleCommandes )
            // InternalMyDsl.g:741:5: lv_cmdsFor_3_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getCmdsForCommandesParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_cmdsFor_3_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"cmdsFor",
              						lv_cmdsFor_3_0,
              						"org.xtext.example.mydsl.MyDsl.Commandes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleForEach"
    // InternalMyDsl.g:766:1: entryRuleForEach returns [EObject current=null] : iv_ruleForEach= ruleForEach EOF ;
    public final EObject entryRuleForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForEach = null;


        try {
            // InternalMyDsl.g:766:48: (iv_ruleForEach= ruleForEach EOF )
            // InternalMyDsl.g:767:2: iv_ruleForEach= ruleForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForEachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForEach=ruleForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForEach; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForEach"


    // $ANTLR start "ruleForEach"
    // InternalMyDsl.g:773:1: ruleForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpression ) ) otherlv_2= 'in' ( (lv_ensemble_3_0= ruleExpression ) ) otherlv_4= 'do' ( (lv_cmdsFor_5_0= ruleCommandes ) ) otherlv_6= 'od' ) ;
    public final EObject ruleForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elem_1_0 = null;

        EObject lv_ensemble_3_0 = null;

        EObject lv_cmdsFor_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:779:2: ( (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpression ) ) otherlv_2= 'in' ( (lv_ensemble_3_0= ruleExpression ) ) otherlv_4= 'do' ( (lv_cmdsFor_5_0= ruleCommandes ) ) otherlv_6= 'od' ) )
            // InternalMyDsl.g:780:2: (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpression ) ) otherlv_2= 'in' ( (lv_ensemble_3_0= ruleExpression ) ) otherlv_4= 'do' ( (lv_cmdsFor_5_0= ruleCommandes ) ) otherlv_6= 'od' )
            {
            // InternalMyDsl.g:780:2: (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpression ) ) otherlv_2= 'in' ( (lv_ensemble_3_0= ruleExpression ) ) otherlv_4= 'do' ( (lv_cmdsFor_5_0= ruleCommandes ) ) otherlv_6= 'od' )
            // InternalMyDsl.g:781:3: otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpression ) ) otherlv_2= 'in' ( (lv_ensemble_3_0= ruleExpression ) ) otherlv_4= 'do' ( (lv_cmdsFor_5_0= ruleCommandes ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForEachAccess().getForeachKeyword_0());
              		
            }
            // InternalMyDsl.g:785:3: ( (lv_elem_1_0= ruleExpression ) )
            // InternalMyDsl.g:786:4: (lv_elem_1_0= ruleExpression )
            {
            // InternalMyDsl.g:786:4: (lv_elem_1_0= ruleExpression )
            // InternalMyDsl.g:787:5: lv_elem_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForEachAccess().getElemExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_elem_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForEachRule());
              					}
              					set(
              						current,
              						"elem",
              						lv_elem_1_0,
              						"org.xtext.example.mydsl.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForEachAccess().getInKeyword_2());
              		
            }
            // InternalMyDsl.g:808:3: ( (lv_ensemble_3_0= ruleExpression ) )
            // InternalMyDsl.g:809:4: (lv_ensemble_3_0= ruleExpression )
            {
            // InternalMyDsl.g:809:4: (lv_ensemble_3_0= ruleExpression )
            // InternalMyDsl.g:810:5: lv_ensemble_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForEachAccess().getEnsembleExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_ensemble_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForEachRule());
              					}
              					set(
              						current,
              						"ensemble",
              						lv_ensemble_3_0,
              						"org.xtext.example.mydsl.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForEachAccess().getDoKeyword_4());
              		
            }
            // InternalMyDsl.g:831:3: ( (lv_cmdsFor_5_0= ruleCommandes ) )
            // InternalMyDsl.g:832:4: (lv_cmdsFor_5_0= ruleCommandes )
            {
            // InternalMyDsl.g:832:4: (lv_cmdsFor_5_0= ruleCommandes )
            // InternalMyDsl.g:833:5: lv_cmdsFor_5_0= ruleCommandes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForEachAccess().getCmdsForCommandesParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_cmdsFor_5_0=ruleCommandes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForEachRule());
              					}
              					set(
              						current,
              						"cmdsFor",
              						lv_cmdsFor_5_0,
              						"org.xtext.example.mydsl.MyDsl.Commandes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForEachAccess().getOdKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForEach"


    // $ANTLR start "entryRuleNop"
    // InternalMyDsl.g:858:1: entryRuleNop returns [EObject current=null] : iv_ruleNop= ruleNop EOF ;
    public final EObject entryRuleNop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNop = null;


        try {
            // InternalMyDsl.g:858:44: (iv_ruleNop= ruleNop EOF )
            // InternalMyDsl.g:859:2: iv_ruleNop= ruleNop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNop=ruleNop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNop"


    // $ANTLR start "ruleNop"
    // InternalMyDsl.g:865:1: ruleNop returns [EObject current=null] : ( (lv_nop_0_0= 'nop' ) ) ;
    public final EObject ruleNop() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:871:2: ( ( (lv_nop_0_0= 'nop' ) ) )
            // InternalMyDsl.g:872:2: ( (lv_nop_0_0= 'nop' ) )
            {
            // InternalMyDsl.g:872:2: ( (lv_nop_0_0= 'nop' ) )
            // InternalMyDsl.g:873:3: (lv_nop_0_0= 'nop' )
            {
            // InternalMyDsl.g:873:3: (lv_nop_0_0= 'nop' )
            // InternalMyDsl.g:874:4: lv_nop_0_0= 'nop'
            {
            lv_nop_0_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNopRule());
              				}
              				setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNop"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:889:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:889:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:890:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:896:1: ruleExpression returns [EObject current=null] : ( ( ( ( ruleCondition ) )=> (lv_cond_0_0= ruleCondition ) ) | ( (lv_exprs_1_0= ruleExprSimple ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_0_0 = null;

        EObject lv_exprs_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:902:2: ( ( ( ( ( ruleCondition ) )=> (lv_cond_0_0= ruleCondition ) ) | ( (lv_exprs_1_0= ruleExprSimple ) ) ) )
            // InternalMyDsl.g:903:2: ( ( ( ( ruleCondition ) )=> (lv_cond_0_0= ruleCondition ) ) | ( (lv_exprs_1_0= ruleExprSimple ) ) )
            {
            // InternalMyDsl.g:903:2: ( ( ( ( ruleCondition ) )=> (lv_cond_0_0= ruleCondition ) ) | ( (lv_exprs_1_0= ruleExprSimple ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) && (synpred1_InternalMyDsl())) {
                alt7=1;
            }
            else if ( (LA7_0==35) ) {
                int LA7_2 = input.LA(2);

                if ( (synpred1_InternalMyDsl()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_MAJ) ) {
                int LA7_3 = input.LA(2);

                if ( (synpred1_InternalMyDsl()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==33) ) {
                int LA7_4 = input.LA(2);

                if ( (synpred1_InternalMyDsl()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_SYMBOL) ) {
                int LA7_5 = input.LA(2);

                if ( (synpred1_InternalMyDsl()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:904:3: ( ( ( ruleCondition ) )=> (lv_cond_0_0= ruleCondition ) )
                    {
                    // InternalMyDsl.g:904:3: ( ( ( ruleCondition ) )=> (lv_cond_0_0= ruleCondition ) )
                    // InternalMyDsl.g:905:4: ( ( ruleCondition ) )=> (lv_cond_0_0= ruleCondition )
                    {
                    // InternalMyDsl.g:909:4: (lv_cond_0_0= ruleCondition )
                    // InternalMyDsl.g:910:5: lv_cond_0_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAccess().getCondConditionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_cond_0_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionRule());
                      					}
                      					set(
                      						current,
                      						"cond",
                      						lv_cond_0_0,
                      						"org.xtext.example.mydsl.MyDsl.Condition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:928:3: ( (lv_exprs_1_0= ruleExprSimple ) )
                    {
                    // InternalMyDsl.g:928:3: ( (lv_exprs_1_0= ruleExprSimple ) )
                    // InternalMyDsl.g:929:4: (lv_exprs_1_0= ruleExprSimple )
                    {
                    // InternalMyDsl.g:929:4: (lv_exprs_1_0= ruleExprSimple )
                    // InternalMyDsl.g:930:5: lv_exprs_1_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAccess().getExprsExprSimpleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprs_1_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionRule());
                      					}
                      					set(
                      						current,
                      						"exprs",
                      						lv_exprs_1_0,
                      						"org.xtext.example.mydsl.MyDsl.ExprSimple");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExprSimple"
    // InternalMyDsl.g:951:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalMyDsl.g:951:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalMyDsl.g:952:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // InternalMyDsl.g:958:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_nil_0_0= ruleNill ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_abin_2_0= ruleABin ) ) | ( (lv_symb_3_0= RULE_SYMBOL ) ) | ( (lv_accsucc_4_0= ruleAccSucc ) ) | ( (lv_elemSimple_5_0= ruleElemSimple ) ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_symb_3_0=null;
        EObject lv_nil_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_abin_2_0 = null;

        EObject lv_accsucc_4_0 = null;

        EObject lv_elemSimple_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:964:2: ( ( ( (lv_nil_0_0= ruleNill ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_abin_2_0= ruleABin ) ) | ( (lv_symb_3_0= RULE_SYMBOL ) ) | ( (lv_accsucc_4_0= ruleAccSucc ) ) | ( (lv_elemSimple_5_0= ruleElemSimple ) ) ) )
            // InternalMyDsl.g:965:2: ( ( (lv_nil_0_0= ruleNill ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_abin_2_0= ruleABin ) ) | ( (lv_symb_3_0= RULE_SYMBOL ) ) | ( (lv_accsucc_4_0= ruleAccSucc ) ) | ( (lv_elemSimple_5_0= ruleElemSimple ) ) )
            {
            // InternalMyDsl.g:965:2: ( ( (lv_nil_0_0= ruleNill ) ) | ( (lv_variable_1_0= ruleVariable ) ) | ( (lv_abin_2_0= ruleABin ) ) | ( (lv_symb_3_0= RULE_SYMBOL ) ) | ( (lv_accsucc_4_0= ruleAccSucc ) ) | ( (lv_elemSimple_5_0= ruleElemSimple ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case RULE_MAJ:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case 39:
                case 40:
                    {
                    alt8=3;
                    }
                    break;
                case 36:
                case 37:
                    {
                    alt8=5;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    alt8=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }

                }
                break;
            case RULE_SYMBOL:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:966:3: ( (lv_nil_0_0= ruleNill ) )
                    {
                    // InternalMyDsl.g:966:3: ( (lv_nil_0_0= ruleNill ) )
                    // InternalMyDsl.g:967:4: (lv_nil_0_0= ruleNill )
                    {
                    // InternalMyDsl.g:967:4: (lv_nil_0_0= ruleNill )
                    // InternalMyDsl.g:968:5: lv_nil_0_0= ruleNill
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getNilNillParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_nil_0_0=ruleNill();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"nil",
                      						lv_nil_0_0,
                      						"org.xtext.example.mydsl.MyDsl.Nill");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:986:3: ( (lv_variable_1_0= ruleVariable ) )
                    {
                    // InternalMyDsl.g:986:3: ( (lv_variable_1_0= ruleVariable ) )
                    // InternalMyDsl.g:987:4: (lv_variable_1_0= ruleVariable )
                    {
                    // InternalMyDsl.g:987:4: (lv_variable_1_0= ruleVariable )
                    // InternalMyDsl.g:988:5: lv_variable_1_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getVariableVariableParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"variable",
                      						lv_variable_1_0,
                      						"org.xtext.example.mydsl.MyDsl.Variable");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1006:3: ( (lv_abin_2_0= ruleABin ) )
                    {
                    // InternalMyDsl.g:1006:3: ( (lv_abin_2_0= ruleABin ) )
                    // InternalMyDsl.g:1007:4: (lv_abin_2_0= ruleABin )
                    {
                    // InternalMyDsl.g:1007:4: (lv_abin_2_0= ruleABin )
                    // InternalMyDsl.g:1008:5: lv_abin_2_0= ruleABin
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getAbinABinParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_abin_2_0=ruleABin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"abin",
                      						lv_abin_2_0,
                      						"org.xtext.example.mydsl.MyDsl.ABin");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1026:3: ( (lv_symb_3_0= RULE_SYMBOL ) )
                    {
                    // InternalMyDsl.g:1026:3: ( (lv_symb_3_0= RULE_SYMBOL ) )
                    // InternalMyDsl.g:1027:4: (lv_symb_3_0= RULE_SYMBOL )
                    {
                    // InternalMyDsl.g:1027:4: (lv_symb_3_0= RULE_SYMBOL )
                    // InternalMyDsl.g:1028:5: lv_symb_3_0= RULE_SYMBOL
                    {
                    lv_symb_3_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symb_3_0, grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"symb",
                      						lv_symb_3_0,
                      						"org.xtext.example.mydsl.MyDsl.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1045:3: ( (lv_accsucc_4_0= ruleAccSucc ) )
                    {
                    // InternalMyDsl.g:1045:3: ( (lv_accsucc_4_0= ruleAccSucc ) )
                    // InternalMyDsl.g:1046:4: (lv_accsucc_4_0= ruleAccSucc )
                    {
                    // InternalMyDsl.g:1046:4: (lv_accsucc_4_0= ruleAccSucc )
                    // InternalMyDsl.g:1047:5: lv_accsucc_4_0= ruleAccSucc
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getAccsuccAccSuccParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_accsucc_4_0=ruleAccSucc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"accsucc",
                      						lv_accsucc_4_0,
                      						"org.xtext.example.mydsl.MyDsl.AccSucc");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1065:3: ( (lv_elemSimple_5_0= ruleElemSimple ) )
                    {
                    // InternalMyDsl.g:1065:3: ( (lv_elemSimple_5_0= ruleElemSimple ) )
                    // InternalMyDsl.g:1066:4: (lv_elemSimple_5_0= ruleElemSimple )
                    {
                    // InternalMyDsl.g:1066:4: (lv_elemSimple_5_0= ruleElemSimple )
                    // InternalMyDsl.g:1067:5: lv_elemSimple_5_0= ruleElemSimple
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprSimpleAccess().getElemSimpleElemSimpleParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_elemSimple_5_0=ruleElemSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      					}
                      					set(
                      						current,
                      						"elemSimple",
                      						lv_elemSimple_5_0,
                      						"org.xtext.example.mydsl.MyDsl.ElemSimple");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:1088:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:1088:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:1089:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:1095:1: ruleVariable returns [EObject current=null] : ( (lv_variable_0_0= RULE_MAJ ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1101:2: ( ( (lv_variable_0_0= RULE_MAJ ) ) )
            // InternalMyDsl.g:1102:2: ( (lv_variable_0_0= RULE_MAJ ) )
            {
            // InternalMyDsl.g:1102:2: ( (lv_variable_0_0= RULE_MAJ ) )
            // InternalMyDsl.g:1103:3: (lv_variable_0_0= RULE_MAJ )
            {
            // InternalMyDsl.g:1103:3: (lv_variable_0_0= RULE_MAJ )
            // InternalMyDsl.g:1104:4: lv_variable_0_0= RULE_MAJ
            {
            lv_variable_0_0=(Token)match(input,RULE_MAJ,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_variable_0_0, grammarAccess.getVariableAccess().getVariableMAJTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVariableRule());
              				}
              				setWithLastConsumed(
              					current,
              					"variable",
              					lv_variable_0_0,
              					"org.xtext.example.mydsl.MyDsl.MAJ");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleLexpr"
    // InternalMyDsl.g:1123:1: entryRuleLexpr returns [EObject current=null] : iv_ruleLexpr= ruleLexpr EOF ;
    public final EObject entryRuleLexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexpr = null;


        try {
            // InternalMyDsl.g:1123:46: (iv_ruleLexpr= ruleLexpr EOF )
            // InternalMyDsl.g:1124:2: iv_ruleLexpr= ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLexpr=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLexpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexpr"


    // $ANTLR start "ruleLexpr"
    // InternalMyDsl.g:1130:1: ruleLexpr returns [EObject current=null] : ( ( (lv_e1_0_0= ruleExprSimple ) ) ( (lv_lexpr_1_0= ruleLexpr ) )? ) ;
    public final EObject ruleLexpr() throws RecognitionException {
        EObject current = null;

        EObject lv_e1_0_0 = null;

        EObject lv_lexpr_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1136:2: ( ( ( (lv_e1_0_0= ruleExprSimple ) ) ( (lv_lexpr_1_0= ruleLexpr ) )? ) )
            // InternalMyDsl.g:1137:2: ( ( (lv_e1_0_0= ruleExprSimple ) ) ( (lv_lexpr_1_0= ruleLexpr ) )? )
            {
            // InternalMyDsl.g:1137:2: ( ( (lv_e1_0_0= ruleExprSimple ) ) ( (lv_lexpr_1_0= ruleLexpr ) )? )
            // InternalMyDsl.g:1138:3: ( (lv_e1_0_0= ruleExprSimple ) ) ( (lv_lexpr_1_0= ruleLexpr ) )?
            {
            // InternalMyDsl.g:1138:3: ( (lv_e1_0_0= ruleExprSimple ) )
            // InternalMyDsl.g:1139:4: (lv_e1_0_0= ruleExprSimple )
            {
            // InternalMyDsl.g:1139:4: (lv_e1_0_0= ruleExprSimple )
            // InternalMyDsl.g:1140:5: lv_e1_0_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLexprAccess().getE1ExprSimpleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_e1_0_0=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLexprRule());
              					}
              					set(
              						current,
              						"e1",
              						lv_e1_0_0,
              						"org.xtext.example.mydsl.MyDsl.ExprSimple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1157:3: ( (lv_lexpr_1_0= ruleLexpr ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SYMBOL||LA9_0==RULE_MAJ||LA9_0==33||LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1158:4: (lv_lexpr_1_0= ruleLexpr )
                    {
                    // InternalMyDsl.g:1158:4: (lv_lexpr_1_0= ruleLexpr )
                    // InternalMyDsl.g:1159:5: lv_lexpr_1_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLexprAccess().getLexprLexprParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_lexpr_1_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLexprRule());
                      					}
                      					set(
                      						current,
                      						"lexpr",
                      						lv_lexpr_1_0,
                      						"org.xtext.example.mydsl.MyDsl.Lexpr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexpr"


    // $ANTLR start "entryRuleElemSimple"
    // InternalMyDsl.g:1180:1: entryRuleElemSimple returns [EObject current=null] : iv_ruleElemSimple= ruleElemSimple EOF ;
    public final EObject entryRuleElemSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElemSimple = null;


        try {
            // InternalMyDsl.g:1180:51: (iv_ruleElemSimple= ruleElemSimple EOF )
            // InternalMyDsl.g:1181:2: iv_ruleElemSimple= ruleElemSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElemSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElemSimple=ruleElemSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElemSimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElemSimple"


    // $ANTLR start "ruleElemSimple"
    // InternalMyDsl.g:1187:1: ruleElemSimple returns [EObject current=null] : (otherlv_0= '(' ( (lv_symb_1_0= RULE_SYMBOL ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleElemSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symb_1_0=null;
        Token otherlv_3=null;
        EObject lv_lexpr_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1193:2: ( (otherlv_0= '(' ( (lv_symb_1_0= RULE_SYMBOL ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:1194:2: (otherlv_0= '(' ( (lv_symb_1_0= RULE_SYMBOL ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:1194:2: (otherlv_0= '(' ( (lv_symb_1_0= RULE_SYMBOL ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) otherlv_3= ')' )
            // InternalMyDsl.g:1195:3: otherlv_0= '(' ( (lv_symb_1_0= RULE_SYMBOL ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElemSimpleAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:1199:3: ( (lv_symb_1_0= RULE_SYMBOL ) )
            // InternalMyDsl.g:1200:4: (lv_symb_1_0= RULE_SYMBOL )
            {
            // InternalMyDsl.g:1200:4: (lv_symb_1_0= RULE_SYMBOL )
            // InternalMyDsl.g:1201:5: lv_symb_1_0= RULE_SYMBOL
            {
            lv_symb_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_symb_1_0, grammarAccess.getElemSimpleAccess().getSymbSYMBOLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getElemSimpleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"symb",
              						lv_symb_1_0,
              						"org.xtext.example.mydsl.MyDsl.SYMBOL");
              				
            }

            }


            }

            // InternalMyDsl.g:1217:3: ( (lv_lexpr_2_0= ruleLexpr ) )
            // InternalMyDsl.g:1218:4: (lv_lexpr_2_0= ruleLexpr )
            {
            // InternalMyDsl.g:1218:4: (lv_lexpr_2_0= ruleLexpr )
            // InternalMyDsl.g:1219:5: lv_lexpr_2_0= ruleLexpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElemSimpleAccess().getLexprLexprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_lexpr_2_0=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElemSimpleRule());
              					}
              					set(
              						current,
              						"lexpr",
              						lv_lexpr_2_0,
              						"org.xtext.example.mydsl.MyDsl.Lexpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getElemSimpleAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElemSimple"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:1244:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:1244:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:1245:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:1251:1: ruleCondition returns [EObject current=null] : ( (this_Not_0= ruleNot ( (lv_expr_1_0= ruleExpression ) ) ) | ( ( (lv_e1_2_0= ruleExprSimple ) ) ( (lv_comp_3_0= ruleCOMPARATEUR ) ) ( (lv_e2_4_0= ruleExpression ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject lv_expr_1_0 = null;

        EObject lv_e1_2_0 = null;

        EObject lv_comp_3_0 = null;

        EObject lv_e2_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1257:2: ( ( (this_Not_0= ruleNot ( (lv_expr_1_0= ruleExpression ) ) ) | ( ( (lv_e1_2_0= ruleExprSimple ) ) ( (lv_comp_3_0= ruleCOMPARATEUR ) ) ( (lv_e2_4_0= ruleExpression ) ) ) ) )
            // InternalMyDsl.g:1258:2: ( (this_Not_0= ruleNot ( (lv_expr_1_0= ruleExpression ) ) ) | ( ( (lv_e1_2_0= ruleExprSimple ) ) ( (lv_comp_3_0= ruleCOMPARATEUR ) ) ( (lv_e2_4_0= ruleExpression ) ) ) )
            {
            // InternalMyDsl.g:1258:2: ( (this_Not_0= ruleNot ( (lv_expr_1_0= ruleExpression ) ) ) | ( ( (lv_e1_2_0= ruleExprSimple ) ) ( (lv_comp_3_0= ruleCOMPARATEUR ) ) ( (lv_e2_4_0= ruleExpression ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_SYMBOL||LA10_0==RULE_MAJ||LA10_0==33||LA10_0==35) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1259:3: (this_Not_0= ruleNot ( (lv_expr_1_0= ruleExpression ) ) )
                    {
                    // InternalMyDsl.g:1259:3: (this_Not_0= ruleNot ( (lv_expr_1_0= ruleExpression ) ) )
                    // InternalMyDsl.g:1260:4: this_Not_0= ruleNot ( (lv_expr_1_0= ruleExpression ) )
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConditionAccess().getNotParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    this_Not_0=ruleNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Not_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:1268:4: ( (lv_expr_1_0= ruleExpression ) )
                    // InternalMyDsl.g:1269:5: (lv_expr_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1269:5: (lv_expr_1_0= ruleExpression )
                    // InternalMyDsl.g:1270:6: lv_expr_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionAccess().getExprExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_1_0,
                      							"org.xtext.example.mydsl.MyDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1289:3: ( ( (lv_e1_2_0= ruleExprSimple ) ) ( (lv_comp_3_0= ruleCOMPARATEUR ) ) ( (lv_e2_4_0= ruleExpression ) ) )
                    {
                    // InternalMyDsl.g:1289:3: ( ( (lv_e1_2_0= ruleExprSimple ) ) ( (lv_comp_3_0= ruleCOMPARATEUR ) ) ( (lv_e2_4_0= ruleExpression ) ) )
                    // InternalMyDsl.g:1290:4: ( (lv_e1_2_0= ruleExprSimple ) ) ( (lv_comp_3_0= ruleCOMPARATEUR ) ) ( (lv_e2_4_0= ruleExpression ) )
                    {
                    // InternalMyDsl.g:1290:4: ( (lv_e1_2_0= ruleExprSimple ) )
                    // InternalMyDsl.g:1291:5: (lv_e1_2_0= ruleExprSimple )
                    {
                    // InternalMyDsl.g:1291:5: (lv_e1_2_0= ruleExprSimple )
                    // InternalMyDsl.g:1292:6: lv_e1_2_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionAccess().getE1ExprSimpleParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_e1_2_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionRule());
                      						}
                      						set(
                      							current,
                      							"e1",
                      							lv_e1_2_0,
                      							"org.xtext.example.mydsl.MyDsl.ExprSimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyDsl.g:1309:4: ( (lv_comp_3_0= ruleCOMPARATEUR ) )
                    // InternalMyDsl.g:1310:5: (lv_comp_3_0= ruleCOMPARATEUR )
                    {
                    // InternalMyDsl.g:1310:5: (lv_comp_3_0= ruleCOMPARATEUR )
                    // InternalMyDsl.g:1311:6: lv_comp_3_0= ruleCOMPARATEUR
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionAccess().getCompCOMPARATEURParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_comp_3_0=ruleCOMPARATEUR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionRule());
                      						}
                      						set(
                      							current,
                      							"comp",
                      							lv_comp_3_0,
                      							"org.xtext.example.mydsl.MyDsl.COMPARATEUR");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyDsl.g:1328:4: ( (lv_e2_4_0= ruleExpression ) )
                    // InternalMyDsl.g:1329:5: (lv_e2_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1329:5: (lv_e2_4_0= ruleExpression )
                    // InternalMyDsl.g:1330:6: lv_e2_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionAccess().getE2ExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e2_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionRule());
                      						}
                      						set(
                      							current,
                      							"e2",
                      							lv_e2_4_0,
                      							"org.xtext.example.mydsl.MyDsl.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleABin"
    // InternalMyDsl.g:1352:1: entryRuleABin returns [EObject current=null] : iv_ruleABin= ruleABin EOF ;
    public final EObject entryRuleABin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleABin = null;


        try {
            // InternalMyDsl.g:1352:45: (iv_ruleABin= ruleABin EOF )
            // InternalMyDsl.g:1353:2: iv_ruleABin= ruleABin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getABinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleABin=ruleABin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleABin; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleABin"


    // $ANTLR start "ruleABin"
    // InternalMyDsl.g:1359:1: ruleABin returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_1_0= ruleOpConstructeur ) ) ( (lv_e1_2_0= ruleExpression ) ) ( (lv_e2_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleABin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_op_1_0 = null;

        EObject lv_e1_2_0 = null;

        EObject lv_e2_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1365:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleOpConstructeur ) ) ( (lv_e1_2_0= ruleExpression ) ) ( (lv_e2_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1366:2: (otherlv_0= '(' ( (lv_op_1_0= ruleOpConstructeur ) ) ( (lv_e1_2_0= ruleExpression ) ) ( (lv_e2_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1366:2: (otherlv_0= '(' ( (lv_op_1_0= ruleOpConstructeur ) ) ( (lv_e1_2_0= ruleExpression ) ) ( (lv_e2_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1367:3: otherlv_0= '(' ( (lv_op_1_0= ruleOpConstructeur ) ) ( (lv_e1_2_0= ruleExpression ) ) ( (lv_e2_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getABinAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:1371:3: ( (lv_op_1_0= ruleOpConstructeur ) )
            // InternalMyDsl.g:1372:4: (lv_op_1_0= ruleOpConstructeur )
            {
            // InternalMyDsl.g:1372:4: (lv_op_1_0= ruleOpConstructeur )
            // InternalMyDsl.g:1373:5: lv_op_1_0= ruleOpConstructeur
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getABinAccess().getOpOpConstructeurParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_op_1_0=ruleOpConstructeur();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getABinRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.mydsl.MyDsl.OpConstructeur");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1390:3: ( (lv_e1_2_0= ruleExpression ) )
            // InternalMyDsl.g:1391:4: (lv_e1_2_0= ruleExpression )
            {
            // InternalMyDsl.g:1391:4: (lv_e1_2_0= ruleExpression )
            // InternalMyDsl.g:1392:5: lv_e1_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getABinAccess().getE1ExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_e1_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getABinRule());
              					}
              					set(
              						current,
              						"e1",
              						lv_e1_2_0,
              						"org.xtext.example.mydsl.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1409:3: ( (lv_e2_3_0= ruleExpression ) )
            // InternalMyDsl.g:1410:4: (lv_e2_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1410:4: (lv_e2_3_0= ruleExpression )
            // InternalMyDsl.g:1411:5: lv_e2_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getABinAccess().getE2ExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_e2_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getABinRule());
              					}
              					set(
              						current,
              						"e2",
              						lv_e2_3_0,
              						"org.xtext.example.mydsl.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getABinAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleABin"


    // $ANTLR start "entryRuleAccSucc"
    // InternalMyDsl.g:1436:1: entryRuleAccSucc returns [EObject current=null] : iv_ruleAccSucc= ruleAccSucc EOF ;
    public final EObject entryRuleAccSucc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccSucc = null;


        try {
            // InternalMyDsl.g:1436:48: (iv_ruleAccSucc= ruleAccSucc EOF )
            // InternalMyDsl.g:1437:2: iv_ruleAccSucc= ruleAccSucc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccSuccRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAccSucc=ruleAccSucc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccSucc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccSucc"


    // $ANTLR start "ruleAccSucc"
    // InternalMyDsl.g:1443:1: ruleAccSucc returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_1_0= ruleOpAccSucc ) ) ( (lv_expr_2_0= ruleExprSimple ) ) otherlv_3= ')' ) ;
    public final EObject ruleAccSucc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_op_1_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1449:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleOpAccSucc ) ) ( (lv_expr_2_0= ruleExprSimple ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:1450:2: (otherlv_0= '(' ( (lv_op_1_0= ruleOpAccSucc ) ) ( (lv_expr_2_0= ruleExprSimple ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:1450:2: (otherlv_0= '(' ( (lv_op_1_0= ruleOpAccSucc ) ) ( (lv_expr_2_0= ruleExprSimple ) ) otherlv_3= ')' )
            // InternalMyDsl.g:1451:3: otherlv_0= '(' ( (lv_op_1_0= ruleOpAccSucc ) ) ( (lv_expr_2_0= ruleExprSimple ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAccSuccAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:1455:3: ( (lv_op_1_0= ruleOpAccSucc ) )
            // InternalMyDsl.g:1456:4: (lv_op_1_0= ruleOpAccSucc )
            {
            // InternalMyDsl.g:1456:4: (lv_op_1_0= ruleOpAccSucc )
            // InternalMyDsl.g:1457:5: lv_op_1_0= ruleOpAccSucc
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAccSuccAccess().getOpOpAccSuccParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_op_1_0=ruleOpAccSucc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAccSuccRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"org.xtext.example.mydsl.MyDsl.OpAccSucc");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:1474:3: ( (lv_expr_2_0= ruleExprSimple ) )
            // InternalMyDsl.g:1475:4: (lv_expr_2_0= ruleExprSimple )
            {
            // InternalMyDsl.g:1475:4: (lv_expr_2_0= ruleExprSimple )
            // InternalMyDsl.g:1476:5: lv_expr_2_0= ruleExprSimple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAccSuccAccess().getExprExprSimpleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_expr_2_0=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAccSuccRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"org.xtext.example.mydsl.MyDsl.ExprSimple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAccSuccAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccSucc"


    // $ANTLR start "entryRuleOutput"
    // InternalMyDsl.g:1501:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalMyDsl.g:1501:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalMyDsl.g:1502:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalMyDsl.g:1508:1: ruleOutput returns [EObject current=null] : ( ( (lv_out_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_out_2_0= RULE_MAJ ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_out_0_0=null;
        Token otherlv_1=null;
        Token lv_out_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1514:2: ( ( ( (lv_out_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_out_2_0= RULE_MAJ ) ) )* ) )
            // InternalMyDsl.g:1515:2: ( ( (lv_out_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_out_2_0= RULE_MAJ ) ) )* )
            {
            // InternalMyDsl.g:1515:2: ( ( (lv_out_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_out_2_0= RULE_MAJ ) ) )* )
            // InternalMyDsl.g:1516:3: ( (lv_out_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_out_2_0= RULE_MAJ ) ) )*
            {
            // InternalMyDsl.g:1516:3: ( (lv_out_0_0= RULE_MAJ ) )
            // InternalMyDsl.g:1517:4: (lv_out_0_0= RULE_MAJ )
            {
            // InternalMyDsl.g:1517:4: (lv_out_0_0= RULE_MAJ )
            // InternalMyDsl.g:1518:5: lv_out_0_0= RULE_MAJ
            {
            lv_out_0_0=(Token)match(input,RULE_MAJ,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_out_0_0, grammarAccess.getOutputAccess().getOutMAJTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"out",
              						lv_out_0_0,
              						"org.xtext.example.mydsl.MyDsl.MAJ");
              				
            }

            }


            }

            // InternalMyDsl.g:1534:3: (otherlv_1= ',' ( (lv_out_2_0= RULE_MAJ ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1535:4: otherlv_1= ',' ( (lv_out_2_0= RULE_MAJ ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1539:4: ( (lv_out_2_0= RULE_MAJ ) )
            	    // InternalMyDsl.g:1540:5: (lv_out_2_0= RULE_MAJ )
            	    {
            	    // InternalMyDsl.g:1540:5: (lv_out_2_0= RULE_MAJ )
            	    // InternalMyDsl.g:1541:6: lv_out_2_0= RULE_MAJ
            	    {
            	    lv_out_2_0=(Token)match(input,RULE_MAJ,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_out_2_0, grammarAccess.getOutputAccess().getOutMAJTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOutputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"out",
            	      							lv_out_2_0,
            	      							"org.xtext.example.mydsl.MyDsl.MAJ");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInput"
    // InternalMyDsl.g:1562:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalMyDsl.g:1562:46: (iv_ruleInput= ruleInput EOF )
            // InternalMyDsl.g:1563:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalMyDsl.g:1569:1: ruleInput returns [EObject current=null] : ( ( (lv_in_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_in_2_0= RULE_MAJ ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_in_0_0=null;
        Token otherlv_1=null;
        Token lv_in_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1575:2: ( ( ( (lv_in_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_in_2_0= RULE_MAJ ) ) )* ) )
            // InternalMyDsl.g:1576:2: ( ( (lv_in_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_in_2_0= RULE_MAJ ) ) )* )
            {
            // InternalMyDsl.g:1576:2: ( ( (lv_in_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_in_2_0= RULE_MAJ ) ) )* )
            // InternalMyDsl.g:1577:3: ( (lv_in_0_0= RULE_MAJ ) ) (otherlv_1= ',' ( (lv_in_2_0= RULE_MAJ ) ) )*
            {
            // InternalMyDsl.g:1577:3: ( (lv_in_0_0= RULE_MAJ ) )
            // InternalMyDsl.g:1578:4: (lv_in_0_0= RULE_MAJ )
            {
            // InternalMyDsl.g:1578:4: (lv_in_0_0= RULE_MAJ )
            // InternalMyDsl.g:1579:5: lv_in_0_0= RULE_MAJ
            {
            lv_in_0_0=(Token)match(input,RULE_MAJ,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_in_0_0, grammarAccess.getInputAccess().getInMAJTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"in",
              						lv_in_0_0,
              						"org.xtext.example.mydsl.MyDsl.MAJ");
              				
            }

            }


            }

            // InternalMyDsl.g:1595:3: (otherlv_1= ',' ( (lv_in_2_0= RULE_MAJ ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1596:4: otherlv_1= ',' ( (lv_in_2_0= RULE_MAJ ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:1600:4: ( (lv_in_2_0= RULE_MAJ ) )
            	    // InternalMyDsl.g:1601:5: (lv_in_2_0= RULE_MAJ )
            	    {
            	    // InternalMyDsl.g:1601:5: (lv_in_2_0= RULE_MAJ )
            	    // InternalMyDsl.g:1602:6: lv_in_2_0= RULE_MAJ
            	    {
            	    lv_in_2_0=(Token)match(input,RULE_MAJ,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_in_2_0, grammarAccess.getInputAccess().getInMAJTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"in",
            	      							lv_in_2_0,
            	      							"org.xtext.example.mydsl.MyDsl.MAJ");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNill"
    // InternalMyDsl.g:1623:1: entryRuleNill returns [EObject current=null] : iv_ruleNill= ruleNill EOF ;
    public final EObject entryRuleNill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNill = null;


        try {
            // InternalMyDsl.g:1623:45: (iv_ruleNill= ruleNill EOF )
            // InternalMyDsl.g:1624:2: iv_ruleNill= ruleNill EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNillRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNill=ruleNill();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNill; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNill"


    // $ANTLR start "ruleNill"
    // InternalMyDsl.g:1630:1: ruleNill returns [EObject current=null] : ( (lv_nil_0_0= 'nil' ) ) ;
    public final EObject ruleNill() throws RecognitionException {
        EObject current = null;

        Token lv_nil_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1636:2: ( ( (lv_nil_0_0= 'nil' ) ) )
            // InternalMyDsl.g:1637:2: ( (lv_nil_0_0= 'nil' ) )
            {
            // InternalMyDsl.g:1637:2: ( (lv_nil_0_0= 'nil' ) )
            // InternalMyDsl.g:1638:3: (lv_nil_0_0= 'nil' )
            {
            // InternalMyDsl.g:1638:3: (lv_nil_0_0= 'nil' )
            // InternalMyDsl.g:1639:4: lv_nil_0_0= 'nil'
            {
            lv_nil_0_0=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nil_0_0, grammarAccess.getNillAccess().getNilNilKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNillRule());
              				}
              				setWithLastConsumed(current, "nil", lv_nil_0_0, "nil");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNill"


    // $ANTLR start "entryRuleOpAccSucc"
    // InternalMyDsl.g:1654:1: entryRuleOpAccSucc returns [EObject current=null] : iv_ruleOpAccSucc= ruleOpAccSucc EOF ;
    public final EObject entryRuleOpAccSucc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpAccSucc = null;


        try {
            // InternalMyDsl.g:1654:50: (iv_ruleOpAccSucc= ruleOpAccSucc EOF )
            // InternalMyDsl.g:1655:2: iv_ruleOpAccSucc= ruleOpAccSucc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAccSuccRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAccSucc=ruleOpAccSucc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAccSucc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAccSucc"


    // $ANTLR start "ruleOpAccSucc"
    // InternalMyDsl.g:1661:1: ruleOpAccSucc returns [EObject current=null] : ( () ( ( (lv_op_1_0= 'hd' ) ) | ( (lv_op_2_0= 'tl' ) ) ) ) ;
    public final EObject ruleOpAccSucc() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1667:2: ( ( () ( ( (lv_op_1_0= 'hd' ) ) | ( (lv_op_2_0= 'tl' ) ) ) ) )
            // InternalMyDsl.g:1668:2: ( () ( ( (lv_op_1_0= 'hd' ) ) | ( (lv_op_2_0= 'tl' ) ) ) )
            {
            // InternalMyDsl.g:1668:2: ( () ( ( (lv_op_1_0= 'hd' ) ) | ( (lv_op_2_0= 'tl' ) ) ) )
            // InternalMyDsl.g:1669:3: () ( ( (lv_op_1_0= 'hd' ) ) | ( (lv_op_2_0= 'tl' ) ) )
            {
            // InternalMyDsl.g:1669:3: ()
            // InternalMyDsl.g:1670:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOpAccSuccAccess().getOpAccSuccAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1676:3: ( ( (lv_op_1_0= 'hd' ) ) | ( (lv_op_2_0= 'tl' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            else if ( (LA13_0==37) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1677:4: ( (lv_op_1_0= 'hd' ) )
                    {
                    // InternalMyDsl.g:1677:4: ( (lv_op_1_0= 'hd' ) )
                    // InternalMyDsl.g:1678:5: (lv_op_1_0= 'hd' )
                    {
                    // InternalMyDsl.g:1678:5: (lv_op_1_0= 'hd' )
                    // InternalMyDsl.g:1679:6: lv_op_1_0= 'hd'
                    {
                    lv_op_1_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_0, grammarAccess.getOpAccSuccAccess().getOpHdKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpAccSuccRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_0, "hd");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1692:4: ( (lv_op_2_0= 'tl' ) )
                    {
                    // InternalMyDsl.g:1692:4: ( (lv_op_2_0= 'tl' ) )
                    // InternalMyDsl.g:1693:5: (lv_op_2_0= 'tl' )
                    {
                    // InternalMyDsl.g:1693:5: (lv_op_2_0= 'tl' )
                    // InternalMyDsl.g:1694:6: lv_op_2_0= 'tl'
                    {
                    lv_op_2_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getOpAccSuccAccess().getOpTlKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpAccSuccRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_2_0, "tl");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAccSucc"


    // $ANTLR start "entryRuleNot"
    // InternalMyDsl.g:1711:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMyDsl.g:1711:44: (iv_ruleNot= ruleNot EOF )
            // InternalMyDsl.g:1712:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalMyDsl.g:1718:1: ruleNot returns [EObject current=null] : ( (lv_not_0_0= 'not' ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1724:2: ( ( (lv_not_0_0= 'not' ) ) )
            // InternalMyDsl.g:1725:2: ( (lv_not_0_0= 'not' ) )
            {
            // InternalMyDsl.g:1725:2: ( (lv_not_0_0= 'not' ) )
            // InternalMyDsl.g:1726:3: (lv_not_0_0= 'not' )
            {
            // InternalMyDsl.g:1726:3: (lv_not_0_0= 'not' )
            // InternalMyDsl.g:1727:4: lv_not_0_0= 'not'
            {
            lv_not_0_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_not_0_0, grammarAccess.getNotAccess().getNotNotKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNotRule());
              				}
              				setWithLastConsumed(current, "not", lv_not_0_0, "not");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleOpConstructeur"
    // InternalMyDsl.g:1742:1: entryRuleOpConstructeur returns [EObject current=null] : iv_ruleOpConstructeur= ruleOpConstructeur EOF ;
    public final EObject entryRuleOpConstructeur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpConstructeur = null;


        try {
            // InternalMyDsl.g:1742:55: (iv_ruleOpConstructeur= ruleOpConstructeur EOF )
            // InternalMyDsl.g:1743:2: iv_ruleOpConstructeur= ruleOpConstructeur EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpConstructeurRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpConstructeur=ruleOpConstructeur();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpConstructeur; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpConstructeur"


    // $ANTLR start "ruleOpConstructeur"
    // InternalMyDsl.g:1749:1: ruleOpConstructeur returns [EObject current=null] : ( () ( ( (lv_op_1_0= 'cons' ) ) | ( (lv_op_2_0= 'list' ) ) ) ) ;
    public final EObject ruleOpConstructeur() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1755:2: ( ( () ( ( (lv_op_1_0= 'cons' ) ) | ( (lv_op_2_0= 'list' ) ) ) ) )
            // InternalMyDsl.g:1756:2: ( () ( ( (lv_op_1_0= 'cons' ) ) | ( (lv_op_2_0= 'list' ) ) ) )
            {
            // InternalMyDsl.g:1756:2: ( () ( ( (lv_op_1_0= 'cons' ) ) | ( (lv_op_2_0= 'list' ) ) ) )
            // InternalMyDsl.g:1757:3: () ( ( (lv_op_1_0= 'cons' ) ) | ( (lv_op_2_0= 'list' ) ) )
            {
            // InternalMyDsl.g:1757:3: ()
            // InternalMyDsl.g:1758:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getOpConstructeurAccess().getOpConstructeurAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1764:3: ( ( (lv_op_1_0= 'cons' ) ) | ( (lv_op_2_0= 'list' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==40) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1765:4: ( (lv_op_1_0= 'cons' ) )
                    {
                    // InternalMyDsl.g:1765:4: ( (lv_op_1_0= 'cons' ) )
                    // InternalMyDsl.g:1766:5: (lv_op_1_0= 'cons' )
                    {
                    // InternalMyDsl.g:1766:5: (lv_op_1_0= 'cons' )
                    // InternalMyDsl.g:1767:6: lv_op_1_0= 'cons'
                    {
                    lv_op_1_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_0, grammarAccess.getOpConstructeurAccess().getOpConsKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpConstructeurRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_0, "cons");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1780:4: ( (lv_op_2_0= 'list' ) )
                    {
                    // InternalMyDsl.g:1780:4: ( (lv_op_2_0= 'list' ) )
                    // InternalMyDsl.g:1781:5: (lv_op_2_0= 'list' )
                    {
                    // InternalMyDsl.g:1781:5: (lv_op_2_0= 'list' )
                    // InternalMyDsl.g:1782:6: lv_op_2_0= 'list'
                    {
                    lv_op_2_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getOpConstructeurAccess().getOpListKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOpConstructeurRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_2_0, "list");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpConstructeur"


    // $ANTLR start "entryRuleCOMPARATEUR"
    // InternalMyDsl.g:1799:1: entryRuleCOMPARATEUR returns [EObject current=null] : iv_ruleCOMPARATEUR= ruleCOMPARATEUR EOF ;
    public final EObject entryRuleCOMPARATEUR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMPARATEUR = null;


        try {
            // InternalMyDsl.g:1799:52: (iv_ruleCOMPARATEUR= ruleCOMPARATEUR EOF )
            // InternalMyDsl.g:1800:2: iv_ruleCOMPARATEUR= ruleCOMPARATEUR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOMPARATEURRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCOMPARATEUR=ruleCOMPARATEUR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOMPARATEUR; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMPARATEUR"


    // $ANTLR start "ruleCOMPARATEUR"
    // InternalMyDsl.g:1806:1: ruleCOMPARATEUR returns [EObject current=null] : ( ( (lv_comparateur_0_0= '=?' ) ) | ( (lv_comparateur_1_0= 'or' ) ) | ( (lv_comparateur_2_0= 'and' ) ) ) ;
    public final EObject ruleCOMPARATEUR() throws RecognitionException {
        EObject current = null;

        Token lv_comparateur_0_0=null;
        Token lv_comparateur_1_0=null;
        Token lv_comparateur_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1812:2: ( ( ( (lv_comparateur_0_0= '=?' ) ) | ( (lv_comparateur_1_0= 'or' ) ) | ( (lv_comparateur_2_0= 'and' ) ) ) )
            // InternalMyDsl.g:1813:2: ( ( (lv_comparateur_0_0= '=?' ) ) | ( (lv_comparateur_1_0= 'or' ) ) | ( (lv_comparateur_2_0= 'and' ) ) )
            {
            // InternalMyDsl.g:1813:2: ( ( (lv_comparateur_0_0= '=?' ) ) | ( (lv_comparateur_1_0= 'or' ) ) | ( (lv_comparateur_2_0= 'and' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1814:3: ( (lv_comparateur_0_0= '=?' ) )
                    {
                    // InternalMyDsl.g:1814:3: ( (lv_comparateur_0_0= '=?' ) )
                    // InternalMyDsl.g:1815:4: (lv_comparateur_0_0= '=?' )
                    {
                    // InternalMyDsl.g:1815:4: (lv_comparateur_0_0= '=?' )
                    // InternalMyDsl.g:1816:5: lv_comparateur_0_0= '=?'
                    {
                    lv_comparateur_0_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_comparateur_0_0, grammarAccess.getCOMPARATEURAccess().getComparateurEqualsSignQuestionMarkKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARATEURRule());
                      					}
                      					setWithLastConsumed(current, "comparateur", lv_comparateur_0_0, "=?");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1829:3: ( (lv_comparateur_1_0= 'or' ) )
                    {
                    // InternalMyDsl.g:1829:3: ( (lv_comparateur_1_0= 'or' ) )
                    // InternalMyDsl.g:1830:4: (lv_comparateur_1_0= 'or' )
                    {
                    // InternalMyDsl.g:1830:4: (lv_comparateur_1_0= 'or' )
                    // InternalMyDsl.g:1831:5: lv_comparateur_1_0= 'or'
                    {
                    lv_comparateur_1_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_comparateur_1_0, grammarAccess.getCOMPARATEURAccess().getComparateurOrKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARATEURRule());
                      					}
                      					setWithLastConsumed(current, "comparateur", lv_comparateur_1_0, "or");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1844:3: ( (lv_comparateur_2_0= 'and' ) )
                    {
                    // InternalMyDsl.g:1844:3: ( (lv_comparateur_2_0= 'and' ) )
                    // InternalMyDsl.g:1845:4: (lv_comparateur_2_0= 'and' )
                    {
                    // InternalMyDsl.g:1845:4: (lv_comparateur_2_0= 'and' )
                    // InternalMyDsl.g:1846:5: lv_comparateur_2_0= 'and'
                    {
                    lv_comparateur_2_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_comparateur_2_0, grammarAccess.getCOMPARATEURAccess().getComparateurAndKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCOMPARATEURRule());
                      					}
                      					setWithLastConsumed(current, "comparateur", lv_comparateur_2_0, "and");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMPARATEUR"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:905:4: ( ( ruleCondition ) )
        // InternalMyDsl.g:905:5: ( ruleCondition )
        {
        // InternalMyDsl.g:905:5: ( ruleCondition )
        // InternalMyDsl.g:906:5: ruleCondition
        {
        pushFollow(FOLLOW_2);
        ruleCondition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // Delegated rules

    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000164400040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004A00000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004A00000052L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000000000L});

}