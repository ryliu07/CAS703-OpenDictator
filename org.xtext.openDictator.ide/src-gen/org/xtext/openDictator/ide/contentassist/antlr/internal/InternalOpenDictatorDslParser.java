package org.xtext.openDictator.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.openDictator.services.OpenDictatorDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenDictatorDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(OpenDictatorDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInputFile"
    // InternalOpenDictatorDsl.g:53:1: entryRuleInputFile : ruleInputFile EOF ;
    public final void entryRuleInputFile() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:54:1: ( ruleInputFile EOF )
            // InternalOpenDictatorDsl.g:55:1: ruleInputFile EOF
            {
             before(grammarAccess.getInputFileRule()); 
            pushFollow(FOLLOW_1);
            ruleInputFile();

            state._fsp--;

             after(grammarAccess.getInputFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputFile"


    // $ANTLR start "ruleInputFile"
    // InternalOpenDictatorDsl.g:62:1: ruleInputFile : ( ( rule__InputFile__Group__0 ) ) ;
    public final void ruleInputFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:66:2: ( ( ( rule__InputFile__Group__0 ) ) )
            // InternalOpenDictatorDsl.g:67:2: ( ( rule__InputFile__Group__0 ) )
            {
            // InternalOpenDictatorDsl.g:67:2: ( ( rule__InputFile__Group__0 ) )
            // InternalOpenDictatorDsl.g:68:3: ( rule__InputFile__Group__0 )
            {
             before(grammarAccess.getInputFileAccess().getGroup()); 
            // InternalOpenDictatorDsl.g:69:3: ( rule__InputFile__Group__0 )
            // InternalOpenDictatorDsl.g:69:4: rule__InputFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputFile"


    // $ANTLR start "entryRuleEString"
    // InternalOpenDictatorDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:79:1: ( ruleEString EOF )
            // InternalOpenDictatorDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOpenDictatorDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOpenDictatorDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalOpenDictatorDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalOpenDictatorDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOpenDictatorDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalOpenDictatorDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalOpenDictatorDsl.g:102:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:106:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalOpenDictatorDsl.g:107:2: ( RULE_STRING )
                    {
                    // InternalOpenDictatorDsl.g:107:2: ( RULE_STRING )
                    // InternalOpenDictatorDsl.g:108:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:113:2: ( RULE_ID )
                    {
                    // InternalOpenDictatorDsl.g:113:2: ( RULE_ID )
                    // InternalOpenDictatorDsl.g:114:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__InputFile__Group__0"
    // InternalOpenDictatorDsl.g:123:1: rule__InputFile__Group__0 : rule__InputFile__Group__0__Impl rule__InputFile__Group__1 ;
    public final void rule__InputFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:127:1: ( rule__InputFile__Group__0__Impl rule__InputFile__Group__1 )
            // InternalOpenDictatorDsl.g:128:2: rule__InputFile__Group__0__Impl rule__InputFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InputFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__0"


    // $ANTLR start "rule__InputFile__Group__0__Impl"
    // InternalOpenDictatorDsl.g:135:1: rule__InputFile__Group__0__Impl : ( 'InputFile' ) ;
    public final void rule__InputFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:139:1: ( ( 'InputFile' ) )
            // InternalOpenDictatorDsl.g:140:1: ( 'InputFile' )
            {
            // InternalOpenDictatorDsl.g:140:1: ( 'InputFile' )
            // InternalOpenDictatorDsl.g:141:2: 'InputFile'
            {
             before(grammarAccess.getInputFileAccess().getInputFileKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getInputFileAccess().getInputFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__0__Impl"


    // $ANTLR start "rule__InputFile__Group__1"
    // InternalOpenDictatorDsl.g:150:1: rule__InputFile__Group__1 : rule__InputFile__Group__1__Impl rule__InputFile__Group__2 ;
    public final void rule__InputFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:154:1: ( rule__InputFile__Group__1__Impl rule__InputFile__Group__2 )
            // InternalOpenDictatorDsl.g:155:2: rule__InputFile__Group__1__Impl rule__InputFile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InputFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__1"


    // $ANTLR start "rule__InputFile__Group__1__Impl"
    // InternalOpenDictatorDsl.g:162:1: rule__InputFile__Group__1__Impl : ( '{' ) ;
    public final void rule__InputFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:166:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:167:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:167:1: ( '{' )
            // InternalOpenDictatorDsl.g:168:2: '{'
            {
             before(grammarAccess.getInputFileAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInputFileAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__1__Impl"


    // $ANTLR start "rule__InputFile__Group__2"
    // InternalOpenDictatorDsl.g:177:1: rule__InputFile__Group__2 : rule__InputFile__Group__2__Impl rule__InputFile__Group__3 ;
    public final void rule__InputFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:181:1: ( rule__InputFile__Group__2__Impl rule__InputFile__Group__3 )
            // InternalOpenDictatorDsl.g:182:2: rule__InputFile__Group__2__Impl rule__InputFile__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InputFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputFile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__2"


    // $ANTLR start "rule__InputFile__Group__2__Impl"
    // InternalOpenDictatorDsl.g:189:1: rule__InputFile__Group__2__Impl : ( 'fileLocation' ) ;
    public final void rule__InputFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:193:1: ( ( 'fileLocation' ) )
            // InternalOpenDictatorDsl.g:194:1: ( 'fileLocation' )
            {
            // InternalOpenDictatorDsl.g:194:1: ( 'fileLocation' )
            // InternalOpenDictatorDsl.g:195:2: 'fileLocation'
            {
             before(grammarAccess.getInputFileAccess().getFileLocationKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInputFileAccess().getFileLocationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__2__Impl"


    // $ANTLR start "rule__InputFile__Group__3"
    // InternalOpenDictatorDsl.g:204:1: rule__InputFile__Group__3 : rule__InputFile__Group__3__Impl rule__InputFile__Group__4 ;
    public final void rule__InputFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:208:1: ( rule__InputFile__Group__3__Impl rule__InputFile__Group__4 )
            // InternalOpenDictatorDsl.g:209:2: rule__InputFile__Group__3__Impl rule__InputFile__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__InputFile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputFile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__3"


    // $ANTLR start "rule__InputFile__Group__3__Impl"
    // InternalOpenDictatorDsl.g:216:1: rule__InputFile__Group__3__Impl : ( ( rule__InputFile__FileLocationAssignment_3 ) ) ;
    public final void rule__InputFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:220:1: ( ( ( rule__InputFile__FileLocationAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:221:1: ( ( rule__InputFile__FileLocationAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:221:1: ( ( rule__InputFile__FileLocationAssignment_3 ) )
            // InternalOpenDictatorDsl.g:222:2: ( rule__InputFile__FileLocationAssignment_3 )
            {
             before(grammarAccess.getInputFileAccess().getFileLocationAssignment_3()); 
            // InternalOpenDictatorDsl.g:223:2: ( rule__InputFile__FileLocationAssignment_3 )
            // InternalOpenDictatorDsl.g:223:3: rule__InputFile__FileLocationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputFile__FileLocationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputFileAccess().getFileLocationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__3__Impl"


    // $ANTLR start "rule__InputFile__Group__4"
    // InternalOpenDictatorDsl.g:231:1: rule__InputFile__Group__4 : rule__InputFile__Group__4__Impl ;
    public final void rule__InputFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:235:1: ( rule__InputFile__Group__4__Impl )
            // InternalOpenDictatorDsl.g:236:2: rule__InputFile__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputFile__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__4"


    // $ANTLR start "rule__InputFile__Group__4__Impl"
    // InternalOpenDictatorDsl.g:242:1: rule__InputFile__Group__4__Impl : ( '}' ) ;
    public final void rule__InputFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:246:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:247:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:247:1: ( '}' )
            // InternalOpenDictatorDsl.g:248:2: '}'
            {
             before(grammarAccess.getInputFileAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInputFileAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__Group__4__Impl"


    // $ANTLR start "rule__InputFile__FileLocationAssignment_3"
    // InternalOpenDictatorDsl.g:258:1: rule__InputFile__FileLocationAssignment_3 : ( ruleEString ) ;
    public final void rule__InputFile__FileLocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:262:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:263:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:263:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:264:3: ruleEString
            {
             before(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFile__FileLocationAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}