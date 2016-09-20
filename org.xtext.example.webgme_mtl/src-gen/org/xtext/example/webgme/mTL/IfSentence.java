/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Sentence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.IfSentence#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.IfSentence#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.IfSentence#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getIfSentence()
 * @model
 * @generated
 */
public interface IfSentence extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(ComplexExpression)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getIfSentence_Cond()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getCond();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.IfSentence#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(ComplexExpression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ComplexExpression)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getIfSentence_Body()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.IfSentence#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ComplexExpression value);

  /**
   * Returns the value of the '<em><b>Elsebody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsebody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsebody</em>' containment reference.
   * @see #setElsebody(ComplexExpression)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getIfSentence_Elsebody()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getElsebody();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.IfSentence#getElsebody <em>Elsebody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsebody</em>' containment reference.
   * @see #getElsebody()
   * @generated
   */
  void setElsebody(ComplexExpression value);

} // IfSentence
