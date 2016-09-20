/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.webgme.mTL.MTLPackage
 * @generated
 */
public interface MTLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MTLFactory eINSTANCE = org.xtext.example.webgme.mTL.impl.MTLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>In Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Pattern</em>'.
   * @generated
   */
  InPattern createInPattern();

  /**
   * Returns a new object of class '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>Out Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out Pattern</em>'.
   * @generated
   */
  OutPattern createOutPattern();

  /**
   * Returns a new object of class '<em>Assignation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignation</em>'.
   * @generated
   */
  Assignation createAssignation();

  /**
   * Returns a new object of class '<em>Simple Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Expression</em>'.
   * @generated
   */
  SimpleExpression createSimpleExpression();

  /**
   * Returns a new object of class '<em>Navig</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navig</em>'.
   * @generated
   */
  Navig createNavig();

  /**
   * Returns a new object of class '<em>Navigation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigation</em>'.
   * @generated
   */
  Navigation createNavigation();

  /**
   * Returns a new object of class '<em>If Sentence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Sentence</em>'.
   * @generated
   */
  IfSentence createIfSentence();

  /**
   * Returns a new object of class '<em>Resolve Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resolve Exp</em>'.
   * @generated
   */
  ResolveExp createResolveExp();

  /**
   * Returns a new object of class '<em>Complex Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Expression</em>'.
   * @generated
   */
  ComplexExpression createComplexExpression();

  /**
   * Returns a new object of class '<em>Assoc Role Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assoc Role Name</em>'.
   * @generated
   */
  AssocRoleName createAssocRoleName();

  /**
   * Returns a new object of class '<em>OCL Operation Type1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OCL Operation Type1</em>'.
   * @generated
   */
  OCLOperationType1 createOCLOperationType1();

  /**
   * Returns a new object of class '<em>OCL Operation Type2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OCL Operation Type2</em>'.
   * @generated
   */
  OCLOperationType2 createOCLOperationType2();

  /**
   * Returns a new object of class '<em>Index Of Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Of Op</em>'.
   * @generated
   */
  IndexOfOp createIndexOfOp();

  /**
   * Returns a new object of class '<em>For All Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For All Op</em>'.
   * @generated
   */
  ForAllOp createForAllOp();

  /**
   * Returns a new object of class '<em>Exists Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exists Op</em>'.
   * @generated
   */
  ExistsOp createExistsOp();

  /**
   * Returns a new object of class '<em>Select Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Op</em>'.
   * @generated
   */
  SelectOp createSelectOp();

  /**
   * Returns a new object of class '<em>Collect Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collect Op</em>'.
   * @generated
   */
  CollectOp createCollectOp();

  /**
   * Returns a new object of class '<em>Is Type Of Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Type Of Op</em>'.
   * @generated
   */
  IsTypeOfOp createIsTypeOfOp();

  /**
   * Returns a new object of class '<em>Concat Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concat Op</em>'.
   * @generated
   */
  ConcatOp createConcatOp();

  /**
   * Returns a new object of class '<em>Union Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union Op</em>'.
   * @generated
   */
  UnionOp createUnionOp();

  /**
   * Returns a new object of class '<em>Intersection Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intersection Op</em>'.
   * @generated
   */
  IntersectionOp createIntersectionOp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MTLPackage getMTLPackage();

} //MTLFactory
