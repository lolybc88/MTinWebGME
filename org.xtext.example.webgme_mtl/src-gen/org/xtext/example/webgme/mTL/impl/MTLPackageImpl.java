/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import org.xtext.example.webgme.mTL.MTLFactory;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MTLPackageImpl extends EPackageImpl implements MTLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass navigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass navigationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSentenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resolveExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assocRoleNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclOperationType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclOperationType2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indexOfOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forAllOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existsOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isTypeOfOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concatOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unionOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intersectionOpEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.webgme.mTL.MTLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MTLPackageImpl()
  {
    super(eNS_URI, MTLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MTLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MTLPackage init()
  {
    if (isInited) return (MTLPackage)EPackage.Registry.INSTANCE.getEPackage(MTLPackage.eNS_URI);

    // Obtain or create and register package
    MTLPackageImpl theMTLPackage = (MTLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MTLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MTLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMTLPackage.createPackageContents();

    // Initialize created meta-data
    theMTLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMTLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MTLPackage.eNS_URI, theMTLPackage);
    return theMTLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Rules()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Name()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_InPatterns()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Filter()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_OutPatterns()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInPattern()
  {
    return inPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInPattern_InElem()
  {
    return (EAttribute)inPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInPattern_ClassName()
  {
    return (EAttribute)inPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilter()
  {
    return filterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilter_Expr()
  {
    return (EReference)filterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutPattern()
  {
    return outPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutPattern_VarName()
  {
    return (EAttribute)outPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutPattern_ClassName()
  {
    return (EAttribute)outPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutPattern_Assg()
  {
    return (EReference)outPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignation()
  {
    return assignationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignation_Attribute()
  {
    return (EAttribute)assignationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignation_Expr()
  {
    return (EReference)assignationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignation_Relationship()
  {
    return (EReference)assignationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleExpression()
  {
    return simpleExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression__string()
  {
    return (EAttribute)simpleExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression__integer()
  {
    return (EAttribute)simpleExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression__double()
  {
    return (EAttribute)simpleExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression__boolean()
  {
    return (EAttribute)simpleExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression_IsNull()
  {
    return (EAttribute)simpleExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_Navigation()
  {
    return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_IfSentence()
  {
    return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleExpression_ColectionType()
  {
    return (EAttribute)simpleExpressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_Elems()
  {
    return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_Nav()
  {
    return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleExpression_Resolve()
  {
    return (EReference)simpleExpressionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNavig()
  {
    return navigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNavig_Attr()
  {
    return (EAttribute)navigEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavig_Navigation()
  {
    return (EReference)navigEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNavigation()
  {
    return navigationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNavigation_AttName()
  {
    return (EAttribute)navigationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavigation_AssocRole()
  {
    return (EReference)navigationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavigation_OpType1()
  {
    return (EReference)navigationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNavigation_OpType2()
  {
    return (EReference)navigationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSentence()
  {
    return ifSentenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSentence_Cond()
  {
    return (EReference)ifSentenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSentence_Body()
  {
    return (EReference)ifSentenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSentence_Elsebody()
  {
    return (EReference)ifSentenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResolveExp()
  {
    return resolveExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResolveExp_Exp()
  {
    return (EReference)resolveExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResolveExp_Position()
  {
    return (EAttribute)resolveExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexExpression()
  {
    return complexExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexExpression_PrefixNot()
  {
    return (EAttribute)complexExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexExpression_Left()
  {
    return (EReference)complexExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexExpression_InfixOp()
  {
    return (EAttribute)complexExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexExpression_Right()
  {
    return (EReference)complexExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssocRoleName()
  {
    return assocRoleNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssocRoleName_Children()
  {
    return (EAttribute)assocRoleNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssocRoleName_Parent()
  {
    return (EAttribute)assocRoleNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssocRoleName_Name()
  {
    return (EAttribute)assocRoleNameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOCLOperationType1()
  {
    return oclOperationType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLOperationType1_AllIns()
  {
    return (EAttribute)oclOperationType1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType1_IsTypeOf()
  {
    return (EReference)oclOperationType1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLOperationType1_ToString()
  {
    return (EAttribute)oclOperationType1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType1_Concatenate()
  {
    return (EReference)oclOperationType1EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOCLOperationType2()
  {
    return oclOperationType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLOperationType2_Size()
  {
    return (EAttribute)oclOperationType2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType2_Forall()
  {
    return (EReference)oclOperationType2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType2_Exists()
  {
    return (EReference)oclOperationType2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType2_Select()
  {
    return (EReference)oclOperationType2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType2_Collect()
  {
    return (EReference)oclOperationType2EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLOperationType2_First()
  {
    return (EAttribute)oclOperationType2EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLOperationType2_Last()
  {
    return (EAttribute)oclOperationType2EClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType2_IndexOf()
  {
    return (EReference)oclOperationType2EClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType2_Union()
  {
    return (EReference)oclOperationType2EClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLOperationType2_Intersection()
  {
    return (EReference)oclOperationType2EClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLOperationType2_IsUndefined()
  {
    return (EAttribute)oclOperationType2EClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndexOfOp()
  {
    return indexOfOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndexOfOp_Index()
  {
    return (EAttribute)indexOfOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForAllOp()
  {
    return forAllOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForAllOp_Var()
  {
    return (EAttribute)forAllOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForAllOp_Exp()
  {
    return (EReference)forAllOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExistsOp()
  {
    return existsOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExistsOp_Var()
  {
    return (EAttribute)existsOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExistsOp_Exp()
  {
    return (EReference)existsOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectOp()
  {
    return selectOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectOp_Var()
  {
    return (EAttribute)selectOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectOp_Exp()
  {
    return (EReference)selectOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectOp()
  {
    return collectOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollectOp_Var()
  {
    return (EAttribute)collectOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectOp_Exp()
  {
    return (EReference)collectOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsTypeOfOp()
  {
    return isTypeOfOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIsTypeOfOp_ClassName()
  {
    return (EAttribute)isTypeOfOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcatOp()
  {
    return concatOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcatOp_S()
  {
    return (EAttribute)concatOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnionOp()
  {
    return unionOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnionOp_Exp()
  {
    return (EReference)unionOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntersectionOp()
  {
    return intersectionOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntersectionOp_Exp()
  {
    return (EReference)intersectionOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLFactory getMTLFactory()
  {
    return (MTLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__RULES);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__IN_PATTERNS);
    createEReference(ruleEClass, RULE__FILTER);
    createEReference(ruleEClass, RULE__OUT_PATTERNS);

    inPatternEClass = createEClass(IN_PATTERN);
    createEAttribute(inPatternEClass, IN_PATTERN__IN_ELEM);
    createEAttribute(inPatternEClass, IN_PATTERN__CLASS_NAME);

    filterEClass = createEClass(FILTER);
    createEReference(filterEClass, FILTER__EXPR);

    outPatternEClass = createEClass(OUT_PATTERN);
    createEAttribute(outPatternEClass, OUT_PATTERN__VAR_NAME);
    createEAttribute(outPatternEClass, OUT_PATTERN__CLASS_NAME);
    createEReference(outPatternEClass, OUT_PATTERN__ASSG);

    assignationEClass = createEClass(ASSIGNATION);
    createEAttribute(assignationEClass, ASSIGNATION__ATTRIBUTE);
    createEReference(assignationEClass, ASSIGNATION__EXPR);
    createEReference(assignationEClass, ASSIGNATION__RELATIONSHIP);

    simpleExpressionEClass = createEClass(SIMPLE_EXPRESSION);
    createEAttribute(simpleExpressionEClass, SIMPLE_EXPRESSION__STRING);
    createEAttribute(simpleExpressionEClass, SIMPLE_EXPRESSION__INTEGER);
    createEAttribute(simpleExpressionEClass, SIMPLE_EXPRESSION__DOUBLE);
    createEAttribute(simpleExpressionEClass, SIMPLE_EXPRESSION__BOOLEAN);
    createEAttribute(simpleExpressionEClass, SIMPLE_EXPRESSION__IS_NULL);
    createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__NAVIGATION);
    createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__IF_SENTENCE);
    createEAttribute(simpleExpressionEClass, SIMPLE_EXPRESSION__COLECTION_TYPE);
    createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__ELEMS);
    createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__NAV);
    createEReference(simpleExpressionEClass, SIMPLE_EXPRESSION__RESOLVE);

    navigEClass = createEClass(NAVIG);
    createEAttribute(navigEClass, NAVIG__ATTR);
    createEReference(navigEClass, NAVIG__NAVIGATION);

    navigationEClass = createEClass(NAVIGATION);
    createEAttribute(navigationEClass, NAVIGATION__ATT_NAME);
    createEReference(navigationEClass, NAVIGATION__ASSOC_ROLE);
    createEReference(navigationEClass, NAVIGATION__OP_TYPE1);
    createEReference(navigationEClass, NAVIGATION__OP_TYPE2);

    ifSentenceEClass = createEClass(IF_SENTENCE);
    createEReference(ifSentenceEClass, IF_SENTENCE__COND);
    createEReference(ifSentenceEClass, IF_SENTENCE__BODY);
    createEReference(ifSentenceEClass, IF_SENTENCE__ELSEBODY);

    resolveExpEClass = createEClass(RESOLVE_EXP);
    createEReference(resolveExpEClass, RESOLVE_EXP__EXP);
    createEAttribute(resolveExpEClass, RESOLVE_EXP__POSITION);

    complexExpressionEClass = createEClass(COMPLEX_EXPRESSION);
    createEAttribute(complexExpressionEClass, COMPLEX_EXPRESSION__PREFIX_NOT);
    createEReference(complexExpressionEClass, COMPLEX_EXPRESSION__LEFT);
    createEAttribute(complexExpressionEClass, COMPLEX_EXPRESSION__INFIX_OP);
    createEReference(complexExpressionEClass, COMPLEX_EXPRESSION__RIGHT);

    assocRoleNameEClass = createEClass(ASSOC_ROLE_NAME);
    createEAttribute(assocRoleNameEClass, ASSOC_ROLE_NAME__CHILDREN);
    createEAttribute(assocRoleNameEClass, ASSOC_ROLE_NAME__PARENT);
    createEAttribute(assocRoleNameEClass, ASSOC_ROLE_NAME__NAME);

    oclOperationType1EClass = createEClass(OCL_OPERATION_TYPE1);
    createEAttribute(oclOperationType1EClass, OCL_OPERATION_TYPE1__ALL_INS);
    createEReference(oclOperationType1EClass, OCL_OPERATION_TYPE1__IS_TYPE_OF);
    createEAttribute(oclOperationType1EClass, OCL_OPERATION_TYPE1__TO_STRING);
    createEReference(oclOperationType1EClass, OCL_OPERATION_TYPE1__CONCATENATE);

    oclOperationType2EClass = createEClass(OCL_OPERATION_TYPE2);
    createEAttribute(oclOperationType2EClass, OCL_OPERATION_TYPE2__SIZE);
    createEReference(oclOperationType2EClass, OCL_OPERATION_TYPE2__FORALL);
    createEReference(oclOperationType2EClass, OCL_OPERATION_TYPE2__EXISTS);
    createEReference(oclOperationType2EClass, OCL_OPERATION_TYPE2__SELECT);
    createEReference(oclOperationType2EClass, OCL_OPERATION_TYPE2__COLLECT);
    createEAttribute(oclOperationType2EClass, OCL_OPERATION_TYPE2__FIRST);
    createEAttribute(oclOperationType2EClass, OCL_OPERATION_TYPE2__LAST);
    createEReference(oclOperationType2EClass, OCL_OPERATION_TYPE2__INDEX_OF);
    createEReference(oclOperationType2EClass, OCL_OPERATION_TYPE2__UNION);
    createEReference(oclOperationType2EClass, OCL_OPERATION_TYPE2__INTERSECTION);
    createEAttribute(oclOperationType2EClass, OCL_OPERATION_TYPE2__IS_UNDEFINED);

    indexOfOpEClass = createEClass(INDEX_OF_OP);
    createEAttribute(indexOfOpEClass, INDEX_OF_OP__INDEX);

    forAllOpEClass = createEClass(FOR_ALL_OP);
    createEAttribute(forAllOpEClass, FOR_ALL_OP__VAR);
    createEReference(forAllOpEClass, FOR_ALL_OP__EXP);

    existsOpEClass = createEClass(EXISTS_OP);
    createEAttribute(existsOpEClass, EXISTS_OP__VAR);
    createEReference(existsOpEClass, EXISTS_OP__EXP);

    selectOpEClass = createEClass(SELECT_OP);
    createEAttribute(selectOpEClass, SELECT_OP__VAR);
    createEReference(selectOpEClass, SELECT_OP__EXP);

    collectOpEClass = createEClass(COLLECT_OP);
    createEAttribute(collectOpEClass, COLLECT_OP__VAR);
    createEReference(collectOpEClass, COLLECT_OP__EXP);

    isTypeOfOpEClass = createEClass(IS_TYPE_OF_OP);
    createEAttribute(isTypeOfOpEClass, IS_TYPE_OF_OP__CLASS_NAME);

    concatOpEClass = createEClass(CONCAT_OP);
    createEAttribute(concatOpEClass, CONCAT_OP__S);

    unionOpEClass = createEClass(UNION_OP);
    createEReference(unionOpEClass, UNION_OP__EXP);

    intersectionOpEClass = createEClass(INTERSECTION_OP);
    createEReference(intersectionOpEClass, INTERSECTION_OP__EXP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Rules(), this.getRule(), null, "rules", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_InPatterns(), this.getInPattern(), null, "inPatterns", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Filter(), this.getFilter(), null, "filter", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_OutPatterns(), this.getOutPattern(), null, "outPatterns", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inPatternEClass, InPattern.class, "InPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInPattern_InElem(), ecorePackage.getEString(), "inElem", null, 0, 1, InPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInPattern_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, InPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilter_Expr(), this.getComplexExpression(), null, "expr", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outPatternEClass, OutPattern.class, "OutPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutPattern_VarName(), ecorePackage.getEString(), "varName", null, 0, 1, OutPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutPattern_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, OutPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutPattern_Assg(), this.getAssignation(), null, "assg", null, 0, -1, OutPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignationEClass, Assignation.class, "Assignation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignation_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, Assignation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignation_Expr(), this.getComplexExpression(), null, "expr", null, 0, 1, Assignation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignation_Relationship(), this.getAssocRoleName(), null, "relationship", null, 0, 1, Assignation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleExpressionEClass, SimpleExpression.class, "SimpleExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleExpression__string(), ecorePackage.getEString(), "_string", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleExpression__integer(), ecorePackage.getEInt(), "_integer", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleExpression__double(), ecorePackage.getEString(), "_double", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleExpression__boolean(), ecorePackage.getEString(), "_boolean", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleExpression_IsNull(), ecorePackage.getEString(), "isNull", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleExpression_Navigation(), this.getNavig(), null, "navigation", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleExpression_IfSentence(), this.getIfSentence(), null, "ifSentence", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleExpression_ColectionType(), ecorePackage.getEString(), "colectionType", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleExpression_Elems(), this.getComplexExpression(), null, "elems", null, 0, -1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleExpression_Nav(), this.getNavigation(), null, "nav", null, 0, -1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleExpression_Resolve(), this.getResolveExp(), null, "resolve", null, 0, 1, SimpleExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(navigEClass, Navig.class, "Navig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNavig_Attr(), ecorePackage.getEString(), "attr", null, 0, 1, Navig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNavig_Navigation(), this.getNavigation(), null, "navigation", null, 0, -1, Navig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(navigationEClass, Navigation.class, "Navigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNavigation_AttName(), ecorePackage.getEString(), "attName", null, 0, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNavigation_AssocRole(), this.getAssocRoleName(), null, "assocRole", null, 0, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNavigation_OpType1(), this.getOCLOperationType1(), null, "opType1", null, 0, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNavigation_OpType2(), this.getOCLOperationType2(), null, "opType2", null, 0, 1, Navigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifSentenceEClass, IfSentence.class, "IfSentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfSentence_Cond(), this.getComplexExpression(), null, "cond", null, 0, 1, IfSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSentence_Body(), this.getComplexExpression(), null, "body", null, 0, 1, IfSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfSentence_Elsebody(), this.getComplexExpression(), null, "elsebody", null, 0, 1, IfSentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resolveExpEClass, ResolveExp.class, "ResolveExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResolveExp_Exp(), this.getComplexExpression(), null, "exp", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResolveExp_Position(), ecorePackage.getEInt(), "position", null, 0, 1, ResolveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexExpressionEClass, ComplexExpression.class, "ComplexExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexExpression_PrefixNot(), ecorePackage.getEString(), "prefixNot", null, 0, 1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexExpression_Left(), this.getSimpleExpression(), null, "left", null, 0, 1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexExpression_InfixOp(), ecorePackage.getEString(), "infixOp", null, 0, -1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexExpression_Right(), this.getSimpleExpression(), null, "right", null, 0, -1, ComplexExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assocRoleNameEClass, AssocRoleName.class, "AssocRoleName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssocRoleName_Children(), ecorePackage.getEString(), "children", null, 0, 1, AssocRoleName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssocRoleName_Parent(), ecorePackage.getEString(), "parent", null, 0, 1, AssocRoleName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssocRoleName_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssocRoleName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclOperationType1EClass, OCLOperationType1.class, "OCLOperationType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOCLOperationType1_AllIns(), ecorePackage.getEString(), "allIns", null, 0, 1, OCLOperationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType1_IsTypeOf(), this.getIsTypeOfOp(), null, "isTypeOf", null, 0, 1, OCLOperationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOCLOperationType1_ToString(), ecorePackage.getEString(), "toString", null, 0, 1, OCLOperationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType1_Concatenate(), this.getConcatOp(), null, "concatenate", null, 0, 1, OCLOperationType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oclOperationType2EClass, OCLOperationType2.class, "OCLOperationType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOCLOperationType2_Size(), ecorePackage.getEString(), "size", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType2_Forall(), this.getForAllOp(), null, "forall", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType2_Exists(), this.getExistsOp(), null, "exists", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType2_Select(), this.getSelectOp(), null, "select", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType2_Collect(), this.getCollectOp(), null, "collect", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOCLOperationType2_First(), ecorePackage.getEString(), "first", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOCLOperationType2_Last(), ecorePackage.getEString(), "last", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType2_IndexOf(), this.getIndexOfOp(), null, "indexOf", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType2_Union(), this.getUnionOp(), null, "union", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOCLOperationType2_Intersection(), this.getIntersectionOp(), null, "intersection", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOCLOperationType2_IsUndefined(), ecorePackage.getEString(), "isUndefined", null, 0, 1, OCLOperationType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(indexOfOpEClass, IndexOfOp.class, "IndexOfOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIndexOfOp_Index(), ecorePackage.getEInt(), "index", null, 0, 1, IndexOfOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forAllOpEClass, ForAllOp.class, "ForAllOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForAllOp_Var(), ecorePackage.getEString(), "var", null, 0, 1, ForAllOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForAllOp_Exp(), this.getComplexExpression(), null, "exp", null, 0, 1, ForAllOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(existsOpEClass, ExistsOp.class, "ExistsOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExistsOp_Var(), ecorePackage.getEString(), "var", null, 0, 1, ExistsOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExistsOp_Exp(), this.getComplexExpression(), null, "exp", null, 0, 1, ExistsOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectOpEClass, SelectOp.class, "SelectOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectOp_Var(), ecorePackage.getEString(), "var", null, 0, 1, SelectOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectOp_Exp(), this.getComplexExpression(), null, "exp", null, 0, 1, SelectOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectOpEClass, CollectOp.class, "CollectOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCollectOp_Var(), ecorePackage.getEString(), "var", null, 0, 1, CollectOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollectOp_Exp(), this.getComplexExpression(), null, "exp", null, 0, 1, CollectOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isTypeOfOpEClass, IsTypeOfOp.class, "IsTypeOfOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsTypeOfOp_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, IsTypeOfOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concatOpEClass, ConcatOp.class, "ConcatOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcatOp_S(), ecorePackage.getEString(), "s", null, 0, 1, ConcatOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unionOpEClass, UnionOp.class, "UnionOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnionOp_Exp(), this.getComplexExpression(), null, "exp", null, 0, 1, UnionOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intersectionOpEClass, IntersectionOp.class, "IntersectionOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntersectionOp_Exp(), this.getComplexExpression(), null, "exp", null, 0, 1, IntersectionOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MTLPackageImpl
