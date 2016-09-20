/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Operation Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType1#getAllIns <em>All Ins</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType1#getIsTypeOf <em>Is Type Of</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType1#getToString <em>To String</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType1#getConcatenate <em>Concatenate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType1()
 * @model
 * @generated
 */
public interface OCLOperationType1 extends EObject
{
  /**
   * Returns the value of the '<em><b>All Ins</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Ins</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Ins</em>' attribute.
   * @see #setAllIns(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType1_AllIns()
   * @model
   * @generated
   */
  String getAllIns();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getAllIns <em>All Ins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Ins</em>' attribute.
   * @see #getAllIns()
   * @generated
   */
  void setAllIns(String value);

  /**
   * Returns the value of the '<em><b>Is Type Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Type Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Type Of</em>' containment reference.
   * @see #setIsTypeOf(IsTypeOfOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType1_IsTypeOf()
   * @model containment="true"
   * @generated
   */
  IsTypeOfOp getIsTypeOf();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getIsTypeOf <em>Is Type Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Type Of</em>' containment reference.
   * @see #getIsTypeOf()
   * @generated
   */
  void setIsTypeOf(IsTypeOfOp value);

  /**
   * Returns the value of the '<em><b>To String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To String</em>' attribute.
   * @see #setToString(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType1_ToString()
   * @model
   * @generated
   */
  String getToString();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getToString <em>To String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To String</em>' attribute.
   * @see #getToString()
   * @generated
   */
  void setToString(String value);

  /**
   * Returns the value of the '<em><b>Concatenate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concatenate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concatenate</em>' containment reference.
   * @see #setConcatenate(ConcatOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType1_Concatenate()
   * @model containment="true"
   * @generated
   */
  ConcatOp getConcatenate();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType1#getConcatenate <em>Concatenate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concatenate</em>' containment reference.
   * @see #getConcatenate()
   * @generated
   */
  void setConcatenate(ConcatOp value);

} // OCLOperationType1
