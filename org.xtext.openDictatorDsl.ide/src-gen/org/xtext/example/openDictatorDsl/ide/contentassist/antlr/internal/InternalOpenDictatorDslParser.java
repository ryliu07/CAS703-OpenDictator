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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'NOT'", "'FORSOME'", "'FORALL'", "'CONTAINS'", "'EQUALS'", "'LARGERTHAN'", "'SMALLERTHAN'", "'Id'", "'FailureMessage'", "'SuccessMessage'", "'FileLocation'", "'Policy'", "'{'", "'}'", "'['", "']'", "','", "'type='", "'value='"
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
    // InternalOpenDictatorDsl.g:112:1: ruleInputFile : ( ( rule__InputFile__FileLocationAssignment ) ) ;
    public final void ruleInputFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:116:2: ( ( ( rule__InputFile__FileLocationAssignment ) ) )
            // InternalOpenDictatorDsl.g:117:2: ( ( rule__InputFile__FileLocationAssignment ) )
            {
            // InternalOpenDictatorDsl.g:117:2: ( ( rule__InputFile__FileLocationAssignment ) )
            // InternalOpenDictatorDsl.g:118:3: ( rule__InputFile__FileLocationAssignment )
            {
             before(grammarAccess.getInputFileAccess().getFileLocationAssignment()); 
            // InternalOpenDictatorDsl.g:119:3: ( rule__InputFile__FileLocationAssignment )
            // InternalOpenDictatorDsl.g:119:4: rule__InputFile__FileLocationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InputFile__FileLocationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInputFileAccess().getFileLocationAssignment()); 

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
    // InternalOpenDictatorDsl.g:187:1: ruleJsonQuery : ( ( rule__JsonQuery__QueryStringAssignment ) ) ;
    public final void ruleJsonQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:191:2: ( ( ( rule__JsonQuery__QueryStringAssignment ) ) )
            // InternalOpenDictatorDsl.g:192:2: ( ( rule__JsonQuery__QueryStringAssignment ) )
            {
            // InternalOpenDictatorDsl.g:192:2: ( ( rule__JsonQuery__QueryStringAssignment ) )
            // InternalOpenDictatorDsl.g:193:3: ( rule__JsonQuery__QueryStringAssignment )
            {
             before(grammarAccess.getJsonQueryAccess().getQueryStringAssignment()); 
            // InternalOpenDictatorDsl.g:194:3: ( rule__JsonQuery__QueryStringAssignment )
            // InternalOpenDictatorDsl.g:194:4: rule__JsonQuery__QueryStringAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonQuery__QueryStringAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonQueryAccess().getQueryStringAssignment()); 

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
    // InternalOpenDictatorDsl.g:364:1: rule__Policy__Group__0__Impl : ( 'Id' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:368:1: ( ( 'Id' ) )
            // InternalOpenDictatorDsl.g:369:1: ( 'Id' )
            {
            // InternalOpenDictatorDsl.g:369:1: ( 'Id' )
            // InternalOpenDictatorDsl.g:370:2: 'Id'
            {
             before(grammarAccess.getPolicyAccess().getIdKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getIdKeyword_0()); 

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
    // InternalOpenDictatorDsl.g:391:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__IdAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:395:1: ( ( ( rule__Policy__IdAssignment_1 ) ) )
            // InternalOpenDictatorDsl.g:396:1: ( ( rule__Policy__IdAssignment_1 ) )
            {
            // InternalOpenDictatorDsl.g:396:1: ( ( rule__Policy__IdAssignment_1 ) )
            // InternalOpenDictatorDsl.g:397:2: ( rule__Policy__IdAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getIdAssignment_1()); 
            // InternalOpenDictatorDsl.g:398:2: ( rule__Policy__IdAssignment_1 )
            // InternalOpenDictatorDsl.g:398:3: rule__Policy__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getIdAssignment_1()); 

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
            pushFollow(FOLLOW_3);
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
            match(input,21,FOLLOW_2); 
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
            pushFollow(FOLLOW_5);
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
            pushFollow(FOLLOW_3);
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
            match(input,22,FOLLOW_2); 
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
            pushFollow(FOLLOW_6);
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
            pushFollow(FOLLOW_3);
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
    // InternalOpenDictatorDsl.g:526:1: rule__Policy__Group__6__Impl : ( 'FileLocation' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:530:1: ( ( 'FileLocation' ) )
            // InternalOpenDictatorDsl.g:531:1: ( 'FileLocation' )
            {
            // InternalOpenDictatorDsl.g:531:1: ( 'FileLocation' )
            // InternalOpenDictatorDsl.g:532:2: 'FileLocation'
            {
             before(grammarAccess.getPolicyAccess().getFileLocationKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getFileLocationKeyword_6()); 

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
            pushFollow(FOLLOW_7);
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
    // InternalOpenDictatorDsl.g:553:1: rule__Policy__Group__7__Impl : ( ( rule__Policy__InputfileAssignment_7 ) ) ;
    public final void rule__Policy__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:557:1: ( ( ( rule__Policy__InputfileAssignment_7 ) ) )
            // InternalOpenDictatorDsl.g:558:1: ( ( rule__Policy__InputfileAssignment_7 ) )
            {
            // InternalOpenDictatorDsl.g:558:1: ( ( rule__Policy__InputfileAssignment_7 ) )
            // InternalOpenDictatorDsl.g:559:2: ( rule__Policy__InputfileAssignment_7 )
            {
             before(grammarAccess.getPolicyAccess().getInputfileAssignment_7()); 
            // InternalOpenDictatorDsl.g:560:2: ( rule__Policy__InputfileAssignment_7 )
            // InternalOpenDictatorDsl.g:560:3: rule__Policy__InputfileAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Policy__InputfileAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getInputfileAssignment_7()); 

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
            pushFollow(FOLLOW_8);
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
    // InternalOpenDictatorDsl.g:580:1: rule__Policy__Group__8__Impl : ( 'Policy' ) ;
    public final void rule__Policy__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:584:1: ( ( 'Policy' ) )
            // InternalOpenDictatorDsl.g:585:1: ( 'Policy' )
            {
            // InternalOpenDictatorDsl.g:585:1: ( 'Policy' )
            // InternalOpenDictatorDsl.g:586:2: 'Policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_8()); 

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
            pushFollow(FOLLOW_9);
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
    // InternalOpenDictatorDsl.g:607:1: rule__Policy__Group__9__Impl : ( '{' ) ;
    public final void rule__Policy__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:611:1: ( ( '{' ) )
            // InternalOpenDictatorDsl.g:612:1: ( '{' )
            {
            // InternalOpenDictatorDsl.g:612:1: ( '{' )
            // InternalOpenDictatorDsl.g:613:2: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_9()); 

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
            pushFollow(FOLLOW_10);
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
    // InternalOpenDictatorDsl.g:634:1: rule__Policy__Group__10__Impl : ( ( rule__Policy__StatementsetAssignment_10 ) ) ;
    public final void rule__Policy__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:638:1: ( ( ( rule__Policy__StatementsetAssignment_10 ) ) )
            // InternalOpenDictatorDsl.g:639:1: ( ( rule__Policy__StatementsetAssignment_10 ) )
            {
            // InternalOpenDictatorDsl.g:639:1: ( ( rule__Policy__StatementsetAssignment_10 ) )
            // InternalOpenDictatorDsl.g:640:2: ( rule__Policy__StatementsetAssignment_10 )
            {
             before(grammarAccess.getPolicyAccess().getStatementsetAssignment_10()); 
            // InternalOpenDictatorDsl.g:641:2: ( rule__Policy__StatementsetAssignment_10 )
            // InternalOpenDictatorDsl.g:641:3: rule__Policy__StatementsetAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Policy__StatementsetAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getStatementsetAssignment_10()); 

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
    // InternalOpenDictatorDsl.g:649:1: rule__Policy__Group__11 : rule__Policy__Group__11__Impl ;
    public final void rule__Policy__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:653:1: ( rule__Policy__Group__11__Impl )
            // InternalOpenDictatorDsl.g:654:2: rule__Policy__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__11__Impl();

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
    // InternalOpenDictatorDsl.g:660:1: rule__Policy__Group__11__Impl : ( '}' ) ;
    public final void rule__Policy__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:664:1: ( ( '}' ) )
            // InternalOpenDictatorDsl.g:665:1: ( '}' )
            {
            // InternalOpenDictatorDsl.g:665:1: ( '}' )
            // InternalOpenDictatorDsl.g:666:2: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_11()); 

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


    // $ANTLR start "rule__StatementSet__Group__0"
    // InternalOpenDictatorDsl.g:676:1: rule__StatementSet__Group__0 : rule__StatementSet__Group__0__Impl rule__StatementSet__Group__1 ;
    public final void rule__StatementSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:680:1: ( rule__StatementSet__Group__0__Impl rule__StatementSet__Group__1 )
            // InternalOpenDictatorDsl.g:681:2: rule__StatementSet__Group__0__Impl rule__StatementSet__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalOpenDictatorDsl.g:688:1: rule__StatementSet__Group__0__Impl : ( ( rule__StatementSet__StatementOperatorAssignment_0 ) ) ;
    public final void rule__StatementSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:692:1: ( ( ( rule__StatementSet__StatementOperatorAssignment_0 ) ) )
            // InternalOpenDictatorDsl.g:693:1: ( ( rule__StatementSet__StatementOperatorAssignment_0 ) )
            {
            // InternalOpenDictatorDsl.g:693:1: ( ( rule__StatementSet__StatementOperatorAssignment_0 ) )
            // InternalOpenDictatorDsl.g:694:2: ( rule__StatementSet__StatementOperatorAssignment_0 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementOperatorAssignment_0()); 
            // InternalOpenDictatorDsl.g:695:2: ( rule__StatementSet__StatementOperatorAssignment_0 )
            // InternalOpenDictatorDsl.g:695:3: rule__StatementSet__StatementOperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementOperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementOperatorAssignment_0()); 

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
    // InternalOpenDictatorDsl.g:703:1: rule__StatementSet__Group__1 : rule__StatementSet__Group__1__Impl rule__StatementSet__Group__2 ;
    public final void rule__StatementSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:707:1: ( rule__StatementSet__Group__1__Impl rule__StatementSet__Group__2 )
            // InternalOpenDictatorDsl.g:708:2: rule__StatementSet__Group__1__Impl rule__StatementSet__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalOpenDictatorDsl.g:715:1: rule__StatementSet__Group__1__Impl : ( '[' ) ;
    public final void rule__StatementSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:719:1: ( ( '[' ) )
            // InternalOpenDictatorDsl.g:720:1: ( '[' )
            {
            // InternalOpenDictatorDsl.g:720:1: ( '[' )
            // InternalOpenDictatorDsl.g:721:2: '['
            {
             before(grammarAccess.getStatementSetAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getLeftSquareBracketKeyword_1()); 

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
    // InternalOpenDictatorDsl.g:730:1: rule__StatementSet__Group__2 : rule__StatementSet__Group__2__Impl rule__StatementSet__Group__3 ;
    public final void rule__StatementSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:734:1: ( rule__StatementSet__Group__2__Impl rule__StatementSet__Group__3 )
            // InternalOpenDictatorDsl.g:735:2: rule__StatementSet__Group__2__Impl rule__StatementSet__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalOpenDictatorDsl.g:742:1: rule__StatementSet__Group__2__Impl : ( ( rule__StatementSet__Group_2__0 )? ) ;
    public final void rule__StatementSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:746:1: ( ( ( rule__StatementSet__Group_2__0 )? ) )
            // InternalOpenDictatorDsl.g:747:1: ( ( rule__StatementSet__Group_2__0 )? )
            {
            // InternalOpenDictatorDsl.g:747:1: ( ( rule__StatementSet__Group_2__0 )? )
            // InternalOpenDictatorDsl.g:748:2: ( rule__StatementSet__Group_2__0 )?
            {
             before(grammarAccess.getStatementSetAccess().getGroup_2()); 
            // InternalOpenDictatorDsl.g:749:2: ( rule__StatementSet__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOpenDictatorDsl.g:749:3: rule__StatementSet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatementSet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementSetAccess().getGroup_2()); 

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
    // InternalOpenDictatorDsl.g:757:1: rule__StatementSet__Group__3 : rule__StatementSet__Group__3__Impl rule__StatementSet__Group__4 ;
    public final void rule__StatementSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:761:1: ( rule__StatementSet__Group__3__Impl rule__StatementSet__Group__4 )
            // InternalOpenDictatorDsl.g:762:2: rule__StatementSet__Group__3__Impl rule__StatementSet__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalOpenDictatorDsl.g:769:1: rule__StatementSet__Group__3__Impl : ( ( rule__StatementSet__StatementAssignment_3 ) ) ;
    public final void rule__StatementSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:773:1: ( ( ( rule__StatementSet__StatementAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:774:1: ( ( rule__StatementSet__StatementAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:774:1: ( ( rule__StatementSet__StatementAssignment_3 ) )
            // InternalOpenDictatorDsl.g:775:2: ( rule__StatementSet__StatementAssignment_3 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementAssignment_3()); 
            // InternalOpenDictatorDsl.g:776:2: ( rule__StatementSet__StatementAssignment_3 )
            // InternalOpenDictatorDsl.g:776:3: rule__StatementSet__StatementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementAssignment_3()); 

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
    // InternalOpenDictatorDsl.g:784:1: rule__StatementSet__Group__4 : rule__StatementSet__Group__4__Impl rule__StatementSet__Group__5 ;
    public final void rule__StatementSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:788:1: ( rule__StatementSet__Group__4__Impl rule__StatementSet__Group__5 )
            // InternalOpenDictatorDsl.g:789:2: rule__StatementSet__Group__4__Impl rule__StatementSet__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalOpenDictatorDsl.g:796:1: rule__StatementSet__Group__4__Impl : ( ( rule__StatementSet__Group_4__0 )* ) ;
    public final void rule__StatementSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:800:1: ( ( ( rule__StatementSet__Group_4__0 )* ) )
            // InternalOpenDictatorDsl.g:801:1: ( ( rule__StatementSet__Group_4__0 )* )
            {
            // InternalOpenDictatorDsl.g:801:1: ( ( rule__StatementSet__Group_4__0 )* )
            // InternalOpenDictatorDsl.g:802:2: ( rule__StatementSet__Group_4__0 )*
            {
             before(grammarAccess.getStatementSetAccess().getGroup_4()); 
            // InternalOpenDictatorDsl.g:803:2: ( rule__StatementSet__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1>=RULE_STRING && LA5_1<=RULE_ID)||(LA5_1>=14 && LA5_1<=19)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:803:3: rule__StatementSet__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__StatementSet__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

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
    // InternalOpenDictatorDsl.g:811:1: rule__StatementSet__Group__5 : rule__StatementSet__Group__5__Impl rule__StatementSet__Group__6 ;
    public final void rule__StatementSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:815:1: ( rule__StatementSet__Group__5__Impl rule__StatementSet__Group__6 )
            // InternalOpenDictatorDsl.g:816:2: rule__StatementSet__Group__5__Impl rule__StatementSet__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalOpenDictatorDsl.g:823:1: rule__StatementSet__Group__5__Impl : ( ( rule__StatementSet__Group_5__0 )? ) ;
    public final void rule__StatementSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:827:1: ( ( ( rule__StatementSet__Group_5__0 )? ) )
            // InternalOpenDictatorDsl.g:828:1: ( ( rule__StatementSet__Group_5__0 )? )
            {
            // InternalOpenDictatorDsl.g:828:1: ( ( rule__StatementSet__Group_5__0 )? )
            // InternalOpenDictatorDsl.g:829:2: ( rule__StatementSet__Group_5__0 )?
            {
             before(grammarAccess.getStatementSetAccess().getGroup_5()); 
            // InternalOpenDictatorDsl.g:830:2: ( rule__StatementSet__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOpenDictatorDsl.g:830:3: rule__StatementSet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatementSet__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementSetAccess().getGroup_5()); 

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
    // InternalOpenDictatorDsl.g:838:1: rule__StatementSet__Group__6 : rule__StatementSet__Group__6__Impl ;
    public final void rule__StatementSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:842:1: ( rule__StatementSet__Group__6__Impl )
            // InternalOpenDictatorDsl.g:843:2: rule__StatementSet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group__6__Impl();

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
    // InternalOpenDictatorDsl.g:849:1: rule__StatementSet__Group__6__Impl : ( ']' ) ;
    public final void rule__StatementSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:853:1: ( ( ']' ) )
            // InternalOpenDictatorDsl.g:854:1: ( ']' )
            {
            // InternalOpenDictatorDsl.g:854:1: ( ']' )
            // InternalOpenDictatorDsl.g:855:2: ']'
            {
             before(grammarAccess.getStatementSetAccess().getRightSquareBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getRightSquareBracketKeyword_6()); 

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


    // $ANTLR start "rule__StatementSet__Group_2__0"
    // InternalOpenDictatorDsl.g:865:1: rule__StatementSet__Group_2__0 : rule__StatementSet__Group_2__0__Impl rule__StatementSet__Group_2__1 ;
    public final void rule__StatementSet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:869:1: ( rule__StatementSet__Group_2__0__Impl rule__StatementSet__Group_2__1 )
            // InternalOpenDictatorDsl.g:870:2: rule__StatementSet__Group_2__0__Impl rule__StatementSet__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__StatementSet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_2__1();

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
    // $ANTLR end "rule__StatementSet__Group_2__0"


    // $ANTLR start "rule__StatementSet__Group_2__0__Impl"
    // InternalOpenDictatorDsl.g:877:1: rule__StatementSet__Group_2__0__Impl : ( ( rule__StatementSet__StatementsetAssignment_2_0 ) ) ;
    public final void rule__StatementSet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:881:1: ( ( ( rule__StatementSet__StatementsetAssignment_2_0 ) ) )
            // InternalOpenDictatorDsl.g:882:1: ( ( rule__StatementSet__StatementsetAssignment_2_0 ) )
            {
            // InternalOpenDictatorDsl.g:882:1: ( ( rule__StatementSet__StatementsetAssignment_2_0 ) )
            // InternalOpenDictatorDsl.g:883:2: ( rule__StatementSet__StatementsetAssignment_2_0 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetAssignment_2_0()); 
            // InternalOpenDictatorDsl.g:884:2: ( rule__StatementSet__StatementsetAssignment_2_0 )
            // InternalOpenDictatorDsl.g:884:3: rule__StatementSet__StatementsetAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementsetAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementsetAssignment_2_0()); 

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
    // $ANTLR end "rule__StatementSet__Group_2__0__Impl"


    // $ANTLR start "rule__StatementSet__Group_2__1"
    // InternalOpenDictatorDsl.g:892:1: rule__StatementSet__Group_2__1 : rule__StatementSet__Group_2__1__Impl rule__StatementSet__Group_2__2 ;
    public final void rule__StatementSet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:896:1: ( rule__StatementSet__Group_2__1__Impl rule__StatementSet__Group_2__2 )
            // InternalOpenDictatorDsl.g:897:2: rule__StatementSet__Group_2__1__Impl rule__StatementSet__Group_2__2
            {
            pushFollow(FOLLOW_15);
            rule__StatementSet__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_2__2();

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
    // $ANTLR end "rule__StatementSet__Group_2__1"


    // $ANTLR start "rule__StatementSet__Group_2__1__Impl"
    // InternalOpenDictatorDsl.g:904:1: rule__StatementSet__Group_2__1__Impl : ( ( rule__StatementSet__Group_2_1__0 )* ) ;
    public final void rule__StatementSet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:908:1: ( ( ( rule__StatementSet__Group_2_1__0 )* ) )
            // InternalOpenDictatorDsl.g:909:1: ( ( rule__StatementSet__Group_2_1__0 )* )
            {
            // InternalOpenDictatorDsl.g:909:1: ( ( rule__StatementSet__Group_2_1__0 )* )
            // InternalOpenDictatorDsl.g:910:2: ( rule__StatementSet__Group_2_1__0 )*
            {
             before(grammarAccess.getStatementSetAccess().getGroup_2_1()); 
            // InternalOpenDictatorDsl.g:911:2: ( rule__StatementSet__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    int LA7_1 = input.LA(2);

                    if ( ((LA7_1>=11 && LA7_1<=13)) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:911:3: rule__StatementSet__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__StatementSet__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStatementSetAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__StatementSet__Group_2__1__Impl"


    // $ANTLR start "rule__StatementSet__Group_2__2"
    // InternalOpenDictatorDsl.g:919:1: rule__StatementSet__Group_2__2 : rule__StatementSet__Group_2__2__Impl ;
    public final void rule__StatementSet__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:923:1: ( rule__StatementSet__Group_2__2__Impl )
            // InternalOpenDictatorDsl.g:924:2: rule__StatementSet__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_2__2__Impl();

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
    // $ANTLR end "rule__StatementSet__Group_2__2"


    // $ANTLR start "rule__StatementSet__Group_2__2__Impl"
    // InternalOpenDictatorDsl.g:930:1: rule__StatementSet__Group_2__2__Impl : ( ',' ) ;
    public final void rule__StatementSet__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:934:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:935:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:935:1: ( ',' )
            // InternalOpenDictatorDsl.g:936:2: ','
            {
             before(grammarAccess.getStatementSetAccess().getCommaKeyword_2_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getCommaKeyword_2_2()); 

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
    // $ANTLR end "rule__StatementSet__Group_2__2__Impl"


    // $ANTLR start "rule__StatementSet__Group_2_1__0"
    // InternalOpenDictatorDsl.g:946:1: rule__StatementSet__Group_2_1__0 : rule__StatementSet__Group_2_1__0__Impl rule__StatementSet__Group_2_1__1 ;
    public final void rule__StatementSet__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:950:1: ( rule__StatementSet__Group_2_1__0__Impl rule__StatementSet__Group_2_1__1 )
            // InternalOpenDictatorDsl.g:951:2: rule__StatementSet__Group_2_1__0__Impl rule__StatementSet__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__StatementSet__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_2_1__1();

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
    // $ANTLR end "rule__StatementSet__Group_2_1__0"


    // $ANTLR start "rule__StatementSet__Group_2_1__0__Impl"
    // InternalOpenDictatorDsl.g:958:1: rule__StatementSet__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__StatementSet__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:962:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:963:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:963:1: ( ',' )
            // InternalOpenDictatorDsl.g:964:2: ','
            {
             before(grammarAccess.getStatementSetAccess().getCommaKeyword_2_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__StatementSet__Group_2_1__0__Impl"


    // $ANTLR start "rule__StatementSet__Group_2_1__1"
    // InternalOpenDictatorDsl.g:973:1: rule__StatementSet__Group_2_1__1 : rule__StatementSet__Group_2_1__1__Impl ;
    public final void rule__StatementSet__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:977:1: ( rule__StatementSet__Group_2_1__1__Impl )
            // InternalOpenDictatorDsl.g:978:2: rule__StatementSet__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__StatementSet__Group_2_1__1"


    // $ANTLR start "rule__StatementSet__Group_2_1__1__Impl"
    // InternalOpenDictatorDsl.g:984:1: rule__StatementSet__Group_2_1__1__Impl : ( ( rule__StatementSet__StatementsetAssignment_2_1_1 ) ) ;
    public final void rule__StatementSet__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:988:1: ( ( ( rule__StatementSet__StatementsetAssignment_2_1_1 ) ) )
            // InternalOpenDictatorDsl.g:989:1: ( ( rule__StatementSet__StatementsetAssignment_2_1_1 ) )
            {
            // InternalOpenDictatorDsl.g:989:1: ( ( rule__StatementSet__StatementsetAssignment_2_1_1 ) )
            // InternalOpenDictatorDsl.g:990:2: ( rule__StatementSet__StatementsetAssignment_2_1_1 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetAssignment_2_1_1()); 
            // InternalOpenDictatorDsl.g:991:2: ( rule__StatementSet__StatementsetAssignment_2_1_1 )
            // InternalOpenDictatorDsl.g:991:3: rule__StatementSet__StatementsetAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementsetAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementsetAssignment_2_1_1()); 

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
    // $ANTLR end "rule__StatementSet__Group_2_1__1__Impl"


    // $ANTLR start "rule__StatementSet__Group_4__0"
    // InternalOpenDictatorDsl.g:1000:1: rule__StatementSet__Group_4__0 : rule__StatementSet__Group_4__0__Impl rule__StatementSet__Group_4__1 ;
    public final void rule__StatementSet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1004:1: ( rule__StatementSet__Group_4__0__Impl rule__StatementSet__Group_4__1 )
            // InternalOpenDictatorDsl.g:1005:2: rule__StatementSet__Group_4__0__Impl rule__StatementSet__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOpenDictatorDsl.g:1012:1: rule__StatementSet__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StatementSet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1016:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:1017:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:1017:1: ( ',' )
            // InternalOpenDictatorDsl.g:1018:2: ','
            {
             before(grammarAccess.getStatementSetAccess().getCommaKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getCommaKeyword_4_0()); 

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
    // InternalOpenDictatorDsl.g:1027:1: rule__StatementSet__Group_4__1 : rule__StatementSet__Group_4__1__Impl ;
    public final void rule__StatementSet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1031:1: ( rule__StatementSet__Group_4__1__Impl )
            // InternalOpenDictatorDsl.g:1032:2: rule__StatementSet__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_4__1__Impl();

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
    // InternalOpenDictatorDsl.g:1038:1: rule__StatementSet__Group_4__1__Impl : ( ( rule__StatementSet__StatementAssignment_4_1 ) ) ;
    public final void rule__StatementSet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1042:1: ( ( ( rule__StatementSet__StatementAssignment_4_1 ) ) )
            // InternalOpenDictatorDsl.g:1043:1: ( ( rule__StatementSet__StatementAssignment_4_1 ) )
            {
            // InternalOpenDictatorDsl.g:1043:1: ( ( rule__StatementSet__StatementAssignment_4_1 ) )
            // InternalOpenDictatorDsl.g:1044:2: ( rule__StatementSet__StatementAssignment_4_1 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementAssignment_4_1()); 
            // InternalOpenDictatorDsl.g:1045:2: ( rule__StatementSet__StatementAssignment_4_1 )
            // InternalOpenDictatorDsl.g:1045:3: rule__StatementSet__StatementAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementAssignment_4_1()); 

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


    // $ANTLR start "rule__StatementSet__Group_5__0"
    // InternalOpenDictatorDsl.g:1054:1: rule__StatementSet__Group_5__0 : rule__StatementSet__Group_5__0__Impl rule__StatementSet__Group_5__1 ;
    public final void rule__StatementSet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1058:1: ( rule__StatementSet__Group_5__0__Impl rule__StatementSet__Group_5__1 )
            // InternalOpenDictatorDsl.g:1059:2: rule__StatementSet__Group_5__0__Impl rule__StatementSet__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__StatementSet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_5__1();

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
    // $ANTLR end "rule__StatementSet__Group_5__0"


    // $ANTLR start "rule__StatementSet__Group_5__0__Impl"
    // InternalOpenDictatorDsl.g:1066:1: rule__StatementSet__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StatementSet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1070:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:1071:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:1071:1: ( ',' )
            // InternalOpenDictatorDsl.g:1072:2: ','
            {
             before(grammarAccess.getStatementSetAccess().getCommaKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__StatementSet__Group_5__0__Impl"


    // $ANTLR start "rule__StatementSet__Group_5__1"
    // InternalOpenDictatorDsl.g:1081:1: rule__StatementSet__Group_5__1 : rule__StatementSet__Group_5__1__Impl rule__StatementSet__Group_5__2 ;
    public final void rule__StatementSet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1085:1: ( rule__StatementSet__Group_5__1__Impl rule__StatementSet__Group_5__2 )
            // InternalOpenDictatorDsl.g:1086:2: rule__StatementSet__Group_5__1__Impl rule__StatementSet__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__StatementSet__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_5__2();

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
    // $ANTLR end "rule__StatementSet__Group_5__1"


    // $ANTLR start "rule__StatementSet__Group_5__1__Impl"
    // InternalOpenDictatorDsl.g:1093:1: rule__StatementSet__Group_5__1__Impl : ( ( rule__StatementSet__StatementsetAssignment_5_1 ) ) ;
    public final void rule__StatementSet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1097:1: ( ( ( rule__StatementSet__StatementsetAssignment_5_1 ) ) )
            // InternalOpenDictatorDsl.g:1098:1: ( ( rule__StatementSet__StatementsetAssignment_5_1 ) )
            {
            // InternalOpenDictatorDsl.g:1098:1: ( ( rule__StatementSet__StatementsetAssignment_5_1 ) )
            // InternalOpenDictatorDsl.g:1099:2: ( rule__StatementSet__StatementsetAssignment_5_1 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetAssignment_5_1()); 
            // InternalOpenDictatorDsl.g:1100:2: ( rule__StatementSet__StatementsetAssignment_5_1 )
            // InternalOpenDictatorDsl.g:1100:3: rule__StatementSet__StatementsetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementsetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementsetAssignment_5_1()); 

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
    // $ANTLR end "rule__StatementSet__Group_5__1__Impl"


    // $ANTLR start "rule__StatementSet__Group_5__2"
    // InternalOpenDictatorDsl.g:1108:1: rule__StatementSet__Group_5__2 : rule__StatementSet__Group_5__2__Impl ;
    public final void rule__StatementSet__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1112:1: ( rule__StatementSet__Group_5__2__Impl )
            // InternalOpenDictatorDsl.g:1113:2: rule__StatementSet__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_5__2__Impl();

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
    // $ANTLR end "rule__StatementSet__Group_5__2"


    // $ANTLR start "rule__StatementSet__Group_5__2__Impl"
    // InternalOpenDictatorDsl.g:1119:1: rule__StatementSet__Group_5__2__Impl : ( ( rule__StatementSet__Group_5_2__0 )* ) ;
    public final void rule__StatementSet__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1123:1: ( ( ( rule__StatementSet__Group_5_2__0 )* ) )
            // InternalOpenDictatorDsl.g:1124:1: ( ( rule__StatementSet__Group_5_2__0 )* )
            {
            // InternalOpenDictatorDsl.g:1124:1: ( ( rule__StatementSet__Group_5_2__0 )* )
            // InternalOpenDictatorDsl.g:1125:2: ( rule__StatementSet__Group_5_2__0 )*
            {
             before(grammarAccess.getStatementSetAccess().getGroup_5_2()); 
            // InternalOpenDictatorDsl.g:1126:2: ( rule__StatementSet__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOpenDictatorDsl.g:1126:3: rule__StatementSet__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__StatementSet__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStatementSetAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__StatementSet__Group_5__2__Impl"


    // $ANTLR start "rule__StatementSet__Group_5_2__0"
    // InternalOpenDictatorDsl.g:1135:1: rule__StatementSet__Group_5_2__0 : rule__StatementSet__Group_5_2__0__Impl rule__StatementSet__Group_5_2__1 ;
    public final void rule__StatementSet__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1139:1: ( rule__StatementSet__Group_5_2__0__Impl rule__StatementSet__Group_5_2__1 )
            // InternalOpenDictatorDsl.g:1140:2: rule__StatementSet__Group_5_2__0__Impl rule__StatementSet__Group_5_2__1
            {
            pushFollow(FOLLOW_9);
            rule__StatementSet__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_5_2__1();

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
    // $ANTLR end "rule__StatementSet__Group_5_2__0"


    // $ANTLR start "rule__StatementSet__Group_5_2__0__Impl"
    // InternalOpenDictatorDsl.g:1147:1: rule__StatementSet__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__StatementSet__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1151:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:1152:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:1152:1: ( ',' )
            // InternalOpenDictatorDsl.g:1153:2: ','
            {
             before(grammarAccess.getStatementSetAccess().getCommaKeyword_5_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatementSetAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__StatementSet__Group_5_2__0__Impl"


    // $ANTLR start "rule__StatementSet__Group_5_2__1"
    // InternalOpenDictatorDsl.g:1162:1: rule__StatementSet__Group_5_2__1 : rule__StatementSet__Group_5_2__1__Impl ;
    public final void rule__StatementSet__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1166:1: ( rule__StatementSet__Group_5_2__1__Impl )
            // InternalOpenDictatorDsl.g:1167:2: rule__StatementSet__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__StatementSet__Group_5_2__1"


    // $ANTLR start "rule__StatementSet__Group_5_2__1__Impl"
    // InternalOpenDictatorDsl.g:1173:1: rule__StatementSet__Group_5_2__1__Impl : ( ( rule__StatementSet__StatementsetAssignment_5_2_1 ) ) ;
    public final void rule__StatementSet__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1177:1: ( ( ( rule__StatementSet__StatementsetAssignment_5_2_1 ) ) )
            // InternalOpenDictatorDsl.g:1178:1: ( ( rule__StatementSet__StatementsetAssignment_5_2_1 ) )
            {
            // InternalOpenDictatorDsl.g:1178:1: ( ( rule__StatementSet__StatementsetAssignment_5_2_1 ) )
            // InternalOpenDictatorDsl.g:1179:2: ( rule__StatementSet__StatementsetAssignment_5_2_1 )
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetAssignment_5_2_1()); 
            // InternalOpenDictatorDsl.g:1180:2: ( rule__StatementSet__StatementsetAssignment_5_2_1 )
            // InternalOpenDictatorDsl.g:1180:3: rule__StatementSet__StatementsetAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StatementSet__StatementsetAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementSetAccess().getStatementsetAssignment_5_2_1()); 

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
    // $ANTLR end "rule__StatementSet__Group_5_2__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalOpenDictatorDsl.g:1189:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1193:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalOpenDictatorDsl.g:1194:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOpenDictatorDsl.g:1201:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__PrefixEvaluationOperatorAssignment_0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1205:1: ( ( ( rule__Statement__PrefixEvaluationOperatorAssignment_0 )? ) )
            // InternalOpenDictatorDsl.g:1206:1: ( ( rule__Statement__PrefixEvaluationOperatorAssignment_0 )? )
            {
            // InternalOpenDictatorDsl.g:1206:1: ( ( rule__Statement__PrefixEvaluationOperatorAssignment_0 )? )
            // InternalOpenDictatorDsl.g:1207:2: ( rule__Statement__PrefixEvaluationOperatorAssignment_0 )?
            {
             before(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorAssignment_0()); 
            // InternalOpenDictatorDsl.g:1208:2: ( rule__Statement__PrefixEvaluationOperatorAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=19)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOpenDictatorDsl.g:1208:3: rule__Statement__PrefixEvaluationOperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__PrefixEvaluationOperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorAssignment_0()); 

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
    // InternalOpenDictatorDsl.g:1216:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1220:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalOpenDictatorDsl.g:1221:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalOpenDictatorDsl.g:1228:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__JsonqueryAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1232:1: ( ( ( rule__Statement__JsonqueryAssignment_1 ) ) )
            // InternalOpenDictatorDsl.g:1233:1: ( ( rule__Statement__JsonqueryAssignment_1 ) )
            {
            // InternalOpenDictatorDsl.g:1233:1: ( ( rule__Statement__JsonqueryAssignment_1 ) )
            // InternalOpenDictatorDsl.g:1234:2: ( rule__Statement__JsonqueryAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getJsonqueryAssignment_1()); 
            // InternalOpenDictatorDsl.g:1235:2: ( rule__Statement__JsonqueryAssignment_1 )
            // InternalOpenDictatorDsl.g:1235:3: rule__Statement__JsonqueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__JsonqueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getJsonqueryAssignment_1()); 

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
    // InternalOpenDictatorDsl.g:1243:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1247:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // InternalOpenDictatorDsl.g:1248:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalOpenDictatorDsl.g:1255:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__EvaluationOperatorAssignment_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1259:1: ( ( ( rule__Statement__EvaluationOperatorAssignment_2 ) ) )
            // InternalOpenDictatorDsl.g:1260:1: ( ( rule__Statement__EvaluationOperatorAssignment_2 ) )
            {
            // InternalOpenDictatorDsl.g:1260:1: ( ( rule__Statement__EvaluationOperatorAssignment_2 ) )
            // InternalOpenDictatorDsl.g:1261:2: ( rule__Statement__EvaluationOperatorAssignment_2 )
            {
             before(grammarAccess.getStatementAccess().getEvaluationOperatorAssignment_2()); 
            // InternalOpenDictatorDsl.g:1262:2: ( rule__Statement__EvaluationOperatorAssignment_2 )
            // InternalOpenDictatorDsl.g:1262:3: rule__Statement__EvaluationOperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Statement__EvaluationOperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getEvaluationOperatorAssignment_2()); 

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
    // InternalOpenDictatorDsl.g:1270:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1274:1: ( rule__Statement__Group__3__Impl )
            // InternalOpenDictatorDsl.g:1275:2: rule__Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__3__Impl();

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
    // InternalOpenDictatorDsl.g:1281:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__ValueAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1285:1: ( ( ( rule__Statement__ValueAssignment_3 ) ) )
            // InternalOpenDictatorDsl.g:1286:1: ( ( rule__Statement__ValueAssignment_3 ) )
            {
            // InternalOpenDictatorDsl.g:1286:1: ( ( rule__Statement__ValueAssignment_3 ) )
            // InternalOpenDictatorDsl.g:1287:2: ( rule__Statement__ValueAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getValueAssignment_3()); 
            // InternalOpenDictatorDsl.g:1288:2: ( rule__Statement__ValueAssignment_3 )
            // InternalOpenDictatorDsl.g:1288:3: rule__Statement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getValueAssignment_3()); 

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


    // $ANTLR start "rule__Value__Group__0"
    // InternalOpenDictatorDsl.g:1297:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1301:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalOpenDictatorDsl.g:1302:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalOpenDictatorDsl.g:1309:1: rule__Value__Group__0__Impl : ( 'type=' ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1313:1: ( ( 'type=' ) )
            // InternalOpenDictatorDsl.g:1314:1: ( 'type=' )
            {
            // InternalOpenDictatorDsl.g:1314:1: ( 'type=' )
            // InternalOpenDictatorDsl.g:1315:2: 'type='
            {
             before(grammarAccess.getValueAccess().getTypeKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getTypeKeyword_0()); 

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
    // InternalOpenDictatorDsl.g:1324:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1328:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalOpenDictatorDsl.g:1329:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOpenDictatorDsl.g:1336:1: rule__Value__Group__1__Impl : ( ( rule__Value__TypeAssignment_1 ) ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1340:1: ( ( ( rule__Value__TypeAssignment_1 ) ) )
            // InternalOpenDictatorDsl.g:1341:1: ( ( rule__Value__TypeAssignment_1 ) )
            {
            // InternalOpenDictatorDsl.g:1341:1: ( ( rule__Value__TypeAssignment_1 ) )
            // InternalOpenDictatorDsl.g:1342:2: ( rule__Value__TypeAssignment_1 )
            {
             before(grammarAccess.getValueAccess().getTypeAssignment_1()); 
            // InternalOpenDictatorDsl.g:1343:2: ( rule__Value__TypeAssignment_1 )
            // InternalOpenDictatorDsl.g:1343:3: rule__Value__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getTypeAssignment_1()); 

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
    // InternalOpenDictatorDsl.g:1351:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1355:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalOpenDictatorDsl.g:1356:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalOpenDictatorDsl.g:1363:1: rule__Value__Group__2__Impl : ( ',' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1367:1: ( ( ',' ) )
            // InternalOpenDictatorDsl.g:1368:1: ( ',' )
            {
            // InternalOpenDictatorDsl.g:1368:1: ( ',' )
            // InternalOpenDictatorDsl.g:1369:2: ','
            {
             before(grammarAccess.getValueAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getCommaKeyword_2()); 

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
    // InternalOpenDictatorDsl.g:1378:1: rule__Value__Group__3 : rule__Value__Group__3__Impl rule__Value__Group__4 ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1382:1: ( rule__Value__Group__3__Impl rule__Value__Group__4 )
            // InternalOpenDictatorDsl.g:1383:2: rule__Value__Group__3__Impl rule__Value__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalOpenDictatorDsl.g:1390:1: rule__Value__Group__3__Impl : ( 'value=' ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1394:1: ( ( 'value=' ) )
            // InternalOpenDictatorDsl.g:1395:1: ( 'value=' )
            {
            // InternalOpenDictatorDsl.g:1395:1: ( 'value=' )
            // InternalOpenDictatorDsl.g:1396:2: 'value='
            {
             before(grammarAccess.getValueAccess().getValueKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueKeyword_3()); 

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
    // InternalOpenDictatorDsl.g:1405:1: rule__Value__Group__4 : rule__Value__Group__4__Impl ;
    public final void rule__Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1409:1: ( rule__Value__Group__4__Impl )
            // InternalOpenDictatorDsl.g:1410:2: rule__Value__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__4__Impl();

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
    // InternalOpenDictatorDsl.g:1416:1: rule__Value__Group__4__Impl : ( ( rule__Value__ValueAssignment_4 ) ) ;
    public final void rule__Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1420:1: ( ( ( rule__Value__ValueAssignment_4 ) ) )
            // InternalOpenDictatorDsl.g:1421:1: ( ( rule__Value__ValueAssignment_4 ) )
            {
            // InternalOpenDictatorDsl.g:1421:1: ( ( rule__Value__ValueAssignment_4 ) )
            // InternalOpenDictatorDsl.g:1422:2: ( rule__Value__ValueAssignment_4 )
            {
             before(grammarAccess.getValueAccess().getValueAssignment_4()); 
            // InternalOpenDictatorDsl.g:1423:2: ( rule__Value__ValueAssignment_4 )
            // InternalOpenDictatorDsl.g:1423:3: rule__Value__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment_4()); 

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


    // $ANTLR start "rule__Policy__IdAssignment_1"
    // InternalOpenDictatorDsl.g:1432:1: rule__Policy__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__Policy__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1436:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:1437:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:1437:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:1438:3: ruleEString
            {
             before(grammarAccess.getPolicyAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getIdEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Policy__IdAssignment_1"


    // $ANTLR start "rule__Policy__FailureMessageAssignment_3"
    // InternalOpenDictatorDsl.g:1447:1: rule__Policy__FailureMessageAssignment_3 : ( ruleEString ) ;
    public final void rule__Policy__FailureMessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1451:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:1452:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:1452:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:1453:3: ruleEString
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
    // InternalOpenDictatorDsl.g:1462:1: rule__Policy__SuccessMessageAssignment_5 : ( ruleEString ) ;
    public final void rule__Policy__SuccessMessageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1466:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:1467:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:1467:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:1468:3: ruleEString
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


    // $ANTLR start "rule__Policy__InputfileAssignment_7"
    // InternalOpenDictatorDsl.g:1477:1: rule__Policy__InputfileAssignment_7 : ( ruleInputFile ) ;
    public final void rule__Policy__InputfileAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1481:1: ( ( ruleInputFile ) )
            // InternalOpenDictatorDsl.g:1482:2: ( ruleInputFile )
            {
            // InternalOpenDictatorDsl.g:1482:2: ( ruleInputFile )
            // InternalOpenDictatorDsl.g:1483:3: ruleInputFile
            {
             before(grammarAccess.getPolicyAccess().getInputfileInputFileParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFile();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getInputfileInputFileParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Policy__InputfileAssignment_7"


    // $ANTLR start "rule__Policy__StatementsetAssignment_10"
    // InternalOpenDictatorDsl.g:1492:1: rule__Policy__StatementsetAssignment_10 : ( ruleStatementSet ) ;
    public final void rule__Policy__StatementsetAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1496:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:1497:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:1497:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:1498:3: ruleStatementSet
            {
             before(grammarAccess.getPolicyAccess().getStatementsetStatementSetParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getStatementsetStatementSetParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Policy__StatementsetAssignment_10"


    // $ANTLR start "rule__StatementSet__StatementOperatorAssignment_0"
    // InternalOpenDictatorDsl.g:1507:1: rule__StatementSet__StatementOperatorAssignment_0 : ( ruleStatementOperator ) ;
    public final void rule__StatementSet__StatementOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1511:1: ( ( ruleStatementOperator ) )
            // InternalOpenDictatorDsl.g:1512:2: ( ruleStatementOperator )
            {
            // InternalOpenDictatorDsl.g:1512:2: ( ruleStatementOperator )
            // InternalOpenDictatorDsl.g:1513:3: ruleStatementOperator
            {
             before(grammarAccess.getStatementSetAccess().getStatementOperatorStatementOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementOperator();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementOperatorStatementOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementOperatorAssignment_0"


    // $ANTLR start "rule__StatementSet__StatementsetAssignment_2_0"
    // InternalOpenDictatorDsl.g:1522:1: rule__StatementSet__StatementsetAssignment_2_0 : ( ruleStatementSet ) ;
    public final void rule__StatementSet__StatementsetAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1526:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:1527:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:1527:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:1528:3: ruleStatementSet
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementsetAssignment_2_0"


    // $ANTLR start "rule__StatementSet__StatementsetAssignment_2_1_1"
    // InternalOpenDictatorDsl.g:1537:1: rule__StatementSet__StatementsetAssignment_2_1_1 : ( ruleStatementSet ) ;
    public final void rule__StatementSet__StatementsetAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1541:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:1542:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:1542:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:1543:3: ruleStatementSet
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementsetAssignment_2_1_1"


    // $ANTLR start "rule__StatementSet__StatementAssignment_3"
    // InternalOpenDictatorDsl.g:1552:1: rule__StatementSet__StatementAssignment_3 : ( ruleStatement ) ;
    public final void rule__StatementSet__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1556:1: ( ( ruleStatement ) )
            // InternalOpenDictatorDsl.g:1557:2: ( ruleStatement )
            {
            // InternalOpenDictatorDsl.g:1557:2: ( ruleStatement )
            // InternalOpenDictatorDsl.g:1558:3: ruleStatement
            {
             before(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementAssignment_3"


    // $ANTLR start "rule__StatementSet__StatementAssignment_4_1"
    // InternalOpenDictatorDsl.g:1567:1: rule__StatementSet__StatementAssignment_4_1 : ( ruleStatement ) ;
    public final void rule__StatementSet__StatementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1571:1: ( ( ruleStatement ) )
            // InternalOpenDictatorDsl.g:1572:2: ( ruleStatement )
            {
            // InternalOpenDictatorDsl.g:1572:2: ( ruleStatement )
            // InternalOpenDictatorDsl.g:1573:3: ruleStatement
            {
             before(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementStatementParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementAssignment_4_1"


    // $ANTLR start "rule__StatementSet__StatementsetAssignment_5_1"
    // InternalOpenDictatorDsl.g:1582:1: rule__StatementSet__StatementsetAssignment_5_1 : ( ruleStatementSet ) ;
    public final void rule__StatementSet__StatementsetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1586:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:1587:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:1587:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:1588:3: ruleStatementSet
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementsetAssignment_5_1"


    // $ANTLR start "rule__StatementSet__StatementsetAssignment_5_2_1"
    // InternalOpenDictatorDsl.g:1597:1: rule__StatementSet__StatementsetAssignment_5_2_1 : ( ruleStatementSet ) ;
    public final void rule__StatementSet__StatementsetAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1601:1: ( ( ruleStatementSet ) )
            // InternalOpenDictatorDsl.g:1602:2: ( ruleStatementSet )
            {
            // InternalOpenDictatorDsl.g:1602:2: ( ruleStatementSet )
            // InternalOpenDictatorDsl.g:1603:3: ruleStatementSet
            {
             before(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatementSet();

            state._fsp--;

             after(grammarAccess.getStatementSetAccess().getStatementsetStatementSetParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__StatementSet__StatementsetAssignment_5_2_1"


    // $ANTLR start "rule__InputFile__FileLocationAssignment"
    // InternalOpenDictatorDsl.g:1612:1: rule__InputFile__FileLocationAssignment : ( ruleEString ) ;
    public final void rule__InputFile__FileLocationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1616:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:1617:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:1617:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:1618:3: ruleEString
            {
             before(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__InputFile__FileLocationAssignment"


    // $ANTLR start "rule__Statement__PrefixEvaluationOperatorAssignment_0"
    // InternalOpenDictatorDsl.g:1627:1: rule__Statement__PrefixEvaluationOperatorAssignment_0 : ( ruleEvaluationOperator ) ;
    public final void rule__Statement__PrefixEvaluationOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1631:1: ( ( ruleEvaluationOperator ) )
            // InternalOpenDictatorDsl.g:1632:2: ( ruleEvaluationOperator )
            {
            // InternalOpenDictatorDsl.g:1632:2: ( ruleEvaluationOperator )
            // InternalOpenDictatorDsl.g:1633:3: ruleEvaluationOperator
            {
             before(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationOperator();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getPrefixEvaluationOperatorEvaluationOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statement__PrefixEvaluationOperatorAssignment_0"


    // $ANTLR start "rule__Statement__JsonqueryAssignment_1"
    // InternalOpenDictatorDsl.g:1642:1: rule__Statement__JsonqueryAssignment_1 : ( ruleJsonQuery ) ;
    public final void rule__Statement__JsonqueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1646:1: ( ( ruleJsonQuery ) )
            // InternalOpenDictatorDsl.g:1647:2: ( ruleJsonQuery )
            {
            // InternalOpenDictatorDsl.g:1647:2: ( ruleJsonQuery )
            // InternalOpenDictatorDsl.g:1648:3: ruleJsonQuery
            {
             before(grammarAccess.getStatementAccess().getJsonqueryJsonQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonQuery();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getJsonqueryJsonQueryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__JsonqueryAssignment_1"


    // $ANTLR start "rule__Statement__EvaluationOperatorAssignment_2"
    // InternalOpenDictatorDsl.g:1657:1: rule__Statement__EvaluationOperatorAssignment_2 : ( ruleEvaluationOperator ) ;
    public final void rule__Statement__EvaluationOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1661:1: ( ( ruleEvaluationOperator ) )
            // InternalOpenDictatorDsl.g:1662:2: ( ruleEvaluationOperator )
            {
            // InternalOpenDictatorDsl.g:1662:2: ( ruleEvaluationOperator )
            // InternalOpenDictatorDsl.g:1663:3: ruleEvaluationOperator
            {
             before(grammarAccess.getStatementAccess().getEvaluationOperatorEvaluationOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationOperator();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getEvaluationOperatorEvaluationOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Statement__EvaluationOperatorAssignment_2"


    // $ANTLR start "rule__Statement__ValueAssignment_3"
    // InternalOpenDictatorDsl.g:1672:1: rule__Statement__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Statement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1676:1: ( ( ruleValue ) )
            // InternalOpenDictatorDsl.g:1677:2: ( ruleValue )
            {
            // InternalOpenDictatorDsl.g:1677:2: ( ruleValue )
            // InternalOpenDictatorDsl.g:1678:3: ruleValue
            {
             before(grammarAccess.getStatementAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getValueValueParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Statement__ValueAssignment_3"


    // $ANTLR start "rule__JsonQuery__QueryStringAssignment"
    // InternalOpenDictatorDsl.g:1687:1: rule__JsonQuery__QueryStringAssignment : ( ruleEString ) ;
    public final void rule__JsonQuery__QueryStringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1691:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:1692:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:1692:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:1693:3: ruleEString
            {
             before(grammarAccess.getJsonQueryAccess().getQueryStringEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJsonQueryAccess().getQueryStringEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__JsonQuery__QueryStringAssignment"


    // $ANTLR start "rule__Value__TypeAssignment_1"
    // InternalOpenDictatorDsl.g:1702:1: rule__Value__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__Value__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1706:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:1707:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:1707:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:1708:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getTypeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Value__TypeAssignment_1"


    // $ANTLR start "rule__Value__ValueAssignment_4"
    // InternalOpenDictatorDsl.g:1717:1: rule__Value__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__Value__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOpenDictatorDsl.g:1721:1: ( ( ruleEString ) )
            // InternalOpenDictatorDsl.g:1722:2: ( ruleEString )
            {
            // InternalOpenDictatorDsl.g:1722:2: ( ruleEString )
            // InternalOpenDictatorDsl.g:1723:3: ruleEString
            {
             before(grammarAccess.getValueAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Value__ValueAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000FF830L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});

}