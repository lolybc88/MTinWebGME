/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.webgme.mTL.MTLFactory
 * @model kind="package"
 * @generated
 */
public interface MTLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mTL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/webgme/MTL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mTL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MTLPackage eINSTANCE = org.xtext.example.webgme.mTL.impl.MTLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.ModelImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.RuleImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getRule()
   * @generated
   */
  int RULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>In Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__IN_PATTERNS = 1;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__FILTER = 2;

  /**
   * The feature id for the '<em><b>Out Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__OUT_PATTERNS = 3;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.InPatternImpl <em>In Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.InPatternImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getInPattern()
   * @generated
   */
  int IN_PATTERN = 2;

  /**
   * The feature id for the '<em><b>In Elem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_PATTERN__IN_ELEM = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_PATTERN__CLASS_NAME = 1;

  /**
   * The number of structural features of the '<em>In Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_PATTERN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.FilterImpl <em>Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.FilterImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getFilter()
   * @generated
   */
  int FILTER = 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__EXPR = 0;

  /**
   * The number of structural features of the '<em>Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.OutPatternImpl <em>Out Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.OutPatternImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getOutPattern()
   * @generated
   */
  int OUT_PATTERN = 4;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_PATTERN__VAR_NAME = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_PATTERN__CLASS_NAME = 1;

  /**
   * The feature id for the '<em><b>Assg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_PATTERN__ASSG = 2;

  /**
   * The number of structural features of the '<em>Out Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_PATTERN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.AssignationImpl <em>Assignation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.AssignationImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getAssignation()
   * @generated
   */
  int ASSIGNATION = 5;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__EXPR = 1;

  /**
   * The feature id for the '<em><b>Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION__RELATIONSHIP = 2;

  /**
   * The number of structural features of the '<em>Assignation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getSimpleExpression()
   * @generated
   */
  int SIMPLE_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>string</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__STRING = 0;

  /**
   * The feature id for the '<em><b>integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__INTEGER = 1;

  /**
   * The feature id for the '<em><b>double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__DOUBLE = 2;

  /**
   * The feature id for the '<em><b>boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__BOOLEAN = 3;

  /**
   * The feature id for the '<em><b>Is Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__IS_NULL = 4;

  /**
   * The feature id for the '<em><b>Navigation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__NAVIGATION = 5;

  /**
   * The feature id for the '<em><b>If Sentence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__IF_SENTENCE = 6;

  /**
   * The feature id for the '<em><b>Colection Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__COLECTION_TYPE = 7;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__ELEMS = 8;

  /**
   * The feature id for the '<em><b>Nav</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__NAV = 9;

  /**
   * The feature id for the '<em><b>Resolve</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__RESOLVE = 10;

  /**
   * The number of structural features of the '<em>Simple Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.NavigImpl <em>Navig</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.NavigImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getNavig()
   * @generated
   */
  int NAVIG = 7;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIG__ATTR = 0;

  /**
   * The feature id for the '<em><b>Navigation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIG__NAVIGATION = 1;

  /**
   * The number of structural features of the '<em>Navig</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.NavigationImpl <em>Navigation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.NavigationImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getNavigation()
   * @generated
   */
  int NAVIGATION = 8;

  /**
   * The feature id for the '<em><b>Att Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION__ATT_NAME = 0;

  /**
   * The feature id for the '<em><b>Assoc Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION__ASSOC_ROLE = 1;

  /**
   * The feature id for the '<em><b>Op Type1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION__OP_TYPE1 = 2;

  /**
   * The feature id for the '<em><b>Op Type2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION__OP_TYPE2 = 3;

  /**
   * The number of structural features of the '<em>Navigation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.IfSentenceImpl <em>If Sentence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.IfSentenceImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIfSentence()
   * @generated
   */
  int IF_SENTENCE = 9;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SENTENCE__COND = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SENTENCE__BODY = 1;

  /**
   * The feature id for the '<em><b>Elsebody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SENTENCE__ELSEBODY = 2;

  /**
   * The number of structural features of the '<em>If Sentence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SENTENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.ResolveExpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getResolveExp()
   * @generated
   */
  int RESOLVE_EXP = 10;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP__EXP = 0;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP__POSITION = 1;

  /**
   * The number of structural features of the '<em>Resolve Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOLVE_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getComplexExpression()
   * @generated
   */
  int COMPLEX_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Prefix Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_EXPRESSION__PREFIX_NOT = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_EXPRESSION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Infix Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_EXPRESSION__INFIX_OP = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_EXPRESSION__RIGHT = 3;

  /**
   * The number of structural features of the '<em>Complex Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.AssocRoleNameImpl <em>Assoc Role Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.AssocRoleNameImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getAssocRoleName()
   * @generated
   */
  int ASSOC_ROLE_NAME = 12;

  /**
   * The feature id for the '<em><b>Children</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOC_ROLE_NAME__CHILDREN = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOC_ROLE_NAME__PARENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOC_ROLE_NAME__NAME = 2;

  /**
   * The number of structural features of the '<em>Assoc Role Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOC_ROLE_NAME_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl <em>OCL Operation Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getOCLOperationType1()
   * @generated
   */
  int OCL_OPERATION_TYPE1 = 13;

  /**
   * The feature id for the '<em><b>All Ins</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE1__ALL_INS = 0;

  /**
   * The feature id for the '<em><b>Is Type Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE1__IS_TYPE_OF = 1;

  /**
   * The feature id for the '<em><b>To String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE1__TO_STRING = 2;

  /**
   * The feature id for the '<em><b>Concatenate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE1__CONCATENATE = 3;

  /**
   * The number of structural features of the '<em>OCL Operation Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE1_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl <em>OCL Operation Type2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getOCLOperationType2()
   * @generated
   */
  int OCL_OPERATION_TYPE2 = 14;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__SIZE = 0;

  /**
   * The feature id for the '<em><b>Forall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__FORALL = 1;

  /**
   * The feature id for the '<em><b>Exists</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__EXISTS = 2;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__SELECT = 3;

  /**
   * The feature id for the '<em><b>Collect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__COLLECT = 4;

  /**
   * The feature id for the '<em><b>First</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__FIRST = 5;

  /**
   * The feature id for the '<em><b>Last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__LAST = 6;

  /**
   * The feature id for the '<em><b>Index Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__INDEX_OF = 7;

  /**
   * The feature id for the '<em><b>Union</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__UNION = 8;

  /**
   * The feature id for the '<em><b>Intersection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__INTERSECTION = 9;

  /**
   * The feature id for the '<em><b>Is Undefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2__IS_UNDEFINED = 10;

  /**
   * The number of structural features of the '<em>OCL Operation Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_OPERATION_TYPE2_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.IndexOfOpImpl <em>Index Of Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.IndexOfOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIndexOfOp()
   * @generated
   */
  int INDEX_OF_OP = 15;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_OF_OP__INDEX = 0;

  /**
   * The number of structural features of the '<em>Index Of Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_OF_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.ForAllOpImpl <em>For All Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.ForAllOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getForAllOp()
   * @generated
   */
  int FOR_ALL_OP = 16;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OP__VAR = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OP__EXP = 1;

  /**
   * The number of structural features of the '<em>For All Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_OP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.ExistsOpImpl <em>Exists Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.ExistsOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getExistsOp()
   * @generated
   */
  int EXISTS_OP = 17;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_OP__VAR = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_OP__EXP = 1;

  /**
   * The number of structural features of the '<em>Exists Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_OP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.SelectOpImpl <em>Select Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.SelectOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getSelectOp()
   * @generated
   */
  int SELECT_OP = 18;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OP__VAR = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OP__EXP = 1;

  /**
   * The number of structural features of the '<em>Select Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_OP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.CollectOpImpl <em>Collect Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.CollectOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getCollectOp()
   * @generated
   */
  int COLLECT_OP = 19;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OP__VAR = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OP__EXP = 1;

  /**
   * The number of structural features of the '<em>Collect Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECT_OP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.IsTypeOfOpImpl <em>Is Type Of Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.IsTypeOfOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIsTypeOfOp()
   * @generated
   */
  int IS_TYPE_OF_OP = 20;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_TYPE_OF_OP__CLASS_NAME = 0;

  /**
   * The number of structural features of the '<em>Is Type Of Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_TYPE_OF_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.ConcatOpImpl <em>Concat Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.ConcatOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getConcatOp()
   * @generated
   */
  int CONCAT_OP = 21;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT_OP__S = 0;

  /**
   * The number of structural features of the '<em>Concat Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.UnionOpImpl <em>Union Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.UnionOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getUnionOp()
   * @generated
   */
  int UNION_OP = 22;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_OP__EXP = 0;

  /**
   * The number of structural features of the '<em>Union Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.webgme.mTL.impl.IntersectionOpImpl <em>Intersection Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.webgme.mTL.impl.IntersectionOpImpl
   * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIntersectionOp()
   * @generated
   */
  int INTERSECTION_OP = 23;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECTION_OP__EXP = 0;

  /**
   * The number of structural features of the '<em>Intersection Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECTION_OP_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.webgme.mTL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.xtext.example.webgme.mTL.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.xtext.example.webgme.mTL.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.webgme.mTL.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.Rule#getInPatterns <em>In Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>In Patterns</em>'.
   * @see org.xtext.example.webgme.mTL.Rule#getInPatterns()
   * @see #getRule()
   * @generated
   */
  EReference getRule_InPatterns();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.Rule#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.xtext.example.webgme.mTL.Rule#getFilter()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Filter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.Rule#getOutPatterns <em>Out Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Out Patterns</em>'.
   * @see org.xtext.example.webgme.mTL.Rule#getOutPatterns()
   * @see #getRule()
   * @generated
   */
  EReference getRule_OutPatterns();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.InPattern <em>In Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Pattern</em>'.
   * @see org.xtext.example.webgme.mTL.InPattern
   * @generated
   */
  EClass getInPattern();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.InPattern#getInElem <em>In Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>In Elem</em>'.
   * @see org.xtext.example.webgme.mTL.InPattern#getInElem()
   * @see #getInPattern()
   * @generated
   */
  EAttribute getInPattern_InElem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.InPattern#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.webgme.mTL.InPattern#getClassName()
   * @see #getInPattern()
   * @generated
   */
  EAttribute getInPattern_ClassName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter</em>'.
   * @see org.xtext.example.webgme.mTL.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.Filter#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.webgme.mTL.Filter#getExpr()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.OutPattern <em>Out Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Pattern</em>'.
   * @see org.xtext.example.webgme.mTL.OutPattern
   * @generated
   */
  EClass getOutPattern();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OutPattern#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see org.xtext.example.webgme.mTL.OutPattern#getVarName()
   * @see #getOutPattern()
   * @generated
   */
  EAttribute getOutPattern_VarName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OutPattern#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.webgme.mTL.OutPattern#getClassName()
   * @see #getOutPattern()
   * @generated
   */
  EAttribute getOutPattern_ClassName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.OutPattern#getAssg <em>Assg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assg</em>'.
   * @see org.xtext.example.webgme.mTL.OutPattern#getAssg()
   * @see #getOutPattern()
   * @generated
   */
  EReference getOutPattern_Assg();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.Assignation <em>Assignation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignation</em>'.
   * @see org.xtext.example.webgme.mTL.Assignation
   * @generated
   */
  EClass getAssignation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.Assignation#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see org.xtext.example.webgme.mTL.Assignation#getAttribute()
   * @see #getAssignation()
   * @generated
   */
  EAttribute getAssignation_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.Assignation#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.webgme.mTL.Assignation#getExpr()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.Assignation#getRelationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relationship</em>'.
   * @see org.xtext.example.webgme.mTL.Assignation#getRelationship()
   * @see #getAssignation()
   * @generated
   */
  EReference getAssignation_Relationship();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Expression</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression
   * @generated
   */
  EClass getSimpleExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.SimpleExpression#get_string <em>string</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>string</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#get_string()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression__string();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.SimpleExpression#get_integer <em>integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>integer</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#get_integer()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression__integer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.SimpleExpression#get_double <em>double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>double</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#get_double()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression__double();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.SimpleExpression#get_boolean <em>boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>boolean</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#get_boolean()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression__boolean();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.SimpleExpression#getIsNull <em>Is Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Null</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#getIsNull()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression_IsNull();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.SimpleExpression#getNavigation <em>Navigation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Navigation</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#getNavigation()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Navigation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.SimpleExpression#getIfSentence <em>If Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sentence</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#getIfSentence()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_IfSentence();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.SimpleExpression#getColectionType <em>Colection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Colection Type</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#getColectionType()
   * @see #getSimpleExpression()
   * @generated
   */
  EAttribute getSimpleExpression_ColectionType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.SimpleExpression#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elems</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#getElems()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Elems();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.SimpleExpression#getNav <em>Nav</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nav</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#getNav()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Nav();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.SimpleExpression#getResolve <em>Resolve</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resolve</em>'.
   * @see org.xtext.example.webgme.mTL.SimpleExpression#getResolve()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Resolve();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.Navig <em>Navig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navig</em>'.
   * @see org.xtext.example.webgme.mTL.Navig
   * @generated
   */
  EClass getNavig();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.Navig#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attr</em>'.
   * @see org.xtext.example.webgme.mTL.Navig#getAttr()
   * @see #getNavig()
   * @generated
   */
  EAttribute getNavig_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.Navig#getNavigation <em>Navigation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Navigation</em>'.
   * @see org.xtext.example.webgme.mTL.Navig#getNavigation()
   * @see #getNavig()
   * @generated
   */
  EReference getNavig_Navigation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.Navigation <em>Navigation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigation</em>'.
   * @see org.xtext.example.webgme.mTL.Navigation
   * @generated
   */
  EClass getNavigation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.Navigation#getAttName <em>Att Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att Name</em>'.
   * @see org.xtext.example.webgme.mTL.Navigation#getAttName()
   * @see #getNavigation()
   * @generated
   */
  EAttribute getNavigation_AttName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.Navigation#getAssocRole <em>Assoc Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assoc Role</em>'.
   * @see org.xtext.example.webgme.mTL.Navigation#getAssocRole()
   * @see #getNavigation()
   * @generated
   */
  EReference getNavigation_AssocRole();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.Navigation#getOpType1 <em>Op Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Type1</em>'.
   * @see org.xtext.example.webgme.mTL.Navigation#getOpType1()
   * @see #getNavigation()
   * @generated
   */
  EReference getNavigation_OpType1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.Navigation#getOpType2 <em>Op Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Type2</em>'.
   * @see org.xtext.example.webgme.mTL.Navigation#getOpType2()
   * @see #getNavigation()
   * @generated
   */
  EReference getNavigation_OpType2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.IfSentence <em>If Sentence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Sentence</em>'.
   * @see org.xtext.example.webgme.mTL.IfSentence
   * @generated
   */
  EClass getIfSentence();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.IfSentence#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.xtext.example.webgme.mTL.IfSentence#getCond()
   * @see #getIfSentence()
   * @generated
   */
  EReference getIfSentence_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.IfSentence#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.example.webgme.mTL.IfSentence#getBody()
   * @see #getIfSentence()
   * @generated
   */
  EReference getIfSentence_Body();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.IfSentence#getElsebody <em>Elsebody</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elsebody</em>'.
   * @see org.xtext.example.webgme.mTL.IfSentence#getElsebody()
   * @see #getIfSentence()
   * @generated
   */
  EReference getIfSentence_Elsebody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.ResolveExp <em>Resolve Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resolve Exp</em>'.
   * @see org.xtext.example.webgme.mTL.ResolveExp
   * @generated
   */
  EClass getResolveExp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.ResolveExp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.webgme.mTL.ResolveExp#getExp()
   * @see #getResolveExp()
   * @generated
   */
  EReference getResolveExp_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.ResolveExp#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.xtext.example.webgme.mTL.ResolveExp#getPosition()
   * @see #getResolveExp()
   * @generated
   */
  EAttribute getResolveExp_Position();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.ComplexExpression <em>Complex Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Expression</em>'.
   * @see org.xtext.example.webgme.mTL.ComplexExpression
   * @generated
   */
  EClass getComplexExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.ComplexExpression#getPrefixNot <em>Prefix Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix Not</em>'.
   * @see org.xtext.example.webgme.mTL.ComplexExpression#getPrefixNot()
   * @see #getComplexExpression()
   * @generated
   */
  EAttribute getComplexExpression_PrefixNot();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.ComplexExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.webgme.mTL.ComplexExpression#getLeft()
   * @see #getComplexExpression()
   * @generated
   */
  EReference getComplexExpression_Left();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.webgme.mTL.ComplexExpression#getInfixOp <em>Infix Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Infix Op</em>'.
   * @see org.xtext.example.webgme.mTL.ComplexExpression#getInfixOp()
   * @see #getComplexExpression()
   * @generated
   */
  EAttribute getComplexExpression_InfixOp();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.webgme.mTL.ComplexExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see org.xtext.example.webgme.mTL.ComplexExpression#getRight()
   * @see #getComplexExpression()
   * @generated
   */
  EReference getComplexExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.AssocRoleName <em>Assoc Role Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assoc Role Name</em>'.
   * @see org.xtext.example.webgme.mTL.AssocRoleName
   * @generated
   */
  EClass getAssocRoleName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.AssocRoleName#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Children</em>'.
   * @see org.xtext.example.webgme.mTL.AssocRoleName#getChildren()
   * @see #getAssocRoleName()
   * @generated
   */
  EAttribute getAssocRoleName_Children();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.AssocRoleName#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent</em>'.
   * @see org.xtext.example.webgme.mTL.AssocRoleName#getParent()
   * @see #getAssocRoleName()
   * @generated
   */
  EAttribute getAssocRoleName_Parent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.AssocRoleName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.webgme.mTL.AssocRoleName#getName()
   * @see #getAssocRoleName()
   * @generated
   */
  EAttribute getAssocRoleName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.OCLOperationType1 <em>OCL Operation Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OCL Operation Type1</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType1
   * @generated
   */
  EClass getOCLOperationType1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getAllIns <em>All Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Ins</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType1#getAllIns()
   * @see #getOCLOperationType1()
   * @generated
   */
  EAttribute getOCLOperationType1_AllIns();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getIsTypeOf <em>Is Type Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Is Type Of</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType1#getIsTypeOf()
   * @see #getOCLOperationType1()
   * @generated
   */
  EReference getOCLOperationType1_IsTypeOf();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getToString <em>To String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To String</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType1#getToString()
   * @see #getOCLOperationType1()
   * @generated
   */
  EAttribute getOCLOperationType1_ToString();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getConcatenate <em>Concatenate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concatenate</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType1#getConcatenate()
   * @see #getOCLOperationType1()
   * @generated
   */
  EReference getOCLOperationType1_Concatenate();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.OCLOperationType2 <em>OCL Operation Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OCL Operation Type2</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2
   * @generated
   */
  EClass getOCLOperationType2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getSize()
   * @see #getOCLOperationType2()
   * @generated
   */
  EAttribute getOCLOperationType2_Size();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getForall <em>Forall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forall</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getForall()
   * @see #getOCLOperationType2()
   * @generated
   */
  EReference getOCLOperationType2_Forall();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getExists <em>Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exists</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getExists()
   * @see #getOCLOperationType2()
   * @generated
   */
  EReference getOCLOperationType2_Exists();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getSelect()
   * @see #getOCLOperationType2()
   * @generated
   */
  EReference getOCLOperationType2_Select();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getCollect <em>Collect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collect</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getCollect()
   * @see #getOCLOperationType2()
   * @generated
   */
  EReference getOCLOperationType2_Collect();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getFirst()
   * @see #getOCLOperationType2()
   * @generated
   */
  EAttribute getOCLOperationType2_First();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getLast <em>Last</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getLast()
   * @see #getOCLOperationType2()
   * @generated
   */
  EAttribute getOCLOperationType2_Last();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIndexOf <em>Index Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Of</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getIndexOf()
   * @see #getOCLOperationType2()
   * @generated
   */
  EReference getOCLOperationType2_IndexOf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getUnion <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Union</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getUnion()
   * @see #getOCLOperationType2()
   * @generated
   */
  EReference getOCLOperationType2_Union();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIntersection <em>Intersection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intersection</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getIntersection()
   * @see #getOCLOperationType2()
   * @generated
   */
  EReference getOCLOperationType2_Intersection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIsUndefined <em>Is Undefined</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Undefined</em>'.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2#getIsUndefined()
   * @see #getOCLOperationType2()
   * @generated
   */
  EAttribute getOCLOperationType2_IsUndefined();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.IndexOfOp <em>Index Of Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Index Of Op</em>'.
   * @see org.xtext.example.webgme.mTL.IndexOfOp
   * @generated
   */
  EClass getIndexOfOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.IndexOfOp#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.xtext.example.webgme.mTL.IndexOfOp#getIndex()
   * @see #getIndexOfOp()
   * @generated
   */
  EAttribute getIndexOfOp_Index();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.ForAllOp <em>For All Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For All Op</em>'.
   * @see org.xtext.example.webgme.mTL.ForAllOp
   * @generated
   */
  EClass getForAllOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.ForAllOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.webgme.mTL.ForAllOp#getVar()
   * @see #getForAllOp()
   * @generated
   */
  EAttribute getForAllOp_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.ForAllOp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.webgme.mTL.ForAllOp#getExp()
   * @see #getForAllOp()
   * @generated
   */
  EReference getForAllOp_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.ExistsOp <em>Exists Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exists Op</em>'.
   * @see org.xtext.example.webgme.mTL.ExistsOp
   * @generated
   */
  EClass getExistsOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.ExistsOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.webgme.mTL.ExistsOp#getVar()
   * @see #getExistsOp()
   * @generated
   */
  EAttribute getExistsOp_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.ExistsOp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.webgme.mTL.ExistsOp#getExp()
   * @see #getExistsOp()
   * @generated
   */
  EReference getExistsOp_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.SelectOp <em>Select Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Op</em>'.
   * @see org.xtext.example.webgme.mTL.SelectOp
   * @generated
   */
  EClass getSelectOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.SelectOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.webgme.mTL.SelectOp#getVar()
   * @see #getSelectOp()
   * @generated
   */
  EAttribute getSelectOp_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.SelectOp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.webgme.mTL.SelectOp#getExp()
   * @see #getSelectOp()
   * @generated
   */
  EReference getSelectOp_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.CollectOp <em>Collect Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collect Op</em>'.
   * @see org.xtext.example.webgme.mTL.CollectOp
   * @generated
   */
  EClass getCollectOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.CollectOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see org.xtext.example.webgme.mTL.CollectOp#getVar()
   * @see #getCollectOp()
   * @generated
   */
  EAttribute getCollectOp_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.CollectOp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.webgme.mTL.CollectOp#getExp()
   * @see #getCollectOp()
   * @generated
   */
  EReference getCollectOp_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.IsTypeOfOp <em>Is Type Of Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Is Type Of Op</em>'.
   * @see org.xtext.example.webgme.mTL.IsTypeOfOp
   * @generated
   */
  EClass getIsTypeOfOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.IsTypeOfOp#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.webgme.mTL.IsTypeOfOp#getClassName()
   * @see #getIsTypeOfOp()
   * @generated
   */
  EAttribute getIsTypeOfOp_ClassName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.ConcatOp <em>Concat Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concat Op</em>'.
   * @see org.xtext.example.webgme.mTL.ConcatOp
   * @generated
   */
  EClass getConcatOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.webgme.mTL.ConcatOp#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.xtext.example.webgme.mTL.ConcatOp#getS()
   * @see #getConcatOp()
   * @generated
   */
  EAttribute getConcatOp_S();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.UnionOp <em>Union Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Op</em>'.
   * @see org.xtext.example.webgme.mTL.UnionOp
   * @generated
   */
  EClass getUnionOp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.UnionOp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.webgme.mTL.UnionOp#getExp()
   * @see #getUnionOp()
   * @generated
   */
  EReference getUnionOp_Exp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.webgme.mTL.IntersectionOp <em>Intersection Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intersection Op</em>'.
   * @see org.xtext.example.webgme.mTL.IntersectionOp
   * @generated
   */
  EClass getIntersectionOp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.webgme.mTL.IntersectionOp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.xtext.example.webgme.mTL.IntersectionOp#getExp()
   * @see #getIntersectionOp()
   * @generated
   */
  EReference getIntersectionOp_Exp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MTLFactory getMTLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.ModelImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.RuleImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>In Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__IN_PATTERNS = eINSTANCE.getRule_InPatterns();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__FILTER = eINSTANCE.getRule_Filter();

    /**
     * The meta object literal for the '<em><b>Out Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__OUT_PATTERNS = eINSTANCE.getRule_OutPatterns();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.InPatternImpl <em>In Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.InPatternImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getInPattern()
     * @generated
     */
    EClass IN_PATTERN = eINSTANCE.getInPattern();

    /**
     * The meta object literal for the '<em><b>In Elem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_PATTERN__IN_ELEM = eINSTANCE.getInPattern_InElem();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_PATTERN__CLASS_NAME = eINSTANCE.getInPattern_ClassName();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.FilterImpl <em>Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.FilterImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getFilter()
     * @generated
     */
    EClass FILTER = eINSTANCE.getFilter();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER__EXPR = eINSTANCE.getFilter_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.OutPatternImpl <em>Out Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.OutPatternImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getOutPattern()
     * @generated
     */
    EClass OUT_PATTERN = eINSTANCE.getOutPattern();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT_PATTERN__VAR_NAME = eINSTANCE.getOutPattern_VarName();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT_PATTERN__CLASS_NAME = eINSTANCE.getOutPattern_ClassName();

    /**
     * The meta object literal for the '<em><b>Assg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_PATTERN__ASSG = eINSTANCE.getOutPattern_Assg();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.AssignationImpl <em>Assignation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.AssignationImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getAssignation()
     * @generated
     */
    EClass ASSIGNATION = eINSTANCE.getAssignation();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNATION__ATTRIBUTE = eINSTANCE.getAssignation_Attribute();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__EXPR = eINSTANCE.getAssignation_Expr();

    /**
     * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNATION__RELATIONSHIP = eINSTANCE.getAssignation_Relationship();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getSimpleExpression()
     * @generated
     */
    EClass SIMPLE_EXPRESSION = eINSTANCE.getSimpleExpression();

    /**
     * The meta object literal for the '<em><b>string</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__STRING = eINSTANCE.getSimpleExpression__string();

    /**
     * The meta object literal for the '<em><b>integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__INTEGER = eINSTANCE.getSimpleExpression__integer();

    /**
     * The meta object literal for the '<em><b>double</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__DOUBLE = eINSTANCE.getSimpleExpression__double();

    /**
     * The meta object literal for the '<em><b>boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__BOOLEAN = eINSTANCE.getSimpleExpression__boolean();

    /**
     * The meta object literal for the '<em><b>Is Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__IS_NULL = eINSTANCE.getSimpleExpression_IsNull();

    /**
     * The meta object literal for the '<em><b>Navigation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__NAVIGATION = eINSTANCE.getSimpleExpression_Navigation();

    /**
     * The meta object literal for the '<em><b>If Sentence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__IF_SENTENCE = eINSTANCE.getSimpleExpression_IfSentence();

    /**
     * The meta object literal for the '<em><b>Colection Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_EXPRESSION__COLECTION_TYPE = eINSTANCE.getSimpleExpression_ColectionType();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__ELEMS = eINSTANCE.getSimpleExpression_Elems();

    /**
     * The meta object literal for the '<em><b>Nav</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__NAV = eINSTANCE.getSimpleExpression_Nav();

    /**
     * The meta object literal for the '<em><b>Resolve</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__RESOLVE = eINSTANCE.getSimpleExpression_Resolve();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.NavigImpl <em>Navig</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.NavigImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getNavig()
     * @generated
     */
    EClass NAVIG = eINSTANCE.getNavig();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAVIG__ATTR = eINSTANCE.getNavig_Attr();

    /**
     * The meta object literal for the '<em><b>Navigation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIG__NAVIGATION = eINSTANCE.getNavig_Navigation();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.NavigationImpl <em>Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.NavigationImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getNavigation()
     * @generated
     */
    EClass NAVIGATION = eINSTANCE.getNavigation();

    /**
     * The meta object literal for the '<em><b>Att Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAVIGATION__ATT_NAME = eINSTANCE.getNavigation_AttName();

    /**
     * The meta object literal for the '<em><b>Assoc Role</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION__ASSOC_ROLE = eINSTANCE.getNavigation_AssocRole();

    /**
     * The meta object literal for the '<em><b>Op Type1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION__OP_TYPE1 = eINSTANCE.getNavigation_OpType1();

    /**
     * The meta object literal for the '<em><b>Op Type2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION__OP_TYPE2 = eINSTANCE.getNavigation_OpType2();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.IfSentenceImpl <em>If Sentence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.IfSentenceImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIfSentence()
     * @generated
     */
    EClass IF_SENTENCE = eINSTANCE.getIfSentence();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SENTENCE__COND = eINSTANCE.getIfSentence_Cond();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SENTENCE__BODY = eINSTANCE.getIfSentence_Body();

    /**
     * The meta object literal for the '<em><b>Elsebody</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SENTENCE__ELSEBODY = eINSTANCE.getIfSentence_Elsebody();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.ResolveExpImpl <em>Resolve Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.ResolveExpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getResolveExp()
     * @generated
     */
    EClass RESOLVE_EXP = eINSTANCE.getResolveExp();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOLVE_EXP__EXP = eINSTANCE.getResolveExp_Exp();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOLVE_EXP__POSITION = eINSTANCE.getResolveExp_Position();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl <em>Complex Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getComplexExpression()
     * @generated
     */
    EClass COMPLEX_EXPRESSION = eINSTANCE.getComplexExpression();

    /**
     * The meta object literal for the '<em><b>Prefix Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_EXPRESSION__PREFIX_NOT = eINSTANCE.getComplexExpression_PrefixNot();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_EXPRESSION__LEFT = eINSTANCE.getComplexExpression_Left();

    /**
     * The meta object literal for the '<em><b>Infix Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_EXPRESSION__INFIX_OP = eINSTANCE.getComplexExpression_InfixOp();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_EXPRESSION__RIGHT = eINSTANCE.getComplexExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.AssocRoleNameImpl <em>Assoc Role Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.AssocRoleNameImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getAssocRoleName()
     * @generated
     */
    EClass ASSOC_ROLE_NAME = eINSTANCE.getAssocRoleName();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOC_ROLE_NAME__CHILDREN = eINSTANCE.getAssocRoleName_Children();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOC_ROLE_NAME__PARENT = eINSTANCE.getAssocRoleName_Parent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOC_ROLE_NAME__NAME = eINSTANCE.getAssocRoleName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl <em>OCL Operation Type1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getOCLOperationType1()
     * @generated
     */
    EClass OCL_OPERATION_TYPE1 = eINSTANCE.getOCLOperationType1();

    /**
     * The meta object literal for the '<em><b>All Ins</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_OPERATION_TYPE1__ALL_INS = eINSTANCE.getOCLOperationType1_AllIns();

    /**
     * The meta object literal for the '<em><b>Is Type Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE1__IS_TYPE_OF = eINSTANCE.getOCLOperationType1_IsTypeOf();

    /**
     * The meta object literal for the '<em><b>To String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_OPERATION_TYPE1__TO_STRING = eINSTANCE.getOCLOperationType1_ToString();

    /**
     * The meta object literal for the '<em><b>Concatenate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE1__CONCATENATE = eINSTANCE.getOCLOperationType1_Concatenate();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl <em>OCL Operation Type2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getOCLOperationType2()
     * @generated
     */
    EClass OCL_OPERATION_TYPE2 = eINSTANCE.getOCLOperationType2();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_OPERATION_TYPE2__SIZE = eINSTANCE.getOCLOperationType2_Size();

    /**
     * The meta object literal for the '<em><b>Forall</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE2__FORALL = eINSTANCE.getOCLOperationType2_Forall();

    /**
     * The meta object literal for the '<em><b>Exists</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE2__EXISTS = eINSTANCE.getOCLOperationType2_Exists();

    /**
     * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE2__SELECT = eINSTANCE.getOCLOperationType2_Select();

    /**
     * The meta object literal for the '<em><b>Collect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE2__COLLECT = eINSTANCE.getOCLOperationType2_Collect();

    /**
     * The meta object literal for the '<em><b>First</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_OPERATION_TYPE2__FIRST = eINSTANCE.getOCLOperationType2_First();

    /**
     * The meta object literal for the '<em><b>Last</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_OPERATION_TYPE2__LAST = eINSTANCE.getOCLOperationType2_Last();

    /**
     * The meta object literal for the '<em><b>Index Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE2__INDEX_OF = eINSTANCE.getOCLOperationType2_IndexOf();

    /**
     * The meta object literal for the '<em><b>Union</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE2__UNION = eINSTANCE.getOCLOperationType2_Union();

    /**
     * The meta object literal for the '<em><b>Intersection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL_OPERATION_TYPE2__INTERSECTION = eINSTANCE.getOCLOperationType2_Intersection();

    /**
     * The meta object literal for the '<em><b>Is Undefined</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCL_OPERATION_TYPE2__IS_UNDEFINED = eINSTANCE.getOCLOperationType2_IsUndefined();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.IndexOfOpImpl <em>Index Of Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.IndexOfOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIndexOfOp()
     * @generated
     */
    EClass INDEX_OF_OP = eINSTANCE.getIndexOfOp();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDEX_OF_OP__INDEX = eINSTANCE.getIndexOfOp_Index();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.ForAllOpImpl <em>For All Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.ForAllOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getForAllOp()
     * @generated
     */
    EClass FOR_ALL_OP = eINSTANCE.getForAllOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_OP__VAR = eINSTANCE.getForAllOp_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ALL_OP__EXP = eINSTANCE.getForAllOp_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.ExistsOpImpl <em>Exists Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.ExistsOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getExistsOp()
     * @generated
     */
    EClass EXISTS_OP = eINSTANCE.getExistsOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXISTS_OP__VAR = eINSTANCE.getExistsOp_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXISTS_OP__EXP = eINSTANCE.getExistsOp_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.SelectOpImpl <em>Select Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.SelectOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getSelectOp()
     * @generated
     */
    EClass SELECT_OP = eINSTANCE.getSelectOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_OP__VAR = eINSTANCE.getSelectOp_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_OP__EXP = eINSTANCE.getSelectOp_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.CollectOpImpl <em>Collect Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.CollectOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getCollectOp()
     * @generated
     */
    EClass COLLECT_OP = eINSTANCE.getCollectOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECT_OP__VAR = eINSTANCE.getCollectOp_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECT_OP__EXP = eINSTANCE.getCollectOp_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.IsTypeOfOpImpl <em>Is Type Of Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.IsTypeOfOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIsTypeOfOp()
     * @generated
     */
    EClass IS_TYPE_OF_OP = eINSTANCE.getIsTypeOfOp();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_TYPE_OF_OP__CLASS_NAME = eINSTANCE.getIsTypeOfOp_ClassName();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.ConcatOpImpl <em>Concat Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.ConcatOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getConcatOp()
     * @generated
     */
    EClass CONCAT_OP = eINSTANCE.getConcatOp();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCAT_OP__S = eINSTANCE.getConcatOp_S();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.UnionOpImpl <em>Union Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.UnionOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getUnionOp()
     * @generated
     */
    EClass UNION_OP = eINSTANCE.getUnionOp();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_OP__EXP = eINSTANCE.getUnionOp_Exp();

    /**
     * The meta object literal for the '{@link org.xtext.example.webgme.mTL.impl.IntersectionOpImpl <em>Intersection Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.webgme.mTL.impl.IntersectionOpImpl
     * @see org.xtext.example.webgme.mTL.impl.MTLPackageImpl#getIntersectionOp()
     * @generated
     */
    EClass INTERSECTION_OP = eINSTANCE.getIntersectionOp();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERSECTION_OP__EXP = eINSTANCE.getIntersectionOp_Exp();

  }

} //MTLPackage
