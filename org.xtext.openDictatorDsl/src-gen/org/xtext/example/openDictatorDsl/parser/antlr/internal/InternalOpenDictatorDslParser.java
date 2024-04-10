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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Id'", "'FailureMessage'", "'SuccessMessage'", "'FileLocation'", "'Policy'", "'{'", "'}'", "'['", "','", "']'", "'type='", "'value='", "'AND'", "'OR'", "'NOT'", "'FORSOME'", "'FORALL'", "'CONTAINS'", "'EQUALS'", "'LARGERTHAN'", "'SMALLERTHAN'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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
    public static final int T__20=20;
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
    // InternalOpenDictatorDsl.g:72:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'Id' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'FileLocation' ( (lv_inputfile_7_0= ruleInputFile ) ) otherlv_8= 'Policy' otherlv_9= '{' ( (lv_statementset_10_0= ruleStatementSet ) ) otherlv_11= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_FailureMessage_3_0 = null;

        AntlrDatatypeRuleToken lv_SuccessMessage_5_0 = null;

        EObject lv_inputfile_7_0 = null;

        EObject lv_statementset_10_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:78:2: ( (otherlv_0= 'Id' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'FileLocation' ( (lv_inputfile_7_0= ruleInputFile ) ) otherlv_8= 'Policy' otherlv_9= '{' ( (lv_statementset_10_0= ruleStatementSet ) ) otherlv_11= '}' ) )
            // InternalOpenDictatorDsl.g:79:2: (otherlv_0= 'Id' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'FileLocation' ( (lv_inputfile_7_0= ruleInputFile ) ) otherlv_8= 'Policy' otherlv_9= '{' ( (lv_statementset_10_0= ruleStatementSet ) ) otherlv_11= '}' )
            {
            // InternalOpenDictatorDsl.g:79:2: (otherlv_0= 'Id' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'FileLocation' ( (lv_inputfile_7_0= ruleInputFile ) ) otherlv_8= 'Policy' otherlv_9= '{' ( (lv_statementset_10_0= ruleStatementSet ) ) otherlv_11= '}' )
            // InternalOpenDictatorDsl.g:80:3: otherlv_0= 'Id' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'FailureMessage' ( (lv_FailureMessage_3_0= ruleEString ) ) otherlv_4= 'SuccessMessage' ( (lv_SuccessMessage_5_0= ruleEString ) ) otherlv_6= 'FileLocation' ( (lv_inputfile_7_0= ruleInputFile ) ) otherlv_8= 'Policy' otherlv_9= '{' ( (lv_statementset_10_0= ruleStatementSet ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getIdKeyword_0());
            		
            // InternalOpenDictatorDsl.g:84:3: ( (lv_id_1_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:85:4: (lv_id_1_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:85:4: (lv_id_1_0= ruleEString )
            // InternalOpenDictatorDsl.g:86:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getFailureMessageKeyword_2());
            		
            // InternalOpenDictatorDsl.g:107:3: ( (lv_FailureMessage_3_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:108:4: (lv_FailureMessage_3_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:108:4: (lv_FailureMessage_3_0= ruleEString )
            // InternalOpenDictatorDsl.g:109:5: lv_FailureMessage_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getFailureMessageEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPolicyAccess().getSuccessMessageKeyword_4());
            		
            // InternalOpenDictatorDsl.g:130:3: ( (lv_SuccessMessage_5_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:131:4: (lv_SuccessMessage_5_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:131:4: (lv_SuccessMessage_5_0= ruleEString )
            // InternalOpenDictatorDsl.g:132:5: lv_SuccessMessage_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getSuccessMessageEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getFileLocationKeyword_6());
            		
            // InternalOpenDictatorDsl.g:153:3: ( (lv_inputfile_7_0= ruleInputFile ) )
            // InternalOpenDictatorDsl.g:154:4: (lv_inputfile_7_0= ruleInputFile )
            {
            // InternalOpenDictatorDsl.g:154:4: (lv_inputfile_7_0= ruleInputFile )
            // InternalOpenDictatorDsl.g:155:5: lv_inputfile_7_0= ruleInputFile
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getInputfileInputFileParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_inputfile_7_0=ruleInputFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"inputfile",
            						lv_inputfile_7_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.InputFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getPolicyAccess().getPolicyKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalOpenDictatorDsl.g:180:3: ( (lv_statementset_10_0= ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:181:4: (lv_statementset_10_0= ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:181:4: (lv_statementset_10_0= ruleStatementSet )
            // InternalOpenDictatorDsl.g:182:5: lv_statementset_10_0= ruleStatementSet
            {

            					newCompositeNode(grammarAccess.getPolicyAccess().getStatementsetStatementSetParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_10);
            lv_statementset_10_0=ruleStatementSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolicyRule());
            					}
            					set(
            						current,
            						"statementset",
            						lv_statementset_10_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalOpenDictatorDsl.g:207:1: entryRuleStatementSet returns [EObject current=null] : iv_ruleStatementSet= ruleStatementSet EOF ;
    public final EObject entryRuleStatementSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementSet = null;


        try {
            // InternalOpenDictatorDsl.g:207:53: (iv_ruleStatementSet= ruleStatementSet EOF )
            // InternalOpenDictatorDsl.g:208:2: iv_ruleStatementSet= ruleStatementSet EOF
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
    // InternalOpenDictatorDsl.g:214:1: ruleStatementSet returns [EObject current=null] : ( ( (lv_statementOperator_0_0= ruleStatementOperator ) ) otherlv_1= '[' ( ( (lv_statementset_2_0= ruleStatementSet ) ) (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )* otherlv_5= ',' )? ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* (otherlv_9= ',' ( (lv_statementset_10_0= ruleStatementSet ) ) (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )* )? otherlv_13= ']' ) ;
    public final EObject ruleStatementSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_statementOperator_0_0 = null;

        EObject lv_statementset_2_0 = null;

        EObject lv_statementset_4_0 = null;

        EObject lv_statement_6_0 = null;

        EObject lv_statement_8_0 = null;

        EObject lv_statementset_10_0 = null;

        EObject lv_statementset_12_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:220:2: ( ( ( (lv_statementOperator_0_0= ruleStatementOperator ) ) otherlv_1= '[' ( ( (lv_statementset_2_0= ruleStatementSet ) ) (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )* otherlv_5= ',' )? ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* (otherlv_9= ',' ( (lv_statementset_10_0= ruleStatementSet ) ) (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )* )? otherlv_13= ']' ) )
            // InternalOpenDictatorDsl.g:221:2: ( ( (lv_statementOperator_0_0= ruleStatementOperator ) ) otherlv_1= '[' ( ( (lv_statementset_2_0= ruleStatementSet ) ) (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )* otherlv_5= ',' )? ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* (otherlv_9= ',' ( (lv_statementset_10_0= ruleStatementSet ) ) (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )* )? otherlv_13= ']' )
            {
            // InternalOpenDictatorDsl.g:221:2: ( ( (lv_statementOperator_0_0= ruleStatementOperator ) ) otherlv_1= '[' ( ( (lv_statementset_2_0= ruleStatementSet ) ) (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )* otherlv_5= ',' )? ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* (otherlv_9= ',' ( (lv_statementset_10_0= ruleStatementSet ) ) (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )* )? otherlv_13= ']' )
            // InternalOpenDictatorDsl.g:222:3: ( (lv_statementOperator_0_0= ruleStatementOperator ) ) otherlv_1= '[' ( ( (lv_statementset_2_0= ruleStatementSet ) ) (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )* otherlv_5= ',' )? ( (lv_statement_6_0= ruleStatement ) ) (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )* (otherlv_9= ',' ( (lv_statementset_10_0= ruleStatementSet ) ) (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )* )? otherlv_13= ']'
            {
            // InternalOpenDictatorDsl.g:222:3: ( (lv_statementOperator_0_0= ruleStatementOperator ) )
            // InternalOpenDictatorDsl.g:223:4: (lv_statementOperator_0_0= ruleStatementOperator )
            {
            // InternalOpenDictatorDsl.g:223:4: (lv_statementOperator_0_0= ruleStatementOperator )
            // InternalOpenDictatorDsl.g:224:5: lv_statementOperator_0_0= ruleStatementOperator
            {

            					newCompositeNode(grammarAccess.getStatementSetAccess().getStatementOperatorStatementOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_statementOperator_0_0=ruleStatementOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementSetRule());
            					}
            					set(
            						current,
            						"statementOperator",
            						lv_statementOperator_0_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementSetAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalOpenDictatorDsl.g:245:3: ( ( (lv_statementset_2_0= ruleStatementSet ) ) (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )* otherlv_5= ',' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=23 && LA2_0<=25)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOpenDictatorDsl.g:246:4: ( (lv_statementset_2_0= ruleStatementSet ) ) (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )* otherlv_5= ','
                    {
                    // InternalOpenDictatorDsl.g:246:4: ( (lv_statementset_2_0= ruleStatementSet ) )
                    // InternalOpenDictatorDsl.g:247:5: (lv_statementset_2_0= ruleStatementSet )
                    {
                    // InternalOpenDictatorDsl.g:247:5: (lv_statementset_2_0= ruleStatementSet )
                    // InternalOpenDictatorDsl.g:248:6: lv_statementset_2_0= ruleStatementSet
                    {

                    						newCompositeNode(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_statementset_2_0=ruleStatementSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementSetRule());
                    						}
                    						add(
                    							current,
                    							"statementset",
                    							lv_statementset_2_0,
                    							"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOpenDictatorDsl.g:265:4: (otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==19) ) {
                            int LA1_1 = input.LA(2);

                            if ( ((LA1_1>=23 && LA1_1<=25)) ) {
                                alt1=1;
                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalOpenDictatorDsl.g:266:5: otherlv_3= ',' ( (lv_statementset_4_0= ruleStatementSet ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStatementSetAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalOpenDictatorDsl.g:270:5: ( (lv_statementset_4_0= ruleStatementSet ) )
                    	    // InternalOpenDictatorDsl.g:271:6: (lv_statementset_4_0= ruleStatementSet )
                    	    {
                    	    // InternalOpenDictatorDsl.g:271:6: (lv_statementset_4_0= ruleStatementSet )
                    	    // InternalOpenDictatorDsl.g:272:7: lv_statementset_4_0= ruleStatementSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_statementset_4_0=ruleStatementSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStatementSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statementset",
                    	    								lv_statementset_4_0,
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

                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getStatementSetAccess().getCommaKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalOpenDictatorDsl.g:295:3: ( (lv_statement_6_0= ruleStatement ) )
            // InternalOpenDictatorDsl.g:296:4: (lv_statement_6_0= ruleStatement )
            {
            // InternalOpenDictatorDsl.g:296:4: (lv_statement_6_0= ruleStatement )
            // InternalOpenDictatorDsl.g:297:5: lv_statement_6_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_statement_6_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementSetRule());
            					}
            					add(
            						current,
            						"statement",
            						lv_statement_6_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenDictatorDsl.g:314:3: (otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    int LA3_1 = input.LA(2);

                    if ( ((LA3_1>=RULE_STRING && LA3_1<=RULE_ID)||(LA3_1>=26 && LA3_1<=31)) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:315:4: otherlv_7= ',' ( (lv_statement_8_0= ruleStatement ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_7, grammarAccess.getStatementSetAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOpenDictatorDsl.g:319:4: ( (lv_statement_8_0= ruleStatement ) )
            	    // InternalOpenDictatorDsl.g:320:5: (lv_statement_8_0= ruleStatement )
            	    {
            	    // InternalOpenDictatorDsl.g:320:5: (lv_statement_8_0= ruleStatement )
            	    // InternalOpenDictatorDsl.g:321:6: lv_statement_8_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_statement_8_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatementSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statement",
            	    							lv_statement_8_0,
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

            // InternalOpenDictatorDsl.g:339:3: (otherlv_9= ',' ( (lv_statementset_10_0= ruleStatementSet ) ) (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOpenDictatorDsl.g:340:4: otherlv_9= ',' ( (lv_statementset_10_0= ruleStatementSet ) ) (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )*
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatementSetAccess().getCommaKeyword_5_0());
                    			
                    // InternalOpenDictatorDsl.g:344:4: ( (lv_statementset_10_0= ruleStatementSet ) )
                    // InternalOpenDictatorDsl.g:345:5: (lv_statementset_10_0= ruleStatementSet )
                    {
                    // InternalOpenDictatorDsl.g:345:5: (lv_statementset_10_0= ruleStatementSet )
                    // InternalOpenDictatorDsl.g:346:6: lv_statementset_10_0= ruleStatementSet
                    {

                    						newCompositeNode(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_statementset_10_0=ruleStatementSet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementSetRule());
                    						}
                    						add(
                    							current,
                    							"statementset",
                    							lv_statementset_10_0,
                    							"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementSet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOpenDictatorDsl.g:363:4: (otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalOpenDictatorDsl.g:364:5: otherlv_11= ',' ( (lv_statementset_12_0= ruleStatementSet ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getStatementSetAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalOpenDictatorDsl.g:368:5: ( (lv_statementset_12_0= ruleStatementSet ) )
                    	    // InternalOpenDictatorDsl.g:369:6: (lv_statementset_12_0= ruleStatementSet )
                    	    {
                    	    // InternalOpenDictatorDsl.g:369:6: (lv_statementset_12_0= ruleStatementSet )
                    	    // InternalOpenDictatorDsl.g:370:7: lv_statementset_12_0= ruleStatementSet
                    	    {

                    	    							newCompositeNode(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_statementset_12_0=ruleStatementSet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStatementSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statementset",
                    	    								lv_statementset_12_0,
                    	    								"org.xtext.example.openDictatorDsl.OpenDictatorDsl.StatementSet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getStatementSetAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalOpenDictatorDsl.g:397:1: entryRuleInputFile returns [EObject current=null] : iv_ruleInputFile= ruleInputFile EOF ;
    public final EObject entryRuleInputFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputFile = null;


        try {
            // InternalOpenDictatorDsl.g:397:50: (iv_ruleInputFile= ruleInputFile EOF )
            // InternalOpenDictatorDsl.g:398:2: iv_ruleInputFile= ruleInputFile EOF
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
    // InternalOpenDictatorDsl.g:404:1: ruleInputFile returns [EObject current=null] : ( (lv_fileLocation_0_0= ruleEString ) ) ;
    public final EObject ruleInputFile() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fileLocation_0_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:410:2: ( ( (lv_fileLocation_0_0= ruleEString ) ) )
            // InternalOpenDictatorDsl.g:411:2: ( (lv_fileLocation_0_0= ruleEString ) )
            {
            // InternalOpenDictatorDsl.g:411:2: ( (lv_fileLocation_0_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:412:3: (lv_fileLocation_0_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:412:3: (lv_fileLocation_0_0= ruleEString )
            // InternalOpenDictatorDsl.g:413:4: lv_fileLocation_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_fileLocation_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getInputFileRule());
            				}
            				set(
            					current,
            					"fileLocation",
            					lv_fileLocation_0_0,
            					"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            				afterParserOrEnumRuleCall();
            			

            }


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
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
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
    // InternalOpenDictatorDsl.g:474:1: ruleStatement returns [EObject current=null] : ( ( (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator ) )? ( (lv_jsonquery_1_0= ruleJsonQuery ) ) ( (lv_evaluationOperator_2_0= ruleEvaluationOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Enumerator lv_prefixEvaluationOperator_0_0 = null;

        EObject lv_jsonquery_1_0 = null;

        Enumerator lv_evaluationOperator_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:480:2: ( ( ( (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator ) )? ( (lv_jsonquery_1_0= ruleJsonQuery ) ) ( (lv_evaluationOperator_2_0= ruleEvaluationOperator ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalOpenDictatorDsl.g:481:2: ( ( (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator ) )? ( (lv_jsonquery_1_0= ruleJsonQuery ) ) ( (lv_evaluationOperator_2_0= ruleEvaluationOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalOpenDictatorDsl.g:481:2: ( ( (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator ) )? ( (lv_jsonquery_1_0= ruleJsonQuery ) ) ( (lv_evaluationOperator_2_0= ruleEvaluationOperator ) ) ( (lv_value_3_0= ruleValue ) ) )
            // InternalOpenDictatorDsl.g:482:3: ( (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator ) )? ( (lv_jsonquery_1_0= ruleJsonQuery ) ) ( (lv_evaluationOperator_2_0= ruleEvaluationOperator ) ) ( (lv_value_3_0= ruleValue ) )
            {
            // InternalOpenDictatorDsl.g:482:3: ( (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=26 && LA7_0<=31)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOpenDictatorDsl.g:483:4: (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator )
                    {
                    // InternalOpenDictatorDsl.g:483:4: (lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator )
                    // InternalOpenDictatorDsl.g:484:5: lv_prefixEvaluationOperator_0_0= ruleEvaluationOperator
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_prefixEvaluationOperator_0_0=ruleEvaluationOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					add(
                    						current,
                    						"prefixEvaluationOperator",
                    						lv_prefixEvaluationOperator_0_0,
                    						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EvaluationOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOpenDictatorDsl.g:501:3: ( (lv_jsonquery_1_0= ruleJsonQuery ) )
            // InternalOpenDictatorDsl.g:502:4: (lv_jsonquery_1_0= ruleJsonQuery )
            {
            // InternalOpenDictatorDsl.g:502:4: (lv_jsonquery_1_0= ruleJsonQuery )
            // InternalOpenDictatorDsl.g:503:5: lv_jsonquery_1_0= ruleJsonQuery
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getJsonqueryJsonQueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_jsonquery_1_0=ruleJsonQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"jsonquery",
            						lv_jsonquery_1_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.JsonQuery");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenDictatorDsl.g:520:3: ( (lv_evaluationOperator_2_0= ruleEvaluationOperator ) )
            // InternalOpenDictatorDsl.g:521:4: (lv_evaluationOperator_2_0= ruleEvaluationOperator )
            {
            // InternalOpenDictatorDsl.g:521:4: (lv_evaluationOperator_2_0= ruleEvaluationOperator )
            // InternalOpenDictatorDsl.g:522:5: lv_evaluationOperator_2_0= ruleEvaluationOperator
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getEvaluationOperatorEvaluationOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_evaluationOperator_2_0=ruleEvaluationOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"evaluationOperator",
            						lv_evaluationOperator_2_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EvaluationOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOpenDictatorDsl.g:539:3: ( (lv_value_3_0= ruleValue ) )
            // InternalOpenDictatorDsl.g:540:4: (lv_value_3_0= ruleValue )
            {
            // InternalOpenDictatorDsl.g:540:4: (lv_value_3_0= ruleValue )
            // InternalOpenDictatorDsl.g:541:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalOpenDictatorDsl.g:562:1: entryRuleJsonQuery returns [EObject current=null] : iv_ruleJsonQuery= ruleJsonQuery EOF ;
    public final EObject entryRuleJsonQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonQuery = null;


        try {
            // InternalOpenDictatorDsl.g:562:50: (iv_ruleJsonQuery= ruleJsonQuery EOF )
            // InternalOpenDictatorDsl.g:563:2: iv_ruleJsonQuery= ruleJsonQuery EOF
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
    // InternalOpenDictatorDsl.g:569:1: ruleJsonQuery returns [EObject current=null] : ( (lv_queryString_0_0= ruleEString ) ) ;
    public final EObject ruleJsonQuery() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_queryString_0_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:575:2: ( ( (lv_queryString_0_0= ruleEString ) ) )
            // InternalOpenDictatorDsl.g:576:2: ( (lv_queryString_0_0= ruleEString ) )
            {
            // InternalOpenDictatorDsl.g:576:2: ( (lv_queryString_0_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:577:3: (lv_queryString_0_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:577:3: (lv_queryString_0_0= ruleEString )
            // InternalOpenDictatorDsl.g:578:4: lv_queryString_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getJsonQueryAccess().getQueryStringEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_queryString_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJsonQueryRule());
            				}
            				set(
            					current,
            					"queryString",
            					lv_queryString_0_0,
            					"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // InternalOpenDictatorDsl.g:598:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalOpenDictatorDsl.g:598:46: (iv_ruleValue= ruleValue EOF )
            // InternalOpenDictatorDsl.g:599:2: iv_ruleValue= ruleValue EOF
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
    // InternalOpenDictatorDsl.g:605:1: ruleValue returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_type_1_0= ruleEString ) ) otherlv_2= ',' otherlv_3= 'value=' ( (lv_value_4_0= ruleEString ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:611:2: ( (otherlv_0= 'type=' ( (lv_type_1_0= ruleEString ) ) otherlv_2= ',' otherlv_3= 'value=' ( (lv_value_4_0= ruleEString ) ) ) )
            // InternalOpenDictatorDsl.g:612:2: (otherlv_0= 'type=' ( (lv_type_1_0= ruleEString ) ) otherlv_2= ',' otherlv_3= 'value=' ( (lv_value_4_0= ruleEString ) ) )
            {
            // InternalOpenDictatorDsl.g:612:2: (otherlv_0= 'type=' ( (lv_type_1_0= ruleEString ) ) otherlv_2= ',' otherlv_3= 'value=' ( (lv_value_4_0= ruleEString ) ) )
            // InternalOpenDictatorDsl.g:613:3: otherlv_0= 'type=' ( (lv_type_1_0= ruleEString ) ) otherlv_2= ',' otherlv_3= 'value=' ( (lv_value_4_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValueAccess().getTypeKeyword_0());
            		
            // InternalOpenDictatorDsl.g:617:3: ( (lv_type_1_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:618:4: (lv_type_1_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:618:4: (lv_type_1_0= ruleEString )
            // InternalOpenDictatorDsl.g:619:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getValueAccess().getCommaKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getValueAccess().getValueKeyword_3());
            		
            // InternalOpenDictatorDsl.g:644:3: ( (lv_value_4_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:645:4: (lv_value_4_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:645:4: (lv_value_4_0= ruleEString )
            // InternalOpenDictatorDsl.g:646:5: lv_value_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValueAccess().getValueEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.openDictatorDsl.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalOpenDictatorDsl.g:667:1: ruleStatementOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) ) ;
    public final Enumerator ruleStatementOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:673:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) ) )
            // InternalOpenDictatorDsl.g:674:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) )
            {
            // InternalOpenDictatorDsl.g:674:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOpenDictatorDsl.g:675:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalOpenDictatorDsl.g:675:3: (enumLiteral_0= 'AND' )
                    // InternalOpenDictatorDsl.g:676:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getStatementOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatementOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:683:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalOpenDictatorDsl.g:683:3: (enumLiteral_1= 'OR' )
                    // InternalOpenDictatorDsl.g:684:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getStatementOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatementOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenDictatorDsl.g:691:3: (enumLiteral_2= 'NOT' )
                    {
                    // InternalOpenDictatorDsl.g:691:3: (enumLiteral_2= 'NOT' )
                    // InternalOpenDictatorDsl.g:692:4: enumLiteral_2= 'NOT'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOpenDictatorDsl.g:702:1: ruleEvaluationOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) ) ;
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
            // InternalOpenDictatorDsl.g:708:2: ( ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) ) )
            // InternalOpenDictatorDsl.g:709:2: ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) )
            {
            // InternalOpenDictatorDsl.g:709:2: ( (enumLiteral_0= 'FORSOME' ) | (enumLiteral_1= 'FORALL' ) | (enumLiteral_2= 'CONTAINS' ) | (enumLiteral_3= 'EQUALS' ) | (enumLiteral_4= 'LARGERTHAN' ) | (enumLiteral_5= 'SMALLERTHAN' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            case 30:
                {
                alt9=5;
                }
                break;
            case 31:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOpenDictatorDsl.g:710:3: (enumLiteral_0= 'FORSOME' )
                    {
                    // InternalOpenDictatorDsl.g:710:3: (enumLiteral_0= 'FORSOME' )
                    // InternalOpenDictatorDsl.g:711:4: enumLiteral_0= 'FORSOME'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getFORSOMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationOperatorAccess().getFORSOMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:718:3: (enumLiteral_1= 'FORALL' )
                    {
                    // InternalOpenDictatorDsl.g:718:3: (enumLiteral_1= 'FORALL' )
                    // InternalOpenDictatorDsl.g:719:4: enumLiteral_1= 'FORALL'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getFORALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationOperatorAccess().getFORALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenDictatorDsl.g:726:3: (enumLiteral_2= 'CONTAINS' )
                    {
                    // InternalOpenDictatorDsl.g:726:3: (enumLiteral_2= 'CONTAINS' )
                    // InternalOpenDictatorDsl.g:727:4: enumLiteral_2= 'CONTAINS'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getCONTAINSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationOperatorAccess().getCONTAINSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOpenDictatorDsl.g:734:3: (enumLiteral_3= 'EQUALS' )
                    {
                    // InternalOpenDictatorDsl.g:734:3: (enumLiteral_3= 'EQUALS' )
                    // InternalOpenDictatorDsl.g:735:4: enumLiteral_3= 'EQUALS'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getEQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEvaluationOperatorAccess().getEQUALSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOpenDictatorDsl.g:742:3: (enumLiteral_4= 'LARGERTHAN' )
                    {
                    // InternalOpenDictatorDsl.g:742:3: (enumLiteral_4= 'LARGERTHAN' )
                    // InternalOpenDictatorDsl.g:743:4: enumLiteral_4= 'LARGERTHAN'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getLARGERTHANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEvaluationOperatorAccess().getLARGERTHANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOpenDictatorDsl.g:750:3: (enumLiteral_5= 'SMALLERTHAN' )
                    {
                    // InternalOpenDictatorDsl.g:750:3: (enumLiteral_5= 'SMALLERTHAN' )
                    // InternalOpenDictatorDsl.g:751:4: enumLiteral_5= 'SMALLERTHAN'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000FF800030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});

}