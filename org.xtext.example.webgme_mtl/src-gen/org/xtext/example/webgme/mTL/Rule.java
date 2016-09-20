/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.Rule#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Rule#getInPatterns <em>In Patterns</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Rule#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.Rule#getOutPatterns <em>Out Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>In Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.webgme.mTL.InPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Patterns</em>' containment reference list.
   * @see org.xtext.example.webgme.mTL.MTLPackage#getRule_InPatterns()
   * @model containment="true"
   * @generated
   */
  EList<InPattern> getInPatterns();

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(Filter)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getRule_Filter()
   * @model containment="true"
   * @generated
   */
  Filter getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.Rule#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Filter value);

  /**
   * Returns the value of the '<em><b>Out Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.webgme.mTL.OutPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Patterns</em>' containment reference list.
   * @see org.xtext.example.webgme.mTL.MTLPackage#getRule_OutPatterns()
   * @model containment="true"
   * @generated
   */
  EList<OutPattern> getOutPatterns();

} // Rule
