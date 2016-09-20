/**
 */
package org.xtext.example.webgme.mTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Operation Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getForall <em>Forall</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getExists <em>Exists</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getCollect <em>Collect</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getLast <em>Last</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIndexOf <em>Index Of</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getUnion <em>Union</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIntersection <em>Intersection</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIsUndefined <em>Is Undefined</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2()
 * @model
 * @generated
 */
public interface OCLOperationType2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

  /**
   * Returns the value of the '<em><b>Forall</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forall</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forall</em>' containment reference.
   * @see #setForall(ForAllOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Forall()
   * @model containment="true"
   * @generated
   */
  ForAllOp getForall();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getForall <em>Forall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forall</em>' containment reference.
   * @see #getForall()
   * @generated
   */
  void setForall(ForAllOp value);

  /**
   * Returns the value of the '<em><b>Exists</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exists</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exists</em>' containment reference.
   * @see #setExists(ExistsOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Exists()
   * @model containment="true"
   * @generated
   */
  ExistsOp getExists();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getExists <em>Exists</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exists</em>' containment reference.
   * @see #getExists()
   * @generated
   */
  void setExists(ExistsOp value);

  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference.
   * @see #setSelect(SelectOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Select()
   * @model containment="true"
   * @generated
   */
  SelectOp getSelect();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(SelectOp value);

  /**
   * Returns the value of the '<em><b>Collect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collect</em>' containment reference.
   * @see #setCollect(CollectOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Collect()
   * @model containment="true"
   * @generated
   */
  CollectOp getCollect();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getCollect <em>Collect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collect</em>' containment reference.
   * @see #getCollect()
   * @generated
   */
  void setCollect(CollectOp value);

  /**
   * Returns the value of the '<em><b>First</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' attribute.
   * @see #setFirst(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_First()
   * @model
   * @generated
   */
  String getFirst();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getFirst <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' attribute.
   * @see #getFirst()
   * @generated
   */
  void setFirst(String value);

  /**
   * Returns the value of the '<em><b>Last</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last</em>' attribute.
   * @see #setLast(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Last()
   * @model
   * @generated
   */
  String getLast();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getLast <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last</em>' attribute.
   * @see #getLast()
   * @generated
   */
  void setLast(String value);

  /**
   * Returns the value of the '<em><b>Index Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Of</em>' containment reference.
   * @see #setIndexOf(IndexOfOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_IndexOf()
   * @model containment="true"
   * @generated
   */
  IndexOfOp getIndexOf();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIndexOf <em>Index Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Of</em>' containment reference.
   * @see #getIndexOf()
   * @generated
   */
  void setIndexOf(IndexOfOp value);

  /**
   * Returns the value of the '<em><b>Union</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Union</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Union</em>' containment reference.
   * @see #setUnion(UnionOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Union()
   * @model containment="true"
   * @generated
   */
  UnionOp getUnion();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getUnion <em>Union</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Union</em>' containment reference.
   * @see #getUnion()
   * @generated
   */
  void setUnion(UnionOp value);

  /**
   * Returns the value of the '<em><b>Intersection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intersection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intersection</em>' containment reference.
   * @see #setIntersection(IntersectionOp)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_Intersection()
   * @model containment="true"
   * @generated
   */
  IntersectionOp getIntersection();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIntersection <em>Intersection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intersection</em>' containment reference.
   * @see #getIntersection()
   * @generated
   */
  void setIntersection(IntersectionOp value);

  /**
   * Returns the value of the '<em><b>Is Undefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Undefined</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Undefined</em>' attribute.
   * @see #setIsUndefined(String)
   * @see org.xtext.example.webgme.mTL.MTLPackage#getOCLOperationType2_IsUndefined()
   * @model
   * @generated
   */
  String getIsUndefined();

  /**
   * Sets the value of the '{@link org.xtext.example.webgme.mTL.OCLOperationType2#getIsUndefined <em>Is Undefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Undefined</em>' attribute.
   * @see #getIsUndefined()
   * @generated
   */
  void setIsUndefined(String value);

} // OCLOperationType2
