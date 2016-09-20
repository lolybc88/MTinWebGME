/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navig</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.Navig#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Navig#getNavigation <em>Navigation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getNavig()
 * @model
 * @generated
 */
public interface Navig extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' attribute.
   * @see #setAttr(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getNavig_Attr()
   * @model
   * @generated
   */
  String getAttr();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Navig#getAttr <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' attribute.
   * @see #getAttr()
   * @generated
   */
  void setAttr(String value);

  /**
   * Returns the value of the '<em><b>Navigation</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.webgme.mTL.Navigation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Navigation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Navigation</em>' containment reference list.
   * @see org.xtext.example.webgme.mTL.MTLPackage#getNavig_Navigation()
   * @model containment="true"
   * @generated
   */
  EList<Navigation> getNavigation();

} // Navig
