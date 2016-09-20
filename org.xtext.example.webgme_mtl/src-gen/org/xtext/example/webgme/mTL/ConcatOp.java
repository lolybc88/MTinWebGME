/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.ConcatOp#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getConcatOp()
 * @model
 * @generated
 */
public interface ConcatOp extends EObject
{
  /**
   * Returns the value of the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' attribute.
   * @see #setS(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getConcatOp_S()
   * @model
   * @generated
   */
  String getS();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.ConcatOp#getS <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' attribute.
   * @see #getS()
   * @generated
   */
  void setS(String value);

} // ConcatOp
