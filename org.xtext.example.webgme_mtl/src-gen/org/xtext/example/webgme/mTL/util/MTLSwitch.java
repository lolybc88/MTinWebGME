/**
 */
package org.xtext.example.webgme.mTL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.webgme.mTL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.webgme.mTL.MTLPackage
 * @generated
 */
public class MTLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MTLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MTLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MTLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.IN_PATTERN:
      {
        InPattern inPattern = (InPattern)theEObject;
        T result = caseInPattern(inPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.FILTER:
      {
        Filter filter = (Filter)theEObject;
        T result = caseFilter(filter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.OUT_PATTERN:
      {
        OutPattern outPattern = (OutPattern)theEObject;
        T result = caseOutPattern(outPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.ASSIGNATION:
      {
        Assignation assignation = (Assignation)theEObject;
        T result = caseAssignation(assignation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.SIMPLE_EXPRESSION:
      {
        SimpleExpression simpleExpression = (SimpleExpression)theEObject;
        T result = caseSimpleExpression(simpleExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.NAVIG:
      {
        Navig navig = (Navig)theEObject;
        T result = caseNavig(navig);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.NAVIGATION:
      {
        Navigation navigation = (Navigation)theEObject;
        T result = caseNavigation(navigation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.IF_SENTENCE:
      {
        IfSentence ifSentence = (IfSentence)theEObject;
        T result = caseIfSentence(ifSentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.RESOLVE_EXP:
      {
        ResolveExp resolveExp = (ResolveExp)theEObject;
        T result = caseResolveExp(resolveExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.COMPLEX_EXPRESSION:
      {
        ComplexExpression complexExpression = (ComplexExpression)theEObject;
        T result = caseComplexExpression(complexExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.ASSOC_ROLE_NAME:
      {
        AssocRoleName assocRoleName = (AssocRoleName)theEObject;
        T result = caseAssocRoleName(assocRoleName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.OCL_OPERATION_TYPE1:
      {
        OCLOperationType1 oclOperationType1 = (OCLOperationType1)theEObject;
        T result = caseOCLOperationType1(oclOperationType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.OCL_OPERATION_TYPE2:
      {
        OCLOperationType2 oclOperationType2 = (OCLOperationType2)theEObject;
        T result = caseOCLOperationType2(oclOperationType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.INDEX_OF_OP:
      {
        IndexOfOp indexOfOp = (IndexOfOp)theEObject;
        T result = caseIndexOfOp(indexOfOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.FOR_ALL_OP:
      {
        ForAllOp forAllOp = (ForAllOp)theEObject;
        T result = caseForAllOp(forAllOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.EXISTS_OP:
      {
        ExistsOp existsOp = (ExistsOp)theEObject;
        T result = caseExistsOp(existsOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.SELECT_OP:
      {
        SelectOp selectOp = (SelectOp)theEObject;
        T result = caseSelectOp(selectOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.COLLECT_OP:
      {
        CollectOp collectOp = (CollectOp)theEObject;
        T result = caseCollectOp(collectOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.IS_TYPE_OF_OP:
      {
        IsTypeOfOp isTypeOfOp = (IsTypeOfOp)theEObject;
        T result = caseIsTypeOfOp(isTypeOfOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.CONCAT_OP:
      {
        ConcatOp concatOp = (ConcatOp)theEObject;
        T result = caseConcatOp(concatOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.UNION_OP:
      {
        UnionOp unionOp = (UnionOp)theEObject;
        T result = caseUnionOp(unionOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MTLPackage.INTERSECTION_OP:
      {
        IntersectionOp intersectionOp = (IntersectionOp)theEObject;
        T result = caseIntersectionOp(intersectionOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInPattern(InPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilter(Filter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutPattern(OutPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignation(Assignation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleExpression(SimpleExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navig</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navig</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavig(Navig object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigation(Navigation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Sentence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Sentence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfSentence(IfSentence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resolve Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resolve Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResolveExp(ResolveExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexExpression(ComplexExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assoc Role Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assoc Role Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssocRoleName(AssocRoleName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OCL Operation Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OCL Operation Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLOperationType1(OCLOperationType1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OCL Operation Type2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OCL Operation Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLOperationType2(OCLOperationType2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index Of Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index Of Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexOfOp(IndexOfOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For All Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For All Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForAllOp(ForAllOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exists Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exists Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistsOp(ExistsOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectOp(SelectOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collect Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collect Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectOp(CollectOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Is Type Of Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Is Type Of Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIsTypeOfOp(IsTypeOfOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concat Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concat Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcatOp(ConcatOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnionOp(UnionOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intersection Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intersection Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntersectionOp(IntersectionOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MTLSwitch
