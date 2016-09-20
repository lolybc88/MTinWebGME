/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.ComplexExpression#getPrefixNot <em>Prefix Not</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.ComplexExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.ComplexExpression#getInfixOp <em>Infix Op</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.ComplexExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getComplexExpression()
 * @model
 * @generated
 */
public interface ComplexExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefix Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix Not</em>' attribute.
   * @see #setPrefixNot(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getComplexExpression_PrefixNot()
   * @model
   * @generated
   */
  String getPrefixNot();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.ComplexExpression#getPrefixNot <em>Prefix Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix Not</em>' attribute.
   * @see #getPrefixNot()
   * @generated
   */
  void setPrefixNot(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(SimpleExpression)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getComplexExpression_Left()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.ComplexExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Infix Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infix Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infix Op</em>' attribute list.
   * @see org.xtext.example.webgme.mTL.MTLPackage#getComplexExpression_InfixOp()
   * @model unique="false"
   * @generated
   */
  EList<String> getInfixOp();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.webgme.mTL.SimpleExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see org.xtext.example.webgme.mTL.MTLPackage#getComplexExpression_Right()
   * @model containment="true"
   * @generated
   */
  EList<SimpleExpression> getRight();

} // ComplexExpression
