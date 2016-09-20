/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.Assignation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Assignation#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Assignation#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getAssignation()
 * @model
 * @generated
 */
public interface Assignation extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getAssignation_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Assignation#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(ComplexExpression)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getAssignation_Expr()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Assignation#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(ComplexExpression value);

  /**
   * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship</em>' containment reference.
   * @see #setRelationship(AssocRoleName)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getAssignation_Relationship()
   * @model containment="true"
   * @generated
   */
  AssocRoleName getRelationship();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Assignation#getRelationship <em>Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship</em>' containment reference.
   * @see #getRelationship()
   * @generated
   */
  void setRelationship(AssocRoleName value);

} // Assignation
