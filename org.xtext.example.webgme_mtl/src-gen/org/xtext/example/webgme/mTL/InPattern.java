/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.InPattern#getInElem <em>In Elem</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.InPattern#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getInPattern()
 * @model
 * @generated
 */
public interface InPattern extends EObject
{
  /**
   * Returns the value of the '<em><b>In Elem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Elem</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Elem</em>' attribute.
   * @see #setInElem(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getInPattern_InElem()
   * @model
   * @generated
   */
  String getInElem();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.InPattern#getInElem <em>In Elem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Elem</em>' attribute.
   * @see #getInElem()
   * @generated
   */
  void setInElem(String value);

  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getInPattern_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.InPattern#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

} // InPattern
