/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.Navigation#getAttName <em>Att Name</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Navigation#getAssocRole <em>Assoc Role</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Navigation#getOpType1 <em>Op Type1</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Navigation#getOpType2 <em>Op Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getNavigation()
 * @model
 * @generated
 */
public interface Navigation extends EObject
{
  /**
   * Returns the value of the '<em><b>Att Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Name</em>' attribute.
   * @see #setAttName(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getNavigation_AttName()
   * @model
   * @generated
   */
  String getAttName();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Navigation#getAttName <em>Att Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att Name</em>' attribute.
   * @see #getAttName()
   * @generated
   */
  void setAttName(String value);

  /**
   * Returns the value of the '<em><b>Assoc Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assoc Role</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assoc Role</em>' containment reference.
   * @see #setAssocRole(AssocRoleName)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getNavigation_AssocRole()
   * @model containment="true"
   * @generated
   */
  AssocRoleName getAssocRole();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Navigation#getAssocRole <em>Assoc Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assoc Role</em>' containment reference.
   * @see #getAssocRole()
   * @generated
   */
  void setAssocRole(AssocRoleName value);

  /**
   * Returns the value of the '<em><b>Op Type1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Type1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Type1</em>' containment reference.
   * @see #setOpType1(OCLOperationType1)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getNavigation_OpType1()
   * @model containment="true"
   * @generated
   */
  OCLOperationType1 getOpType1();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Navigation#getOpType1 <em>Op Type1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Type1</em>' containment reference.
   * @see #getOpType1()
   * @generated
   */
  void setOpType1(OCLOperationType1 value);

  /**
   * Returns the value of the '<em><b>Op Type2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Type2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Type2</em>' containment reference.
   * @see #setOpType2(OCLOperationType2)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getNavigation_OpType2()
   * @model containment="true"
   * @generated
   */
  OCLOperationType2 getOpType2();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Navigation#getOpType2 <em>Op Type2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Type2</em>' containment reference.
   * @see #getOpType2()
   * @generated
   */
  void setOpType2(OCLOperationType2 value);

} // Navigation
