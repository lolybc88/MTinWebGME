/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.webgme.mTL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MTLFactoryImpl extends EFactoryImpl implements MTLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MTLFactory init()
  {
    try
    {
      MTLFactory theMTLFactory = (MTLFactory)EPackage.Registry.INSTANCE.getEFactory(MTLPackage.eNS_URI);
      if (theMTLFactory != null)
      {
        return theMTLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MTLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MTLPackage.MODEL: return createModel();
      case MTLPackage.RULE: return createRule();
      case MTLPackage.IN_PATTERN: return createInPattern();
      case MTLPackage.FILTER: return createFilter();
      case MTLPackage.OUT_PATTERN: return createOutPattern();
      case MTLPackage.ASSIGNATION: return createAssignation();
      case MTLPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case MTLPackage.NAVIG: return createNavig();
      case MTLPackage.NAVIGATION: return createNavigation();
      case MTLPackage.IF_SENTENCE: return createIfSentence();
      case MTLPackage.RESOLVE_EXP: return createResolveExp();
      case MTLPackage.COMPLEX_EXPRESSION: return createComplexExpression();
      case MTLPackage.ASSOC_ROLE_NAME: return createAssocRoleName();
      case MTLPackage.OCL_OPERATION_TYPE1: return createOCLOperationType1();
      case MTLPackage.OCL_OPERATION_TYPE2: return createOCLOperationType2();
      case MTLPackage.INDEX_OF_OP: return createIndexOfOp();
      case MTLPackage.FOR_ALL_OP: return createForAllOp();
      case MTLPackage.EXISTS_OP: return createExistsOp();
      case MTLPackage.SELECT_OP: return createSelectOp();
      case MTLPackage.COLLECT_OP: return createCollectOp();
      case MTLPackage.IS_TYPE_OF_OP: return createIsTypeOfOp();
      case MTLPackage.CONCAT_OP: return createConcatOp();
      case MTLPackage.UNION_OP: return createUnionOp();
      case MTLPackage.INTERSECTION_OP: return createIntersectionOp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InPattern createInPattern()
  {
    InPatternImpl inPattern = new InPatternImpl();
    return inPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutPattern createOutPattern()
  {
    OutPatternImpl outPattern = new OutPatternImpl();
    return outPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignation createAssignation()
  {
    AssignationImpl assignation = new AssignationImpl();
    return assignation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navig createNavig()
  {
    NavigImpl navig = new NavigImpl();
    return navig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navigation createNavigation()
  {
    NavigationImpl navigation = new NavigationImpl();
    return navigation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSentence createIfSentence()
  {
    IfSentenceImpl ifSentence = new IfSentenceImpl();
    return ifSentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResolveExp createResolveExp()
  {
    ResolveExpImpl resolveExp = new ResolveExpImpl();
    return resolveExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression createComplexExpression()
  {
    ComplexExpressionImpl complexExpression = new ComplexExpressionImpl();
    return complexExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssocRoleName createAssocRoleName()
  {
    AssocRoleNameImpl assocRoleName = new AssocRoleNameImpl();
    return assocRoleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLOperationType1 createOCLOperationType1()
  {
    OCLOperationType1Impl oclOperationType1 = new OCLOperationType1Impl();
    return oclOperationType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLOperationType2 createOCLOperationType2()
  {
    OCLOperationType2Impl oclOperationType2 = new OCLOperationType2Impl();
    return oclOperationType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexOfOp createIndexOfOp()
  {
    IndexOfOpImpl indexOfOp = new IndexOfOpImpl();
    return indexOfOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAllOp createForAllOp()
  {
    ForAllOpImpl forAllOp = new ForAllOpImpl();
    return forAllOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistsOp createExistsOp()
  {
    ExistsOpImpl existsOp = new ExistsOpImpl();
    return existsOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectOp createSelectOp()
  {
    SelectOpImpl selectOp = new SelectOpImpl();
    return selectOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectOp createCollectOp()
  {
    CollectOpImpl collectOp = new CollectOpImpl();
    return collectOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsTypeOfOp createIsTypeOfOp()
  {
    IsTypeOfOpImpl isTypeOfOp = new IsTypeOfOpImpl();
    return isTypeOfOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcatOp createConcatOp()
  {
    ConcatOpImpl concatOp = new ConcatOpImpl();
    return concatOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionOp createUnionOp()
  {
    UnionOpImpl unionOp = new UnionOpImpl();
    return unionOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntersectionOp createIntersectionOp()
  {
    IntersectionOpImpl intersectionOp = new IntersectionOpImpl();
    return intersectionOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLPackage getMTLPackage()
  {
    return (MTLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MTLPackage getPackage()
  {
    return MTLPackage.eINSTANCE;
  }

} //MTLFactoryImpl
