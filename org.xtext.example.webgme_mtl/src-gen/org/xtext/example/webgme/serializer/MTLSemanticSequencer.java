package org.xtext.example.webgme.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.webgme.mTL.Assignation;
import org.xtext.example.webgme.mTL.AssocRoleName;
import org.xtext.example.webgme.mTL.CollectOp;
import org.xtext.example.webgme.mTL.ComplexExpression;
import org.xtext.example.webgme.mTL.ConcatOp;
import org.xtext.example.webgme.mTL.ExistsOp;
import org.xtext.example.webgme.mTL.Filter;
import org.xtext.example.webgme.mTL.ForAllOp;
import org.xtext.example.webgme.mTL.IfSentence;
import org.xtext.example.webgme.mTL.InPattern;
import org.xtext.example.webgme.mTL.IndexOfOp;
import org.xtext.example.webgme.mTL.IntersectionOp;
import org.xtext.example.webgme.mTL.IsTypeOfOp;
import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.Model;
import org.xtext.example.webgme.mTL.Navig;
import org.xtext.example.webgme.mTL.Navigation;
import org.xtext.example.webgme.mTL.OCLOperationType1;
import org.xtext.example.webgme.mTL.OCLOperationType2;
import org.xtext.example.webgme.mTL.OutPattern;
import org.xtext.example.webgme.mTL.ResolveExp;
import org.xtext.example.webgme.mTL.Rule;
import org.xtext.example.webgme.mTL.SelectOp;
import org.xtext.example.webgme.mTL.SimpleExpression;
import org.xtext.example.webgme.mTL.UnionOp;
import org.xtext.example.webgme.services.MTLGrammarAccess;

