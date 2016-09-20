/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.ForAllOp#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.ForAllOp#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getForAllOp()
 * @model
 * @generated
 */
public interface ForAllOp extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getForAllOp_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.ForAllOp#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

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
   * @see org.xtext.example.webgme.mTL.MTLPackage#getForAllOp_Exp()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getExp();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.ForAllOp#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ComplexExpression value);

} // ForAllOp
