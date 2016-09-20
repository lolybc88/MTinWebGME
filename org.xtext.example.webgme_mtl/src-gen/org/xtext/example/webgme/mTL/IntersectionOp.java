/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.IntersectionOp#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getIntersectionOp()
 * @model
 * @generated
 */
public interface IntersectionOp extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ComplexExpression)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getIntersectionOp_Exp()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.IntersectionOp#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ComplexExpression value);

} // IntersectionOp
