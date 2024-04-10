package org.xtext.example.openDictatorDsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.openDictatorDsl.services.OpenDictatorDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOpenDictatorDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'NOT'", "'FORSOME'", "'FORALL'", "'CONTAINS'", "'EQUALS'", "'LARGERTHAN'", "'SMALLERTHAN'", "'Policy'", "'{'", "'FailureMessage'", "'SuccessMessage'", "'id'", "'statementset'", "'inputfile'", "'}'", "'StatementSet'", "'statementOperator'", "'statement'", "','", "'InputFile'", "'fileLocation'", "'Statement'", "'evaluationOperator'", "'jsonquery'", "'value'", "'prefixEvaluationOperator'", "'JsonQuery'", "'queryString'", "'Value'", "'type'"
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



    // $ANTLR start "entryRulePolicy"
    // InternalOpenDictatorDsl.g:53:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:54:1: ( rulePolicy EOF )
            // InternalOpenDictatorDsl.g:55:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
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
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalOpenDictatorDsl.g:62:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:66:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalOpenDictatorDsl.g:67:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalOpenDictatorDsl.g:67:2: ( ( rule__Policy__Group__0 ) )
            // InternalOpenDictatorDsl.g:68:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalOpenDictatorDsl.g:69:3: ( rule__Policy__Group__0 )
            // InternalOpenDictatorDsl.g:69:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

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
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleStatementSet"
    // InternalOpenDictatorDsl.g:78:1: entryRuleStatementSet : ruleStatementSet EOF ;
    public final void entryRuleStatementSet() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:79:1: ( ruleStatementSet EOF )
            // InternalOpenDictatorDsl.g:80:1: ruleStatementSet EOF
            {
             before(grammarAccess.getStatementSetRule()); 
            pushFollow(FOLLOW_1);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getStatementSetRule()); 
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
    // $ANTLR end "entryRuleStatementSet"


    // $ANTLR start "ruleStatementSet"
    // InternalOpenDictatorDsl.g:87:1: ruleStatementSet : ( ( rule__StatementSet__Group__0 ) ) ;
    public final void ruleStatementSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:91:2: ( ( ( rule__StatementSet__Group__0 ) ) )
            // InternalOpenDictatorDsl.g:92:2: ( ( rule__StatementSet__Group__0 ) )
            {
            // InternalOpenDictatorDsl.g:92:2: ( ( rule__StatementSet__Group__0 ) )
            // InternalOpenDictatorDsl.g:93:3: ( rule__StatementSet__Group__0 )
            {
             before(grammarAccess.getStatementSetAccess().getGroup()); 
            // InternalOpenDictatorDsl.g:94:3: ( rule__StatementSet__Group__0 )
            // InternalOpenDictatorDsl.g:94:4: rule__StatementSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getGroup()); 

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
    // $ANTLR end "ruleStatementSet"


    // $ANTLR start "entryRuleInputFile"
    // InternalOpenDictatorDsl.g:103:1: entryRuleInputFile : ruleInputFile EOF ;
    public final void entryRuleInputFile() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:104:1: ( ruleInputFile EOF )
            // InternalOpenDictatorDsl.g:105:1: ruleInputFile EOF
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
    // InternalOpenDictatorDsl.g:112:1: ruleInputFile : ( ( rule__InputFile__Group__0 ) ) ;
    public final void ruleInputFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:116:2: ( ( ( rule__InputFile__Group__0 ) ) )
            // InternalOpenDictatorDsl.g:117:2: ( ( rule__InputFile__Group__0 ) )
            {
            // InternalOpenDictatorDsl.g:117:2: ( ( rule__InputFile__Group__0 ) )
            // InternalOpenDictatorDsl.g:118:3: ( rule__InputFile__Group__0 )
            {
             before(grammarAccess.getInputFileAccess().getGroup()); 
            // InternalOpenDictatorDsl.g:119:3: ( rule__InputFile__Group__0 )
            // InternalOpenDictatorDsl.g:119:4: rule__InputFile__Group__0
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
    // InternalOpenDictatorDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:129:1: ( ruleEString EOF )
            // InternalOpenDictatorDsl.g:130:1: ruleEString EOF
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
    // InternalOpenDictatorDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOpenDictatorDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalOpenDictatorDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalOpenDictatorDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOpenDictatorDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalOpenDictatorDsl.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleStatement"
    // InternalOpenDictatorDsl.g:153:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:154:1: ( ruleStatement EOF )
            // InternalOpenDictatorDsl.g:155:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalOpenDictatorDsl.g:162:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:166:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalOpenDictatorDsl.g:167:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalOpenDictatorDsl.g:167:2: ( ( rule__Statement__Group__0 ) )
            // InternalOpenDictatorDsl.g:168:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalOpenDictatorDsl.g:169:3: ( rule__Statement__Group__0 )
            // InternalOpenDictatorDsl.g:169:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleJsonQuery"
    // InternalOpenDictatorDsl.g:178:1: entryRuleJsonQuery : ruleJsonQuery EOF ;
    public final void entryRuleJsonQuery() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:179:1: ( ruleJsonQuery EOF )
            // InternalOpenDictatorDsl.g:180:1: ruleJsonQuery EOF
            {
             before(grammarAccess.getJsonQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonQuery();

            state._fsp--;

             after(grammarAccess.getJsonQueryRule()); 
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
    // $ANTLR end "entryRuleJsonQuery"


    // $ANTLR start "ruleJsonQuery"
    // InternalOpenDictatorDsl.g:187:1: ruleJsonQuery : ( ( rule__JsonQuery__Group__0 ) ) ;
    public final void ruleJsonQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:191:2: ( ( ( rule__JsonQuery__Group__0 ) ) )
            // InternalOpenDictatorDsl.g:192:2: ( ( rule__JsonQuery__Group__0 ) )
            {
            // InternalOpenDictatorDsl.g:192:2: ( ( rule__JsonQuery__Group__0 ) )
            // InternalOpenDictatorDsl.g:193:3: ( rule__JsonQuery__Group__0 )
            {
             before(grammarAccess.getJsonQueryAccess().getGroup()); 
            // InternalOpenDictatorDsl.g:194:3: ( rule__JsonQuery__Group__0 )
            // InternalOpenDictatorDsl.g:194:4: rule__JsonQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleJsonQuery"


    // $ANTLR start "entryRuleValue"
    // InternalOpenDictatorDsl.g:203:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalOpenDictatorDsl.g:204:1: ( ruleValue EOF )
            // InternalOpenDictatorDsl.g:205:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalOpenDictatorDsl.g:212:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:216:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalOpenDictatorDsl.g:217:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalOpenDictatorDsl.g:217:2: ( ( rule__Value__Group__0 ) )
            // InternalOpenDictatorDsl.g:218:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalOpenDictatorDsl.g:219:3: ( rule__Value__Group__0 )
            // InternalOpenDictatorDsl.g:219:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleStatementOperator"
    // InternalOpenDictatorDsl.g:228:1: ruleStatementOperator : ( ( rule__StatementOperator__Alternatives ) ) ;
    public final void ruleStatementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:232:1: ( ( ( rule__StatementOperator__Alternatives ) ) )
            // InternalOpenDictatorDsl.g:233:2: ( ( rule__StatementOperator__Alternatives ) )
            {
            // InternalOpenDictatorDsl.g:233:2: ( ( rule__StatementOperator__Alternatives ) )
            // InternalOpenDictatorDsl.g:234:3: ( rule__StatementOperator__Alternatives )
            {
             before(grammarAccess.getStatementOperatorAccess().getAlternatives()); 
            // InternalOpenDictatorDsl.g:235:3: ( rule__StatementOperator__Alternatives )
            // InternalOpenDictatorDsl.g:235:4: rule__StatementOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StatementOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatementOperator"


    // $ANTLR start "ruleEvaluationOperator"
    // InternalOpenDictatorDsl.g:244:1: ruleEvaluationOperator : ( ( rule__EvaluationOperator__Alternatives ) ) ;
    public final void ruleEvaluationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:248:1: ( ( ( rule__EvaluationOperator__Alternatives ) ) )
            // InternalOpenDictatorDsl.g:249:2: ( ( rule__EvaluationOperator__Alternatives ) )
            {
            // InternalOpenDictatorDsl.g:249:2: ( ( rule__EvaluationOperator__Alternatives ) )
            // InternalOpenDictatorDsl.g:250:3: ( rule__EvaluationOperator__Alternatives )
            {
             before(grammarAccess.getEvaluationOperatorAccess().getAlternatives()); 
            // InternalOpenDictatorDsl.g:251:3: ( rule__EvaluationOperator__Alternatives )
            // InternalOpenDictatorDsl.g:251:4: rule__EvaluationOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvaluationOperator"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalOpenDictatorDsl.g:259:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:263:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalOpenDictatorDsl.g:264:2: ( RULE_STRING )
                    {
                    // InternalOpenDictatorDsl.g:264:2: ( RULE_STRING )
                    // InternalOpenDictatorDsl.g:265:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:270:2: ( RULE_ID )
                    {
                    // InternalOpenDictatorDsl.g:270:2: ( RULE_ID )
                    // InternalOpenDictatorDsl.g:271:3: RULE_ID
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


    // $ANTLR start "rule__StatementOperator__Alternatives"
    // InternalOpenDictatorDsl.g:280:1: rule__StatementOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) );
    public final void rule__StatementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:284:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) | ( ( 'NOT' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOpenDictatorDsl.g:285:2: ( ( 'AND' ) )
                    {
                    // InternalOpenDictatorDsl.g:285:2: ( ( 'AND' ) )
                    // InternalOpenDictatorDsl.g:286:3: ( 'AND' )
                    {
                     before(grammarAccess.getStatementOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalOpenDictatorDsl.g:287:3: ( 'AND' )
                    // InternalOpenDictatorDsl.g:287:4: 'AND'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatementOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:291:2: ( ( 'OR' ) )
                    {
                    // InternalOpenDictatorDsl.g:291:2: ( ( 'OR' ) )
                    // InternalOpenDictatorDsl.g:292:3: ( 'OR' )
                    {
                     before(grammarAccess.getStatementOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalOpenDictatorDsl.g:293:3: ( 'OR' )
                    // InternalOpenDictatorDsl.g:293:4: 'OR'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatementOperatorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenDictatorDsl.g:297:2: ( ( 'NOT' ) )
                    {
                    // InternalOpenDictatorDsl.g:297:2: ( ( 'NOT' ) )
                    // InternalOpenDictatorDsl.g:298:3: ( 'NOT' )
                    {
                     before(grammarAccess.getStatementOperatorAccess().getNOTEnumLiteralDeclaration_2()); 
                    // InternalOpenDictatorDsl.g:299:3: ( 'NOT' )
                    // InternalOpenDictatorDsl.g:299:4: 'NOT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatementOperatorAccess().getNOTEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__StatementOperator__Alternatives"


    // $ANTLR start "rule__EvaluationOperator__Alternatives"
    // InternalOpenDictatorDsl.g:307:1: rule__EvaluationOperator__Alternatives : ( ( ( 'FORSOME' ) ) | ( ( 'FORALL' ) ) | ( ( 'CONTAINS' ) ) | ( ( 'EQUALS' ) ) | ( ( 'LARGERTHAN' ) ) | ( ( 'SMALLERTHAN' ) ) );
    public final void rule__EvaluationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:311:1: ( ( ( 'FORSOME' ) ) | ( ( 'FORALL' ) ) | ( ( 'CONTAINS' ) ) | ( ( 'EQUALS' ) ) | ( ( 'LARGERTHAN' ) ) | ( ( 'SMALLERTHAN' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOpenDictatorDsl.g:312:2: ( ( 'FORSOME' ) )
                    {
                    // InternalOpenDictatorDsl.g:312:2: ( ( 'FORSOME' ) )
                    // InternalOpenDictatorDsl.g:313:3: ( 'FORSOME' )
                    {
                     before(grammarAccess.getEvaluationOperatorAccess().getFORSOMEEnumLiteralDeclaration_0()); 
                    // InternalOpenDictatorDsl.g:314:3: ( 'FORSOME' )
                    // InternalOpenDictatorDsl.g:314:4: 'FORSOME'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationOperatorAccess().getFORSOMEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOpenDictatorDsl.g:318:2: ( ( 'FORALL' ) )
                    {
                    // InternalOpenDictatorDsl.g:318:2: ( ( 'FORALL' ) )
                    // InternalOpenDictatorDsl.g:319:3: ( 'FORALL' )
                    {
                     before(grammarAccess.getEvaluationOperatorAccess().getFORALLEnumLiteralDeclaration_1()); 
                    // InternalOpenDictatorDsl.g:320:3: ( 'FORALL' )
                    // InternalOpenDictatorDsl.g:320:4: 'FORALL'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationOperatorAccess().getFORALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOpenDictatorDsl.g:324:2: ( ( 'CONTAINS' ) )
                    {
                    // InternalOpenDictatorDsl.g:324:2: ( ( 'CONTAINS' ) )
                    // InternalOpenDictatorDsl.g:325:3: ( 'CONTAINS' )
                    {
                     before(grammarAccess.getEvaluationOperatorAccess().getCONTAINSEnumLiteralDeclaration_2()); 
                    // InternalOpenDictatorDsl.g:326:3: ( 'CONTAINS' )
                    // InternalOpenDictatorDsl.g:326:4: 'CONTAINS'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationOperatorAccess().getCONTAINSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOpenDictatorDsl.g:330:2: ( ( 'EQUALS' ) )
                    {
                    // InternalOpenDictatorDsl.g:330:2: ( ( 'EQUALS' ) )
                    // InternalOpenDictatorDsl.g:331:3: ( 'EQUALS' )
                    {
                     before(grammarAccess.getEvaluationOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 
                    // InternalOpenDictatorDsl.g:332:3: ( 'EQUALS' )
                    // InternalOpenDictatorDsl.g:332:4: 'EQUALS'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationOperatorAccess().getEQUALSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOpenDictatorDsl.g:336:2: ( ( 'LARGERTHAN' ) )
                    {
                    // InternalOpenDictatorDsl.g:336:2: ( ( 'LARGERTHAN' ) )
                    // InternalOpenDictatorDsl.g:337:3: ( 'LARGERTHAN' )
                    {
                     before(grammarAccess.getEvaluationOperatorAccess().getLARGERTHANEnumLiteralDeclaration_4()); 
                    // InternalOpenDictatorDsl.g:338:3: ( 'LARGERTHAN' )
                    // InternalOpenDictatorDsl.g:338:4: 'LARGERTHAN'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationOperatorAccess().getLARGERTHANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOpenDictatorDsl.g:342:2: ( ( 'SMALLERTHAN' ) )
                    {
                    // InternalOpenDictatorDsl.g:342:2: ( ( 'SMALLERTHAN' ) )
                    // InternalOpenDictatorDsl.g:343:3: ( 'SMALLERTHAN' )
                    {
                     before(grammarAccess.getEvaluationOperatorAccess().getSMALLERTHANEnumLiteralDeclaration_5()); 
                    // InternalOpenDictatorDsl.g:344:3: ( 'SMALLERTHAN' )
                    // InternalOpenDictatorDsl.g:344:4: 'SMALLERTHAN'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationOperatorAccess().getSMALLERTHANEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__EvaluationOperator__Alternatives"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalOpenDictatorDsl.g:352:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:356:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalOpenDictatorDsl.g:357:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

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
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalOpenDictatorDsl.g:364:1: rule__Policy__Group__0__Impl : ( 'Policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:368:1: ( ( 'Policy' ) )
            // InternalOpenDictatorDsl.g:369:1: ( 'Policy' )
            {
            // InternalOpenDictatorDsl.g:369:1: ( 'Policy' )
            // InternalOpenDictatorDsl.g:370:2: 'Policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

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
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalOpenDictatorDsl.g:379:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:383:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalOpenDictatorDsl.g:384:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

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
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalOpenDictatorDsl.g:391:1: rule__Policy__Group__1__Impl : ( '{' ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:395:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:396:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:396:1: ( '{' )
            // InternalOpenDictatorDsl.g:397:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalOpenDictatorDsl.g:406:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:410:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalOpenDictatorDsl.g:411:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

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
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalOpenDictatorDsl.g:418:1: rule__Policy__Group__2__Impl : ( 'FailureMessage' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:422:1: ( ( 'FailureMessage' ) )
            // InternalOpenDictatorDsl.g:423:1: ( 'FailureMessage' )
            {
            // InternalOpenDictatorDsl.g:423:1: ( 'FailureMessage' )
            // InternalOpenDictatorDsl.g:424:2: 'FailureMessage'
            {
             before(grammarAccess.getPolicyAccess().getFailureMessageKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getFailureMessageKeyword_2()); 

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
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalOpenDictatorDsl.g:433:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:437:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // InternalOpenDictatorDsl.g:438:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__4();

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
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalOpenDictatorDsl.g:445:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__FailureMessageAssignment_3 ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:449:1: ( ( ( rule__Policy__FailureMessageAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:450:1: ( ( rule__Policy__FailureMessageAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:450:1: ( ( rule__Policy__FailureMessageAssignment_3 ) )
            // InternalOpenDictatorDsl.g:451:2: ( rule__Policy__FailureMessageAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getFailureMessageAssignment_3()); 
            // InternalOpenDictatorDsl.g:452:2: ( rule__Policy__FailureMessageAssignment_3 )
            // InternalOpenDictatorDsl.g:452:3: rule__Policy__FailureMessageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Policy__FailureMessageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getFailureMessageAssignment_3()); 

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
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // InternalOpenDictatorDsl.g:460:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:464:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // InternalOpenDictatorDsl.g:465:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__5();

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
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // InternalOpenDictatorDsl.g:472:1: rule__Policy__Group__4__Impl : ( 'SuccessMessage' ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:476:1: ( ( 'SuccessMessage' ) )
            // InternalOpenDictatorDsl.g:477:1: ( 'SuccessMessage' )
            {
            // InternalOpenDictatorDsl.g:477:1: ( 'SuccessMessage' )
            // InternalOpenDictatorDsl.g:478:2: 'SuccessMessage'
            {
             before(grammarAccess.getPolicyAccess().getSuccessMessageKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getSuccessMessageKeyword_4()); 

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
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__5"
    // InternalOpenDictatorDsl.g:487:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:491:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // InternalOpenDictatorDsl.g:492:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__6();

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
    // $ANTLR end "rule__Policy__Group__5"


    // $ANTLR start "rule__Policy__Group__5__Impl"
    // InternalOpenDictatorDsl.g:499:1: rule__Policy__Group__5__Impl : ( ( rule__Policy__SuccessMessageAssignment_5 ) ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:503:1: ( ( ( rule__Policy__SuccessMessageAssignment_5 ) ) )
            // InternalOpenDictatorDsl.g:504:1: ( ( rule__Policy__SuccessMessageAssignment_5 ) )
            {
            // InternalOpenDictatorDsl.g:504:1: ( ( rule__Policy__SuccessMessageAssignment_5 ) )
            // InternalOpenDictatorDsl.g:505:2: ( rule__Policy__SuccessMessageAssignment_5 )
            {
             before(grammarAccess.getPolicyAccess().getSuccessMessageAssignment_5()); 
            // InternalOpenDictatorDsl.g:506:2: ( rule__Policy__SuccessMessageAssignment_5 )
            // InternalOpenDictatorDsl.g:506:3: rule__Policy__SuccessMessageAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Policy__SuccessMessageAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getSuccessMessageAssignment_5()); 

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
    // $ANTLR end "rule__Policy__Group__5__Impl"


    // $ANTLR start "rule__Policy__Group__6"
    // InternalOpenDictatorDsl.g:514:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl rule__Policy__Group__7 ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:518:1: ( rule__Policy__Group__6__Impl rule__Policy__Group__7 )
            // InternalOpenDictatorDsl.g:519:2: rule__Policy__Group__6__Impl rule__Policy__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__7();

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
    // $ANTLR end "rule__Policy__Group__6"


    // $ANTLR start "rule__Policy__Group__6__Impl"
    // InternalOpenDictatorDsl.g:526:1: rule__Policy__Group__6__Impl : ( 'id' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:530:1: ( ( 'id' ) )
            // InternalOpenDictatorDsl.g:531:1: ( 'id' )
            {
            // InternalOpenDictatorDsl.g:531:1: ( 'id' )
            // InternalOpenDictatorDsl.g:532:2: 'id'
            {
             before(grammarAccess.getPolicyAccess().getIdKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getIdKeyword_6()); 

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
    // $ANTLR end "rule__Policy__Group__6__Impl"


    // $ANTLR start "rule__Policy__Group__7"
    // InternalOpenDictatorDsl.g:541:1: rule__Policy__Group__7 : rule__Policy__Group__7__Impl rule__Policy__Group__8 ;
    public final void rule__Policy__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:545:1: ( rule__Policy__Group__7__Impl rule__Policy__Group__8 )
            // InternalOpenDictatorDsl.g:546:2: rule__Policy__Group__7__Impl rule__Policy__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Policy__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__8();

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
    // $ANTLR end "rule__Policy__Group__7"


    // $ANTLR start "rule__Policy__Group__7__Impl"
    // InternalOpenDictatorDsl.g:553:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__IdAssignment_7 ) ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:557:1: ( ( ( rule__Policy__IdAssignment_7 ) ) )
            // InternalOpenDictatorDsl.g:558:1: ( ( rule__Policy__IdAssignment_7 ) )
            {
            // InternalOpenDictatorDsl.g:558:1: ( ( rule__Policy__IdAssignment_7 ) )
            // InternalOpenDictatorDsl.g:559:2: ( rule__Policy__IdAssignment_7 )
            {
             before(grammarAccess.getPolicyAccess().getIdAssignment_7()); 
            // InternalOpenDictatorDsl.g:560:2: ( rule__Policy__IdAssignment_7 )
            // InternalOpenDictatorDsl.g:560:3: rule__Policy__IdAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Policy__IdAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getIdAssignment_7()); 

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
    // $ANTLR end "rule__Policy__Group__7__Impl"


    // $ANTLR start "rule__Policy__Group__8"
    // InternalOpenDictatorDsl.g:568:1: rule__Policy__Group__8 : rule__Policy__Group__8__Impl rule__Policy__Group__9 ;
    public final void rule__Policy__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:572:1: ( rule__Policy__Group__8__Impl rule__Policy__Group__9 )
            // InternalOpenDictatorDsl.g:573:2: rule__Policy__Group__8__Impl rule__Policy__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Policy__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__9();

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
    // $ANTLR end "rule__Policy__Group__8"


    // $ANTLR start "rule__Policy__Group__8__Impl"
    // InternalOpenDictatorDsl.g:580:1: rule__Policy__Group__8__Impl : ( 'statementset' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:584:1: ( ( 'statementset' ) )
            // InternalOpenDictatorDsl.g:585:1: ( 'statementset' )
            {
            // InternalOpenDictatorDsl.g:585:1: ( 'statementset' )
            // InternalOpenDictatorDsl.g:586:2: 'statementset'
            {
             before(grammarAccess.getPolicyAccess().getStatementsetKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getStatementsetKeyword_8()); 

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
    // $ANTLR end "rule__Policy__Group__8__Impl"


    // $ANTLR start "rule__Policy__Group__9"
    // InternalOpenDictatorDsl.g:595:1: rule__Policy__Group__9 : rule__Policy__Group__9__Impl rule__Policy__Group__10 ;
    public final void rule__Policy__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:599:1: ( rule__Policy__Group__9__Impl rule__Policy__Group__10 )
            // InternalOpenDictatorDsl.g:600:2: rule__Policy__Group__9__Impl rule__Policy__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Policy__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__10();

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
    // $ANTLR end "rule__Policy__Group__9"


    // $ANTLR start "rule__Policy__Group__9__Impl"
    // InternalOpenDictatorDsl.g:607:1: rule__Policy__Group__9__Impl : ( ( rule__Policy__StatementsetAssignment_9 ) ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:611:1: ( ( ( rule__Policy__StatementsetAssignment_9 ) ) )
            // InternalOpenDictatorDsl.g:612:1: ( ( rule__Policy__StatementsetAssignment_9 ) )
            {
            // InternalOpenDictatorDsl.g:612:1: ( ( rule__Policy__StatementsetAssignment_9 ) )
            // InternalOpenDictatorDsl.g:613:2: ( rule__Policy__StatementsetAssignment_9 )
            {
             before(grammarAccess.getPolicyAccess().getStatementsetAssignment_9()); 
            // InternalOpenDictatorDsl.g:614:2: ( rule__Policy__StatementsetAssignment_9 )
            // InternalOpenDictatorDsl.g:614:3: rule__Policy__StatementsetAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Policy__StatementsetAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getStatementsetAssignment_9()); 

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
    // $ANTLR end "rule__Policy__Group__9__Impl"


    // $ANTLR start "rule__Policy__Group__10"
    // InternalOpenDictatorDsl.g:622:1: rule__Policy__Group__10 : rule__Policy__Group__10__Impl rule__Policy__Group__11 ;
    public final void rule__Policy__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:626:1: ( rule__Policy__Group__10__Impl rule__Policy__Group__11 )
            // InternalOpenDictatorDsl.g:627:2: rule__Policy__Group__10__Impl rule__Policy__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Policy__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__11();

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
    // $ANTLR end "rule__Policy__Group__10"


    // $ANTLR start "rule__Policy__Group__10__Impl"
    // InternalOpenDictatorDsl.g:634:1: rule__Policy__Group__10__Impl : ( 'inputfile' ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:638:1: ( ( 'inputfile' ) )
            // InternalOpenDictatorDsl.g:639:1: ( 'inputfile' )
            {
            // InternalOpenDictatorDsl.g:639:1: ( 'inputfile' )
            // InternalOpenDictatorDsl.g:640:2: 'inputfile'
            {
             before(grammarAccess.getPolicyAccess().getInputfileKeyword_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getInputfileKeyword_10()); 

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
    // $ANTLR end "rule__Policy__Group__10__Impl"


    // $ANTLR start "rule__Policy__Group__11"
    // InternalOpenDictatorDsl.g:649:1: rule__Policy__Group__11 : rule__Policy__Group__11__Impl rule__Policy__Group__12 ;
    public final void rule__Policy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:653:1: ( rule__Policy__Group__11__Impl rule__Policy__Group__12 )
            // InternalOpenDictatorDsl.g:654:2: rule__Policy__Group__11__Impl rule__Policy__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Policy__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__12();

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
    // $ANTLR end "rule__Policy__Group__11"


    // $ANTLR start "rule__Policy__Group__11__Impl"
    // InternalOpenDictatorDsl.g:661:1: rule__Policy__Group__11__Impl : ( ( rule__Policy__InputfileAssignment_11 ) ) ;
    public final void rule__Policy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:665:1: ( ( ( rule__Policy__InputfileAssignment_11 ) ) )
            // InternalOpenDictatorDsl.g:666:1: ( ( rule__Policy__InputfileAssignment_11 ) )
            {
            // InternalOpenDictatorDsl.g:666:1: ( ( rule__Policy__InputfileAssignment_11 ) )
            // InternalOpenDictatorDsl.g:667:2: ( rule__Policy__InputfileAssignment_11 )
            {
             before(grammarAccess.getPolicyAccess().getInputfileAssignment_11()); 
            // InternalOpenDictatorDsl.g:668:2: ( rule__Policy__InputfileAssignment_11 )
            // InternalOpenDictatorDsl.g:668:3: rule__Policy__InputfileAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Policy__InputfileAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getInputfileAssignment_11()); 

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
    // $ANTLR end "rule__Policy__Group__11__Impl"


    // $ANTLR start "rule__Policy__Group__12"
    // InternalOpenDictatorDsl.g:676:1: rule__Policy__Group__12 : rule__Policy__Group__12__Impl ;
    public final void rule__Policy__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:680:1: ( rule__Policy__Group__12__Impl )
            // InternalOpenDictatorDsl.g:681:2: rule__Policy__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__12__Impl();

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
    // $ANTLR end "rule__Policy__Group__12"


    // $ANTLR start "rule__Policy__Group__12__Impl"
    // InternalOpenDictatorDsl.g:687:1: rule__Policy__Group__12__Impl : ( '}' ) ;
    public final void rule__Policy__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:691:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:692:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:692:1: ( '}' )
            // InternalOpenDictatorDsl.g:693:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Policy__Group__12__Impl"


    // $ANTLR start "rule__StatementSet__Group__0"
    // InternalOpenDictatorDsl.g:703:1: rule__StatementSet__Group__0 : rule__StatementSet__Group__0__Impl rule__StatementSet__Group__1 ;
    public final void rule__StatementSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:707:1: ( rule__StatementSet__Group__0__Impl rule__StatementSet__Group__1 )
            // InternalOpenDictatorDsl.g:708:2: rule__StatementSet__Group__0__Impl rule__StatementSet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StatementSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__1();

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
    // $ANTLR end "rule__StatementSet__Group__0"


    // $ANTLR start "rule__StatementSet__Group__0__Impl"
    // InternalOpenDictatorDsl.g:715:1: rule__StatementSet__Group__0__Impl : ( 'StatementSet' ) ;
    public final void rule__StatementSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:719:1: ( ( 'StatementSet' ) )
            // InternalOpenDictatorDsl.g:720:1: ( 'StatementSet' )
            {
            // InternalOpenDictatorDsl.g:720:1: ( 'StatementSet' )
            // InternalOpenDictatorDsl.g:721:2: 'StatementSet'
            {
             before(grammarAccess.getStatementSetAccess().getStatementSetKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getStatementSetKeyword_0()); 

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
    // $ANTLR end "rule__StatementSet__Group__0__Impl"


    // $ANTLR start "rule__StatementSet__Group__1"
    // InternalOpenDictatorDsl.g:730:1: rule__StatementSet__Group__1 : rule__StatementSet__Group__1__Impl rule__StatementSet__Group__2 ;
    public final void rule__StatementSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:734:1: ( rule__StatementSet__Group__1__Impl rule__StatementSet__Group__2 )
            // InternalOpenDictatorDsl.g:735:2: rule__StatementSet__Group__1__Impl rule__StatementSet__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__StatementSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__2();

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
    // $ANTLR end "rule__StatementSet__Group__1"


    // $ANTLR start "rule__StatementSet__Group__1__Impl"
    // InternalOpenDictatorDsl.g:742:1: rule__StatementSet__Group__1__Impl : ( '{' ) ;
    public final void rule__StatementSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:746:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:747:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:747:1: ( '{' )
            // InternalOpenDictatorDsl.g:748:2: '{'
            {
             before(grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__StatementSet__Group__1__Impl"


    // $ANTLR start "rule__StatementSet__Group__2"
    // InternalOpenDictatorDsl.g:757:1: rule__StatementSet__Group__2 : rule__StatementSet__Group__2__Impl rule__StatementSet__Group__3 ;
    public final void rule__StatementSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:761:1: ( rule__StatementSet__Group__2__Impl rule__StatementSet__Group__3 )
            // InternalOpenDictatorDsl.g:762:2: rule__StatementSet__Group__2__Impl rule__StatementSet__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__StatementSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__3();

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
    // $ANTLR end "rule__StatementSet__Group__2"


    // $ANTLR start "rule__StatementSet__Group__2__Impl"
    // InternalOpenDictatorDsl.g:769:1: rule__StatementSet__Group__2__Impl : ( 'statementOperator' ) ;
    public final void rule__StatementSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:773:1: ( ( 'statementOperator' ) )
            // InternalOpenDictatorDsl.g:774:1: ( 'statementOperator' )
            {
            // InternalOpenDictatorDsl.g:774:1: ( 'statementOperator' )
            // InternalOpenDictatorDsl.g:775:2: 'statementOperator'
            {
             before(grammarAccess.getStatementSetAccess().getStatementOperatorKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getStatementOperatorKeyword_2()); 

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
    // $ANTLR end "rule__StatementSet__Group__2__Impl"


    // $ANTLR start "rule__StatementSet__Group__3"
    // InternalOpenDictatorDsl.g:784:1: rule__StatementSet__Group__3 : rule__StatementSet__Group__3__Impl rule__StatementSet__Group__4 ;
    public final void rule__StatementSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:788:1: ( rule__StatementSet__Group__3__Impl rule__StatementSet__Group__4 )
            // InternalOpenDictatorDsl.g:789:2: rule__StatementSet__Group__3__Impl rule__StatementSet__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__StatementSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__4();

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
    // $ANTLR end "rule__StatementSet__Group__3"


    // $ANTLR start "rule__StatementSet__Group__3__Impl"
    // InternalOpenDictatorDsl.g:796:1: rule__StatementSet__Group__3__Impl : ( ( rule__StatementSet__StatementOperatorAssignment_3 ) ) ;
    public final void rule__StatementSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:800:1: ( ( ( rule__StatementSet__StatementOperatorAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:801:1: ( ( rule__StatementSet__StatementOperatorAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:801:1: ( ( rule__StatementSet__StatementOperatorAssignment_3 ) )
            // InternalOpenDictatorDsl.g:802:2: ( rule__StatementSet__StatementOperatorAssignment_3 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementOperatorAssignment_3()); 
            // InternalOpenDictatorDsl.g:803:2: ( rule__StatementSet__StatementOperatorAssignment_3 )
            // InternalOpenDictatorDsl.g:803:3: rule__StatementSet__StatementOperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementOperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementOperatorAssignment_3()); 

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
    // $ANTLR end "rule__StatementSet__Group__3__Impl"


    // $ANTLR start "rule__StatementSet__Group__4"
    // InternalOpenDictatorDsl.g:811:1: rule__StatementSet__Group__4 : rule__StatementSet__Group__4__Impl rule__StatementSet__Group__5 ;
    public final void rule__StatementSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:815:1: ( rule__StatementSet__Group__4__Impl rule__StatementSet__Group__5 )
            // InternalOpenDictatorDsl.g:816:2: rule__StatementSet__Group__4__Impl rule__StatementSet__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__StatementSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__5();

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
    // $ANTLR end "rule__StatementSet__Group__4"


    // $ANTLR start "rule__StatementSet__Group__4__Impl"
    // InternalOpenDictatorDsl.g:823:1: rule__StatementSet__Group__4__Impl : ( ( rule__StatementSet__Group_4__0 )? ) ;
    public final void rule__StatementSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:827:1: ( ( ( rule__StatementSet__Group_4__0 )? ) )
            // InternalOpenDictatorDsl.g:828:1: ( ( rule__StatementSet__Group_4__0 )? )
            {
            // InternalOpenDictatorDsl.g:828:1: ( ( rule__StatementSet__Group_4__0 )? )
            // InternalOpenDictatorDsl.g:829:2: ( rule__StatementSet__Group_4__0 )?
            {
             before(grammarAccess.getStatementSetAccess().getGroup_4()); 
            // InternalOpenDictatorDsl.g:830:2: ( rule__StatementSet__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOpenDictatorDsl.g:830:3: rule__StatementSet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatementSet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementSetAccess().getGroup_4()); 

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
    // $ANTLR end "rule__StatementSet__Group__4__Impl"


    // $ANTLR start "rule__StatementSet__Group__5"
    // InternalOpenDictatorDsl.g:838:1: rule__StatementSet__Group__5 : rule__StatementSet__Group__5__Impl rule__StatementSet__Group__6 ;
    public final void rule__StatementSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:842:1: ( rule__StatementSet__Group__5__Impl rule__StatementSet__Group__6 )
            // InternalOpenDictatorDsl.g:843:2: rule__StatementSet__Group__5__Impl rule__StatementSet__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__StatementSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__6();

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
    // $ANTLR end "rule__StatementSet__Group__5"


    // $ANTLR start "rule__StatementSet__Group__5__Impl"
    // InternalOpenDictatorDsl.g:850:1: rule__StatementSet__Group__5__Impl : ( 'statement' ) ;
    public final void rule__StatementSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:854:1: ( ( 'statement' ) )
            // InternalOpenDictatorDsl.g:855:1: ( 'statement' )
            {
            // InternalOpenDictatorDsl.g:855:1: ( 'statement' )
            // InternalOpenDictatorDsl.g:856:2: 'statement'
            {
             before(grammarAccess.getStatementSetAccess().getStatementKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getStatementKeyword_5()); 

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
    // $ANTLR end "rule__StatementSet__Group__5__Impl"


    // $ANTLR start "rule__StatementSet__Group__6"
    // InternalOpenDictatorDsl.g:865:1: rule__StatementSet__Group__6 : rule__StatementSet__Group__6__Impl rule__StatementSet__Group__7 ;
    public final void rule__StatementSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:869:1: ( rule__StatementSet__Group__6__Impl rule__StatementSet__Group__7 )
            // InternalOpenDictatorDsl.g:870:2: rule__StatementSet__Group__6__Impl rule__StatementSet__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__StatementSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__7();

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
    // $ANTLR end "rule__StatementSet__Group__6"


    // $ANTLR start "rule__StatementSet__Group__6__Impl"
    // InternalOpenDictatorDsl.g:877:1: rule__StatementSet__Group__6__Impl : ( '{' ) ;
    public final void rule__StatementSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:881:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:882:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:882:1: ( '{' )
            // InternalOpenDictatorDsl.g:883:2: '{'
            {
             before(grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__StatementSet__Group__6__Impl"


    // $ANTLR start "rule__StatementSet__Group__7"
    // InternalOpenDictatorDsl.g:892:1: rule__StatementSet__Group__7 : rule__StatementSet__Group__7__Impl rule__StatementSet__Group__8 ;
    public final void rule__StatementSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:896:1: ( rule__StatementSet__Group__7__Impl rule__StatementSet__Group__8 )
            // InternalOpenDictatorDsl.g:897:2: rule__StatementSet__Group__7__Impl rule__StatementSet__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__StatementSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__8();

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
    // $ANTLR end "rule__StatementSet__Group__7"


    // $ANTLR start "rule__StatementSet__Group__7__Impl"
    // InternalOpenDictatorDsl.g:904:1: rule__StatementSet__Group__7__Impl : ( ( rule__StatementSet__StatementAssignment_7 ) ) ;
    public final void rule__StatementSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:908:1: ( ( ( rule__StatementSet__StatementAssignment_7 ) ) )
            // InternalOpenDictatorDsl.g:909:1: ( ( rule__StatementSet__StatementAssignment_7 ) )
            {
            // InternalOpenDictatorDsl.g:909:1: ( ( rule__StatementSet__StatementAssignment_7 ) )
            // InternalOpenDictatorDsl.g:910:2: ( rule__StatementSet__StatementAssignment_7 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementAssignment_7()); 
            // InternalOpenDictatorDsl.g:911:2: ( rule__StatementSet__StatementAssignment_7 )
            // InternalOpenDictatorDsl.g:911:3: rule__StatementSet__StatementAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementAssignment_7()); 

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
    // $ANTLR end "rule__StatementSet__Group__7__Impl"


    // $ANTLR start "rule__StatementSet__Group__8"
    // InternalOpenDictatorDsl.g:919:1: rule__StatementSet__Group__8 : rule__StatementSet__Group__8__Impl rule__StatementSet__Group__9 ;
    public final void rule__StatementSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:923:1: ( rule__StatementSet__Group__8__Impl rule__StatementSet__Group__9 )
            // InternalOpenDictatorDsl.g:924:2: rule__StatementSet__Group__8__Impl rule__StatementSet__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__StatementSet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__9();

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
    // $ANTLR end "rule__StatementSet__Group__8"


    // $ANTLR start "rule__StatementSet__Group__8__Impl"
    // InternalOpenDictatorDsl.g:931:1: rule__StatementSet__Group__8__Impl : ( ( rule__StatementSet__Group_8__0 )* ) ;
    public final void rule__StatementSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:935:1: ( ( ( rule__StatementSet__Group_8__0 )* ) )
            // InternalOpenDictatorDsl.g:936:1: ( ( rule__StatementSet__Group_8__0 )* )
            {
            // InternalOpenDictatorDsl.g:936:1: ( ( rule__StatementSet__Group_8__0 )* )
            // InternalOpenDictatorDsl.g:937:2: ( rule__StatementSet__Group_8__0 )*
            {
             before(grammarAccess.getStatementSetAccess().getGroup_8()); 
            // InternalOpenDictatorDsl.g:938:2: ( rule__StatementSet__Group_8__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:938:3: rule__StatementSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__StatementSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStatementSetAccess().getGroup_8()); 

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
    // $ANTLR end "rule__StatementSet__Group__8__Impl"


    // $ANTLR start "rule__StatementSet__Group__9"
    // InternalOpenDictatorDsl.g:946:1: rule__StatementSet__Group__9 : rule__StatementSet__Group__9__Impl rule__StatementSet__Group__10 ;
    public final void rule__StatementSet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:950:1: ( rule__StatementSet__Group__9__Impl rule__StatementSet__Group__10 )
            // InternalOpenDictatorDsl.g:951:2: rule__StatementSet__Group__9__Impl rule__StatementSet__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__StatementSet__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__10();

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
    // $ANTLR end "rule__StatementSet__Group__9"


    // $ANTLR start "rule__StatementSet__Group__9__Impl"
    // InternalOpenDictatorDsl.g:958:1: rule__StatementSet__Group__9__Impl : ( '}' ) ;
    public final void rule__StatementSet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:962:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:963:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:963:1: ( '}' )
            // InternalOpenDictatorDsl.g:964:2: '}'
            {
             before(grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__StatementSet__Group__9__Impl"


    // $ANTLR start "rule__StatementSet__Group__10"
    // InternalOpenDictatorDsl.g:973:1: rule__StatementSet__Group__10 : rule__StatementSet__Group__10__Impl ;
    public final void rule__StatementSet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:977:1: ( rule__StatementSet__Group__10__Impl )
            // InternalOpenDictatorDsl.g:978:2: rule__StatementSet__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__10__Impl();

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
    // $ANTLR end "rule__StatementSet__Group__10"


    // $ANTLR start "rule__StatementSet__Group__10__Impl"
    // InternalOpenDictatorDsl.g:984:1: rule__StatementSet__Group__10__Impl : ( '}' ) ;
    public final void rule__StatementSet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:988:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:989:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:989:1: ( '}' )
            // InternalOpenDictatorDsl.g:990:2: '}'
            {
             before(grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__StatementSet__Group__10__Impl"


    // $ANTLR start "rule__StatementSet__Group_4__0"
    // InternalOpenDictatorDsl.g:1000:1: rule__StatementSet__Group_4__0 : rule__StatementSet__Group_4__0__Impl rule__StatementSet__Group_4__1 ;
    public final void rule__StatementSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1004:1: ( rule__StatementSet__Group_4__0__Impl rule__StatementSet__Group_4__1 )
            // InternalOpenDictatorDsl.g:1005:2: rule__StatementSet__Group_4__0__Impl rule__StatementSet__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__StatementSet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4__1();

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
    // $ANTLR end "rule__StatementSet__Group_4__0"


    // $ANTLR start "rule__StatementSet__Group_4__0__Impl"
    // InternalOpenDictatorDsl.g:1012:1: rule__StatementSet__Group_4__0__Impl : ( 'statementset' ) ;
    public final void rule__StatementSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1016:1: ( ( 'statementset' ) )
            // InternalOpenDictatorDsl.g:1017:1: ( 'statementset' )
            {
            // InternalOpenDictatorDsl.g:1017:1: ( 'statementset' )
            // InternalOpenDictatorDsl.g:1018:2: 'statementset'
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getStatementsetKeyword_4_0()); 

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
    // $ANTLR end "rule__StatementSet__Group_4__0__Impl"


    // $ANTLR start "rule__StatementSet__Group_4__1"
    // InternalOpenDictatorDsl.g:1027:1: rule__StatementSet__Group_4__1 : rule__StatementSet__Group_4__1__Impl rule__StatementSet__Group_4__2 ;
    public final void rule__StatementSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1031:1: ( rule__StatementSet__Group_4__1__Impl rule__StatementSet__Group_4__2 )
            // InternalOpenDictatorDsl.g:1032:2: rule__StatementSet__Group_4__1__Impl rule__StatementSet__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__StatementSet__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4__2();

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
    // $ANTLR end "rule__StatementSet__Group_4__1"


    // $ANTLR start "rule__StatementSet__Group_4__1__Impl"
    // InternalOpenDictatorDsl.g:1039:1: rule__StatementSet__Group_4__1__Impl : ( '{' ) ;
    public final void rule__StatementSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1043:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:1044:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:1044:1: ( '{' )
            // InternalOpenDictatorDsl.g:1045:2: '{'
            {
             before(grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__StatementSet__Group_4__1__Impl"


    // $ANTLR start "rule__StatementSet__Group_4__2"
    // InternalOpenDictatorDsl.g:1054:1: rule__StatementSet__Group_4__2 : rule__StatementSet__Group_4__2__Impl rule__StatementSet__Group_4__3 ;
    public final void rule__StatementSet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1058:1: ( rule__StatementSet__Group_4__2__Impl rule__StatementSet__Group_4__3 )
            // InternalOpenDictatorDsl.g:1059:2: rule__StatementSet__Group_4__2__Impl rule__StatementSet__Group_4__3
            {
            pushFollow(FOLLOW_17);
            rule__StatementSet__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4__3();

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
    // $ANTLR end "rule__StatementSet__Group_4__2"


    // $ANTLR start "rule__StatementSet__Group_4__2__Impl"
    // InternalOpenDictatorDsl.g:1066:1: rule__StatementSet__Group_4__2__Impl : ( ( rule__StatementSet__StatementsetAssignment_4_2 ) ) ;
    public final void rule__StatementSet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1070:1: ( ( ( rule__StatementSet__StatementsetAssignment_4_2 ) ) )
            // InternalOpenDictatorDsl.g:1071:1: ( ( rule__StatementSet__StatementsetAssignment_4_2 ) )
            {
            // InternalOpenDictatorDsl.g:1071:1: ( ( rule__StatementSet__StatementsetAssignment_4_2 ) )
            // InternalOpenDictatorDsl.g:1072:2: ( rule__StatementSet__StatementsetAssignment_4_2 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetAssignment_4_2()); 
            // InternalOpenDictatorDsl.g:1073:2: ( rule__StatementSet__StatementsetAssignment_4_2 )
            // InternalOpenDictatorDsl.g:1073:3: rule__StatementSet__StatementsetAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementsetAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementsetAssignment_4_2()); 

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
    // $ANTLR end "rule__StatementSet__Group_4__2__Impl"


    // $ANTLR start "rule__StatementSet__Group_4__3"
    // InternalOpenDictatorDsl.g:1081:1: rule__StatementSet__Group_4__3 : rule__StatementSet__Group_4__3__Impl rule__StatementSet__Group_4__4 ;
    public final void rule__StatementSet__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1085:1: ( rule__StatementSet__Group_4__3__Impl rule__StatementSet__Group_4__4 )
            // InternalOpenDictatorDsl.g:1086:2: rule__StatementSet__Group_4__3__Impl rule__StatementSet__Group_4__4
            {
            pushFollow(FOLLOW_17);
            rule__StatementSet__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4__4();

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
    // $ANTLR end "rule__StatementSet__Group_4__3"


    // $ANTLR start "rule__StatementSet__Group_4__3__Impl"
    // InternalOpenDictatorDsl.g:1093:1: rule__StatementSet__Group_4__3__Impl : ( ( rule__StatementSet__Group_4_3__0 )* ) ;
    public final void rule__StatementSet__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1097:1: ( ( ( rule__StatementSet__Group_4_3__0 )* ) )
            // InternalOpenDictatorDsl.g:1098:1: ( ( rule__StatementSet__Group_4_3__0 )* )
            {
            // InternalOpenDictatorDsl.g:1098:1: ( ( rule__StatementSet__Group_4_3__0 )* )
            // InternalOpenDictatorDsl.g:1099:2: ( rule__StatementSet__Group_4_3__0 )*
            {
             before(grammarAccess.getStatementSetAccess().getGroup_4_3()); 
            // InternalOpenDictatorDsl.g:1100:2: ( rule__StatementSet__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:1100:3: rule__StatementSet__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__StatementSet__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStatementSetAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__StatementSet__Group_4__3__Impl"


    // $ANTLR start "rule__StatementSet__Group_4__4"
    // InternalOpenDictatorDsl.g:1108:1: rule__StatementSet__Group_4__4 : rule__StatementSet__Group_4__4__Impl ;
    public final void rule__StatementSet__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1112:1: ( rule__StatementSet__Group_4__4__Impl )
            // InternalOpenDictatorDsl.g:1113:2: rule__StatementSet__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4__4__Impl();

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
    // $ANTLR end "rule__StatementSet__Group_4__4"


    // $ANTLR start "rule__StatementSet__Group_4__4__Impl"
    // InternalOpenDictatorDsl.g:1119:1: rule__StatementSet__Group_4__4__Impl : ( '}' ) ;
    public final void rule__StatementSet__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1123:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:1124:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:1124:1: ( '}' )
            // InternalOpenDictatorDsl.g:1125:2: '}'
            {
             before(grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__StatementSet__Group_4__4__Impl"


    // $ANTLR start "rule__StatementSet__Group_4_3__0"
    // InternalOpenDictatorDsl.g:1135:1: rule__StatementSet__Group_4_3__0 : rule__StatementSet__Group_4_3__0__Impl rule__StatementSet__Group_4_3__1 ;
    public final void rule__StatementSet__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1139:1: ( rule__StatementSet__Group_4_3__0__Impl rule__StatementSet__Group_4_3__1 )
            // InternalOpenDictatorDsl.g:1140:2: rule__StatementSet__Group_4_3__0__Impl rule__StatementSet__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__StatementSet__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4_3__1();

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
    // $ANTLR end "rule__StatementSet__Group_4_3__0"


    // $ANTLR start "rule__StatementSet__Group_4_3__0__Impl"
    // InternalOpenDictatorDsl.g:1147:1: rule__StatementSet__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__StatementSet__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1151:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:1152:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:1152:1: ( ',' )
            // InternalOpenDictatorDsl.g:1153:2: ','
            {
             before(grammarAccess.getStatementSetAccess().getCommaKeyword_4_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__StatementSet__Group_4_3__0__Impl"


    // $ANTLR start "rule__StatementSet__Group_4_3__1"
    // InternalOpenDictatorDsl.g:1162:1: rule__StatementSet__Group_4_3__1 : rule__StatementSet__Group_4_3__1__Impl ;
    public final void rule__StatementSet__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1166:1: ( rule__StatementSet__Group_4_3__1__Impl )
            // InternalOpenDictatorDsl.g:1167:2: rule__StatementSet__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__StatementSet__Group_4_3__1"


    // $ANTLR start "rule__StatementSet__Group_4_3__1__Impl"
    // InternalOpenDictatorDsl.g:1173:1: rule__StatementSet__Group_4_3__1__Impl : ( ( rule__StatementSet__StatementsetAssignment_4_3_1 ) ) ;
    public final void rule__StatementSet__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1177:1: ( ( ( rule__StatementSet__StatementsetAssignment_4_3_1 ) ) )
            // InternalOpenDictatorDsl.g:1178:1: ( ( rule__StatementSet__StatementsetAssignment_4_3_1 ) )
            {
            // InternalOpenDictatorDsl.g:1178:1: ( ( rule__StatementSet__StatementsetAssignment_4_3_1 ) )
            // InternalOpenDictatorDsl.g:1179:2: ( rule__StatementSet__StatementsetAssignment_4_3_1 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetAssignment_4_3_1()); 
            // InternalOpenDictatorDsl.g:1180:2: ( rule__StatementSet__StatementsetAssignment_4_3_1 )
            // InternalOpenDictatorDsl.g:1180:3: rule__StatementSet__StatementsetAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementsetAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementsetAssignment_4_3_1()); 

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
    // $ANTLR end "rule__StatementSet__Group_4_3__1__Impl"


    // $ANTLR start "rule__StatementSet__Group_8__0"
    // InternalOpenDictatorDsl.g:1189:1: rule__StatementSet__Group_8__0 : rule__StatementSet__Group_8__0__Impl rule__StatementSet__Group_8__1 ;
    public final void rule__StatementSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1193:1: ( rule__StatementSet__Group_8__0__Impl rule__StatementSet__Group_8__1 )
            // InternalOpenDictatorDsl.g:1194:2: rule__StatementSet__Group_8__0__Impl rule__StatementSet__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__StatementSet__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_8__1();

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
    // $ANTLR end "rule__StatementSet__Group_8__0"


    // $ANTLR start "rule__StatementSet__Group_8__0__Impl"
    // InternalOpenDictatorDsl.g:1201:1: rule__StatementSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__StatementSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1205:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:1206:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:1206:1: ( ',' )
            // InternalOpenDictatorDsl.g:1207:2: ','
            {
             before(grammarAccess.getStatementSetAccess().getCommaKeyword_8_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__StatementSet__Group_8__0__Impl"


    // $ANTLR start "rule__StatementSet__Group_8__1"
    // InternalOpenDictatorDsl.g:1216:1: rule__StatementSet__Group_8__1 : rule__StatementSet__Group_8__1__Impl ;
    public final void rule__StatementSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1220:1: ( rule__StatementSet__Group_8__1__Impl )
            // InternalOpenDictatorDsl.g:1221:2: rule__StatementSet__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_8__1__Impl();

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
    // $ANTLR end "rule__StatementSet__Group_8__1"


    // $ANTLR start "rule__StatementSet__Group_8__1__Impl"
    // InternalOpenDictatorDsl.g:1227:1: rule__StatementSet__Group_8__1__Impl : ( ( rule__StatementSet__StatementAssignment_8_1 ) ) ;
    public final void rule__StatementSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1231:1: ( ( ( rule__StatementSet__StatementAssignment_8_1 ) ) )
            // InternalOpenDictatorDsl.g:1232:1: ( ( rule__StatementSet__StatementAssignment_8_1 ) )
            {
            // InternalOpenDictatorDsl.g:1232:1: ( ( rule__StatementSet__StatementAssignment_8_1 ) )
            // InternalOpenDictatorDsl.g:1233:2: ( rule__StatementSet__StatementAssignment_8_1 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementAssignment_8_1()); 
            // InternalOpenDictatorDsl.g:1234:2: ( rule__StatementSet__StatementAssignment_8_1 )
            // InternalOpenDictatorDsl.g:1234:3: rule__StatementSet__StatementAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementAssignment_8_1()); 

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
    // $ANTLR end "rule__StatementSet__Group_8__1__Impl"


    // $ANTLR start "rule__InputFile__Group__0"
    // InternalOpenDictatorDsl.g:1243:1: rule__InputFile__Group__0 : rule__InputFile__Group__0__Impl rule__InputFile__Group__1 ;
    public final void rule__InputFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1247:1: ( rule__InputFile__Group__0__Impl rule__InputFile__Group__1 )
            // InternalOpenDictatorDsl.g:1248:2: rule__InputFile__Group__0__Impl rule__InputFile__Group__1
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
    // InternalOpenDictatorDsl.g:1255:1: rule__InputFile__Group__0__Impl : ( 'InputFile' ) ;
    public final void rule__InputFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1259:1: ( ( 'InputFile' ) )
            // InternalOpenDictatorDsl.g:1260:1: ( 'InputFile' )
            {
            // InternalOpenDictatorDsl.g:1260:1: ( 'InputFile' )
            // InternalOpenDictatorDsl.g:1261:2: 'InputFile'
            {
             before(grammarAccess.getInputFileAccess().getInputFileKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOpenDictatorDsl.g:1270:1: rule__InputFile__Group__1 : rule__InputFile__Group__1__Impl rule__InputFile__Group__2 ;
    public final void rule__InputFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1274:1: ( rule__InputFile__Group__1__Impl rule__InputFile__Group__2 )
            // InternalOpenDictatorDsl.g:1275:2: rule__InputFile__Group__1__Impl rule__InputFile__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalOpenDictatorDsl.g:1282:1: rule__InputFile__Group__1__Impl : ( '{' ) ;
    public final void rule__InputFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1286:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:1287:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:1287:1: ( '{' )
            // InternalOpenDictatorDsl.g:1288:2: '{'
            {
             before(grammarAccess.getInputFileAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalOpenDictatorDsl.g:1297:1: rule__InputFile__Group__2 : rule__InputFile__Group__2__Impl rule__InputFile__Group__3 ;
    public final void rule__InputFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1301:1: ( rule__InputFile__Group__2__Impl rule__InputFile__Group__3 )
            // InternalOpenDictatorDsl.g:1302:2: rule__InputFile__Group__2__Impl rule__InputFile__Group__3
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
    // InternalOpenDictatorDsl.g:1309:1: rule__InputFile__Group__2__Impl : ( 'fileLocation' ) ;
    public final void rule__InputFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1313:1: ( ( 'fileLocation' ) )
            // InternalOpenDictatorDsl.g:1314:1: ( 'fileLocation' )
            {
            // InternalOpenDictatorDsl.g:1314:1: ( 'fileLocation' )
            // InternalOpenDictatorDsl.g:1315:2: 'fileLocation'
            {
             before(grammarAccess.getInputFileAccess().getFileLocationKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalOpenDictatorDsl.g:1324:1: rule__InputFile__Group__3 : rule__InputFile__Group__3__Impl rule__InputFile__Group__4 ;
    public final void rule__InputFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1328:1: ( rule__InputFile__Group__3__Impl rule__InputFile__Group__4 )
            // InternalOpenDictatorDsl.g:1329:2: rule__InputFile__Group__3__Impl rule__InputFile__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalOpenDictatorDsl.g:1336:1: rule__InputFile__Group__3__Impl : ( ( rule__InputFile__FileLocationAssignment_3 ) ) ;
    public final void rule__InputFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1340:1: ( ( ( rule__InputFile__FileLocationAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:1341:1: ( ( rule__InputFile__FileLocationAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:1341:1: ( ( rule__InputFile__FileLocationAssignment_3 ) )
            // InternalOpenDictatorDsl.g:1342:2: ( rule__InputFile__FileLocationAssignment_3 )
            {
             before(grammarAccess.getInputFileAccess().getFileLocationAssignment_3()); 
            // InternalOpenDictatorDsl.g:1343:2: ( rule__InputFile__FileLocationAssignment_3 )
            // InternalOpenDictatorDsl.g:1343:3: rule__InputFile__FileLocationAssignment_3
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
    // InternalOpenDictatorDsl.g:1351:1: rule__InputFile__Group__4 : rule__InputFile__Group__4__Impl ;
    public final void rule__InputFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1355:1: ( rule__InputFile__Group__4__Impl )
            // InternalOpenDictatorDsl.g:1356:2: rule__InputFile__Group__4__Impl
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
    // InternalOpenDictatorDsl.g:1362:1: rule__InputFile__Group__4__Impl : ( '}' ) ;
    public final void rule__InputFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1366:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:1367:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:1367:1: ( '}' )
            // InternalOpenDictatorDsl.g:1368:2: '}'
            {
             before(grammarAccess.getInputFileAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__Statement__Group__0"
    // InternalOpenDictatorDsl.g:1378:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1382:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalOpenDictatorDsl.g:1383:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalOpenDictatorDsl.g:1390:1: rule__Statement__Group__0__Impl : ( 'Statement' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1394:1: ( ( 'Statement' ) )
            // InternalOpenDictatorDsl.g:1395:1: ( 'Statement' )
            {
            // InternalOpenDictatorDsl.g:1395:1: ( 'Statement' )
            // InternalOpenDictatorDsl.g:1396:2: 'Statement'
            {
             before(grammarAccess.getStatementAccess().getStatementKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getStatementKeyword_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalOpenDictatorDsl.g:1405:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1409:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalOpenDictatorDsl.g:1410:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__2();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalOpenDictatorDsl.g:1417:1: rule__Statement__Group__1__Impl : ( '{' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1421:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:1422:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:1422:1: ( '{' )
            // InternalOpenDictatorDsl.g:1423:2: '{'
            {
             before(grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // InternalOpenDictatorDsl.g:1432:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1436:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // InternalOpenDictatorDsl.g:1437:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__3();

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
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // InternalOpenDictatorDsl.g:1444:1: rule__Statement__Group__2__Impl : ( 'evaluationOperator' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1448:1: ( ( 'evaluationOperator' ) )
            // InternalOpenDictatorDsl.g:1449:1: ( 'evaluationOperator' )
            {
            // InternalOpenDictatorDsl.g:1449:1: ( 'evaluationOperator' )
            // InternalOpenDictatorDsl.g:1450:2: 'evaluationOperator'
            {
             before(grammarAccess.getStatementAccess().getEvaluationOperatorKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getEvaluationOperatorKeyword_2()); 

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
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__3"
    // InternalOpenDictatorDsl.g:1459:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl rule__Statement__Group__4 ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1463:1: ( rule__Statement__Group__3__Impl rule__Statement__Group__4 )
            // InternalOpenDictatorDsl.g:1464:2: rule__Statement__Group__3__Impl rule__Statement__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__4();

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
    // $ANTLR end "rule__Statement__Group__3"


    // $ANTLR start "rule__Statement__Group__3__Impl"
    // InternalOpenDictatorDsl.g:1471:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__EvaluationOperatorAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1475:1: ( ( ( rule__Statement__EvaluationOperatorAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:1476:1: ( ( rule__Statement__EvaluationOperatorAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:1476:1: ( ( rule__Statement__EvaluationOperatorAssignment_3 ) )
            // InternalOpenDictatorDsl.g:1477:2: ( rule__Statement__EvaluationOperatorAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getEvaluationOperatorAssignment_3()); 
            // InternalOpenDictatorDsl.g:1478:2: ( rule__Statement__EvaluationOperatorAssignment_3 )
            // InternalOpenDictatorDsl.g:1478:3: rule__Statement__EvaluationOperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Statement__EvaluationOperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getEvaluationOperatorAssignment_3()); 

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
    // $ANTLR end "rule__Statement__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__4"
    // InternalOpenDictatorDsl.g:1486:1: rule__Statement__Group__4 : rule__Statement__Group__4__Impl rule__Statement__Group__5 ;
    public final void rule__Statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1490:1: ( rule__Statement__Group__4__Impl rule__Statement__Group__5 )
            // InternalOpenDictatorDsl.g:1491:2: rule__Statement__Group__4__Impl rule__Statement__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__5();

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
    // $ANTLR end "rule__Statement__Group__4"


    // $ANTLR start "rule__Statement__Group__4__Impl"
    // InternalOpenDictatorDsl.g:1498:1: rule__Statement__Group__4__Impl : ( ( rule__Statement__Group_4__0 )? ) ;
    public final void rule__Statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1502:1: ( ( ( rule__Statement__Group_4__0 )? ) )
            // InternalOpenDictatorDsl.g:1503:1: ( ( rule__Statement__Group_4__0 )? )
            {
            // InternalOpenDictatorDsl.g:1503:1: ( ( rule__Statement__Group_4__0 )? )
            // InternalOpenDictatorDsl.g:1504:2: ( rule__Statement__Group_4__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_4()); 
            // InternalOpenDictatorDsl.g:1505:2: ( rule__Statement__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOpenDictatorDsl.g:1505:3: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Statement__Group__4__Impl"


    // $ANTLR start "rule__Statement__Group__5"
    // InternalOpenDictatorDsl.g:1513:1: rule__Statement__Group__5 : rule__Statement__Group__5__Impl rule__Statement__Group__6 ;
    public final void rule__Statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1517:1: ( rule__Statement__Group__5__Impl rule__Statement__Group__6 )
            // InternalOpenDictatorDsl.g:1518:2: rule__Statement__Group__5__Impl rule__Statement__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Statement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__6();

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
    // $ANTLR end "rule__Statement__Group__5"


    // $ANTLR start "rule__Statement__Group__5__Impl"
    // InternalOpenDictatorDsl.g:1525:1: rule__Statement__Group__5__Impl : ( 'jsonquery' ) ;
    public final void rule__Statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1529:1: ( ( 'jsonquery' ) )
            // InternalOpenDictatorDsl.g:1530:1: ( 'jsonquery' )
            {
            // InternalOpenDictatorDsl.g:1530:1: ( 'jsonquery' )
            // InternalOpenDictatorDsl.g:1531:2: 'jsonquery'
            {
             before(grammarAccess.getStatementAccess().getJsonqueryKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getJsonqueryKeyword_5()); 

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
    // $ANTLR end "rule__Statement__Group__5__Impl"


    // $ANTLR start "rule__Statement__Group__6"
    // InternalOpenDictatorDsl.g:1540:1: rule__Statement__Group__6 : rule__Statement__Group__6__Impl rule__Statement__Group__7 ;
    public final void rule__Statement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1544:1: ( rule__Statement__Group__6__Impl rule__Statement__Group__7 )
            // InternalOpenDictatorDsl.g:1545:2: rule__Statement__Group__6__Impl rule__Statement__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Statement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__7();

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
    // $ANTLR end "rule__Statement__Group__6"


    // $ANTLR start "rule__Statement__Group__6__Impl"
    // InternalOpenDictatorDsl.g:1552:1: rule__Statement__Group__6__Impl : ( ( rule__Statement__JsonqueryAssignment_6 ) ) ;
    public final void rule__Statement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1556:1: ( ( ( rule__Statement__JsonqueryAssignment_6 ) ) )
            // InternalOpenDictatorDsl.g:1557:1: ( ( rule__Statement__JsonqueryAssignment_6 ) )
            {
            // InternalOpenDictatorDsl.g:1557:1: ( ( rule__Statement__JsonqueryAssignment_6 ) )
            // InternalOpenDictatorDsl.g:1558:2: ( rule__Statement__JsonqueryAssignment_6 )
            {
             before(grammarAccess.getStatementAccess().getJsonqueryAssignment_6()); 
            // InternalOpenDictatorDsl.g:1559:2: ( rule__Statement__JsonqueryAssignment_6 )
            // InternalOpenDictatorDsl.g:1559:3: rule__Statement__JsonqueryAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Statement__JsonqueryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getJsonqueryAssignment_6()); 

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
    // $ANTLR end "rule__Statement__Group__6__Impl"


    // $ANTLR start "rule__Statement__Group__7"
    // InternalOpenDictatorDsl.g:1567:1: rule__Statement__Group__7 : rule__Statement__Group__7__Impl rule__Statement__Group__8 ;
    public final void rule__Statement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1571:1: ( rule__Statement__Group__7__Impl rule__Statement__Group__8 )
            // InternalOpenDictatorDsl.g:1572:2: rule__Statement__Group__7__Impl rule__Statement__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Statement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__8();

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
    // $ANTLR end "rule__Statement__Group__7"


    // $ANTLR start "rule__Statement__Group__7__Impl"
    // InternalOpenDictatorDsl.g:1579:1: rule__Statement__Group__7__Impl : ( 'value' ) ;
    public final void rule__Statement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1583:1: ( ( 'value' ) )
            // InternalOpenDictatorDsl.g:1584:1: ( 'value' )
            {
            // InternalOpenDictatorDsl.g:1584:1: ( 'value' )
            // InternalOpenDictatorDsl.g:1585:2: 'value'
            {
             before(grammarAccess.getStatementAccess().getValueKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getValueKeyword_7()); 

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
    // $ANTLR end "rule__Statement__Group__7__Impl"


    // $ANTLR start "rule__Statement__Group__8"
    // InternalOpenDictatorDsl.g:1594:1: rule__Statement__Group__8 : rule__Statement__Group__8__Impl rule__Statement__Group__9 ;
    public final void rule__Statement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1598:1: ( rule__Statement__Group__8__Impl rule__Statement__Group__9 )
            // InternalOpenDictatorDsl.g:1599:2: rule__Statement__Group__8__Impl rule__Statement__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Statement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__9();

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
    // $ANTLR end "rule__Statement__Group__8"


    // $ANTLR start "rule__Statement__Group__8__Impl"
    // InternalOpenDictatorDsl.g:1606:1: rule__Statement__Group__8__Impl : ( ( rule__Statement__ValueAssignment_8 ) ) ;
    public final void rule__Statement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1610:1: ( ( ( rule__Statement__ValueAssignment_8 ) ) )
            // InternalOpenDictatorDsl.g:1611:1: ( ( rule__Statement__ValueAssignment_8 ) )
            {
            // InternalOpenDictatorDsl.g:1611:1: ( ( rule__Statement__ValueAssignment_8 ) )
            // InternalOpenDictatorDsl.g:1612:2: ( rule__Statement__ValueAssignment_8 )
            {
             before(grammarAccess.getStatementAccess().getValueAssignment_8()); 
            // InternalOpenDictatorDsl.g:1613:2: ( rule__Statement__ValueAssignment_8 )
            // InternalOpenDictatorDsl.g:1613:3: rule__Statement__ValueAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ValueAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getValueAssignment_8()); 

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
    // $ANTLR end "rule__Statement__Group__8__Impl"


    // $ANTLR start "rule__Statement__Group__9"
    // InternalOpenDictatorDsl.g:1621:1: rule__Statement__Group__9 : rule__Statement__Group__9__Impl ;
    public final void rule__Statement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1625:1: ( rule__Statement__Group__9__Impl )
            // InternalOpenDictatorDsl.g:1626:2: rule__Statement__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__9__Impl();

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
    // $ANTLR end "rule__Statement__Group__9"


    // $ANTLR start "rule__Statement__Group__9__Impl"
    // InternalOpenDictatorDsl.g:1632:1: rule__Statement__Group__9__Impl : ( '}' ) ;
    public final void rule__Statement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1636:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:1637:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:1637:1: ( '}' )
            // InternalOpenDictatorDsl.g:1638:2: '}'
            {
             before(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Statement__Group__9__Impl"


    // $ANTLR start "rule__Statement__Group_4__0"
    // InternalOpenDictatorDsl.g:1648:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1652:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalOpenDictatorDsl.g:1653:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1();

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
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // InternalOpenDictatorDsl.g:1660:1: rule__Statement__Group_4__0__Impl : ( 'prefixEvaluationOperator' ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1664:1: ( ( 'prefixEvaluationOperator' ) )
            // InternalOpenDictatorDsl.g:1665:1: ( 'prefixEvaluationOperator' )
            {
            // InternalOpenDictatorDsl.g:1665:1: ( 'prefixEvaluationOperator' )
            // InternalOpenDictatorDsl.g:1666:2: 'prefixEvaluationOperator'
            {
             before(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorKeyword_4_0()); 

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
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // InternalOpenDictatorDsl.g:1675:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1679:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // InternalOpenDictatorDsl.g:1680:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__2();

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
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // InternalOpenDictatorDsl.g:1687:1: rule__Statement__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1691:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:1692:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:1692:1: ( '{' )
            // InternalOpenDictatorDsl.g:1693:2: '{'
            {
             before(grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_4__2"
    // InternalOpenDictatorDsl.g:1702:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1706:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // InternalOpenDictatorDsl.g:1707:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__3();

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
    // $ANTLR end "rule__Statement__Group_4__2"


    // $ANTLR start "rule__Statement__Group_4__2__Impl"
    // InternalOpenDictatorDsl.g:1714:1: rule__Statement__Group_4__2__Impl : ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_2 ) ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1718:1: ( ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_2 ) ) )
            // InternalOpenDictatorDsl.g:1719:1: ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_2 ) )
            {
            // InternalOpenDictatorDsl.g:1719:1: ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_2 ) )
            // InternalOpenDictatorDsl.g:1720:2: ( rule__Statement__PrefixEvaluationOperatorAssignment_4_2 )
            {
             before(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorAssignment_4_2()); 
            // InternalOpenDictatorDsl.g:1721:2: ( rule__Statement__PrefixEvaluationOperatorAssignment_4_2 )
            // InternalOpenDictatorDsl.g:1721:3: rule__Statement__PrefixEvaluationOperatorAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__PrefixEvaluationOperatorAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorAssignment_4_2()); 

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
    // $ANTLR end "rule__Statement__Group_4__2__Impl"


    // $ANTLR start "rule__Statement__Group_4__3"
    // InternalOpenDictatorDsl.g:1729:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1733:1: ( rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 )
            // InternalOpenDictatorDsl.g:1734:2: rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__4();

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
    // $ANTLR end "rule__Statement__Group_4__3"


    // $ANTLR start "rule__Statement__Group_4__3__Impl"
    // InternalOpenDictatorDsl.g:1741:1: rule__Statement__Group_4__3__Impl : ( ( rule__Statement__Group_4_3__0 )* ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1745:1: ( ( ( rule__Statement__Group_4_3__0 )* ) )
            // InternalOpenDictatorDsl.g:1746:1: ( ( rule__Statement__Group_4_3__0 )* )
            {
            // InternalOpenDictatorDsl.g:1746:1: ( ( rule__Statement__Group_4_3__0 )* )
            // InternalOpenDictatorDsl.g:1747:2: ( rule__Statement__Group_4_3__0 )*
            {
             before(grammarAccess.getStatementAccess().getGroup_4_3()); 
            // InternalOpenDictatorDsl.g:1748:2: ( rule__Statement__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:1748:3: rule__Statement__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Statement__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStatementAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Statement__Group_4__3__Impl"


    // $ANTLR start "rule__Statement__Group_4__4"
    // InternalOpenDictatorDsl.g:1756:1: rule__Statement__Group_4__4 : rule__Statement__Group_4__4__Impl ;
    public final void rule__Statement__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1760:1: ( rule__Statement__Group_4__4__Impl )
            // InternalOpenDictatorDsl.g:1761:2: rule__Statement__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__4__Impl();

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
    // $ANTLR end "rule__Statement__Group_4__4"


    // $ANTLR start "rule__Statement__Group_4__4__Impl"
    // InternalOpenDictatorDsl.g:1767:1: rule__Statement__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Statement__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1771:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:1772:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:1772:1: ( '}' )
            // InternalOpenDictatorDsl.g:1773:2: '}'
            {
             before(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Statement__Group_4__4__Impl"


    // $ANTLR start "rule__Statement__Group_4_3__0"
    // InternalOpenDictatorDsl.g:1783:1: rule__Statement__Group_4_3__0 : rule__Statement__Group_4_3__0__Impl rule__Statement__Group_4_3__1 ;
    public final void rule__Statement__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1787:1: ( rule__Statement__Group_4_3__0__Impl rule__Statement__Group_4_3__1 )
            // InternalOpenDictatorDsl.g:1788:2: rule__Statement__Group_4_3__0__Impl rule__Statement__Group_4_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Statement__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4_3__1();

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
    // $ANTLR end "rule__Statement__Group_4_3__0"


    // $ANTLR start "rule__Statement__Group_4_3__0__Impl"
    // InternalOpenDictatorDsl.g:1795:1: rule__Statement__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Statement__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1799:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:1800:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:1800:1: ( ',' )
            // InternalOpenDictatorDsl.g:1801:2: ','
            {
             before(grammarAccess.getStatementAccess().getCommaKeyword_4_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Statement__Group_4_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_4_3__1"
    // InternalOpenDictatorDsl.g:1810:1: rule__Statement__Group_4_3__1 : rule__Statement__Group_4_3__1__Impl ;
    public final void rule__Statement__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1814:1: ( rule__Statement__Group_4_3__1__Impl )
            // InternalOpenDictatorDsl.g:1815:2: rule__Statement__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_4_3__1"


    // $ANTLR start "rule__Statement__Group_4_3__1__Impl"
    // InternalOpenDictatorDsl.g:1821:1: rule__Statement__Group_4_3__1__Impl : ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1 ) ) ;
    public final void rule__Statement__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1825:1: ( ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1 ) ) )
            // InternalOpenDictatorDsl.g:1826:1: ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1 ) )
            {
            // InternalOpenDictatorDsl.g:1826:1: ( ( rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1 ) )
            // InternalOpenDictatorDsl.g:1827:2: ( rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1 )
            {
             before(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorAssignment_4_3_1()); 
            // InternalOpenDictatorDsl.g:1828:2: ( rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1 )
            // InternalOpenDictatorDsl.g:1828:3: rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Statement__Group_4_3__1__Impl"


    // $ANTLR start "rule__JsonQuery__Group__0"
    // InternalOpenDictatorDsl.g:1837:1: rule__JsonQuery__Group__0 : rule__JsonQuery__Group__0__Impl rule__JsonQuery__Group__1 ;
    public final void rule__JsonQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1841:1: ( rule__JsonQuery__Group__0__Impl rule__JsonQuery__Group__1 )
            // InternalOpenDictatorDsl.g:1842:2: rule__JsonQuery__Group__0__Impl rule__JsonQuery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JsonQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonQuery__Group__1();

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
    // $ANTLR end "rule__JsonQuery__Group__0"


    // $ANTLR start "rule__JsonQuery__Group__0__Impl"
    // InternalOpenDictatorDsl.g:1849:1: rule__JsonQuery__Group__0__Impl : ( 'JsonQuery' ) ;
    public final void rule__JsonQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1853:1: ( ( 'JsonQuery' ) )
            // InternalOpenDictatorDsl.g:1854:1: ( 'JsonQuery' )
            {
            // InternalOpenDictatorDsl.g:1854:1: ( 'JsonQuery' )
            // InternalOpenDictatorDsl.g:1855:2: 'JsonQuery'
            {
             before(grammarAccess.getJsonQueryAccess().getJsonQueryKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getJsonQueryAccess().getJsonQueryKeyword_0()); 

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
    // $ANTLR end "rule__JsonQuery__Group__0__Impl"


    // $ANTLR start "rule__JsonQuery__Group__1"
    // InternalOpenDictatorDsl.g:1864:1: rule__JsonQuery__Group__1 : rule__JsonQuery__Group__1__Impl rule__JsonQuery__Group__2 ;
    public final void rule__JsonQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1868:1: ( rule__JsonQuery__Group__1__Impl rule__JsonQuery__Group__2 )
            // InternalOpenDictatorDsl.g:1869:2: rule__JsonQuery__Group__1__Impl rule__JsonQuery__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__JsonQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonQuery__Group__2();

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
    // $ANTLR end "rule__JsonQuery__Group__1"


    // $ANTLR start "rule__JsonQuery__Group__1__Impl"
    // InternalOpenDictatorDsl.g:1876:1: rule__JsonQuery__Group__1__Impl : ( '{' ) ;
    public final void rule__JsonQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1880:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:1881:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:1881:1: ( '{' )
            // InternalOpenDictatorDsl.g:1882:2: '{'
            {
             before(grammarAccess.getJsonQueryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJsonQueryAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__JsonQuery__Group__1__Impl"


    // $ANTLR start "rule__JsonQuery__Group__2"
    // InternalOpenDictatorDsl.g:1891:1: rule__JsonQuery__Group__2 : rule__JsonQuery__Group__2__Impl rule__JsonQuery__Group__3 ;
    public final void rule__JsonQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1895:1: ( rule__JsonQuery__Group__2__Impl rule__JsonQuery__Group__3 )
            // InternalOpenDictatorDsl.g:1896:2: rule__JsonQuery__Group__2__Impl rule__JsonQuery__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__JsonQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonQuery__Group__3();

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
    // $ANTLR end "rule__JsonQuery__Group__2"


    // $ANTLR start "rule__JsonQuery__Group__2__Impl"
    // InternalOpenDictatorDsl.g:1903:1: rule__JsonQuery__Group__2__Impl : ( 'queryString' ) ;
    public final void rule__JsonQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1907:1: ( ( 'queryString' ) )
            // InternalOpenDictatorDsl.g:1908:1: ( 'queryString' )
            {
            // InternalOpenDictatorDsl.g:1908:1: ( 'queryString' )
            // InternalOpenDictatorDsl.g:1909:2: 'queryString'
            {
             before(grammarAccess.getJsonQueryAccess().getQueryStringKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getJsonQueryAccess().getQueryStringKeyword_2()); 

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
    // $ANTLR end "rule__JsonQuery__Group__2__Impl"


    // $ANTLR start "rule__JsonQuery__Group__3"
    // InternalOpenDictatorDsl.g:1918:1: rule__JsonQuery__Group__3 : rule__JsonQuery__Group__3__Impl rule__JsonQuery__Group__4 ;
    public final void rule__JsonQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1922:1: ( rule__JsonQuery__Group__3__Impl rule__JsonQuery__Group__4 )
            // InternalOpenDictatorDsl.g:1923:2: rule__JsonQuery__Group__3__Impl rule__JsonQuery__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__JsonQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonQuery__Group__4();

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
    // $ANTLR end "rule__JsonQuery__Group__3"


    // $ANTLR start "rule__JsonQuery__Group__3__Impl"
    // InternalOpenDictatorDsl.g:1930:1: rule__JsonQuery__Group__3__Impl : ( ( rule__JsonQuery__QueryStringAssignment_3 ) ) ;
    public final void rule__JsonQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1934:1: ( ( ( rule__JsonQuery__QueryStringAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:1935:1: ( ( rule__JsonQuery__QueryStringAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:1935:1: ( ( rule__JsonQuery__QueryStringAssignment_3 ) )
            // InternalOpenDictatorDsl.g:1936:2: ( rule__JsonQuery__QueryStringAssignment_3 )
            {
             before(grammarAccess.getJsonQueryAccess().getQueryStringAssignment_3()); 
            // InternalOpenDictatorDsl.g:1937:2: ( rule__JsonQuery__QueryStringAssignment_3 )
            // InternalOpenDictatorDsl.g:1937:3: rule__JsonQuery__QueryStringAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__JsonQuery__QueryStringAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJsonQueryAccess().getQueryStringAssignment_3()); 

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
    // $ANTLR end "rule__JsonQuery__Group__3__Impl"


    // $ANTLR start "rule__JsonQuery__Group__4"
    // InternalOpenDictatorDsl.g:1945:1: rule__JsonQuery__Group__4 : rule__JsonQuery__Group__4__Impl ;
    public final void rule__JsonQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1949:1: ( rule__JsonQuery__Group__4__Impl )
            // InternalOpenDictatorDsl.g:1950:2: rule__JsonQuery__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonQuery__Group__4__Impl();

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
    // $ANTLR end "rule__JsonQuery__Group__4"


    // $ANTLR start "rule__JsonQuery__Group__4__Impl"
    // InternalOpenDictatorDsl.g:1956:1: rule__JsonQuery__Group__4__Impl : ( '}' ) ;
    public final void rule__JsonQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1960:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:1961:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:1961:1: ( '}' )
            // InternalOpenDictatorDsl.g:1962:2: '}'
            {
             before(grammarAccess.getJsonQueryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJsonQueryAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__JsonQuery__Group__4__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalOpenDictatorDsl.g:1972:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1976:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalOpenDictatorDsl.g:1977:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

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
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalOpenDictatorDsl.g:1984:1: rule__Value__Group__0__Impl : ( 'Value' ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1988:1: ( ( 'Value' ) )
            // InternalOpenDictatorDsl.g:1989:1: ( 'Value' )
            {
            // InternalOpenDictatorDsl.g:1989:1: ( 'Value' )
            // InternalOpenDictatorDsl.g:1990:2: 'Value'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueKeyword_0()); 

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
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalOpenDictatorDsl.g:1999:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2003:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalOpenDictatorDsl.g:2004:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__2();

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
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalOpenDictatorDsl.g:2011:1: rule__Value__Group__1__Impl : ( '{' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2015:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:2016:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:2016:1: ( '{' )
            // InternalOpenDictatorDsl.g:2017:2: '{'
            {
             before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // InternalOpenDictatorDsl.g:2026:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2030:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalOpenDictatorDsl.g:2031:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__3();

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
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // InternalOpenDictatorDsl.g:2038:1: rule__Value__Group__2__Impl : ( 'type' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2042:1: ( ( 'type' ) )
            // InternalOpenDictatorDsl.g:2043:1: ( 'type' )
            {
            // InternalOpenDictatorDsl.g:2043:1: ( 'type' )
            // InternalOpenDictatorDsl.g:2044:2: 'type'
            {
             before(grammarAccess.getValueAccess().getTypeKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__3"
    // InternalOpenDictatorDsl.g:2053:1: rule__Value__Group__3 : rule__Value__Group__3__Impl rule__Value__Group__4 ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2057:1: ( rule__Value__Group__3__Impl rule__Value__Group__4 )
            // InternalOpenDictatorDsl.g:2058:2: rule__Value__Group__3__Impl rule__Value__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Value__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__4();

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
    // $ANTLR end "rule__Value__Group__3"


    // $ANTLR start "rule__Value__Group__3__Impl"
    // InternalOpenDictatorDsl.g:2065:1: rule__Value__Group__3__Impl : ( ( rule__Value__TypeAssignment_3 ) ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2069:1: ( ( ( rule__Value__TypeAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:2070:1: ( ( rule__Value__TypeAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:2070:1: ( ( rule__Value__TypeAssignment_3 ) )
            // InternalOpenDictatorDsl.g:2071:2: ( rule__Value__TypeAssignment_3 )
            {
             before(grammarAccess.getValueAccess().getTypeAssignment_3()); 
            // InternalOpenDictatorDsl.g:2072:2: ( rule__Value__TypeAssignment_3 )
            // InternalOpenDictatorDsl.g:2072:3: rule__Value__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Value__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Value__Group__3__Impl"


    // $ANTLR start "rule__Value__Group__4"
    // InternalOpenDictatorDsl.g:2080:1: rule__Value__Group__4 : rule__Value__Group__4__Impl rule__Value__Group__5 ;
    public final void rule__Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2084:1: ( rule__Value__Group__4__Impl rule__Value__Group__5 )
            // InternalOpenDictatorDsl.g:2085:2: rule__Value__Group__4__Impl rule__Value__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__5();

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
    // $ANTLR end "rule__Value__Group__4"


    // $ANTLR start "rule__Value__Group__4__Impl"
    // InternalOpenDictatorDsl.g:2092:1: rule__Value__Group__4__Impl : ( 'value' ) ;
    public final void rule__Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2096:1: ( ( 'value' ) )
            // InternalOpenDictatorDsl.g:2097:1: ( 'value' )
            {
            // InternalOpenDictatorDsl.g:2097:1: ( 'value' )
            // InternalOpenDictatorDsl.g:2098:2: 'value'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueKeyword_4()); 

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
    // $ANTLR end "rule__Value__Group__4__Impl"


    // $ANTLR start "rule__Value__Group__5"
    // InternalOpenDictatorDsl.g:2107:1: rule__Value__Group__5 : rule__Value__Group__5__Impl rule__Value__Group__6 ;
    public final void rule__Value__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2111:1: ( rule__Value__Group__5__Impl rule__Value__Group__6 )
            // InternalOpenDictatorDsl.g:2112:2: rule__Value__Group__5__Impl rule__Value__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Value__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__6();

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
    // $ANTLR end "rule__Value__Group__5"


    // $ANTLR start "rule__Value__Group__5__Impl"
    // InternalOpenDictatorDsl.g:2119:1: rule__Value__Group__5__Impl : ( ( rule__Value__ValueAssignment_5 ) ) ;
    public final void rule__Value__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2123:1: ( ( ( rule__Value__ValueAssignment_5 ) ) )
            // InternalOpenDictatorDsl.g:2124:1: ( ( rule__Value__ValueAssignment_5 ) )
            {
            // InternalOpenDictatorDsl.g:2124:1: ( ( rule__Value__ValueAssignment_5 ) )
            // InternalOpenDictatorDsl.g:2125:2: ( rule__Value__ValueAssignment_5 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_5()); 
            // InternalOpenDictatorDsl.g:2126:2: ( rule__Value__ValueAssignment_5 )
            // InternalOpenDictatorDsl.g:2126:3: rule__Value__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__Value__Group__5__Impl"


    // $ANTLR start "rule__Value__Group__6"
    // InternalOpenDictatorDsl.g:2134:1: rule__Value__Group__6 : rule__Value__Group__6__Impl ;
    public final void rule__Value__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2138:1: ( rule__Value__Group__6__Impl )
            // InternalOpenDictatorDsl.g:2139:2: rule__Value__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__6__Impl();

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
    // $ANTLR end "rule__Value__Group__6"


    // $ANTLR start "rule__Value__Group__6__Impl"
    // InternalOpenDictatorDsl.g:2145:1: rule__Value__Group__6__Impl : ( '}' ) ;
    public final void rule__Value__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2149:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:2150:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:2150:1: ( '}' )
            // InternalOpenDictatorDsl.g:2151:2: '}'
            {
             before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Value__Group__6__Impl"


    // $ANTLR start "rule__Policy__FailureMessageAssignment_3"
    // InternalOpenDictatorDsl.g:2161:1: rule__Policy__FailureMessageAssignment_3 : ( ruleEString ) ;
    public final void rule__Policy__FailureMessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2165:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:2166:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:2166:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:2167:3: ruleEString
            {
             before(grammarAccess.getPolicyAccess().getFailureMessageEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getFailureMessageEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Policy__FailureMessageAssignment_3"


    // $ANTLR start "rule__Policy__SuccessMessageAssignment_5"
    // InternalOpenDictatorDsl.g:2176:1: rule__Policy__SuccessMessageAssignment_5 : ( ruleEString ) ;
    public final void rule__Policy__SuccessMessageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2180:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:2181:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:2181:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:2182:3: ruleEString
            {
             before(grammarAccess.getPolicyAccess().getSuccessMessageEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getSuccessMessageEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Policy__SuccessMessageAssignment_5"


    // $ANTLR start "rule__Policy__IdAssignment_7"
    // InternalOpenDictatorDsl.g:2191:1: rule__Policy__IdAssignment_7 : ( ruleEString ) ;
    public final void rule__Policy__IdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2195:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:2196:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:2196:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:2197:3: ruleEString
            {
             before(grammarAccess.getPolicyAccess().getIdEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getIdEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Policy__IdAssignment_7"


    // $ANTLR start "rule__Policy__StatementsetAssignment_9"
    // InternalOpenDictatorDsl.g:2206:1: rule__Policy__StatementsetAssignment_9 : ( ruleStatementSet ) ;
    public final void rule__Policy__StatementsetAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2210:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:2211:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:2211:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:2212:3: ruleStatementSet
            {
             before(grammarAccess.getPolicyAccess().getStatementsetStatementSetParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getStatementsetStatementSetParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Policy__StatementsetAssignment_9"


    // $ANTLR start "rule__Policy__InputfileAssignment_11"
    // InternalOpenDictatorDsl.g:2221:1: rule__Policy__InputfileAssignment_11 : ( ruleInputFile ) ;
    public final void rule__Policy__InputfileAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2225:1: ( ( ruleInputFile ) )
            // InternalOpenDictatorDsl.g:2226:2: ( ruleInputFile )
            {
            // InternalOpenDictatorDsl.g:2226:2: ( ruleInputFile )
            // InternalOpenDictatorDsl.g:2227:3: ruleInputFile
            {
             before(grammarAccess.getPolicyAccess().getInputfileInputFileParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFile();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getInputfileInputFileParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Policy__InputfileAssignment_11"


    // $ANTLR start "rule__StatementSet__StatementOperatorAssignment_3"
    // InternalOpenDictatorDsl.g:2236:1: rule__StatementSet__StatementOperatorAssignment_3 : ( ruleStatementOperator ) ;
    public final void rule__StatementSet__StatementOperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2240:1: ( ( ruleStatementOperator ) )
            // InternalOpenDictatorDsl.g:2241:2: ( ruleStatementOperator )
            {
            // InternalOpenDictatorDsl.g:2241:2: ( ruleStatementOperator )
            // InternalOpenDictatorDsl.g:2242:3: ruleStatementOperator
            {
             before(grammarAccess.getStatementSetAccess().getStatementOperatorStatementOperatorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementOperator();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementOperatorStatementOperatorEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementOperatorAssignment_3"


    // $ANTLR start "rule__StatementSet__StatementsetAssignment_4_2"
    // InternalOpenDictatorDsl.g:2251:1: rule__StatementSet__StatementsetAssignment_4_2 : ( ruleStatementSet ) ;
    public final void rule__StatementSet__StatementsetAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2255:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:2256:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:2256:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:2257:3: ruleStatementSet
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementsetAssignment_4_2"


    // $ANTLR start "rule__StatementSet__StatementsetAssignment_4_3_1"
    // InternalOpenDictatorDsl.g:2266:1: rule__StatementSet__StatementsetAssignment_4_3_1 : ( ruleStatementSet ) ;
    public final void rule__StatementSet__StatementsetAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2270:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:2271:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:2271:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:2272:3: ruleStatementSet
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementsetAssignment_4_3_1"


    // $ANTLR start "rule__StatementSet__StatementAssignment_7"
    // InternalOpenDictatorDsl.g:2281:1: rule__StatementSet__StatementAssignment_7 : ( ruleStatement ) ;
    public final void rule__StatementSet__StatementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2285:1: ( ( ruleStatement ) )
            // InternalOpenDictatorDsl.g:2286:2: ( ruleStatement )
            {
            // InternalOpenDictatorDsl.g:2286:2: ( ruleStatement )
            // InternalOpenDictatorDsl.g:2287:3: ruleStatement
            {
             before(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementAssignment_7"


    // $ANTLR start "rule__StatementSet__StatementAssignment_8_1"
    // InternalOpenDictatorDsl.g:2296:1: rule__StatementSet__StatementAssignment_8_1 : ( ruleStatement ) ;
    public final void rule__StatementSet__StatementAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2300:1: ( ( ruleStatement ) )
            // InternalOpenDictatorDsl.g:2301:2: ( ruleStatement )
            {
            // InternalOpenDictatorDsl.g:2301:2: ( ruleStatement )
            // InternalOpenDictatorDsl.g:2302:3: ruleStatement
            {
             before(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementAssignment_8_1"


    // $ANTLR start "rule__InputFile__FileLocationAssignment_3"
    // InternalOpenDictatorDsl.g:2311:1: rule__InputFile__FileLocationAssignment_3 : ( ruleEString ) ;
    public final void rule__InputFile__FileLocationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2315:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:2316:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:2316:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:2317:3: ruleEString
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


    // $ANTLR start "rule__Statement__EvaluationOperatorAssignment_3"
    // InternalOpenDictatorDsl.g:2326:1: rule__Statement__EvaluationOperatorAssignment_3 : ( ruleEvaluationOperator ) ;
    public final void rule__Statement__EvaluationOperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2330:1: ( ( ruleEvaluationOperator ) )
            // InternalOpenDictatorDsl.g:2331:2: ( ruleEvaluationOperator )
            {
            // InternalOpenDictatorDsl.g:2331:2: ( ruleEvaluationOperator )
            // InternalOpenDictatorDsl.g:2332:3: ruleEvaluationOperator
            {
             before(grammarAccess.getStatementAccess().getEvaluationOperatorEvaluationOperatorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationOperator();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getEvaluationOperatorEvaluationOperatorEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Statement__EvaluationOperatorAssignment_3"


    // $ANTLR start "rule__Statement__PrefixEvaluationOperatorAssignment_4_2"
    // InternalOpenDictatorDsl.g:2341:1: rule__Statement__PrefixEvaluationOperatorAssignment_4_2 : ( ruleEvaluationOperator ) ;
    public final void rule__Statement__PrefixEvaluationOperatorAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2345:1: ( ( ruleEvaluationOperator ) )
            // InternalOpenDictatorDsl.g:2346:2: ( ruleEvaluationOperator )
            {
            // InternalOpenDictatorDsl.g:2346:2: ( ruleEvaluationOperator )
            // InternalOpenDictatorDsl.g:2347:3: ruleEvaluationOperator
            {
             before(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationOperator();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Statement__PrefixEvaluationOperatorAssignment_4_2"


    // $ANTLR start "rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1"
    // InternalOpenDictatorDsl.g:2356:1: rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1 : ( ruleEvaluationOperator ) ;
    public final void rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2360:1: ( ( ruleEvaluationOperator ) )
            // InternalOpenDictatorDsl.g:2361:2: ( ruleEvaluationOperator )
            {
            // InternalOpenDictatorDsl.g:2361:2: ( ruleEvaluationOperator )
            // InternalOpenDictatorDsl.g:2362:3: ruleEvaluationOperator
            {
             before(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationOperator();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Statement__PrefixEvaluationOperatorAssignment_4_3_1"


    // $ANTLR start "rule__Statement__JsonqueryAssignment_6"
    // InternalOpenDictatorDsl.g:2371:1: rule__Statement__JsonqueryAssignment_6 : ( ruleJsonQuery ) ;
    public final void rule__Statement__JsonqueryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2375:1: ( ( ruleJsonQuery ) )
            // InternalOpenDictatorDsl.g:2376:2: ( ruleJsonQuery )
            {
            // InternalOpenDictatorDsl.g:2376:2: ( ruleJsonQuery )
            // InternalOpenDictatorDsl.g:2377:3: ruleJsonQuery
            {
             before(grammarAccess.getStatementAccess().getJsonqueryJsonQueryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonQuery();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getJsonqueryJsonQueryParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Statement__JsonqueryAssignment_6"


    // $ANTLR start "rule__Statement__ValueAssignment_8"
    // InternalOpenDictatorDsl.g:2386:1: rule__Statement__ValueAssignment_8 : ( ruleValue ) ;
    public final void rule__Statement__ValueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2390:1: ( ( ruleValue ) )
            // InternalOpenDictatorDsl.g:2391:2: ( ruleValue )
            {
            // InternalOpenDictatorDsl.g:2391:2: ( ruleValue )
            // InternalOpenDictatorDsl.g:2392:3: ruleValue
            {
             before(grammarAccess.getStatementAccess().getValueValueParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getValueValueParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Statement__ValueAssignment_8"


    // $ANTLR start "rule__JsonQuery__QueryStringAssignment_3"
    // InternalOpenDictatorDsl.g:2401:1: rule__JsonQuery__QueryStringAssignment_3 : ( ruleEString ) ;
    public final void rule__JsonQuery__QueryStringAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2405:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:2406:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:2406:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:2407:3: ruleEString
            {
             before(grammarAccess.getJsonQueryAccess().getQueryStringEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJsonQueryAccess().getQueryStringEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__JsonQuery__QueryStringAssignment_3"


    // $ANTLR start "rule__Value__TypeAssignment_3"
    // InternalOpenDictatorDsl.g:2416:1: rule__Value__TypeAssignment_3 : ( ruleEString ) ;
    public final void rule__Value__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2420:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:2421:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:2421:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:2422:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getTypeEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getTypeEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Value__TypeAssignment_3"


    // $ANTLR start "rule__Value__ValueAssignment_5"
    // InternalOpenDictatorDsl.g:2431:1: rule__Value__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__Value__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:2435:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:2436:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:2436:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:2437:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getValueEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Value__ValueAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});

}