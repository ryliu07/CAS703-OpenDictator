package org.xtext.example.openDictatorDsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.openDictatorDsl.services.OpenDictatorDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenDictatorDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Policy'", "'{'", "'FailureMessage'", "'SuccessMessage'", "'id'", "'statementset'", "'inputfile'", "'}'", "'StatementSet'", "'statementOperator'", "','", "'statement'", "'InputFile'", "'fileLocation'", "'Statement'", "'evaluationOperator'", "'prefixEvaluationOperator'", "'jsonquery'", "'value'", "'JsonQuery'", "'queryString'", "'Value'", "'type'", "'AND'", "'OR'", "'NOT'", "'FORSOME'", "'FORALL'", "'CONTAINS'", "'EQUALS'", "'LARGERTHAN'", "'SMALLERTHAN'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOpenDictatorDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOpenDictatorDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOpenDictatorDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOpenDictatorDsl.g"; }



     	private OpenDictatorDslGrammarAccess grammarAccess;

        public InternalOpenDictatorDslParser(TokenStream input, OpenDictatorDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Policy";
       	}

       	@Override
       	protected OpenDictatorDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePolicy"
    // InternalOpenDictatorDsl.g:65:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalOpenDictatorDsl.g:65:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalOpenDictatorDsl.g:66:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalOpenDictatorDsl.g:72:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Policy' otherlv_1= '{' otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'statementset' ( (lv_statementset_9_0= ruleStatementSet ) ) otherlv_10= 'inputfile' ( (lv_inputfile_11_0= ruleInputFile ) ) otherlv_12= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_FailureMessage_3_0 = null;

        AntlrDatatypeRuleToken lv_SuccessMessage_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_statementset_9_0 = null;

        EObject lv_inputfile_11_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:78:2: ( (otherlv_0= 'Policy' otherlv_1= '{' otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'statementset' ( (lv_statementset_9_0= ruleStatementSet ) ) otherlv_10= 'inputfile' ( (lv_inputfile_11_0= ruleInputFile ) ) otherlv_12= '}' ) )
            // InternalOpenDictatorDsl.g:79:2: (otherlv_0= 'Policy' otherlv_1= '{' otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'statementset' ( (lv_statementset_9_0= ruleStatementSet ) ) otherlv_10= 'inputfile' ( (lv_inputfile_11_0= ruleInputFile ) ) otherlv_12= '}' )
            {
            // InternalOpenDictatorDsl.g:79:2: (otherlv_0= 'Policy' otherlv_1= '{' otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'statementset' ( (lv_statementset_9_0= ruleStatementSet ) ) otherlv_10= 'inputfile' ( (lv_inputfile_11_0= ruleInputFile ) ) otherlv_12= '}' )
            // InternalOpenDictatorDsl.g:80:3: otherlv_0= 'Policy' otherlv_1= '{' otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'statementset' ( (lv_statementset_9_0= ruleStatementSet ) ) otherlv_10= 'inputfile' ( (lv_inputfile_11_0= ruleInputFile ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getFailureMessageKeyword_2());
            		
            // InternalOpenDictatorDsl.g:92:3: ( (lv_FailureMessage_3_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:93:4: (lv_FailureMessage_3_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:93:4: (lv_FailureMessage_3_0= ruleEString )
            // InternalOpenDictatorDsl.g:94:5: lv_FailureMessage_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getFailureMessageEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_FailureMessage_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"FailureMessage",
            						lv_FailureMessage_3_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getSuccessMessageKeyword_4());
            		
            // InternalOpenDictatorDsl.g:115:3: ( (lv_SuccessMessage_5_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:116:4: (lv_SuccessMessage_5_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:116:4: (lv_SuccessMessage_5_0= ruleEString )
            // InternalOpenDictatorDsl.g:117:5: lv_SuccessMessage_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getSuccessMessageEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_SuccessMessage_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"SuccessMessage",
            						lv_SuccessMessage_5_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getIdKeyword_6());
            		
            // InternalOpenDictatorDsl.g:138:3: ( (lv_id_7_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:139:4: (lv_id_7_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:139:4: (lv_id_7_0= ruleEString )
            // InternalOpenDictatorDsl.g:140:5: lv_id_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getIdEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_id_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_7_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getPolicyAccess().getStatementsetKeyword_8());
            		
            // InternalOpenDictatorDsl.g:161:3: ( (lv_statementset_9_0= ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:162:4: (lv_statementset_9_0= ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:162:4: (lv_statementset_9_0= ruleStatementSet )
            // InternalOpenDictatorDsl.g:163:5: lv_statementset_9_0= ruleStatementSet
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getStatementsetStatementSetParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_statementset_9_0=ruleStatementSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"statementset",
            						lv_statementset_9_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getPolicyAccess().getInputfileKeyword_10());
            		
            // InternalOpenDictatorDsl.g:184:3: ( (lv_inputfile_11_0= ruleInputFile ) )
            // InternalOpenDictatorDsl.g:185:4: (lv_inputfile_11_0= ruleInputFile )
            {
            // InternalOpenDictatorDsl.g:185:4: (lv_inputfile_11_0= ruleInputFile )
            // InternalOpenDictatorDsl.g:186:5: lv_inputfile_11_0= ruleInputFile
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getInputfileInputFileParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_inputfile_11_0=ruleInputFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"inputfile",
            						lv_inputfile_11_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.InputFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleStatementSet"
    // InternalOpenDictatorDsl.g:211:1: entryRuleStatementSet returns [EObject current=null] : iv_ruleStatementSet= ruleStatementSet EOF ;
    public final EObject entryRuleStatementSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementSet = null;


        try {
            // InternalOpenDictatorDsl.g:211:53: (iv_ruleStatementSet= ruleStatementSet EOF )
            // InternalOpenDictatorDsl.g:212:2: iv_ruleStatementSet= ruleStatementSet EOF
            {
             newCompositeNode(grammarAccess.getStatementSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementSet=ruleStatementSet();

            state._fsp--;

             current =iv_ruleStatementSet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatementSet"


    // $ANTLR start "ruleStatementSet"
    // InternalOpenDictatorDsl.g:218:1: ruleStatementSet returns [EObject current=null] : (otherlv_0= 'StatementSet' otherlv_1= '{' otherlv_2= 'statementOperator' ( (lv_statementOperator_3_0= ruleStatementOperator ) ) (otherlv_4= 'statementset' otherlv_5= '{' ( (lv_statementset_6_0= ruleStatementSet ) ) (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )* otherlv_9= '}' )? otherlv_10= 'statement' otherlv_11= '{' ( (lv_statement_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_statement_14_0= ruleStatement ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleStatementSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_statementOperator_3_0 = null;

        EObject lv_statementset_6_0 = null;

        EObject lv_statementset_8_0 = null;

        EObject lv_statement_12_0 = null;

        EObject lv_statement_14_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:224:2: ( (otherlv_0= 'StatementSet' otherlv_1= '{' otherlv_2= 'statementOperator' ( (lv_statementOperator_3_0= ruleStatementOperator ) ) (otherlv_4= 'statementset' otherlv_5= '{' ( (lv_statementset_6_0= ruleStatementSet ) ) (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )* otherlv_9= '}' )? otherlv_10= 'statement' otherlv_11= '{' ( (lv_statement_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_statement_14_0= ruleStatement ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalOpenDictatorDsl.g:225:2: (otherlv_0= 'StatementSet' otherlv_1= '{' otherlv_2= 'statementOperator' ( (lv_statementOperator_3_0= ruleStatementOperator ) ) (otherlv_4= 'statementset' otherlv_5= '{' ( (lv_statementset_6_0= ruleStatementSet ) ) (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )* otherlv_9= '}' )? otherlv_10= 'statement' otherlv_11= '{' ( (lv_statement_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_statement_14_0= ruleStatement ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalOpenDictatorDsl.g:225:2: (otherlv_0= 'StatementSet' otherlv_1= '{' otherlv_2= 'statementOperator' ( (lv_statementOperator_3_0= ruleStatementOperator ) ) (otherlv_4= 'statementset' otherlv_5= '{' ( (lv_statementset_6_0= ruleStatementSet ) ) (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )* otherlv_9= '}' )? otherlv_10= 'statement' otherlv_11= '{' ( (lv_statement_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_statement_14_0= ruleStatement ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalOpenDictatorDsl.g:226:3: otherlv_0= 'StatementSet' otherlv_1= '{' otherlv_2= 'statementOperator' ( (lv_statementOperator_3_0= ruleStatementOperator ) ) (otherlv_4= 'statementset' otherlv_5= '{' ( (lv_statementset_6_0= ruleStatementSet ) ) (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )* otherlv_9= '}' )? otherlv_10= 'statement' otherlv_11= '{' ( (lv_statement_12_0= ruleStatement ) ) (otherlv_13= ',' ( (lv_statement_14_0= ruleStatement ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementSetAccess().getStatementSetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementSetAccess().getStatementOperatorKeyword_2());
            		
            // InternalOpenDictatorDsl.g:238:3: ( (lv_statementOperator_3_0= ruleStatementOperator ) )
            // InternalOpenDictatorDsl.g:239:4: (lv_statementOperator_3_0= ruleStatementOperator )
            {
            // InternalOpenDictatorDsl.g:239:4: (lv_statementOperator_3_0= ruleStatementOperator )
            // InternalOpenDictatorDsl.g:240:5: lv_statementOperator_3_0= ruleStatementOperator
            {

            					newCompositeNode(grammarAccess.getStatementSetAccess().getStatementOperatorStatementOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_statementOperator_3_0=ruleStatementOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementSetRule());
            					}
            					set(
            						current,
            						"statementOperator",
            						lv_statementOperator_3_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenDictatorDsl.g:257:3: (otherlv_4= 'statementset' otherlv_5= '{' ( (lv_statementset_6_0= ruleStatementSet ) ) (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOpenDictatorDsl.g:258:4: otherlv_4= 'statementset' otherlv_5= '{' ( (lv_statementset_6_0= ruleStatementSet ) ) (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementSetAccess().getStatementsetKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOpenDictatorDsl.g:266:4: ( (lv_statementset_6_0= ruleStatementSet ) )
                    // InternalOpenDictatorDsl.g:267:5: (lv_statementset_6_0= ruleStatementSet )
                    {
                    // InternalOpenDictatorDsl.g:267:5: (lv_statementset_6_0= ruleStatementSet )
                    // InternalOpenDictatorDsl.g:268:6: lv_statementset_6_0= ruleStatementSet
                    {

                    						newCompositeNode(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_statementset_6_0=ruleStatementSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementSetRule());
                    						}
                    						add(
                    							current,
                    							"statementset",
                    							lv_statementset_6_0,
                    							"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOpenDictatorDsl.g:285:4: (otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==21) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalOpenDictatorDsl.g:286:5: otherlv_7= ',' ( (lv_statementset_8_0= ruleStatementSet ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStatementSetAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOpenDictatorDsl.g:290:5: ( (lv_statementset_8_0= ruleStatementSet ) )
                    	    // InternalOpenDictatorDsl.g:291:6: (lv_statementset_8_0= ruleStatementSet )
                    	    {
                    	    // InternalOpenDictatorDsl.g:291:6: (lv_statementset_8_0= ruleStatementSet )
                    	    // InternalOpenDictatorDsl.g:292:7: lv_statementset_8_0= ruleStatementSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_statementset_8_0=ruleStatementSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStatementSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statementset",
                    	    								lv_statementset_8_0,
                    	    								"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getStatementSetAccess().getStatementKeyword_5());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalOpenDictatorDsl.g:323:3: ( (lv_statement_12_0= ruleStatement ) )
            // InternalOpenDictatorDsl.g:324:4: (lv_statement_12_0= ruleStatement )
            {
            // InternalOpenDictatorDsl.g:324:4: (lv_statement_12_0= ruleStatement )
            // InternalOpenDictatorDsl.g:325:5: lv_statement_12_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_16);
            lv_statement_12_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementSetRule());
            					}
            					add(
            						current,
            						"statement",
            						lv_statement_12_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenDictatorDsl.g:342:3: (otherlv_13= ',' ( (lv_statement_14_0= ruleStatement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:343:4: otherlv_13= ',' ( (lv_statement_14_0= ruleStatement ) )
            	    {
            	    otherlv_13=(Token)match(input,21,FOLLOW_18); 

            	    				newLeafNode(otherlv_13, grammarAccess.getStatementSetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalOpenDictatorDsl.g:347:4: ( (lv_statement_14_0= ruleStatement ) )
            	    // InternalOpenDictatorDsl.g:348:5: (lv_statement_14_0= ruleStatement )
            	    {
            	    // InternalOpenDictatorDsl.g:348:5: (lv_statement_14_0= ruleStatement )
            	    // InternalOpenDictatorDsl.g:349:6: lv_statement_14_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_statement_14_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statement",
            	    							lv_statement_14_0,
            	    							"org.xtext.example.openDictatorDsl.OpenDictatorDsl.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementSet"


    // $ANTLR start "entryRuleInputFile"
    // InternalOpenDictatorDsl.g:379:1: entryRuleInputFile returns [EObject current=null] : iv_ruleInputFile= ruleInputFile EOF ;
    public final EObject entryRuleInputFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputFile = null;


        try {
            // InternalOpenDictatorDsl.g:379:50: (iv_ruleInputFile= ruleInputFile EOF )
            // InternalOpenDictatorDsl.g:380:2: iv_ruleInputFile= ruleInputFile EOF
            {
             newCompositeNode(grammarAccess.getInputFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputFile=ruleInputFile();

            state._fsp--;

             current =iv_ruleInputFile; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInputFile"


    // $ANTLR start "ruleInputFile"
    // InternalOpenDictatorDsl.g:386:1: ruleInputFile returns [EObject current=null] : (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleInputFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_fileLocation_3_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:392:2: ( (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalOpenDictatorDsl.g:393:2: (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalOpenDictatorDsl.g:393:2: (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalOpenDictatorDsl.g:394:3: otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputFileAccess().getInputFileKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInputFileAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInputFileAccess().getFileLocationKeyword_2());
            		
            // InternalOpenDictatorDsl.g:406:3: ( (lv_fileLocation_3_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:407:4: (lv_fileLocation_3_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:407:4: (lv_fileLocation_3_0= ruleEString )
            // InternalOpenDictatorDsl.g:408:5: lv_fileLocation_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_fileLocation_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputFileRule());
            					}
            					set(
            						current,
            						"fileLocation",
            						lv_fileLocation_3_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInputFileAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputFile"


    // $ANTLR start "entryRuleEString"
    // InternalOpenDictatorDsl.g:433:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOpenDictatorDsl.g:433:47: (iv_ruleEString= ruleEString EOF )
            // InternalOpenDictatorDsl.g:434:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOpenDictatorDsl.g:440:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:446:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOpenDictatorDsl.g:447:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOpenDictatorDsl.g:447:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOpenDictatorDsl.g:448:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:456:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStatement"
    // InternalOpenDictatorDsl.g:467:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalOpenDictatorDsl.g:467:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalOpenDictatorDsl.g:468:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalOpenDictatorDsl.g:474:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'Statement' otherlv_1= '{' otherlv_2= 'evaluationOperator' ( (lv_evaluationOperator_3_0= ruleEvaluationOperator ) ) (otherlv_4= 'prefixEvaluationOperator' otherlv_5= '{' ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) ) (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )* otherlv_9= '}' )? otherlv_10= 'jsonquery' ( (lv_jsonquery_11_0= ruleJsonQuery ) ) otherlv_12= 'value' ( (lv_value_13_0= ruleValue ) ) otherlv_14= '}' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_evaluationOperator_3_0 = null;

        Enumerator lv_prefixEvaluationOperator_6_0 = null;

        Enumerator lv_prefixEvaluationOperator_8_0 = null;

        EObject lv_jsonquery_11_0 = null;

        EObject lv_value_13_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:480:2: ( (otherlv_0= 'Statement' otherlv_1= '{' otherlv_2= 'evaluationOperator' ( (lv_evaluationOperator_3_0= ruleEvaluationOperator ) ) (otherlv_4= 'prefixEvaluationOperator' otherlv_5= '{' ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) ) (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )* otherlv_9= '}' )? otherlv_10= 'jsonquery' ( (lv_jsonquery_11_0= ruleJsonQuery ) ) otherlv_12= 'value' ( (lv_value_13_0= ruleValue ) ) otherlv_14= '}' ) )
            // InternalOpenDictatorDsl.g:481:2: (otherlv_0= 'Statement' otherlv_1= '{' otherlv_2= 'evaluationOperator' ( (lv_evaluationOperator_3_0= ruleEvaluationOperator ) ) (otherlv_4= 'prefixEvaluationOperator' otherlv_5= '{' ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) ) (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )* otherlv_9= '}' )? otherlv_10= 'jsonquery' ( (lv_jsonquery_11_0= ruleJsonQuery ) ) otherlv_12= 'value' ( (lv_value_13_0= ruleValue ) ) otherlv_14= '}' )
            {
            // InternalOpenDictatorDsl.g:481:2: (otherlv_0= 'Statement' otherlv_1= '{' otherlv_2= 'evaluationOperator' ( (lv_evaluationOperator_3_0= ruleEvaluationOperator ) ) (otherlv_4= 'prefixEvaluationOperator' otherlv_5= '{' ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) ) (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )* otherlv_9= '}' )? otherlv_10= 'jsonquery' ( (lv_jsonquery_11_0= ruleJsonQuery ) ) otherlv_12= 'value' ( (lv_value_13_0= ruleValue ) ) otherlv_14= '}' )
            // InternalOpenDictatorDsl.g:482:3: otherlv_0= 'Statement' otherlv_1= '{' otherlv_2= 'evaluationOperator' ( (lv_evaluationOperator_3_0= ruleEvaluationOperator ) ) (otherlv_4= 'prefixEvaluationOperator' otherlv_5= '{' ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) ) (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )* otherlv_9= '}' )? otherlv_10= 'jsonquery' ( (lv_jsonquery_11_0= ruleJsonQuery ) ) otherlv_12= 'value' ( (lv_value_13_0= ruleValue ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getStatementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getEvaluationOperatorKeyword_2());
            		
            // InternalOpenDictatorDsl.g:494:3: ( (lv_evaluationOperator_3_0= ruleEvaluationOperator ) )
            // InternalOpenDictatorDsl.g:495:4: (lv_evaluationOperator_3_0= ruleEvaluationOperator )
            {
            // InternalOpenDictatorDsl.g:495:4: (lv_evaluationOperator_3_0= ruleEvaluationOperator )
            // InternalOpenDictatorDsl.g:496:5: lv_evaluationOperator_3_0= ruleEvaluationOperator
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getEvaluationOperatorEvaluationOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_evaluationOperator_3_0=ruleEvaluationOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"evaluationOperator",
            						lv_evaluationOperator_3_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EvaluationOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenDictatorDsl.g:513:3: (otherlv_4= 'prefixEvaluationOperator' otherlv_5= '{' ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) ) (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOpenDictatorDsl.g:514:4: otherlv_4= 'prefixEvaluationOperator' otherlv_5= '{' ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) ) (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getPrefixEvaluationOperatorKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOpenDictatorDsl.g:522:4: ( (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator ) )
                    // InternalOpenDictatorDsl.g:523:5: (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator )
                    {
                    // InternalOpenDictatorDsl.g:523:5: (lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator )
                    // InternalOpenDictatorDsl.g:524:6: lv_prefixEvaluationOperator_6_0= ruleEvaluationOperator
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_prefixEvaluationOperator_6_0=ruleEvaluationOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						add(
                    							current,
                    							"prefixEvaluationOperator",
                    							lv_prefixEvaluationOperator_6_0,
                    							"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EvaluationOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOpenDictatorDsl.g:541:4: (otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalOpenDictatorDsl.g:542:5: otherlv_7= ',' ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStatementAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOpenDictatorDsl.g:546:5: ( (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator ) )
                    	    // InternalOpenDictatorDsl.g:547:6: (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator )
                    	    {
                    	    // InternalOpenDictatorDsl.g:547:6: (lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator )
                    	    // InternalOpenDictatorDsl.g:548:7: lv_prefixEvaluationOperator_8_0= ruleEvaluationOperator
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_prefixEvaluationOperator_8_0=ruleEvaluationOperator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"prefixEvaluationOperator",
                    	    								lv_prefixEvaluationOperator_8_0,
                    	    								"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EvaluationOperator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getJsonqueryKeyword_5());
            		
            // InternalOpenDictatorDsl.g:575:3: ( (lv_jsonquery_11_0= ruleJsonQuery ) )
            // InternalOpenDictatorDsl.g:576:4: (lv_jsonquery_11_0= ruleJsonQuery )
            {
            // InternalOpenDictatorDsl.g:576:4: (lv_jsonquery_11_0= ruleJsonQuery )
            // InternalOpenDictatorDsl.g:577:5: lv_jsonquery_11_0= ruleJsonQuery
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getJsonqueryJsonQueryParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_jsonquery_11_0=ruleJsonQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"jsonquery",
            						lv_jsonquery_11_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.JsonQuery");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getValueKeyword_7());
            		
            // InternalOpenDictatorDsl.g:598:3: ( (lv_value_13_0= ruleValue ) )
            // InternalOpenDictatorDsl.g:599:4: (lv_value_13_0= ruleValue )
            {
            // InternalOpenDictatorDsl.g:599:4: (lv_value_13_0= ruleValue )
            // InternalOpenDictatorDsl.g:600:5: lv_value_13_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getValueValueParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_13_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_13_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleJsonQuery"
    // InternalOpenDictatorDsl.g:625:1: entryRuleJsonQuery returns [EObject current=null] : iv_ruleJsonQuery= ruleJsonQuery EOF ;
    public final EObject entryRuleJsonQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonQuery = null;


        try {
            // InternalOpenDictatorDsl.g:625:50: (iv_ruleJsonQuery= ruleJsonQuery EOF )
            // InternalOpenDictatorDsl.g:626:2: iv_ruleJsonQuery= ruleJsonQuery EOF
            {
             newCompositeNode(grammarAccess.getJsonQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonQuery=ruleJsonQuery();

            state._fsp--;

             current =iv_ruleJsonQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsonQuery"


    // $ANTLR start "ruleJsonQuery"
    // InternalOpenDictatorDsl.g:632:1: ruleJsonQuery returns [EObject current=null] : (otherlv_0= 'JsonQuery' otherlv_1= '{' otherlv_2= 'queryString' ( (lv_queryString_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleJsonQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_queryString_3_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:638:2: ( (otherlv_0= 'JsonQuery' otherlv_1= '{' otherlv_2= 'queryString' ( (lv_queryString_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalOpenDictatorDsl.g:639:2: (otherlv_0= 'JsonQuery' otherlv_1= '{' otherlv_2= 'queryString' ( (lv_queryString_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalOpenDictatorDsl.g:639:2: (otherlv_0= 'JsonQuery' otherlv_1= '{' otherlv_2= 'queryString' ( (lv_queryString_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalOpenDictatorDsl.g:640:3: otherlv_0= 'JsonQuery' otherlv_1= '{' otherlv_2= 'queryString' ( (lv_queryString_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonQueryAccess().getJsonQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getJsonQueryAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonQueryAccess().getQueryStringKeyword_2());
            		
            // InternalOpenDictatorDsl.g:652:3: ( (lv_queryString_3_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:653:4: (lv_queryString_3_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:653:4: (lv_queryString_3_0= ruleEString )
            // InternalOpenDictatorDsl.g:654:5: lv_queryString_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJsonQueryAccess().getQueryStringEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_queryString_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonQueryRule());
            					}
            					set(
            						current,
            						"queryString",
            						lv_queryString_3_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJsonQueryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonQuery"


    // $ANTLR start "entryRuleValue"
    // InternalOpenDictatorDsl.g:679:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalOpenDictatorDsl.g:679:46: (iv_ruleValue= ruleValue EOF )
            // InternalOpenDictatorDsl.g:680:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalOpenDictatorDsl.g:686:1: ruleValue returns [EObject current=null] : (otherlv_0= 'Value' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:692:2: ( (otherlv_0= 'Value' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalOpenDictatorDsl.g:693:2: (otherlv_0= 'Value' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalOpenDictatorDsl.g:693:2: (otherlv_0= 'Value' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalOpenDictatorDsl.g:694:3: otherlv_0= 'Value' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValueAccess().getValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getValueAccess().getTypeKeyword_2());
            		
            // InternalOpenDictatorDsl.g:706:3: ( (lv_type_3_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:707:4: (lv_type_3_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:707:4: (lv_type_3_0= ruleEString )
            // InternalOpenDictatorDsl.g:708:5: lv_type_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueAccess().getTypeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_type_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getValueAccess().getValueKeyword_4());
            		
            // InternalOpenDictatorDsl.g:729:3: ( (lv_value_5_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:730:4: (lv_value_5_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:730:4: (lv_value_5_0= ruleEString )
            // InternalOpenDictatorDsl.g:731:5: lv_value_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleStatementOperator"
    // InternalOpenDictatorDsl.g:756:1: ruleStatementOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) ) ;
    public final Enumerator ruleStatementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:762:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) ) )
            // InternalOpenDictatorDsl.g:763:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) )
            {
            // InternalOpenDictatorDsl.g:763:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOpenDictatorDsl.g:764:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalOpenDictatorDsl.g:764:3: (enumLiteral_0= 'AND' )
                    // InternalOpenDictatorDsl.g:765:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getStatementOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatementOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:772:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalOpenDictatorDsl.g:772:3: (enumLiteral_1= 'OR' )
                    // InternalOpenDictatorDsl.g:773:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getStatementOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatementOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenDictatorDsl.g:780:3: (enumLiteral_2= 'NOT' )
                    {
                    // InternalOpenDictatorDsl.g:780:3: (enumLiteral_2= 'NOT' )
                    // InternalOpenDictatorDsl.g:781:4: enumLiteral_2= 'NOT'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getStatementOperatorAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStatementOperatorAccess().getNOTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementOperator"


    // $ANTLR start "ruleEvaluationOperator"
    // InternalOpenDictatorDsl.g:791:1: ruleEvaluationOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) ) ;
    public final Enumerator ruleEvaluationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:797:2: ( ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) ) )
            // InternalOpenDictatorDsl.g:798:2: ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) )
            {
            // InternalOpenDictatorDsl.g:798:2: ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            case 40:
                {
                alt8=4;
                }
                break;
            case 41:
                {
                alt8=5;
                }
                break;
            case 42:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOpenDictatorDsl.g:799:3: (enumLiteral_0= 'FORSOME' )
                    {
                    // InternalOpenDictatorDsl.g:799:3: (enumLiteral_0= 'FORSOME' )
                    // InternalOpenDictatorDsl.g:800:4: enumLiteral_0= 'FORSOME'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getFORSOMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationOperatorAccess().getFORSOMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:807:3: (enumLiteral_1= 'FORALL' )
                    {
                    // InternalOpenDictatorDsl.g:807:3: (enumLiteral_1= 'FORALL' )
                    // InternalOpenDictatorDsl.g:808:4: enumLiteral_1= 'FORALL'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getFORALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationOperatorAccess().getFORALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenDictatorDsl.g:815:3: (enumLiteral_2= 'CONTAINS' )
                    {
                    // InternalOpenDictatorDsl.g:815:3: (enumLiteral_2= 'CONTAINS' )
                    // InternalOpenDictatorDsl.g:816:4: enumLiteral_2= 'CONTAINS'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getCONTAINSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationOperatorAccess().getCONTAINSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOpenDictatorDsl.g:823:3: (enumLiteral_3= 'EQUALS' )
                    {
                    // InternalOpenDictatorDsl.g:823:3: (enumLiteral_3= 'EQUALS' )
                    // InternalOpenDictatorDsl.g:824:4: enumLiteral_3= 'EQUALS'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEvaluationOperatorAccess().getEQUALSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOpenDictatorDsl.g:831:3: (enumLiteral_4= 'LARGERTHAN' )
                    {
                    // InternalOpenDictatorDsl.g:831:3: (enumLiteral_4= 'LARGERTHAN' )
                    // InternalOpenDictatorDsl.g:832:4: enumLiteral_4= 'LARGERTHAN'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getLARGERTHANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEvaluationOperatorAccess().getLARGERTHANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOpenDictatorDsl.g:839:3: (enumLiteral_5= 'SMALLERTHAN' )
                    {
                    // InternalOpenDictatorDsl.g:839:3: (enumLiteral_5= 'SMALLERTHAN' )
                    // InternalOpenDictatorDsl.g:840:4: enumLiteral_5= 'SMALLERTHAN'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getSMALLERTHANEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEvaluationOperatorAccess().getSMALLERTHANEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluationOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});

}