/**
 */
package org.xtext.example.webgme.mTL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.webgme.mTL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.webgme.mTL.MTLPackage
 * @generated
 */
public class MTLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MTLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MTLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MTLSwitch<Adapter> modelSwitch =
    new MTLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseInPattern(InPattern object)
      {
        return createInPatternAdapter();
      }
      @Override
      public Adapter caseFilter(Filter object)
      {
        return createFilterAdapter();
      }
      @Override
      public Adapter caseOutPattern(OutPattern object)
      {
        return createOutPatternAdapter();
      }
      @Override
      public Adapter caseAssignation(Assignation object)
      {
        return createAssignationAdapter();
      }
      @Override
      public Adapter caseSimpleExpression(SimpleExpression object)
      {
        return createSimpleExpressionAdapter();
      }
      @Override
      public Adapter caseNavig(Navig object)
      {
        return createNavigAdapter();
      }
      @Override
      public Adapter caseNavigation(Navigation object)
      {
        return createNavigationAdapter();
      }
      @Override
      public Adapter caseIfSentence(IfSentence object)
      {
        return createIfSentenceAdapter();
      }
      @Override
      public Adapter caseResolveExp(ResolveExp object)
      {
        return createResolveExpAdapter();
      }
      @Override
      public Adapter caseComplexExpression(ComplexExpression object)
      {
        return createComplexExpressionAdapter();
      }
      @Override
      public Adapter caseAssocRoleName(AssocRoleName object)
      {
        return createAssocRoleNameAdapter();
      }
      @Override
      public Adapter caseOCLOperationType1(OCLOperationType1 object)
      {
        return createOCLOperationType1Adapter();
      }
      @Override
      public Adapter caseOCLOperationType2(OCLOperationType2 object)
      {
        return createOCLOperationType2Adapter();
      }
      @Override
      public Adapter caseIndexOfOp(IndexOfOp object)
      {
        return createIndexOfOpAdapter();
      }
      @Override
      public Adapter caseForAllOp(ForAllOp object)
      {
        return createForAllOpAdapter();
      }
      @Override
      public Adapter caseExistsOp(ExistsOp object)
      {
        return createExistsOpAdapter();
      }
      @Override
      public Adapter caseSelectOp(SelectOp object)
      {
        return createSelectOpAdapter();
      }
      @Override
      public Adapter caseCollectOp(CollectOp object)
      {
        return createCollectOpAdapter();
      }
      @Override
      public Adapter caseIsTypeOfOp(IsTypeOfOp object)
      {
        return createIsTypeOfOpAdapter();
      }
      @Override
      public Adapter caseConcatOp(ConcatOp object)
      {
        return createConcatOpAdapter();
      }
      @Override
      public Adapter caseUnionOp(UnionOp object)
      {
        return createUnionOpAdapter();
      }
      @Override
      public Adapter caseIntersectionOp(IntersectionOp object)
      {
        return createIntersectionOpAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.InPattern <em>In Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.InPattern
   * @generated
   */
  public Adapter createInPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.Filter
   * @generated
   */
  public Adapter createFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.OutPattern <em>Out Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.OutPattern
   * @generated
   */
  public Adapter createOutPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.Assignation <em>Assignation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.Assignation
   * @generated
   */
  public Adapter createAssignationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.SimpleExpression
   * @generated
   */
  public Adapter createSimpleExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.Navig <em>Navig</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.Navig
   * @generated
   */
  public Adapter createNavigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.Navigation <em>Navigation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.Navigation
   * @generated
   */
  public Adapter createNavigationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.IfSentence <em>If Sentence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.IfSentence
   * @generated
   */
  public Adapter createIfSentenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.ResolveExp <em>Resolve Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.ResolveExp
   * @generated
   */
  public Adapter createResolveExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.ComplexExpression <em>Complex Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.ComplexExpression
   * @generated
   */
  public Adapter createComplexExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.AssocRoleName <em>Assoc Role Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.AssocRoleName
   * @generated
   */
  public Adapter createAssocRoleNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.OCLOperationType1 <em>OCL Operation Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.OCLOperationType1
   * @generated
   */
  public Adapter createOCLOperationType1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.OCLOperationType2 <em>OCL Operation Type2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.OCLOperationType2
   * @generated
   */
  public Adapter createOCLOperationType2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.IndexOfOp <em>Index Of Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.IndexOfOp
   * @generated
   */
  public Adapter createIndexOfOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.ForAllOp <em>For All Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.ForAllOp
   * @generated
   */
  public Adapter createForAllOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.ExistsOp <em>Exists Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.ExistsOp
   * @generated
   */
  public Adapter createExistsOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.SelectOp <em>Select Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.SelectOp
   * @generated
   */
  public Adapter createSelectOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.CollectOp <em>Collect Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.CollectOp
   * @generated
   */
  public Adapter createCollectOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.IsTypeOfOp <em>Is Type Of Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.IsTypeOfOp
   * @generated
   */
  public Adapter createIsTypeOfOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.ConcatOp <em>Concat Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.ConcatOp
   * @generated
   */
  public Adapter createConcatOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.UnionOp <em>Union Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.UnionOp
   * @generated
   */
  public Adapter createUnionOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.webgme.mTL.IntersectionOp <em>Intersection Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.webgme.mTL.IntersectionOp
   * @generated
   */
  public Adapter createIntersectionOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MTLAdapterFactory
