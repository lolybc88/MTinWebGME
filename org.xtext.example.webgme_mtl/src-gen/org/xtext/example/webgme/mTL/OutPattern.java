/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.OutPattern#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OutPattern#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OutPattern#getAssg <em>Assg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getOutPattern()
 * @model
 * @generated
 */
public interface OutPattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOutPattern_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OutPattern#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

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
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOutPattern_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OutPattern#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Assg</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.webgme.mTL.Assignation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assg</em>' containment reference list.
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOutPattern_Assg()
   * @model containment="true"
   * @generated
   */
  EList<Assignation> getAssg();

} // OutPattern