@SuppressWarnings("all")
public class MTLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MTLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MTLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MTLPackage.ASSIGNATION:
				if(context == grammarAccess.getAssignationRule()) {
					sequence_Assignation(context, (Assignation) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.ASSOC_ROLE_NAME:
				if(context == grammarAccess.getAssocRoleNameRule()) {
					sequence_AssocRoleName(context, (AssocRoleName) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.COLLECT_OP:
				if(context == grammarAccess.getCollectOpRule()) {
					sequence_CollectOp(context, (CollectOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.COMPLEX_EXPRESSION:
				if(context == grammarAccess.getComplexExpressionRule()) {
					sequence_ComplexExpression(context, (ComplexExpression) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.CONCAT_OP:
				if(context == grammarAccess.getConcatOpRule()) {
					sequence_ConcatOp(context, (ConcatOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.EXISTS_OP:
				if(context == grammarAccess.getExistsOpRule()) {
					sequence_ExistsOp(context, (ExistsOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.FILTER:
				if(context == grammarAccess.getFilterRule()) {
					sequence_Filter(context, (Filter) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.FOR_ALL_OP:
				if(context == grammarAccess.getForAllOpRule()) {
					sequence_ForAllOp(context, (ForAllOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.IF_SENTENCE:
				if(context == grammarAccess.getIfSentenceRule()) {
					sequence_IfSentence(context, (IfSentence) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.IN_PATTERN:
				if(context == grammarAccess.getInPatternRule()) {
					sequence_InPattern(context, (InPattern) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.INDEX_OF_OP:
				if(context == grammarAccess.getIndexOfOpRule()) {
					sequence_IndexOfOp(context, (IndexOfOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.INTERSECTION_OP:
				if(context == grammarAccess.getIntersectionOpRule()) {
					sequence_IntersectionOp(context, (IntersectionOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.IS_TYPE_OF_OP:
				if(context == grammarAccess.getIsTypeOfOpRule()) {
					sequence_IsTypeOfOp(context, (IsTypeOfOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.NAVIG:
				if(context == grammarAccess.getNavigRule()) {
					sequence_Navig(context, (Navig) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.NAVIGATION:
				if(context == grammarAccess.getNavigationRule()) {
					sequence_Navigation(context, (Navigation) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.OCL_OPERATION_TYPE1:
				if(context == grammarAccess.getOCLOperationType1Rule()) {
					sequence_OCLOperationType1(context, (OCLOperationType1) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.OCL_OPERATION_TYPE2:
				if(context == grammarAccess.getOCLOperationType2Rule()) {
					sequence_OCLOperationType2(context, (OCLOperationType2) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.OUT_PATTERN:
				if(context == grammarAccess.getOutPatternRule()) {
					sequence_OutPattern(context, (OutPattern) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.RESOLVE_EXP:
				if(context == grammarAccess.getResolveExpRule()) {
					sequence_ResolveExp(context, (ResolveExp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.SELECT_OP:
				if(context == grammarAccess.getSelectOpRule()) {
					sequence_SelectOp(context, (SelectOp) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.SIMPLE_EXPRESSION:
				if(context == grammarAccess.getSimpleExpressionRule()) {
					sequence_SimpleExpression(context, (SimpleExpression) semanticObject); 
					return; 
				}
				else break;
			case MTLPackage.UNION_OP:
				if(context == grammarAccess.getUnionOpRule()) {
					sequence_UnionOp(context, (UnionOp) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((attribute=ID expr=ComplexExpression) | (relationship=AssocRoleName expr=ComplexExpression))
	 */
	protected void sequence_Assignation(EObject context, Assignation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (children='children()' | parent='parent()' | name=ID)
	 */
	protected void sequence_AssocRoleName(EObject context, AssocRoleName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=ID exp=ComplexExpression)
	 */
	protected void sequence_CollectOp(EObject context, CollectOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.COLLECT_OP__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.COLLECT_OP__VAR));
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.COLLECT_OP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.COLLECT_OP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCollectOpAccess().getVarIDTerminalRuleCall_2_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getCollectOpAccess().getExpComplexExpressionParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (prefixNot='not' left=SimpleExpression (infixOp+=InfixPrimitiveOperator right+=SimpleExpression)*) | 
	 *         (left=SimpleExpression (infixOp+=InfixPrimitiveOperator right+=SimpleExpression)*)
	 *     )
	 */
	protected void sequence_ComplexExpression(EObject context, ComplexExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     s=STRING
	 */
	protected void sequence_ConcatOp(EObject context, ConcatOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.CONCAT_OP__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.CONCAT_OP__S));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcatOpAccess().getSSTRINGTerminalRuleCall_2_0(), semanticObject.getS());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=ID exp=ComplexExpression)
	 */
	protected void sequence_ExistsOp(EObject context, ExistsOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.EXISTS_OP__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.EXISTS_OP__VAR));
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.EXISTS_OP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.EXISTS_OP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExistsOpAccess().getVarIDTerminalRuleCall_2_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getExistsOpAccess().getExpComplexExpressionParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expr=ComplexExpression
	 */
	protected void sequence_Filter(EObject context, Filter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.FILTER__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.FILTER__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterAccess().getExprComplexExpressionParserRuleCall_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=ID exp=ComplexExpression)
	 */
	protected void sequence_ForAllOp(EObject context, ForAllOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.FOR_ALL_OP__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.FOR_ALL_OP__VAR));
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.FOR_ALL_OP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.FOR_ALL_OP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForAllOpAccess().getVarIDTerminalRuleCall_2_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getForAllOpAccess().getExpComplexExpressionParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=ComplexExpression body=ComplexExpression elsebody=ComplexExpression)
	 */
	protected void sequence_IfSentence(EObject context, IfSentence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.IF_SENTENCE__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.IF_SENTENCE__COND));
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.IF_SENTENCE__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.IF_SENTENCE__BODY));
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.IF_SENTENCE__ELSEBODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.IF_SENTENCE__ELSEBODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfSentenceAccess().getCondComplexExpressionParserRuleCall_1_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getIfSentenceAccess().getBodyComplexExpressionParserRuleCall_3_0(), semanticObject.getBody());
		feeder.accept(grammarAccess.getIfSentenceAccess().getElsebodyComplexExpressionParserRuleCall_5_0(), semanticObject.getElsebody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (inElem=ID className=ID)
	 */
	protected void sequence_InPattern(EObject context, InPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.IN_PATTERN__IN_ELEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.IN_PATTERN__IN_ELEM));
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.IN_PATTERN__CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.IN_PATTERN__CLASS_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInPatternAccess().getInElemIDTerminalRuleCall_0_0(), semanticObject.getInElem());
		feeder.accept(grammarAccess.getInPatternAccess().getClassNameIDTerminalRuleCall_2_0(), semanticObject.getClassName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     index=INT
	 */
	protected void sequence_IndexOfOp(EObject context, IndexOfOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.INDEX_OF_OP__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.INDEX_OF_OP__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIndexOfOpAccess().getIndexINTTerminalRuleCall_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=ComplexExpression
	 */
	protected void sequence_IntersectionOp(EObject context, IntersectionOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.INTERSECTION_OP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.INTERSECTION_OP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntersectionOpAccess().getExpComplexExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     className=ID
	 */
	protected void sequence_IsTypeOfOp(EObject context, IsTypeOfOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.IS_TYPE_OF_OP__CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.IS_TYPE_OF_OP__CLASS_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsTypeOfOpAccess().getClassNameIDTerminalRuleCall_2_0(), semanticObject.getClassName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     rules+=Rule*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attr=ID navigation+=Navigation*)
	 */
	protected void sequence_Navig(EObject context, Navig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attName=ID | assocRole=AssocRoleName | opType1=OCLOperationType1 | opType2=OCLOperationType2)
	 */
	protected void sequence_Navigation(EObject context, Navigation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (allIns=AllInstancesOp | isTypeOf=IsTypeOfOp | toString=ToStringOp | concatenate=ConcatOp)
	 */
	protected void sequence_OCLOperationType1(EObject context, OCLOperationType1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         size=SizeOp | 
	 *         forall=ForAllOp | 
	 *         exists=ExistsOp | 
	 *         select=SelectOp | 
	 *         collect=CollectOp | 
	 *         first=FirstOp | 
	 *         last=LastOp | 
	 *         indexOf=IndexOfOp | 
	 *         union=UnionOp | 
	 *         intersection=IntersectionOp | 
	 *         isUndefined=IsUndefinedOp
	 *     )
	 */
	protected void sequence_OCLOperationType2(EObject context, OCLOperationType2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varName=ID className=ID assg+=Assignation*)
	 */
	protected void sequence_OutPattern(EObject context, OutPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=ComplexExpression position=INT?)
	 */
	protected void sequence_ResolveExp(EObject context, ResolveExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID inPatterns+=InPattern+ filter=Filter? outPatterns+=OutPattern+)
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=ID exp=ComplexExpression)
	 */
	protected void sequence_SelectOp(EObject context, SelectOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.SELECT_OP__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.SELECT_OP__VAR));
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.SELECT_OP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.SELECT_OP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectOpAccess().getVarIDTerminalRuleCall_2_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getSelectOpAccess().getExpComplexExpressionParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         _string=STRING | 
	 *         _integer=INT | 
	 *         _double=DOUBLE | 
	 *         _boolean=BOOLEAN | 
	 *         isNull='null' | 
	 *         navigation=Navig | 
	 *         ifSentence=IfSentence | 
	 *         (colectionType=CollectionType elems+=ComplexExpression* nav+=Navigation*) | 
	 *         resolve=ResolveExp
	 *     )
	 */
	protected void sequence_SimpleExpression(EObject context, SimpleExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp=ComplexExpression
	 */
	protected void sequence_UnionOp(EObject context, UnionOp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MTLPackage.Literals.UNION_OP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MTLPackage.Literals.UNION_OP__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnionOpAccess().getExpComplexExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
}
