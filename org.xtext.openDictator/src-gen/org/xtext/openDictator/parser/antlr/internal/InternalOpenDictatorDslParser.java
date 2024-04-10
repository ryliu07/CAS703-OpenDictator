package org.xtext.openDictator.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.openDictator.services.OpenDictatorDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenDictatorDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InputFile'", "'{'", "'fileLocation'", "'}'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
        	return "InputFile";
       	}

       	@Override
       	protected OpenDictatorDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInputFile"
    // InternalOpenDictatorDsl.g:64:1: entryRuleInputFile returns [EObject current=null] : iv_ruleInputFile= ruleInputFile EOF ;
    public final EObject entryRuleInputFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputFile = null;


        try {
            // InternalOpenDictatorDsl.g:64:50: (iv_ruleInputFile= ruleInputFile EOF )
            // InternalOpenDictatorDsl.g:65:2: iv_ruleInputFile= ruleInputFile EOF
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
    // InternalOpenDictatorDsl.g:71:1: ruleInputFile returns [EObject current=null] : (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleInputFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_fileLocation_3_0 = null;



        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:77:2: ( (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalOpenDictatorDsl.g:78:2: (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalOpenDictatorDsl.g:78:2: (otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalOpenDictatorDsl.g:79:3: otherlv_0= 'InputFile' otherlv_1= '{' otherlv_2= 'fileLocation' ( (lv_fileLocation_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputFileAccess().getInputFileKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInputFileAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInputFileAccess().getFileLocationKeyword_2());
            		
            // InternalOpenDictatorDsl.g:91:3: ( (lv_fileLocation_3_0= ruleEString ) )
            // InternalOpenDictatorDsl.g:92:4: (lv_fileLocation_3_0= ruleEString )
            {
            // InternalOpenDictatorDsl.g:92:4: (lv_fileLocation_3_0= ruleEString )
            // InternalOpenDictatorDsl.g:93:5: lv_fileLocation_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_fileLocation_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputFileRule());
            					}
            					set(
            						current,
            						"fileLocation",
            						lv_fileLocation_3_0,
            						"org.xtext.openDictator.OpenDictatorDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalOpenDictatorDsl.g:118:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOpenDictatorDsl.g:118:47: (iv_ruleEString= ruleEString EOF )
            // InternalOpenDictatorDsl.g:119:2: iv_ruleEString= ruleEString EOF
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
    // InternalOpenDictatorDsl.g:125:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOpenDictatorDsl.g:131:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOpenDictatorDsl.g:132:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOpenDictatorDsl.g:132:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOpenDictatorDsl.g:133:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:141:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}