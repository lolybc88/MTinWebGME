package org.xtext.example.webgme.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.webgme.services.MTLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMTLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'from'", "'('", "')'", "'to'", "'}'", "':'", "'<-'", "'null'", "'.'", "'->'", "'if'", "'then'", "'else'", "'endif'", "'resolve'", "','", "'not'", "'children()'", "'parent()'", "'()'", "'Set'", "'Sequence'", "'Bag'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'size'", "'first'", "'last'", "'indexOf'", "'allInstances'", "'forAll'", "'|'", "'exists'", "'select'", "'collect'", "'isTypeOf'", "'toString'", "'concatenate'", "'union'", "'intersection'", "'isUndefined'"
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
    public String getGrammarFileName() { return "../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g"; }



     	private MTLGrammarAccess grammarAccess;
     	
        public InternalMTLParser(TokenStream input, MTLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MTLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:76:1: ruleModel returns [EObject current=null] : ( (lv_rules_0_0= ruleRule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:79:28: ( ( (lv_rules_0_0= ruleRule ) )* )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:80:1: ( (lv_rules_0_0= ruleRule ) )*
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:80:1: ( (lv_rules_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:81:1: (lv_rules_0_0= ruleRule )
            	    {
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:81:1: (lv_rules_0_0= ruleRule )
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:82:3: lv_rules_0_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleModel130);
            	    lv_rules_0_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_0_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:106:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:107:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:108:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule166);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule176); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:115:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPatterns_4_0= ruleInPattern ) )+ (otherlv_5= '(' ( (lv_filter_6_0= ruleFilter ) ) otherlv_7= ')' )? otherlv_8= 'to' ( (lv_outPatterns_9_0= ruleOutPattern ) )+ otherlv_10= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_inPatterns_4_0 = null;

        EObject lv_filter_6_0 = null;

        EObject lv_outPatterns_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:118:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPatterns_4_0= ruleInPattern ) )+ (otherlv_5= '(' ( (lv_filter_6_0= ruleFilter ) ) otherlv_7= ')' )? otherlv_8= 'to' ( (lv_outPatterns_9_0= ruleOutPattern ) )+ otherlv_10= '}' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:119:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPatterns_4_0= ruleInPattern ) )+ (otherlv_5= '(' ( (lv_filter_6_0= ruleFilter ) ) otherlv_7= ')' )? otherlv_8= 'to' ( (lv_outPatterns_9_0= ruleOutPattern ) )+ otherlv_10= '}' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:119:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPatterns_4_0= ruleInPattern ) )+ (otherlv_5= '(' ( (lv_filter_6_0= ruleFilter ) ) otherlv_7= ')' )? otherlv_8= 'to' ( (lv_outPatterns_9_0= ruleOutPattern ) )+ otherlv_10= '}' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:119:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_inPatterns_4_0= ruleInPattern ) )+ (otherlv_5= '(' ( (lv_filter_6_0= ruleFilter ) ) otherlv_7= ')' )? otherlv_8= 'to' ( (lv_outPatterns_9_0= ruleOutPattern ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRule213); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRule247); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRule259); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFromKeyword_3());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:149:1: ( (lv_inPatterns_4_0= ruleInPattern ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:150:1: (lv_inPatterns_4_0= ruleInPattern )
            	    {
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:150:1: (lv_inPatterns_4_0= ruleInPattern )
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:151:3: lv_inPatterns_4_0= ruleInPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getInPatternsInPatternParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInPattern_in_ruleRule280);
            	    lv_inPatterns_4_0=ruleInPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inPatterns",
            	            		lv_inPatterns_4_0, 
            	            		"InPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:167:3: (otherlv_5= '(' ( (lv_filter_6_0= ruleFilter ) ) otherlv_7= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:167:5: otherlv_5= '(' ( (lv_filter_6_0= ruleFilter ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleRule294); 

                        	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_5_0());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:171:1: ( (lv_filter_6_0= ruleFilter ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:172:1: (lv_filter_6_0= ruleFilter )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:172:1: (lv_filter_6_0= ruleFilter )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:173:3: lv_filter_6_0= ruleFilter
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilter_in_ruleRule315);
                    lv_filter_6_0=ruleFilter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_6_0, 
                            		"Filter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRule327); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightParenthesisKeyword_5_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleRule341); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getToKeyword_6());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:197:1: ( (lv_outPatterns_9_0= ruleOutPattern ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:198:1: (lv_outPatterns_9_0= ruleOutPattern )
            	    {
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:198:1: (lv_outPatterns_9_0= ruleOutPattern )
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:199:3: lv_outPatterns_9_0= ruleOutPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getOutPatternsOutPatternParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOutPattern_in_ruleRule362);
            	    lv_outPatterns_9_0=ruleOutPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"outPatterns",
            	            		lv_outPatterns_9_0, 
            	            		"OutPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleRule375); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleInPattern"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:227:1: entryRuleInPattern returns [EObject current=null] : iv_ruleInPattern= ruleInPattern EOF ;
    public final EObject entryRuleInPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInPattern = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:228:2: (iv_ruleInPattern= ruleInPattern EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:229:2: iv_ruleInPattern= ruleInPattern EOF
            {
             newCompositeNode(grammarAccess.getInPatternRule()); 
            pushFollow(FOLLOW_ruleInPattern_in_entryRuleInPattern411);
            iv_ruleInPattern=ruleInPattern();

            state._fsp--;

             current =iv_ruleInPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInPattern421); 

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
    // $ANTLR end "entryRuleInPattern"


    // $ANTLR start "ruleInPattern"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:236:1: ruleInPattern returns [EObject current=null] : ( ( (lv_inElem_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInPattern() throws RecognitionException {
        EObject current = null;

        Token lv_inElem_0_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:239:28: ( ( ( (lv_inElem_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:240:1: ( ( (lv_inElem_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:240:1: ( ( (lv_inElem_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:240:2: ( (lv_inElem_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:240:2: ( (lv_inElem_0_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:241:1: (lv_inElem_0_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:241:1: (lv_inElem_0_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:242:3: lv_inElem_0_0= RULE_ID
            {
            lv_inElem_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInPattern463); 

            			newLeafNode(lv_inElem_0_0, grammarAccess.getInPatternAccess().getInElemIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"inElem",
                    		lv_inElem_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleInPattern480); 

                	newLeafNode(otherlv_1, grammarAccess.getInPatternAccess().getColonKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:262:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:263:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:263:1: (lv_className_2_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:264:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInPattern497); 

            			newLeafNode(lv_className_2_0, grammarAccess.getInPatternAccess().getClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleInPattern"


    // $ANTLR start "entryRuleFilter"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:288:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:289:2: (iv_ruleFilter= ruleFilter EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:290:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_ruleFilter_in_entryRuleFilter538);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilter548); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:297:1: ruleFilter returns [EObject current=null] : ( (lv_expr_0_0= ruleComplexExpression ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:300:28: ( ( (lv_expr_0_0= ruleComplexExpression ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:301:1: ( (lv_expr_0_0= ruleComplexExpression ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:301:1: ( (lv_expr_0_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:302:1: (lv_expr_0_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:302:1: (lv_expr_0_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:303:3: lv_expr_0_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getFilterAccess().getExprComplexExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleFilter593);
            lv_expr_0_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_0_0, 
                    		"ComplexExpression");
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleOutPattern"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:327:1: entryRuleOutPattern returns [EObject current=null] : iv_ruleOutPattern= ruleOutPattern EOF ;
    public final EObject entryRuleOutPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutPattern = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:328:2: (iv_ruleOutPattern= ruleOutPattern EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:329:2: iv_ruleOutPattern= ruleOutPattern EOF
            {
             newCompositeNode(grammarAccess.getOutPatternRule()); 
            pushFollow(FOLLOW_ruleOutPattern_in_entryRuleOutPattern628);
            iv_ruleOutPattern=ruleOutPattern();

            state._fsp--;

             current =iv_ruleOutPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutPattern638); 

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
    // $ANTLR end "entryRuleOutPattern"


    // $ANTLR start "ruleOutPattern"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:336:1: ruleOutPattern returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_assg_4_0= ruleAssignation ) )* otherlv_5= ')' ) ;
    public final EObject ruleOutPattern() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assg_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:339:28: ( ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_assg_4_0= ruleAssignation ) )* otherlv_5= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:340:1: ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_assg_4_0= ruleAssignation ) )* otherlv_5= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:340:1: ( ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_assg_4_0= ruleAssignation ) )* otherlv_5= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:340:2: ( (lv_varName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_assg_4_0= ruleAssignation ) )* otherlv_5= ')'
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:340:2: ( (lv_varName_0_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:341:1: (lv_varName_0_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:341:1: (lv_varName_0_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:342:3: lv_varName_0_0= RULE_ID
            {
            lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutPattern680); 

            			newLeafNode(lv_varName_0_0, grammarAccess.getOutPatternAccess().getVarNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varName",
                    		lv_varName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleOutPattern697); 

                	newLeafNode(otherlv_1, grammarAccess.getOutPatternAccess().getColonKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:362:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:363:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:363:1: (lv_className_2_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:364:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutPattern714); 

            			newLeafNode(lv_className_2_0, grammarAccess.getOutPatternAccess().getClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOutPattern731); 

                	newLeafNode(otherlv_3, grammarAccess.getOutPatternAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:384:1: ( (lv_assg_4_0= ruleAssignation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=32 && LA5_0<=33)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:385:1: (lv_assg_4_0= ruleAssignation )
            	    {
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:385:1: (lv_assg_4_0= ruleAssignation )
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:386:3: lv_assg_4_0= ruleAssignation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOutPatternAccess().getAssgAssignationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignation_in_ruleOutPattern752);
            	    lv_assg_4_0=ruleAssignation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOutPatternRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assg",
            	            		lv_assg_4_0, 
            	            		"Assignation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOutPattern765); 

                	newLeafNode(otherlv_5, grammarAccess.getOutPatternAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleOutPattern"


    // $ANTLR start "entryRuleAssignation"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:414:1: entryRuleAssignation returns [EObject current=null] : iv_ruleAssignation= ruleAssignation EOF ;
    public final EObject entryRuleAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignation = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:415:2: (iv_ruleAssignation= ruleAssignation EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:416:2: iv_ruleAssignation= ruleAssignation EOF
            {
             newCompositeNode(grammarAccess.getAssignationRule()); 
            pushFollow(FOLLOW_ruleAssignation_in_entryRuleAssignation801);
            iv_ruleAssignation=ruleAssignation();

            state._fsp--;

             current =iv_ruleAssignation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignation811); 

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
    // $ANTLR end "entryRuleAssignation"


    // $ANTLR start "ruleAssignation"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:423:1: ruleAssignation returns [EObject current=null] : ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleComplexExpression ) ) ) | ( ( (lv_relationship_3_0= ruleAssocRoleName ) ) otherlv_4= '<-' ( (lv_expr_5_0= ruleComplexExpression ) ) ) ) ;
    public final EObject ruleAssignation() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expr_2_0 = null;

        EObject lv_relationship_3_0 = null;

        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:426:28: ( ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleComplexExpression ) ) ) | ( ( (lv_relationship_3_0= ruleAssocRoleName ) ) otherlv_4= '<-' ( (lv_expr_5_0= ruleComplexExpression ) ) ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:427:1: ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleComplexExpression ) ) ) | ( ( (lv_relationship_3_0= ruleAssocRoleName ) ) otherlv_4= '<-' ( (lv_expr_5_0= ruleComplexExpression ) ) ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:427:1: ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleComplexExpression ) ) ) | ( ( (lv_relationship_3_0= ruleAssocRoleName ) ) otherlv_4= '<-' ( (lv_expr_5_0= ruleComplexExpression ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==34) ) {
                    alt6=2;
                }
                else if ( (LA6_1==21) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=32 && LA6_0<=33)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:427:2: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleComplexExpression ) ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:427:2: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleComplexExpression ) ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:427:3: ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleComplexExpression ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:427:3: ( (lv_attribute_0_0= RULE_ID ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:428:1: (lv_attribute_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:428:1: (lv_attribute_0_0= RULE_ID )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:429:3: lv_attribute_0_0= RULE_ID
                    {
                    lv_attribute_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignation854); 

                    			newLeafNode(lv_attribute_0_0, grammarAccess.getAssignationAccess().getAttributeIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssignation871); 

                        	newLeafNode(otherlv_1, grammarAccess.getAssignationAccess().getLessThanSignHyphenMinusKeyword_0_1());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:449:1: ( (lv_expr_2_0= ruleComplexExpression ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:450:1: (lv_expr_2_0= ruleComplexExpression )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:450:1: (lv_expr_2_0= ruleComplexExpression )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:451:3: lv_expr_2_0= ruleComplexExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignationAccess().getExprComplexExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexExpression_in_ruleAssignation892);
                    lv_expr_2_0=ruleComplexExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignationRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"ComplexExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:468:6: ( ( (lv_relationship_3_0= ruleAssocRoleName ) ) otherlv_4= '<-' ( (lv_expr_5_0= ruleComplexExpression ) ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:468:6: ( ( (lv_relationship_3_0= ruleAssocRoleName ) ) otherlv_4= '<-' ( (lv_expr_5_0= ruleComplexExpression ) ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:468:7: ( (lv_relationship_3_0= ruleAssocRoleName ) ) otherlv_4= '<-' ( (lv_expr_5_0= ruleComplexExpression ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:468:7: ( (lv_relationship_3_0= ruleAssocRoleName ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:469:1: (lv_relationship_3_0= ruleAssocRoleName )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:469:1: (lv_relationship_3_0= ruleAssocRoleName )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:470:3: lv_relationship_3_0= ruleAssocRoleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignationAccess().getRelationshipAssocRoleNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssocRoleName_in_ruleAssignation921);
                    lv_relationship_3_0=ruleAssocRoleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignationRule());
                    	        }
                           		set(
                           			current, 
                           			"relationship",
                            		lv_relationship_3_0, 
                            		"AssocRoleName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAssignation933); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssignationAccess().getLessThanSignHyphenMinusKeyword_1_1());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:490:1: ( (lv_expr_5_0= ruleComplexExpression ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:491:1: (lv_expr_5_0= ruleComplexExpression )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:491:1: (lv_expr_5_0= ruleComplexExpression )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:492:3: lv_expr_5_0= ruleComplexExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignationAccess().getExprComplexExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComplexExpression_in_ruleAssignation954);
                    lv_expr_5_0=ruleComplexExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignationRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_5_0, 
                            		"ComplexExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleAssignation"


    // $ANTLR start "entryRuleSimpleExpression"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:516:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:517:2: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:518:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression991);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;

             current =iv_ruleSimpleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpression1001); 

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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:525:1: ruleSimpleExpression returns [EObject current=null] : ( ( (lv__string_0_0= RULE_STRING ) ) | ( (lv__integer_1_0= RULE_INT ) ) | ( (lv__double_2_0= RULE_DOUBLE ) ) | ( (lv__boolean_3_0= RULE_BOOLEAN ) ) | ( (lv_isNull_4_0= 'null' ) ) | ( (lv_navigation_5_0= ruleNavig ) ) | ( (lv_ifSentence_6_0= ruleIfSentence ) ) | ( ( (lv_colectionType_7_0= ruleCollectionType ) ) otherlv_8= '{' ( (lv_elems_9_0= ruleComplexExpression ) )* otherlv_10= '}' ( (lv_nav_11_0= ruleNavigation ) )* ) | ( (lv_resolve_12_0= ruleResolveExp ) ) ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token lv__string_0_0=null;
        Token lv__integer_1_0=null;
        Token lv__double_2_0=null;
        Token lv__boolean_3_0=null;
        Token lv_isNull_4_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_navigation_5_0 = null;

        EObject lv_ifSentence_6_0 = null;

        AntlrDatatypeRuleToken lv_colectionType_7_0 = null;

        EObject lv_elems_9_0 = null;

        EObject lv_nav_11_0 = null;

        EObject lv_resolve_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:528:28: ( ( ( (lv__string_0_0= RULE_STRING ) ) | ( (lv__integer_1_0= RULE_INT ) ) | ( (lv__double_2_0= RULE_DOUBLE ) ) | ( (lv__boolean_3_0= RULE_BOOLEAN ) ) | ( (lv_isNull_4_0= 'null' ) ) | ( (lv_navigation_5_0= ruleNavig ) ) | ( (lv_ifSentence_6_0= ruleIfSentence ) ) | ( ( (lv_colectionType_7_0= ruleCollectionType ) ) otherlv_8= '{' ( (lv_elems_9_0= ruleComplexExpression ) )* otherlv_10= '}' ( (lv_nav_11_0= ruleNavigation ) )* ) | ( (lv_resolve_12_0= ruleResolveExp ) ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:529:1: ( ( (lv__string_0_0= RULE_STRING ) ) | ( (lv__integer_1_0= RULE_INT ) ) | ( (lv__double_2_0= RULE_DOUBLE ) ) | ( (lv__boolean_3_0= RULE_BOOLEAN ) ) | ( (lv_isNull_4_0= 'null' ) ) | ( (lv_navigation_5_0= ruleNavig ) ) | ( (lv_ifSentence_6_0= ruleIfSentence ) ) | ( ( (lv_colectionType_7_0= ruleCollectionType ) ) otherlv_8= '{' ( (lv_elems_9_0= ruleComplexExpression ) )* otherlv_10= '}' ( (lv_nav_11_0= ruleNavigation ) )* ) | ( (lv_resolve_12_0= ruleResolveExp ) ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:529:1: ( ( (lv__string_0_0= RULE_STRING ) ) | ( (lv__integer_1_0= RULE_INT ) ) | ( (lv__double_2_0= RULE_DOUBLE ) ) | ( (lv__boolean_3_0= RULE_BOOLEAN ) ) | ( (lv_isNull_4_0= 'null' ) ) | ( (lv_navigation_5_0= ruleNavig ) ) | ( (lv_ifSentence_6_0= ruleIfSentence ) ) | ( ( (lv_colectionType_7_0= ruleCollectionType ) ) otherlv_8= '{' ( (lv_elems_9_0= ruleComplexExpression ) )* otherlv_10= '}' ( (lv_nav_11_0= ruleNavigation ) )* ) | ( (lv_resolve_12_0= ruleResolveExp ) ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt9=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case RULE_ID:
                {
                alt9=6;
                }
                break;
            case 25:
                {
                alt9=7;
                }
                break;
            case 35:
            case 36:
            case 37:
                {
                alt9=8;
                }
                break;
            case 29:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:529:2: ( (lv__string_0_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:529:2: ( (lv__string_0_0= RULE_STRING ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:530:1: (lv__string_0_0= RULE_STRING )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:530:1: (lv__string_0_0= RULE_STRING )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:531:3: lv__string_0_0= RULE_STRING
                    {
                    lv__string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleExpression1043); 

                    			newLeafNode(lv__string_0_0, grammarAccess.getSimpleExpressionAccess().get_stringSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"_string",
                            		lv__string_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:548:6: ( (lv__integer_1_0= RULE_INT ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:548:6: ( (lv__integer_1_0= RULE_INT ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:549:1: (lv__integer_1_0= RULE_INT )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:549:1: (lv__integer_1_0= RULE_INT )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:550:3: lv__integer_1_0= RULE_INT
                    {
                    lv__integer_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSimpleExpression1071); 

                    			newLeafNode(lv__integer_1_0, grammarAccess.getSimpleExpressionAccess().get_integerINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"_integer",
                            		lv__integer_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:567:6: ( (lv__double_2_0= RULE_DOUBLE ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:567:6: ( (lv__double_2_0= RULE_DOUBLE ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:568:1: (lv__double_2_0= RULE_DOUBLE )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:568:1: (lv__double_2_0= RULE_DOUBLE )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:569:3: lv__double_2_0= RULE_DOUBLE
                    {
                    lv__double_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSimpleExpression1099); 

                    			newLeafNode(lv__double_2_0, grammarAccess.getSimpleExpressionAccess().get_doubleDOUBLETerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"_double",
                            		lv__double_2_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:586:6: ( (lv__boolean_3_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:586:6: ( (lv__boolean_3_0= RULE_BOOLEAN ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:587:1: (lv__boolean_3_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:587:1: (lv__boolean_3_0= RULE_BOOLEAN )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:588:3: lv__boolean_3_0= RULE_BOOLEAN
                    {
                    lv__boolean_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleSimpleExpression1127); 

                    			newLeafNode(lv__boolean_3_0, grammarAccess.getSimpleExpressionAccess().get_booleanBOOLEANTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"_boolean",
                            		lv__boolean_3_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:605:6: ( (lv_isNull_4_0= 'null' ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:605:6: ( (lv_isNull_4_0= 'null' ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:606:1: (lv_isNull_4_0= 'null' )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:606:1: (lv_isNull_4_0= 'null' )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:607:3: lv_isNull_4_0= 'null'
                    {
                    lv_isNull_4_0=(Token)match(input,22,FOLLOW_22_in_ruleSimpleExpression1156); 

                            newLeafNode(lv_isNull_4_0, grammarAccess.getSimpleExpressionAccess().getIsNullNullKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNull", lv_isNull_4_0, "null");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:621:6: ( (lv_navigation_5_0= ruleNavig ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:621:6: ( (lv_navigation_5_0= ruleNavig ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:622:1: (lv_navigation_5_0= ruleNavig )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:622:1: (lv_navigation_5_0= ruleNavig )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:623:3: lv_navigation_5_0= ruleNavig
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getNavigationNavigParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNavig_in_ruleSimpleExpression1196);
                    lv_navigation_5_0=ruleNavig();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"navigation",
                            		lv_navigation_5_0, 
                            		"Navig");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:640:6: ( (lv_ifSentence_6_0= ruleIfSentence ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:640:6: ( (lv_ifSentence_6_0= ruleIfSentence ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:641:1: (lv_ifSentence_6_0= ruleIfSentence )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:641:1: (lv_ifSentence_6_0= ruleIfSentence )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:642:3: lv_ifSentence_6_0= ruleIfSentence
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getIfSentenceIfSentenceParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIfSentence_in_ruleSimpleExpression1223);
                    lv_ifSentence_6_0=ruleIfSentence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"ifSentence",
                            		lv_ifSentence_6_0, 
                            		"IfSentence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:659:6: ( ( (lv_colectionType_7_0= ruleCollectionType ) ) otherlv_8= '{' ( (lv_elems_9_0= ruleComplexExpression ) )* otherlv_10= '}' ( (lv_nav_11_0= ruleNavigation ) )* )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:659:6: ( ( (lv_colectionType_7_0= ruleCollectionType ) ) otherlv_8= '{' ( (lv_elems_9_0= ruleComplexExpression ) )* otherlv_10= '}' ( (lv_nav_11_0= ruleNavigation ) )* )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:659:7: ( (lv_colectionType_7_0= ruleCollectionType ) ) otherlv_8= '{' ( (lv_elems_9_0= ruleComplexExpression ) )* otherlv_10= '}' ( (lv_nav_11_0= ruleNavigation ) )*
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:659:7: ( (lv_colectionType_7_0= ruleCollectionType ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:660:1: (lv_colectionType_7_0= ruleCollectionType )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:660:1: (lv_colectionType_7_0= ruleCollectionType )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:661:3: lv_colectionType_7_0= ruleCollectionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getColectionTypeCollectionTypeParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleSimpleExpression1251);
                    lv_colectionType_7_0=ruleCollectionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"colectionType",
                            		lv_colectionType_7_0, 
                            		"CollectionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleSimpleExpression1263); 

                        	newLeafNode(otherlv_8, grammarAccess.getSimpleExpressionAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:681:1: ( (lv_elems_9_0= ruleComplexExpression ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_BOOLEAN)||LA7_0==22||LA7_0==25||LA7_0==29||LA7_0==31||(LA7_0>=35 && LA7_0<=37)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:682:1: (lv_elems_9_0= ruleComplexExpression )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:682:1: (lv_elems_9_0= ruleComplexExpression )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:683:3: lv_elems_9_0= ruleComplexExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getElemsComplexExpressionParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComplexExpression_in_ruleSimpleExpression1284);
                    	    lv_elems_9_0=ruleComplexExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elems",
                    	            		lv_elems_9_0, 
                    	            		"ComplexExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleSimpleExpression1297); 

                        	newLeafNode(otherlv_10, grammarAccess.getSimpleExpressionAccess().getRightCurlyBracketKeyword_7_3());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:703:1: ( (lv_nav_11_0= ruleNavigation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=23 && LA8_0<=24)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:704:1: (lv_nav_11_0= ruleNavigation )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:704:1: (lv_nav_11_0= ruleNavigation )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:705:3: lv_nav_11_0= ruleNavigation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getNavNavigationParserRuleCall_7_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleNavigation_in_ruleSimpleExpression1318);
                    	    lv_nav_11_0=ruleNavigation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nav",
                    	            		lv_nav_11_0, 
                    	            		"Navigation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:722:6: ( (lv_resolve_12_0= ruleResolveExp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:722:6: ( (lv_resolve_12_0= ruleResolveExp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:723:1: (lv_resolve_12_0= ruleResolveExp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:723:1: (lv_resolve_12_0= ruleResolveExp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:724:3: lv_resolve_12_0= ruleResolveExp
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpressionAccess().getResolveResolveExpParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResolveExp_in_ruleSimpleExpression1347);
                    lv_resolve_12_0=ruleResolveExp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"resolve",
                            		lv_resolve_12_0, 
                            		"ResolveExp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleNavig"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:748:1: entryRuleNavig returns [EObject current=null] : iv_ruleNavig= ruleNavig EOF ;
    public final EObject entryRuleNavig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavig = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:749:2: (iv_ruleNavig= ruleNavig EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:750:2: iv_ruleNavig= ruleNavig EOF
            {
             newCompositeNode(grammarAccess.getNavigRule()); 
            pushFollow(FOLLOW_ruleNavig_in_entryRuleNavig1383);
            iv_ruleNavig=ruleNavig();

            state._fsp--;

             current =iv_ruleNavig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavig1393); 

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
    // $ANTLR end "entryRuleNavig"


    // $ANTLR start "ruleNavig"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:757:1: ruleNavig returns [EObject current=null] : ( ( (lv_attr_0_0= RULE_ID ) ) ( (lv_navigation_1_0= ruleNavigation ) )* ) ;
    public final EObject ruleNavig() throws RecognitionException {
        EObject current = null;

        Token lv_attr_0_0=null;
        EObject lv_navigation_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:760:28: ( ( ( (lv_attr_0_0= RULE_ID ) ) ( (lv_navigation_1_0= ruleNavigation ) )* ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:761:1: ( ( (lv_attr_0_0= RULE_ID ) ) ( (lv_navigation_1_0= ruleNavigation ) )* )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:761:1: ( ( (lv_attr_0_0= RULE_ID ) ) ( (lv_navigation_1_0= ruleNavigation ) )* )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:761:2: ( (lv_attr_0_0= RULE_ID ) ) ( (lv_navigation_1_0= ruleNavigation ) )*
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:761:2: ( (lv_attr_0_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:762:1: (lv_attr_0_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:762:1: (lv_attr_0_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:763:3: lv_attr_0_0= RULE_ID
            {
            lv_attr_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNavig1435); 

            			newLeafNode(lv_attr_0_0, grammarAccess.getNavigAccess().getAttrIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNavigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attr",
                    		lv_attr_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:779:2: ( (lv_navigation_1_0= ruleNavigation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:780:1: (lv_navigation_1_0= ruleNavigation )
            	    {
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:780:1: (lv_navigation_1_0= ruleNavigation )
            	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:781:3: lv_navigation_1_0= ruleNavigation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNavigAccess().getNavigationNavigationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNavigation_in_ruleNavig1461);
            	    lv_navigation_1_0=ruleNavigation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNavigRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"navigation",
            	            		lv_navigation_1_0, 
            	            		"Navigation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleNavig"


    // $ANTLR start "entryRuleNavigation"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:805:1: entryRuleNavigation returns [EObject current=null] : iv_ruleNavigation= ruleNavigation EOF ;
    public final EObject entryRuleNavigation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigation = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:806:2: (iv_ruleNavigation= ruleNavigation EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:807:2: iv_ruleNavigation= ruleNavigation EOF
            {
             newCompositeNode(grammarAccess.getNavigationRule()); 
            pushFollow(FOLLOW_ruleNavigation_in_entryRuleNavigation1498);
            iv_ruleNavigation=ruleNavigation();

            state._fsp--;

             current =iv_ruleNavigation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigation1508); 

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
    // $ANTLR end "entryRuleNavigation"


    // $ANTLR start "ruleNavigation"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:814:1: ruleNavigation returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_attName_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_assocRole_3_0= ruleAssocRoleName ) ) ) | (otherlv_4= '.' ( (lv_opType1_5_0= ruleOCLOperationType1 ) ) ) | (otherlv_6= '->' ( (lv_opType2_7_0= ruleOCLOperationType2 ) ) ) ) ;
    public final EObject ruleNavigation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_assocRole_3_0 = null;

        EObject lv_opType1_5_0 = null;

        EObject lv_opType2_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:817:28: ( ( (otherlv_0= '.' ( (lv_attName_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_assocRole_3_0= ruleAssocRoleName ) ) ) | (otherlv_4= '.' ( (lv_opType1_5_0= ruleOCLOperationType1 ) ) ) | (otherlv_6= '->' ( (lv_opType2_7_0= ruleOCLOperationType2 ) ) ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:818:1: ( (otherlv_0= '.' ( (lv_attName_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_assocRole_3_0= ruleAssocRoleName ) ) ) | (otherlv_4= '.' ( (lv_opType1_5_0= ruleOCLOperationType1 ) ) ) | (otherlv_6= '->' ( (lv_opType2_7_0= ruleOCLOperationType2 ) ) ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:818:1: ( (otherlv_0= '.' ( (lv_attName_1_0= RULE_ID ) ) ) | (otherlv_2= '.' ( (lv_assocRole_3_0= ruleAssocRoleName ) ) ) | (otherlv_4= '.' ( (lv_opType1_5_0= ruleOCLOperationType1 ) ) ) | (otherlv_6= '->' ( (lv_opType2_7_0= ruleOCLOperationType2 ) ) ) )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                switch ( input.LA(2) ) {
                case 54:
                case 60:
                case 61:
                case 62:
                    {
                    alt11=3;
                    }
                    break;
                case 32:
                case 33:
                    {
                    alt11=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==EOF||(LA11_5>=RULE_ID && LA11_5<=RULE_BOOLEAN)||LA11_5==17||LA11_5==19||(LA11_5>=22 && LA11_5<=33)||(LA11_5>=35 && LA11_5<=49)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_5==34) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0==24) ) {
                alt11=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:818:2: (otherlv_0= '.' ( (lv_attName_1_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:818:2: (otherlv_0= '.' ( (lv_attName_1_0= RULE_ID ) ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:818:4: otherlv_0= '.' ( (lv_attName_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleNavigation1546); 

                        	newLeafNode(otherlv_0, grammarAccess.getNavigationAccess().getFullStopKeyword_0_0());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:822:1: ( (lv_attName_1_0= RULE_ID ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:823:1: (lv_attName_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:823:1: (lv_attName_1_0= RULE_ID )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:824:3: lv_attName_1_0= RULE_ID
                    {
                    lv_attName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNavigation1563); 

                    			newLeafNode(lv_attName_1_0, grammarAccess.getNavigationAccess().getAttNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNavigationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attName",
                            		lv_attName_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:841:6: (otherlv_2= '.' ( (lv_assocRole_3_0= ruleAssocRoleName ) ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:841:6: (otherlv_2= '.' ( (lv_assocRole_3_0= ruleAssocRoleName ) ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:841:8: otherlv_2= '.' ( (lv_assocRole_3_0= ruleAssocRoleName ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleNavigation1588); 

                        	newLeafNode(otherlv_2, grammarAccess.getNavigationAccess().getFullStopKeyword_1_0());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:845:1: ( (lv_assocRole_3_0= ruleAssocRoleName ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:846:1: (lv_assocRole_3_0= ruleAssocRoleName )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:846:1: (lv_assocRole_3_0= ruleAssocRoleName )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:847:3: lv_assocRole_3_0= ruleAssocRoleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getNavigationAccess().getAssocRoleAssocRoleNameParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssocRoleName_in_ruleNavigation1609);
                    lv_assocRole_3_0=ruleAssocRoleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNavigationRule());
                    	        }
                           		set(
                           			current, 
                           			"assocRole",
                            		lv_assocRole_3_0, 
                            		"AssocRoleName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:864:6: (otherlv_4= '.' ( (lv_opType1_5_0= ruleOCLOperationType1 ) ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:864:6: (otherlv_4= '.' ( (lv_opType1_5_0= ruleOCLOperationType1 ) ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:864:8: otherlv_4= '.' ( (lv_opType1_5_0= ruleOCLOperationType1 ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleNavigation1629); 

                        	newLeafNode(otherlv_4, grammarAccess.getNavigationAccess().getFullStopKeyword_2_0());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:868:1: ( (lv_opType1_5_0= ruleOCLOperationType1 ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:869:1: (lv_opType1_5_0= ruleOCLOperationType1 )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:869:1: (lv_opType1_5_0= ruleOCLOperationType1 )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:870:3: lv_opType1_5_0= ruleOCLOperationType1
                    {
                     
                    	        newCompositeNode(grammarAccess.getNavigationAccess().getOpType1OCLOperationType1ParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOCLOperationType1_in_ruleNavigation1650);
                    lv_opType1_5_0=ruleOCLOperationType1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNavigationRule());
                    	        }
                           		set(
                           			current, 
                           			"opType1",
                            		lv_opType1_5_0, 
                            		"OCLOperationType1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:887:6: (otherlv_6= '->' ( (lv_opType2_7_0= ruleOCLOperationType2 ) ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:887:6: (otherlv_6= '->' ( (lv_opType2_7_0= ruleOCLOperationType2 ) ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:887:8: otherlv_6= '->' ( (lv_opType2_7_0= ruleOCLOperationType2 ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleNavigation1670); 

                        	newLeafNode(otherlv_6, grammarAccess.getNavigationAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:891:1: ( (lv_opType2_7_0= ruleOCLOperationType2 ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:892:1: (lv_opType2_7_0= ruleOCLOperationType2 )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:892:1: (lv_opType2_7_0= ruleOCLOperationType2 )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:893:3: lv_opType2_7_0= ruleOCLOperationType2
                    {
                     
                    	        newCompositeNode(grammarAccess.getNavigationAccess().getOpType2OCLOperationType2ParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOCLOperationType2_in_ruleNavigation1691);
                    lv_opType2_7_0=ruleOCLOperationType2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNavigationRule());
                    	        }
                           		set(
                           			current, 
                           			"opType2",
                            		lv_opType2_7_0, 
                            		"OCLOperationType2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleNavigation"


    // $ANTLR start "entryRuleIfSentence"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:917:1: entryRuleIfSentence returns [EObject current=null] : iv_ruleIfSentence= ruleIfSentence EOF ;
    public final EObject entryRuleIfSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSentence = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:918:2: (iv_ruleIfSentence= ruleIfSentence EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:919:2: iv_ruleIfSentence= ruleIfSentence EOF
            {
             newCompositeNode(grammarAccess.getIfSentenceRule()); 
            pushFollow(FOLLOW_ruleIfSentence_in_entryRuleIfSentence1728);
            iv_ruleIfSentence=ruleIfSentence();

            state._fsp--;

             current =iv_ruleIfSentence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSentence1738); 

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
    // $ANTLR end "entryRuleIfSentence"


    // $ANTLR start "ruleIfSentence"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:926:1: ruleIfSentence returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleComplexExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleComplexExpression ) ) otherlv_4= 'else' ( (lv_elsebody_5_0= ruleComplexExpression ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_1_0 = null;

        EObject lv_body_3_0 = null;

        EObject lv_elsebody_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:929:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleComplexExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleComplexExpression ) ) otherlv_4= 'else' ( (lv_elsebody_5_0= ruleComplexExpression ) ) otherlv_6= 'endif' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:930:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleComplexExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleComplexExpression ) ) otherlv_4= 'else' ( (lv_elsebody_5_0= ruleComplexExpression ) ) otherlv_6= 'endif' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:930:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleComplexExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleComplexExpression ) ) otherlv_4= 'else' ( (lv_elsebody_5_0= ruleComplexExpression ) ) otherlv_6= 'endif' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:930:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleComplexExpression ) ) otherlv_2= 'then' ( (lv_body_3_0= ruleComplexExpression ) ) otherlv_4= 'else' ( (lv_elsebody_5_0= ruleComplexExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleIfSentence1775); 

                	newLeafNode(otherlv_0, grammarAccess.getIfSentenceAccess().getIfKeyword_0());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:934:1: ( (lv_cond_1_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:935:1: (lv_cond_1_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:935:1: (lv_cond_1_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:936:3: lv_cond_1_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfSentenceAccess().getCondComplexExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleIfSentence1796);
            lv_cond_1_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_1_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleIfSentence1808); 

                	newLeafNode(otherlv_2, grammarAccess.getIfSentenceAccess().getThenKeyword_2());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:956:1: ( (lv_body_3_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:957:1: (lv_body_3_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:957:1: (lv_body_3_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:958:3: lv_body_3_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfSentenceAccess().getBodyComplexExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleIfSentence1829);
            lv_body_3_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleIfSentence1841); 

                	newLeafNode(otherlv_4, grammarAccess.getIfSentenceAccess().getElseKeyword_4());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:978:1: ( (lv_elsebody_5_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:979:1: (lv_elsebody_5_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:979:1: (lv_elsebody_5_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:980:3: lv_elsebody_5_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfSentenceAccess().getElsebodyComplexExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleIfSentence1862);
            lv_elsebody_5_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfSentenceRule());
            	        }
                   		set(
                   			current, 
                   			"elsebody",
                    		lv_elsebody_5_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleIfSentence1874); 

                	newLeafNode(otherlv_6, grammarAccess.getIfSentenceAccess().getEndifKeyword_6());
                

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
    // $ANTLR end "ruleIfSentence"


    // $ANTLR start "entryRuleResolveExp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1008:1: entryRuleResolveExp returns [EObject current=null] : iv_ruleResolveExp= ruleResolveExp EOF ;
    public final EObject entryRuleResolveExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResolveExp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1009:2: (iv_ruleResolveExp= ruleResolveExp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1010:2: iv_ruleResolveExp= ruleResolveExp EOF
            {
             newCompositeNode(grammarAccess.getResolveExpRule()); 
            pushFollow(FOLLOW_ruleResolveExp_in_entryRuleResolveExp1910);
            iv_ruleResolveExp=ruleResolveExp();

            state._fsp--;

             current =iv_ruleResolveExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResolveExp1920); 

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
    // $ANTLR end "entryRuleResolveExp"


    // $ANTLR start "ruleResolveExp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1017:1: ruleResolveExp returns [EObject current=null] : (otherlv_0= 'resolve' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) (otherlv_3= ',' ( (lv_position_4_0= RULE_INT ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleResolveExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_position_4_0=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1020:28: ( (otherlv_0= 'resolve' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) (otherlv_3= ',' ( (lv_position_4_0= RULE_INT ) ) )? otherlv_5= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1021:1: (otherlv_0= 'resolve' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) (otherlv_3= ',' ( (lv_position_4_0= RULE_INT ) ) )? otherlv_5= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1021:1: (otherlv_0= 'resolve' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) (otherlv_3= ',' ( (lv_position_4_0= RULE_INT ) ) )? otherlv_5= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1021:3: otherlv_0= 'resolve' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) (otherlv_3= ',' ( (lv_position_4_0= RULE_INT ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleResolveExp1957); 

                	newLeafNode(otherlv_0, grammarAccess.getResolveExpAccess().getResolveKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleResolveExp1969); 

                	newLeafNode(otherlv_1, grammarAccess.getResolveExpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1029:1: ( (lv_exp_2_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1030:1: (lv_exp_2_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1030:1: (lv_exp_2_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1031:3: lv_exp_2_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getResolveExpAccess().getExpComplexExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleResolveExp1990);
            lv_exp_2_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResolveExpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1047:2: (otherlv_3= ',' ( (lv_position_4_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1047:4: otherlv_3= ',' ( (lv_position_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleResolveExp2003); 

                        	newLeafNode(otherlv_3, grammarAccess.getResolveExpAccess().getCommaKeyword_3_0());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1051:1: ( (lv_position_4_0= RULE_INT ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1052:1: (lv_position_4_0= RULE_INT )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1052:1: (lv_position_4_0= RULE_INT )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1053:3: lv_position_4_0= RULE_INT
                    {
                    lv_position_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResolveExp2020); 

                    			newLeafNode(lv_position_4_0, grammarAccess.getResolveExpAccess().getPositionINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResolveExpRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"position",
                            		lv_position_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleResolveExp2039); 

                	newLeafNode(otherlv_5, grammarAccess.getResolveExpAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleResolveExp"


    // $ANTLR start "entryRuleComplexExpression"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1081:1: entryRuleComplexExpression returns [EObject current=null] : iv_ruleComplexExpression= ruleComplexExpression EOF ;
    public final EObject entryRuleComplexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexExpression = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1082:2: (iv_ruleComplexExpression= ruleComplexExpression EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1083:2: iv_ruleComplexExpression= ruleComplexExpression EOF
            {
             newCompositeNode(grammarAccess.getComplexExpressionRule()); 
            pushFollow(FOLLOW_ruleComplexExpression_in_entryRuleComplexExpression2075);
            iv_ruleComplexExpression=ruleComplexExpression();

            state._fsp--;

             current =iv_ruleComplexExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexExpression2085); 

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
    // $ANTLR end "entryRuleComplexExpression"


    // $ANTLR start "ruleComplexExpression"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1090:1: ruleComplexExpression returns [EObject current=null] : ( ( ( (lv_prefixNot_0_0= 'not' ) ) otherlv_1= '(' ( (lv_left_2_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )* otherlv_5= ')' ) | ( ( (lv_left_6_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )* ) ) ;
    public final EObject ruleComplexExpression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixNot_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_left_2_0 = null;

        AntlrDatatypeRuleToken lv_infixOp_3_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_left_6_0 = null;

        AntlrDatatypeRuleToken lv_infixOp_7_0 = null;

        EObject lv_right_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1093:28: ( ( ( ( (lv_prefixNot_0_0= 'not' ) ) otherlv_1= '(' ( (lv_left_2_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )* otherlv_5= ')' ) | ( ( (lv_left_6_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )* ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1094:1: ( ( ( (lv_prefixNot_0_0= 'not' ) ) otherlv_1= '(' ( (lv_left_2_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )* otherlv_5= ')' ) | ( ( (lv_left_6_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )* ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1094:1: ( ( ( (lv_prefixNot_0_0= 'not' ) ) otherlv_1= '(' ( (lv_left_2_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )* otherlv_5= ')' ) | ( ( (lv_left_6_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )* ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_BOOLEAN)||LA15_0==22||LA15_0==25||LA15_0==29||(LA15_0>=35 && LA15_0<=37)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1094:2: ( ( (lv_prefixNot_0_0= 'not' ) ) otherlv_1= '(' ( (lv_left_2_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )* otherlv_5= ')' )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1094:2: ( ( (lv_prefixNot_0_0= 'not' ) ) otherlv_1= '(' ( (lv_left_2_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )* otherlv_5= ')' )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1094:3: ( (lv_prefixNot_0_0= 'not' ) ) otherlv_1= '(' ( (lv_left_2_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )* otherlv_5= ')'
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1094:3: ( (lv_prefixNot_0_0= 'not' ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1095:1: (lv_prefixNot_0_0= 'not' )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1095:1: (lv_prefixNot_0_0= 'not' )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1096:3: lv_prefixNot_0_0= 'not'
                    {
                    lv_prefixNot_0_0=(Token)match(input,31,FOLLOW_31_in_ruleComplexExpression2129); 

                            newLeafNode(lv_prefixNot_0_0, grammarAccess.getComplexExpressionAccess().getPrefixNotNotKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComplexExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "prefixNot", lv_prefixNot_0_0, "not");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleComplexExpression2154); 

                        	newLeafNode(otherlv_1, grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1113:1: ( (lv_left_2_0= ruleSimpleExpression ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1114:1: (lv_left_2_0= ruleSimpleExpression )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1114:1: (lv_left_2_0= ruleSimpleExpression )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1115:3: lv_left_2_0= ruleSimpleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexExpressionAccess().getLeftSimpleExpressionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2175);
                    lv_left_2_0=ruleSimpleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_2_0, 
                            		"SimpleExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1131:2: ( ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=38 && LA13_0<=49)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1131:3: ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_4_0= ruleSimpleExpression ) )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1131:3: ( (lv_infixOp_3_0= ruleInfixPrimitiveOperator ) )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1132:1: (lv_infixOp_3_0= ruleInfixPrimitiveOperator )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1132:1: (lv_infixOp_3_0= ruleInfixPrimitiveOperator )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1133:3: lv_infixOp_3_0= ruleInfixPrimitiveOperator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComplexExpressionAccess().getInfixOpInfixPrimitiveOperatorParserRuleCall_0_3_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInfixPrimitiveOperator_in_ruleComplexExpression2197);
                    	    lv_infixOp_3_0=ruleInfixPrimitiveOperator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"infixOp",
                    	            		lv_infixOp_3_0, 
                    	            		"InfixPrimitiveOperator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1149:2: ( (lv_right_4_0= ruleSimpleExpression ) )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1150:1: (lv_right_4_0= ruleSimpleExpression )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1150:1: (lv_right_4_0= ruleSimpleExpression )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1151:3: lv_right_4_0= ruleSimpleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComplexExpressionAccess().getRightSimpleExpressionParserRuleCall_0_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2218);
                    	    lv_right_4_0=ruleSimpleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"right",
                    	            		lv_right_4_0, 
                    	            		"SimpleExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleComplexExpression2232); 

                        	newLeafNode(otherlv_5, grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1172:6: ( ( (lv_left_6_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )* )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1172:6: ( ( (lv_left_6_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )* )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1172:7: ( (lv_left_6_0= ruleSimpleExpression ) ) ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )*
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1172:7: ( (lv_left_6_0= ruleSimpleExpression ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1173:1: (lv_left_6_0= ruleSimpleExpression )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1173:1: (lv_left_6_0= ruleSimpleExpression )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1174:3: lv_left_6_0= ruleSimpleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComplexExpressionAccess().getLeftSimpleExpressionParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2261);
                    lv_left_6_0=ruleSimpleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_6_0, 
                            		"SimpleExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1190:2: ( ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=38 && LA14_0<=49)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1190:3: ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) ) ( (lv_right_8_0= ruleSimpleExpression ) )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1190:3: ( (lv_infixOp_7_0= ruleInfixPrimitiveOperator ) )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1191:1: (lv_infixOp_7_0= ruleInfixPrimitiveOperator )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1191:1: (lv_infixOp_7_0= ruleInfixPrimitiveOperator )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1192:3: lv_infixOp_7_0= ruleInfixPrimitiveOperator
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComplexExpressionAccess().getInfixOpInfixPrimitiveOperatorParserRuleCall_1_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInfixPrimitiveOperator_in_ruleComplexExpression2283);
                    	    lv_infixOp_7_0=ruleInfixPrimitiveOperator();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"infixOp",
                    	            		lv_infixOp_7_0, 
                    	            		"InfixPrimitiveOperator");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1208:2: ( (lv_right_8_0= ruleSimpleExpression ) )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1209:1: (lv_right_8_0= ruleSimpleExpression )
                    	    {
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1209:1: (lv_right_8_0= ruleSimpleExpression )
                    	    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1210:3: lv_right_8_0= ruleSimpleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComplexExpressionAccess().getRightSimpleExpressionParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2304);
                    	    lv_right_8_0=ruleSimpleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"right",
                    	            		lv_right_8_0, 
                    	            		"SimpleExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


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
    // $ANTLR end "ruleComplexExpression"


    // $ANTLR start "entryRuleAssocRoleName"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1234:1: entryRuleAssocRoleName returns [EObject current=null] : iv_ruleAssocRoleName= ruleAssocRoleName EOF ;
    public final EObject entryRuleAssocRoleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssocRoleName = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1235:2: (iv_ruleAssocRoleName= ruleAssocRoleName EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1236:2: iv_ruleAssocRoleName= ruleAssocRoleName EOF
            {
             newCompositeNode(grammarAccess.getAssocRoleNameRule()); 
            pushFollow(FOLLOW_ruleAssocRoleName_in_entryRuleAssocRoleName2343);
            iv_ruleAssocRoleName=ruleAssocRoleName();

            state._fsp--;

             current =iv_ruleAssocRoleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssocRoleName2353); 

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
    // $ANTLR end "entryRuleAssocRoleName"


    // $ANTLR start "ruleAssocRoleName"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1243:1: ruleAssocRoleName returns [EObject current=null] : ( ( (lv_children_0_0= 'children()' ) ) | ( (lv_parent_1_0= 'parent()' ) ) | ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' ) ) ;
    public final EObject ruleAssocRoleName() throws RecognitionException {
        EObject current = null;

        Token lv_children_0_0=null;
        Token lv_parent_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1246:28: ( ( ( (lv_children_0_0= 'children()' ) ) | ( (lv_parent_1_0= 'parent()' ) ) | ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1247:1: ( ( (lv_children_0_0= 'children()' ) ) | ( (lv_parent_1_0= 'parent()' ) ) | ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1247:1: ( ( (lv_children_0_0= 'children()' ) ) | ( (lv_parent_1_0= 'parent()' ) ) | ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1247:2: ( (lv_children_0_0= 'children()' ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1247:2: ( (lv_children_0_0= 'children()' ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1248:1: (lv_children_0_0= 'children()' )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1248:1: (lv_children_0_0= 'children()' )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1249:3: lv_children_0_0= 'children()'
                    {
                    lv_children_0_0=(Token)match(input,32,FOLLOW_32_in_ruleAssocRoleName2396); 

                            newLeafNode(lv_children_0_0, grammarAccess.getAssocRoleNameAccess().getChildrenChildrenKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssocRoleNameRule());
                    	        }
                           		setWithLastConsumed(current, "children", lv_children_0_0, "children()");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1263:6: ( (lv_parent_1_0= 'parent()' ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1263:6: ( (lv_parent_1_0= 'parent()' ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1264:1: (lv_parent_1_0= 'parent()' )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1264:1: (lv_parent_1_0= 'parent()' )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1265:3: lv_parent_1_0= 'parent()'
                    {
                    lv_parent_1_0=(Token)match(input,33,FOLLOW_33_in_ruleAssocRoleName2433); 

                            newLeafNode(lv_parent_1_0, grammarAccess.getAssocRoleNameAccess().getParentParentKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssocRoleNameRule());
                    	        }
                           		setWithLastConsumed(current, "parent", lv_parent_1_0, "parent()");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1279:6: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1279:6: ( ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1279:7: ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()'
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1279:7: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1280:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1280:1: (lv_name_2_0= RULE_ID )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1281:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssocRoleName2470); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getAssocRoleNameAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssocRoleNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleAssocRoleName2487); 

                        	newLeafNode(otherlv_3, grammarAccess.getAssocRoleNameAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                        

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
    // $ANTLR end "ruleAssocRoleName"


    // $ANTLR start "entryRuleCollectionType"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1309:1: entryRuleCollectionType returns [String current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final String entryRuleCollectionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionType = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1310:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1311:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType2525);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType2536); 

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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1318:1: ruleCollectionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Sequence' | kw= 'Bag' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1321:28: ( (kw= 'Set' | kw= 'Sequence' | kw= 'Bag' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1322:1: (kw= 'Set' | kw= 'Sequence' | kw= 'Bag' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1322:1: (kw= 'Set' | kw= 'Sequence' | kw= 'Bag' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1323:2: kw= 'Set'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCollectionType2574); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionTypeAccess().getSetKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1330:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCollectionType2593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionTypeAccess().getSequenceKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1337:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleCollectionType2612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCollectionTypeAccess().getBagKeyword_2()); 
                        

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleOCLOperationType1"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1350:1: entryRuleOCLOperationType1 returns [EObject current=null] : iv_ruleOCLOperationType1= ruleOCLOperationType1 EOF ;
    public final EObject entryRuleOCLOperationType1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLOperationType1 = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1351:2: (iv_ruleOCLOperationType1= ruleOCLOperationType1 EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1352:2: iv_ruleOCLOperationType1= ruleOCLOperationType1 EOF
            {
             newCompositeNode(grammarAccess.getOCLOperationType1Rule()); 
            pushFollow(FOLLOW_ruleOCLOperationType1_in_entryRuleOCLOperationType12652);
            iv_ruleOCLOperationType1=ruleOCLOperationType1();

            state._fsp--;

             current =iv_ruleOCLOperationType1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOCLOperationType12662); 

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
    // $ANTLR end "entryRuleOCLOperationType1"


    // $ANTLR start "ruleOCLOperationType1"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1359:1: ruleOCLOperationType1 returns [EObject current=null] : ( ( (lv_allIns_0_0= ruleAllInstancesOp ) ) | ( (lv_isTypeOf_1_0= ruleIsTypeOfOp ) ) | ( (lv_toString_2_0= ruleToStringOp ) ) | ( (lv_concatenate_3_0= ruleConcatOp ) ) ) ;
    public final EObject ruleOCLOperationType1() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_allIns_0_0 = null;

        EObject lv_isTypeOf_1_0 = null;

        AntlrDatatypeRuleToken lv_toString_2_0 = null;

        EObject lv_concatenate_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1362:28: ( ( ( (lv_allIns_0_0= ruleAllInstancesOp ) ) | ( (lv_isTypeOf_1_0= ruleIsTypeOfOp ) ) | ( (lv_toString_2_0= ruleToStringOp ) ) | ( (lv_concatenate_3_0= ruleConcatOp ) ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1363:1: ( ( (lv_allIns_0_0= ruleAllInstancesOp ) ) | ( (lv_isTypeOf_1_0= ruleIsTypeOfOp ) ) | ( (lv_toString_2_0= ruleToStringOp ) ) | ( (lv_concatenate_3_0= ruleConcatOp ) ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1363:1: ( ( (lv_allIns_0_0= ruleAllInstancesOp ) ) | ( (lv_isTypeOf_1_0= ruleIsTypeOfOp ) ) | ( (lv_toString_2_0= ruleToStringOp ) ) | ( (lv_concatenate_3_0= ruleConcatOp ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt18=1;
                }
                break;
            case 60:
                {
                alt18=2;
                }
                break;
            case 61:
                {
                alt18=3;
                }
                break;
            case 62:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1363:2: ( (lv_allIns_0_0= ruleAllInstancesOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1363:2: ( (lv_allIns_0_0= ruleAllInstancesOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1364:1: (lv_allIns_0_0= ruleAllInstancesOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1364:1: (lv_allIns_0_0= ruleAllInstancesOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1365:3: lv_allIns_0_0= ruleAllInstancesOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType1Access().getAllInsAllInstancesOpParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAllInstancesOp_in_ruleOCLOperationType12708);
                    lv_allIns_0_0=ruleAllInstancesOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType1Rule());
                    	        }
                           		set(
                           			current, 
                           			"allIns",
                            		lv_allIns_0_0, 
                            		"AllInstancesOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1382:6: ( (lv_isTypeOf_1_0= ruleIsTypeOfOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1382:6: ( (lv_isTypeOf_1_0= ruleIsTypeOfOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1383:1: (lv_isTypeOf_1_0= ruleIsTypeOfOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1383:1: (lv_isTypeOf_1_0= ruleIsTypeOfOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1384:3: lv_isTypeOf_1_0= ruleIsTypeOfOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType1Access().getIsTypeOfIsTypeOfOpParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIsTypeOfOp_in_ruleOCLOperationType12735);
                    lv_isTypeOf_1_0=ruleIsTypeOfOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType1Rule());
                    	        }
                           		set(
                           			current, 
                           			"isTypeOf",
                            		lv_isTypeOf_1_0, 
                            		"IsTypeOfOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1401:6: ( (lv_toString_2_0= ruleToStringOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1401:6: ( (lv_toString_2_0= ruleToStringOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1402:1: (lv_toString_2_0= ruleToStringOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1402:1: (lv_toString_2_0= ruleToStringOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1403:3: lv_toString_2_0= ruleToStringOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType1Access().getToStringToStringOpParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleToStringOp_in_ruleOCLOperationType12762);
                    lv_toString_2_0=ruleToStringOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType1Rule());
                    	        }
                           		set(
                           			current, 
                           			"toString",
                            		lv_toString_2_0, 
                            		"ToStringOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1420:6: ( (lv_concatenate_3_0= ruleConcatOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1420:6: ( (lv_concatenate_3_0= ruleConcatOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1421:1: (lv_concatenate_3_0= ruleConcatOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1421:1: (lv_concatenate_3_0= ruleConcatOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1422:3: lv_concatenate_3_0= ruleConcatOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType1Access().getConcatenateConcatOpParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcatOp_in_ruleOCLOperationType12789);
                    lv_concatenate_3_0=ruleConcatOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType1Rule());
                    	        }
                           		set(
                           			current, 
                           			"concatenate",
                            		lv_concatenate_3_0, 
                            		"ConcatOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleOCLOperationType1"


    // $ANTLR start "entryRuleOCLOperationType2"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1446:1: entryRuleOCLOperationType2 returns [EObject current=null] : iv_ruleOCLOperationType2= ruleOCLOperationType2 EOF ;
    public final EObject entryRuleOCLOperationType2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOCLOperationType2 = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1447:2: (iv_ruleOCLOperationType2= ruleOCLOperationType2 EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1448:2: iv_ruleOCLOperationType2= ruleOCLOperationType2 EOF
            {
             newCompositeNode(grammarAccess.getOCLOperationType2Rule()); 
            pushFollow(FOLLOW_ruleOCLOperationType2_in_entryRuleOCLOperationType22825);
            iv_ruleOCLOperationType2=ruleOCLOperationType2();

            state._fsp--;

             current =iv_ruleOCLOperationType2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOCLOperationType22835); 

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
    // $ANTLR end "entryRuleOCLOperationType2"


    // $ANTLR start "ruleOCLOperationType2"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1455:1: ruleOCLOperationType2 returns [EObject current=null] : ( ( (lv_size_0_0= ruleSizeOp ) ) | ( (lv_forall_1_0= ruleForAllOp ) ) | ( (lv_exists_2_0= ruleExistsOp ) ) | ( (lv_select_3_0= ruleSelectOp ) ) | ( (lv_collect_4_0= ruleCollectOp ) ) | ( (lv_first_5_0= ruleFirstOp ) ) | ( (lv_last_6_0= ruleLastOp ) ) | ( (lv_indexOf_7_0= ruleIndexOfOp ) ) | ( (lv_union_8_0= ruleUnionOp ) ) | ( (lv_intersection_9_0= ruleIntersectionOp ) ) | ( (lv_isUndefined_10_0= ruleIsUndefinedOp ) ) ) ;
    public final EObject ruleOCLOperationType2() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_size_0_0 = null;

        EObject lv_forall_1_0 = null;

        EObject lv_exists_2_0 = null;

        EObject lv_select_3_0 = null;

        EObject lv_collect_4_0 = null;

        AntlrDatatypeRuleToken lv_first_5_0 = null;

        AntlrDatatypeRuleToken lv_last_6_0 = null;

        EObject lv_indexOf_7_0 = null;

        EObject lv_union_8_0 = null;

        EObject lv_intersection_9_0 = null;

        AntlrDatatypeRuleToken lv_isUndefined_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1458:28: ( ( ( (lv_size_0_0= ruleSizeOp ) ) | ( (lv_forall_1_0= ruleForAllOp ) ) | ( (lv_exists_2_0= ruleExistsOp ) ) | ( (lv_select_3_0= ruleSelectOp ) ) | ( (lv_collect_4_0= ruleCollectOp ) ) | ( (lv_first_5_0= ruleFirstOp ) ) | ( (lv_last_6_0= ruleLastOp ) ) | ( (lv_indexOf_7_0= ruleIndexOfOp ) ) | ( (lv_union_8_0= ruleUnionOp ) ) | ( (lv_intersection_9_0= ruleIntersectionOp ) ) | ( (lv_isUndefined_10_0= ruleIsUndefinedOp ) ) ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1459:1: ( ( (lv_size_0_0= ruleSizeOp ) ) | ( (lv_forall_1_0= ruleForAllOp ) ) | ( (lv_exists_2_0= ruleExistsOp ) ) | ( (lv_select_3_0= ruleSelectOp ) ) | ( (lv_collect_4_0= ruleCollectOp ) ) | ( (lv_first_5_0= ruleFirstOp ) ) | ( (lv_last_6_0= ruleLastOp ) ) | ( (lv_indexOf_7_0= ruleIndexOfOp ) ) | ( (lv_union_8_0= ruleUnionOp ) ) | ( (lv_intersection_9_0= ruleIntersectionOp ) ) | ( (lv_isUndefined_10_0= ruleIsUndefinedOp ) ) )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1459:1: ( ( (lv_size_0_0= ruleSizeOp ) ) | ( (lv_forall_1_0= ruleForAllOp ) ) | ( (lv_exists_2_0= ruleExistsOp ) ) | ( (lv_select_3_0= ruleSelectOp ) ) | ( (lv_collect_4_0= ruleCollectOp ) ) | ( (lv_first_5_0= ruleFirstOp ) ) | ( (lv_last_6_0= ruleLastOp ) ) | ( (lv_indexOf_7_0= ruleIndexOfOp ) ) | ( (lv_union_8_0= ruleUnionOp ) ) | ( (lv_intersection_9_0= ruleIntersectionOp ) ) | ( (lv_isUndefined_10_0= ruleIsUndefinedOp ) ) )
            int alt19=11;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt19=1;
                }
                break;
            case 55:
                {
                alt19=2;
                }
                break;
            case 57:
                {
                alt19=3;
                }
                break;
            case 58:
                {
                alt19=4;
                }
                break;
            case 59:
                {
                alt19=5;
                }
                break;
            case 51:
                {
                alt19=6;
                }
                break;
            case 52:
                {
                alt19=7;
                }
                break;
            case 53:
                {
                alt19=8;
                }
                break;
            case 63:
                {
                alt19=9;
                }
                break;
            case 64:
                {
                alt19=10;
                }
                break;
            case 65:
                {
                alt19=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1459:2: ( (lv_size_0_0= ruleSizeOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1459:2: ( (lv_size_0_0= ruleSizeOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1460:1: (lv_size_0_0= ruleSizeOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1460:1: (lv_size_0_0= ruleSizeOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1461:3: lv_size_0_0= ruleSizeOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getSizeSizeOpParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSizeOp_in_ruleOCLOperationType22881);
                    lv_size_0_0=ruleSizeOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"size",
                            		lv_size_0_0, 
                            		"SizeOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1478:6: ( (lv_forall_1_0= ruleForAllOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1478:6: ( (lv_forall_1_0= ruleForAllOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1479:1: (lv_forall_1_0= ruleForAllOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1479:1: (lv_forall_1_0= ruleForAllOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1480:3: lv_forall_1_0= ruleForAllOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getForallForAllOpParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForAllOp_in_ruleOCLOperationType22908);
                    lv_forall_1_0=ruleForAllOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"forall",
                            		lv_forall_1_0, 
                            		"ForAllOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1497:6: ( (lv_exists_2_0= ruleExistsOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1497:6: ( (lv_exists_2_0= ruleExistsOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1498:1: (lv_exists_2_0= ruleExistsOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1498:1: (lv_exists_2_0= ruleExistsOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1499:3: lv_exists_2_0= ruleExistsOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getExistsExistsOpParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExistsOp_in_ruleOCLOperationType22935);
                    lv_exists_2_0=ruleExistsOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"exists",
                            		lv_exists_2_0, 
                            		"ExistsOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1516:6: ( (lv_select_3_0= ruleSelectOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1516:6: ( (lv_select_3_0= ruleSelectOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1517:1: (lv_select_3_0= ruleSelectOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1517:1: (lv_select_3_0= ruleSelectOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1518:3: lv_select_3_0= ruleSelectOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getSelectSelectOpParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectOp_in_ruleOCLOperationType22962);
                    lv_select_3_0=ruleSelectOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"select",
                            		lv_select_3_0, 
                            		"SelectOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1535:6: ( (lv_collect_4_0= ruleCollectOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1535:6: ( (lv_collect_4_0= ruleCollectOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1536:1: (lv_collect_4_0= ruleCollectOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1536:1: (lv_collect_4_0= ruleCollectOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1537:3: lv_collect_4_0= ruleCollectOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getCollectCollectOpParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectOp_in_ruleOCLOperationType22989);
                    lv_collect_4_0=ruleCollectOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"collect",
                            		lv_collect_4_0, 
                            		"CollectOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1554:6: ( (lv_first_5_0= ruleFirstOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1554:6: ( (lv_first_5_0= ruleFirstOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1555:1: (lv_first_5_0= ruleFirstOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1555:1: (lv_first_5_0= ruleFirstOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1556:3: lv_first_5_0= ruleFirstOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getFirstFirstOpParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFirstOp_in_ruleOCLOperationType23016);
                    lv_first_5_0=ruleFirstOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"first",
                            		lv_first_5_0, 
                            		"FirstOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1573:6: ( (lv_last_6_0= ruleLastOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1573:6: ( (lv_last_6_0= ruleLastOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1574:1: (lv_last_6_0= ruleLastOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1574:1: (lv_last_6_0= ruleLastOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1575:3: lv_last_6_0= ruleLastOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getLastLastOpParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLastOp_in_ruleOCLOperationType23043);
                    lv_last_6_0=ruleLastOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"last",
                            		lv_last_6_0, 
                            		"LastOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1592:6: ( (lv_indexOf_7_0= ruleIndexOfOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1592:6: ( (lv_indexOf_7_0= ruleIndexOfOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1593:1: (lv_indexOf_7_0= ruleIndexOfOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1593:1: (lv_indexOf_7_0= ruleIndexOfOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1594:3: lv_indexOf_7_0= ruleIndexOfOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getIndexOfIndexOfOpParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIndexOfOp_in_ruleOCLOperationType23070);
                    lv_indexOf_7_0=ruleIndexOfOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"indexOf",
                            		lv_indexOf_7_0, 
                            		"IndexOfOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1611:6: ( (lv_union_8_0= ruleUnionOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1611:6: ( (lv_union_8_0= ruleUnionOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1612:1: (lv_union_8_0= ruleUnionOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1612:1: (lv_union_8_0= ruleUnionOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1613:3: lv_union_8_0= ruleUnionOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getUnionUnionOpParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnionOp_in_ruleOCLOperationType23097);
                    lv_union_8_0=ruleUnionOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"union",
                            		lv_union_8_0, 
                            		"UnionOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1630:6: ( (lv_intersection_9_0= ruleIntersectionOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1630:6: ( (lv_intersection_9_0= ruleIntersectionOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1631:1: (lv_intersection_9_0= ruleIntersectionOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1631:1: (lv_intersection_9_0= ruleIntersectionOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1632:3: lv_intersection_9_0= ruleIntersectionOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getIntersectionIntersectionOpParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntersectionOp_in_ruleOCLOperationType23124);
                    lv_intersection_9_0=ruleIntersectionOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"intersection",
                            		lv_intersection_9_0, 
                            		"IntersectionOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1649:6: ( (lv_isUndefined_10_0= ruleIsUndefinedOp ) )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1649:6: ( (lv_isUndefined_10_0= ruleIsUndefinedOp ) )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1650:1: (lv_isUndefined_10_0= ruleIsUndefinedOp )
                    {
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1650:1: (lv_isUndefined_10_0= ruleIsUndefinedOp )
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1651:3: lv_isUndefined_10_0= ruleIsUndefinedOp
                    {
                     
                    	        newCompositeNode(grammarAccess.getOCLOperationType2Access().getIsUndefinedIsUndefinedOpParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIsUndefinedOp_in_ruleOCLOperationType23151);
                    lv_isUndefined_10_0=ruleIsUndefinedOp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOCLOperationType2Rule());
                    	        }
                           		set(
                           			current, 
                           			"isUndefined",
                            		lv_isUndefined_10_0, 
                            		"IsUndefinedOp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleOCLOperationType2"


    // $ANTLR start "entryRuleInfixPrimitiveOperator"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1675:1: entryRuleInfixPrimitiveOperator returns [String current=null] : iv_ruleInfixPrimitiveOperator= ruleInfixPrimitiveOperator EOF ;
    public final String entryRuleInfixPrimitiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixPrimitiveOperator = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1676:2: (iv_ruleInfixPrimitiveOperator= ruleInfixPrimitiveOperator EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1677:2: iv_ruleInfixPrimitiveOperator= ruleInfixPrimitiveOperator EOF
            {
             newCompositeNode(grammarAccess.getInfixPrimitiveOperatorRule()); 
            pushFollow(FOLLOW_ruleInfixPrimitiveOperator_in_entryRuleInfixPrimitiveOperator3188);
            iv_ruleInfixPrimitiveOperator=ruleInfixPrimitiveOperator();

            state._fsp--;

             current =iv_ruleInfixPrimitiveOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixPrimitiveOperator3199); 

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
    // $ANTLR end "entryRuleInfixPrimitiveOperator"


    // $ANTLR start "ruleInfixPrimitiveOperator"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1684:1: ruleInfixPrimitiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'and' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleInfixPrimitiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1687:28: ( (kw= '=' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'and' | kw= 'or' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1688:1: (kw= '=' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'and' | kw= 'or' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1688:1: (kw= '=' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'and' | kw= 'or' )
            int alt20=12;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
                {
                alt20=4;
                }
                break;
            case 42:
                {
                alt20=5;
                }
                break;
            case 43:
                {
                alt20=6;
                }
                break;
            case 44:
                {
                alt20=7;
                }
                break;
            case 45:
                {
                alt20=8;
                }
                break;
            case 46:
                {
                alt20=9;
                }
                break;
            case 47:
                {
                alt20=10;
                }
                break;
            case 48:
                {
                alt20=11;
                }
                break;
            case 49:
                {
                alt20=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1689:2: kw= '='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleInfixPrimitiveOperator3237); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1696:2: kw= '!='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleInfixPrimitiveOperator3256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1703:2: kw= '>'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleInfixPrimitiveOperator3275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getGreaterThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1710:2: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleInfixPrimitiveOperator3294); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getLessThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1717:2: kw= '>='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleInfixPrimitiveOperator3313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1724:2: kw= '<='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleInfixPrimitiveOperator3332); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1731:2: kw= '+'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleInfixPrimitiveOperator3351); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getPlusSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1738:2: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleInfixPrimitiveOperator3370); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getHyphenMinusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1745:2: kw= '*'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleInfixPrimitiveOperator3389); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getAsteriskKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1752:2: kw= '/'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleInfixPrimitiveOperator3408); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getSolidusKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1759:2: kw= 'and'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleInfixPrimitiveOperator3427); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getAndKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1766:2: kw= 'or'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleInfixPrimitiveOperator3446); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfixPrimitiveOperatorAccess().getOrKeyword_11()); 
                        

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
    // $ANTLR end "ruleInfixPrimitiveOperator"


    // $ANTLR start "entryRuleSizeOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1779:1: entryRuleSizeOp returns [String current=null] : iv_ruleSizeOp= ruleSizeOp EOF ;
    public final String entryRuleSizeOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSizeOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1780:2: (iv_ruleSizeOp= ruleSizeOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1781:2: iv_ruleSizeOp= ruleSizeOp EOF
            {
             newCompositeNode(grammarAccess.getSizeOpRule()); 
            pushFollow(FOLLOW_ruleSizeOp_in_entryRuleSizeOp3487);
            iv_ruleSizeOp=ruleSizeOp();

            state._fsp--;

             current =iv_ruleSizeOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeOp3498); 

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
    // $ANTLR end "entryRuleSizeOp"


    // $ANTLR start "ruleSizeOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1788:1: ruleSizeOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'size' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleSizeOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1791:28: ( (kw= 'size' kw= '()' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1792:1: (kw= 'size' kw= '()' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1792:1: (kw= 'size' kw= '()' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1793:2: kw= 'size' kw= '()'
            {
            kw=(Token)match(input,50,FOLLOW_50_in_ruleSizeOp3536); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSizeOpAccess().getSizeKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleSizeOp3549); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSizeOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
                

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
    // $ANTLR end "ruleSizeOp"


    // $ANTLR start "entryRuleFirstOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1812:1: entryRuleFirstOp returns [String current=null] : iv_ruleFirstOp= ruleFirstOp EOF ;
    public final String entryRuleFirstOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFirstOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1813:2: (iv_ruleFirstOp= ruleFirstOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1814:2: iv_ruleFirstOp= ruleFirstOp EOF
            {
             newCompositeNode(grammarAccess.getFirstOpRule()); 
            pushFollow(FOLLOW_ruleFirstOp_in_entryRuleFirstOp3590);
            iv_ruleFirstOp=ruleFirstOp();

            state._fsp--;

             current =iv_ruleFirstOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFirstOp3601); 

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
    // $ANTLR end "entryRuleFirstOp"


    // $ANTLR start "ruleFirstOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1821:1: ruleFirstOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'first' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleFirstOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1824:28: ( (kw= 'first' kw= '()' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1825:1: (kw= 'first' kw= '()' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1825:1: (kw= 'first' kw= '()' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1826:2: kw= 'first' kw= '()'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleFirstOp3639); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFirstOpAccess().getFirstKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleFirstOp3652); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFirstOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
                

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
    // $ANTLR end "ruleFirstOp"


    // $ANTLR start "entryRuleLastOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1845:1: entryRuleLastOp returns [String current=null] : iv_ruleLastOp= ruleLastOp EOF ;
    public final String entryRuleLastOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLastOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1846:2: (iv_ruleLastOp= ruleLastOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1847:2: iv_ruleLastOp= ruleLastOp EOF
            {
             newCompositeNode(grammarAccess.getLastOpRule()); 
            pushFollow(FOLLOW_ruleLastOp_in_entryRuleLastOp3693);
            iv_ruleLastOp=ruleLastOp();

            state._fsp--;

             current =iv_ruleLastOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLastOp3704); 

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
    // $ANTLR end "entryRuleLastOp"


    // $ANTLR start "ruleLastOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1854:1: ruleLastOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'last' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleLastOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1857:28: ( (kw= 'last' kw= '()' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1858:1: (kw= 'last' kw= '()' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1858:1: (kw= 'last' kw= '()' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1859:2: kw= 'last' kw= '()'
            {
            kw=(Token)match(input,52,FOLLOW_52_in_ruleLastOp3742); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLastOpAccess().getLastKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleLastOp3755); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLastOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
                

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
    // $ANTLR end "ruleLastOp"


    // $ANTLR start "entryRuleIndexOfOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1878:1: entryRuleIndexOfOp returns [EObject current=null] : iv_ruleIndexOfOp= ruleIndexOfOp EOF ;
    public final EObject entryRuleIndexOfOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexOfOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1879:2: (iv_ruleIndexOfOp= ruleIndexOfOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1880:2: iv_ruleIndexOfOp= ruleIndexOfOp EOF
            {
             newCompositeNode(grammarAccess.getIndexOfOpRule()); 
            pushFollow(FOLLOW_ruleIndexOfOp_in_entryRuleIndexOfOp3795);
            iv_ruleIndexOfOp=ruleIndexOfOp();

            state._fsp--;

             current =iv_ruleIndexOfOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexOfOp3805); 

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
    // $ANTLR end "entryRuleIndexOfOp"


    // $ANTLR start "ruleIndexOfOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1887:1: ruleIndexOfOp returns [EObject current=null] : (otherlv_0= 'indexOf' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleIndexOfOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1890:28: ( (otherlv_0= 'indexOf' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1891:1: (otherlv_0= 'indexOf' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1891:1: (otherlv_0= 'indexOf' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1891:3: otherlv_0= 'indexOf' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleIndexOfOp3842); 

                	newLeafNode(otherlv_0, grammarAccess.getIndexOfOpAccess().getIndexOfKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleIndexOfOp3854); 

                	newLeafNode(otherlv_1, grammarAccess.getIndexOfOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1899:1: ( (lv_index_2_0= RULE_INT ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1900:1: (lv_index_2_0= RULE_INT )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1900:1: (lv_index_2_0= RULE_INT )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1901:3: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIndexOfOp3871); 

            			newLeafNode(lv_index_2_0, grammarAccess.getIndexOfOpAccess().getIndexINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexOfOpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"index",
                    		lv_index_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleIndexOfOp3888); 

                	newLeafNode(otherlv_3, grammarAccess.getIndexOfOpAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleIndexOfOp"


    // $ANTLR start "entryRuleAllInstancesOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1929:1: entryRuleAllInstancesOp returns [String current=null] : iv_ruleAllInstancesOp= ruleAllInstancesOp EOF ;
    public final String entryRuleAllInstancesOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAllInstancesOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1930:2: (iv_ruleAllInstancesOp= ruleAllInstancesOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1931:2: iv_ruleAllInstancesOp= ruleAllInstancesOp EOF
            {
             newCompositeNode(grammarAccess.getAllInstancesOpRule()); 
            pushFollow(FOLLOW_ruleAllInstancesOp_in_entryRuleAllInstancesOp3925);
            iv_ruleAllInstancesOp=ruleAllInstancesOp();

            state._fsp--;

             current =iv_ruleAllInstancesOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllInstancesOp3936); 

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
    // $ANTLR end "entryRuleAllInstancesOp"


    // $ANTLR start "ruleAllInstancesOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1938:1: ruleAllInstancesOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'allInstances' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleAllInstancesOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1941:28: ( (kw= 'allInstances' kw= '()' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1942:1: (kw= 'allInstances' kw= '()' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1942:1: (kw= 'allInstances' kw= '()' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1943:2: kw= 'allInstances' kw= '()'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleAllInstancesOp3974); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAllInstancesOpAccess().getAllInstancesKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleAllInstancesOp3987); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAllInstancesOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
                

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
    // $ANTLR end "ruleAllInstancesOp"


    // $ANTLR start "entryRuleForAllOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1962:1: entryRuleForAllOp returns [EObject current=null] : iv_ruleForAllOp= ruleForAllOp EOF ;
    public final EObject entryRuleForAllOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAllOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1963:2: (iv_ruleForAllOp= ruleForAllOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1964:2: iv_ruleForAllOp= ruleForAllOp EOF
            {
             newCompositeNode(grammarAccess.getForAllOpRule()); 
            pushFollow(FOLLOW_ruleForAllOp_in_entryRuleForAllOp4027);
            iv_ruleForAllOp=ruleForAllOp();

            state._fsp--;

             current =iv_ruleForAllOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAllOp4037); 

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
    // $ANTLR end "entryRuleForAllOp"


    // $ANTLR start "ruleForAllOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1971:1: ruleForAllOp returns [EObject current=null] : (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleForAllOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_var_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1974:28: ( (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1975:1: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1975:1: (otherlv_0= 'forAll' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1975:3: otherlv_0= 'forAll' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleForAllOp4074); 

                	newLeafNode(otherlv_0, grammarAccess.getForAllOpAccess().getForAllKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleForAllOp4086); 

                	newLeafNode(otherlv_1, grammarAccess.getForAllOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1983:1: ( (lv_var_2_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1984:1: (lv_var_2_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1984:1: (lv_var_2_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:1985:3: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForAllOp4103); 

            			newLeafNode(lv_var_2_0, grammarAccess.getForAllOpAccess().getVarIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForAllOpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var",
                    		lv_var_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleForAllOp4120); 

                	newLeafNode(otherlv_3, grammarAccess.getForAllOpAccess().getVerticalLineKeyword_3());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2005:1: ( (lv_exp_4_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2006:1: (lv_exp_4_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2006:1: (lv_exp_4_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2007:3: lv_exp_4_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getForAllOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleForAllOp4141);
            lv_exp_4_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForAllOpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_4_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleForAllOp4153); 

                	newLeafNode(otherlv_5, grammarAccess.getForAllOpAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleForAllOp"


    // $ANTLR start "entryRuleExistsOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2035:1: entryRuleExistsOp returns [EObject current=null] : iv_ruleExistsOp= ruleExistsOp EOF ;
    public final EObject entryRuleExistsOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2036:2: (iv_ruleExistsOp= ruleExistsOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2037:2: iv_ruleExistsOp= ruleExistsOp EOF
            {
             newCompositeNode(grammarAccess.getExistsOpRule()); 
            pushFollow(FOLLOW_ruleExistsOp_in_entryRuleExistsOp4189);
            iv_ruleExistsOp=ruleExistsOp();

            state._fsp--;

             current =iv_ruleExistsOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsOp4199); 

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
    // $ANTLR end "entryRuleExistsOp"


    // $ANTLR start "ruleExistsOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2044:1: ruleExistsOp returns [EObject current=null] : (otherlv_0= 'exists' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleExistsOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_var_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2047:28: ( (otherlv_0= 'exists' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2048:1: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2048:1: (otherlv_0= 'exists' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2048:3: otherlv_0= 'exists' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleExistsOp4236); 

                	newLeafNode(otherlv_0, grammarAccess.getExistsOpAccess().getExistsKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExistsOp4248); 

                	newLeafNode(otherlv_1, grammarAccess.getExistsOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2056:1: ( (lv_var_2_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2057:1: (lv_var_2_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2057:1: (lv_var_2_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2058:3: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExistsOp4265); 

            			newLeafNode(lv_var_2_0, grammarAccess.getExistsOpAccess().getVarIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExistsOpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var",
                    		lv_var_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleExistsOp4282); 

                	newLeafNode(otherlv_3, grammarAccess.getExistsOpAccess().getVerticalLineKeyword_3());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2078:1: ( (lv_exp_4_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2079:1: (lv_exp_4_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2079:1: (lv_exp_4_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2080:3: lv_exp_4_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getExistsOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleExistsOp4303);
            lv_exp_4_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistsOpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_4_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleExistsOp4315); 

                	newLeafNode(otherlv_5, grammarAccess.getExistsOpAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleExistsOp"


    // $ANTLR start "entryRuleSelectOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2108:1: entryRuleSelectOp returns [EObject current=null] : iv_ruleSelectOp= ruleSelectOp EOF ;
    public final EObject entryRuleSelectOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2109:2: (iv_ruleSelectOp= ruleSelectOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2110:2: iv_ruleSelectOp= ruleSelectOp EOF
            {
             newCompositeNode(grammarAccess.getSelectOpRule()); 
            pushFollow(FOLLOW_ruleSelectOp_in_entryRuleSelectOp4351);
            iv_ruleSelectOp=ruleSelectOp();

            state._fsp--;

             current =iv_ruleSelectOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectOp4361); 

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
    // $ANTLR end "entryRuleSelectOp"


    // $ANTLR start "ruleSelectOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2117:1: ruleSelectOp returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSelectOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_var_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2120:28: ( (otherlv_0= 'select' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2121:1: (otherlv_0= 'select' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2121:1: (otherlv_0= 'select' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2121:3: otherlv_0= 'select' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleSelectOp4398); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectOpAccess().getSelectKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSelectOp4410); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2129:1: ( (lv_var_2_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2130:1: (lv_var_2_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2130:1: (lv_var_2_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2131:3: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectOp4427); 

            			newLeafNode(lv_var_2_0, grammarAccess.getSelectOpAccess().getVarIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectOpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var",
                    		lv_var_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleSelectOp4444); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectOpAccess().getVerticalLineKeyword_3());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2151:1: ( (lv_exp_4_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2152:1: (lv_exp_4_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2152:1: (lv_exp_4_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2153:3: lv_exp_4_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelectOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleSelectOp4465);
            lv_exp_4_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectOpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_4_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSelectOp4477); 

                	newLeafNode(otherlv_5, grammarAccess.getSelectOpAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleSelectOp"


    // $ANTLR start "entryRuleCollectOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2181:1: entryRuleCollectOp returns [EObject current=null] : iv_ruleCollectOp= ruleCollectOp EOF ;
    public final EObject entryRuleCollectOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2182:2: (iv_ruleCollectOp= ruleCollectOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2183:2: iv_ruleCollectOp= ruleCollectOp EOF
            {
             newCompositeNode(grammarAccess.getCollectOpRule()); 
            pushFollow(FOLLOW_ruleCollectOp_in_entryRuleCollectOp4513);
            iv_ruleCollectOp=ruleCollectOp();

            state._fsp--;

             current =iv_ruleCollectOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectOp4523); 

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
    // $ANTLR end "entryRuleCollectOp"


    // $ANTLR start "ruleCollectOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2190:1: ruleCollectOp returns [EObject current=null] : (otherlv_0= 'collect' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCollectOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_var_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2193:28: ( (otherlv_0= 'collect' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2194:1: (otherlv_0= 'collect' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2194:1: (otherlv_0= 'collect' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2194:3: otherlv_0= 'collect' otherlv_1= '(' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= '|' ( (lv_exp_4_0= ruleComplexExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleCollectOp4560); 

                	newLeafNode(otherlv_0, grammarAccess.getCollectOpAccess().getCollectKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCollectOp4572); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2202:1: ( (lv_var_2_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2203:1: (lv_var_2_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2203:1: (lv_var_2_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2204:3: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCollectOp4589); 

            			newLeafNode(lv_var_2_0, grammarAccess.getCollectOpAccess().getVarIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectOpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var",
                    		lv_var_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleCollectOp4606); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectOpAccess().getVerticalLineKeyword_3());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2224:1: ( (lv_exp_4_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2225:1: (lv_exp_4_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2225:1: (lv_exp_4_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2226:3: lv_exp_4_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectOpAccess().getExpComplexExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleCollectOp4627);
            lv_exp_4_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCollectOpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_4_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleCollectOp4639); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectOpAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleCollectOp"


    // $ANTLR start "entryRuleIsTypeOfOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2254:1: entryRuleIsTypeOfOp returns [EObject current=null] : iv_ruleIsTypeOfOp= ruleIsTypeOfOp EOF ;
    public final EObject entryRuleIsTypeOfOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsTypeOfOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2255:2: (iv_ruleIsTypeOfOp= ruleIsTypeOfOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2256:2: iv_ruleIsTypeOfOp= ruleIsTypeOfOp EOF
            {
             newCompositeNode(grammarAccess.getIsTypeOfOpRule()); 
            pushFollow(FOLLOW_ruleIsTypeOfOp_in_entryRuleIsTypeOfOp4675);
            iv_ruleIsTypeOfOp=ruleIsTypeOfOp();

            state._fsp--;

             current =iv_ruleIsTypeOfOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsTypeOfOp4685); 

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
    // $ANTLR end "entryRuleIsTypeOfOp"


    // $ANTLR start "ruleIsTypeOfOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2263:1: ruleIsTypeOfOp returns [EObject current=null] : (otherlv_0= 'isTypeOf' otherlv_1= '(' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleIsTypeOfOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2266:28: ( (otherlv_0= 'isTypeOf' otherlv_1= '(' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2267:1: (otherlv_0= 'isTypeOf' otherlv_1= '(' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2267:1: (otherlv_0= 'isTypeOf' otherlv_1= '(' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2267:3: otherlv_0= 'isTypeOf' otherlv_1= '(' ( (lv_className_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleIsTypeOfOp4722); 

                	newLeafNode(otherlv_0, grammarAccess.getIsTypeOfOpAccess().getIsTypeOfKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleIsTypeOfOp4734); 

                	newLeafNode(otherlv_1, grammarAccess.getIsTypeOfOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2275:1: ( (lv_className_2_0= RULE_ID ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2276:1: (lv_className_2_0= RULE_ID )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2276:1: (lv_className_2_0= RULE_ID )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2277:3: lv_className_2_0= RULE_ID
            {
            lv_className_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIsTypeOfOp4751); 

            			newLeafNode(lv_className_2_0, grammarAccess.getIsTypeOfOpAccess().getClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsTypeOfOpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleIsTypeOfOp4768); 

                	newLeafNode(otherlv_3, grammarAccess.getIsTypeOfOpAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleIsTypeOfOp"


    // $ANTLR start "entryRuleToStringOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2305:1: entryRuleToStringOp returns [String current=null] : iv_ruleToStringOp= ruleToStringOp EOF ;
    public final String entryRuleToStringOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToStringOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2306:2: (iv_ruleToStringOp= ruleToStringOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2307:2: iv_ruleToStringOp= ruleToStringOp EOF
            {
             newCompositeNode(grammarAccess.getToStringOpRule()); 
            pushFollow(FOLLOW_ruleToStringOp_in_entryRuleToStringOp4805);
            iv_ruleToStringOp=ruleToStringOp();

            state._fsp--;

             current =iv_ruleToStringOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToStringOp4816); 

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
    // $ANTLR end "entryRuleToStringOp"


    // $ANTLR start "ruleToStringOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2314:1: ruleToStringOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'toString' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleToStringOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2317:28: ( (kw= 'toString' kw= '()' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2318:1: (kw= 'toString' kw= '()' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2318:1: (kw= 'toString' kw= '()' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2319:2: kw= 'toString' kw= '()'
            {
            kw=(Token)match(input,61,FOLLOW_61_in_ruleToStringOp4854); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getToStringOpAccess().getToStringKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleToStringOp4867); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getToStringOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
                

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
    // $ANTLR end "ruleToStringOp"


    // $ANTLR start "entryRuleConcatOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2338:1: entryRuleConcatOp returns [EObject current=null] : iv_ruleConcatOp= ruleConcatOp EOF ;
    public final EObject entryRuleConcatOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcatOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2339:2: (iv_ruleConcatOp= ruleConcatOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2340:2: iv_ruleConcatOp= ruleConcatOp EOF
            {
             newCompositeNode(grammarAccess.getConcatOpRule()); 
            pushFollow(FOLLOW_ruleConcatOp_in_entryRuleConcatOp4907);
            iv_ruleConcatOp=ruleConcatOp();

            state._fsp--;

             current =iv_ruleConcatOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcatOp4917); 

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
    // $ANTLR end "entryRuleConcatOp"


    // $ANTLR start "ruleConcatOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2347:1: ruleConcatOp returns [EObject current=null] : (otherlv_0= 'concatenate' otherlv_1= '(' ( (lv_s_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleConcatOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_s_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2350:28: ( (otherlv_0= 'concatenate' otherlv_1= '(' ( (lv_s_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2351:1: (otherlv_0= 'concatenate' otherlv_1= '(' ( (lv_s_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2351:1: (otherlv_0= 'concatenate' otherlv_1= '(' ( (lv_s_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2351:3: otherlv_0= 'concatenate' otherlv_1= '(' ( (lv_s_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleConcatOp4954); 

                	newLeafNode(otherlv_0, grammarAccess.getConcatOpAccess().getConcatenateKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleConcatOp4966); 

                	newLeafNode(otherlv_1, grammarAccess.getConcatOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2359:1: ( (lv_s_2_0= RULE_STRING ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2360:1: (lv_s_2_0= RULE_STRING )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2360:1: (lv_s_2_0= RULE_STRING )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2361:3: lv_s_2_0= RULE_STRING
            {
            lv_s_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConcatOp4983); 

            			newLeafNode(lv_s_2_0, grammarAccess.getConcatOpAccess().getSSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConcatOpRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"s",
                    		lv_s_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleConcatOp5000); 

                	newLeafNode(otherlv_3, grammarAccess.getConcatOpAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleConcatOp"


    // $ANTLR start "entryRuleUnionOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2389:1: entryRuleUnionOp returns [EObject current=null] : iv_ruleUnionOp= ruleUnionOp EOF ;
    public final EObject entryRuleUnionOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2390:2: (iv_ruleUnionOp= ruleUnionOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2391:2: iv_ruleUnionOp= ruleUnionOp EOF
            {
             newCompositeNode(grammarAccess.getUnionOpRule()); 
            pushFollow(FOLLOW_ruleUnionOp_in_entryRuleUnionOp5036);
            iv_ruleUnionOp=ruleUnionOp();

            state._fsp--;

             current =iv_ruleUnionOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionOp5046); 

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
    // $ANTLR end "entryRuleUnionOp"


    // $ANTLR start "ruleUnionOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2398:1: ruleUnionOp returns [EObject current=null] : (otherlv_0= 'union' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleUnionOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2401:28: ( (otherlv_0= 'union' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2402:1: (otherlv_0= 'union' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2402:1: (otherlv_0= 'union' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2402:3: otherlv_0= 'union' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleUnionOp5083); 

                	newLeafNode(otherlv_0, grammarAccess.getUnionOpAccess().getUnionKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleUnionOp5095); 

                	newLeafNode(otherlv_1, grammarAccess.getUnionOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2410:1: ( (lv_exp_2_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2411:1: (lv_exp_2_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2411:1: (lv_exp_2_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2412:3: lv_exp_2_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getUnionOpAccess().getExpComplexExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleUnionOp5116);
            lv_exp_2_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnionOpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleUnionOp5128); 

                	newLeafNode(otherlv_3, grammarAccess.getUnionOpAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleUnionOp"


    // $ANTLR start "entryRuleIntersectionOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2440:1: entryRuleIntersectionOp returns [EObject current=null] : iv_ruleIntersectionOp= ruleIntersectionOp EOF ;
    public final EObject entryRuleIntersectionOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectionOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2441:2: (iv_ruleIntersectionOp= ruleIntersectionOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2442:2: iv_ruleIntersectionOp= ruleIntersectionOp EOF
            {
             newCompositeNode(grammarAccess.getIntersectionOpRule()); 
            pushFollow(FOLLOW_ruleIntersectionOp_in_entryRuleIntersectionOp5164);
            iv_ruleIntersectionOp=ruleIntersectionOp();

            state._fsp--;

             current =iv_ruleIntersectionOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntersectionOp5174); 

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
    // $ANTLR end "entryRuleIntersectionOp"


    // $ANTLR start "ruleIntersectionOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2449:1: ruleIntersectionOp returns [EObject current=null] : (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleIntersectionOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2452:28: ( (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2453:1: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2453:1: (otherlv_0= 'intersection' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2453:3: otherlv_0= 'intersection' otherlv_1= '(' ( (lv_exp_2_0= ruleComplexExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleIntersectionOp5211); 

                	newLeafNode(otherlv_0, grammarAccess.getIntersectionOpAccess().getIntersectionKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleIntersectionOp5223); 

                	newLeafNode(otherlv_1, grammarAccess.getIntersectionOpAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2461:1: ( (lv_exp_2_0= ruleComplexExpression ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2462:1: (lv_exp_2_0= ruleComplexExpression )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2462:1: (lv_exp_2_0= ruleComplexExpression )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2463:3: lv_exp_2_0= ruleComplexExpression
            {
             
            	        newCompositeNode(grammarAccess.getIntersectionOpAccess().getExpComplexExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleComplexExpression_in_ruleIntersectionOp5244);
            lv_exp_2_0=ruleComplexExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntersectionOpRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"ComplexExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleIntersectionOp5256); 

                	newLeafNode(otherlv_3, grammarAccess.getIntersectionOpAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleIntersectionOp"


    // $ANTLR start "entryRuleIsUndefinedOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2491:1: entryRuleIsUndefinedOp returns [String current=null] : iv_ruleIsUndefinedOp= ruleIsUndefinedOp EOF ;
    public final String entryRuleIsUndefinedOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIsUndefinedOp = null;


        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2492:2: (iv_ruleIsUndefinedOp= ruleIsUndefinedOp EOF )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2493:2: iv_ruleIsUndefinedOp= ruleIsUndefinedOp EOF
            {
             newCompositeNode(grammarAccess.getIsUndefinedOpRule()); 
            pushFollow(FOLLOW_ruleIsUndefinedOp_in_entryRuleIsUndefinedOp5293);
            iv_ruleIsUndefinedOp=ruleIsUndefinedOp();

            state._fsp--;

             current =iv_ruleIsUndefinedOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsUndefinedOp5304); 

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
    // $ANTLR end "entryRuleIsUndefinedOp"


    // $ANTLR start "ruleIsUndefinedOp"
    // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2500:1: ruleIsUndefinedOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'isUndefined' kw= '()' ) ;
    public final AntlrDatatypeRuleToken ruleIsUndefinedOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2503:28: ( (kw= 'isUndefined' kw= '()' ) )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2504:1: (kw= 'isUndefined' kw= '()' )
            {
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2504:1: (kw= 'isUndefined' kw= '()' )
            // ../org.xtext.example.webgme_mtl/src-gen/org/xtext/example/webgme/parser/antlr/internal/InternalMTL.g:2505:2: kw= 'isUndefined' kw= '()'
            {
            kw=(Token)match(input,65,FOLLOW_65_in_ruleIsUndefinedOp5342); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIsUndefinedOpAccess().getIsUndefinedKeyword_0()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleIsUndefinedOp5355); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIsUndefinedOpAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
                

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
    // $ANTLR end "ruleIsUndefinedOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRule213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRule247 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRule259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInPattern_in_ruleRule280 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_16_in_ruleRule294 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleFilter_in_ruleRule315 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRule327 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRule341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOutPattern_in_ruleRule362 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleRule375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInPattern_in_entryRuleInPattern411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInPattern421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInPattern463 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInPattern480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInPattern497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_entryRuleFilter538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilter548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleFilter593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutPattern_in_entryRuleOutPattern628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutPattern638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutPattern680 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOutPattern697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutPattern714 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOutPattern731 = new BitSet(new long[]{0x0000000300020010L});
    public static final BitSet FOLLOW_ruleAssignation_in_ruleOutPattern752 = new BitSet(new long[]{0x0000000300020010L});
    public static final BitSet FOLLOW_17_in_ruleOutPattern765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignation_in_entryRuleAssignation801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignation811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignation854 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAssignation871 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleAssignation892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssocRoleName_in_ruleAssignation921 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAssignation933 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleAssignation954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_entryRuleSimpleExpression991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpression1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleExpression1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleExpression1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSimpleExpression1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleSimpleExpression1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSimpleExpression1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavig_in_ruleSimpleExpression1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSentence_in_ruleSimpleExpression1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleSimpleExpression1251 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSimpleExpression1263 = new BitSet(new long[]{0x00000038A24801F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleSimpleExpression1284 = new BitSet(new long[]{0x00000038A24801F0L});
    public static final BitSet FOLLOW_19_in_ruleSimpleExpression1297 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleNavigation_in_ruleSimpleExpression1318 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleResolveExp_in_ruleSimpleExpression1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavig_in_entryRuleNavig1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavig1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNavig1435 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleNavigation_in_ruleNavig1461 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_ruleNavigation_in_entryRuleNavigation1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigation1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNavigation1546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNavigation1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNavigation1588 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_ruleAssocRoleName_in_ruleNavigation1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNavigation1629 = new BitSet(new long[]{0x7040000000000000L});
    public static final BitSet FOLLOW_ruleOCLOperationType1_in_ruleNavigation1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNavigation1670 = new BitSet(new long[]{0x8EBC000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleOCLOperationType2_in_ruleNavigation1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSentence_in_entryRuleIfSentence1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSentence1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIfSentence1775 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleIfSentence1796 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleIfSentence1808 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleIfSentence1829 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfSentence1841 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleIfSentence1862 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfSentence1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResolveExp_in_entryRuleResolveExp1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResolveExp1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleResolveExp1957 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResolveExp1969 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleResolveExp1990 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleResolveExp2003 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResolveExp2020 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResolveExp2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_entryRuleComplexExpression2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexExpression2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleComplexExpression2129 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComplexExpression2154 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2175 = new BitSet(new long[]{0x0003FFC000020000L});
    public static final BitSet FOLLOW_ruleInfixPrimitiveOperator_in_ruleComplexExpression2197 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2218 = new BitSet(new long[]{0x0003FFC000020000L});
    public static final BitSet FOLLOW_17_in_ruleComplexExpression2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2261 = new BitSet(new long[]{0x0003FFC000000002L});
    public static final BitSet FOLLOW_ruleInfixPrimitiveOperator_in_ruleComplexExpression2283 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleSimpleExpression_in_ruleComplexExpression2304 = new BitSet(new long[]{0x0003FFC000000002L});
    public static final BitSet FOLLOW_ruleAssocRoleName_in_entryRuleAssocRoleName2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssocRoleName2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAssocRoleName2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAssocRoleName2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssocRoleName2470 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAssocRoleName2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCollectionType2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCollectionType2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCollectionType2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperationType1_in_entryRuleOCLOperationType12652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOCLOperationType12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllInstancesOp_in_ruleOCLOperationType12708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTypeOfOp_in_ruleOCLOperationType12735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToStringOp_in_ruleOCLOperationType12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatOp_in_ruleOCLOperationType12789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOCLOperationType2_in_entryRuleOCLOperationType22825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOCLOperationType22835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeOp_in_ruleOCLOperationType22881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAllOp_in_ruleOCLOperationType22908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsOp_in_ruleOCLOperationType22935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectOp_in_ruleOCLOperationType22962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectOp_in_ruleOCLOperationType22989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFirstOp_in_ruleOCLOperationType23016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastOp_in_ruleOCLOperationType23043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexOfOp_in_ruleOCLOperationType23070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionOp_in_ruleOCLOperationType23097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectionOp_in_ruleOCLOperationType23124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsUndefinedOp_in_ruleOCLOperationType23151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixPrimitiveOperator_in_entryRuleInfixPrimitiveOperator3188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixPrimitiveOperator3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInfixPrimitiveOperator3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInfixPrimitiveOperator3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInfixPrimitiveOperator3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInfixPrimitiveOperator3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInfixPrimitiveOperator3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInfixPrimitiveOperator3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInfixPrimitiveOperator3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInfixPrimitiveOperator3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleInfixPrimitiveOperator3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInfixPrimitiveOperator3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInfixPrimitiveOperator3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInfixPrimitiveOperator3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeOp_in_entryRuleSizeOp3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeOp3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSizeOp3536 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSizeOp3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFirstOp_in_entryRuleFirstOp3590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFirstOp3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFirstOp3639 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFirstOp3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastOp_in_entryRuleLastOp3693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLastOp3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLastOp3742 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleLastOp3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexOfOp_in_entryRuleIndexOfOp3795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexOfOp3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIndexOfOp3842 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIndexOfOp3854 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIndexOfOp3871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndexOfOp3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllInstancesOp_in_entryRuleAllInstancesOp3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllInstancesOp3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAllInstancesOp3974 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAllInstancesOp3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAllOp_in_entryRuleForAllOp4027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAllOp4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleForAllOp4074 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleForAllOp4086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForAllOp4103 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForAllOp4120 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleForAllOp4141 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleForAllOp4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsOp_in_entryRuleExistsOp4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsOp4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleExistsOp4236 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExistsOp4248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExistsOp4265 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleExistsOp4282 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleExistsOp4303 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleExistsOp4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectOp_in_entryRuleSelectOp4351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectOp4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSelectOp4398 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSelectOp4410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectOp4427 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleSelectOp4444 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleSelectOp4465 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSelectOp4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectOp_in_entryRuleCollectOp4513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectOp4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCollectOp4560 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCollectOp4572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCollectOp4589 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCollectOp4606 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleCollectOp4627 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCollectOp4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsTypeOfOp_in_entryRuleIsTypeOfOp4675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsTypeOfOp4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleIsTypeOfOp4722 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIsTypeOfOp4734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIsTypeOfOp4751 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIsTypeOfOp4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToStringOp_in_entryRuleToStringOp4805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToStringOp4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleToStringOp4854 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleToStringOp4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcatOp_in_entryRuleConcatOp4907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcatOp4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleConcatOp4954 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConcatOp4966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConcatOp4983 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConcatOp5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionOp_in_entryRuleUnionOp5036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionOp5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleUnionOp5083 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnionOp5095 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleUnionOp5116 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUnionOp5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectionOp_in_entryRuleIntersectionOp5164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntersectionOp5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIntersectionOp5211 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIntersectionOp5223 = new BitSet(new long[]{0x00000038A24001F0L});
    public static final BitSet FOLLOW_ruleComplexExpression_in_ruleIntersectionOp5244 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIntersectionOp5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsUndefinedOp_in_entryRuleIsUndefinedOp5293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsUndefinedOp5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIsUndefinedOp5342 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIsUndefinedOp5355 = new BitSet(new long[]{0x0000000000000002L});

}