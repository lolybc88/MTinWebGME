package org.xtext.example.webgme.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.webgme.services.MTLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMTLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Set'", "'Sequence'", "'Bag'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'rule'", "'{'", "'from'", "'to'", "'}'", "'('", "')'", "':'", "'<-'", "'.'", "'->'", "'if'", "'then'", "'else'", "'endif'", "'resolve'", "','", "'()'", "'size'", "'first'", "'last'", "'indexOf'", "'allInstances'", "'forAll'", "'|'", "'exists'", "'select'", "'collect'", "'isTypeOf'", "'toString'", "'concatenate'", "'union'", "'intersection'", "'isUndefined'", "'null'", "'not'", "'children()'", "'parent()'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMTLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g"; }


     
     	private MTLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MTLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:69:1: ruleModel : ( ( rule__Model__RulesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:73:2: ( ( ( rule__Model__RulesAssignment )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:74:1: ( ( rule__Model__RulesAssignment )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:74:1: ( ( rule__Model__RulesAssignment )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:75:1: ( rule__Model__RulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:76:1: ( rule__Model__RulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:76:2: rule__Model__RulesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__RulesAssignment_in_ruleModel94);
            	    rule__Model__RulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:88:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:89:1: ( ruleRule EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:90:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule122);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule129); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:97:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:101:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:102:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:102:1: ( ( rule__Rule__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:103:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:104:1: ( rule__Rule__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:104:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule155);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleInPattern"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:116:1: entryRuleInPattern : ruleInPattern EOF ;
    public final void entryRuleInPattern() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:117:1: ( ruleInPattern EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:118:1: ruleInPattern EOF
            {
             before(grammarAccess.getInPatternRule()); 
            pushFollow(FOLLOW_ruleInPattern_in_entryRuleInPattern182);
            ruleInPattern();

            state._fsp--;

             after(grammarAccess.getInPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInPattern189); 

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
    // $ANTLR end "entryRuleInPattern"


    // $ANTLR start "ruleInPattern"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:125:1: ruleInPattern : ( ( rule__InPattern__Group__0 ) ) ;
    public final void ruleInPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:129:2: ( ( ( rule__InPattern__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:130:1: ( ( rule__InPattern__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:130:1: ( ( rule__InPattern__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:131:1: ( rule__InPattern__Group__0 )
            {
             before(grammarAccess.getInPatternAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:132:1: ( rule__InPattern__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:132:2: rule__InPattern__Group__0
            {
            pushFollow(FOLLOW_rule__InPattern__Group__0_in_ruleInPattern215);
            rule__InPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInPatternAccess().getGroup()); 

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
    // $ANTLR end "ruleInPattern"


    // $ANTLR start "entryRuleFilter"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:144:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:145:1: ( ruleFilter EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:146:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_ruleFilter_in_entryRuleFilter242);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilter249); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:153:1: ruleFilter : ( ( rule__Filter__ExprAssignment ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:157:2: ( ( ( rule__Filter__ExprAssignment ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:158:1: ( ( rule__Filter__ExprAssignment ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:158:1: ( ( rule__Filter__ExprAssignment ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:159:1: ( rule__Filter__ExprAssignment )
            {
             before(grammarAccess.getFilterAccess().getExprAssignment()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:160:1: ( rule__Filter__ExprAssignment )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:160:2: rule__Filter__ExprAssignment
            {
            pushFollow(FOLLOW_rule__Filter__ExprAssignment_in_ruleFilter275);
            rule__Filter__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getExprAssignment()); 

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleOutPattern"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:172:1: entryRuleOutPattern : ruleOutPattern EOF ;
    public final void entryRuleOutPattern() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:173:1: ( ruleOutPattern EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:174:1: ruleOutPattern EOF
            {
             before(grammarAccess.getOutPatternRule()); 
            pushFollow(FOLLOW_ruleOutPattern_in_entryRuleOutPattern302);
            ruleOutPattern();

            state._fsp--;

             after(grammarAccess.getOutPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutPattern309); 

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
    // $ANTLR end "entryRuleOutPattern"


    // $ANTLR start "ruleOutPattern"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:181:1: ruleOutPattern : ( ( rule__OutPattern__Group__0 ) ) ;
    public final void ruleOutPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:185:2: ( ( ( rule__OutPattern__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:186:1: ( ( rule__OutPattern__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:186:1: ( ( rule__OutPattern__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:187:1: ( rule__OutPattern__Group__0 )
            {
             before(grammarAccess.getOutPatternAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:188:1: ( rule__OutPattern__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:188:2: rule__OutPattern__Group__0
            {
            pushFollow(FOLLOW_rule__OutPattern__Group__0_in_ruleOutPattern335);
            rule__OutPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutPatternAccess().getGroup()); 

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
    // $ANTLR end "ruleOutPattern"


    // $ANTLR start "entryRuleAssignation"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:200:1: entryRuleAssignation : ruleAssignation EOF ;
    public final void entryRuleAssignation() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:201:1: ( ruleAssignation EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:202:1: ruleAssignation EOF
            {
             before(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_ruleAssignation_in_entryRuleAssignation362);
            ruleAssignation();

            state._fsp--;

             after(grammarAccess.getAssignationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignation369); 

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
    // $ANTLR end "entryRuleAssignation"


    // $ANTLR start "ruleAssignation"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:209:1: ruleAssignation : ( ( rule__Assignation__Alternatives ) ) ;
    public final void ruleAssignation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:213:2: ( ( ( rule__Assignation__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:214:1: ( ( rule__Assignation__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:214:1: ( ( rule__Assignation__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:215:1: ( rule__Assignation__Alternatives )
            {
             before(grammarAccess.getAssignationAccess().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:216:1: ( rule__Assignation__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:216:2: rule__Assignation__Alternatives
            {
            pushFollow(FOLLOW_rule__Assignation__Alternatives_in_ruleAssignation395);
            rule__Assignation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAssignation"


    // $ANTLR start "entryRuleSimpleExpression"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:228:1: entryRuleSimpleExpression : ruleSimpleExpression EOF ;
    public final void entryRuleSimpleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:229:1: ( ruleSimpleExpression EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:230:1: ruleSimpleExpression EOF
            {
             before(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression422);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression429); 

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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:237:1: ruleSimpleExpression : ( ( rule__SimpleExpression__Alternatives ) ) ;
    public final void ruleSimpleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:241:2: ( ( ( rule__SimpleExpression__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:242:1: ( ( rule__SimpleExpression__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:242:1: ( ( rule__SimpleExpression__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:243:1: ( rule__SimpleExpression__Alternatives )
            {
             before(grammarAccess.getSimpleExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:244:1: ( rule__SimpleExpression__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:244:2: rule__SimpleExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression455);
            rule__SimpleExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleNavig"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:256:1: entryRuleNavig : ruleNavig EOF ;
    public final void entryRuleNavig() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:257:1: ( ruleNavig EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:258:1: ruleNavig EOF
            {
             before(grammarAccess.getNavigRule()); 
            pushFollow(FOLLOW_ruleNavig_in_entryRuleNavig482);
            ruleNavig();

            state._fsp--;

             after(grammarAccess.getNavigRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavig489); 

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
    // $ANTLR end "entryRuleNavig"


    // $ANTLR start "ruleNavig"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:265:1: ruleNavig : ( ( rule__Navig__Group__0 ) ) ;
    public final void ruleNavig() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:269:2: ( ( ( rule__Navig__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:270:1: ( ( rule__Navig__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:270:1: ( ( rule__Navig__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:271:1: ( rule__Navig__Group__0 )
            {
             before(grammarAccess.getNavigAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:272:1: ( rule__Navig__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:272:2: rule__Navig__Group__0
            {
            pushFollow(FOLLOW_rule__Navig__Group__0_in_ruleNavig515);
            rule__Navig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigAccess().getGroup()); 

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
    // $ANTLR end "ruleNavig"


    // $ANTLR start "entryRuleNavigation"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:284:1: entryRuleNavigation : ruleNavigation EOF ;
    public final void entryRuleNavigation() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:285:1: ( ruleNavigation EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:286:1: ruleNavigation EOF
            {
             before(grammarAccess.getNavigationRule()); 
            pushFollow(FOLLOW_ruleNavigation_in_entryRuleNavigation542);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getNavigationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigation549); 

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
    // $ANTLR end "entryRuleNavigation"


    // $ANTLR start "ruleNavigation"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:293:1: ruleNavigation : ( ( rule__Navigation__Alternatives ) ) ;
    public final void ruleNavigation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:297:2: ( ( ( rule__Navigation__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:298:1: ( ( rule__Navigation__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:298:1: ( ( rule__Navigation__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:299:1: ( rule__Navigation__Alternatives )
            {
             before(grammarAccess.getNavigationAccess().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:300:1: ( rule__Navigation__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:300:2: rule__Navigation__Alternatives
            {
            pushFollow(FOLLOW_rule__Navigation__Alternatives_in_ruleNavigation575);
            rule__Navigation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNavigation"


    // $ANTLR start "entryRuleIfSentence"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:312:1: entryRuleIfSentence : ruleIfSentence EOF ;
    public final void entryRuleIfSentence() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:313:1: ( ruleIfSentence EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:314:1: ruleIfSentence EOF
            {
             before(grammarAccess.getIfSentenceRule()); 
            pushFollow(FOLLOW_ruleIfSentence_in_entryRuleIfSentence602);
            ruleIfSentence();

            state._fsp--;

             after(grammarAccess.getIfSentenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSentence609); 

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
    // $ANTLR end "entryRuleIfSentence"


    // $ANTLR start "ruleIfSentence"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:321:1: ruleIfSentence : ( ( rule__IfSentence__Group__0 ) ) ;
    public final void ruleIfSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:325:2: ( ( ( rule__IfSentence__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:326:1: ( ( rule__IfSentence__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:326:1: ( ( rule__IfSentence__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:327:1: ( rule__IfSentence__Group__0 )
            {
             before(grammarAccess.getIfSentenceAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:328:1: ( rule__IfSentence__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:328:2: rule__IfSentence__Group__0
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__0_in_ruleIfSentence635);
            rule__IfSentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfSentenceAccess().getGroup()); 

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
    // $ANTLR end "ruleIfSentence"


    // $ANTLR start "entryRuleResolveExp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:340:1: entryRuleResolveExp : ruleResolveExp EOF ;
    public final void entryRuleResolveExp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:341:1: ( ruleResolveExp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:342:1: ruleResolveExp EOF
            {
             before(grammarAccess.getResolveExpRule()); 
            pushFollow(FOLLOW_ruleResolveExp_in_entryRuleResolveExp662);
            ruleResolveExp();

            state._fsp--;

             after(grammarAccess.getResolveExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResolveExp669); 

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
    // $ANTLR end "entryRuleResolveExp"


    // $ANTLR start "ruleResolveExp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:349:1: ruleResolveExp : ( ( rule__ResolveExp__Group__0 ) ) ;
    public final void ruleResolveExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:353:2: ( ( ( rule__ResolveExp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:354:1: ( ( rule__ResolveExp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:354:1: ( ( rule__ResolveExp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:355:1: ( rule__ResolveExp__Group__0 )
            {
             before(grammarAccess.getResolveExpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:356:1: ( rule__ResolveExp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:356:2: rule__ResolveExp__Group__0
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group__0_in_ruleResolveExp695);
            rule__ResolveExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResolveExpAccess().getGroup()); 

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
    // $ANTLR end "ruleResolveExp"


    // $ANTLR start "entryRuleComplexExpression"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:368:1: entryRuleComplexExpression : ruleComplexExpression EOF ;
    public final void entryRuleComplexExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:369:1: ( ruleComplexExpression EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:370:1: ruleComplexExpression EOF
            {
             before(grammarAccess.getComplexExpressionRule()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_entryRuleComplexExpression722);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getComplexExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexExpression729); 

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
    // $ANTLR end "entryRuleComplexExpression"


    // $ANTLR start "ruleComplexExpression"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:377:1: ruleComplexExpression : ( ( rule__ComplexExpression__Alternatives ) ) ;
    public final void ruleComplexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:381:2: ( ( ( rule__ComplexExpression__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:382:1: ( ( rule__ComplexExpression__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:382:1: ( ( rule__ComplexExpression__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:383:1: ( rule__ComplexExpression__Alternatives )
            {
             before(grammarAccess.getComplexExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:384:1: ( rule__ComplexExpression__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:384:2: rule__ComplexExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Alternatives_in_ruleComplexExpression755);
            rule__ComplexExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComplexExpression"


    // $ANTLR start "entryRuleAssocRoleName"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:396:1: entryRuleAssocRoleName : ruleAssocRoleName EOF ;
    public final void entryRuleAssocRoleName() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:397:1: ( ruleAssocRoleName EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:398:1: ruleAssocRoleName EOF
            {
             before(grammarAccess.getAssocRoleNameRule()); 
            pushFollow(FOLLOW_ruleAssocRoleName_in_entryRuleAssocRoleName782);
            ruleAssocRoleName();

            state._fsp--;

             after(grammarAccess.getAssocRoleNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssocRoleName789); 

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
    // $ANTLR end "entryRuleAssocRoleName"


    // $ANTLR start "ruleAssocRoleName"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:405:1: ruleAssocRoleName : ( ( rule__AssocRoleName__Alternatives ) ) ;
    public final void ruleAssocRoleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:409:2: ( ( ( rule__AssocRoleName__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:410:1: ( ( rule__AssocRoleName__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:410:1: ( ( rule__AssocRoleName__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:411:1: ( rule__AssocRoleName__Alternatives )
            {
             before(grammarAccess.getAssocRoleNameAccess().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:412:1: ( rule__AssocRoleName__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:412:2: rule__AssocRoleName__Alternatives
            {
            pushFollow(FOLLOW_rule__AssocRoleName__Alternatives_in_ruleAssocRoleName815);
            rule__AssocRoleName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssocRoleNameAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAssocRoleName"


    // $ANTLR start "entryRuleCollectionType"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:424:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:425:1: ( ruleCollectionType EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:426:1: ruleCollectionType EOF
            {
             before(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType842);
            ruleCollectionType();

            state._fsp--;

             after(grammarAccess.getCollectionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType849); 

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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:433:1: ruleCollectionType : ( ( rule__CollectionType__Alternatives ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:437:2: ( ( ( rule__CollectionType__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:438:1: ( ( rule__CollectionType__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:438:1: ( ( rule__CollectionType__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:439:1: ( rule__CollectionType__Alternatives )
            {
             before(grammarAccess.getCollectionTypeAccess().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:440:1: ( rule__CollectionType__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:440:2: rule__CollectionType__Alternatives
            {
            pushFollow(FOLLOW_rule__CollectionType__Alternatives_in_ruleCollectionType875);
            rule__CollectionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleOCLOperationType1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:452:1: entryRuleOCLOperationType1 : ruleOCLOperationType1 EOF ;
    public final void entryRuleOCLOperationType1() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:453:1: ( ruleOCLOperationType1 EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:454:1: ruleOCLOperationType1 EOF
            {
             before(grammarAccess.getOCLOperationType1Rule()); 
            pushFollow(FOLLOW_ruleOCLOperationType1_in_entryRuleOCLOperationType1902);
            ruleOCLOperationType1();

            state._fsp--;

             after(grammarAccess.getOCLOperationType1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOCLOperationType1909); 

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
    // $ANTLR end "entryRuleOCLOperationType1"


    // $ANTLR start "ruleOCLOperationType1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:461:1: ruleOCLOperationType1 : ( ( rule__OCLOperationType1__Alternatives ) ) ;
    public final void ruleOCLOperationType1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:465:2: ( ( ( rule__OCLOperationType1__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:466:1: ( ( rule__OCLOperationType1__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:466:1: ( ( rule__OCLOperationType1__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:467:1: ( rule__OCLOperationType1__Alternatives )
            {
             before(grammarAccess.getOCLOperationType1Access().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:468:1: ( rule__OCLOperationType1__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:468:2: rule__OCLOperationType1__Alternatives
            {
            pushFollow(FOLLOW_rule__OCLOperationType1__Alternatives_in_ruleOCLOperationType1935);
            rule__OCLOperationType1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOCLOperationType1Access().getAlternatives()); 

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
    // $ANTLR end "ruleOCLOperationType1"


    // $ANTLR start "entryRuleOCLOperationType2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:480:1: entryRuleOCLOperationType2 : ruleOCLOperationType2 EOF ;
    public final void entryRuleOCLOperationType2() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:481:1: ( ruleOCLOperationType2 EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:482:1: ruleOCLOperationType2 EOF
            {
             before(grammarAccess.getOCLOperationType2Rule()); 
            pushFollow(FOLLOW_ruleOCLOperationType2_in_entryRuleOCLOperationType2962);
            ruleOCLOperationType2();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOCLOperationType2969); 

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
    // $ANTLR end "entryRuleOCLOperationType2"


    // $ANTLR start "ruleOCLOperationType2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:489:1: ruleOCLOperationType2 : ( ( rule__OCLOperationType2__Alternatives ) ) ;
    public final void ruleOCLOperationType2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:493:2: ( ( ( rule__OCLOperationType2__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:494:1: ( ( rule__OCLOperationType2__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:494:1: ( ( rule__OCLOperationType2__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:495:1: ( rule__OCLOperationType2__Alternatives )
            {
             before(grammarAccess.getOCLOperationType2Access().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:496:1: ( rule__OCLOperationType2__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:496:2: rule__OCLOperationType2__Alternatives
            {
            pushFollow(FOLLOW_rule__OCLOperationType2__Alternatives_in_ruleOCLOperationType2995);
            rule__OCLOperationType2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOCLOperationType2Access().getAlternatives()); 

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
    // $ANTLR end "ruleOCLOperationType2"


    // $ANTLR start "entryRuleInfixPrimitiveOperator"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:508:1: entryRuleInfixPrimitiveOperator : ruleInfixPrimitiveOperator EOF ;
    public final void entryRuleInfixPrimitiveOperator() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:509:1: ( ruleInfixPrimitiveOperator EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:510:1: ruleInfixPrimitiveOperator EOF
            {
             before(grammarAccess.getInfixPrimitiveOperatorRule()); 
            pushFollow(FOLLOW_ruleInfixPrimitiveOperator_in_entryRuleInfixPrimitiveOperator1022);
            ruleInfixPrimitiveOperator();

            state._fsp--;

             after(grammarAccess.getInfixPrimitiveOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixPrimitiveOperator1029); 

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
    // $ANTLR end "entryRuleInfixPrimitiveOperator"


    // $ANTLR start "ruleInfixPrimitiveOperator"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:517:1: ruleInfixPrimitiveOperator : ( ( rule__InfixPrimitiveOperator__Alternatives ) ) ;
    public final void ruleInfixPrimitiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:521:2: ( ( ( rule__InfixPrimitiveOperator__Alternatives ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:522:1: ( ( rule__InfixPrimitiveOperator__Alternatives ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:522:1: ( ( rule__InfixPrimitiveOperator__Alternatives ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:523:1: ( rule__InfixPrimitiveOperator__Alternatives )
            {
             before(grammarAccess.getInfixPrimitiveOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:524:1: ( rule__InfixPrimitiveOperator__Alternatives )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:524:2: rule__InfixPrimitiveOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__InfixPrimitiveOperator__Alternatives_in_ruleInfixPrimitiveOperator1055);
            rule__InfixPrimitiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInfixPrimitiveOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInfixPrimitiveOperator"


    // $ANTLR start "entryRuleSizeOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:536:1: entryRuleSizeOp : ruleSizeOp EOF ;
    public final void entryRuleSizeOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:537:1: ( ruleSizeOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:538:1: ruleSizeOp EOF
            {
             before(grammarAccess.getSizeOpRule()); 
            pushFollow(FOLLOW_ruleSizeOp_in_entryRuleSizeOp1082);
            ruleSizeOp();

            state._fsp--;

             after(grammarAccess.getSizeOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeOp1089); 

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
    // $ANTLR end "entryRuleSizeOp"


    // $ANTLR start "ruleSizeOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:545:1: ruleSizeOp : ( ( rule__SizeOp__Group__0 ) ) ;
    public final void ruleSizeOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:549:2: ( ( ( rule__SizeOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:550:1: ( ( rule__SizeOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:550:1: ( ( rule__SizeOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:551:1: ( rule__SizeOp__Group__0 )
            {
             before(grammarAccess.getSizeOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:552:1: ( rule__SizeOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:552:2: rule__SizeOp__Group__0
            {
            pushFollow(FOLLOW_rule__SizeOp__Group__0_in_ruleSizeOp1115);
            rule__SizeOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeOpAccess().getGroup()); 

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
    // $ANTLR end "ruleSizeOp"


    // $ANTLR start "entryRuleFirstOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:564:1: entryRuleFirstOp : ruleFirstOp EOF ;
    public final void entryRuleFirstOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:565:1: ( ruleFirstOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:566:1: ruleFirstOp EOF
            {
             before(grammarAccess.getFirstOpRule()); 
            pushFollow(FOLLOW_ruleFirstOp_in_entryRuleFirstOp1142);
            ruleFirstOp();

            state._fsp--;

             after(grammarAccess.getFirstOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFirstOp1149); 

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
    // $ANTLR end "entryRuleFirstOp"


    // $ANTLR start "ruleFirstOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:573:1: ruleFirstOp : ( ( rule__FirstOp__Group__0 ) ) ;
    public final void ruleFirstOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:577:2: ( ( ( rule__FirstOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:578:1: ( ( rule__FirstOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:578:1: ( ( rule__FirstOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:579:1: ( rule__FirstOp__Group__0 )
            {
             before(grammarAccess.getFirstOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:580:1: ( rule__FirstOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:580:2: rule__FirstOp__Group__0
            {
            pushFollow(FOLLOW_rule__FirstOp__Group__0_in_ruleFirstOp1175);
            rule__FirstOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFirstOpAccess().getGroup()); 

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
    // $ANTLR end "ruleFirstOp"


    // $ANTLR start "entryRuleLastOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:592:1: entryRuleLastOp : ruleLastOp EOF ;
    public final void entryRuleLastOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:593:1: ( ruleLastOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:594:1: ruleLastOp EOF
            {
             before(grammarAccess.getLastOpRule()); 
            pushFollow(FOLLOW_ruleLastOp_in_entryRuleLastOp1202);
            ruleLastOp();

            state._fsp--;

             after(grammarAccess.getLastOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLastOp1209); 

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
    // $ANTLR end "entryRuleLastOp"


    // $ANTLR start "ruleLastOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:601:1: ruleLastOp : ( ( rule__LastOp__Group__0 ) ) ;
    public final void ruleLastOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:605:2: ( ( ( rule__LastOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:606:1: ( ( rule__LastOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:606:1: ( ( rule__LastOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:607:1: ( rule__LastOp__Group__0 )
            {
             before(grammarAccess.getLastOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:608:1: ( rule__LastOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:608:2: rule__LastOp__Group__0
            {
            pushFollow(FOLLOW_rule__LastOp__Group__0_in_ruleLastOp1235);
            rule__LastOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLastOpAccess().getGroup()); 

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
    // $ANTLR end "ruleLastOp"


    // $ANTLR start "entryRuleIndexOfOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:620:1: entryRuleIndexOfOp : ruleIndexOfOp EOF ;
    public final void entryRuleIndexOfOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:621:1: ( ruleIndexOfOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:622:1: ruleIndexOfOp EOF
            {
             before(grammarAccess.getIndexOfOpRule()); 
            pushFollow(FOLLOW_ruleIndexOfOp_in_entryRuleIndexOfOp1262);
            ruleIndexOfOp();

            state._fsp--;

             after(grammarAccess.getIndexOfOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexOfOp1269); 

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
    // $ANTLR end "entryRuleIndexOfOp"


    // $ANTLR start "ruleIndexOfOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:629:1: ruleIndexOfOp : ( ( rule__IndexOfOp__Group__0 ) ) ;
    public final void ruleIndexOfOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:633:2: ( ( ( rule__IndexOfOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:634:1: ( ( rule__IndexOfOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:634:1: ( ( rule__IndexOfOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:635:1: ( rule__IndexOfOp__Group__0 )
            {
             before(grammarAccess.getIndexOfOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:636:1: ( rule__IndexOfOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:636:2: rule__IndexOfOp__Group__0
            {
            pushFollow(FOLLOW_rule__IndexOfOp__Group__0_in_ruleIndexOfOp1295);
            rule__IndexOfOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIndexOfOpAccess().getGroup()); 

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
    // $ANTLR end "ruleIndexOfOp"


    // $ANTLR start "entryRuleAllInstancesOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:648:1: entryRuleAllInstancesOp : ruleAllInstancesOp EOF ;
    public final void entryRuleAllInstancesOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:649:1: ( ruleAllInstancesOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:650:1: ruleAllInstancesOp EOF
            {
             before(grammarAccess.getAllInstancesOpRule()); 
            pushFollow(FOLLOW_ruleAllInstancesOp_in_entryRuleAllInstancesOp1322);
            ruleAllInstancesOp();

            state._fsp--;

             after(grammarAccess.getAllInstancesOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllInstancesOp1329); 

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
    // $ANTLR end "entryRuleAllInstancesOp"


    // $ANTLR start "ruleAllInstancesOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:657:1: ruleAllInstancesOp : ( ( rule__AllInstancesOp__Group__0 ) ) ;
    public final void ruleAllInstancesOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:661:2: ( ( ( rule__AllInstancesOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:662:1: ( ( rule__AllInstancesOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:662:1: ( ( rule__AllInstancesOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:663:1: ( rule__AllInstancesOp__Group__0 )
            {
             before(grammarAccess.getAllInstancesOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:664:1: ( rule__AllInstancesOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:664:2: rule__AllInstancesOp__Group__0
            {
            pushFollow(FOLLOW_rule__AllInstancesOp__Group__0_in_ruleAllInstancesOp1355);
            rule__AllInstancesOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllInstancesOpAccess().getGroup()); 

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
    // $ANTLR end "ruleAllInstancesOp"


    // $ANTLR start "entryRuleForAllOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:676:1: entryRuleForAllOp : ruleForAllOp EOF ;
    public final void entryRuleForAllOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:677:1: ( ruleForAllOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:678:1: ruleForAllOp EOF
            {
             before(grammarAccess.getForAllOpRule()); 
            pushFollow(FOLLOW_ruleForAllOp_in_entryRuleForAllOp1382);
            ruleForAllOp();

            state._fsp--;

             after(grammarAccess.getForAllOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAllOp1389); 

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
    // $ANTLR end "entryRuleForAllOp"


    // $ANTLR start "ruleForAllOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:685:1: ruleForAllOp : ( ( rule__ForAllOp__Group__0 ) ) ;
    public final void ruleForAllOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:689:2: ( ( ( rule__ForAllOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:690:1: ( ( rule__ForAllOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:690:1: ( ( rule__ForAllOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:691:1: ( rule__ForAllOp__Group__0 )
            {
             before(grammarAccess.getForAllOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:692:1: ( rule__ForAllOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:692:2: rule__ForAllOp__Group__0
            {
            pushFollow(FOLLOW_rule__ForAllOp__Group__0_in_ruleForAllOp1415);
            rule__ForAllOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForAllOpAccess().getGroup()); 

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
    // $ANTLR end "ruleForAllOp"


    // $ANTLR start "entryRuleExistsOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:704:1: entryRuleExistsOp : ruleExistsOp EOF ;
    public final void entryRuleExistsOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:705:1: ( ruleExistsOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:706:1: ruleExistsOp EOF
            {
             before(grammarAccess.getExistsOpRule()); 
            pushFollow(FOLLOW_ruleExistsOp_in_entryRuleExistsOp1442);
            ruleExistsOp();

            state._fsp--;

             after(grammarAccess.getExistsOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsOp1449); 

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
    // $ANTLR end "entryRuleExistsOp"


    // $ANTLR start "ruleExistsOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:713:1: ruleExistsOp : ( ( rule__ExistsOp__Group__0 ) ) ;
    public final void ruleExistsOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:717:2: ( ( ( rule__ExistsOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:718:1: ( ( rule__ExistsOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:718:1: ( ( rule__ExistsOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:719:1: ( rule__ExistsOp__Group__0 )
            {
             before(grammarAccess.getExistsOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:720:1: ( rule__ExistsOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:720:2: rule__ExistsOp__Group__0
            {
            pushFollow(FOLLOW_rule__ExistsOp__Group__0_in_ruleExistsOp1475);
            rule__ExistsOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistsOpAccess().getGroup()); 

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
    // $ANTLR end "ruleExistsOp"


    // $ANTLR start "entryRuleSelectOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:732:1: entryRuleSelectOp : ruleSelectOp EOF ;
    public final void entryRuleSelectOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:733:1: ( ruleSelectOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:734:1: ruleSelectOp EOF
            {
             before(grammarAccess.getSelectOpRule()); 
            pushFollow(FOLLOW_ruleSelectOp_in_entryRuleSelectOp1502);
            ruleSelectOp();

            state._fsp--;

             after(grammarAccess.getSelectOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectOp1509); 

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
    // $ANTLR end "entryRuleSelectOp"


    // $ANTLR start "ruleSelectOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:741:1: ruleSelectOp : ( ( rule__SelectOp__Group__0 ) ) ;
    public final void ruleSelectOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:745:2: ( ( ( rule__SelectOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:746:1: ( ( rule__SelectOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:746:1: ( ( rule__SelectOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:747:1: ( rule__SelectOp__Group__0 )
            {
             before(grammarAccess.getSelectOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:748:1: ( rule__SelectOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:748:2: rule__SelectOp__Group__0
            {
            pushFollow(FOLLOW_rule__SelectOp__Group__0_in_ruleSelectOp1535);
            rule__SelectOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectOpAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectOp"


    // $ANTLR start "entryRuleCollectOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:760:1: entryRuleCollectOp : ruleCollectOp EOF ;
    public final void entryRuleCollectOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:761:1: ( ruleCollectOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:762:1: ruleCollectOp EOF
            {
             before(grammarAccess.getCollectOpRule()); 
            pushFollow(FOLLOW_ruleCollectOp_in_entryRuleCollectOp1562);
            ruleCollectOp();

            state._fsp--;

             after(grammarAccess.getCollectOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectOp1569); 

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
    // $ANTLR end "entryRuleCollectOp"


    // $ANTLR start "ruleCollectOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:769:1: ruleCollectOp : ( ( rule__CollectOp__Group__0 ) ) ;
    public final void ruleCollectOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:773:2: ( ( ( rule__CollectOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:774:1: ( ( rule__CollectOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:774:1: ( ( rule__CollectOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:775:1: ( rule__CollectOp__Group__0 )
            {
             before(grammarAccess.getCollectOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:776:1: ( rule__CollectOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:776:2: rule__CollectOp__Group__0
            {
            pushFollow(FOLLOW_rule__CollectOp__Group__0_in_ruleCollectOp1595);
            rule__CollectOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectOpAccess().getGroup()); 

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
    // $ANTLR end "ruleCollectOp"


    // $ANTLR start "entryRuleIsTypeOfOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:788:1: entryRuleIsTypeOfOp : ruleIsTypeOfOp EOF ;
    public final void entryRuleIsTypeOfOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:789:1: ( ruleIsTypeOfOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:790:1: ruleIsTypeOfOp EOF
            {
             before(grammarAccess.getIsTypeOfOpRule()); 
            pushFollow(FOLLOW_ruleIsTypeOfOp_in_entryRuleIsTypeOfOp1622);
            ruleIsTypeOfOp();

            state._fsp--;

             after(grammarAccess.getIsTypeOfOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsTypeOfOp1629); 

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
    // $ANTLR end "entryRuleIsTypeOfOp"


    // $ANTLR start "ruleIsTypeOfOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:797:1: ruleIsTypeOfOp : ( ( rule__IsTypeOfOp__Group__0 ) ) ;
    public final void ruleIsTypeOfOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:801:2: ( ( ( rule__IsTypeOfOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:802:1: ( ( rule__IsTypeOfOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:802:1: ( ( rule__IsTypeOfOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:803:1: ( rule__IsTypeOfOp__Group__0 )
            {
             before(grammarAccess.getIsTypeOfOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:804:1: ( rule__IsTypeOfOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:804:2: rule__IsTypeOfOp__Group__0
            {
            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__0_in_ruleIsTypeOfOp1655);
            rule__IsTypeOfOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsTypeOfOpAccess().getGroup()); 

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
    // $ANTLR end "ruleIsTypeOfOp"


    // $ANTLR start "entryRuleToStringOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:816:1: entryRuleToStringOp : ruleToStringOp EOF ;
    public final void entryRuleToStringOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:817:1: ( ruleToStringOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:818:1: ruleToStringOp EOF
            {
             before(grammarAccess.getToStringOpRule()); 
            pushFollow(FOLLOW_ruleToStringOp_in_entryRuleToStringOp1682);
            ruleToStringOp();

            state._fsp--;

             after(grammarAccess.getToStringOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToStringOp1689); 

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
    // $ANTLR end "entryRuleToStringOp"


    // $ANTLR start "ruleToStringOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:825:1: ruleToStringOp : ( ( rule__ToStringOp__Group__0 ) ) ;
    public final void ruleToStringOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:829:2: ( ( ( rule__ToStringOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:830:1: ( ( rule__ToStringOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:830:1: ( ( rule__ToStringOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:831:1: ( rule__ToStringOp__Group__0 )
            {
             before(grammarAccess.getToStringOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:832:1: ( rule__ToStringOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:832:2: rule__ToStringOp__Group__0
            {
            pushFollow(FOLLOW_rule__ToStringOp__Group__0_in_ruleToStringOp1715);
            rule__ToStringOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToStringOpAccess().getGroup()); 

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
    // $ANTLR end "ruleToStringOp"


    // $ANTLR start "entryRuleConcatOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:844:1: entryRuleConcatOp : ruleConcatOp EOF ;
    public final void entryRuleConcatOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:845:1: ( ruleConcatOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:846:1: ruleConcatOp EOF
            {
             before(grammarAccess.getConcatOpRule()); 
            pushFollow(FOLLOW_ruleConcatOp_in_entryRuleConcatOp1742);
            ruleConcatOp();

            state._fsp--;

             after(grammarAccess.getConcatOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatOp1749); 

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
    // $ANTLR end "entryRuleConcatOp"


    // $ANTLR start "ruleConcatOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:853:1: ruleConcatOp : ( ( rule__ConcatOp__Group__0 ) ) ;
    public final void ruleConcatOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:857:2: ( ( ( rule__ConcatOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:858:1: ( ( rule__ConcatOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:858:1: ( ( rule__ConcatOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:859:1: ( rule__ConcatOp__Group__0 )
            {
             before(grammarAccess.getConcatOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:860:1: ( rule__ConcatOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:860:2: rule__ConcatOp__Group__0
            {
            pushFollow(FOLLOW_rule__ConcatOp__Group__0_in_ruleConcatOp1775);
            rule__ConcatOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatOpAccess().getGroup()); 

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
    // $ANTLR end "ruleConcatOp"


    // $ANTLR start "entryRuleUnionOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:872:1: entryRuleUnionOp : ruleUnionOp EOF ;
    public final void entryRuleUnionOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:873:1: ( ruleUnionOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:874:1: ruleUnionOp EOF
            {
             before(grammarAccess.getUnionOpRule()); 
            pushFollow(FOLLOW_ruleUnionOp_in_entryRuleUnionOp1802);
            ruleUnionOp();

            state._fsp--;

             after(grammarAccess.getUnionOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionOp1809); 

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
    // $ANTLR end "entryRuleUnionOp"


    // $ANTLR start "ruleUnionOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:881:1: ruleUnionOp : ( ( rule__UnionOp__Group__0 ) ) ;
    public final void ruleUnionOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:885:2: ( ( ( rule__UnionOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:886:1: ( ( rule__UnionOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:886:1: ( ( rule__UnionOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:887:1: ( rule__UnionOp__Group__0 )
            {
             before(grammarAccess.getUnionOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:888:1: ( rule__UnionOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:888:2: rule__UnionOp__Group__0
            {
            pushFollow(FOLLOW_rule__UnionOp__Group__0_in_ruleUnionOp1835);
            rule__UnionOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionOpAccess().getGroup()); 

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
    // $ANTLR end "ruleUnionOp"


    // $ANTLR start "entryRuleIntersectionOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:900:1: entryRuleIntersectionOp : ruleIntersectionOp EOF ;
    public final void entryRuleIntersectionOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:901:1: ( ruleIntersectionOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:902:1: ruleIntersectionOp EOF
            {
             before(grammarAccess.getIntersectionOpRule()); 
            pushFollow(FOLLOW_ruleIntersectionOp_in_entryRuleIntersectionOp1862);
            ruleIntersectionOp();

            state._fsp--;

             after(grammarAccess.getIntersectionOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntersectionOp1869); 

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
    // $ANTLR end "entryRuleIntersectionOp"


    // $ANTLR start "ruleIntersectionOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:909:1: ruleIntersectionOp : ( ( rule__IntersectionOp__Group__0 ) ) ;
    public final void ruleIntersectionOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:913:2: ( ( ( rule__IntersectionOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:914:1: ( ( rule__IntersectionOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:914:1: ( ( rule__IntersectionOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:915:1: ( rule__IntersectionOp__Group__0 )
            {
             before(grammarAccess.getIntersectionOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:916:1: ( rule__IntersectionOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:916:2: rule__IntersectionOp__Group__0
            {
            pushFollow(FOLLOW_rule__IntersectionOp__Group__0_in_ruleIntersectionOp1895);
            rule__IntersectionOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOpAccess().getGroup()); 

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
    // $ANTLR end "ruleIntersectionOp"


    // $ANTLR start "entryRuleIsUndefinedOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:928:1: entryRuleIsUndefinedOp : ruleIsUndefinedOp EOF ;
    public final void entryRuleIsUndefinedOp() throws RecognitionException {
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:929:1: ( ruleIsUndefinedOp EOF )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:930:1: ruleIsUndefinedOp EOF
            {
             before(grammarAccess.getIsUndefinedOpRule()); 
            pushFollow(FOLLOW_ruleIsUndefinedOp_in_entryRuleIsUndefinedOp1922);
            ruleIsUndefinedOp();

            state._fsp--;

             after(grammarAccess.getIsUndefinedOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsUndefinedOp1929); 

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
    // $ANTLR end "entryRuleIsUndefinedOp"


    // $ANTLR start "ruleIsUndefinedOp"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:937:1: ruleIsUndefinedOp : ( ( rule__IsUndefinedOp__Group__0 ) ) ;
    public final void ruleIsUndefinedOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:941:2: ( ( ( rule__IsUndefinedOp__Group__0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:942:1: ( ( rule__IsUndefinedOp__Group__0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:942:1: ( ( rule__IsUndefinedOp__Group__0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:943:1: ( rule__IsUndefinedOp__Group__0 )
            {
             before(grammarAccess.getIsUndefinedOpAccess().getGroup()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:944:1: ( rule__IsUndefinedOp__Group__0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:944:2: rule__IsUndefinedOp__Group__0
            {
            pushFollow(FOLLOW_rule__IsUndefinedOp__Group__0_in_ruleIsUndefinedOp1955);
            rule__IsUndefinedOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsUndefinedOpAccess().getGroup()); 

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
    // $ANTLR end "ruleIsUndefinedOp"


    // $ANTLR start "rule__Assignation__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:956:1: rule__Assignation__Alternatives : ( ( ( rule__Assignation__Group_0__0 ) ) | ( ( rule__Assignation__Group_1__0 ) ) );
    public final void rule__Assignation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:960:1: ( ( ( rule__Assignation__Group_0__0 ) ) | ( ( rule__Assignation__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==36) ) {
                    alt2=1;
                }
                else if ( (LA2_1==45) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=64 && LA2_0<=65)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:961:1: ( ( rule__Assignation__Group_0__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:961:1: ( ( rule__Assignation__Group_0__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:962:1: ( rule__Assignation__Group_0__0 )
                    {
                     before(grammarAccess.getAssignationAccess().getGroup_0()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:963:1: ( rule__Assignation__Group_0__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:963:2: rule__Assignation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Assignation__Group_0__0_in_rule__Assignation__Alternatives1991);
                    rule__Assignation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:967:6: ( ( rule__Assignation__Group_1__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:967:6: ( ( rule__Assignation__Group_1__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:968:1: ( rule__Assignation__Group_1__0 )
                    {
                     before(grammarAccess.getAssignationAccess().getGroup_1()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:969:1: ( rule__Assignation__Group_1__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:969:2: rule__Assignation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Assignation__Group_1__0_in_rule__Assignation__Alternatives2009);
                    rule__Assignation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Assignation__Alternatives"


    // $ANTLR start "rule__SimpleExpression__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:978:1: rule__SimpleExpression__Alternatives : ( ( ( rule__SimpleExpression___stringAssignment_0 ) ) | ( ( rule__SimpleExpression___integerAssignment_1 ) ) | ( ( rule__SimpleExpression___doubleAssignment_2 ) ) | ( ( rule__SimpleExpression___booleanAssignment_3 ) ) | ( ( rule__SimpleExpression__IsNullAssignment_4 ) ) | ( ( rule__SimpleExpression__NavigationAssignment_5 ) ) | ( ( rule__SimpleExpression__IfSentenceAssignment_6 ) ) | ( ( rule__SimpleExpression__Group_7__0 ) ) | ( ( rule__SimpleExpression__ResolveAssignment_8 ) ) );
    public final void rule__SimpleExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:982:1: ( ( ( rule__SimpleExpression___stringAssignment_0 ) ) | ( ( rule__SimpleExpression___integerAssignment_1 ) ) | ( ( rule__SimpleExpression___doubleAssignment_2 ) ) | ( ( rule__SimpleExpression___booleanAssignment_3 ) ) | ( ( rule__SimpleExpression__IsNullAssignment_4 ) ) | ( ( rule__SimpleExpression__NavigationAssignment_5 ) ) | ( ( rule__SimpleExpression__IfSentenceAssignment_6 ) ) | ( ( rule__SimpleExpression__Group_7__0 ) ) | ( ( rule__SimpleExpression__ResolveAssignment_8 ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt3=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=4;
                }
                break;
            case 62:
                {
                alt3=5;
                }
                break;
            case RULE_ID:
                {
                alt3=6;
                }
                break;
            case 39:
                {
                alt3=7;
                }
                break;
            case 13:
            case 14:
            case 15:
                {
                alt3=8;
                }
                break;
            case 43:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:983:1: ( ( rule__SimpleExpression___stringAssignment_0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:983:1: ( ( rule__SimpleExpression___stringAssignment_0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:984:1: ( rule__SimpleExpression___stringAssignment_0 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().get_stringAssignment_0()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:985:1: ( rule__SimpleExpression___stringAssignment_0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:985:2: rule__SimpleExpression___stringAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression___stringAssignment_0_in_rule__SimpleExpression__Alternatives2042);
                    rule__SimpleExpression___stringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().get_stringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:989:6: ( ( rule__SimpleExpression___integerAssignment_1 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:989:6: ( ( rule__SimpleExpression___integerAssignment_1 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:990:1: ( rule__SimpleExpression___integerAssignment_1 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().get_integerAssignment_1()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:991:1: ( rule__SimpleExpression___integerAssignment_1 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:991:2: rule__SimpleExpression___integerAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression___integerAssignment_1_in_rule__SimpleExpression__Alternatives2060);
                    rule__SimpleExpression___integerAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().get_integerAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:995:6: ( ( rule__SimpleExpression___doubleAssignment_2 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:995:6: ( ( rule__SimpleExpression___doubleAssignment_2 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:996:1: ( rule__SimpleExpression___doubleAssignment_2 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().get_doubleAssignment_2()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:997:1: ( rule__SimpleExpression___doubleAssignment_2 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:997:2: rule__SimpleExpression___doubleAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression___doubleAssignment_2_in_rule__SimpleExpression__Alternatives2078);
                    rule__SimpleExpression___doubleAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().get_doubleAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1001:6: ( ( rule__SimpleExpression___booleanAssignment_3 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1001:6: ( ( rule__SimpleExpression___booleanAssignment_3 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1002:1: ( rule__SimpleExpression___booleanAssignment_3 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().get_booleanAssignment_3()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1003:1: ( rule__SimpleExpression___booleanAssignment_3 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1003:2: rule__SimpleExpression___booleanAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression___booleanAssignment_3_in_rule__SimpleExpression__Alternatives2096);
                    rule__SimpleExpression___booleanAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().get_booleanAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1007:6: ( ( rule__SimpleExpression__IsNullAssignment_4 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1007:6: ( ( rule__SimpleExpression__IsNullAssignment_4 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1008:1: ( rule__SimpleExpression__IsNullAssignment_4 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getIsNullAssignment_4()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1009:1: ( rule__SimpleExpression__IsNullAssignment_4 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1009:2: rule__SimpleExpression__IsNullAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression__IsNullAssignment_4_in_rule__SimpleExpression__Alternatives2114);
                    rule__SimpleExpression__IsNullAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().getIsNullAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1013:6: ( ( rule__SimpleExpression__NavigationAssignment_5 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1013:6: ( ( rule__SimpleExpression__NavigationAssignment_5 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1014:1: ( rule__SimpleExpression__NavigationAssignment_5 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getNavigationAssignment_5()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1015:1: ( rule__SimpleExpression__NavigationAssignment_5 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1015:2: rule__SimpleExpression__NavigationAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression__NavigationAssignment_5_in_rule__SimpleExpression__Alternatives2132);
                    rule__SimpleExpression__NavigationAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().getNavigationAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1019:6: ( ( rule__SimpleExpression__IfSentenceAssignment_6 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1019:6: ( ( rule__SimpleExpression__IfSentenceAssignment_6 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1020:1: ( rule__SimpleExpression__IfSentenceAssignment_6 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getIfSentenceAssignment_6()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1021:1: ( rule__SimpleExpression__IfSentenceAssignment_6 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1021:2: rule__SimpleExpression__IfSentenceAssignment_6
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression__IfSentenceAssignment_6_in_rule__SimpleExpression__Alternatives2150);
                    rule__SimpleExpression__IfSentenceAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().getIfSentenceAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1025:6: ( ( rule__SimpleExpression__Group_7__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1025:6: ( ( rule__SimpleExpression__Group_7__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1026:1: ( rule__SimpleExpression__Group_7__0 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getGroup_7()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1027:1: ( rule__SimpleExpression__Group_7__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1027:2: rule__SimpleExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression__Group_7__0_in_rule__SimpleExpression__Alternatives2168);
                    rule__SimpleExpression__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1031:6: ( ( rule__SimpleExpression__ResolveAssignment_8 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1031:6: ( ( rule__SimpleExpression__ResolveAssignment_8 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1032:1: ( rule__SimpleExpression__ResolveAssignment_8 )
                    {
                     before(grammarAccess.getSimpleExpressionAccess().getResolveAssignment_8()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1033:1: ( rule__SimpleExpression__ResolveAssignment_8 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1033:2: rule__SimpleExpression__ResolveAssignment_8
                    {
                    pushFollow(FOLLOW_rule__SimpleExpression__ResolveAssignment_8_in_rule__SimpleExpression__Alternatives2186);
                    rule__SimpleExpression__ResolveAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleExpressionAccess().getResolveAssignment_8()); 

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
    // $ANTLR end "rule__SimpleExpression__Alternatives"


    // $ANTLR start "rule__Navigation__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1042:1: rule__Navigation__Alternatives : ( ( ( rule__Navigation__Group_0__0 ) ) | ( ( rule__Navigation__Group_1__0 ) ) | ( ( rule__Navigation__Group_2__0 ) ) | ( ( rule__Navigation__Group_3__0 ) ) );
    public final void rule__Navigation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1046:1: ( ( ( rule__Navigation__Group_0__0 ) ) | ( ( rule__Navigation__Group_1__0 ) ) | ( ( rule__Navigation__Group_2__0 ) ) | ( ( rule__Navigation__Group_3__0 ) ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                switch ( input.LA(2) ) {
                case 50:
                case 56:
                case 57:
                case 58:
                    {
                    alt4=3;
                    }
                    break;
                case 64:
                case 65:
                    {
                    alt4=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==45) ) {
                        alt4=2;
                    }
                    else if ( (LA4_5==EOF||(LA4_5>=RULE_ID && LA4_5<=RULE_BOOLEAN)||(LA4_5>=13 && LA4_5<=27)||LA4_5==32||LA4_5==34||(LA4_5>=37 && LA4_5<=44)||(LA4_5>=62 && LA4_5<=65)) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA4_0==38) ) {
                alt4=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1047:1: ( ( rule__Navigation__Group_0__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1047:1: ( ( rule__Navigation__Group_0__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1048:1: ( rule__Navigation__Group_0__0 )
                    {
                     before(grammarAccess.getNavigationAccess().getGroup_0()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1049:1: ( rule__Navigation__Group_0__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1049:2: rule__Navigation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Navigation__Group_0__0_in_rule__Navigation__Alternatives2219);
                    rule__Navigation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1053:6: ( ( rule__Navigation__Group_1__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1053:6: ( ( rule__Navigation__Group_1__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1054:1: ( rule__Navigation__Group_1__0 )
                    {
                     before(grammarAccess.getNavigationAccess().getGroup_1()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1055:1: ( rule__Navigation__Group_1__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1055:2: rule__Navigation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Navigation__Group_1__0_in_rule__Navigation__Alternatives2237);
                    rule__Navigation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1059:6: ( ( rule__Navigation__Group_2__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1059:6: ( ( rule__Navigation__Group_2__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1060:1: ( rule__Navigation__Group_2__0 )
                    {
                     before(grammarAccess.getNavigationAccess().getGroup_2()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1061:1: ( rule__Navigation__Group_2__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1061:2: rule__Navigation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Navigation__Group_2__0_in_rule__Navigation__Alternatives2255);
                    rule__Navigation__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1065:6: ( ( rule__Navigation__Group_3__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1065:6: ( ( rule__Navigation__Group_3__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1066:1: ( rule__Navigation__Group_3__0 )
                    {
                     before(grammarAccess.getNavigationAccess().getGroup_3()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1067:1: ( rule__Navigation__Group_3__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1067:2: rule__Navigation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Navigation__Group_3__0_in_rule__Navigation__Alternatives2273);
                    rule__Navigation__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Navigation__Alternatives"


    // $ANTLR start "rule__ComplexExpression__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1076:1: rule__ComplexExpression__Alternatives : ( ( ( rule__ComplexExpression__Group_0__0 ) ) | ( ( rule__ComplexExpression__Group_1__0 ) ) );
    public final void rule__ComplexExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1080:1: ( ( ( rule__ComplexExpression__Group_0__0 ) ) | ( ( rule__ComplexExpression__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==63) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_BOOLEAN)||(LA5_0>=13 && LA5_0<=15)||LA5_0==39||LA5_0==43||LA5_0==62) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1081:1: ( ( rule__ComplexExpression__Group_0__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1081:1: ( ( rule__ComplexExpression__Group_0__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1082:1: ( rule__ComplexExpression__Group_0__0 )
                    {
                     before(grammarAccess.getComplexExpressionAccess().getGroup_0()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1083:1: ( rule__ComplexExpression__Group_0__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1083:2: rule__ComplexExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ComplexExpression__Group_0__0_in_rule__ComplexExpression__Alternatives2306);
                    rule__ComplexExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplexExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1087:6: ( ( rule__ComplexExpression__Group_1__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1087:6: ( ( rule__ComplexExpression__Group_1__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1088:1: ( rule__ComplexExpression__Group_1__0 )
                    {
                     before(grammarAccess.getComplexExpressionAccess().getGroup_1()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1089:1: ( rule__ComplexExpression__Group_1__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1089:2: rule__ComplexExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ComplexExpression__Group_1__0_in_rule__ComplexExpression__Alternatives2324);
                    rule__ComplexExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplexExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ComplexExpression__Alternatives"


    // $ANTLR start "rule__AssocRoleName__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1098:1: rule__AssocRoleName__Alternatives : ( ( ( rule__AssocRoleName__ChildrenAssignment_0 ) ) | ( ( rule__AssocRoleName__ParentAssignment_1 ) ) | ( ( rule__AssocRoleName__Group_2__0 ) ) );
    public final void rule__AssocRoleName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1102:1: ( ( ( rule__AssocRoleName__ChildrenAssignment_0 ) ) | ( ( rule__AssocRoleName__ParentAssignment_1 ) ) | ( ( rule__AssocRoleName__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt6=1;
                }
                break;
            case 65:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1103:1: ( ( rule__AssocRoleName__ChildrenAssignment_0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1103:1: ( ( rule__AssocRoleName__ChildrenAssignment_0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1104:1: ( rule__AssocRoleName__ChildrenAssignment_0 )
                    {
                     before(grammarAccess.getAssocRoleNameAccess().getChildrenAssignment_0()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1105:1: ( rule__AssocRoleName__ChildrenAssignment_0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1105:2: rule__AssocRoleName__ChildrenAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AssocRoleName__ChildrenAssignment_0_in_rule__AssocRoleName__Alternatives2357);
                    rule__AssocRoleName__ChildrenAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssocRoleNameAccess().getChildrenAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1109:6: ( ( rule__AssocRoleName__ParentAssignment_1 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1109:6: ( ( rule__AssocRoleName__ParentAssignment_1 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1110:1: ( rule__AssocRoleName__ParentAssignment_1 )
                    {
                     before(grammarAccess.getAssocRoleNameAccess().getParentAssignment_1()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1111:1: ( rule__AssocRoleName__ParentAssignment_1 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1111:2: rule__AssocRoleName__ParentAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AssocRoleName__ParentAssignment_1_in_rule__AssocRoleName__Alternatives2375);
                    rule__AssocRoleName__ParentAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssocRoleNameAccess().getParentAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1115:6: ( ( rule__AssocRoleName__Group_2__0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1115:6: ( ( rule__AssocRoleName__Group_2__0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1116:1: ( rule__AssocRoleName__Group_2__0 )
                    {
                     before(grammarAccess.getAssocRoleNameAccess().getGroup_2()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1117:1: ( rule__AssocRoleName__Group_2__0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1117:2: rule__AssocRoleName__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AssocRoleName__Group_2__0_in_rule__AssocRoleName__Alternatives2393);
                    rule__AssocRoleName__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssocRoleNameAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AssocRoleName__Alternatives"


    // $ANTLR start "rule__CollectionType__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1126:1: rule__CollectionType__Alternatives : ( ( 'Set' ) | ( 'Sequence' ) | ( 'Bag' ) );
    public final void rule__CollectionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1130:1: ( ( 'Set' ) | ( 'Sequence' ) | ( 'Bag' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
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
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1131:1: ( 'Set' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1131:1: ( 'Set' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1132:1: 'Set'
                    {
                     before(grammarAccess.getCollectionTypeAccess().getSetKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__CollectionType__Alternatives2427); 
                     after(grammarAccess.getCollectionTypeAccess().getSetKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1139:6: ( 'Sequence' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1139:6: ( 'Sequence' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1140:1: 'Sequence'
                    {
                     before(grammarAccess.getCollectionTypeAccess().getSequenceKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__CollectionType__Alternatives2447); 
                     after(grammarAccess.getCollectionTypeAccess().getSequenceKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1147:6: ( 'Bag' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1147:6: ( 'Bag' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1148:1: 'Bag'
                    {
                     before(grammarAccess.getCollectionTypeAccess().getBagKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__CollectionType__Alternatives2467); 
                     after(grammarAccess.getCollectionTypeAccess().getBagKeyword_2()); 

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
    // $ANTLR end "rule__CollectionType__Alternatives"


    // $ANTLR start "rule__OCLOperationType1__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1160:1: rule__OCLOperationType1__Alternatives : ( ( ( rule__OCLOperationType1__AllInsAssignment_0 ) ) | ( ( rule__OCLOperationType1__IsTypeOfAssignment_1 ) ) | ( ( rule__OCLOperationType1__ToStringAssignment_2 ) ) | ( ( rule__OCLOperationType1__ConcatenateAssignment_3 ) ) );
    public final void rule__OCLOperationType1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1164:1: ( ( ( rule__OCLOperationType1__AllInsAssignment_0 ) ) | ( ( rule__OCLOperationType1__IsTypeOfAssignment_1 ) ) | ( ( rule__OCLOperationType1__ToStringAssignment_2 ) ) | ( ( rule__OCLOperationType1__ConcatenateAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt8=1;
                }
                break;
            case 56:
                {
                alt8=2;
                }
                break;
            case 57:
                {
                alt8=3;
                }
                break;
            case 58:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1165:1: ( ( rule__OCLOperationType1__AllInsAssignment_0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1165:1: ( ( rule__OCLOperationType1__AllInsAssignment_0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1166:1: ( rule__OCLOperationType1__AllInsAssignment_0 )
                    {
                     before(grammarAccess.getOCLOperationType1Access().getAllInsAssignment_0()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1167:1: ( rule__OCLOperationType1__AllInsAssignment_0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1167:2: rule__OCLOperationType1__AllInsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType1__AllInsAssignment_0_in_rule__OCLOperationType1__Alternatives2501);
                    rule__OCLOperationType1__AllInsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType1Access().getAllInsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1171:6: ( ( rule__OCLOperationType1__IsTypeOfAssignment_1 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1171:6: ( ( rule__OCLOperationType1__IsTypeOfAssignment_1 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1172:1: ( rule__OCLOperationType1__IsTypeOfAssignment_1 )
                    {
                     before(grammarAccess.getOCLOperationType1Access().getIsTypeOfAssignment_1()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1173:1: ( rule__OCLOperationType1__IsTypeOfAssignment_1 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1173:2: rule__OCLOperationType1__IsTypeOfAssignment_1
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType1__IsTypeOfAssignment_1_in_rule__OCLOperationType1__Alternatives2519);
                    rule__OCLOperationType1__IsTypeOfAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType1Access().getIsTypeOfAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1177:6: ( ( rule__OCLOperationType1__ToStringAssignment_2 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1177:6: ( ( rule__OCLOperationType1__ToStringAssignment_2 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1178:1: ( rule__OCLOperationType1__ToStringAssignment_2 )
                    {
                     before(grammarAccess.getOCLOperationType1Access().getToStringAssignment_2()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1179:1: ( rule__OCLOperationType1__ToStringAssignment_2 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1179:2: rule__OCLOperationType1__ToStringAssignment_2
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType1__ToStringAssignment_2_in_rule__OCLOperationType1__Alternatives2537);
                    rule__OCLOperationType1__ToStringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType1Access().getToStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1183:6: ( ( rule__OCLOperationType1__ConcatenateAssignment_3 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1183:6: ( ( rule__OCLOperationType1__ConcatenateAssignment_3 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1184:1: ( rule__OCLOperationType1__ConcatenateAssignment_3 )
                    {
                     before(grammarAccess.getOCLOperationType1Access().getConcatenateAssignment_3()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1185:1: ( rule__OCLOperationType1__ConcatenateAssignment_3 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1185:2: rule__OCLOperationType1__ConcatenateAssignment_3
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType1__ConcatenateAssignment_3_in_rule__OCLOperationType1__Alternatives2555);
                    rule__OCLOperationType1__ConcatenateAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType1Access().getConcatenateAssignment_3()); 

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
    // $ANTLR end "rule__OCLOperationType1__Alternatives"


    // $ANTLR start "rule__OCLOperationType2__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1194:1: rule__OCLOperationType2__Alternatives : ( ( ( rule__OCLOperationType2__SizeAssignment_0 ) ) | ( ( rule__OCLOperationType2__ForallAssignment_1 ) ) | ( ( rule__OCLOperationType2__ExistsAssignment_2 ) ) | ( ( rule__OCLOperationType2__SelectAssignment_3 ) ) | ( ( rule__OCLOperationType2__CollectAssignment_4 ) ) | ( ( rule__OCLOperationType2__FirstAssignment_5 ) ) | ( ( rule__OCLOperationType2__LastAssignment_6 ) ) | ( ( rule__OCLOperationType2__IndexOfAssignment_7 ) ) | ( ( rule__OCLOperationType2__UnionAssignment_8 ) ) | ( ( rule__OCLOperationType2__IntersectionAssignment_9 ) ) | ( ( rule__OCLOperationType2__IsUndefinedAssignment_10 ) ) );
    public final void rule__OCLOperationType2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1198:1: ( ( ( rule__OCLOperationType2__SizeAssignment_0 ) ) | ( ( rule__OCLOperationType2__ForallAssignment_1 ) ) | ( ( rule__OCLOperationType2__ExistsAssignment_2 ) ) | ( ( rule__OCLOperationType2__SelectAssignment_3 ) ) | ( ( rule__OCLOperationType2__CollectAssignment_4 ) ) | ( ( rule__OCLOperationType2__FirstAssignment_5 ) ) | ( ( rule__OCLOperationType2__LastAssignment_6 ) ) | ( ( rule__OCLOperationType2__IndexOfAssignment_7 ) ) | ( ( rule__OCLOperationType2__UnionAssignment_8 ) ) | ( ( rule__OCLOperationType2__IntersectionAssignment_9 ) ) | ( ( rule__OCLOperationType2__IsUndefinedAssignment_10 ) ) )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt9=1;
                }
                break;
            case 51:
                {
                alt9=2;
                }
                break;
            case 53:
                {
                alt9=3;
                }
                break;
            case 54:
                {
                alt9=4;
                }
                break;
            case 55:
                {
                alt9=5;
                }
                break;
            case 47:
                {
                alt9=6;
                }
                break;
            case 48:
                {
                alt9=7;
                }
                break;
            case 49:
                {
                alt9=8;
                }
                break;
            case 59:
                {
                alt9=9;
                }
                break;
            case 60:
                {
                alt9=10;
                }
                break;
            case 61:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1199:1: ( ( rule__OCLOperationType2__SizeAssignment_0 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1199:1: ( ( rule__OCLOperationType2__SizeAssignment_0 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1200:1: ( rule__OCLOperationType2__SizeAssignment_0 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getSizeAssignment_0()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1201:1: ( rule__OCLOperationType2__SizeAssignment_0 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1201:2: rule__OCLOperationType2__SizeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__SizeAssignment_0_in_rule__OCLOperationType2__Alternatives2588);
                    rule__OCLOperationType2__SizeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getSizeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1205:6: ( ( rule__OCLOperationType2__ForallAssignment_1 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1205:6: ( ( rule__OCLOperationType2__ForallAssignment_1 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1206:1: ( rule__OCLOperationType2__ForallAssignment_1 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getForallAssignment_1()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1207:1: ( rule__OCLOperationType2__ForallAssignment_1 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1207:2: rule__OCLOperationType2__ForallAssignment_1
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__ForallAssignment_1_in_rule__OCLOperationType2__Alternatives2606);
                    rule__OCLOperationType2__ForallAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getForallAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1211:6: ( ( rule__OCLOperationType2__ExistsAssignment_2 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1211:6: ( ( rule__OCLOperationType2__ExistsAssignment_2 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1212:1: ( rule__OCLOperationType2__ExistsAssignment_2 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getExistsAssignment_2()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1213:1: ( rule__OCLOperationType2__ExistsAssignment_2 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1213:2: rule__OCLOperationType2__ExistsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__ExistsAssignment_2_in_rule__OCLOperationType2__Alternatives2624);
                    rule__OCLOperationType2__ExistsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getExistsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1217:6: ( ( rule__OCLOperationType2__SelectAssignment_3 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1217:6: ( ( rule__OCLOperationType2__SelectAssignment_3 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1218:1: ( rule__OCLOperationType2__SelectAssignment_3 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getSelectAssignment_3()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1219:1: ( rule__OCLOperationType2__SelectAssignment_3 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1219:2: rule__OCLOperationType2__SelectAssignment_3
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__SelectAssignment_3_in_rule__OCLOperationType2__Alternatives2642);
                    rule__OCLOperationType2__SelectAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getSelectAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1223:6: ( ( rule__OCLOperationType2__CollectAssignment_4 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1223:6: ( ( rule__OCLOperationType2__CollectAssignment_4 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1224:1: ( rule__OCLOperationType2__CollectAssignment_4 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getCollectAssignment_4()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1225:1: ( rule__OCLOperationType2__CollectAssignment_4 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1225:2: rule__OCLOperationType2__CollectAssignment_4
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__CollectAssignment_4_in_rule__OCLOperationType2__Alternatives2660);
                    rule__OCLOperationType2__CollectAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getCollectAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1229:6: ( ( rule__OCLOperationType2__FirstAssignment_5 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1229:6: ( ( rule__OCLOperationType2__FirstAssignment_5 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1230:1: ( rule__OCLOperationType2__FirstAssignment_5 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getFirstAssignment_5()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1231:1: ( rule__OCLOperationType2__FirstAssignment_5 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1231:2: rule__OCLOperationType2__FirstAssignment_5
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__FirstAssignment_5_in_rule__OCLOperationType2__Alternatives2678);
                    rule__OCLOperationType2__FirstAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getFirstAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1235:6: ( ( rule__OCLOperationType2__LastAssignment_6 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1235:6: ( ( rule__OCLOperationType2__LastAssignment_6 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1236:1: ( rule__OCLOperationType2__LastAssignment_6 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getLastAssignment_6()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1237:1: ( rule__OCLOperationType2__LastAssignment_6 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1237:2: rule__OCLOperationType2__LastAssignment_6
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__LastAssignment_6_in_rule__OCLOperationType2__Alternatives2696);
                    rule__OCLOperationType2__LastAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getLastAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1241:6: ( ( rule__OCLOperationType2__IndexOfAssignment_7 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1241:6: ( ( rule__OCLOperationType2__IndexOfAssignment_7 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1242:1: ( rule__OCLOperationType2__IndexOfAssignment_7 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getIndexOfAssignment_7()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1243:1: ( rule__OCLOperationType2__IndexOfAssignment_7 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1243:2: rule__OCLOperationType2__IndexOfAssignment_7
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__IndexOfAssignment_7_in_rule__OCLOperationType2__Alternatives2714);
                    rule__OCLOperationType2__IndexOfAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getIndexOfAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1247:6: ( ( rule__OCLOperationType2__UnionAssignment_8 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1247:6: ( ( rule__OCLOperationType2__UnionAssignment_8 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1248:1: ( rule__OCLOperationType2__UnionAssignment_8 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getUnionAssignment_8()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1249:1: ( rule__OCLOperationType2__UnionAssignment_8 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1249:2: rule__OCLOperationType2__UnionAssignment_8
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__UnionAssignment_8_in_rule__OCLOperationType2__Alternatives2732);
                    rule__OCLOperationType2__UnionAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getUnionAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1253:6: ( ( rule__OCLOperationType2__IntersectionAssignment_9 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1253:6: ( ( rule__OCLOperationType2__IntersectionAssignment_9 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1254:1: ( rule__OCLOperationType2__IntersectionAssignment_9 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getIntersectionAssignment_9()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1255:1: ( rule__OCLOperationType2__IntersectionAssignment_9 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1255:2: rule__OCLOperationType2__IntersectionAssignment_9
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__IntersectionAssignment_9_in_rule__OCLOperationType2__Alternatives2750);
                    rule__OCLOperationType2__IntersectionAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getIntersectionAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1259:6: ( ( rule__OCLOperationType2__IsUndefinedAssignment_10 ) )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1259:6: ( ( rule__OCLOperationType2__IsUndefinedAssignment_10 ) )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1260:1: ( rule__OCLOperationType2__IsUndefinedAssignment_10 )
                    {
                     before(grammarAccess.getOCLOperationType2Access().getIsUndefinedAssignment_10()); 
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1261:1: ( rule__OCLOperationType2__IsUndefinedAssignment_10 )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1261:2: rule__OCLOperationType2__IsUndefinedAssignment_10
                    {
                    pushFollow(FOLLOW_rule__OCLOperationType2__IsUndefinedAssignment_10_in_rule__OCLOperationType2__Alternatives2768);
                    rule__OCLOperationType2__IsUndefinedAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getOCLOperationType2Access().getIsUndefinedAssignment_10()); 

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
    // $ANTLR end "rule__OCLOperationType2__Alternatives"


    // $ANTLR start "rule__InfixPrimitiveOperator__Alternatives"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1270:1: rule__InfixPrimitiveOperator__Alternatives : ( ( '=' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'and' ) | ( 'or' ) );
    public final void rule__InfixPrimitiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1274:1: ( ( '=' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( 'and' ) | ( 'or' ) )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            case 21:
                {
                alt10=6;
                }
                break;
            case 22:
                {
                alt10=7;
                }
                break;
            case 23:
                {
                alt10=8;
                }
                break;
            case 24:
                {
                alt10=9;
                }
                break;
            case 25:
                {
                alt10=10;
                }
                break;
            case 26:
                {
                alt10=11;
                }
                break;
            case 27:
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1275:1: ( '=' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1275:1: ( '=' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1276:1: '='
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__InfixPrimitiveOperator__Alternatives2802); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1283:6: ( '!=' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1283:6: ( '!=' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1284:1: '!='
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__InfixPrimitiveOperator__Alternatives2822); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1291:6: ( '>' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1291:6: ( '>' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1292:1: '>'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getGreaterThanSignKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__InfixPrimitiveOperator__Alternatives2842); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getGreaterThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1299:6: ( '<' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1299:6: ( '<' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1300:1: '<'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getLessThanSignKeyword_3()); 
                    match(input,19,FOLLOW_19_in_rule__InfixPrimitiveOperator__Alternatives2862); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getLessThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1307:6: ( '>=' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1307:6: ( '>=' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1308:1: '>='
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,20,FOLLOW_20_in_rule__InfixPrimitiveOperator__Alternatives2882); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1315:6: ( '<=' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1315:6: ( '<=' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1316:1: '<='
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,21,FOLLOW_21_in_rule__InfixPrimitiveOperator__Alternatives2902); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1323:6: ( '+' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1323:6: ( '+' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1324:1: '+'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getPlusSignKeyword_6()); 
                    match(input,22,FOLLOW_22_in_rule__InfixPrimitiveOperator__Alternatives2922); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getPlusSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1331:6: ( '-' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1331:6: ( '-' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1332:1: '-'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getHyphenMinusKeyword_7()); 
                    match(input,23,FOLLOW_23_in_rule__InfixPrimitiveOperator__Alternatives2942); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getHyphenMinusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1339:6: ( '*' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1339:6: ( '*' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1340:1: '*'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getAsteriskKeyword_8()); 
                    match(input,24,FOLLOW_24_in_rule__InfixPrimitiveOperator__Alternatives2962); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getAsteriskKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1347:6: ( '/' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1347:6: ( '/' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1348:1: '/'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getSolidusKeyword_9()); 
                    match(input,25,FOLLOW_25_in_rule__InfixPrimitiveOperator__Alternatives2982); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getSolidusKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1355:6: ( 'and' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1355:6: ( 'and' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1356:1: 'and'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getAndKeyword_10()); 
                    match(input,26,FOLLOW_26_in_rule__InfixPrimitiveOperator__Alternatives3002); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getAndKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1363:6: ( 'or' )
                    {
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1363:6: ( 'or' )
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1364:1: 'or'
                    {
                     before(grammarAccess.getInfixPrimitiveOperatorAccess().getOrKeyword_11()); 
                    match(input,27,FOLLOW_27_in_rule__InfixPrimitiveOperator__Alternatives3022); 
                     after(grammarAccess.getInfixPrimitiveOperatorAccess().getOrKeyword_11()); 

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
    // $ANTLR end "rule__InfixPrimitiveOperator__Alternatives"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1378:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1382:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1383:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03054);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03057);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1390:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1394:1: ( ( 'rule' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1395:1: ( 'rule' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1395:1: ( 'rule' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1396:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Rule__Group__0__Impl3085); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1409:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1413:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1414:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13116);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13119);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1421:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1425:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1426:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1426:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1427:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1428:1: ( rule__Rule__NameAssignment_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1428:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3146);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1438:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1442:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1443:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23176);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23179);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1450:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1454:1: ( ( '{' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1455:1: ( '{' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1455:1: ( '{' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1456:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Rule__Group__2__Impl3207); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1469:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1473:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1474:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33238);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33241);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1481:1: rule__Rule__Group__3__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1485:1: ( ( 'from' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1486:1: ( 'from' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1486:1: ( 'from' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1487:1: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Rule__Group__3__Impl3269); 
             after(grammarAccess.getRuleAccess().getFromKeyword_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1500:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1504:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1505:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43300);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43303);
            rule__Rule__Group__5();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1512:1: rule__Rule__Group__4__Impl : ( ( ( rule__Rule__InPatternsAssignment_4 ) ) ( ( rule__Rule__InPatternsAssignment_4 )* ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1516:1: ( ( ( ( rule__Rule__InPatternsAssignment_4 ) ) ( ( rule__Rule__InPatternsAssignment_4 )* ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1517:1: ( ( ( rule__Rule__InPatternsAssignment_4 ) ) ( ( rule__Rule__InPatternsAssignment_4 )* ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1517:1: ( ( ( rule__Rule__InPatternsAssignment_4 ) ) ( ( rule__Rule__InPatternsAssignment_4 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1518:1: ( ( rule__Rule__InPatternsAssignment_4 ) ) ( ( rule__Rule__InPatternsAssignment_4 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1518:1: ( ( rule__Rule__InPatternsAssignment_4 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1519:1: ( rule__Rule__InPatternsAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getInPatternsAssignment_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1520:1: ( rule__Rule__InPatternsAssignment_4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1520:2: rule__Rule__InPatternsAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__InPatternsAssignment_4_in_rule__Rule__Group__4__Impl3332);
            rule__Rule__InPatternsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getInPatternsAssignment_4()); 

            }

            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1523:1: ( ( rule__Rule__InPatternsAssignment_4 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1524:1: ( rule__Rule__InPatternsAssignment_4 )*
            {
             before(grammarAccess.getRuleAccess().getInPatternsAssignment_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1525:1: ( rule__Rule__InPatternsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1525:2: rule__Rule__InPatternsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Rule__InPatternsAssignment_4_in_rule__Rule__Group__4__Impl3344);
            	    rule__Rule__InPatternsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getInPatternsAssignment_4()); 

            }


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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1536:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1540:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1541:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53377);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__53380);
            rule__Rule__Group__6();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1548:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1552:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1553:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1553:1: ( ( rule__Rule__Group_5__0 )? )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1554:1: ( rule__Rule__Group_5__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1555:1: ( rule__Rule__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1555:2: rule__Rule__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl3407);
                    rule__Rule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1565:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1569:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1570:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__63438);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__63441);
            rule__Rule__Group__7();

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
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1577:1: rule__Rule__Group__6__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1581:1: ( ( 'to' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1582:1: ( 'to' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1582:1: ( 'to' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1583:1: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__Rule__Group__6__Impl3469); 
             after(grammarAccess.getRuleAccess().getToKeyword_6()); 

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
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1596:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1600:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1601:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__73500);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__73503);
            rule__Rule__Group__8();

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
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1608:1: rule__Rule__Group__7__Impl : ( ( ( rule__Rule__OutPatternsAssignment_7 ) ) ( ( rule__Rule__OutPatternsAssignment_7 )* ) ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1612:1: ( ( ( ( rule__Rule__OutPatternsAssignment_7 ) ) ( ( rule__Rule__OutPatternsAssignment_7 )* ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1613:1: ( ( ( rule__Rule__OutPatternsAssignment_7 ) ) ( ( rule__Rule__OutPatternsAssignment_7 )* ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1613:1: ( ( ( rule__Rule__OutPatternsAssignment_7 ) ) ( ( rule__Rule__OutPatternsAssignment_7 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1614:1: ( ( rule__Rule__OutPatternsAssignment_7 ) ) ( ( rule__Rule__OutPatternsAssignment_7 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1614:1: ( ( rule__Rule__OutPatternsAssignment_7 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1615:1: ( rule__Rule__OutPatternsAssignment_7 )
            {
             before(grammarAccess.getRuleAccess().getOutPatternsAssignment_7()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1616:1: ( rule__Rule__OutPatternsAssignment_7 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1616:2: rule__Rule__OutPatternsAssignment_7
            {
            pushFollow(FOLLOW_rule__Rule__OutPatternsAssignment_7_in_rule__Rule__Group__7__Impl3532);
            rule__Rule__OutPatternsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOutPatternsAssignment_7()); 

            }

            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1619:1: ( ( rule__Rule__OutPatternsAssignment_7 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1620:1: ( rule__Rule__OutPatternsAssignment_7 )*
            {
             before(grammarAccess.getRuleAccess().getOutPatternsAssignment_7()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1621:1: ( rule__Rule__OutPatternsAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1621:2: rule__Rule__OutPatternsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Rule__OutPatternsAssignment_7_in_rule__Rule__Group__7__Impl3544);
            	    rule__Rule__OutPatternsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getOutPatternsAssignment_7()); 

            }


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
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1632:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1636:1: ( rule__Rule__Group__8__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1637:2: rule__Rule__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__83577);
            rule__Rule__Group__8__Impl();

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
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1643:1: rule__Rule__Group__8__Impl : ( '}' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1647:1: ( ( '}' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1648:1: ( '}' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1648:1: ( '}' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1649:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_32_in_rule__Rule__Group__8__Impl3605); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1680:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1684:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1685:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__03654);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__03657);
            rule__Rule__Group_5__1();

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
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1692:1: rule__Rule__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1696:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1697:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1697:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1698:1: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__Rule__Group_5__0__Impl3685); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_0()); 

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
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1711:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1715:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1716:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__13716);
            rule__Rule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_5__2_in_rule__Rule__Group_5__13719);
            rule__Rule__Group_5__2();

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
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1723:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__FilterAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1727:1: ( ( ( rule__Rule__FilterAssignment_5_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1728:1: ( ( rule__Rule__FilterAssignment_5_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1728:1: ( ( rule__Rule__FilterAssignment_5_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1729:1: ( rule__Rule__FilterAssignment_5_1 )
            {
             before(grammarAccess.getRuleAccess().getFilterAssignment_5_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1730:1: ( rule__Rule__FilterAssignment_5_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1730:2: rule__Rule__FilterAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Rule__FilterAssignment_5_1_in_rule__Rule__Group_5__1__Impl3746);
            rule__Rule__FilterAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getFilterAssignment_5_1()); 

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
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1740:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1744:1: ( rule__Rule__Group_5__2__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1745:2: rule__Rule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_5__2__Impl_in_rule__Rule__Group_5__23776);
            rule__Rule__Group_5__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_5__2"


    // $ANTLR start "rule__Rule__Group_5__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1751:1: rule__Rule__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1755:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1756:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1756:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1757:1: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_2()); 
            match(input,34,FOLLOW_34_in_rule__Rule__Group_5__2__Impl3804); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_2()); 

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
    // $ANTLR end "rule__Rule__Group_5__2__Impl"


    // $ANTLR start "rule__InPattern__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1776:1: rule__InPattern__Group__0 : rule__InPattern__Group__0__Impl rule__InPattern__Group__1 ;
    public final void rule__InPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1780:1: ( rule__InPattern__Group__0__Impl rule__InPattern__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1781:2: rule__InPattern__Group__0__Impl rule__InPattern__Group__1
            {
            pushFollow(FOLLOW_rule__InPattern__Group__0__Impl_in_rule__InPattern__Group__03841);
            rule__InPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InPattern__Group__1_in_rule__InPattern__Group__03844);
            rule__InPattern__Group__1();

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
    // $ANTLR end "rule__InPattern__Group__0"


    // $ANTLR start "rule__InPattern__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1788:1: rule__InPattern__Group__0__Impl : ( ( rule__InPattern__InElemAssignment_0 ) ) ;
    public final void rule__InPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1792:1: ( ( ( rule__InPattern__InElemAssignment_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1793:1: ( ( rule__InPattern__InElemAssignment_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1793:1: ( ( rule__InPattern__InElemAssignment_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1794:1: ( rule__InPattern__InElemAssignment_0 )
            {
             before(grammarAccess.getInPatternAccess().getInElemAssignment_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1795:1: ( rule__InPattern__InElemAssignment_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1795:2: rule__InPattern__InElemAssignment_0
            {
            pushFollow(FOLLOW_rule__InPattern__InElemAssignment_0_in_rule__InPattern__Group__0__Impl3871);
            rule__InPattern__InElemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInPatternAccess().getInElemAssignment_0()); 

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
    // $ANTLR end "rule__InPattern__Group__0__Impl"


    // $ANTLR start "rule__InPattern__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1805:1: rule__InPattern__Group__1 : rule__InPattern__Group__1__Impl rule__InPattern__Group__2 ;
    public final void rule__InPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1809:1: ( rule__InPattern__Group__1__Impl rule__InPattern__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1810:2: rule__InPattern__Group__1__Impl rule__InPattern__Group__2
            {
            pushFollow(FOLLOW_rule__InPattern__Group__1__Impl_in_rule__InPattern__Group__13901);
            rule__InPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InPattern__Group__2_in_rule__InPattern__Group__13904);
            rule__InPattern__Group__2();

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
    // $ANTLR end "rule__InPattern__Group__1"


    // $ANTLR start "rule__InPattern__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1817:1: rule__InPattern__Group__1__Impl : ( ':' ) ;
    public final void rule__InPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1821:1: ( ( ':' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1822:1: ( ':' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1822:1: ( ':' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1823:1: ':'
            {
             before(grammarAccess.getInPatternAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__InPattern__Group__1__Impl3932); 
             after(grammarAccess.getInPatternAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__InPattern__Group__1__Impl"


    // $ANTLR start "rule__InPattern__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1836:1: rule__InPattern__Group__2 : rule__InPattern__Group__2__Impl ;
    public final void rule__InPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1840:1: ( rule__InPattern__Group__2__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1841:2: rule__InPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InPattern__Group__2__Impl_in_rule__InPattern__Group__23963);
            rule__InPattern__Group__2__Impl();

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
    // $ANTLR end "rule__InPattern__Group__2"


    // $ANTLR start "rule__InPattern__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1847:1: rule__InPattern__Group__2__Impl : ( ( rule__InPattern__ClassNameAssignment_2 ) ) ;
    public final void rule__InPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1851:1: ( ( ( rule__InPattern__ClassNameAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1852:1: ( ( rule__InPattern__ClassNameAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1852:1: ( ( rule__InPattern__ClassNameAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1853:1: ( rule__InPattern__ClassNameAssignment_2 )
            {
             before(grammarAccess.getInPatternAccess().getClassNameAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1854:1: ( rule__InPattern__ClassNameAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1854:2: rule__InPattern__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__InPattern__ClassNameAssignment_2_in_rule__InPattern__Group__2__Impl3990);
            rule__InPattern__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInPatternAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__InPattern__Group__2__Impl"


    // $ANTLR start "rule__OutPattern__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1870:1: rule__OutPattern__Group__0 : rule__OutPattern__Group__0__Impl rule__OutPattern__Group__1 ;
    public final void rule__OutPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1874:1: ( rule__OutPattern__Group__0__Impl rule__OutPattern__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1875:2: rule__OutPattern__Group__0__Impl rule__OutPattern__Group__1
            {
            pushFollow(FOLLOW_rule__OutPattern__Group__0__Impl_in_rule__OutPattern__Group__04026);
            rule__OutPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutPattern__Group__1_in_rule__OutPattern__Group__04029);
            rule__OutPattern__Group__1();

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
    // $ANTLR end "rule__OutPattern__Group__0"


    // $ANTLR start "rule__OutPattern__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1882:1: rule__OutPattern__Group__0__Impl : ( ( rule__OutPattern__VarNameAssignment_0 ) ) ;
    public final void rule__OutPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1886:1: ( ( ( rule__OutPattern__VarNameAssignment_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1887:1: ( ( rule__OutPattern__VarNameAssignment_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1887:1: ( ( rule__OutPattern__VarNameAssignment_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1888:1: ( rule__OutPattern__VarNameAssignment_0 )
            {
             before(grammarAccess.getOutPatternAccess().getVarNameAssignment_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1889:1: ( rule__OutPattern__VarNameAssignment_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1889:2: rule__OutPattern__VarNameAssignment_0
            {
            pushFollow(FOLLOW_rule__OutPattern__VarNameAssignment_0_in_rule__OutPattern__Group__0__Impl4056);
            rule__OutPattern__VarNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutPatternAccess().getVarNameAssignment_0()); 

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
    // $ANTLR end "rule__OutPattern__Group__0__Impl"


    // $ANTLR start "rule__OutPattern__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1899:1: rule__OutPattern__Group__1 : rule__OutPattern__Group__1__Impl rule__OutPattern__Group__2 ;
    public final void rule__OutPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1903:1: ( rule__OutPattern__Group__1__Impl rule__OutPattern__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1904:2: rule__OutPattern__Group__1__Impl rule__OutPattern__Group__2
            {
            pushFollow(FOLLOW_rule__OutPattern__Group__1__Impl_in_rule__OutPattern__Group__14086);
            rule__OutPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutPattern__Group__2_in_rule__OutPattern__Group__14089);
            rule__OutPattern__Group__2();

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
    // $ANTLR end "rule__OutPattern__Group__1"


    // $ANTLR start "rule__OutPattern__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1911:1: rule__OutPattern__Group__1__Impl : ( ':' ) ;
    public final void rule__OutPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1915:1: ( ( ':' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1916:1: ( ':' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1916:1: ( ':' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1917:1: ':'
            {
             before(grammarAccess.getOutPatternAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__OutPattern__Group__1__Impl4117); 
             after(grammarAccess.getOutPatternAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__OutPattern__Group__1__Impl"


    // $ANTLR start "rule__OutPattern__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1930:1: rule__OutPattern__Group__2 : rule__OutPattern__Group__2__Impl rule__OutPattern__Group__3 ;
    public final void rule__OutPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1934:1: ( rule__OutPattern__Group__2__Impl rule__OutPattern__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1935:2: rule__OutPattern__Group__2__Impl rule__OutPattern__Group__3
            {
            pushFollow(FOLLOW_rule__OutPattern__Group__2__Impl_in_rule__OutPattern__Group__24148);
            rule__OutPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutPattern__Group__3_in_rule__OutPattern__Group__24151);
            rule__OutPattern__Group__3();

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
    // $ANTLR end "rule__OutPattern__Group__2"


    // $ANTLR start "rule__OutPattern__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1942:1: rule__OutPattern__Group__2__Impl : ( ( rule__OutPattern__ClassNameAssignment_2 ) ) ;
    public final void rule__OutPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1946:1: ( ( ( rule__OutPattern__ClassNameAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1947:1: ( ( rule__OutPattern__ClassNameAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1947:1: ( ( rule__OutPattern__ClassNameAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1948:1: ( rule__OutPattern__ClassNameAssignment_2 )
            {
             before(grammarAccess.getOutPatternAccess().getClassNameAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1949:1: ( rule__OutPattern__ClassNameAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1949:2: rule__OutPattern__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__OutPattern__ClassNameAssignment_2_in_rule__OutPattern__Group__2__Impl4178);
            rule__OutPattern__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutPatternAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__OutPattern__Group__2__Impl"


    // $ANTLR start "rule__OutPattern__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1959:1: rule__OutPattern__Group__3 : rule__OutPattern__Group__3__Impl rule__OutPattern__Group__4 ;
    public final void rule__OutPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1963:1: ( rule__OutPattern__Group__3__Impl rule__OutPattern__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1964:2: rule__OutPattern__Group__3__Impl rule__OutPattern__Group__4
            {
            pushFollow(FOLLOW_rule__OutPattern__Group__3__Impl_in_rule__OutPattern__Group__34208);
            rule__OutPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutPattern__Group__4_in_rule__OutPattern__Group__34211);
            rule__OutPattern__Group__4();

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
    // $ANTLR end "rule__OutPattern__Group__3"


    // $ANTLR start "rule__OutPattern__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1971:1: rule__OutPattern__Group__3__Impl : ( '(' ) ;
    public final void rule__OutPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1975:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1976:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1976:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1977:1: '('
            {
             before(grammarAccess.getOutPatternAccess().getLeftParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__OutPattern__Group__3__Impl4239); 
             after(grammarAccess.getOutPatternAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__OutPattern__Group__3__Impl"


    // $ANTLR start "rule__OutPattern__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1990:1: rule__OutPattern__Group__4 : rule__OutPattern__Group__4__Impl rule__OutPattern__Group__5 ;
    public final void rule__OutPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1994:1: ( rule__OutPattern__Group__4__Impl rule__OutPattern__Group__5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:1995:2: rule__OutPattern__Group__4__Impl rule__OutPattern__Group__5
            {
            pushFollow(FOLLOW_rule__OutPattern__Group__4__Impl_in_rule__OutPattern__Group__44270);
            rule__OutPattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OutPattern__Group__5_in_rule__OutPattern__Group__44273);
            rule__OutPattern__Group__5();

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
    // $ANTLR end "rule__OutPattern__Group__4"


    // $ANTLR start "rule__OutPattern__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2002:1: rule__OutPattern__Group__4__Impl : ( ( rule__OutPattern__AssgAssignment_4 )* ) ;
    public final void rule__OutPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2006:1: ( ( ( rule__OutPattern__AssgAssignment_4 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2007:1: ( ( rule__OutPattern__AssgAssignment_4 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2007:1: ( ( rule__OutPattern__AssgAssignment_4 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2008:1: ( rule__OutPattern__AssgAssignment_4 )*
            {
             before(grammarAccess.getOutPatternAccess().getAssgAssignment_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2009:1: ( rule__OutPattern__AssgAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=64 && LA14_0<=65)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2009:2: rule__OutPattern__AssgAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__OutPattern__AssgAssignment_4_in_rule__OutPattern__Group__4__Impl4300);
            	    rule__OutPattern__AssgAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOutPatternAccess().getAssgAssignment_4()); 

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
    // $ANTLR end "rule__OutPattern__Group__4__Impl"


    // $ANTLR start "rule__OutPattern__Group__5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2019:1: rule__OutPattern__Group__5 : rule__OutPattern__Group__5__Impl ;
    public final void rule__OutPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2023:1: ( rule__OutPattern__Group__5__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2024:2: rule__OutPattern__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OutPattern__Group__5__Impl_in_rule__OutPattern__Group__54331);
            rule__OutPattern__Group__5__Impl();

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
    // $ANTLR end "rule__OutPattern__Group__5"


    // $ANTLR start "rule__OutPattern__Group__5__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2030:1: rule__OutPattern__Group__5__Impl : ( ')' ) ;
    public final void rule__OutPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2034:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2035:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2035:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2036:1: ')'
            {
             before(grammarAccess.getOutPatternAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__OutPattern__Group__5__Impl4359); 
             after(grammarAccess.getOutPatternAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__OutPattern__Group__5__Impl"


    // $ANTLR start "rule__Assignation__Group_0__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2061:1: rule__Assignation__Group_0__0 : rule__Assignation__Group_0__0__Impl rule__Assignation__Group_0__1 ;
    public final void rule__Assignation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2065:1: ( rule__Assignation__Group_0__0__Impl rule__Assignation__Group_0__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2066:2: rule__Assignation__Group_0__0__Impl rule__Assignation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Assignation__Group_0__0__Impl_in_rule__Assignation__Group_0__04402);
            rule__Assignation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignation__Group_0__1_in_rule__Assignation__Group_0__04405);
            rule__Assignation__Group_0__1();

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
    // $ANTLR end "rule__Assignation__Group_0__0"


    // $ANTLR start "rule__Assignation__Group_0__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2073:1: rule__Assignation__Group_0__0__Impl : ( ( rule__Assignation__AttributeAssignment_0_0 ) ) ;
    public final void rule__Assignation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2077:1: ( ( ( rule__Assignation__AttributeAssignment_0_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2078:1: ( ( rule__Assignation__AttributeAssignment_0_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2078:1: ( ( rule__Assignation__AttributeAssignment_0_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2079:1: ( rule__Assignation__AttributeAssignment_0_0 )
            {
             before(grammarAccess.getAssignationAccess().getAttributeAssignment_0_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2080:1: ( rule__Assignation__AttributeAssignment_0_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2080:2: rule__Assignation__AttributeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Assignation__AttributeAssignment_0_0_in_rule__Assignation__Group_0__0__Impl4432);
            rule__Assignation__AttributeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getAttributeAssignment_0_0()); 

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
    // $ANTLR end "rule__Assignation__Group_0__0__Impl"


    // $ANTLR start "rule__Assignation__Group_0__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2090:1: rule__Assignation__Group_0__1 : rule__Assignation__Group_0__1__Impl rule__Assignation__Group_0__2 ;
    public final void rule__Assignation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2094:1: ( rule__Assignation__Group_0__1__Impl rule__Assignation__Group_0__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2095:2: rule__Assignation__Group_0__1__Impl rule__Assignation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Assignation__Group_0__1__Impl_in_rule__Assignation__Group_0__14462);
            rule__Assignation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignation__Group_0__2_in_rule__Assignation__Group_0__14465);
            rule__Assignation__Group_0__2();

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
    // $ANTLR end "rule__Assignation__Group_0__1"


    // $ANTLR start "rule__Assignation__Group_0__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2102:1: rule__Assignation__Group_0__1__Impl : ( '<-' ) ;
    public final void rule__Assignation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2106:1: ( ( '<-' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2107:1: ( '<-' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2107:1: ( '<-' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2108:1: '<-'
            {
             before(grammarAccess.getAssignationAccess().getLessThanSignHyphenMinusKeyword_0_1()); 
            match(input,36,FOLLOW_36_in_rule__Assignation__Group_0__1__Impl4493); 
             after(grammarAccess.getAssignationAccess().getLessThanSignHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__Assignation__Group_0__1__Impl"


    // $ANTLR start "rule__Assignation__Group_0__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2121:1: rule__Assignation__Group_0__2 : rule__Assignation__Group_0__2__Impl ;
    public final void rule__Assignation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2125:1: ( rule__Assignation__Group_0__2__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2126:2: rule__Assignation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignation__Group_0__2__Impl_in_rule__Assignation__Group_0__24524);
            rule__Assignation__Group_0__2__Impl();

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
    // $ANTLR end "rule__Assignation__Group_0__2"


    // $ANTLR start "rule__Assignation__Group_0__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2132:1: rule__Assignation__Group_0__2__Impl : ( ( rule__Assignation__ExprAssignment_0_2 ) ) ;
    public final void rule__Assignation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2136:1: ( ( ( rule__Assignation__ExprAssignment_0_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2137:1: ( ( rule__Assignation__ExprAssignment_0_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2137:1: ( ( rule__Assignation__ExprAssignment_0_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2138:1: ( rule__Assignation__ExprAssignment_0_2 )
            {
             before(grammarAccess.getAssignationAccess().getExprAssignment_0_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2139:1: ( rule__Assignation__ExprAssignment_0_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2139:2: rule__Assignation__ExprAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Assignation__ExprAssignment_0_2_in_rule__Assignation__Group_0__2__Impl4551);
            rule__Assignation__ExprAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getExprAssignment_0_2()); 

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
    // $ANTLR end "rule__Assignation__Group_0__2__Impl"


    // $ANTLR start "rule__Assignation__Group_1__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2155:1: rule__Assignation__Group_1__0 : rule__Assignation__Group_1__0__Impl rule__Assignation__Group_1__1 ;
    public final void rule__Assignation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2159:1: ( rule__Assignation__Group_1__0__Impl rule__Assignation__Group_1__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2160:2: rule__Assignation__Group_1__0__Impl rule__Assignation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Assignation__Group_1__0__Impl_in_rule__Assignation__Group_1__04587);
            rule__Assignation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignation__Group_1__1_in_rule__Assignation__Group_1__04590);
            rule__Assignation__Group_1__1();

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
    // $ANTLR end "rule__Assignation__Group_1__0"


    // $ANTLR start "rule__Assignation__Group_1__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2167:1: rule__Assignation__Group_1__0__Impl : ( ( rule__Assignation__RelationshipAssignment_1_0 ) ) ;
    public final void rule__Assignation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2171:1: ( ( ( rule__Assignation__RelationshipAssignment_1_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2172:1: ( ( rule__Assignation__RelationshipAssignment_1_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2172:1: ( ( rule__Assignation__RelationshipAssignment_1_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2173:1: ( rule__Assignation__RelationshipAssignment_1_0 )
            {
             before(grammarAccess.getAssignationAccess().getRelationshipAssignment_1_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2174:1: ( rule__Assignation__RelationshipAssignment_1_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2174:2: rule__Assignation__RelationshipAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Assignation__RelationshipAssignment_1_0_in_rule__Assignation__Group_1__0__Impl4617);
            rule__Assignation__RelationshipAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getRelationshipAssignment_1_0()); 

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
    // $ANTLR end "rule__Assignation__Group_1__0__Impl"


    // $ANTLR start "rule__Assignation__Group_1__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2184:1: rule__Assignation__Group_1__1 : rule__Assignation__Group_1__1__Impl rule__Assignation__Group_1__2 ;
    public final void rule__Assignation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2188:1: ( rule__Assignation__Group_1__1__Impl rule__Assignation__Group_1__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2189:2: rule__Assignation__Group_1__1__Impl rule__Assignation__Group_1__2
            {
            pushFollow(FOLLOW_rule__Assignation__Group_1__1__Impl_in_rule__Assignation__Group_1__14647);
            rule__Assignation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignation__Group_1__2_in_rule__Assignation__Group_1__14650);
            rule__Assignation__Group_1__2();

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
    // $ANTLR end "rule__Assignation__Group_1__1"


    // $ANTLR start "rule__Assignation__Group_1__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2196:1: rule__Assignation__Group_1__1__Impl : ( '<-' ) ;
    public final void rule__Assignation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2200:1: ( ( '<-' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2201:1: ( '<-' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2201:1: ( '<-' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2202:1: '<-'
            {
             before(grammarAccess.getAssignationAccess().getLessThanSignHyphenMinusKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__Assignation__Group_1__1__Impl4678); 
             after(grammarAccess.getAssignationAccess().getLessThanSignHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__Assignation__Group_1__1__Impl"


    // $ANTLR start "rule__Assignation__Group_1__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2215:1: rule__Assignation__Group_1__2 : rule__Assignation__Group_1__2__Impl ;
    public final void rule__Assignation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2219:1: ( rule__Assignation__Group_1__2__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2220:2: rule__Assignation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignation__Group_1__2__Impl_in_rule__Assignation__Group_1__24709);
            rule__Assignation__Group_1__2__Impl();

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
    // $ANTLR end "rule__Assignation__Group_1__2"


    // $ANTLR start "rule__Assignation__Group_1__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2226:1: rule__Assignation__Group_1__2__Impl : ( ( rule__Assignation__ExprAssignment_1_2 ) ) ;
    public final void rule__Assignation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2230:1: ( ( ( rule__Assignation__ExprAssignment_1_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2231:1: ( ( rule__Assignation__ExprAssignment_1_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2231:1: ( ( rule__Assignation__ExprAssignment_1_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2232:1: ( rule__Assignation__ExprAssignment_1_2 )
            {
             before(grammarAccess.getAssignationAccess().getExprAssignment_1_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2233:1: ( rule__Assignation__ExprAssignment_1_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2233:2: rule__Assignation__ExprAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Assignation__ExprAssignment_1_2_in_rule__Assignation__Group_1__2__Impl4736);
            rule__Assignation__ExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignationAccess().getExprAssignment_1_2()); 

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
    // $ANTLR end "rule__Assignation__Group_1__2__Impl"


    // $ANTLR start "rule__SimpleExpression__Group_7__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2249:1: rule__SimpleExpression__Group_7__0 : rule__SimpleExpression__Group_7__0__Impl rule__SimpleExpression__Group_7__1 ;
    public final void rule__SimpleExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2253:1: ( rule__SimpleExpression__Group_7__0__Impl rule__SimpleExpression__Group_7__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2254:2: rule__SimpleExpression__Group_7__0__Impl rule__SimpleExpression__Group_7__1
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__0__Impl_in_rule__SimpleExpression__Group_7__04772);
            rule__SimpleExpression__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__1_in_rule__SimpleExpression__Group_7__04775);
            rule__SimpleExpression__Group_7__1();

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
    // $ANTLR end "rule__SimpleExpression__Group_7__0"


    // $ANTLR start "rule__SimpleExpression__Group_7__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2261:1: rule__SimpleExpression__Group_7__0__Impl : ( ( rule__SimpleExpression__ColectionTypeAssignment_7_0 ) ) ;
    public final void rule__SimpleExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2265:1: ( ( ( rule__SimpleExpression__ColectionTypeAssignment_7_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2266:1: ( ( rule__SimpleExpression__ColectionTypeAssignment_7_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2266:1: ( ( rule__SimpleExpression__ColectionTypeAssignment_7_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2267:1: ( rule__SimpleExpression__ColectionTypeAssignment_7_0 )
            {
             before(grammarAccess.getSimpleExpressionAccess().getColectionTypeAssignment_7_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2268:1: ( rule__SimpleExpression__ColectionTypeAssignment_7_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2268:2: rule__SimpleExpression__ColectionTypeAssignment_7_0
            {
            pushFollow(FOLLOW_rule__SimpleExpression__ColectionTypeAssignment_7_0_in_rule__SimpleExpression__Group_7__0__Impl4802);
            rule__SimpleExpression__ColectionTypeAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpressionAccess().getColectionTypeAssignment_7_0()); 

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
    // $ANTLR end "rule__SimpleExpression__Group_7__0__Impl"


    // $ANTLR start "rule__SimpleExpression__Group_7__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2278:1: rule__SimpleExpression__Group_7__1 : rule__SimpleExpression__Group_7__1__Impl rule__SimpleExpression__Group_7__2 ;
    public final void rule__SimpleExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2282:1: ( rule__SimpleExpression__Group_7__1__Impl rule__SimpleExpression__Group_7__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2283:2: rule__SimpleExpression__Group_7__1__Impl rule__SimpleExpression__Group_7__2
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__1__Impl_in_rule__SimpleExpression__Group_7__14832);
            rule__SimpleExpression__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__2_in_rule__SimpleExpression__Group_7__14835);
            rule__SimpleExpression__Group_7__2();

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
    // $ANTLR end "rule__SimpleExpression__Group_7__1"


    // $ANTLR start "rule__SimpleExpression__Group_7__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2290:1: rule__SimpleExpression__Group_7__1__Impl : ( '{' ) ;
    public final void rule__SimpleExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2294:1: ( ( '{' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2295:1: ( '{' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2295:1: ( '{' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2296:1: '{'
            {
             before(grammarAccess.getSimpleExpressionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,29,FOLLOW_29_in_rule__SimpleExpression__Group_7__1__Impl4863); 
             after(grammarAccess.getSimpleExpressionAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__SimpleExpression__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleExpression__Group_7__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2309:1: rule__SimpleExpression__Group_7__2 : rule__SimpleExpression__Group_7__2__Impl rule__SimpleExpression__Group_7__3 ;
    public final void rule__SimpleExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2313:1: ( rule__SimpleExpression__Group_7__2__Impl rule__SimpleExpression__Group_7__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2314:2: rule__SimpleExpression__Group_7__2__Impl rule__SimpleExpression__Group_7__3
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__2__Impl_in_rule__SimpleExpression__Group_7__24894);
            rule__SimpleExpression__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__3_in_rule__SimpleExpression__Group_7__24897);
            rule__SimpleExpression__Group_7__3();

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
    // $ANTLR end "rule__SimpleExpression__Group_7__2"


    // $ANTLR start "rule__SimpleExpression__Group_7__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2321:1: rule__SimpleExpression__Group_7__2__Impl : ( ( rule__SimpleExpression__ElemsAssignment_7_2 )* ) ;
    public final void rule__SimpleExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2325:1: ( ( ( rule__SimpleExpression__ElemsAssignment_7_2 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2326:1: ( ( rule__SimpleExpression__ElemsAssignment_7_2 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2326:1: ( ( rule__SimpleExpression__ElemsAssignment_7_2 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2327:1: ( rule__SimpleExpression__ElemsAssignment_7_2 )*
            {
             before(grammarAccess.getSimpleExpressionAccess().getElemsAssignment_7_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2328:1: ( rule__SimpleExpression__ElemsAssignment_7_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_BOOLEAN)||(LA15_0>=13 && LA15_0<=15)||LA15_0==39||LA15_0==43||(LA15_0>=62 && LA15_0<=63)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2328:2: rule__SimpleExpression__ElemsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleExpression__ElemsAssignment_7_2_in_rule__SimpleExpression__Group_7__2__Impl4924);
            	    rule__SimpleExpression__ElemsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSimpleExpressionAccess().getElemsAssignment_7_2()); 

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
    // $ANTLR end "rule__SimpleExpression__Group_7__2__Impl"


    // $ANTLR start "rule__SimpleExpression__Group_7__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2338:1: rule__SimpleExpression__Group_7__3 : rule__SimpleExpression__Group_7__3__Impl rule__SimpleExpression__Group_7__4 ;
    public final void rule__SimpleExpression__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2342:1: ( rule__SimpleExpression__Group_7__3__Impl rule__SimpleExpression__Group_7__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2343:2: rule__SimpleExpression__Group_7__3__Impl rule__SimpleExpression__Group_7__4
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__3__Impl_in_rule__SimpleExpression__Group_7__34955);
            rule__SimpleExpression__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__4_in_rule__SimpleExpression__Group_7__34958);
            rule__SimpleExpression__Group_7__4();

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
    // $ANTLR end "rule__SimpleExpression__Group_7__3"


    // $ANTLR start "rule__SimpleExpression__Group_7__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2350:1: rule__SimpleExpression__Group_7__3__Impl : ( '}' ) ;
    public final void rule__SimpleExpression__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2354:1: ( ( '}' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2355:1: ( '}' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2355:1: ( '}' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2356:1: '}'
            {
             before(grammarAccess.getSimpleExpressionAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,32,FOLLOW_32_in_rule__SimpleExpression__Group_7__3__Impl4986); 
             after(grammarAccess.getSimpleExpressionAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__SimpleExpression__Group_7__3__Impl"


    // $ANTLR start "rule__SimpleExpression__Group_7__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2369:1: rule__SimpleExpression__Group_7__4 : rule__SimpleExpression__Group_7__4__Impl ;
    public final void rule__SimpleExpression__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2373:1: ( rule__SimpleExpression__Group_7__4__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2374:2: rule__SimpleExpression__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpression__Group_7__4__Impl_in_rule__SimpleExpression__Group_7__45017);
            rule__SimpleExpression__Group_7__4__Impl();

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
    // $ANTLR end "rule__SimpleExpression__Group_7__4"


    // $ANTLR start "rule__SimpleExpression__Group_7__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2380:1: rule__SimpleExpression__Group_7__4__Impl : ( ( rule__SimpleExpression__NavAssignment_7_4 )* ) ;
    public final void rule__SimpleExpression__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2384:1: ( ( ( rule__SimpleExpression__NavAssignment_7_4 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2385:1: ( ( rule__SimpleExpression__NavAssignment_7_4 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2385:1: ( ( rule__SimpleExpression__NavAssignment_7_4 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2386:1: ( rule__SimpleExpression__NavAssignment_7_4 )*
            {
             before(grammarAccess.getSimpleExpressionAccess().getNavAssignment_7_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2387:1: ( rule__SimpleExpression__NavAssignment_7_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=37 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2387:2: rule__SimpleExpression__NavAssignment_7_4
            	    {
            	    pushFollow(FOLLOW_rule__SimpleExpression__NavAssignment_7_4_in_rule__SimpleExpression__Group_7__4__Impl5044);
            	    rule__SimpleExpression__NavAssignment_7_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSimpleExpressionAccess().getNavAssignment_7_4()); 

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
    // $ANTLR end "rule__SimpleExpression__Group_7__4__Impl"


    // $ANTLR start "rule__Navig__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2407:1: rule__Navig__Group__0 : rule__Navig__Group__0__Impl rule__Navig__Group__1 ;
    public final void rule__Navig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2411:1: ( rule__Navig__Group__0__Impl rule__Navig__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2412:2: rule__Navig__Group__0__Impl rule__Navig__Group__1
            {
            pushFollow(FOLLOW_rule__Navig__Group__0__Impl_in_rule__Navig__Group__05085);
            rule__Navig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Navig__Group__1_in_rule__Navig__Group__05088);
            rule__Navig__Group__1();

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
    // $ANTLR end "rule__Navig__Group__0"


    // $ANTLR start "rule__Navig__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2419:1: rule__Navig__Group__0__Impl : ( ( rule__Navig__AttrAssignment_0 ) ) ;
    public final void rule__Navig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2423:1: ( ( ( rule__Navig__AttrAssignment_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2424:1: ( ( rule__Navig__AttrAssignment_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2424:1: ( ( rule__Navig__AttrAssignment_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2425:1: ( rule__Navig__AttrAssignment_0 )
            {
             before(grammarAccess.getNavigAccess().getAttrAssignment_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2426:1: ( rule__Navig__AttrAssignment_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2426:2: rule__Navig__AttrAssignment_0
            {
            pushFollow(FOLLOW_rule__Navig__AttrAssignment_0_in_rule__Navig__Group__0__Impl5115);
            rule__Navig__AttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigAccess().getAttrAssignment_0()); 

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
    // $ANTLR end "rule__Navig__Group__0__Impl"


    // $ANTLR start "rule__Navig__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2436:1: rule__Navig__Group__1 : rule__Navig__Group__1__Impl ;
    public final void rule__Navig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2440:1: ( rule__Navig__Group__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2441:2: rule__Navig__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Navig__Group__1__Impl_in_rule__Navig__Group__15145);
            rule__Navig__Group__1__Impl();

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
    // $ANTLR end "rule__Navig__Group__1"


    // $ANTLR start "rule__Navig__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2447:1: rule__Navig__Group__1__Impl : ( ( rule__Navig__NavigationAssignment_1 )* ) ;
    public final void rule__Navig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2451:1: ( ( ( rule__Navig__NavigationAssignment_1 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2452:1: ( ( rule__Navig__NavigationAssignment_1 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2452:1: ( ( rule__Navig__NavigationAssignment_1 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2453:1: ( rule__Navig__NavigationAssignment_1 )*
            {
             before(grammarAccess.getNavigAccess().getNavigationAssignment_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2454:1: ( rule__Navig__NavigationAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=37 && LA17_0<=38)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2454:2: rule__Navig__NavigationAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Navig__NavigationAssignment_1_in_rule__Navig__Group__1__Impl5172);
            	    rule__Navig__NavigationAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNavigAccess().getNavigationAssignment_1()); 

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
    // $ANTLR end "rule__Navig__Group__1__Impl"


    // $ANTLR start "rule__Navigation__Group_0__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2468:1: rule__Navigation__Group_0__0 : rule__Navigation__Group_0__0__Impl rule__Navigation__Group_0__1 ;
    public final void rule__Navigation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2472:1: ( rule__Navigation__Group_0__0__Impl rule__Navigation__Group_0__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2473:2: rule__Navigation__Group_0__0__Impl rule__Navigation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Navigation__Group_0__0__Impl_in_rule__Navigation__Group_0__05207);
            rule__Navigation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Navigation__Group_0__1_in_rule__Navigation__Group_0__05210);
            rule__Navigation__Group_0__1();

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
    // $ANTLR end "rule__Navigation__Group_0__0"


    // $ANTLR start "rule__Navigation__Group_0__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2480:1: rule__Navigation__Group_0__0__Impl : ( '.' ) ;
    public final void rule__Navigation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2484:1: ( ( '.' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2485:1: ( '.' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2485:1: ( '.' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2486:1: '.'
            {
             before(grammarAccess.getNavigationAccess().getFullStopKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Navigation__Group_0__0__Impl5238); 
             after(grammarAccess.getNavigationAccess().getFullStopKeyword_0_0()); 

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
    // $ANTLR end "rule__Navigation__Group_0__0__Impl"


    // $ANTLR start "rule__Navigation__Group_0__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2499:1: rule__Navigation__Group_0__1 : rule__Navigation__Group_0__1__Impl ;
    public final void rule__Navigation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2503:1: ( rule__Navigation__Group_0__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2504:2: rule__Navigation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Navigation__Group_0__1__Impl_in_rule__Navigation__Group_0__15269);
            rule__Navigation__Group_0__1__Impl();

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
    // $ANTLR end "rule__Navigation__Group_0__1"


    // $ANTLR start "rule__Navigation__Group_0__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2510:1: rule__Navigation__Group_0__1__Impl : ( ( rule__Navigation__AttNameAssignment_0_1 ) ) ;
    public final void rule__Navigation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2514:1: ( ( ( rule__Navigation__AttNameAssignment_0_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2515:1: ( ( rule__Navigation__AttNameAssignment_0_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2515:1: ( ( rule__Navigation__AttNameAssignment_0_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2516:1: ( rule__Navigation__AttNameAssignment_0_1 )
            {
             before(grammarAccess.getNavigationAccess().getAttNameAssignment_0_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2517:1: ( rule__Navigation__AttNameAssignment_0_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2517:2: rule__Navigation__AttNameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Navigation__AttNameAssignment_0_1_in_rule__Navigation__Group_0__1__Impl5296);
            rule__Navigation__AttNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getAttNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Navigation__Group_0__1__Impl"


    // $ANTLR start "rule__Navigation__Group_1__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2531:1: rule__Navigation__Group_1__0 : rule__Navigation__Group_1__0__Impl rule__Navigation__Group_1__1 ;
    public final void rule__Navigation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2535:1: ( rule__Navigation__Group_1__0__Impl rule__Navigation__Group_1__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2536:2: rule__Navigation__Group_1__0__Impl rule__Navigation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Navigation__Group_1__0__Impl_in_rule__Navigation__Group_1__05330);
            rule__Navigation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Navigation__Group_1__1_in_rule__Navigation__Group_1__05333);
            rule__Navigation__Group_1__1();

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
    // $ANTLR end "rule__Navigation__Group_1__0"


    // $ANTLR start "rule__Navigation__Group_1__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2543:1: rule__Navigation__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Navigation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2547:1: ( ( '.' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2548:1: ( '.' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2548:1: ( '.' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2549:1: '.'
            {
             before(grammarAccess.getNavigationAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Navigation__Group_1__0__Impl5361); 
             after(grammarAccess.getNavigationAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Navigation__Group_1__0__Impl"


    // $ANTLR start "rule__Navigation__Group_1__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2562:1: rule__Navigation__Group_1__1 : rule__Navigation__Group_1__1__Impl ;
    public final void rule__Navigation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2566:1: ( rule__Navigation__Group_1__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2567:2: rule__Navigation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Navigation__Group_1__1__Impl_in_rule__Navigation__Group_1__15392);
            rule__Navigation__Group_1__1__Impl();

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
    // $ANTLR end "rule__Navigation__Group_1__1"


    // $ANTLR start "rule__Navigation__Group_1__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2573:1: rule__Navigation__Group_1__1__Impl : ( ( rule__Navigation__AssocRoleAssignment_1_1 ) ) ;
    public final void rule__Navigation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2577:1: ( ( ( rule__Navigation__AssocRoleAssignment_1_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2578:1: ( ( rule__Navigation__AssocRoleAssignment_1_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2578:1: ( ( rule__Navigation__AssocRoleAssignment_1_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2579:1: ( rule__Navigation__AssocRoleAssignment_1_1 )
            {
             before(grammarAccess.getNavigationAccess().getAssocRoleAssignment_1_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2580:1: ( rule__Navigation__AssocRoleAssignment_1_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2580:2: rule__Navigation__AssocRoleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Navigation__AssocRoleAssignment_1_1_in_rule__Navigation__Group_1__1__Impl5419);
            rule__Navigation__AssocRoleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getAssocRoleAssignment_1_1()); 

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
    // $ANTLR end "rule__Navigation__Group_1__1__Impl"


    // $ANTLR start "rule__Navigation__Group_2__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2594:1: rule__Navigation__Group_2__0 : rule__Navigation__Group_2__0__Impl rule__Navigation__Group_2__1 ;
    public final void rule__Navigation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2598:1: ( rule__Navigation__Group_2__0__Impl rule__Navigation__Group_2__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2599:2: rule__Navigation__Group_2__0__Impl rule__Navigation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Navigation__Group_2__0__Impl_in_rule__Navigation__Group_2__05453);
            rule__Navigation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Navigation__Group_2__1_in_rule__Navigation__Group_2__05456);
            rule__Navigation__Group_2__1();

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
    // $ANTLR end "rule__Navigation__Group_2__0"


    // $ANTLR start "rule__Navigation__Group_2__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2606:1: rule__Navigation__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Navigation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2610:1: ( ( '.' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2611:1: ( '.' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2611:1: ( '.' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2612:1: '.'
            {
             before(grammarAccess.getNavigationAccess().getFullStopKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Navigation__Group_2__0__Impl5484); 
             after(grammarAccess.getNavigationAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__Navigation__Group_2__0__Impl"


    // $ANTLR start "rule__Navigation__Group_2__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2625:1: rule__Navigation__Group_2__1 : rule__Navigation__Group_2__1__Impl ;
    public final void rule__Navigation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2629:1: ( rule__Navigation__Group_2__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2630:2: rule__Navigation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Navigation__Group_2__1__Impl_in_rule__Navigation__Group_2__15515);
            rule__Navigation__Group_2__1__Impl();

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
    // $ANTLR end "rule__Navigation__Group_2__1"


    // $ANTLR start "rule__Navigation__Group_2__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2636:1: rule__Navigation__Group_2__1__Impl : ( ( rule__Navigation__OpType1Assignment_2_1 ) ) ;
    public final void rule__Navigation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2640:1: ( ( ( rule__Navigation__OpType1Assignment_2_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2641:1: ( ( rule__Navigation__OpType1Assignment_2_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2641:1: ( ( rule__Navigation__OpType1Assignment_2_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2642:1: ( rule__Navigation__OpType1Assignment_2_1 )
            {
             before(grammarAccess.getNavigationAccess().getOpType1Assignment_2_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2643:1: ( rule__Navigation__OpType1Assignment_2_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2643:2: rule__Navigation__OpType1Assignment_2_1
            {
            pushFollow(FOLLOW_rule__Navigation__OpType1Assignment_2_1_in_rule__Navigation__Group_2__1__Impl5542);
            rule__Navigation__OpType1Assignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getOpType1Assignment_2_1()); 

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
    // $ANTLR end "rule__Navigation__Group_2__1__Impl"


    // $ANTLR start "rule__Navigation__Group_3__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2657:1: rule__Navigation__Group_3__0 : rule__Navigation__Group_3__0__Impl rule__Navigation__Group_3__1 ;
    public final void rule__Navigation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2661:1: ( rule__Navigation__Group_3__0__Impl rule__Navigation__Group_3__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2662:2: rule__Navigation__Group_3__0__Impl rule__Navigation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Navigation__Group_3__0__Impl_in_rule__Navigation__Group_3__05576);
            rule__Navigation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Navigation__Group_3__1_in_rule__Navigation__Group_3__05579);
            rule__Navigation__Group_3__1();

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
    // $ANTLR end "rule__Navigation__Group_3__0"


    // $ANTLR start "rule__Navigation__Group_3__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2669:1: rule__Navigation__Group_3__0__Impl : ( '->' ) ;
    public final void rule__Navigation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2673:1: ( ( '->' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2674:1: ( '->' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2674:1: ( '->' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2675:1: '->'
            {
             before(grammarAccess.getNavigationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__Navigation__Group_3__0__Impl5607); 
             after(grammarAccess.getNavigationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

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
    // $ANTLR end "rule__Navigation__Group_3__0__Impl"


    // $ANTLR start "rule__Navigation__Group_3__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2688:1: rule__Navigation__Group_3__1 : rule__Navigation__Group_3__1__Impl ;
    public final void rule__Navigation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2692:1: ( rule__Navigation__Group_3__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2693:2: rule__Navigation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Navigation__Group_3__1__Impl_in_rule__Navigation__Group_3__15638);
            rule__Navigation__Group_3__1__Impl();

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
    // $ANTLR end "rule__Navigation__Group_3__1"


    // $ANTLR start "rule__Navigation__Group_3__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2699:1: rule__Navigation__Group_3__1__Impl : ( ( rule__Navigation__OpType2Assignment_3_1 ) ) ;
    public final void rule__Navigation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2703:1: ( ( ( rule__Navigation__OpType2Assignment_3_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2704:1: ( ( rule__Navigation__OpType2Assignment_3_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2704:1: ( ( rule__Navigation__OpType2Assignment_3_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2705:1: ( rule__Navigation__OpType2Assignment_3_1 )
            {
             before(grammarAccess.getNavigationAccess().getOpType2Assignment_3_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2706:1: ( rule__Navigation__OpType2Assignment_3_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2706:2: rule__Navigation__OpType2Assignment_3_1
            {
            pushFollow(FOLLOW_rule__Navigation__OpType2Assignment_3_1_in_rule__Navigation__Group_3__1__Impl5665);
            rule__Navigation__OpType2Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigationAccess().getOpType2Assignment_3_1()); 

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
    // $ANTLR end "rule__Navigation__Group_3__1__Impl"


    // $ANTLR start "rule__IfSentence__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2720:1: rule__IfSentence__Group__0 : rule__IfSentence__Group__0__Impl rule__IfSentence__Group__1 ;
    public final void rule__IfSentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2724:1: ( rule__IfSentence__Group__0__Impl rule__IfSentence__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2725:2: rule__IfSentence__Group__0__Impl rule__IfSentence__Group__1
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__0__Impl_in_rule__IfSentence__Group__05699);
            rule__IfSentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfSentence__Group__1_in_rule__IfSentence__Group__05702);
            rule__IfSentence__Group__1();

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
    // $ANTLR end "rule__IfSentence__Group__0"


    // $ANTLR start "rule__IfSentence__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2732:1: rule__IfSentence__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfSentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2736:1: ( ( 'if' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2737:1: ( 'if' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2737:1: ( 'if' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2738:1: 'if'
            {
             before(grammarAccess.getIfSentenceAccess().getIfKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__IfSentence__Group__0__Impl5730); 
             after(grammarAccess.getIfSentenceAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__IfSentence__Group__0__Impl"


    // $ANTLR start "rule__IfSentence__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2751:1: rule__IfSentence__Group__1 : rule__IfSentence__Group__1__Impl rule__IfSentence__Group__2 ;
    public final void rule__IfSentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2755:1: ( rule__IfSentence__Group__1__Impl rule__IfSentence__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2756:2: rule__IfSentence__Group__1__Impl rule__IfSentence__Group__2
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__1__Impl_in_rule__IfSentence__Group__15761);
            rule__IfSentence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfSentence__Group__2_in_rule__IfSentence__Group__15764);
            rule__IfSentence__Group__2();

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
    // $ANTLR end "rule__IfSentence__Group__1"


    // $ANTLR start "rule__IfSentence__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2763:1: rule__IfSentence__Group__1__Impl : ( ( rule__IfSentence__CondAssignment_1 ) ) ;
    public final void rule__IfSentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2767:1: ( ( ( rule__IfSentence__CondAssignment_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2768:1: ( ( rule__IfSentence__CondAssignment_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2768:1: ( ( rule__IfSentence__CondAssignment_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2769:1: ( rule__IfSentence__CondAssignment_1 )
            {
             before(grammarAccess.getIfSentenceAccess().getCondAssignment_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2770:1: ( rule__IfSentence__CondAssignment_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2770:2: rule__IfSentence__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__IfSentence__CondAssignment_1_in_rule__IfSentence__Group__1__Impl5791);
            rule__IfSentence__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfSentenceAccess().getCondAssignment_1()); 

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
    // $ANTLR end "rule__IfSentence__Group__1__Impl"


    // $ANTLR start "rule__IfSentence__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2780:1: rule__IfSentence__Group__2 : rule__IfSentence__Group__2__Impl rule__IfSentence__Group__3 ;
    public final void rule__IfSentence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2784:1: ( rule__IfSentence__Group__2__Impl rule__IfSentence__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2785:2: rule__IfSentence__Group__2__Impl rule__IfSentence__Group__3
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__2__Impl_in_rule__IfSentence__Group__25821);
            rule__IfSentence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfSentence__Group__3_in_rule__IfSentence__Group__25824);
            rule__IfSentence__Group__3();

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
    // $ANTLR end "rule__IfSentence__Group__2"


    // $ANTLR start "rule__IfSentence__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2792:1: rule__IfSentence__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfSentence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2796:1: ( ( 'then' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2797:1: ( 'then' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2797:1: ( 'then' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2798:1: 'then'
            {
             before(grammarAccess.getIfSentenceAccess().getThenKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__IfSentence__Group__2__Impl5852); 
             after(grammarAccess.getIfSentenceAccess().getThenKeyword_2()); 

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
    // $ANTLR end "rule__IfSentence__Group__2__Impl"


    // $ANTLR start "rule__IfSentence__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2811:1: rule__IfSentence__Group__3 : rule__IfSentence__Group__3__Impl rule__IfSentence__Group__4 ;
    public final void rule__IfSentence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2815:1: ( rule__IfSentence__Group__3__Impl rule__IfSentence__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2816:2: rule__IfSentence__Group__3__Impl rule__IfSentence__Group__4
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__3__Impl_in_rule__IfSentence__Group__35883);
            rule__IfSentence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfSentence__Group__4_in_rule__IfSentence__Group__35886);
            rule__IfSentence__Group__4();

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
    // $ANTLR end "rule__IfSentence__Group__3"


    // $ANTLR start "rule__IfSentence__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2823:1: rule__IfSentence__Group__3__Impl : ( ( rule__IfSentence__BodyAssignment_3 ) ) ;
    public final void rule__IfSentence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2827:1: ( ( ( rule__IfSentence__BodyAssignment_3 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2828:1: ( ( rule__IfSentence__BodyAssignment_3 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2828:1: ( ( rule__IfSentence__BodyAssignment_3 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2829:1: ( rule__IfSentence__BodyAssignment_3 )
            {
             before(grammarAccess.getIfSentenceAccess().getBodyAssignment_3()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2830:1: ( rule__IfSentence__BodyAssignment_3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2830:2: rule__IfSentence__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__IfSentence__BodyAssignment_3_in_rule__IfSentence__Group__3__Impl5913);
            rule__IfSentence__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfSentenceAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__IfSentence__Group__3__Impl"


    // $ANTLR start "rule__IfSentence__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2840:1: rule__IfSentence__Group__4 : rule__IfSentence__Group__4__Impl rule__IfSentence__Group__5 ;
    public final void rule__IfSentence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2844:1: ( rule__IfSentence__Group__4__Impl rule__IfSentence__Group__5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2845:2: rule__IfSentence__Group__4__Impl rule__IfSentence__Group__5
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__4__Impl_in_rule__IfSentence__Group__45943);
            rule__IfSentence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfSentence__Group__5_in_rule__IfSentence__Group__45946);
            rule__IfSentence__Group__5();

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
    // $ANTLR end "rule__IfSentence__Group__4"


    // $ANTLR start "rule__IfSentence__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2852:1: rule__IfSentence__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfSentence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2856:1: ( ( 'else' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2857:1: ( 'else' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2857:1: ( 'else' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2858:1: 'else'
            {
             before(grammarAccess.getIfSentenceAccess().getElseKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__IfSentence__Group__4__Impl5974); 
             after(grammarAccess.getIfSentenceAccess().getElseKeyword_4()); 

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
    // $ANTLR end "rule__IfSentence__Group__4__Impl"


    // $ANTLR start "rule__IfSentence__Group__5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2871:1: rule__IfSentence__Group__5 : rule__IfSentence__Group__5__Impl rule__IfSentence__Group__6 ;
    public final void rule__IfSentence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2875:1: ( rule__IfSentence__Group__5__Impl rule__IfSentence__Group__6 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2876:2: rule__IfSentence__Group__5__Impl rule__IfSentence__Group__6
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__5__Impl_in_rule__IfSentence__Group__56005);
            rule__IfSentence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfSentence__Group__6_in_rule__IfSentence__Group__56008);
            rule__IfSentence__Group__6();

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
    // $ANTLR end "rule__IfSentence__Group__5"


    // $ANTLR start "rule__IfSentence__Group__5__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2883:1: rule__IfSentence__Group__5__Impl : ( ( rule__IfSentence__ElsebodyAssignment_5 ) ) ;
    public final void rule__IfSentence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2887:1: ( ( ( rule__IfSentence__ElsebodyAssignment_5 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2888:1: ( ( rule__IfSentence__ElsebodyAssignment_5 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2888:1: ( ( rule__IfSentence__ElsebodyAssignment_5 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2889:1: ( rule__IfSentence__ElsebodyAssignment_5 )
            {
             before(grammarAccess.getIfSentenceAccess().getElsebodyAssignment_5()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2890:1: ( rule__IfSentence__ElsebodyAssignment_5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2890:2: rule__IfSentence__ElsebodyAssignment_5
            {
            pushFollow(FOLLOW_rule__IfSentence__ElsebodyAssignment_5_in_rule__IfSentence__Group__5__Impl6035);
            rule__IfSentence__ElsebodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfSentenceAccess().getElsebodyAssignment_5()); 

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
    // $ANTLR end "rule__IfSentence__Group__5__Impl"


    // $ANTLR start "rule__IfSentence__Group__6"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2900:1: rule__IfSentence__Group__6 : rule__IfSentence__Group__6__Impl ;
    public final void rule__IfSentence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2904:1: ( rule__IfSentence__Group__6__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2905:2: rule__IfSentence__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IfSentence__Group__6__Impl_in_rule__IfSentence__Group__66065);
            rule__IfSentence__Group__6__Impl();

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
    // $ANTLR end "rule__IfSentence__Group__6"


    // $ANTLR start "rule__IfSentence__Group__6__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2911:1: rule__IfSentence__Group__6__Impl : ( 'endif' ) ;
    public final void rule__IfSentence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2915:1: ( ( 'endif' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2916:1: ( 'endif' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2916:1: ( 'endif' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2917:1: 'endif'
            {
             before(grammarAccess.getIfSentenceAccess().getEndifKeyword_6()); 
            match(input,42,FOLLOW_42_in_rule__IfSentence__Group__6__Impl6093); 
             after(grammarAccess.getIfSentenceAccess().getEndifKeyword_6()); 

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
    // $ANTLR end "rule__IfSentence__Group__6__Impl"


    // $ANTLR start "rule__ResolveExp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2944:1: rule__ResolveExp__Group__0 : rule__ResolveExp__Group__0__Impl rule__ResolveExp__Group__1 ;
    public final void rule__ResolveExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2948:1: ( rule__ResolveExp__Group__0__Impl rule__ResolveExp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2949:2: rule__ResolveExp__Group__0__Impl rule__ResolveExp__Group__1
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group__0__Impl_in_rule__ResolveExp__Group__06138);
            rule__ResolveExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResolveExp__Group__1_in_rule__ResolveExp__Group__06141);
            rule__ResolveExp__Group__1();

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
    // $ANTLR end "rule__ResolveExp__Group__0"


    // $ANTLR start "rule__ResolveExp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2956:1: rule__ResolveExp__Group__0__Impl : ( 'resolve' ) ;
    public final void rule__ResolveExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2960:1: ( ( 'resolve' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2961:1: ( 'resolve' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2961:1: ( 'resolve' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2962:1: 'resolve'
            {
             before(grammarAccess.getResolveExpAccess().getResolveKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__ResolveExp__Group__0__Impl6169); 
             after(grammarAccess.getResolveExpAccess().getResolveKeyword_0()); 

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
    // $ANTLR end "rule__ResolveExp__Group__0__Impl"


    // $ANTLR start "rule__ResolveExp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2975:1: rule__ResolveExp__Group__1 : rule__ResolveExp__Group__1__Impl rule__ResolveExp__Group__2 ;
    public final void rule__ResolveExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2979:1: ( rule__ResolveExp__Group__1__Impl rule__ResolveExp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2980:2: rule__ResolveExp__Group__1__Impl rule__ResolveExp__Group__2
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group__1__Impl_in_rule__ResolveExp__Group__16200);
            rule__ResolveExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResolveExp__Group__2_in_rule__ResolveExp__Group__16203);
            rule__ResolveExp__Group__2();

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
    // $ANTLR end "rule__ResolveExp__Group__1"


    // $ANTLR start "rule__ResolveExp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2987:1: rule__ResolveExp__Group__1__Impl : ( '(' ) ;
    public final void rule__ResolveExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2991:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2992:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2992:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:2993:1: '('
            {
             before(grammarAccess.getResolveExpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ResolveExp__Group__1__Impl6231); 
             after(grammarAccess.getResolveExpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ResolveExp__Group__1__Impl"


    // $ANTLR start "rule__ResolveExp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3006:1: rule__ResolveExp__Group__2 : rule__ResolveExp__Group__2__Impl rule__ResolveExp__Group__3 ;
    public final void rule__ResolveExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3010:1: ( rule__ResolveExp__Group__2__Impl rule__ResolveExp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3011:2: rule__ResolveExp__Group__2__Impl rule__ResolveExp__Group__3
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group__2__Impl_in_rule__ResolveExp__Group__26262);
            rule__ResolveExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResolveExp__Group__3_in_rule__ResolveExp__Group__26265);
            rule__ResolveExp__Group__3();

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
    // $ANTLR end "rule__ResolveExp__Group__2"


    // $ANTLR start "rule__ResolveExp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3018:1: rule__ResolveExp__Group__2__Impl : ( ( rule__ResolveExp__ExpAssignment_2 ) ) ;
    public final void rule__ResolveExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3022:1: ( ( ( rule__ResolveExp__ExpAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3023:1: ( ( rule__ResolveExp__ExpAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3023:1: ( ( rule__ResolveExp__ExpAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3024:1: ( rule__ResolveExp__ExpAssignment_2 )
            {
             before(grammarAccess.getResolveExpAccess().getExpAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3025:1: ( rule__ResolveExp__ExpAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3025:2: rule__ResolveExp__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__ResolveExp__ExpAssignment_2_in_rule__ResolveExp__Group__2__Impl6292);
            rule__ResolveExp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResolveExpAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__ResolveExp__Group__2__Impl"


    // $ANTLR start "rule__ResolveExp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3035:1: rule__ResolveExp__Group__3 : rule__ResolveExp__Group__3__Impl rule__ResolveExp__Group__4 ;
    public final void rule__ResolveExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3039:1: ( rule__ResolveExp__Group__3__Impl rule__ResolveExp__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3040:2: rule__ResolveExp__Group__3__Impl rule__ResolveExp__Group__4
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group__3__Impl_in_rule__ResolveExp__Group__36322);
            rule__ResolveExp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResolveExp__Group__4_in_rule__ResolveExp__Group__36325);
            rule__ResolveExp__Group__4();

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
    // $ANTLR end "rule__ResolveExp__Group__3"


    // $ANTLR start "rule__ResolveExp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3047:1: rule__ResolveExp__Group__3__Impl : ( ( rule__ResolveExp__Group_3__0 )? ) ;
    public final void rule__ResolveExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3051:1: ( ( ( rule__ResolveExp__Group_3__0 )? ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3052:1: ( ( rule__ResolveExp__Group_3__0 )? )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3052:1: ( ( rule__ResolveExp__Group_3__0 )? )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3053:1: ( rule__ResolveExp__Group_3__0 )?
            {
             before(grammarAccess.getResolveExpAccess().getGroup_3()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3054:1: ( rule__ResolveExp__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3054:2: rule__ResolveExp__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ResolveExp__Group_3__0_in_rule__ResolveExp__Group__3__Impl6352);
                    rule__ResolveExp__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResolveExpAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ResolveExp__Group__3__Impl"


    // $ANTLR start "rule__ResolveExp__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3064:1: rule__ResolveExp__Group__4 : rule__ResolveExp__Group__4__Impl ;
    public final void rule__ResolveExp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3068:1: ( rule__ResolveExp__Group__4__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3069:2: rule__ResolveExp__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group__4__Impl_in_rule__ResolveExp__Group__46383);
            rule__ResolveExp__Group__4__Impl();

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
    // $ANTLR end "rule__ResolveExp__Group__4"


    // $ANTLR start "rule__ResolveExp__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3075:1: rule__ResolveExp__Group__4__Impl : ( ')' ) ;
    public final void rule__ResolveExp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3079:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3080:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3080:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3081:1: ')'
            {
             before(grammarAccess.getResolveExpAccess().getRightParenthesisKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__ResolveExp__Group__4__Impl6411); 
             after(grammarAccess.getResolveExpAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__ResolveExp__Group__4__Impl"


    // $ANTLR start "rule__ResolveExp__Group_3__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3104:1: rule__ResolveExp__Group_3__0 : rule__ResolveExp__Group_3__0__Impl rule__ResolveExp__Group_3__1 ;
    public final void rule__ResolveExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3108:1: ( rule__ResolveExp__Group_3__0__Impl rule__ResolveExp__Group_3__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3109:2: rule__ResolveExp__Group_3__0__Impl rule__ResolveExp__Group_3__1
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group_3__0__Impl_in_rule__ResolveExp__Group_3__06452);
            rule__ResolveExp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResolveExp__Group_3__1_in_rule__ResolveExp__Group_3__06455);
            rule__ResolveExp__Group_3__1();

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
    // $ANTLR end "rule__ResolveExp__Group_3__0"


    // $ANTLR start "rule__ResolveExp__Group_3__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3116:1: rule__ResolveExp__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ResolveExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3120:1: ( ( ',' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3121:1: ( ',' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3121:1: ( ',' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3122:1: ','
            {
             before(grammarAccess.getResolveExpAccess().getCommaKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__ResolveExp__Group_3__0__Impl6483); 
             after(grammarAccess.getResolveExpAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ResolveExp__Group_3__0__Impl"


    // $ANTLR start "rule__ResolveExp__Group_3__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3135:1: rule__ResolveExp__Group_3__1 : rule__ResolveExp__Group_3__1__Impl ;
    public final void rule__ResolveExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3139:1: ( rule__ResolveExp__Group_3__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3140:2: rule__ResolveExp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ResolveExp__Group_3__1__Impl_in_rule__ResolveExp__Group_3__16514);
            rule__ResolveExp__Group_3__1__Impl();

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
    // $ANTLR end "rule__ResolveExp__Group_3__1"


    // $ANTLR start "rule__ResolveExp__Group_3__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3146:1: rule__ResolveExp__Group_3__1__Impl : ( ( rule__ResolveExp__PositionAssignment_3_1 ) ) ;
    public final void rule__ResolveExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3150:1: ( ( ( rule__ResolveExp__PositionAssignment_3_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3151:1: ( ( rule__ResolveExp__PositionAssignment_3_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3151:1: ( ( rule__ResolveExp__PositionAssignment_3_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3152:1: ( rule__ResolveExp__PositionAssignment_3_1 )
            {
             before(grammarAccess.getResolveExpAccess().getPositionAssignment_3_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3153:1: ( rule__ResolveExp__PositionAssignment_3_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3153:2: rule__ResolveExp__PositionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ResolveExp__PositionAssignment_3_1_in_rule__ResolveExp__Group_3__1__Impl6541);
            rule__ResolveExp__PositionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResolveExpAccess().getPositionAssignment_3_1()); 

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
    // $ANTLR end "rule__ResolveExp__Group_3__1__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_0__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3167:1: rule__ComplexExpression__Group_0__0 : rule__ComplexExpression__Group_0__0__Impl rule__ComplexExpression__Group_0__1 ;
    public final void rule__ComplexExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3171:1: ( rule__ComplexExpression__Group_0__0__Impl rule__ComplexExpression__Group_0__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3172:2: rule__ComplexExpression__Group_0__0__Impl rule__ComplexExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__0__Impl_in_rule__ComplexExpression__Group_0__06575);
            rule__ComplexExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__1_in_rule__ComplexExpression__Group_0__06578);
            rule__ComplexExpression__Group_0__1();

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
    // $ANTLR end "rule__ComplexExpression__Group_0__0"


    // $ANTLR start "rule__ComplexExpression__Group_0__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3179:1: rule__ComplexExpression__Group_0__0__Impl : ( ( rule__ComplexExpression__PrefixNotAssignment_0_0 ) ) ;
    public final void rule__ComplexExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3183:1: ( ( ( rule__ComplexExpression__PrefixNotAssignment_0_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3184:1: ( ( rule__ComplexExpression__PrefixNotAssignment_0_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3184:1: ( ( rule__ComplexExpression__PrefixNotAssignment_0_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3185:1: ( rule__ComplexExpression__PrefixNotAssignment_0_0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getPrefixNotAssignment_0_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3186:1: ( rule__ComplexExpression__PrefixNotAssignment_0_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3186:2: rule__ComplexExpression__PrefixNotAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ComplexExpression__PrefixNotAssignment_0_0_in_rule__ComplexExpression__Group_0__0__Impl6605);
            rule__ComplexExpression__PrefixNotAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getPrefixNotAssignment_0_0()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_0__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3196:1: rule__ComplexExpression__Group_0__1 : rule__ComplexExpression__Group_0__1__Impl rule__ComplexExpression__Group_0__2 ;
    public final void rule__ComplexExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3200:1: ( rule__ComplexExpression__Group_0__1__Impl rule__ComplexExpression__Group_0__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3201:2: rule__ComplexExpression__Group_0__1__Impl rule__ComplexExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__1__Impl_in_rule__ComplexExpression__Group_0__16635);
            rule__ComplexExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__2_in_rule__ComplexExpression__Group_0__16638);
            rule__ComplexExpression__Group_0__2();

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
    // $ANTLR end "rule__ComplexExpression__Group_0__1"


    // $ANTLR start "rule__ComplexExpression__Group_0__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3208:1: rule__ComplexExpression__Group_0__1__Impl : ( '(' ) ;
    public final void rule__ComplexExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3212:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3213:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3213:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3214:1: '('
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,33,FOLLOW_33_in_rule__ComplexExpression__Group_0__1__Impl6666); 
             after(grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_0__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3227:1: rule__ComplexExpression__Group_0__2 : rule__ComplexExpression__Group_0__2__Impl rule__ComplexExpression__Group_0__3 ;
    public final void rule__ComplexExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3231:1: ( rule__ComplexExpression__Group_0__2__Impl rule__ComplexExpression__Group_0__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3232:2: rule__ComplexExpression__Group_0__2__Impl rule__ComplexExpression__Group_0__3
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__2__Impl_in_rule__ComplexExpression__Group_0__26697);
            rule__ComplexExpression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__3_in_rule__ComplexExpression__Group_0__26700);
            rule__ComplexExpression__Group_0__3();

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
    // $ANTLR end "rule__ComplexExpression__Group_0__2"


    // $ANTLR start "rule__ComplexExpression__Group_0__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3239:1: rule__ComplexExpression__Group_0__2__Impl : ( ( rule__ComplexExpression__LeftAssignment_0_2 ) ) ;
    public final void rule__ComplexExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3243:1: ( ( ( rule__ComplexExpression__LeftAssignment_0_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3244:1: ( ( rule__ComplexExpression__LeftAssignment_0_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3244:1: ( ( rule__ComplexExpression__LeftAssignment_0_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3245:1: ( rule__ComplexExpression__LeftAssignment_0_2 )
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftAssignment_0_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3246:1: ( rule__ComplexExpression__LeftAssignment_0_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3246:2: rule__ComplexExpression__LeftAssignment_0_2
            {
            pushFollow(FOLLOW_rule__ComplexExpression__LeftAssignment_0_2_in_rule__ComplexExpression__Group_0__2__Impl6727);
            rule__ComplexExpression__LeftAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getLeftAssignment_0_2()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_0__2__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_0__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3256:1: rule__ComplexExpression__Group_0__3 : rule__ComplexExpression__Group_0__3__Impl rule__ComplexExpression__Group_0__4 ;
    public final void rule__ComplexExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3260:1: ( rule__ComplexExpression__Group_0__3__Impl rule__ComplexExpression__Group_0__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3261:2: rule__ComplexExpression__Group_0__3__Impl rule__ComplexExpression__Group_0__4
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__3__Impl_in_rule__ComplexExpression__Group_0__36757);
            rule__ComplexExpression__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__4_in_rule__ComplexExpression__Group_0__36760);
            rule__ComplexExpression__Group_0__4();

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
    // $ANTLR end "rule__ComplexExpression__Group_0__3"


    // $ANTLR start "rule__ComplexExpression__Group_0__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3268:1: rule__ComplexExpression__Group_0__3__Impl : ( ( rule__ComplexExpression__Group_0_3__0 )* ) ;
    public final void rule__ComplexExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3272:1: ( ( ( rule__ComplexExpression__Group_0_3__0 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3273:1: ( ( rule__ComplexExpression__Group_0_3__0 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3273:1: ( ( rule__ComplexExpression__Group_0_3__0 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3274:1: ( rule__ComplexExpression__Group_0_3__0 )*
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup_0_3()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3275:1: ( rule__ComplexExpression__Group_0_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=16 && LA19_0<=27)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3275:2: rule__ComplexExpression__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexExpression__Group_0_3__0_in_rule__ComplexExpression__Group_0__3__Impl6787);
            	    rule__ComplexExpression__Group_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getComplexExpressionAccess().getGroup_0_3()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_0__3__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_0__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3285:1: rule__ComplexExpression__Group_0__4 : rule__ComplexExpression__Group_0__4__Impl ;
    public final void rule__ComplexExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3289:1: ( rule__ComplexExpression__Group_0__4__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3290:2: rule__ComplexExpression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_0__4__Impl_in_rule__ComplexExpression__Group_0__46818);
            rule__ComplexExpression__Group_0__4__Impl();

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
    // $ANTLR end "rule__ComplexExpression__Group_0__4"


    // $ANTLR start "rule__ComplexExpression__Group_0__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3296:1: rule__ComplexExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ComplexExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3300:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3301:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3301:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3302:1: ')'
            {
             before(grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,34,FOLLOW_34_in_rule__ComplexExpression__Group_0__4__Impl6846); 
             after(grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_0_4()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_0__4__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_0_3__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3325:1: rule__ComplexExpression__Group_0_3__0 : rule__ComplexExpression__Group_0_3__0__Impl rule__ComplexExpression__Group_0_3__1 ;
    public final void rule__ComplexExpression__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3329:1: ( rule__ComplexExpression__Group_0_3__0__Impl rule__ComplexExpression__Group_0_3__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3330:2: rule__ComplexExpression__Group_0_3__0__Impl rule__ComplexExpression__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_0_3__0__Impl_in_rule__ComplexExpression__Group_0_3__06887);
            rule__ComplexExpression__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexExpression__Group_0_3__1_in_rule__ComplexExpression__Group_0_3__06890);
            rule__ComplexExpression__Group_0_3__1();

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
    // $ANTLR end "rule__ComplexExpression__Group_0_3__0"


    // $ANTLR start "rule__ComplexExpression__Group_0_3__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3337:1: rule__ComplexExpression__Group_0_3__0__Impl : ( ( rule__ComplexExpression__InfixOpAssignment_0_3_0 ) ) ;
    public final void rule__ComplexExpression__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3341:1: ( ( ( rule__ComplexExpression__InfixOpAssignment_0_3_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3342:1: ( ( rule__ComplexExpression__InfixOpAssignment_0_3_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3342:1: ( ( rule__ComplexExpression__InfixOpAssignment_0_3_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3343:1: ( rule__ComplexExpression__InfixOpAssignment_0_3_0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getInfixOpAssignment_0_3_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3344:1: ( rule__ComplexExpression__InfixOpAssignment_0_3_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3344:2: rule__ComplexExpression__InfixOpAssignment_0_3_0
            {
            pushFollow(FOLLOW_rule__ComplexExpression__InfixOpAssignment_0_3_0_in_rule__ComplexExpression__Group_0_3__0__Impl6917);
            rule__ComplexExpression__InfixOpAssignment_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getInfixOpAssignment_0_3_0()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_0_3__0__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_0_3__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3354:1: rule__ComplexExpression__Group_0_3__1 : rule__ComplexExpression__Group_0_3__1__Impl ;
    public final void rule__ComplexExpression__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3358:1: ( rule__ComplexExpression__Group_0_3__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3359:2: rule__ComplexExpression__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_0_3__1__Impl_in_rule__ComplexExpression__Group_0_3__16947);
            rule__ComplexExpression__Group_0_3__1__Impl();

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
    // $ANTLR end "rule__ComplexExpression__Group_0_3__1"


    // $ANTLR start "rule__ComplexExpression__Group_0_3__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3365:1: rule__ComplexExpression__Group_0_3__1__Impl : ( ( rule__ComplexExpression__RightAssignment_0_3_1 ) ) ;
    public final void rule__ComplexExpression__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3369:1: ( ( ( rule__ComplexExpression__RightAssignment_0_3_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3370:1: ( ( rule__ComplexExpression__RightAssignment_0_3_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3370:1: ( ( rule__ComplexExpression__RightAssignment_0_3_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3371:1: ( rule__ComplexExpression__RightAssignment_0_3_1 )
            {
             before(grammarAccess.getComplexExpressionAccess().getRightAssignment_0_3_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3372:1: ( rule__ComplexExpression__RightAssignment_0_3_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3372:2: rule__ComplexExpression__RightAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__ComplexExpression__RightAssignment_0_3_1_in_rule__ComplexExpression__Group_0_3__1__Impl6974);
            rule__ComplexExpression__RightAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getRightAssignment_0_3_1()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_0_3__1__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_1__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3386:1: rule__ComplexExpression__Group_1__0 : rule__ComplexExpression__Group_1__0__Impl rule__ComplexExpression__Group_1__1 ;
    public final void rule__ComplexExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3390:1: ( rule__ComplexExpression__Group_1__0__Impl rule__ComplexExpression__Group_1__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3391:2: rule__ComplexExpression__Group_1__0__Impl rule__ComplexExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_1__0__Impl_in_rule__ComplexExpression__Group_1__07008);
            rule__ComplexExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexExpression__Group_1__1_in_rule__ComplexExpression__Group_1__07011);
            rule__ComplexExpression__Group_1__1();

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
    // $ANTLR end "rule__ComplexExpression__Group_1__0"


    // $ANTLR start "rule__ComplexExpression__Group_1__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3398:1: rule__ComplexExpression__Group_1__0__Impl : ( ( rule__ComplexExpression__LeftAssignment_1_0 ) ) ;
    public final void rule__ComplexExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3402:1: ( ( ( rule__ComplexExpression__LeftAssignment_1_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3403:1: ( ( rule__ComplexExpression__LeftAssignment_1_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3403:1: ( ( rule__ComplexExpression__LeftAssignment_1_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3404:1: ( rule__ComplexExpression__LeftAssignment_1_0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftAssignment_1_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3405:1: ( rule__ComplexExpression__LeftAssignment_1_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3405:2: rule__ComplexExpression__LeftAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ComplexExpression__LeftAssignment_1_0_in_rule__ComplexExpression__Group_1__0__Impl7038);
            rule__ComplexExpression__LeftAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getLeftAssignment_1_0()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_1__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3415:1: rule__ComplexExpression__Group_1__1 : rule__ComplexExpression__Group_1__1__Impl ;
    public final void rule__ComplexExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3419:1: ( rule__ComplexExpression__Group_1__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3420:2: rule__ComplexExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_1__1__Impl_in_rule__ComplexExpression__Group_1__17068);
            rule__ComplexExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__ComplexExpression__Group_1__1"


    // $ANTLR start "rule__ComplexExpression__Group_1__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3426:1: rule__ComplexExpression__Group_1__1__Impl : ( ( rule__ComplexExpression__Group_1_1__0 )* ) ;
    public final void rule__ComplexExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3430:1: ( ( ( rule__ComplexExpression__Group_1_1__0 )* ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3431:1: ( ( rule__ComplexExpression__Group_1_1__0 )* )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3431:1: ( ( rule__ComplexExpression__Group_1_1__0 )* )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3432:1: ( rule__ComplexExpression__Group_1_1__0 )*
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup_1_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3433:1: ( rule__ComplexExpression__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=16 && LA20_0<=27)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3433:2: rule__ComplexExpression__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ComplexExpression__Group_1_1__0_in_rule__ComplexExpression__Group_1__1__Impl7095);
            	    rule__ComplexExpression__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComplexExpressionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_1_1__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3447:1: rule__ComplexExpression__Group_1_1__0 : rule__ComplexExpression__Group_1_1__0__Impl rule__ComplexExpression__Group_1_1__1 ;
    public final void rule__ComplexExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3451:1: ( rule__ComplexExpression__Group_1_1__0__Impl rule__ComplexExpression__Group_1_1__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3452:2: rule__ComplexExpression__Group_1_1__0__Impl rule__ComplexExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_1_1__0__Impl_in_rule__ComplexExpression__Group_1_1__07130);
            rule__ComplexExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexExpression__Group_1_1__1_in_rule__ComplexExpression__Group_1_1__07133);
            rule__ComplexExpression__Group_1_1__1();

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
    // $ANTLR end "rule__ComplexExpression__Group_1_1__0"


    // $ANTLR start "rule__ComplexExpression__Group_1_1__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3459:1: rule__ComplexExpression__Group_1_1__0__Impl : ( ( rule__ComplexExpression__InfixOpAssignment_1_1_0 ) ) ;
    public final void rule__ComplexExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3463:1: ( ( ( rule__ComplexExpression__InfixOpAssignment_1_1_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3464:1: ( ( rule__ComplexExpression__InfixOpAssignment_1_1_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3464:1: ( ( rule__ComplexExpression__InfixOpAssignment_1_1_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3465:1: ( rule__ComplexExpression__InfixOpAssignment_1_1_0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getInfixOpAssignment_1_1_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3466:1: ( rule__ComplexExpression__InfixOpAssignment_1_1_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3466:2: rule__ComplexExpression__InfixOpAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ComplexExpression__InfixOpAssignment_1_1_0_in_rule__ComplexExpression__Group_1_1__0__Impl7160);
            rule__ComplexExpression__InfixOpAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getInfixOpAssignment_1_1_0()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_1_1__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3476:1: rule__ComplexExpression__Group_1_1__1 : rule__ComplexExpression__Group_1_1__1__Impl ;
    public final void rule__ComplexExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3480:1: ( rule__ComplexExpression__Group_1_1__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3481:2: rule__ComplexExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ComplexExpression__Group_1_1__1__Impl_in_rule__ComplexExpression__Group_1_1__17190);
            rule__ComplexExpression__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ComplexExpression__Group_1_1__1"


    // $ANTLR start "rule__ComplexExpression__Group_1_1__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3487:1: rule__ComplexExpression__Group_1_1__1__Impl : ( ( rule__ComplexExpression__RightAssignment_1_1_1 ) ) ;
    public final void rule__ComplexExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3491:1: ( ( ( rule__ComplexExpression__RightAssignment_1_1_1 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3492:1: ( ( rule__ComplexExpression__RightAssignment_1_1_1 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3492:1: ( ( rule__ComplexExpression__RightAssignment_1_1_1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3493:1: ( rule__ComplexExpression__RightAssignment_1_1_1 )
            {
             before(grammarAccess.getComplexExpressionAccess().getRightAssignment_1_1_1()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3494:1: ( rule__ComplexExpression__RightAssignment_1_1_1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3494:2: rule__ComplexExpression__RightAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__ComplexExpression__RightAssignment_1_1_1_in_rule__ComplexExpression__Group_1_1__1__Impl7217);
            rule__ComplexExpression__RightAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getRightAssignment_1_1_1()); 

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
    // $ANTLR end "rule__ComplexExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__AssocRoleName__Group_2__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3508:1: rule__AssocRoleName__Group_2__0 : rule__AssocRoleName__Group_2__0__Impl rule__AssocRoleName__Group_2__1 ;
    public final void rule__AssocRoleName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3512:1: ( rule__AssocRoleName__Group_2__0__Impl rule__AssocRoleName__Group_2__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3513:2: rule__AssocRoleName__Group_2__0__Impl rule__AssocRoleName__Group_2__1
            {
            pushFollow(FOLLOW_rule__AssocRoleName__Group_2__0__Impl_in_rule__AssocRoleName__Group_2__07251);
            rule__AssocRoleName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssocRoleName__Group_2__1_in_rule__AssocRoleName__Group_2__07254);
            rule__AssocRoleName__Group_2__1();

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
    // $ANTLR end "rule__AssocRoleName__Group_2__0"


    // $ANTLR start "rule__AssocRoleName__Group_2__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3520:1: rule__AssocRoleName__Group_2__0__Impl : ( ( rule__AssocRoleName__NameAssignment_2_0 ) ) ;
    public final void rule__AssocRoleName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3524:1: ( ( ( rule__AssocRoleName__NameAssignment_2_0 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3525:1: ( ( rule__AssocRoleName__NameAssignment_2_0 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3525:1: ( ( rule__AssocRoleName__NameAssignment_2_0 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3526:1: ( rule__AssocRoleName__NameAssignment_2_0 )
            {
             before(grammarAccess.getAssocRoleNameAccess().getNameAssignment_2_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3527:1: ( rule__AssocRoleName__NameAssignment_2_0 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3527:2: rule__AssocRoleName__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__AssocRoleName__NameAssignment_2_0_in_rule__AssocRoleName__Group_2__0__Impl7281);
            rule__AssocRoleName__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssocRoleNameAccess().getNameAssignment_2_0()); 

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
    // $ANTLR end "rule__AssocRoleName__Group_2__0__Impl"


    // $ANTLR start "rule__AssocRoleName__Group_2__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3537:1: rule__AssocRoleName__Group_2__1 : rule__AssocRoleName__Group_2__1__Impl ;
    public final void rule__AssocRoleName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3541:1: ( rule__AssocRoleName__Group_2__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3542:2: rule__AssocRoleName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AssocRoleName__Group_2__1__Impl_in_rule__AssocRoleName__Group_2__17311);
            rule__AssocRoleName__Group_2__1__Impl();

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
    // $ANTLR end "rule__AssocRoleName__Group_2__1"


    // $ANTLR start "rule__AssocRoleName__Group_2__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3548:1: rule__AssocRoleName__Group_2__1__Impl : ( '()' ) ;
    public final void rule__AssocRoleName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3552:1: ( ( '()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3553:1: ( '()' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3553:1: ( '()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3554:1: '()'
            {
             before(grammarAccess.getAssocRoleNameAccess().getLeftParenthesisRightParenthesisKeyword_2_1()); 
            match(input,45,FOLLOW_45_in_rule__AssocRoleName__Group_2__1__Impl7339); 
             after(grammarAccess.getAssocRoleNameAccess().getLeftParenthesisRightParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__AssocRoleName__Group_2__1__Impl"


    // $ANTLR start "rule__SizeOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3571:1: rule__SizeOp__Group__0 : rule__SizeOp__Group__0__Impl rule__SizeOp__Group__1 ;
    public final void rule__SizeOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3575:1: ( rule__SizeOp__Group__0__Impl rule__SizeOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3576:2: rule__SizeOp__Group__0__Impl rule__SizeOp__Group__1
            {
            pushFollow(FOLLOW_rule__SizeOp__Group__0__Impl_in_rule__SizeOp__Group__07374);
            rule__SizeOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SizeOp__Group__1_in_rule__SizeOp__Group__07377);
            rule__SizeOp__Group__1();

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
    // $ANTLR end "rule__SizeOp__Group__0"


    // $ANTLR start "rule__SizeOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3583:1: rule__SizeOp__Group__0__Impl : ( 'size' ) ;
    public final void rule__SizeOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3587:1: ( ( 'size' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3588:1: ( 'size' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3588:1: ( 'size' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3589:1: 'size'
            {
             before(grammarAccess.getSizeOpAccess().getSizeKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__SizeOp__Group__0__Impl7405); 
             after(grammarAccess.getSizeOpAccess().getSizeKeyword_0()); 

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
    // $ANTLR end "rule__SizeOp__Group__0__Impl"


    // $ANTLR start "rule__SizeOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3602:1: rule__SizeOp__Group__1 : rule__SizeOp__Group__1__Impl ;
    public final void rule__SizeOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3606:1: ( rule__SizeOp__Group__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3607:2: rule__SizeOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SizeOp__Group__1__Impl_in_rule__SizeOp__Group__17436);
            rule__SizeOp__Group__1__Impl();

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
    // $ANTLR end "rule__SizeOp__Group__1"


    // $ANTLR start "rule__SizeOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3613:1: rule__SizeOp__Group__1__Impl : ( '()' ) ;
    public final void rule__SizeOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3617:1: ( ( '()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3618:1: ( '()' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3618:1: ( '()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3619:1: '()'
            {
             before(grammarAccess.getSizeOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__SizeOp__Group__1__Impl7464); 
             after(grammarAccess.getSizeOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SizeOp__Group__1__Impl"


    // $ANTLR start "rule__FirstOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3636:1: rule__FirstOp__Group__0 : rule__FirstOp__Group__0__Impl rule__FirstOp__Group__1 ;
    public final void rule__FirstOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3640:1: ( rule__FirstOp__Group__0__Impl rule__FirstOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3641:2: rule__FirstOp__Group__0__Impl rule__FirstOp__Group__1
            {
            pushFollow(FOLLOW_rule__FirstOp__Group__0__Impl_in_rule__FirstOp__Group__07499);
            rule__FirstOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FirstOp__Group__1_in_rule__FirstOp__Group__07502);
            rule__FirstOp__Group__1();

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
    // $ANTLR end "rule__FirstOp__Group__0"


    // $ANTLR start "rule__FirstOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3648:1: rule__FirstOp__Group__0__Impl : ( 'first' ) ;
    public final void rule__FirstOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3652:1: ( ( 'first' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3653:1: ( 'first' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3653:1: ( 'first' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3654:1: 'first'
            {
             before(grammarAccess.getFirstOpAccess().getFirstKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__FirstOp__Group__0__Impl7530); 
             after(grammarAccess.getFirstOpAccess().getFirstKeyword_0()); 

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
    // $ANTLR end "rule__FirstOp__Group__0__Impl"


    // $ANTLR start "rule__FirstOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3667:1: rule__FirstOp__Group__1 : rule__FirstOp__Group__1__Impl ;
    public final void rule__FirstOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3671:1: ( rule__FirstOp__Group__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3672:2: rule__FirstOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FirstOp__Group__1__Impl_in_rule__FirstOp__Group__17561);
            rule__FirstOp__Group__1__Impl();

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
    // $ANTLR end "rule__FirstOp__Group__1"


    // $ANTLR start "rule__FirstOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3678:1: rule__FirstOp__Group__1__Impl : ( '()' ) ;
    public final void rule__FirstOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3682:1: ( ( '()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3683:1: ( '()' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3683:1: ( '()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3684:1: '()'
            {
             before(grammarAccess.getFirstOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__FirstOp__Group__1__Impl7589); 
             after(grammarAccess.getFirstOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FirstOp__Group__1__Impl"


    // $ANTLR start "rule__LastOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3701:1: rule__LastOp__Group__0 : rule__LastOp__Group__0__Impl rule__LastOp__Group__1 ;
    public final void rule__LastOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3705:1: ( rule__LastOp__Group__0__Impl rule__LastOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3706:2: rule__LastOp__Group__0__Impl rule__LastOp__Group__1
            {
            pushFollow(FOLLOW_rule__LastOp__Group__0__Impl_in_rule__LastOp__Group__07624);
            rule__LastOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LastOp__Group__1_in_rule__LastOp__Group__07627);
            rule__LastOp__Group__1();

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
    // $ANTLR end "rule__LastOp__Group__0"


    // $ANTLR start "rule__LastOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3713:1: rule__LastOp__Group__0__Impl : ( 'last' ) ;
    public final void rule__LastOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3717:1: ( ( 'last' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3718:1: ( 'last' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3718:1: ( 'last' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3719:1: 'last'
            {
             before(grammarAccess.getLastOpAccess().getLastKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__LastOp__Group__0__Impl7655); 
             after(grammarAccess.getLastOpAccess().getLastKeyword_0()); 

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
    // $ANTLR end "rule__LastOp__Group__0__Impl"


    // $ANTLR start "rule__LastOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3732:1: rule__LastOp__Group__1 : rule__LastOp__Group__1__Impl ;
    public final void rule__LastOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3736:1: ( rule__LastOp__Group__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3737:2: rule__LastOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LastOp__Group__1__Impl_in_rule__LastOp__Group__17686);
            rule__LastOp__Group__1__Impl();

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
    // $ANTLR end "rule__LastOp__Group__1"


    // $ANTLR start "rule__LastOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3743:1: rule__LastOp__Group__1__Impl : ( '()' ) ;
    public final void rule__LastOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3747:1: ( ( '()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3748:1: ( '()' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3748:1: ( '()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3749:1: '()'
            {
             before(grammarAccess.getLastOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__LastOp__Group__1__Impl7714); 
             after(grammarAccess.getLastOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__LastOp__Group__1__Impl"


    // $ANTLR start "rule__IndexOfOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3766:1: rule__IndexOfOp__Group__0 : rule__IndexOfOp__Group__0__Impl rule__IndexOfOp__Group__1 ;
    public final void rule__IndexOfOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3770:1: ( rule__IndexOfOp__Group__0__Impl rule__IndexOfOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3771:2: rule__IndexOfOp__Group__0__Impl rule__IndexOfOp__Group__1
            {
            pushFollow(FOLLOW_rule__IndexOfOp__Group__0__Impl_in_rule__IndexOfOp__Group__07749);
            rule__IndexOfOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexOfOp__Group__1_in_rule__IndexOfOp__Group__07752);
            rule__IndexOfOp__Group__1();

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
    // $ANTLR end "rule__IndexOfOp__Group__0"


    // $ANTLR start "rule__IndexOfOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3778:1: rule__IndexOfOp__Group__0__Impl : ( 'indexOf' ) ;
    public final void rule__IndexOfOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3782:1: ( ( 'indexOf' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3783:1: ( 'indexOf' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3783:1: ( 'indexOf' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3784:1: 'indexOf'
            {
             before(grammarAccess.getIndexOfOpAccess().getIndexOfKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__IndexOfOp__Group__0__Impl7780); 
             after(grammarAccess.getIndexOfOpAccess().getIndexOfKeyword_0()); 

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
    // $ANTLR end "rule__IndexOfOp__Group__0__Impl"


    // $ANTLR start "rule__IndexOfOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3797:1: rule__IndexOfOp__Group__1 : rule__IndexOfOp__Group__1__Impl rule__IndexOfOp__Group__2 ;
    public final void rule__IndexOfOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3801:1: ( rule__IndexOfOp__Group__1__Impl rule__IndexOfOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3802:2: rule__IndexOfOp__Group__1__Impl rule__IndexOfOp__Group__2
            {
            pushFollow(FOLLOW_rule__IndexOfOp__Group__1__Impl_in_rule__IndexOfOp__Group__17811);
            rule__IndexOfOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexOfOp__Group__2_in_rule__IndexOfOp__Group__17814);
            rule__IndexOfOp__Group__2();

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
    // $ANTLR end "rule__IndexOfOp__Group__1"


    // $ANTLR start "rule__IndexOfOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3809:1: rule__IndexOfOp__Group__1__Impl : ( '(' ) ;
    public final void rule__IndexOfOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3813:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3814:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3814:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3815:1: '('
            {
             before(grammarAccess.getIndexOfOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IndexOfOp__Group__1__Impl7842); 
             after(grammarAccess.getIndexOfOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IndexOfOp__Group__1__Impl"


    // $ANTLR start "rule__IndexOfOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3828:1: rule__IndexOfOp__Group__2 : rule__IndexOfOp__Group__2__Impl rule__IndexOfOp__Group__3 ;
    public final void rule__IndexOfOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3832:1: ( rule__IndexOfOp__Group__2__Impl rule__IndexOfOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3833:2: rule__IndexOfOp__Group__2__Impl rule__IndexOfOp__Group__3
            {
            pushFollow(FOLLOW_rule__IndexOfOp__Group__2__Impl_in_rule__IndexOfOp__Group__27873);
            rule__IndexOfOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IndexOfOp__Group__3_in_rule__IndexOfOp__Group__27876);
            rule__IndexOfOp__Group__3();

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
    // $ANTLR end "rule__IndexOfOp__Group__2"


    // $ANTLR start "rule__IndexOfOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3840:1: rule__IndexOfOp__Group__2__Impl : ( ( rule__IndexOfOp__IndexAssignment_2 ) ) ;
    public final void rule__IndexOfOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3844:1: ( ( ( rule__IndexOfOp__IndexAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3845:1: ( ( rule__IndexOfOp__IndexAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3845:1: ( ( rule__IndexOfOp__IndexAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3846:1: ( rule__IndexOfOp__IndexAssignment_2 )
            {
             before(grammarAccess.getIndexOfOpAccess().getIndexAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3847:1: ( rule__IndexOfOp__IndexAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3847:2: rule__IndexOfOp__IndexAssignment_2
            {
            pushFollow(FOLLOW_rule__IndexOfOp__IndexAssignment_2_in_rule__IndexOfOp__Group__2__Impl7903);
            rule__IndexOfOp__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIndexOfOpAccess().getIndexAssignment_2()); 

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
    // $ANTLR end "rule__IndexOfOp__Group__2__Impl"


    // $ANTLR start "rule__IndexOfOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3857:1: rule__IndexOfOp__Group__3 : rule__IndexOfOp__Group__3__Impl ;
    public final void rule__IndexOfOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3861:1: ( rule__IndexOfOp__Group__3__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3862:2: rule__IndexOfOp__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IndexOfOp__Group__3__Impl_in_rule__IndexOfOp__Group__37933);
            rule__IndexOfOp__Group__3__Impl();

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
    // $ANTLR end "rule__IndexOfOp__Group__3"


    // $ANTLR start "rule__IndexOfOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3868:1: rule__IndexOfOp__Group__3__Impl : ( ')' ) ;
    public final void rule__IndexOfOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3872:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3873:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3873:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3874:1: ')'
            {
             before(grammarAccess.getIndexOfOpAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__IndexOfOp__Group__3__Impl7961); 
             after(grammarAccess.getIndexOfOpAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IndexOfOp__Group__3__Impl"


    // $ANTLR start "rule__AllInstancesOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3895:1: rule__AllInstancesOp__Group__0 : rule__AllInstancesOp__Group__0__Impl rule__AllInstancesOp__Group__1 ;
    public final void rule__AllInstancesOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3899:1: ( rule__AllInstancesOp__Group__0__Impl rule__AllInstancesOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3900:2: rule__AllInstancesOp__Group__0__Impl rule__AllInstancesOp__Group__1
            {
            pushFollow(FOLLOW_rule__AllInstancesOp__Group__0__Impl_in_rule__AllInstancesOp__Group__08000);
            rule__AllInstancesOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllInstancesOp__Group__1_in_rule__AllInstancesOp__Group__08003);
            rule__AllInstancesOp__Group__1();

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
    // $ANTLR end "rule__AllInstancesOp__Group__0"


    // $ANTLR start "rule__AllInstancesOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3907:1: rule__AllInstancesOp__Group__0__Impl : ( 'allInstances' ) ;
    public final void rule__AllInstancesOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3911:1: ( ( 'allInstances' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3912:1: ( 'allInstances' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3912:1: ( 'allInstances' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3913:1: 'allInstances'
            {
             before(grammarAccess.getAllInstancesOpAccess().getAllInstancesKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__AllInstancesOp__Group__0__Impl8031); 
             after(grammarAccess.getAllInstancesOpAccess().getAllInstancesKeyword_0()); 

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
    // $ANTLR end "rule__AllInstancesOp__Group__0__Impl"


    // $ANTLR start "rule__AllInstancesOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3926:1: rule__AllInstancesOp__Group__1 : rule__AllInstancesOp__Group__1__Impl ;
    public final void rule__AllInstancesOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3930:1: ( rule__AllInstancesOp__Group__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3931:2: rule__AllInstancesOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AllInstancesOp__Group__1__Impl_in_rule__AllInstancesOp__Group__18062);
            rule__AllInstancesOp__Group__1__Impl();

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
    // $ANTLR end "rule__AllInstancesOp__Group__1"


    // $ANTLR start "rule__AllInstancesOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3937:1: rule__AllInstancesOp__Group__1__Impl : ( '()' ) ;
    public final void rule__AllInstancesOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3941:1: ( ( '()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3942:1: ( '()' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3942:1: ( '()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3943:1: '()'
            {
             before(grammarAccess.getAllInstancesOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__AllInstancesOp__Group__1__Impl8090); 
             after(grammarAccess.getAllInstancesOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AllInstancesOp__Group__1__Impl"


    // $ANTLR start "rule__ForAllOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3960:1: rule__ForAllOp__Group__0 : rule__ForAllOp__Group__0__Impl rule__ForAllOp__Group__1 ;
    public final void rule__ForAllOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3964:1: ( rule__ForAllOp__Group__0__Impl rule__ForAllOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3965:2: rule__ForAllOp__Group__0__Impl rule__ForAllOp__Group__1
            {
            pushFollow(FOLLOW_rule__ForAllOp__Group__0__Impl_in_rule__ForAllOp__Group__08125);
            rule__ForAllOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAllOp__Group__1_in_rule__ForAllOp__Group__08128);
            rule__ForAllOp__Group__1();

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
    // $ANTLR end "rule__ForAllOp__Group__0"


    // $ANTLR start "rule__ForAllOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3972:1: rule__ForAllOp__Group__0__Impl : ( 'forAll' ) ;
    public final void rule__ForAllOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3976:1: ( ( 'forAll' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3977:1: ( 'forAll' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3977:1: ( 'forAll' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3978:1: 'forAll'
            {
             before(grammarAccess.getForAllOpAccess().getForAllKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ForAllOp__Group__0__Impl8156); 
             after(grammarAccess.getForAllOpAccess().getForAllKeyword_0()); 

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
    // $ANTLR end "rule__ForAllOp__Group__0__Impl"


    // $ANTLR start "rule__ForAllOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3991:1: rule__ForAllOp__Group__1 : rule__ForAllOp__Group__1__Impl rule__ForAllOp__Group__2 ;
    public final void rule__ForAllOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3995:1: ( rule__ForAllOp__Group__1__Impl rule__ForAllOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:3996:2: rule__ForAllOp__Group__1__Impl rule__ForAllOp__Group__2
            {
            pushFollow(FOLLOW_rule__ForAllOp__Group__1__Impl_in_rule__ForAllOp__Group__18187);
            rule__ForAllOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAllOp__Group__2_in_rule__ForAllOp__Group__18190);
            rule__ForAllOp__Group__2();

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
    // $ANTLR end "rule__ForAllOp__Group__1"


    // $ANTLR start "rule__ForAllOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4003:1: rule__ForAllOp__Group__1__Impl : ( '(' ) ;
    public final void rule__ForAllOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4007:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4008:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4008:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4009:1: '('
            {
             before(grammarAccess.getForAllOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ForAllOp__Group__1__Impl8218); 
             after(grammarAccess.getForAllOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ForAllOp__Group__1__Impl"


    // $ANTLR start "rule__ForAllOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4022:1: rule__ForAllOp__Group__2 : rule__ForAllOp__Group__2__Impl rule__ForAllOp__Group__3 ;
    public final void rule__ForAllOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4026:1: ( rule__ForAllOp__Group__2__Impl rule__ForAllOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4027:2: rule__ForAllOp__Group__2__Impl rule__ForAllOp__Group__3
            {
            pushFollow(FOLLOW_rule__ForAllOp__Group__2__Impl_in_rule__ForAllOp__Group__28249);
            rule__ForAllOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAllOp__Group__3_in_rule__ForAllOp__Group__28252);
            rule__ForAllOp__Group__3();

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
    // $ANTLR end "rule__ForAllOp__Group__2"


    // $ANTLR start "rule__ForAllOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4034:1: rule__ForAllOp__Group__2__Impl : ( ( rule__ForAllOp__VarAssignment_2 ) ) ;
    public final void rule__ForAllOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4038:1: ( ( ( rule__ForAllOp__VarAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4039:1: ( ( rule__ForAllOp__VarAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4039:1: ( ( rule__ForAllOp__VarAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4040:1: ( rule__ForAllOp__VarAssignment_2 )
            {
             before(grammarAccess.getForAllOpAccess().getVarAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4041:1: ( rule__ForAllOp__VarAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4041:2: rule__ForAllOp__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__ForAllOp__VarAssignment_2_in_rule__ForAllOp__Group__2__Impl8279);
            rule__ForAllOp__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForAllOpAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__ForAllOp__Group__2__Impl"


    // $ANTLR start "rule__ForAllOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4051:1: rule__ForAllOp__Group__3 : rule__ForAllOp__Group__3__Impl rule__ForAllOp__Group__4 ;
    public final void rule__ForAllOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4055:1: ( rule__ForAllOp__Group__3__Impl rule__ForAllOp__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4056:2: rule__ForAllOp__Group__3__Impl rule__ForAllOp__Group__4
            {
            pushFollow(FOLLOW_rule__ForAllOp__Group__3__Impl_in_rule__ForAllOp__Group__38309);
            rule__ForAllOp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAllOp__Group__4_in_rule__ForAllOp__Group__38312);
            rule__ForAllOp__Group__4();

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
    // $ANTLR end "rule__ForAllOp__Group__3"


    // $ANTLR start "rule__ForAllOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4063:1: rule__ForAllOp__Group__3__Impl : ( '|' ) ;
    public final void rule__ForAllOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4067:1: ( ( '|' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4068:1: ( '|' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4068:1: ( '|' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4069:1: '|'
            {
             before(grammarAccess.getForAllOpAccess().getVerticalLineKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__ForAllOp__Group__3__Impl8340); 
             after(grammarAccess.getForAllOpAccess().getVerticalLineKeyword_3()); 

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
    // $ANTLR end "rule__ForAllOp__Group__3__Impl"


    // $ANTLR start "rule__ForAllOp__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4082:1: rule__ForAllOp__Group__4 : rule__ForAllOp__Group__4__Impl rule__ForAllOp__Group__5 ;
    public final void rule__ForAllOp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4086:1: ( rule__ForAllOp__Group__4__Impl rule__ForAllOp__Group__5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4087:2: rule__ForAllOp__Group__4__Impl rule__ForAllOp__Group__5
            {
            pushFollow(FOLLOW_rule__ForAllOp__Group__4__Impl_in_rule__ForAllOp__Group__48371);
            rule__ForAllOp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAllOp__Group__5_in_rule__ForAllOp__Group__48374);
            rule__ForAllOp__Group__5();

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
    // $ANTLR end "rule__ForAllOp__Group__4"


    // $ANTLR start "rule__ForAllOp__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4094:1: rule__ForAllOp__Group__4__Impl : ( ( rule__ForAllOp__ExpAssignment_4 ) ) ;
    public final void rule__ForAllOp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4098:1: ( ( ( rule__ForAllOp__ExpAssignment_4 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4099:1: ( ( rule__ForAllOp__ExpAssignment_4 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4099:1: ( ( rule__ForAllOp__ExpAssignment_4 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4100:1: ( rule__ForAllOp__ExpAssignment_4 )
            {
             before(grammarAccess.getForAllOpAccess().getExpAssignment_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4101:1: ( rule__ForAllOp__ExpAssignment_4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4101:2: rule__ForAllOp__ExpAssignment_4
            {
            pushFollow(FOLLOW_rule__ForAllOp__ExpAssignment_4_in_rule__ForAllOp__Group__4__Impl8401);
            rule__ForAllOp__ExpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForAllOpAccess().getExpAssignment_4()); 

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
    // $ANTLR end "rule__ForAllOp__Group__4__Impl"


    // $ANTLR start "rule__ForAllOp__Group__5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4111:1: rule__ForAllOp__Group__5 : rule__ForAllOp__Group__5__Impl ;
    public final void rule__ForAllOp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4115:1: ( rule__ForAllOp__Group__5__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4116:2: rule__ForAllOp__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ForAllOp__Group__5__Impl_in_rule__ForAllOp__Group__58431);
            rule__ForAllOp__Group__5__Impl();

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
    // $ANTLR end "rule__ForAllOp__Group__5"


    // $ANTLR start "rule__ForAllOp__Group__5__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4122:1: rule__ForAllOp__Group__5__Impl : ( ')' ) ;
    public final void rule__ForAllOp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4126:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4127:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4127:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4128:1: ')'
            {
             before(grammarAccess.getForAllOpAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__ForAllOp__Group__5__Impl8459); 
             after(grammarAccess.getForAllOpAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__ForAllOp__Group__5__Impl"


    // $ANTLR start "rule__ExistsOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4153:1: rule__ExistsOp__Group__0 : rule__ExistsOp__Group__0__Impl rule__ExistsOp__Group__1 ;
    public final void rule__ExistsOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4157:1: ( rule__ExistsOp__Group__0__Impl rule__ExistsOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4158:2: rule__ExistsOp__Group__0__Impl rule__ExistsOp__Group__1
            {
            pushFollow(FOLLOW_rule__ExistsOp__Group__0__Impl_in_rule__ExistsOp__Group__08502);
            rule__ExistsOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsOp__Group__1_in_rule__ExistsOp__Group__08505);
            rule__ExistsOp__Group__1();

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
    // $ANTLR end "rule__ExistsOp__Group__0"


    // $ANTLR start "rule__ExistsOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4165:1: rule__ExistsOp__Group__0__Impl : ( 'exists' ) ;
    public final void rule__ExistsOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4169:1: ( ( 'exists' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4170:1: ( 'exists' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4170:1: ( 'exists' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4171:1: 'exists'
            {
             before(grammarAccess.getExistsOpAccess().getExistsKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__ExistsOp__Group__0__Impl8533); 
             after(grammarAccess.getExistsOpAccess().getExistsKeyword_0()); 

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
    // $ANTLR end "rule__ExistsOp__Group__0__Impl"


    // $ANTLR start "rule__ExistsOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4184:1: rule__ExistsOp__Group__1 : rule__ExistsOp__Group__1__Impl rule__ExistsOp__Group__2 ;
    public final void rule__ExistsOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4188:1: ( rule__ExistsOp__Group__1__Impl rule__ExistsOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4189:2: rule__ExistsOp__Group__1__Impl rule__ExistsOp__Group__2
            {
            pushFollow(FOLLOW_rule__ExistsOp__Group__1__Impl_in_rule__ExistsOp__Group__18564);
            rule__ExistsOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsOp__Group__2_in_rule__ExistsOp__Group__18567);
            rule__ExistsOp__Group__2();

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
    // $ANTLR end "rule__ExistsOp__Group__1"


    // $ANTLR start "rule__ExistsOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4196:1: rule__ExistsOp__Group__1__Impl : ( '(' ) ;
    public final void rule__ExistsOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4200:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4201:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4201:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4202:1: '('
            {
             before(grammarAccess.getExistsOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ExistsOp__Group__1__Impl8595); 
             after(grammarAccess.getExistsOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ExistsOp__Group__1__Impl"


    // $ANTLR start "rule__ExistsOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4215:1: rule__ExistsOp__Group__2 : rule__ExistsOp__Group__2__Impl rule__ExistsOp__Group__3 ;
    public final void rule__ExistsOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4219:1: ( rule__ExistsOp__Group__2__Impl rule__ExistsOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4220:2: rule__ExistsOp__Group__2__Impl rule__ExistsOp__Group__3
            {
            pushFollow(FOLLOW_rule__ExistsOp__Group__2__Impl_in_rule__ExistsOp__Group__28626);
            rule__ExistsOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsOp__Group__3_in_rule__ExistsOp__Group__28629);
            rule__ExistsOp__Group__3();

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
    // $ANTLR end "rule__ExistsOp__Group__2"


    // $ANTLR start "rule__ExistsOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4227:1: rule__ExistsOp__Group__2__Impl : ( ( rule__ExistsOp__VarAssignment_2 ) ) ;
    public final void rule__ExistsOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4231:1: ( ( ( rule__ExistsOp__VarAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4232:1: ( ( rule__ExistsOp__VarAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4232:1: ( ( rule__ExistsOp__VarAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4233:1: ( rule__ExistsOp__VarAssignment_2 )
            {
             before(grammarAccess.getExistsOpAccess().getVarAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4234:1: ( rule__ExistsOp__VarAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4234:2: rule__ExistsOp__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__ExistsOp__VarAssignment_2_in_rule__ExistsOp__Group__2__Impl8656);
            rule__ExistsOp__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExistsOpAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__ExistsOp__Group__2__Impl"


    // $ANTLR start "rule__ExistsOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4244:1: rule__ExistsOp__Group__3 : rule__ExistsOp__Group__3__Impl rule__ExistsOp__Group__4 ;
    public final void rule__ExistsOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4248:1: ( rule__ExistsOp__Group__3__Impl rule__ExistsOp__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4249:2: rule__ExistsOp__Group__3__Impl rule__ExistsOp__Group__4
            {
            pushFollow(FOLLOW_rule__ExistsOp__Group__3__Impl_in_rule__ExistsOp__Group__38686);
            rule__ExistsOp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsOp__Group__4_in_rule__ExistsOp__Group__38689);
            rule__ExistsOp__Group__4();

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
    // $ANTLR end "rule__ExistsOp__Group__3"


    // $ANTLR start "rule__ExistsOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4256:1: rule__ExistsOp__Group__3__Impl : ( '|' ) ;
    public final void rule__ExistsOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4260:1: ( ( '|' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4261:1: ( '|' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4261:1: ( '|' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4262:1: '|'
            {
             before(grammarAccess.getExistsOpAccess().getVerticalLineKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__ExistsOp__Group__3__Impl8717); 
             after(grammarAccess.getExistsOpAccess().getVerticalLineKeyword_3()); 

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
    // $ANTLR end "rule__ExistsOp__Group__3__Impl"


    // $ANTLR start "rule__ExistsOp__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4275:1: rule__ExistsOp__Group__4 : rule__ExistsOp__Group__4__Impl rule__ExistsOp__Group__5 ;
    public final void rule__ExistsOp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4279:1: ( rule__ExistsOp__Group__4__Impl rule__ExistsOp__Group__5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4280:2: rule__ExistsOp__Group__4__Impl rule__ExistsOp__Group__5
            {
            pushFollow(FOLLOW_rule__ExistsOp__Group__4__Impl_in_rule__ExistsOp__Group__48748);
            rule__ExistsOp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsOp__Group__5_in_rule__ExistsOp__Group__48751);
            rule__ExistsOp__Group__5();

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
    // $ANTLR end "rule__ExistsOp__Group__4"


    // $ANTLR start "rule__ExistsOp__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4287:1: rule__ExistsOp__Group__4__Impl : ( ( rule__ExistsOp__ExpAssignment_4 ) ) ;
    public final void rule__ExistsOp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4291:1: ( ( ( rule__ExistsOp__ExpAssignment_4 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4292:1: ( ( rule__ExistsOp__ExpAssignment_4 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4292:1: ( ( rule__ExistsOp__ExpAssignment_4 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4293:1: ( rule__ExistsOp__ExpAssignment_4 )
            {
             before(grammarAccess.getExistsOpAccess().getExpAssignment_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4294:1: ( rule__ExistsOp__ExpAssignment_4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4294:2: rule__ExistsOp__ExpAssignment_4
            {
            pushFollow(FOLLOW_rule__ExistsOp__ExpAssignment_4_in_rule__ExistsOp__Group__4__Impl8778);
            rule__ExistsOp__ExpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExistsOpAccess().getExpAssignment_4()); 

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
    // $ANTLR end "rule__ExistsOp__Group__4__Impl"


    // $ANTLR start "rule__ExistsOp__Group__5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4304:1: rule__ExistsOp__Group__5 : rule__ExistsOp__Group__5__Impl ;
    public final void rule__ExistsOp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4308:1: ( rule__ExistsOp__Group__5__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4309:2: rule__ExistsOp__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ExistsOp__Group__5__Impl_in_rule__ExistsOp__Group__58808);
            rule__ExistsOp__Group__5__Impl();

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
    // $ANTLR end "rule__ExistsOp__Group__5"


    // $ANTLR start "rule__ExistsOp__Group__5__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4315:1: rule__ExistsOp__Group__5__Impl : ( ')' ) ;
    public final void rule__ExistsOp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4319:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4320:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4320:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4321:1: ')'
            {
             before(grammarAccess.getExistsOpAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__ExistsOp__Group__5__Impl8836); 
             after(grammarAccess.getExistsOpAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__ExistsOp__Group__5__Impl"


    // $ANTLR start "rule__SelectOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4346:1: rule__SelectOp__Group__0 : rule__SelectOp__Group__0__Impl rule__SelectOp__Group__1 ;
    public final void rule__SelectOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4350:1: ( rule__SelectOp__Group__0__Impl rule__SelectOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4351:2: rule__SelectOp__Group__0__Impl rule__SelectOp__Group__1
            {
            pushFollow(FOLLOW_rule__SelectOp__Group__0__Impl_in_rule__SelectOp__Group__08879);
            rule__SelectOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectOp__Group__1_in_rule__SelectOp__Group__08882);
            rule__SelectOp__Group__1();

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
    // $ANTLR end "rule__SelectOp__Group__0"


    // $ANTLR start "rule__SelectOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4358:1: rule__SelectOp__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4362:1: ( ( 'select' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4363:1: ( 'select' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4363:1: ( 'select' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4364:1: 'select'
            {
             before(grammarAccess.getSelectOpAccess().getSelectKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__SelectOp__Group__0__Impl8910); 
             after(grammarAccess.getSelectOpAccess().getSelectKeyword_0()); 

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
    // $ANTLR end "rule__SelectOp__Group__0__Impl"


    // $ANTLR start "rule__SelectOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4377:1: rule__SelectOp__Group__1 : rule__SelectOp__Group__1__Impl rule__SelectOp__Group__2 ;
    public final void rule__SelectOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4381:1: ( rule__SelectOp__Group__1__Impl rule__SelectOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4382:2: rule__SelectOp__Group__1__Impl rule__SelectOp__Group__2
            {
            pushFollow(FOLLOW_rule__SelectOp__Group__1__Impl_in_rule__SelectOp__Group__18941);
            rule__SelectOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectOp__Group__2_in_rule__SelectOp__Group__18944);
            rule__SelectOp__Group__2();

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
    // $ANTLR end "rule__SelectOp__Group__1"


    // $ANTLR start "rule__SelectOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4389:1: rule__SelectOp__Group__1__Impl : ( '(' ) ;
    public final void rule__SelectOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4393:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4394:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4394:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4395:1: '('
            {
             before(grammarAccess.getSelectOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__SelectOp__Group__1__Impl8972); 
             after(grammarAccess.getSelectOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SelectOp__Group__1__Impl"


    // $ANTLR start "rule__SelectOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4408:1: rule__SelectOp__Group__2 : rule__SelectOp__Group__2__Impl rule__SelectOp__Group__3 ;
    public final void rule__SelectOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4412:1: ( rule__SelectOp__Group__2__Impl rule__SelectOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4413:2: rule__SelectOp__Group__2__Impl rule__SelectOp__Group__3
            {
            pushFollow(FOLLOW_rule__SelectOp__Group__2__Impl_in_rule__SelectOp__Group__29003);
            rule__SelectOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectOp__Group__3_in_rule__SelectOp__Group__29006);
            rule__SelectOp__Group__3();

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
    // $ANTLR end "rule__SelectOp__Group__2"


    // $ANTLR start "rule__SelectOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4420:1: rule__SelectOp__Group__2__Impl : ( ( rule__SelectOp__VarAssignment_2 ) ) ;
    public final void rule__SelectOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4424:1: ( ( ( rule__SelectOp__VarAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4425:1: ( ( rule__SelectOp__VarAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4425:1: ( ( rule__SelectOp__VarAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4426:1: ( rule__SelectOp__VarAssignment_2 )
            {
             before(grammarAccess.getSelectOpAccess().getVarAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4427:1: ( rule__SelectOp__VarAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4427:2: rule__SelectOp__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__SelectOp__VarAssignment_2_in_rule__SelectOp__Group__2__Impl9033);
            rule__SelectOp__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectOpAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__SelectOp__Group__2__Impl"


    // $ANTLR start "rule__SelectOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4437:1: rule__SelectOp__Group__3 : rule__SelectOp__Group__3__Impl rule__SelectOp__Group__4 ;
    public final void rule__SelectOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4441:1: ( rule__SelectOp__Group__3__Impl rule__SelectOp__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4442:2: rule__SelectOp__Group__3__Impl rule__SelectOp__Group__4
            {
            pushFollow(FOLLOW_rule__SelectOp__Group__3__Impl_in_rule__SelectOp__Group__39063);
            rule__SelectOp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectOp__Group__4_in_rule__SelectOp__Group__39066);
            rule__SelectOp__Group__4();

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
    // $ANTLR end "rule__SelectOp__Group__3"


    // $ANTLR start "rule__SelectOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4449:1: rule__SelectOp__Group__3__Impl : ( '|' ) ;
    public final void rule__SelectOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4453:1: ( ( '|' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4454:1: ( '|' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4454:1: ( '|' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4455:1: '|'
            {
             before(grammarAccess.getSelectOpAccess().getVerticalLineKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__SelectOp__Group__3__Impl9094); 
             after(grammarAccess.getSelectOpAccess().getVerticalLineKeyword_3()); 

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
    // $ANTLR end "rule__SelectOp__Group__3__Impl"


    // $ANTLR start "rule__SelectOp__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4468:1: rule__SelectOp__Group__4 : rule__SelectOp__Group__4__Impl rule__SelectOp__Group__5 ;
    public final void rule__SelectOp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4472:1: ( rule__SelectOp__Group__4__Impl rule__SelectOp__Group__5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4473:2: rule__SelectOp__Group__4__Impl rule__SelectOp__Group__5
            {
            pushFollow(FOLLOW_rule__SelectOp__Group__4__Impl_in_rule__SelectOp__Group__49125);
            rule__SelectOp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectOp__Group__5_in_rule__SelectOp__Group__49128);
            rule__SelectOp__Group__5();

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
    // $ANTLR end "rule__SelectOp__Group__4"


    // $ANTLR start "rule__SelectOp__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4480:1: rule__SelectOp__Group__4__Impl : ( ( rule__SelectOp__ExpAssignment_4 ) ) ;
    public final void rule__SelectOp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4484:1: ( ( ( rule__SelectOp__ExpAssignment_4 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4485:1: ( ( rule__SelectOp__ExpAssignment_4 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4485:1: ( ( rule__SelectOp__ExpAssignment_4 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4486:1: ( rule__SelectOp__ExpAssignment_4 )
            {
             before(grammarAccess.getSelectOpAccess().getExpAssignment_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4487:1: ( rule__SelectOp__ExpAssignment_4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4487:2: rule__SelectOp__ExpAssignment_4
            {
            pushFollow(FOLLOW_rule__SelectOp__ExpAssignment_4_in_rule__SelectOp__Group__4__Impl9155);
            rule__SelectOp__ExpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSelectOpAccess().getExpAssignment_4()); 

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
    // $ANTLR end "rule__SelectOp__Group__4__Impl"


    // $ANTLR start "rule__SelectOp__Group__5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4497:1: rule__SelectOp__Group__5 : rule__SelectOp__Group__5__Impl ;
    public final void rule__SelectOp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4501:1: ( rule__SelectOp__Group__5__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4502:2: rule__SelectOp__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SelectOp__Group__5__Impl_in_rule__SelectOp__Group__59185);
            rule__SelectOp__Group__5__Impl();

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
    // $ANTLR end "rule__SelectOp__Group__5"


    // $ANTLR start "rule__SelectOp__Group__5__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4508:1: rule__SelectOp__Group__5__Impl : ( ')' ) ;
    public final void rule__SelectOp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4512:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4513:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4513:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4514:1: ')'
            {
             before(grammarAccess.getSelectOpAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__SelectOp__Group__5__Impl9213); 
             after(grammarAccess.getSelectOpAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__SelectOp__Group__5__Impl"


    // $ANTLR start "rule__CollectOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4539:1: rule__CollectOp__Group__0 : rule__CollectOp__Group__0__Impl rule__CollectOp__Group__1 ;
    public final void rule__CollectOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4543:1: ( rule__CollectOp__Group__0__Impl rule__CollectOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4544:2: rule__CollectOp__Group__0__Impl rule__CollectOp__Group__1
            {
            pushFollow(FOLLOW_rule__CollectOp__Group__0__Impl_in_rule__CollectOp__Group__09256);
            rule__CollectOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectOp__Group__1_in_rule__CollectOp__Group__09259);
            rule__CollectOp__Group__1();

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
    // $ANTLR end "rule__CollectOp__Group__0"


    // $ANTLR start "rule__CollectOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4551:1: rule__CollectOp__Group__0__Impl : ( 'collect' ) ;
    public final void rule__CollectOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4555:1: ( ( 'collect' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4556:1: ( 'collect' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4556:1: ( 'collect' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4557:1: 'collect'
            {
             before(grammarAccess.getCollectOpAccess().getCollectKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__CollectOp__Group__0__Impl9287); 
             after(grammarAccess.getCollectOpAccess().getCollectKeyword_0()); 

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
    // $ANTLR end "rule__CollectOp__Group__0__Impl"


    // $ANTLR start "rule__CollectOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4570:1: rule__CollectOp__Group__1 : rule__CollectOp__Group__1__Impl rule__CollectOp__Group__2 ;
    public final void rule__CollectOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4574:1: ( rule__CollectOp__Group__1__Impl rule__CollectOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4575:2: rule__CollectOp__Group__1__Impl rule__CollectOp__Group__2
            {
            pushFollow(FOLLOW_rule__CollectOp__Group__1__Impl_in_rule__CollectOp__Group__19318);
            rule__CollectOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectOp__Group__2_in_rule__CollectOp__Group__19321);
            rule__CollectOp__Group__2();

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
    // $ANTLR end "rule__CollectOp__Group__1"


    // $ANTLR start "rule__CollectOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4582:1: rule__CollectOp__Group__1__Impl : ( '(' ) ;
    public final void rule__CollectOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4586:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4587:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4587:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4588:1: '('
            {
             before(grammarAccess.getCollectOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__CollectOp__Group__1__Impl9349); 
             after(grammarAccess.getCollectOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__CollectOp__Group__1__Impl"


    // $ANTLR start "rule__CollectOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4601:1: rule__CollectOp__Group__2 : rule__CollectOp__Group__2__Impl rule__CollectOp__Group__3 ;
    public final void rule__CollectOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4605:1: ( rule__CollectOp__Group__2__Impl rule__CollectOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4606:2: rule__CollectOp__Group__2__Impl rule__CollectOp__Group__3
            {
            pushFollow(FOLLOW_rule__CollectOp__Group__2__Impl_in_rule__CollectOp__Group__29380);
            rule__CollectOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectOp__Group__3_in_rule__CollectOp__Group__29383);
            rule__CollectOp__Group__3();

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
    // $ANTLR end "rule__CollectOp__Group__2"


    // $ANTLR start "rule__CollectOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4613:1: rule__CollectOp__Group__2__Impl : ( ( rule__CollectOp__VarAssignment_2 ) ) ;
    public final void rule__CollectOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4617:1: ( ( ( rule__CollectOp__VarAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4618:1: ( ( rule__CollectOp__VarAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4618:1: ( ( rule__CollectOp__VarAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4619:1: ( rule__CollectOp__VarAssignment_2 )
            {
             before(grammarAccess.getCollectOpAccess().getVarAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4620:1: ( rule__CollectOp__VarAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4620:2: rule__CollectOp__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__CollectOp__VarAssignment_2_in_rule__CollectOp__Group__2__Impl9410);
            rule__CollectOp__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCollectOpAccess().getVarAssignment_2()); 

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
    // $ANTLR end "rule__CollectOp__Group__2__Impl"


    // $ANTLR start "rule__CollectOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4630:1: rule__CollectOp__Group__3 : rule__CollectOp__Group__3__Impl rule__CollectOp__Group__4 ;
    public final void rule__CollectOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4634:1: ( rule__CollectOp__Group__3__Impl rule__CollectOp__Group__4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4635:2: rule__CollectOp__Group__3__Impl rule__CollectOp__Group__4
            {
            pushFollow(FOLLOW_rule__CollectOp__Group__3__Impl_in_rule__CollectOp__Group__39440);
            rule__CollectOp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectOp__Group__4_in_rule__CollectOp__Group__39443);
            rule__CollectOp__Group__4();

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
    // $ANTLR end "rule__CollectOp__Group__3"


    // $ANTLR start "rule__CollectOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4642:1: rule__CollectOp__Group__3__Impl : ( '|' ) ;
    public final void rule__CollectOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4646:1: ( ( '|' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4647:1: ( '|' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4647:1: ( '|' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4648:1: '|'
            {
             before(grammarAccess.getCollectOpAccess().getVerticalLineKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__CollectOp__Group__3__Impl9471); 
             after(grammarAccess.getCollectOpAccess().getVerticalLineKeyword_3()); 

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
    // $ANTLR end "rule__CollectOp__Group__3__Impl"


    // $ANTLR start "rule__CollectOp__Group__4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4661:1: rule__CollectOp__Group__4 : rule__CollectOp__Group__4__Impl rule__CollectOp__Group__5 ;
    public final void rule__CollectOp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4665:1: ( rule__CollectOp__Group__4__Impl rule__CollectOp__Group__5 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4666:2: rule__CollectOp__Group__4__Impl rule__CollectOp__Group__5
            {
            pushFollow(FOLLOW_rule__CollectOp__Group__4__Impl_in_rule__CollectOp__Group__49502);
            rule__CollectOp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CollectOp__Group__5_in_rule__CollectOp__Group__49505);
            rule__CollectOp__Group__5();

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
    // $ANTLR end "rule__CollectOp__Group__4"


    // $ANTLR start "rule__CollectOp__Group__4__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4673:1: rule__CollectOp__Group__4__Impl : ( ( rule__CollectOp__ExpAssignment_4 ) ) ;
    public final void rule__CollectOp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4677:1: ( ( ( rule__CollectOp__ExpAssignment_4 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4678:1: ( ( rule__CollectOp__ExpAssignment_4 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4678:1: ( ( rule__CollectOp__ExpAssignment_4 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4679:1: ( rule__CollectOp__ExpAssignment_4 )
            {
             before(grammarAccess.getCollectOpAccess().getExpAssignment_4()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4680:1: ( rule__CollectOp__ExpAssignment_4 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4680:2: rule__CollectOp__ExpAssignment_4
            {
            pushFollow(FOLLOW_rule__CollectOp__ExpAssignment_4_in_rule__CollectOp__Group__4__Impl9532);
            rule__CollectOp__ExpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCollectOpAccess().getExpAssignment_4()); 

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
    // $ANTLR end "rule__CollectOp__Group__4__Impl"


    // $ANTLR start "rule__CollectOp__Group__5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4690:1: rule__CollectOp__Group__5 : rule__CollectOp__Group__5__Impl ;
    public final void rule__CollectOp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4694:1: ( rule__CollectOp__Group__5__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4695:2: rule__CollectOp__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CollectOp__Group__5__Impl_in_rule__CollectOp__Group__59562);
            rule__CollectOp__Group__5__Impl();

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
    // $ANTLR end "rule__CollectOp__Group__5"


    // $ANTLR start "rule__CollectOp__Group__5__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4701:1: rule__CollectOp__Group__5__Impl : ( ')' ) ;
    public final void rule__CollectOp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4705:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4706:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4706:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4707:1: ')'
            {
             before(grammarAccess.getCollectOpAccess().getRightParenthesisKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__CollectOp__Group__5__Impl9590); 
             after(grammarAccess.getCollectOpAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__CollectOp__Group__5__Impl"


    // $ANTLR start "rule__IsTypeOfOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4732:1: rule__IsTypeOfOp__Group__0 : rule__IsTypeOfOp__Group__0__Impl rule__IsTypeOfOp__Group__1 ;
    public final void rule__IsTypeOfOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4736:1: ( rule__IsTypeOfOp__Group__0__Impl rule__IsTypeOfOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4737:2: rule__IsTypeOfOp__Group__0__Impl rule__IsTypeOfOp__Group__1
            {
            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__0__Impl_in_rule__IsTypeOfOp__Group__09633);
            rule__IsTypeOfOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__1_in_rule__IsTypeOfOp__Group__09636);
            rule__IsTypeOfOp__Group__1();

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
    // $ANTLR end "rule__IsTypeOfOp__Group__0"


    // $ANTLR start "rule__IsTypeOfOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4744:1: rule__IsTypeOfOp__Group__0__Impl : ( 'isTypeOf' ) ;
    public final void rule__IsTypeOfOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4748:1: ( ( 'isTypeOf' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4749:1: ( 'isTypeOf' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4749:1: ( 'isTypeOf' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4750:1: 'isTypeOf'
            {
             before(grammarAccess.getIsTypeOfOpAccess().getIsTypeOfKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__IsTypeOfOp__Group__0__Impl9664); 
             after(grammarAccess.getIsTypeOfOpAccess().getIsTypeOfKeyword_0()); 

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
    // $ANTLR end "rule__IsTypeOfOp__Group__0__Impl"


    // $ANTLR start "rule__IsTypeOfOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4763:1: rule__IsTypeOfOp__Group__1 : rule__IsTypeOfOp__Group__1__Impl rule__IsTypeOfOp__Group__2 ;
    public final void rule__IsTypeOfOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4767:1: ( rule__IsTypeOfOp__Group__1__Impl rule__IsTypeOfOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4768:2: rule__IsTypeOfOp__Group__1__Impl rule__IsTypeOfOp__Group__2
            {
            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__1__Impl_in_rule__IsTypeOfOp__Group__19695);
            rule__IsTypeOfOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__2_in_rule__IsTypeOfOp__Group__19698);
            rule__IsTypeOfOp__Group__2();

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
    // $ANTLR end "rule__IsTypeOfOp__Group__1"


    // $ANTLR start "rule__IsTypeOfOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4775:1: rule__IsTypeOfOp__Group__1__Impl : ( '(' ) ;
    public final void rule__IsTypeOfOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4779:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4780:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4780:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4781:1: '('
            {
             before(grammarAccess.getIsTypeOfOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IsTypeOfOp__Group__1__Impl9726); 
             after(grammarAccess.getIsTypeOfOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IsTypeOfOp__Group__1__Impl"


    // $ANTLR start "rule__IsTypeOfOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4794:1: rule__IsTypeOfOp__Group__2 : rule__IsTypeOfOp__Group__2__Impl rule__IsTypeOfOp__Group__3 ;
    public final void rule__IsTypeOfOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4798:1: ( rule__IsTypeOfOp__Group__2__Impl rule__IsTypeOfOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4799:2: rule__IsTypeOfOp__Group__2__Impl rule__IsTypeOfOp__Group__3
            {
            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__2__Impl_in_rule__IsTypeOfOp__Group__29757);
            rule__IsTypeOfOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__3_in_rule__IsTypeOfOp__Group__29760);
            rule__IsTypeOfOp__Group__3();

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
    // $ANTLR end "rule__IsTypeOfOp__Group__2"


    // $ANTLR start "rule__IsTypeOfOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4806:1: rule__IsTypeOfOp__Group__2__Impl : ( ( rule__IsTypeOfOp__ClassNameAssignment_2 ) ) ;
    public final void rule__IsTypeOfOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4810:1: ( ( ( rule__IsTypeOfOp__ClassNameAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4811:1: ( ( rule__IsTypeOfOp__ClassNameAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4811:1: ( ( rule__IsTypeOfOp__ClassNameAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4812:1: ( rule__IsTypeOfOp__ClassNameAssignment_2 )
            {
             before(grammarAccess.getIsTypeOfOpAccess().getClassNameAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4813:1: ( rule__IsTypeOfOp__ClassNameAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4813:2: rule__IsTypeOfOp__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__IsTypeOfOp__ClassNameAssignment_2_in_rule__IsTypeOfOp__Group__2__Impl9787);
            rule__IsTypeOfOp__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIsTypeOfOpAccess().getClassNameAssignment_2()); 

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
    // $ANTLR end "rule__IsTypeOfOp__Group__2__Impl"


    // $ANTLR start "rule__IsTypeOfOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4823:1: rule__IsTypeOfOp__Group__3 : rule__IsTypeOfOp__Group__3__Impl ;
    public final void rule__IsTypeOfOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4827:1: ( rule__IsTypeOfOp__Group__3__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4828:2: rule__IsTypeOfOp__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IsTypeOfOp__Group__3__Impl_in_rule__IsTypeOfOp__Group__39817);
            rule__IsTypeOfOp__Group__3__Impl();

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
    // $ANTLR end "rule__IsTypeOfOp__Group__3"


    // $ANTLR start "rule__IsTypeOfOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4834:1: rule__IsTypeOfOp__Group__3__Impl : ( ')' ) ;
    public final void rule__IsTypeOfOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4838:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4839:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4839:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4840:1: ')'
            {
             before(grammarAccess.getIsTypeOfOpAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__IsTypeOfOp__Group__3__Impl9845); 
             after(grammarAccess.getIsTypeOfOpAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IsTypeOfOp__Group__3__Impl"


    // $ANTLR start "rule__ToStringOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4861:1: rule__ToStringOp__Group__0 : rule__ToStringOp__Group__0__Impl rule__ToStringOp__Group__1 ;
    public final void rule__ToStringOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4865:1: ( rule__ToStringOp__Group__0__Impl rule__ToStringOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4866:2: rule__ToStringOp__Group__0__Impl rule__ToStringOp__Group__1
            {
            pushFollow(FOLLOW_rule__ToStringOp__Group__0__Impl_in_rule__ToStringOp__Group__09884);
            rule__ToStringOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ToStringOp__Group__1_in_rule__ToStringOp__Group__09887);
            rule__ToStringOp__Group__1();

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
    // $ANTLR end "rule__ToStringOp__Group__0"


    // $ANTLR start "rule__ToStringOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4873:1: rule__ToStringOp__Group__0__Impl : ( 'toString' ) ;
    public final void rule__ToStringOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4877:1: ( ( 'toString' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4878:1: ( 'toString' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4878:1: ( 'toString' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4879:1: 'toString'
            {
             before(grammarAccess.getToStringOpAccess().getToStringKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__ToStringOp__Group__0__Impl9915); 
             after(grammarAccess.getToStringOpAccess().getToStringKeyword_0()); 

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
    // $ANTLR end "rule__ToStringOp__Group__0__Impl"


    // $ANTLR start "rule__ToStringOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4892:1: rule__ToStringOp__Group__1 : rule__ToStringOp__Group__1__Impl ;
    public final void rule__ToStringOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4896:1: ( rule__ToStringOp__Group__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4897:2: rule__ToStringOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ToStringOp__Group__1__Impl_in_rule__ToStringOp__Group__19946);
            rule__ToStringOp__Group__1__Impl();

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
    // $ANTLR end "rule__ToStringOp__Group__1"


    // $ANTLR start "rule__ToStringOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4903:1: rule__ToStringOp__Group__1__Impl : ( '()' ) ;
    public final void rule__ToStringOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4907:1: ( ( '()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4908:1: ( '()' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4908:1: ( '()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4909:1: '()'
            {
             before(grammarAccess.getToStringOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__ToStringOp__Group__1__Impl9974); 
             after(grammarAccess.getToStringOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ToStringOp__Group__1__Impl"


    // $ANTLR start "rule__ConcatOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4926:1: rule__ConcatOp__Group__0 : rule__ConcatOp__Group__0__Impl rule__ConcatOp__Group__1 ;
    public final void rule__ConcatOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4930:1: ( rule__ConcatOp__Group__0__Impl rule__ConcatOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4931:2: rule__ConcatOp__Group__0__Impl rule__ConcatOp__Group__1
            {
            pushFollow(FOLLOW_rule__ConcatOp__Group__0__Impl_in_rule__ConcatOp__Group__010009);
            rule__ConcatOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatOp__Group__1_in_rule__ConcatOp__Group__010012);
            rule__ConcatOp__Group__1();

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
    // $ANTLR end "rule__ConcatOp__Group__0"


    // $ANTLR start "rule__ConcatOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4938:1: rule__ConcatOp__Group__0__Impl : ( 'concatenate' ) ;
    public final void rule__ConcatOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4942:1: ( ( 'concatenate' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4943:1: ( 'concatenate' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4943:1: ( 'concatenate' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4944:1: 'concatenate'
            {
             before(grammarAccess.getConcatOpAccess().getConcatenateKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__ConcatOp__Group__0__Impl10040); 
             after(grammarAccess.getConcatOpAccess().getConcatenateKeyword_0()); 

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
    // $ANTLR end "rule__ConcatOp__Group__0__Impl"


    // $ANTLR start "rule__ConcatOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4957:1: rule__ConcatOp__Group__1 : rule__ConcatOp__Group__1__Impl rule__ConcatOp__Group__2 ;
    public final void rule__ConcatOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4961:1: ( rule__ConcatOp__Group__1__Impl rule__ConcatOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4962:2: rule__ConcatOp__Group__1__Impl rule__ConcatOp__Group__2
            {
            pushFollow(FOLLOW_rule__ConcatOp__Group__1__Impl_in_rule__ConcatOp__Group__110071);
            rule__ConcatOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatOp__Group__2_in_rule__ConcatOp__Group__110074);
            rule__ConcatOp__Group__2();

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
    // $ANTLR end "rule__ConcatOp__Group__1"


    // $ANTLR start "rule__ConcatOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4969:1: rule__ConcatOp__Group__1__Impl : ( '(' ) ;
    public final void rule__ConcatOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4973:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4974:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4974:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4975:1: '('
            {
             before(grammarAccess.getConcatOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__ConcatOp__Group__1__Impl10102); 
             after(grammarAccess.getConcatOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ConcatOp__Group__1__Impl"


    // $ANTLR start "rule__ConcatOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4988:1: rule__ConcatOp__Group__2 : rule__ConcatOp__Group__2__Impl rule__ConcatOp__Group__3 ;
    public final void rule__ConcatOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4992:1: ( rule__ConcatOp__Group__2__Impl rule__ConcatOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:4993:2: rule__ConcatOp__Group__2__Impl rule__ConcatOp__Group__3
            {
            pushFollow(FOLLOW_rule__ConcatOp__Group__2__Impl_in_rule__ConcatOp__Group__210133);
            rule__ConcatOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConcatOp__Group__3_in_rule__ConcatOp__Group__210136);
            rule__ConcatOp__Group__3();

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
    // $ANTLR end "rule__ConcatOp__Group__2"


    // $ANTLR start "rule__ConcatOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5000:1: rule__ConcatOp__Group__2__Impl : ( ( rule__ConcatOp__SAssignment_2 ) ) ;
    public final void rule__ConcatOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5004:1: ( ( ( rule__ConcatOp__SAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5005:1: ( ( rule__ConcatOp__SAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5005:1: ( ( rule__ConcatOp__SAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5006:1: ( rule__ConcatOp__SAssignment_2 )
            {
             before(grammarAccess.getConcatOpAccess().getSAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5007:1: ( rule__ConcatOp__SAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5007:2: rule__ConcatOp__SAssignment_2
            {
            pushFollow(FOLLOW_rule__ConcatOp__SAssignment_2_in_rule__ConcatOp__Group__2__Impl10163);
            rule__ConcatOp__SAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConcatOpAccess().getSAssignment_2()); 

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
    // $ANTLR end "rule__ConcatOp__Group__2__Impl"


    // $ANTLR start "rule__ConcatOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5017:1: rule__ConcatOp__Group__3 : rule__ConcatOp__Group__3__Impl ;
    public final void rule__ConcatOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5021:1: ( rule__ConcatOp__Group__3__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5022:2: rule__ConcatOp__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ConcatOp__Group__3__Impl_in_rule__ConcatOp__Group__310193);
            rule__ConcatOp__Group__3__Impl();

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
    // $ANTLR end "rule__ConcatOp__Group__3"


    // $ANTLR start "rule__ConcatOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5028:1: rule__ConcatOp__Group__3__Impl : ( ')' ) ;
    public final void rule__ConcatOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5032:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5033:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5033:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5034:1: ')'
            {
             before(grammarAccess.getConcatOpAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__ConcatOp__Group__3__Impl10221); 
             after(grammarAccess.getConcatOpAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ConcatOp__Group__3__Impl"


    // $ANTLR start "rule__UnionOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5055:1: rule__UnionOp__Group__0 : rule__UnionOp__Group__0__Impl rule__UnionOp__Group__1 ;
    public final void rule__UnionOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5059:1: ( rule__UnionOp__Group__0__Impl rule__UnionOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5060:2: rule__UnionOp__Group__0__Impl rule__UnionOp__Group__1
            {
            pushFollow(FOLLOW_rule__UnionOp__Group__0__Impl_in_rule__UnionOp__Group__010260);
            rule__UnionOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionOp__Group__1_in_rule__UnionOp__Group__010263);
            rule__UnionOp__Group__1();

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
    // $ANTLR end "rule__UnionOp__Group__0"


    // $ANTLR start "rule__UnionOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5067:1: rule__UnionOp__Group__0__Impl : ( 'union' ) ;
    public final void rule__UnionOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5071:1: ( ( 'union' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5072:1: ( 'union' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5072:1: ( 'union' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5073:1: 'union'
            {
             before(grammarAccess.getUnionOpAccess().getUnionKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__UnionOp__Group__0__Impl10291); 
             after(grammarAccess.getUnionOpAccess().getUnionKeyword_0()); 

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
    // $ANTLR end "rule__UnionOp__Group__0__Impl"


    // $ANTLR start "rule__UnionOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5086:1: rule__UnionOp__Group__1 : rule__UnionOp__Group__1__Impl rule__UnionOp__Group__2 ;
    public final void rule__UnionOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5090:1: ( rule__UnionOp__Group__1__Impl rule__UnionOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5091:2: rule__UnionOp__Group__1__Impl rule__UnionOp__Group__2
            {
            pushFollow(FOLLOW_rule__UnionOp__Group__1__Impl_in_rule__UnionOp__Group__110322);
            rule__UnionOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionOp__Group__2_in_rule__UnionOp__Group__110325);
            rule__UnionOp__Group__2();

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
    // $ANTLR end "rule__UnionOp__Group__1"


    // $ANTLR start "rule__UnionOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5098:1: rule__UnionOp__Group__1__Impl : ( '(' ) ;
    public final void rule__UnionOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5102:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5103:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5103:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5104:1: '('
            {
             before(grammarAccess.getUnionOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__UnionOp__Group__1__Impl10353); 
             after(grammarAccess.getUnionOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__UnionOp__Group__1__Impl"


    // $ANTLR start "rule__UnionOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5117:1: rule__UnionOp__Group__2 : rule__UnionOp__Group__2__Impl rule__UnionOp__Group__3 ;
    public final void rule__UnionOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5121:1: ( rule__UnionOp__Group__2__Impl rule__UnionOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5122:2: rule__UnionOp__Group__2__Impl rule__UnionOp__Group__3
            {
            pushFollow(FOLLOW_rule__UnionOp__Group__2__Impl_in_rule__UnionOp__Group__210384);
            rule__UnionOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnionOp__Group__3_in_rule__UnionOp__Group__210387);
            rule__UnionOp__Group__3();

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
    // $ANTLR end "rule__UnionOp__Group__2"


    // $ANTLR start "rule__UnionOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5129:1: rule__UnionOp__Group__2__Impl : ( ( rule__UnionOp__ExpAssignment_2 ) ) ;
    public final void rule__UnionOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5133:1: ( ( ( rule__UnionOp__ExpAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5134:1: ( ( rule__UnionOp__ExpAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5134:1: ( ( rule__UnionOp__ExpAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5135:1: ( rule__UnionOp__ExpAssignment_2 )
            {
             before(grammarAccess.getUnionOpAccess().getExpAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5136:1: ( rule__UnionOp__ExpAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5136:2: rule__UnionOp__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__UnionOp__ExpAssignment_2_in_rule__UnionOp__Group__2__Impl10414);
            rule__UnionOp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnionOpAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__UnionOp__Group__2__Impl"


    // $ANTLR start "rule__UnionOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5146:1: rule__UnionOp__Group__3 : rule__UnionOp__Group__3__Impl ;
    public final void rule__UnionOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5150:1: ( rule__UnionOp__Group__3__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5151:2: rule__UnionOp__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnionOp__Group__3__Impl_in_rule__UnionOp__Group__310444);
            rule__UnionOp__Group__3__Impl();

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
    // $ANTLR end "rule__UnionOp__Group__3"


    // $ANTLR start "rule__UnionOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5157:1: rule__UnionOp__Group__3__Impl : ( ')' ) ;
    public final void rule__UnionOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5161:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5162:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5162:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5163:1: ')'
            {
             before(grammarAccess.getUnionOpAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__UnionOp__Group__3__Impl10472); 
             after(grammarAccess.getUnionOpAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__UnionOp__Group__3__Impl"


    // $ANTLR start "rule__IntersectionOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5184:1: rule__IntersectionOp__Group__0 : rule__IntersectionOp__Group__0__Impl rule__IntersectionOp__Group__1 ;
    public final void rule__IntersectionOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5188:1: ( rule__IntersectionOp__Group__0__Impl rule__IntersectionOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5189:2: rule__IntersectionOp__Group__0__Impl rule__IntersectionOp__Group__1
            {
            pushFollow(FOLLOW_rule__IntersectionOp__Group__0__Impl_in_rule__IntersectionOp__Group__010511);
            rule__IntersectionOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntersectionOp__Group__1_in_rule__IntersectionOp__Group__010514);
            rule__IntersectionOp__Group__1();

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
    // $ANTLR end "rule__IntersectionOp__Group__0"


    // $ANTLR start "rule__IntersectionOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5196:1: rule__IntersectionOp__Group__0__Impl : ( 'intersection' ) ;
    public final void rule__IntersectionOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5200:1: ( ( 'intersection' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5201:1: ( 'intersection' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5201:1: ( 'intersection' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5202:1: 'intersection'
            {
             before(grammarAccess.getIntersectionOpAccess().getIntersectionKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__IntersectionOp__Group__0__Impl10542); 
             after(grammarAccess.getIntersectionOpAccess().getIntersectionKeyword_0()); 

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
    // $ANTLR end "rule__IntersectionOp__Group__0__Impl"


    // $ANTLR start "rule__IntersectionOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5215:1: rule__IntersectionOp__Group__1 : rule__IntersectionOp__Group__1__Impl rule__IntersectionOp__Group__2 ;
    public final void rule__IntersectionOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5219:1: ( rule__IntersectionOp__Group__1__Impl rule__IntersectionOp__Group__2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5220:2: rule__IntersectionOp__Group__1__Impl rule__IntersectionOp__Group__2
            {
            pushFollow(FOLLOW_rule__IntersectionOp__Group__1__Impl_in_rule__IntersectionOp__Group__110573);
            rule__IntersectionOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntersectionOp__Group__2_in_rule__IntersectionOp__Group__110576);
            rule__IntersectionOp__Group__2();

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
    // $ANTLR end "rule__IntersectionOp__Group__1"


    // $ANTLR start "rule__IntersectionOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5227:1: rule__IntersectionOp__Group__1__Impl : ( '(' ) ;
    public final void rule__IntersectionOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5231:1: ( ( '(' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5232:1: ( '(' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5232:1: ( '(' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5233:1: '('
            {
             before(grammarAccess.getIntersectionOpAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IntersectionOp__Group__1__Impl10604); 
             after(grammarAccess.getIntersectionOpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IntersectionOp__Group__1__Impl"


    // $ANTLR start "rule__IntersectionOp__Group__2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5246:1: rule__IntersectionOp__Group__2 : rule__IntersectionOp__Group__2__Impl rule__IntersectionOp__Group__3 ;
    public final void rule__IntersectionOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5250:1: ( rule__IntersectionOp__Group__2__Impl rule__IntersectionOp__Group__3 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5251:2: rule__IntersectionOp__Group__2__Impl rule__IntersectionOp__Group__3
            {
            pushFollow(FOLLOW_rule__IntersectionOp__Group__2__Impl_in_rule__IntersectionOp__Group__210635);
            rule__IntersectionOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntersectionOp__Group__3_in_rule__IntersectionOp__Group__210638);
            rule__IntersectionOp__Group__3();

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
    // $ANTLR end "rule__IntersectionOp__Group__2"


    // $ANTLR start "rule__IntersectionOp__Group__2__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5258:1: rule__IntersectionOp__Group__2__Impl : ( ( rule__IntersectionOp__ExpAssignment_2 ) ) ;
    public final void rule__IntersectionOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5262:1: ( ( ( rule__IntersectionOp__ExpAssignment_2 ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5263:1: ( ( rule__IntersectionOp__ExpAssignment_2 ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5263:1: ( ( rule__IntersectionOp__ExpAssignment_2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5264:1: ( rule__IntersectionOp__ExpAssignment_2 )
            {
             before(grammarAccess.getIntersectionOpAccess().getExpAssignment_2()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5265:1: ( rule__IntersectionOp__ExpAssignment_2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5265:2: rule__IntersectionOp__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__IntersectionOp__ExpAssignment_2_in_rule__IntersectionOp__Group__2__Impl10665);
            rule__IntersectionOp__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntersectionOpAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__IntersectionOp__Group__2__Impl"


    // $ANTLR start "rule__IntersectionOp__Group__3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5275:1: rule__IntersectionOp__Group__3 : rule__IntersectionOp__Group__3__Impl ;
    public final void rule__IntersectionOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5279:1: ( rule__IntersectionOp__Group__3__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5280:2: rule__IntersectionOp__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IntersectionOp__Group__3__Impl_in_rule__IntersectionOp__Group__310695);
            rule__IntersectionOp__Group__3__Impl();

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
    // $ANTLR end "rule__IntersectionOp__Group__3"


    // $ANTLR start "rule__IntersectionOp__Group__3__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5286:1: rule__IntersectionOp__Group__3__Impl : ( ')' ) ;
    public final void rule__IntersectionOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5290:1: ( ( ')' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5291:1: ( ')' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5291:1: ( ')' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5292:1: ')'
            {
             before(grammarAccess.getIntersectionOpAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__IntersectionOp__Group__3__Impl10723); 
             after(grammarAccess.getIntersectionOpAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IntersectionOp__Group__3__Impl"


    // $ANTLR start "rule__IsUndefinedOp__Group__0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5313:1: rule__IsUndefinedOp__Group__0 : rule__IsUndefinedOp__Group__0__Impl rule__IsUndefinedOp__Group__1 ;
    public final void rule__IsUndefinedOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5317:1: ( rule__IsUndefinedOp__Group__0__Impl rule__IsUndefinedOp__Group__1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5318:2: rule__IsUndefinedOp__Group__0__Impl rule__IsUndefinedOp__Group__1
            {
            pushFollow(FOLLOW_rule__IsUndefinedOp__Group__0__Impl_in_rule__IsUndefinedOp__Group__010762);
            rule__IsUndefinedOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IsUndefinedOp__Group__1_in_rule__IsUndefinedOp__Group__010765);
            rule__IsUndefinedOp__Group__1();

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
    // $ANTLR end "rule__IsUndefinedOp__Group__0"


    // $ANTLR start "rule__IsUndefinedOp__Group__0__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5325:1: rule__IsUndefinedOp__Group__0__Impl : ( 'isUndefined' ) ;
    public final void rule__IsUndefinedOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5329:1: ( ( 'isUndefined' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5330:1: ( 'isUndefined' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5330:1: ( 'isUndefined' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5331:1: 'isUndefined'
            {
             before(grammarAccess.getIsUndefinedOpAccess().getIsUndefinedKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__IsUndefinedOp__Group__0__Impl10793); 
             after(grammarAccess.getIsUndefinedOpAccess().getIsUndefinedKeyword_0()); 

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
    // $ANTLR end "rule__IsUndefinedOp__Group__0__Impl"


    // $ANTLR start "rule__IsUndefinedOp__Group__1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5344:1: rule__IsUndefinedOp__Group__1 : rule__IsUndefinedOp__Group__1__Impl ;
    public final void rule__IsUndefinedOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5348:1: ( rule__IsUndefinedOp__Group__1__Impl )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5349:2: rule__IsUndefinedOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IsUndefinedOp__Group__1__Impl_in_rule__IsUndefinedOp__Group__110824);
            rule__IsUndefinedOp__Group__1__Impl();

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
    // $ANTLR end "rule__IsUndefinedOp__Group__1"


    // $ANTLR start "rule__IsUndefinedOp__Group__1__Impl"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5355:1: rule__IsUndefinedOp__Group__1__Impl : ( '()' ) ;
    public final void rule__IsUndefinedOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5359:1: ( ( '()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5360:1: ( '()' )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5360:1: ( '()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5361:1: '()'
            {
             before(grammarAccess.getIsUndefinedOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__IsUndefinedOp__Group__1__Impl10852); 
             after(grammarAccess.getIsUndefinedOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IsUndefinedOp__Group__1__Impl"


    // $ANTLR start "rule__Model__RulesAssignment"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5379:1: rule__Model__RulesAssignment : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5383:1: ( ( ruleRule ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5384:1: ( ruleRule )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5384:1: ( ruleRule )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5385:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__RulesAssignment10892);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__RulesAssignment"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5394:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5398:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5399:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5399:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5400:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_110923); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__InPatternsAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5409:1: rule__Rule__InPatternsAssignment_4 : ( ruleInPattern ) ;
    public final void rule__Rule__InPatternsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5413:1: ( ( ruleInPattern ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5414:1: ( ruleInPattern )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5414:1: ( ruleInPattern )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5415:1: ruleInPattern
            {
             before(grammarAccess.getRuleAccess().getInPatternsInPatternParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInPattern_in_rule__Rule__InPatternsAssignment_410954);
            ruleInPattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getInPatternsInPatternParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__InPatternsAssignment_4"


    // $ANTLR start "rule__Rule__FilterAssignment_5_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5424:1: rule__Rule__FilterAssignment_5_1 : ( ruleFilter ) ;
    public final void rule__Rule__FilterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5428:1: ( ( ruleFilter ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5429:1: ( ruleFilter )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5429:1: ( ruleFilter )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5430:1: ruleFilter
            {
             before(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFilter_in_rule__Rule__FilterAssignment_5_110985);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Rule__FilterAssignment_5_1"


    // $ANTLR start "rule__Rule__OutPatternsAssignment_7"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5439:1: rule__Rule__OutPatternsAssignment_7 : ( ruleOutPattern ) ;
    public final void rule__Rule__OutPatternsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5443:1: ( ( ruleOutPattern ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5444:1: ( ruleOutPattern )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5444:1: ( ruleOutPattern )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5445:1: ruleOutPattern
            {
             before(grammarAccess.getRuleAccess().getOutPatternsOutPatternParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleOutPattern_in_rule__Rule__OutPatternsAssignment_711016);
            ruleOutPattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOutPatternsOutPatternParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Rule__OutPatternsAssignment_7"


    // $ANTLR start "rule__InPattern__InElemAssignment_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5454:1: rule__InPattern__InElemAssignment_0 : ( RULE_ID ) ;
    public final void rule__InPattern__InElemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5458:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5459:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5459:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5460:1: RULE_ID
            {
             before(grammarAccess.getInPatternAccess().getInElemIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InPattern__InElemAssignment_011047); 
             after(grammarAccess.getInPatternAccess().getInElemIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__InPattern__InElemAssignment_0"


    // $ANTLR start "rule__InPattern__ClassNameAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5469:1: rule__InPattern__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InPattern__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5473:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5474:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5474:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5475:1: RULE_ID
            {
             before(grammarAccess.getInPatternAccess().getClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InPattern__ClassNameAssignment_211078); 
             after(grammarAccess.getInPatternAccess().getClassNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__InPattern__ClassNameAssignment_2"


    // $ANTLR start "rule__Filter__ExprAssignment"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5484:1: rule__Filter__ExprAssignment : ( ruleComplexExpression ) ;
    public final void rule__Filter__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5488:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5489:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5489:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5490:1: ruleComplexExpression
            {
             before(grammarAccess.getFilterAccess().getExprComplexExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__Filter__ExprAssignment11109);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getExprComplexExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Filter__ExprAssignment"


    // $ANTLR start "rule__OutPattern__VarNameAssignment_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5499:1: rule__OutPattern__VarNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OutPattern__VarNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5503:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5504:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5504:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5505:1: RULE_ID
            {
             before(grammarAccess.getOutPatternAccess().getVarNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OutPattern__VarNameAssignment_011140); 
             after(grammarAccess.getOutPatternAccess().getVarNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__OutPattern__VarNameAssignment_0"


    // $ANTLR start "rule__OutPattern__ClassNameAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5514:1: rule__OutPattern__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OutPattern__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5518:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5519:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5519:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5520:1: RULE_ID
            {
             before(grammarAccess.getOutPatternAccess().getClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OutPattern__ClassNameAssignment_211171); 
             after(grammarAccess.getOutPatternAccess().getClassNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__OutPattern__ClassNameAssignment_2"


    // $ANTLR start "rule__OutPattern__AssgAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5529:1: rule__OutPattern__AssgAssignment_4 : ( ruleAssignation ) ;
    public final void rule__OutPattern__AssgAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5533:1: ( ( ruleAssignation ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5534:1: ( ruleAssignation )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5534:1: ( ruleAssignation )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5535:1: ruleAssignation
            {
             before(grammarAccess.getOutPatternAccess().getAssgAssignationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAssignation_in_rule__OutPattern__AssgAssignment_411202);
            ruleAssignation();

            state._fsp--;

             after(grammarAccess.getOutPatternAccess().getAssgAssignationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__OutPattern__AssgAssignment_4"


    // $ANTLR start "rule__Assignation__AttributeAssignment_0_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5544:1: rule__Assignation__AttributeAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Assignation__AttributeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5548:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5549:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5549:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5550:1: RULE_ID
            {
             before(grammarAccess.getAssignationAccess().getAttributeIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignation__AttributeAssignment_0_011233); 
             after(grammarAccess.getAssignationAccess().getAttributeIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Assignation__AttributeAssignment_0_0"


    // $ANTLR start "rule__Assignation__ExprAssignment_0_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5559:1: rule__Assignation__ExprAssignment_0_2 : ( ruleComplexExpression ) ;
    public final void rule__Assignation__ExprAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5563:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5564:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5564:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5565:1: ruleComplexExpression
            {
             before(grammarAccess.getAssignationAccess().getExprComplexExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__Assignation__ExprAssignment_0_211264);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getAssignationAccess().getExprComplexExpressionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Assignation__ExprAssignment_0_2"


    // $ANTLR start "rule__Assignation__RelationshipAssignment_1_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5574:1: rule__Assignation__RelationshipAssignment_1_0 : ( ruleAssocRoleName ) ;
    public final void rule__Assignation__RelationshipAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5578:1: ( ( ruleAssocRoleName ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5579:1: ( ruleAssocRoleName )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5579:1: ( ruleAssocRoleName )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5580:1: ruleAssocRoleName
            {
             before(grammarAccess.getAssignationAccess().getRelationshipAssocRoleNameParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleAssocRoleName_in_rule__Assignation__RelationshipAssignment_1_011295);
            ruleAssocRoleName();

            state._fsp--;

             after(grammarAccess.getAssignationAccess().getRelationshipAssocRoleNameParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Assignation__RelationshipAssignment_1_0"


    // $ANTLR start "rule__Assignation__ExprAssignment_1_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5589:1: rule__Assignation__ExprAssignment_1_2 : ( ruleComplexExpression ) ;
    public final void rule__Assignation__ExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5593:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5594:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5594:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5595:1: ruleComplexExpression
            {
             before(grammarAccess.getAssignationAccess().getExprComplexExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__Assignation__ExprAssignment_1_211326);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getAssignationAccess().getExprComplexExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Assignation__ExprAssignment_1_2"


    // $ANTLR start "rule__SimpleExpression___stringAssignment_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5604:1: rule__SimpleExpression___stringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SimpleExpression___stringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5608:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5609:1: ( RULE_STRING )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5609:1: ( RULE_STRING )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5610:1: RULE_STRING
            {
             before(grammarAccess.getSimpleExpressionAccess().get_stringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleExpression___stringAssignment_011357); 
             after(grammarAccess.getSimpleExpressionAccess().get_stringSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SimpleExpression___stringAssignment_0"


    // $ANTLR start "rule__SimpleExpression___integerAssignment_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5619:1: rule__SimpleExpression___integerAssignment_1 : ( RULE_INT ) ;
    public final void rule__SimpleExpression___integerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5623:1: ( ( RULE_INT ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5624:1: ( RULE_INT )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5624:1: ( RULE_INT )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5625:1: RULE_INT
            {
             before(grammarAccess.getSimpleExpressionAccess().get_integerINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SimpleExpression___integerAssignment_111388); 
             after(grammarAccess.getSimpleExpressionAccess().get_integerINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimpleExpression___integerAssignment_1"


    // $ANTLR start "rule__SimpleExpression___doubleAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5634:1: rule__SimpleExpression___doubleAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__SimpleExpression___doubleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5638:1: ( ( RULE_DOUBLE ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5639:1: ( RULE_DOUBLE )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5639:1: ( RULE_DOUBLE )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5640:1: RULE_DOUBLE
            {
             before(grammarAccess.getSimpleExpressionAccess().get_doubleDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__SimpleExpression___doubleAssignment_211419); 
             after(grammarAccess.getSimpleExpressionAccess().get_doubleDOUBLETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleExpression___doubleAssignment_2"


    // $ANTLR start "rule__SimpleExpression___booleanAssignment_3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5649:1: rule__SimpleExpression___booleanAssignment_3 : ( RULE_BOOLEAN ) ;
    public final void rule__SimpleExpression___booleanAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5653:1: ( ( RULE_BOOLEAN ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5654:1: ( RULE_BOOLEAN )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5654:1: ( RULE_BOOLEAN )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5655:1: RULE_BOOLEAN
            {
             before(grammarAccess.getSimpleExpressionAccess().get_booleanBOOLEANTerminalRuleCall_3_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__SimpleExpression___booleanAssignment_311450); 
             after(grammarAccess.getSimpleExpressionAccess().get_booleanBOOLEANTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SimpleExpression___booleanAssignment_3"


    // $ANTLR start "rule__SimpleExpression__IsNullAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5664:1: rule__SimpleExpression__IsNullAssignment_4 : ( ( 'null' ) ) ;
    public final void rule__SimpleExpression__IsNullAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5668:1: ( ( ( 'null' ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5669:1: ( ( 'null' ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5669:1: ( ( 'null' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5670:1: ( 'null' )
            {
             before(grammarAccess.getSimpleExpressionAccess().getIsNullNullKeyword_4_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5671:1: ( 'null' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5672:1: 'null'
            {
             before(grammarAccess.getSimpleExpressionAccess().getIsNullNullKeyword_4_0()); 
            match(input,62,FOLLOW_62_in_rule__SimpleExpression__IsNullAssignment_411486); 
             after(grammarAccess.getSimpleExpressionAccess().getIsNullNullKeyword_4_0()); 

            }

             after(grammarAccess.getSimpleExpressionAccess().getIsNullNullKeyword_4_0()); 

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
    // $ANTLR end "rule__SimpleExpression__IsNullAssignment_4"


    // $ANTLR start "rule__SimpleExpression__NavigationAssignment_5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5687:1: rule__SimpleExpression__NavigationAssignment_5 : ( ruleNavig ) ;
    public final void rule__SimpleExpression__NavigationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5691:1: ( ( ruleNavig ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5692:1: ( ruleNavig )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5692:1: ( ruleNavig )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5693:1: ruleNavig
            {
             before(grammarAccess.getSimpleExpressionAccess().getNavigationNavigParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNavig_in_rule__SimpleExpression__NavigationAssignment_511525);
            ruleNavig();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getNavigationNavigParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SimpleExpression__NavigationAssignment_5"


    // $ANTLR start "rule__SimpleExpression__IfSentenceAssignment_6"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5702:1: rule__SimpleExpression__IfSentenceAssignment_6 : ( ruleIfSentence ) ;
    public final void rule__SimpleExpression__IfSentenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5706:1: ( ( ruleIfSentence ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5707:1: ( ruleIfSentence )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5707:1: ( ruleIfSentence )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5708:1: ruleIfSentence
            {
             before(grammarAccess.getSimpleExpressionAccess().getIfSentenceIfSentenceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIfSentence_in_rule__SimpleExpression__IfSentenceAssignment_611556);
            ruleIfSentence();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getIfSentenceIfSentenceParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SimpleExpression__IfSentenceAssignment_6"


    // $ANTLR start "rule__SimpleExpression__ColectionTypeAssignment_7_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5717:1: rule__SimpleExpression__ColectionTypeAssignment_7_0 : ( ruleCollectionType ) ;
    public final void rule__SimpleExpression__ColectionTypeAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5721:1: ( ( ruleCollectionType ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5722:1: ( ruleCollectionType )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5722:1: ( ruleCollectionType )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5723:1: ruleCollectionType
            {
             before(grammarAccess.getSimpleExpressionAccess().getColectionTypeCollectionTypeParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleCollectionType_in_rule__SimpleExpression__ColectionTypeAssignment_7_011587);
            ruleCollectionType();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getColectionTypeCollectionTypeParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__SimpleExpression__ColectionTypeAssignment_7_0"


    // $ANTLR start "rule__SimpleExpression__ElemsAssignment_7_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5732:1: rule__SimpleExpression__ElemsAssignment_7_2 : ( ruleComplexExpression ) ;
    public final void rule__SimpleExpression__ElemsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5736:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5737:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5737:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5738:1: ruleComplexExpression
            {
             before(grammarAccess.getSimpleExpressionAccess().getElemsComplexExpressionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__SimpleExpression__ElemsAssignment_7_211618);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getElemsComplexExpressionParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__SimpleExpression__ElemsAssignment_7_2"


    // $ANTLR start "rule__SimpleExpression__NavAssignment_7_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5747:1: rule__SimpleExpression__NavAssignment_7_4 : ( ruleNavigation ) ;
    public final void rule__SimpleExpression__NavAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5751:1: ( ( ruleNavigation ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5752:1: ( ruleNavigation )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5752:1: ( ruleNavigation )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5753:1: ruleNavigation
            {
             before(grammarAccess.getSimpleExpressionAccess().getNavNavigationParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_ruleNavigation_in_rule__SimpleExpression__NavAssignment_7_411649);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getNavNavigationParserRuleCall_7_4_0()); 

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
    // $ANTLR end "rule__SimpleExpression__NavAssignment_7_4"


    // $ANTLR start "rule__SimpleExpression__ResolveAssignment_8"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5762:1: rule__SimpleExpression__ResolveAssignment_8 : ( ruleResolveExp ) ;
    public final void rule__SimpleExpression__ResolveAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5766:1: ( ( ruleResolveExp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5767:1: ( ruleResolveExp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5767:1: ( ruleResolveExp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5768:1: ruleResolveExp
            {
             before(grammarAccess.getSimpleExpressionAccess().getResolveResolveExpParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleResolveExp_in_rule__SimpleExpression__ResolveAssignment_811680);
            ruleResolveExp();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getResolveResolveExpParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__SimpleExpression__ResolveAssignment_8"


    // $ANTLR start "rule__Navig__AttrAssignment_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5777:1: rule__Navig__AttrAssignment_0 : ( RULE_ID ) ;
    public final void rule__Navig__AttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5781:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5782:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5782:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5783:1: RULE_ID
            {
             before(grammarAccess.getNavigAccess().getAttrIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Navig__AttrAssignment_011711); 
             after(grammarAccess.getNavigAccess().getAttrIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Navig__AttrAssignment_0"


    // $ANTLR start "rule__Navig__NavigationAssignment_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5792:1: rule__Navig__NavigationAssignment_1 : ( ruleNavigation ) ;
    public final void rule__Navig__NavigationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5796:1: ( ( ruleNavigation ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5797:1: ( ruleNavigation )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5797:1: ( ruleNavigation )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5798:1: ruleNavigation
            {
             before(grammarAccess.getNavigAccess().getNavigationNavigationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNavigation_in_rule__Navig__NavigationAssignment_111742);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getNavigAccess().getNavigationNavigationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Navig__NavigationAssignment_1"


    // $ANTLR start "rule__Navigation__AttNameAssignment_0_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5807:1: rule__Navigation__AttNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Navigation__AttNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5811:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5812:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5812:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5813:1: RULE_ID
            {
             before(grammarAccess.getNavigationAccess().getAttNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Navigation__AttNameAssignment_0_111773); 
             after(grammarAccess.getNavigationAccess().getAttNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Navigation__AttNameAssignment_0_1"


    // $ANTLR start "rule__Navigation__AssocRoleAssignment_1_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5822:1: rule__Navigation__AssocRoleAssignment_1_1 : ( ruleAssocRoleName ) ;
    public final void rule__Navigation__AssocRoleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5826:1: ( ( ruleAssocRoleName ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5827:1: ( ruleAssocRoleName )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5827:1: ( ruleAssocRoleName )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5828:1: ruleAssocRoleName
            {
             before(grammarAccess.getNavigationAccess().getAssocRoleAssocRoleNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAssocRoleName_in_rule__Navigation__AssocRoleAssignment_1_111804);
            ruleAssocRoleName();

            state._fsp--;

             after(grammarAccess.getNavigationAccess().getAssocRoleAssocRoleNameParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Navigation__AssocRoleAssignment_1_1"


    // $ANTLR start "rule__Navigation__OpType1Assignment_2_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5837:1: rule__Navigation__OpType1Assignment_2_1 : ( ruleOCLOperationType1 ) ;
    public final void rule__Navigation__OpType1Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5841:1: ( ( ruleOCLOperationType1 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5842:1: ( ruleOCLOperationType1 )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5842:1: ( ruleOCLOperationType1 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5843:1: ruleOCLOperationType1
            {
             before(grammarAccess.getNavigationAccess().getOpType1OCLOperationType1ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleOCLOperationType1_in_rule__Navigation__OpType1Assignment_2_111835);
            ruleOCLOperationType1();

            state._fsp--;

             after(grammarAccess.getNavigationAccess().getOpType1OCLOperationType1ParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Navigation__OpType1Assignment_2_1"


    // $ANTLR start "rule__Navigation__OpType2Assignment_3_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5852:1: rule__Navigation__OpType2Assignment_3_1 : ( ruleOCLOperationType2 ) ;
    public final void rule__Navigation__OpType2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5856:1: ( ( ruleOCLOperationType2 ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5857:1: ( ruleOCLOperationType2 )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5857:1: ( ruleOCLOperationType2 )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5858:1: ruleOCLOperationType2
            {
             before(grammarAccess.getNavigationAccess().getOpType2OCLOperationType2ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleOCLOperationType2_in_rule__Navigation__OpType2Assignment_3_111866);
            ruleOCLOperationType2();

            state._fsp--;

             after(grammarAccess.getNavigationAccess().getOpType2OCLOperationType2ParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Navigation__OpType2Assignment_3_1"


    // $ANTLR start "rule__IfSentence__CondAssignment_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5867:1: rule__IfSentence__CondAssignment_1 : ( ruleComplexExpression ) ;
    public final void rule__IfSentence__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5871:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5872:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5872:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5873:1: ruleComplexExpression
            {
             before(grammarAccess.getIfSentenceAccess().getCondComplexExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__IfSentence__CondAssignment_111897);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getIfSentenceAccess().getCondComplexExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IfSentence__CondAssignment_1"


    // $ANTLR start "rule__IfSentence__BodyAssignment_3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5882:1: rule__IfSentence__BodyAssignment_3 : ( ruleComplexExpression ) ;
    public final void rule__IfSentence__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5886:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5887:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5887:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5888:1: ruleComplexExpression
            {
             before(grammarAccess.getIfSentenceAccess().getBodyComplexExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__IfSentence__BodyAssignment_311928);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getIfSentenceAccess().getBodyComplexExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IfSentence__BodyAssignment_3"


    // $ANTLR start "rule__IfSentence__ElsebodyAssignment_5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5897:1: rule__IfSentence__ElsebodyAssignment_5 : ( ruleComplexExpression ) ;
    public final void rule__IfSentence__ElsebodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5901:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5902:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5902:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5903:1: ruleComplexExpression
            {
             before(grammarAccess.getIfSentenceAccess().getElsebodyComplexExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__IfSentence__ElsebodyAssignment_511959);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getIfSentenceAccess().getElsebodyComplexExpressionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IfSentence__ElsebodyAssignment_5"


    // $ANTLR start "rule__ResolveExp__ExpAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5912:1: rule__ResolveExp__ExpAssignment_2 : ( ruleComplexExpression ) ;
    public final void rule__ResolveExp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5916:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5917:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5917:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5918:1: ruleComplexExpression
            {
             before(grammarAccess.getResolveExpAccess().getExpComplexExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__ResolveExp__ExpAssignment_211990);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getResolveExpAccess().getExpComplexExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ResolveExp__ExpAssignment_2"


    // $ANTLR start "rule__ResolveExp__PositionAssignment_3_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5927:1: rule__ResolveExp__PositionAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__ResolveExp__PositionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5931:1: ( ( RULE_INT ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5932:1: ( RULE_INT )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5932:1: ( RULE_INT )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5933:1: RULE_INT
            {
             before(grammarAccess.getResolveExpAccess().getPositionINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ResolveExp__PositionAssignment_3_112021); 
             after(grammarAccess.getResolveExpAccess().getPositionINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ResolveExp__PositionAssignment_3_1"


    // $ANTLR start "rule__ComplexExpression__PrefixNotAssignment_0_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5942:1: rule__ComplexExpression__PrefixNotAssignment_0_0 : ( ( 'not' ) ) ;
    public final void rule__ComplexExpression__PrefixNotAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5946:1: ( ( ( 'not' ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5947:1: ( ( 'not' ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5947:1: ( ( 'not' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5948:1: ( 'not' )
            {
             before(grammarAccess.getComplexExpressionAccess().getPrefixNotNotKeyword_0_0_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5949:1: ( 'not' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5950:1: 'not'
            {
             before(grammarAccess.getComplexExpressionAccess().getPrefixNotNotKeyword_0_0_0()); 
            match(input,63,FOLLOW_63_in_rule__ComplexExpression__PrefixNotAssignment_0_012057); 
             after(grammarAccess.getComplexExpressionAccess().getPrefixNotNotKeyword_0_0_0()); 

            }

             after(grammarAccess.getComplexExpressionAccess().getPrefixNotNotKeyword_0_0_0()); 

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
    // $ANTLR end "rule__ComplexExpression__PrefixNotAssignment_0_0"


    // $ANTLR start "rule__ComplexExpression__LeftAssignment_0_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5965:1: rule__ComplexExpression__LeftAssignment_0_2 : ( ruleSimpleExpression ) ;
    public final void rule__ComplexExpression__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5969:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5970:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5970:1: ( ruleSimpleExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5971:1: ruleSimpleExpression
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftSimpleExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__LeftAssignment_0_212096);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getLeftSimpleExpressionParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__ComplexExpression__LeftAssignment_0_2"


    // $ANTLR start "rule__ComplexExpression__InfixOpAssignment_0_3_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5980:1: rule__ComplexExpression__InfixOpAssignment_0_3_0 : ( ruleInfixPrimitiveOperator ) ;
    public final void rule__ComplexExpression__InfixOpAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5984:1: ( ( ruleInfixPrimitiveOperator ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5985:1: ( ruleInfixPrimitiveOperator )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5985:1: ( ruleInfixPrimitiveOperator )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5986:1: ruleInfixPrimitiveOperator
            {
             before(grammarAccess.getComplexExpressionAccess().getInfixOpInfixPrimitiveOperatorParserRuleCall_0_3_0_0()); 
            pushFollow(FOLLOW_ruleInfixPrimitiveOperator_in_rule__ComplexExpression__InfixOpAssignment_0_3_012127);
            ruleInfixPrimitiveOperator();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getInfixOpInfixPrimitiveOperatorParserRuleCall_0_3_0_0()); 

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
    // $ANTLR end "rule__ComplexExpression__InfixOpAssignment_0_3_0"


    // $ANTLR start "rule__ComplexExpression__RightAssignment_0_3_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5995:1: rule__ComplexExpression__RightAssignment_0_3_1 : ( ruleSimpleExpression ) ;
    public final void rule__ComplexExpression__RightAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:5999:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6000:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6000:1: ( ruleSimpleExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6001:1: ruleSimpleExpression
            {
             before(grammarAccess.getComplexExpressionAccess().getRightSimpleExpressionParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__RightAssignment_0_3_112158);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getRightSimpleExpressionParserRuleCall_0_3_1_0()); 

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
    // $ANTLR end "rule__ComplexExpression__RightAssignment_0_3_1"


    // $ANTLR start "rule__ComplexExpression__LeftAssignment_1_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6010:1: rule__ComplexExpression__LeftAssignment_1_0 : ( ruleSimpleExpression ) ;
    public final void rule__ComplexExpression__LeftAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6014:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6015:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6015:1: ( ruleSimpleExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6016:1: ruleSimpleExpression
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftSimpleExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__LeftAssignment_1_012189);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getLeftSimpleExpressionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ComplexExpression__LeftAssignment_1_0"


    // $ANTLR start "rule__ComplexExpression__InfixOpAssignment_1_1_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6025:1: rule__ComplexExpression__InfixOpAssignment_1_1_0 : ( ruleInfixPrimitiveOperator ) ;
    public final void rule__ComplexExpression__InfixOpAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6029:1: ( ( ruleInfixPrimitiveOperator ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6030:1: ( ruleInfixPrimitiveOperator )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6030:1: ( ruleInfixPrimitiveOperator )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6031:1: ruleInfixPrimitiveOperator
            {
             before(grammarAccess.getComplexExpressionAccess().getInfixOpInfixPrimitiveOperatorParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleInfixPrimitiveOperator_in_rule__ComplexExpression__InfixOpAssignment_1_1_012220);
            ruleInfixPrimitiveOperator();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getInfixOpInfixPrimitiveOperatorParserRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__ComplexExpression__InfixOpAssignment_1_1_0"


    // $ANTLR start "rule__ComplexExpression__RightAssignment_1_1_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6040:1: rule__ComplexExpression__RightAssignment_1_1_1 : ( ruleSimpleExpression ) ;
    public final void rule__ComplexExpression__RightAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6044:1: ( ( ruleSimpleExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6045:1: ( ruleSimpleExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6045:1: ( ruleSimpleExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6046:1: ruleSimpleExpression
            {
             before(grammarAccess.getComplexExpressionAccess().getRightSimpleExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__RightAssignment_1_1_112251);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getRightSimpleExpressionParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__ComplexExpression__RightAssignment_1_1_1"


    // $ANTLR start "rule__AssocRoleName__ChildrenAssignment_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6055:1: rule__AssocRoleName__ChildrenAssignment_0 : ( ( 'children()' ) ) ;
    public final void rule__AssocRoleName__ChildrenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6059:1: ( ( ( 'children()' ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6060:1: ( ( 'children()' ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6060:1: ( ( 'children()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6061:1: ( 'children()' )
            {
             before(grammarAccess.getAssocRoleNameAccess().getChildrenChildrenKeyword_0_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6062:1: ( 'children()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6063:1: 'children()'
            {
             before(grammarAccess.getAssocRoleNameAccess().getChildrenChildrenKeyword_0_0()); 
            match(input,64,FOLLOW_64_in_rule__AssocRoleName__ChildrenAssignment_012287); 
             after(grammarAccess.getAssocRoleNameAccess().getChildrenChildrenKeyword_0_0()); 

            }

             after(grammarAccess.getAssocRoleNameAccess().getChildrenChildrenKeyword_0_0()); 

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
    // $ANTLR end "rule__AssocRoleName__ChildrenAssignment_0"


    // $ANTLR start "rule__AssocRoleName__ParentAssignment_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6078:1: rule__AssocRoleName__ParentAssignment_1 : ( ( 'parent()' ) ) ;
    public final void rule__AssocRoleName__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6082:1: ( ( ( 'parent()' ) ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6083:1: ( ( 'parent()' ) )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6083:1: ( ( 'parent()' ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6084:1: ( 'parent()' )
            {
             before(grammarAccess.getAssocRoleNameAccess().getParentParentKeyword_1_0()); 
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6085:1: ( 'parent()' )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6086:1: 'parent()'
            {
             before(grammarAccess.getAssocRoleNameAccess().getParentParentKeyword_1_0()); 
            match(input,65,FOLLOW_65_in_rule__AssocRoleName__ParentAssignment_112331); 
             after(grammarAccess.getAssocRoleNameAccess().getParentParentKeyword_1_0()); 

            }

             after(grammarAccess.getAssocRoleNameAccess().getParentParentKeyword_1_0()); 

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
    // $ANTLR end "rule__AssocRoleName__ParentAssignment_1"


    // $ANTLR start "rule__AssocRoleName__NameAssignment_2_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6101:1: rule__AssocRoleName__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__AssocRoleName__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6105:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6106:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6106:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6107:1: RULE_ID
            {
             before(grammarAccess.getAssocRoleNameAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssocRoleName__NameAssignment_2_012370); 
             after(grammarAccess.getAssocRoleNameAccess().getNameIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__AssocRoleName__NameAssignment_2_0"


    // $ANTLR start "rule__OCLOperationType1__AllInsAssignment_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6116:1: rule__OCLOperationType1__AllInsAssignment_0 : ( ruleAllInstancesOp ) ;
    public final void rule__OCLOperationType1__AllInsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6120:1: ( ( ruleAllInstancesOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6121:1: ( ruleAllInstancesOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6121:1: ( ruleAllInstancesOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6122:1: ruleAllInstancesOp
            {
             before(grammarAccess.getOCLOperationType1Access().getAllInsAllInstancesOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAllInstancesOp_in_rule__OCLOperationType1__AllInsAssignment_012401);
            ruleAllInstancesOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType1Access().getAllInsAllInstancesOpParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OCLOperationType1__AllInsAssignment_0"


    // $ANTLR start "rule__OCLOperationType1__IsTypeOfAssignment_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6131:1: rule__OCLOperationType1__IsTypeOfAssignment_1 : ( ruleIsTypeOfOp ) ;
    public final void rule__OCLOperationType1__IsTypeOfAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6135:1: ( ( ruleIsTypeOfOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6136:1: ( ruleIsTypeOfOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6136:1: ( ruleIsTypeOfOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6137:1: ruleIsTypeOfOp
            {
             before(grammarAccess.getOCLOperationType1Access().getIsTypeOfIsTypeOfOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIsTypeOfOp_in_rule__OCLOperationType1__IsTypeOfAssignment_112432);
            ruleIsTypeOfOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType1Access().getIsTypeOfIsTypeOfOpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OCLOperationType1__IsTypeOfAssignment_1"


    // $ANTLR start "rule__OCLOperationType1__ToStringAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6146:1: rule__OCLOperationType1__ToStringAssignment_2 : ( ruleToStringOp ) ;
    public final void rule__OCLOperationType1__ToStringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6150:1: ( ( ruleToStringOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6151:1: ( ruleToStringOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6151:1: ( ruleToStringOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6152:1: ruleToStringOp
            {
             before(grammarAccess.getOCLOperationType1Access().getToStringToStringOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleToStringOp_in_rule__OCLOperationType1__ToStringAssignment_212463);
            ruleToStringOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType1Access().getToStringToStringOpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OCLOperationType1__ToStringAssignment_2"


    // $ANTLR start "rule__OCLOperationType1__ConcatenateAssignment_3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6161:1: rule__OCLOperationType1__ConcatenateAssignment_3 : ( ruleConcatOp ) ;
    public final void rule__OCLOperationType1__ConcatenateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6165:1: ( ( ruleConcatOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6166:1: ( ruleConcatOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6166:1: ( ruleConcatOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6167:1: ruleConcatOp
            {
             before(grammarAccess.getOCLOperationType1Access().getConcatenateConcatOpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcatOp_in_rule__OCLOperationType1__ConcatenateAssignment_312494);
            ruleConcatOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType1Access().getConcatenateConcatOpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OCLOperationType1__ConcatenateAssignment_3"


    // $ANTLR start "rule__OCLOperationType2__SizeAssignment_0"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6176:1: rule__OCLOperationType2__SizeAssignment_0 : ( ruleSizeOp ) ;
    public final void rule__OCLOperationType2__SizeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6180:1: ( ( ruleSizeOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6181:1: ( ruleSizeOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6181:1: ( ruleSizeOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6182:1: ruleSizeOp
            {
             before(grammarAccess.getOCLOperationType2Access().getSizeSizeOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSizeOp_in_rule__OCLOperationType2__SizeAssignment_012525);
            ruleSizeOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getSizeSizeOpParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__SizeAssignment_0"


    // $ANTLR start "rule__OCLOperationType2__ForallAssignment_1"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6191:1: rule__OCLOperationType2__ForallAssignment_1 : ( ruleForAllOp ) ;
    public final void rule__OCLOperationType2__ForallAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6195:1: ( ( ruleForAllOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6196:1: ( ruleForAllOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6196:1: ( ruleForAllOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6197:1: ruleForAllOp
            {
             before(grammarAccess.getOCLOperationType2Access().getForallForAllOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleForAllOp_in_rule__OCLOperationType2__ForallAssignment_112556);
            ruleForAllOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getForallForAllOpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__ForallAssignment_1"


    // $ANTLR start "rule__OCLOperationType2__ExistsAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6206:1: rule__OCLOperationType2__ExistsAssignment_2 : ( ruleExistsOp ) ;
    public final void rule__OCLOperationType2__ExistsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6210:1: ( ( ruleExistsOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6211:1: ( ruleExistsOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6211:1: ( ruleExistsOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6212:1: ruleExistsOp
            {
             before(grammarAccess.getOCLOperationType2Access().getExistsExistsOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExistsOp_in_rule__OCLOperationType2__ExistsAssignment_212587);
            ruleExistsOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getExistsExistsOpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__ExistsAssignment_2"


    // $ANTLR start "rule__OCLOperationType2__SelectAssignment_3"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6221:1: rule__OCLOperationType2__SelectAssignment_3 : ( ruleSelectOp ) ;
    public final void rule__OCLOperationType2__SelectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6225:1: ( ( ruleSelectOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6226:1: ( ruleSelectOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6226:1: ( ruleSelectOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6227:1: ruleSelectOp
            {
             before(grammarAccess.getOCLOperationType2Access().getSelectSelectOpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSelectOp_in_rule__OCLOperationType2__SelectAssignment_312618);
            ruleSelectOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getSelectSelectOpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__SelectAssignment_3"


    // $ANTLR start "rule__OCLOperationType2__CollectAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6236:1: rule__OCLOperationType2__CollectAssignment_4 : ( ruleCollectOp ) ;
    public final void rule__OCLOperationType2__CollectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6240:1: ( ( ruleCollectOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6241:1: ( ruleCollectOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6241:1: ( ruleCollectOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6242:1: ruleCollectOp
            {
             before(grammarAccess.getOCLOperationType2Access().getCollectCollectOpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCollectOp_in_rule__OCLOperationType2__CollectAssignment_412649);
            ruleCollectOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getCollectCollectOpParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__CollectAssignment_4"


    // $ANTLR start "rule__OCLOperationType2__FirstAssignment_5"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6251:1: rule__OCLOperationType2__FirstAssignment_5 : ( ruleFirstOp ) ;
    public final void rule__OCLOperationType2__FirstAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6255:1: ( ( ruleFirstOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6256:1: ( ruleFirstOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6256:1: ( ruleFirstOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6257:1: ruleFirstOp
            {
             before(grammarAccess.getOCLOperationType2Access().getFirstFirstOpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFirstOp_in_rule__OCLOperationType2__FirstAssignment_512680);
            ruleFirstOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getFirstFirstOpParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__FirstAssignment_5"


    // $ANTLR start "rule__OCLOperationType2__LastAssignment_6"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6266:1: rule__OCLOperationType2__LastAssignment_6 : ( ruleLastOp ) ;
    public final void rule__OCLOperationType2__LastAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6270:1: ( ( ruleLastOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6271:1: ( ruleLastOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6271:1: ( ruleLastOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6272:1: ruleLastOp
            {
             before(grammarAccess.getOCLOperationType2Access().getLastLastOpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleLastOp_in_rule__OCLOperationType2__LastAssignment_612711);
            ruleLastOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getLastLastOpParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__LastAssignment_6"


    // $ANTLR start "rule__OCLOperationType2__IndexOfAssignment_7"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6281:1: rule__OCLOperationType2__IndexOfAssignment_7 : ( ruleIndexOfOp ) ;
    public final void rule__OCLOperationType2__IndexOfAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6285:1: ( ( ruleIndexOfOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6286:1: ( ruleIndexOfOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6286:1: ( ruleIndexOfOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6287:1: ruleIndexOfOp
            {
             before(grammarAccess.getOCLOperationType2Access().getIndexOfIndexOfOpParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleIndexOfOp_in_rule__OCLOperationType2__IndexOfAssignment_712742);
            ruleIndexOfOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getIndexOfIndexOfOpParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__IndexOfAssignment_7"


    // $ANTLR start "rule__OCLOperationType2__UnionAssignment_8"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6296:1: rule__OCLOperationType2__UnionAssignment_8 : ( ruleUnionOp ) ;
    public final void rule__OCLOperationType2__UnionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6300:1: ( ( ruleUnionOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6301:1: ( ruleUnionOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6301:1: ( ruleUnionOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6302:1: ruleUnionOp
            {
             before(grammarAccess.getOCLOperationType2Access().getUnionUnionOpParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleUnionOp_in_rule__OCLOperationType2__UnionAssignment_812773);
            ruleUnionOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getUnionUnionOpParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__UnionAssignment_8"


    // $ANTLR start "rule__OCLOperationType2__IntersectionAssignment_9"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6311:1: rule__OCLOperationType2__IntersectionAssignment_9 : ( ruleIntersectionOp ) ;
    public final void rule__OCLOperationType2__IntersectionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6315:1: ( ( ruleIntersectionOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6316:1: ( ruleIntersectionOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6316:1: ( ruleIntersectionOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6317:1: ruleIntersectionOp
            {
             before(grammarAccess.getOCLOperationType2Access().getIntersectionIntersectionOpParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleIntersectionOp_in_rule__OCLOperationType2__IntersectionAssignment_912804);
            ruleIntersectionOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getIntersectionIntersectionOpParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__IntersectionAssignment_9"


    // $ANTLR start "rule__OCLOperationType2__IsUndefinedAssignment_10"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6326:1: rule__OCLOperationType2__IsUndefinedAssignment_10 : ( ruleIsUndefinedOp ) ;
    public final void rule__OCLOperationType2__IsUndefinedAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6330:1: ( ( ruleIsUndefinedOp ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6331:1: ( ruleIsUndefinedOp )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6331:1: ( ruleIsUndefinedOp )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6332:1: ruleIsUndefinedOp
            {
             before(grammarAccess.getOCLOperationType2Access().getIsUndefinedIsUndefinedOpParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleIsUndefinedOp_in_rule__OCLOperationType2__IsUndefinedAssignment_1012835);
            ruleIsUndefinedOp();

            state._fsp--;

             after(grammarAccess.getOCLOperationType2Access().getIsUndefinedIsUndefinedOpParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__OCLOperationType2__IsUndefinedAssignment_10"


    // $ANTLR start "rule__IndexOfOp__IndexAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6341:1: rule__IndexOfOp__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__IndexOfOp__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6345:1: ( ( RULE_INT ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6346:1: ( RULE_INT )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6346:1: ( RULE_INT )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6347:1: RULE_INT
            {
             before(grammarAccess.getIndexOfOpAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IndexOfOp__IndexAssignment_212866); 
             after(grammarAccess.getIndexOfOpAccess().getIndexINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IndexOfOp__IndexAssignment_2"


    // $ANTLR start "rule__ForAllOp__VarAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6356:1: rule__ForAllOp__VarAssignment_2 : ( RULE_ID ) ;
    public final void rule__ForAllOp__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6360:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6361:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6361:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6362:1: RULE_ID
            {
             before(grammarAccess.getForAllOpAccess().getVarIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForAllOp__VarAssignment_212897); 
             after(grammarAccess.getForAllOpAccess().getVarIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ForAllOp__VarAssignment_2"


    // $ANTLR start "rule__ForAllOp__ExpAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6371:1: rule__ForAllOp__ExpAssignment_4 : ( ruleComplexExpression ) ;
    public final void rule__ForAllOp__ExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6375:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6376:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6376:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6377:1: ruleComplexExpression
            {
             before(grammarAccess.getForAllOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__ForAllOp__ExpAssignment_412928);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getForAllOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ForAllOp__ExpAssignment_4"


    // $ANTLR start "rule__ExistsOp__VarAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6386:1: rule__ExistsOp__VarAssignment_2 : ( RULE_ID ) ;
    public final void rule__ExistsOp__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6390:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6391:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6391:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6392:1: RULE_ID
            {
             before(grammarAccess.getExistsOpAccess().getVarIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExistsOp__VarAssignment_212959); 
             after(grammarAccess.getExistsOpAccess().getVarIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ExistsOp__VarAssignment_2"


    // $ANTLR start "rule__ExistsOp__ExpAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6401:1: rule__ExistsOp__ExpAssignment_4 : ( ruleComplexExpression ) ;
    public final void rule__ExistsOp__ExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6405:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6406:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6406:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6407:1: ruleComplexExpression
            {
             before(grammarAccess.getExistsOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__ExistsOp__ExpAssignment_412990);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getExistsOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ExistsOp__ExpAssignment_4"


    // $ANTLR start "rule__SelectOp__VarAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6416:1: rule__SelectOp__VarAssignment_2 : ( RULE_ID ) ;
    public final void rule__SelectOp__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6420:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6421:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6421:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6422:1: RULE_ID
            {
             before(grammarAccess.getSelectOpAccess().getVarIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectOp__VarAssignment_213021); 
             after(grammarAccess.getSelectOpAccess().getVarIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SelectOp__VarAssignment_2"


    // $ANTLR start "rule__SelectOp__ExpAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6431:1: rule__SelectOp__ExpAssignment_4 : ( ruleComplexExpression ) ;
    public final void rule__SelectOp__ExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6435:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6436:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6436:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6437:1: ruleComplexExpression
            {
             before(grammarAccess.getSelectOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__SelectOp__ExpAssignment_413052);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getSelectOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SelectOp__ExpAssignment_4"


    // $ANTLR start "rule__CollectOp__VarAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6446:1: rule__CollectOp__VarAssignment_2 : ( RULE_ID ) ;
    public final void rule__CollectOp__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6450:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6451:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6451:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6452:1: RULE_ID
            {
             before(grammarAccess.getCollectOpAccess().getVarIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CollectOp__VarAssignment_213083); 
             after(grammarAccess.getCollectOpAccess().getVarIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CollectOp__VarAssignment_2"


    // $ANTLR start "rule__CollectOp__ExpAssignment_4"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6461:1: rule__CollectOp__ExpAssignment_4 : ( ruleComplexExpression ) ;
    public final void rule__CollectOp__ExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6465:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6466:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6466:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6467:1: ruleComplexExpression
            {
             before(grammarAccess.getCollectOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__CollectOp__ExpAssignment_413114);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getCollectOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CollectOp__ExpAssignment_4"


    // $ANTLR start "rule__IsTypeOfOp__ClassNameAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6476:1: rule__IsTypeOfOp__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IsTypeOfOp__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6480:1: ( ( RULE_ID ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6481:1: ( RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6481:1: ( RULE_ID )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6482:1: RULE_ID
            {
             before(grammarAccess.getIsTypeOfOpAccess().getClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IsTypeOfOp__ClassNameAssignment_213145); 
             after(grammarAccess.getIsTypeOfOpAccess().getClassNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IsTypeOfOp__ClassNameAssignment_2"


    // $ANTLR start "rule__ConcatOp__SAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6491:1: rule__ConcatOp__SAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ConcatOp__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6495:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6496:1: ( RULE_STRING )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6496:1: ( RULE_STRING )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6497:1: RULE_STRING
            {
             before(grammarAccess.getConcatOpAccess().getSSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ConcatOp__SAssignment_213176); 
             after(grammarAccess.getConcatOpAccess().getSSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConcatOp__SAssignment_2"


    // $ANTLR start "rule__UnionOp__ExpAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6506:1: rule__UnionOp__ExpAssignment_2 : ( ruleComplexExpression ) ;
    public final void rule__UnionOp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6510:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6511:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6511:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6512:1: ruleComplexExpression
            {
             before(grammarAccess.getUnionOpAccess().getExpComplexExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__UnionOp__ExpAssignment_213207);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getUnionOpAccess().getExpComplexExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UnionOp__ExpAssignment_2"


    // $ANTLR start "rule__IntersectionOp__ExpAssignment_2"
    // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6521:1: rule__IntersectionOp__ExpAssignment_2 : ( ruleComplexExpression ) ;
    public final void rule__IntersectionOp__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6525:1: ( ( ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6526:1: ( ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6526:1: ( ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl.ui/src-gen/org/xtext/example/webgme/ui/contentassist/antlr/internal/InternalMTL.g:6527:1: ruleComplexExpression
            {
             before(grammarAccess.getIntersectionOpAccess().getExpComplexExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_rule__IntersectionOp__ExpAssignment_213238);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getIntersectionOpAccess().getExpComplexExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntersectionOp__ExpAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInPattern_in_entryRuleInPattern182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInPattern189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InPattern__Group__0_in_ruleInPattern215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_entryRuleFilter242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilter249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__ExprAssignment_in_ruleFilter275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutPattern_in_entryRuleOutPattern302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutPattern309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__0_in_ruleOutPattern335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_entryRuleAssignation362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignation369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Alternatives_in_ruleAssignation395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Alternatives_in_ruleSimpleExpression455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavig_in_entryRuleNavig482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavig489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navig__Group__0_in_ruleNavig515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigation_in_entryRuleNavigation542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigation549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Alternatives_in_ruleNavigation575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSentence_in_entryRuleIfSentence602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSentence609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__0_in_ruleIfSentence635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResolveExp_in_entryRuleResolveExp662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResolveExp669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__0_in_ruleResolveExp695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_entryRuleComplexExpression722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexExpression729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Alternatives_in_ruleComplexExpression755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssocRoleName_in_entryRuleAssocRoleName782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssocRoleName789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssocRoleName__Alternatives_in_ruleAssocRoleName815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectionType__Alternatives_in_ruleCollectionType875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperationType1_in_entryRuleOCLOperationType1902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOCLOperationType1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType1__Alternatives_in_ruleOCLOperationType1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperationType2_in_entryRuleOCLOperationType2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOCLOperationType2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__Alternatives_in_ruleOCLOperationType2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixPrimitiveOperator_in_entryRuleInfixPrimitiveOperator1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixPrimitiveOperator1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfixPrimitiveOperator__Alternatives_in_ruleInfixPrimitiveOperator1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeOp_in_entryRuleSizeOp1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeOp1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeOp__Group__0_in_ruleSizeOp1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFirstOp_in_entryRuleFirstOp1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFirstOp1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FirstOp__Group__0_in_ruleFirstOp1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastOp_in_entryRuleLastOp1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLastOp1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LastOp__Group__0_in_ruleLastOp1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexOfOp_in_entryRuleIndexOfOp1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexOfOp1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__0_in_ruleIndexOfOp1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllInstancesOp_in_entryRuleAllInstancesOp1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllInstancesOp1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllInstancesOp__Group__0_in_ruleAllInstancesOp1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAllOp_in_entryRuleForAllOp1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAllOp1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__0_in_ruleForAllOp1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsOp_in_entryRuleExistsOp1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsOp1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__0_in_ruleExistsOp1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectOp_in_entryRuleSelectOp1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectOp1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__0_in_ruleSelectOp1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectOp_in_entryRuleCollectOp1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectOp1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__0_in_ruleCollectOp1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTypeOfOp_in_entryRuleIsTypeOfOp1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsTypeOfOp1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__0_in_ruleIsTypeOfOp1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToStringOp_in_entryRuleToStringOp1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToStringOp1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToStringOp__Group__0_in_ruleToStringOp1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatOp_in_entryRuleConcatOp1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatOp1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__0_in_ruleConcatOp1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionOp_in_entryRuleUnionOp1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionOp1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__0_in_ruleUnionOp1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectionOp_in_entryRuleIntersectionOp1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntersectionOp1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__0_in_ruleIntersectionOp1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsUndefinedOp_in_entryRuleIsUndefinedOp1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsUndefinedOp1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsUndefinedOp__Group__0_in_ruleIsUndefinedOp1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_0__0_in_rule__Assignation__Alternatives1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_1__0_in_rule__Assignation__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression___stringAssignment_0_in_rule__SimpleExpression__Alternatives2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression___integerAssignment_1_in_rule__SimpleExpression__Alternatives2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression___doubleAssignment_2_in_rule__SimpleExpression__Alternatives2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression___booleanAssignment_3_in_rule__SimpleExpression__Alternatives2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__IsNullAssignment_4_in_rule__SimpleExpression__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__NavigationAssignment_5_in_rule__SimpleExpression__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__IfSentenceAssignment_6_in_rule__SimpleExpression__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__0_in_rule__SimpleExpression__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__ResolveAssignment_8_in_rule__SimpleExpression__Alternatives2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_0__0_in_rule__Navigation__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_1__0_in_rule__Navigation__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_2__0_in_rule__Navigation__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_3__0_in_rule__Navigation__Alternatives2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__0_in_rule__ComplexExpression__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1__0_in_rule__ComplexExpression__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssocRoleName__ChildrenAssignment_0_in_rule__AssocRoleName__Alternatives2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssocRoleName__ParentAssignment_1_in_rule__AssocRoleName__Alternatives2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssocRoleName__Group_2__0_in_rule__AssocRoleName__Alternatives2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CollectionType__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CollectionType__Alternatives2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CollectionType__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType1__AllInsAssignment_0_in_rule__OCLOperationType1__Alternatives2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType1__IsTypeOfAssignment_1_in_rule__OCLOperationType1__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType1__ToStringAssignment_2_in_rule__OCLOperationType1__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType1__ConcatenateAssignment_3_in_rule__OCLOperationType1__Alternatives2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__SizeAssignment_0_in_rule__OCLOperationType2__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__ForallAssignment_1_in_rule__OCLOperationType2__Alternatives2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__ExistsAssignment_2_in_rule__OCLOperationType2__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__SelectAssignment_3_in_rule__OCLOperationType2__Alternatives2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__CollectAssignment_4_in_rule__OCLOperationType2__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__FirstAssignment_5_in_rule__OCLOperationType2__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__LastAssignment_6_in_rule__OCLOperationType2__Alternatives2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__IndexOfAssignment_7_in_rule__OCLOperationType2__Alternatives2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__UnionAssignment_8_in_rule__OCLOperationType2__Alternatives2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__IntersectionAssignment_9_in_rule__OCLOperationType2__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OCLOperationType2__IsUndefinedAssignment_10_in_rule__OCLOperationType2__Alternatives2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__InfixPrimitiveOperator__Alternatives2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InfixPrimitiveOperator__Alternatives2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InfixPrimitiveOperator__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__InfixPrimitiveOperator__Alternatives2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__InfixPrimitiveOperator__Alternatives2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InfixPrimitiveOperator__Alternatives2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InfixPrimitiveOperator__Alternatives2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InfixPrimitiveOperator__Alternatives2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InfixPrimitiveOperator__Alternatives2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InfixPrimitiveOperator__Alternatives2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InfixPrimitiveOperator__Alternatives3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__InfixPrimitiveOperator__Alternatives3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__03054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__03057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Rule__Group__0__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__13116 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23176 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Rule__Group__2__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Rule__Group__3__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43300 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__InPatternsAssignment_4_in_rule__Rule__Group__4__Impl3332 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Rule__InPatternsAssignment_4_in_rule__Rule__Group__4__Impl3344 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53377 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__53380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0_in_rule__Rule__Group__5__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__63438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__63441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Rule__Group__6__Impl3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__73500 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__73503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__OutPatternsAssignment_7_in_rule__Rule__Group__7__Impl3532 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Rule__OutPatternsAssignment_7_in_rule__Rule__Group__7__Impl3544 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__83577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Rule__Group__8__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__0__Impl_in_rule__Rule__Group_5__03654 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1_in_rule__Rule__Group_5__03657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Rule__Group_5__0__Impl3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__1__Impl_in_rule__Rule__Group_5__13716 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__2_in_rule__Rule__Group_5__13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__FilterAssignment_5_1_in_rule__Rule__Group_5__1__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_5__2__Impl_in_rule__Rule__Group_5__23776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Rule__Group_5__2__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InPattern__Group__0__Impl_in_rule__InPattern__Group__03841 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InPattern__Group__1_in_rule__InPattern__Group__03844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InPattern__InElemAssignment_0_in_rule__InPattern__Group__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InPattern__Group__1__Impl_in_rule__InPattern__Group__13901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InPattern__Group__2_in_rule__InPattern__Group__13904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InPattern__Group__1__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InPattern__Group__2__Impl_in_rule__InPattern__Group__23963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InPattern__ClassNameAssignment_2_in_rule__InPattern__Group__2__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__0__Impl_in_rule__OutPattern__Group__04026 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__1_in_rule__OutPattern__Group__04029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__VarNameAssignment_0_in_rule__OutPattern__Group__0__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__1__Impl_in_rule__OutPattern__Group__14086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__2_in_rule__OutPattern__Group__14089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OutPattern__Group__1__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__2__Impl_in_rule__OutPattern__Group__24148 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__3_in_rule__OutPattern__Group__24151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__ClassNameAssignment_2_in_rule__OutPattern__Group__2__Impl4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__3__Impl_in_rule__OutPattern__Group__34208 = new BitSet(new long[]{0x0000000400000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__4_in_rule__OutPattern__Group__34211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__OutPattern__Group__3__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__4__Impl_in_rule__OutPattern__Group__44270 = new BitSet(new long[]{0x0000000400000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__5_in_rule__OutPattern__Group__44273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OutPattern__AssgAssignment_4_in_rule__OutPattern__Group__4__Impl4300 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__OutPattern__Group__5__Impl_in_rule__OutPattern__Group__54331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OutPattern__Group__5__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_0__0__Impl_in_rule__Assignation__Group_0__04402 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Assignation__Group_0__1_in_rule__Assignation__Group_0__04405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__AttributeAssignment_0_0_in_rule__Assignation__Group_0__0__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_0__1__Impl_in_rule__Assignation__Group_0__14462 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__Assignation__Group_0__2_in_rule__Assignation__Group_0__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Assignation__Group_0__1__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_0__2__Impl_in_rule__Assignation__Group_0__24524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__ExprAssignment_0_2_in_rule__Assignation__Group_0__2__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_1__0__Impl_in_rule__Assignation__Group_1__04587 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Assignation__Group_1__1_in_rule__Assignation__Group_1__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__RelationshipAssignment_1_0_in_rule__Assignation__Group_1__0__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_1__1__Impl_in_rule__Assignation__Group_1__14647 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__Assignation__Group_1__2_in_rule__Assignation__Group_1__14650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Assignation__Group_1__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__Group_1__2__Impl_in_rule__Assignation__Group_1__24709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignation__ExprAssignment_1_2_in_rule__Assignation__Group_1__2__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__0__Impl_in_rule__SimpleExpression__Group_7__04772 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__1_in_rule__SimpleExpression__Group_7__04775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__ColectionTypeAssignment_7_0_in_rule__SimpleExpression__Group_7__0__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__1__Impl_in_rule__SimpleExpression__Group_7__14832 = new BitSet(new long[]{0xC00008810000E1F0L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__2_in_rule__SimpleExpression__Group_7__14835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SimpleExpression__Group_7__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__2__Impl_in_rule__SimpleExpression__Group_7__24894 = new BitSet(new long[]{0xC00008810000E1F0L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__3_in_rule__SimpleExpression__Group_7__24897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__ElemsAssignment_7_2_in_rule__SimpleExpression__Group_7__2__Impl4924 = new BitSet(new long[]{0xC00008800000E1F2L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__3__Impl_in_rule__SimpleExpression__Group_7__34955 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__4_in_rule__SimpleExpression__Group_7__34958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SimpleExpression__Group_7__3__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__Group_7__4__Impl_in_rule__SimpleExpression__Group_7__45017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpression__NavAssignment_7_4_in_rule__SimpleExpression__Group_7__4__Impl5044 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_rule__Navig__Group__0__Impl_in_rule__Navig__Group__05085 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Navig__Group__1_in_rule__Navig__Group__05088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navig__AttrAssignment_0_in_rule__Navig__Group__0__Impl5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navig__Group__1__Impl_in_rule__Navig__Group__15145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navig__NavigationAssignment_1_in_rule__Navig__Group__1__Impl5172 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_0__0__Impl_in_rule__Navigation__Group_0__05207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Navigation__Group_0__1_in_rule__Navigation__Group_0__05210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Navigation__Group_0__0__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_0__1__Impl_in_rule__Navigation__Group_0__15269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__AttNameAssignment_0_1_in_rule__Navigation__Group_0__1__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_1__0__Impl_in_rule__Navigation__Group_1__05330 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_rule__Navigation__Group_1__1_in_rule__Navigation__Group_1__05333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Navigation__Group_1__0__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_1__1__Impl_in_rule__Navigation__Group_1__15392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__AssocRoleAssignment_1_1_in_rule__Navigation__Group_1__1__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_2__0__Impl_in_rule__Navigation__Group_2__05453 = new BitSet(new long[]{0x0704000000000000L});
    public static final BitSet FOLLOW_rule__Navigation__Group_2__1_in_rule__Navigation__Group_2__05456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Navigation__Group_2__0__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_2__1__Impl_in_rule__Navigation__Group_2__15515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__OpType1Assignment_2_1_in_rule__Navigation__Group_2__1__Impl5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_3__0__Impl_in_rule__Navigation__Group_3__05576 = new BitSet(new long[]{0x38EBC00000000000L});
    public static final BitSet FOLLOW_rule__Navigation__Group_3__1_in_rule__Navigation__Group_3__05579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Navigation__Group_3__0__Impl5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__Group_3__1__Impl_in_rule__Navigation__Group_3__15638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Navigation__OpType2Assignment_3_1_in_rule__Navigation__Group_3__1__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__0__Impl_in_rule__IfSentence__Group__05699 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__1_in_rule__IfSentence__Group__05702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__IfSentence__Group__0__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__1__Impl_in_rule__IfSentence__Group__15761 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__2_in_rule__IfSentence__Group__15764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__CondAssignment_1_in_rule__IfSentence__Group__1__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__2__Impl_in_rule__IfSentence__Group__25821 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__3_in_rule__IfSentence__Group__25824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__IfSentence__Group__2__Impl5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__3__Impl_in_rule__IfSentence__Group__35883 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__4_in_rule__IfSentence__Group__35886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__BodyAssignment_3_in_rule__IfSentence__Group__3__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__4__Impl_in_rule__IfSentence__Group__45943 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__5_in_rule__IfSentence__Group__45946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__IfSentence__Group__4__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__5__Impl_in_rule__IfSentence__Group__56005 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__6_in_rule__IfSentence__Group__56008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__ElsebodyAssignment_5_in_rule__IfSentence__Group__5__Impl6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfSentence__Group__6__Impl_in_rule__IfSentence__Group__66065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IfSentence__Group__6__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__0__Impl_in_rule__ResolveExp__Group__06138 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__1_in_rule__ResolveExp__Group__06141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ResolveExp__Group__0__Impl6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__1__Impl_in_rule__ResolveExp__Group__16200 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__2_in_rule__ResolveExp__Group__16203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ResolveExp__Group__1__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__2__Impl_in_rule__ResolveExp__Group__26262 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__3_in_rule__ResolveExp__Group__26265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__ExpAssignment_2_in_rule__ResolveExp__Group__2__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__3__Impl_in_rule__ResolveExp__Group__36322 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__4_in_rule__ResolveExp__Group__36325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group_3__0_in_rule__ResolveExp__Group__3__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group__4__Impl_in_rule__ResolveExp__Group__46383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ResolveExp__Group__4__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group_3__0__Impl_in_rule__ResolveExp__Group_3__06452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group_3__1_in_rule__ResolveExp__Group_3__06455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ResolveExp__Group_3__0__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__Group_3__1__Impl_in_rule__ResolveExp__Group_3__16514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResolveExp__PositionAssignment_3_1_in_rule__ResolveExp__Group_3__1__Impl6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__0__Impl_in_rule__ComplexExpression__Group_0__06575 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__1_in_rule__ComplexExpression__Group_0__06578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__PrefixNotAssignment_0_0_in_rule__ComplexExpression__Group_0__0__Impl6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__1__Impl_in_rule__ComplexExpression__Group_0__16635 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__2_in_rule__ComplexExpression__Group_0__16638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ComplexExpression__Group_0__1__Impl6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__2__Impl_in_rule__ComplexExpression__Group_0__26697 = new BitSet(new long[]{0x000000040FFF0000L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__3_in_rule__ComplexExpression__Group_0__26700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__LeftAssignment_0_2_in_rule__ComplexExpression__Group_0__2__Impl6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__3__Impl_in_rule__ComplexExpression__Group_0__36757 = new BitSet(new long[]{0x000000040FFF0000L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__4_in_rule__ComplexExpression__Group_0__36760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0_3__0_in_rule__ComplexExpression__Group_0__3__Impl6787 = new BitSet(new long[]{0x000000000FFF0002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0__4__Impl_in_rule__ComplexExpression__Group_0__46818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ComplexExpression__Group_0__4__Impl6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0_3__0__Impl_in_rule__ComplexExpression__Group_0_3__06887 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0_3__1_in_rule__ComplexExpression__Group_0_3__06890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__InfixOpAssignment_0_3_0_in_rule__ComplexExpression__Group_0_3__0__Impl6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_0_3__1__Impl_in_rule__ComplexExpression__Group_0_3__16947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__RightAssignment_0_3_1_in_rule__ComplexExpression__Group_0_3__1__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1__0__Impl_in_rule__ComplexExpression__Group_1__07008 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1__1_in_rule__ComplexExpression__Group_1__07011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__LeftAssignment_1_0_in_rule__ComplexExpression__Group_1__0__Impl7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1__1__Impl_in_rule__ComplexExpression__Group_1__17068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1_1__0_in_rule__ComplexExpression__Group_1__1__Impl7095 = new BitSet(new long[]{0x000000000FFF0002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1_1__0__Impl_in_rule__ComplexExpression__Group_1_1__07130 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1_1__1_in_rule__ComplexExpression__Group_1_1__07133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__InfixOpAssignment_1_1_0_in_rule__ComplexExpression__Group_1_1__0__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__Group_1_1__1__Impl_in_rule__ComplexExpression__Group_1_1__17190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexExpression__RightAssignment_1_1_1_in_rule__ComplexExpression__Group_1_1__1__Impl7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssocRoleName__Group_2__0__Impl_in_rule__AssocRoleName__Group_2__07251 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AssocRoleName__Group_2__1_in_rule__AssocRoleName__Group_2__07254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssocRoleName__NameAssignment_2_0_in_rule__AssocRoleName__Group_2__0__Impl7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssocRoleName__Group_2__1__Impl_in_rule__AssocRoleName__Group_2__17311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AssocRoleName__Group_2__1__Impl7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeOp__Group__0__Impl_in_rule__SizeOp__Group__07374 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__SizeOp__Group__1_in_rule__SizeOp__Group__07377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SizeOp__Group__0__Impl7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeOp__Group__1__Impl_in_rule__SizeOp__Group__17436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SizeOp__Group__1__Impl7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FirstOp__Group__0__Impl_in_rule__FirstOp__Group__07499 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__FirstOp__Group__1_in_rule__FirstOp__Group__07502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FirstOp__Group__0__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FirstOp__Group__1__Impl_in_rule__FirstOp__Group__17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FirstOp__Group__1__Impl7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LastOp__Group__0__Impl_in_rule__LastOp__Group__07624 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__LastOp__Group__1_in_rule__LastOp__Group__07627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__LastOp__Group__0__Impl7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LastOp__Group__1__Impl_in_rule__LastOp__Group__17686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__LastOp__Group__1__Impl7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__0__Impl_in_rule__IndexOfOp__Group__07749 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__1_in_rule__IndexOfOp__Group__07752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__IndexOfOp__Group__0__Impl7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__1__Impl_in_rule__IndexOfOp__Group__17811 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__2_in_rule__IndexOfOp__Group__17814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IndexOfOp__Group__1__Impl7842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__2__Impl_in_rule__IndexOfOp__Group__27873 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__3_in_rule__IndexOfOp__Group__27876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexOfOp__IndexAssignment_2_in_rule__IndexOfOp__Group__2__Impl7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IndexOfOp__Group__3__Impl_in_rule__IndexOfOp__Group__37933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IndexOfOp__Group__3__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllInstancesOp__Group__0__Impl_in_rule__AllInstancesOp__Group__08000 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AllInstancesOp__Group__1_in_rule__AllInstancesOp__Group__08003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__AllInstancesOp__Group__0__Impl8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllInstancesOp__Group__1__Impl_in_rule__AllInstancesOp__Group__18062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AllInstancesOp__Group__1__Impl8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__0__Impl_in_rule__ForAllOp__Group__08125 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__1_in_rule__ForAllOp__Group__08128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ForAllOp__Group__0__Impl8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__1__Impl_in_rule__ForAllOp__Group__18187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__2_in_rule__ForAllOp__Group__18190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ForAllOp__Group__1__Impl8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__2__Impl_in_rule__ForAllOp__Group__28249 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__3_in_rule__ForAllOp__Group__28252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__VarAssignment_2_in_rule__ForAllOp__Group__2__Impl8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__3__Impl_in_rule__ForAllOp__Group__38309 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__4_in_rule__ForAllOp__Group__38312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ForAllOp__Group__3__Impl8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__4__Impl_in_rule__ForAllOp__Group__48371 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__5_in_rule__ForAllOp__Group__48374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__ExpAssignment_4_in_rule__ForAllOp__Group__4__Impl8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAllOp__Group__5__Impl_in_rule__ForAllOp__Group__58431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ForAllOp__Group__5__Impl8459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__0__Impl_in_rule__ExistsOp__Group__08502 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__1_in_rule__ExistsOp__Group__08505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ExistsOp__Group__0__Impl8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__1__Impl_in_rule__ExistsOp__Group__18564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__2_in_rule__ExistsOp__Group__18567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExistsOp__Group__1__Impl8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__2__Impl_in_rule__ExistsOp__Group__28626 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__3_in_rule__ExistsOp__Group__28629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__VarAssignment_2_in_rule__ExistsOp__Group__2__Impl8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__3__Impl_in_rule__ExistsOp__Group__38686 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__4_in_rule__ExistsOp__Group__38689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ExistsOp__Group__3__Impl8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__4__Impl_in_rule__ExistsOp__Group__48748 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__5_in_rule__ExistsOp__Group__48751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__ExpAssignment_4_in_rule__ExistsOp__Group__4__Impl8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsOp__Group__5__Impl_in_rule__ExistsOp__Group__58808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ExistsOp__Group__5__Impl8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__0__Impl_in_rule__SelectOp__Group__08879 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__1_in_rule__SelectOp__Group__08882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SelectOp__Group__0__Impl8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__1__Impl_in_rule__SelectOp__Group__18941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__2_in_rule__SelectOp__Group__18944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SelectOp__Group__1__Impl8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__2__Impl_in_rule__SelectOp__Group__29003 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__3_in_rule__SelectOp__Group__29006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__VarAssignment_2_in_rule__SelectOp__Group__2__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__3__Impl_in_rule__SelectOp__Group__39063 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__4_in_rule__SelectOp__Group__39066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SelectOp__Group__3__Impl9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__4__Impl_in_rule__SelectOp__Group__49125 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__5_in_rule__SelectOp__Group__49128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__ExpAssignment_4_in_rule__SelectOp__Group__4__Impl9155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectOp__Group__5__Impl_in_rule__SelectOp__Group__59185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SelectOp__Group__5__Impl9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__0__Impl_in_rule__CollectOp__Group__09256 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__1_in_rule__CollectOp__Group__09259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__CollectOp__Group__0__Impl9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__1__Impl_in_rule__CollectOp__Group__19318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__2_in_rule__CollectOp__Group__19321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CollectOp__Group__1__Impl9349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__2__Impl_in_rule__CollectOp__Group__29380 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__3_in_rule__CollectOp__Group__29383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__VarAssignment_2_in_rule__CollectOp__Group__2__Impl9410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__3__Impl_in_rule__CollectOp__Group__39440 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__4_in_rule__CollectOp__Group__39443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__CollectOp__Group__3__Impl9471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__4__Impl_in_rule__CollectOp__Group__49502 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__5_in_rule__CollectOp__Group__49505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__ExpAssignment_4_in_rule__CollectOp__Group__4__Impl9532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CollectOp__Group__5__Impl_in_rule__CollectOp__Group__59562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CollectOp__Group__5__Impl9590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__0__Impl_in_rule__IsTypeOfOp__Group__09633 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__1_in_rule__IsTypeOfOp__Group__09636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__IsTypeOfOp__Group__0__Impl9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__1__Impl_in_rule__IsTypeOfOp__Group__19695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__2_in_rule__IsTypeOfOp__Group__19698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IsTypeOfOp__Group__1__Impl9726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__2__Impl_in_rule__IsTypeOfOp__Group__29757 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__3_in_rule__IsTypeOfOp__Group__29760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__ClassNameAssignment_2_in_rule__IsTypeOfOp__Group__2__Impl9787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsTypeOfOp__Group__3__Impl_in_rule__IsTypeOfOp__Group__39817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IsTypeOfOp__Group__3__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToStringOp__Group__0__Impl_in_rule__ToStringOp__Group__09884 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ToStringOp__Group__1_in_rule__ToStringOp__Group__09887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ToStringOp__Group__0__Impl9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ToStringOp__Group__1__Impl_in_rule__ToStringOp__Group__19946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ToStringOp__Group__1__Impl9974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__0__Impl_in_rule__ConcatOp__Group__010009 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__1_in_rule__ConcatOp__Group__010012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ConcatOp__Group__0__Impl10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__1__Impl_in_rule__ConcatOp__Group__110071 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__2_in_rule__ConcatOp__Group__110074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ConcatOp__Group__1__Impl10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__2__Impl_in_rule__ConcatOp__Group__210133 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__3_in_rule__ConcatOp__Group__210136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatOp__SAssignment_2_in_rule__ConcatOp__Group__2__Impl10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcatOp__Group__3__Impl_in_rule__ConcatOp__Group__310193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ConcatOp__Group__3__Impl10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__0__Impl_in_rule__UnionOp__Group__010260 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__1_in_rule__UnionOp__Group__010263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__UnionOp__Group__0__Impl10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__1__Impl_in_rule__UnionOp__Group__110322 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__2_in_rule__UnionOp__Group__110325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__UnionOp__Group__1__Impl10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__2__Impl_in_rule__UnionOp__Group__210384 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__3_in_rule__UnionOp__Group__210387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionOp__ExpAssignment_2_in_rule__UnionOp__Group__2__Impl10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnionOp__Group__3__Impl_in_rule__UnionOp__Group__310444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__UnionOp__Group__3__Impl10472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__0__Impl_in_rule__IntersectionOp__Group__010511 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__1_in_rule__IntersectionOp__Group__010514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__IntersectionOp__Group__0__Impl10542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__1__Impl_in_rule__IntersectionOp__Group__110573 = new BitSet(new long[]{0xC00008800000E1F0L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__2_in_rule__IntersectionOp__Group__110576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IntersectionOp__Group__1__Impl10604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__2__Impl_in_rule__IntersectionOp__Group__210635 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__3_in_rule__IntersectionOp__Group__210638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntersectionOp__ExpAssignment_2_in_rule__IntersectionOp__Group__2__Impl10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntersectionOp__Group__3__Impl_in_rule__IntersectionOp__Group__310695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntersectionOp__Group__3__Impl10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsUndefinedOp__Group__0__Impl_in_rule__IsUndefinedOp__Group__010762 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__IsUndefinedOp__Group__1_in_rule__IsUndefinedOp__Group__010765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__IsUndefinedOp__Group__0__Impl10793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsUndefinedOp__Group__1__Impl_in_rule__IsUndefinedOp__Group__110824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__IsUndefinedOp__Group__1__Impl10852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__RulesAssignment10892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_110923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInPattern_in_rule__Rule__InPatternsAssignment_410954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_rule__Rule__FilterAssignment_5_110985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutPattern_in_rule__Rule__OutPatternsAssignment_711016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InPattern__InElemAssignment_011047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InPattern__ClassNameAssignment_211078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__Filter__ExprAssignment11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OutPattern__VarNameAssignment_011140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OutPattern__ClassNameAssignment_211171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_rule__OutPattern__AssgAssignment_411202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignation__AttributeAssignment_0_011233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__Assignation__ExprAssignment_0_211264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssocRoleName_in_rule__Assignation__RelationshipAssignment_1_011295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__Assignation__ExprAssignment_1_211326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleExpression___stringAssignment_011357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SimpleExpression___integerAssignment_111388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__SimpleExpression___doubleAssignment_211419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__SimpleExpression___booleanAssignment_311450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SimpleExpression__IsNullAssignment_411486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavig_in_rule__SimpleExpression__NavigationAssignment_511525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSentence_in_rule__SimpleExpression__IfSentenceAssignment_611556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_rule__SimpleExpression__ColectionTypeAssignment_7_011587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__SimpleExpression__ElemsAssignment_7_211618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigation_in_rule__SimpleExpression__NavAssignment_7_411649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResolveExp_in_rule__SimpleExpression__ResolveAssignment_811680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Navig__AttrAssignment_011711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigation_in_rule__Navig__NavigationAssignment_111742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Navigation__AttNameAssignment_0_111773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssocRoleName_in_rule__Navigation__AssocRoleAssignment_1_111804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperationType1_in_rule__Navigation__OpType1Assignment_2_111835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperationType2_in_rule__Navigation__OpType2Assignment_3_111866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__IfSentence__CondAssignment_111897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__IfSentence__BodyAssignment_311928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__IfSentence__ElsebodyAssignment_511959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__ResolveExp__ExpAssignment_211990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ResolveExp__PositionAssignment_3_112021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ComplexExpression__PrefixNotAssignment_0_012057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__LeftAssignment_0_212096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixPrimitiveOperator_in_rule__ComplexExpression__InfixOpAssignment_0_3_012127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__RightAssignment_0_3_112158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__LeftAssignment_1_012189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixPrimitiveOperator_in_rule__ComplexExpression__InfixOpAssignment_1_1_012220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_rule__ComplexExpression__RightAssignment_1_1_112251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__AssocRoleName__ChildrenAssignment_012287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__AssocRoleName__ParentAssignment_112331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssocRoleName__NameAssignment_2_012370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllInstancesOp_in_rule__OCLOperationType1__AllInsAssignment_012401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTypeOfOp_in_rule__OCLOperationType1__IsTypeOfAssignment_112432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToStringOp_in_rule__OCLOperationType1__ToStringAssignment_212463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatOp_in_rule__OCLOperationType1__ConcatenateAssignment_312494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeOp_in_rule__OCLOperationType2__SizeAssignment_012525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAllOp_in_rule__OCLOperationType2__ForallAssignment_112556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsOp_in_rule__OCLOperationType2__ExistsAssignment_212587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectOp_in_rule__OCLOperationType2__SelectAssignment_312618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectOp_in_rule__OCLOperationType2__CollectAssignment_412649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFirstOp_in_rule__OCLOperationType2__FirstAssignment_512680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastOp_in_rule__OCLOperationType2__LastAssignment_612711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexOfOp_in_rule__OCLOperationType2__IndexOfAssignment_712742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionOp_in_rule__OCLOperationType2__UnionAssignment_812773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectionOp_in_rule__OCLOperationType2__IntersectionAssignment_912804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsUndefinedOp_in_rule__OCLOperationType2__IsUndefinedAssignment_1012835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IndexOfOp__IndexAssignment_212866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForAllOp__VarAssignment_212897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__ForAllOp__ExpAssignment_412928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExistsOp__VarAssignment_212959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__ExistsOp__ExpAssignment_412990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectOp__VarAssignment_213021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__SelectOp__ExpAssignment_413052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CollectOp__VarAssignment_213083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__CollectOp__ExpAssignment_413114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IsTypeOfOp__ClassNameAssignment_213145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ConcatOp__SAssignment_213176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__UnionOp__ExpAssignment_213207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_rule__IntersectionOp__ExpAssignment_213238 = new BitSet(new long[]{0x0000000000000002L});

}