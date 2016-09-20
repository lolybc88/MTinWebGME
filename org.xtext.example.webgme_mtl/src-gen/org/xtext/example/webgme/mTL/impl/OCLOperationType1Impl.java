/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.webgme.mTL.ConcatOp;
import org.xtext.example.webgme.mTL.IsTypeOfOp;
import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.OCLOperationType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Operation Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl#getAllIns <em>All Ins</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl#getIsTypeOf <em>Is Type Of</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl#getToString <em>To String</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType1Impl#getConcatenate <em>Concatenate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLOperationType1Impl extends MinimalEObjectImpl.Container implements OCLOperationType1
{
  /**
   * The default value of the '{@link #getAllIns() <em>All Ins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllIns()
   * @generated
   * @ordered
   */
  protected static final String ALL_INS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllIns() <em>All Ins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllIns()
   * @generated
   * @ordered
   */
  protected String allIns = ALL_INS_EDEFAULT;

  /**
   * The cached value of the '{@link #getIsTypeOf() <em>Is Type Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsTypeOf()
   * @generated
   * @ordered
   */
  protected IsTypeOfOp isTypeOf;

  /**
   * The default value of the '{@link #getToString() <em>To String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToString()
   * @generated
   * @ordered
   */
  protected static final String TO_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToString() <em>To String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToString()
   * @generated
   * @ordered
   */
  protected String toString = TO_STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getConcatenate() <em>Concatenate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcatenate()
   * @generated
   * @ordered
   */
  protected ConcatOp concatenate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OCLOperationType1Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MTLPackage.Literals.OCL_OPERATION_TYPE1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAllIns()
  {
    return allIns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllIns(String newAllIns)
  {
    String oldAllIns = allIns;
    allIns = newAllIns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE1__ALL_INS, oldAllIns, allIns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsTypeOfOp getIsTypeOf()
  {
    return isTypeOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsTypeOf(IsTypeOfOp newIsTypeOf, NotificationChain msgs)
  {
    IsTypeOfOp oldIsTypeOf = isTypeOf;
    isTypeOf = newIsTypeOf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF, oldIsTypeOf, newIsTypeOf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTypeOf(IsTypeOfOp newIsTypeOf)
  {
    if (newIsTypeOf != isTypeOf)
    {
      NotificationChain msgs = null;
      if (isTypeOf != null)
        msgs = ((InternalEObject)isTypeOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF, null, msgs);
      if (newIsTypeOf != null)
        msgs = ((InternalEObject)newIsTypeOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF, null, msgs);
      msgs = basicSetIsTypeOf(newIsTypeOf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF, newIsTypeOf, newIsTypeOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToString()
  {
    return toString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToString(String newToString)
  {
    String oldToString = toString;
    toString = newToString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE1__TO_STRING, oldToString, toString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcatOp getConcatenate()
  {
    return concatenate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcatenate(ConcatOp newConcatenate, NotificationChain msgs)
  {
    ConcatOp oldConcatenate = concatenate;
    concatenate = newConcatenate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE, oldConcatenate, newConcatenate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcatenate(ConcatOp newConcatenate)
  {
    if (newConcatenate != concatenate)
    {
      NotificationChain msgs = null;
      if (concatenate != null)
        msgs = ((InternalEObject)concatenate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE, null, msgs);
      if (newConcatenate != null)
        msgs = ((InternalEObject)newConcatenate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE, null, msgs);
      msgs = basicSetConcatenate(newConcatenate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE, newConcatenate, newConcatenate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF:
        return basicSetIsTypeOf(null, msgs);
      case MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE:
        return basicSetConcatenate(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MTLPackage.OCL_OPERATION_TYPE1__ALL_INS:
        return getAllIns();
      case MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF:
        return getIsTypeOf();
      case MTLPackage.OCL_OPERATION_TYPE1__TO_STRING:
        return getToString();
      case MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE:
        return getConcatenate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MTLPackage.OCL_OPERATION_TYPE1__ALL_INS:
        setAllIns((String)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF:
        setIsTypeOf((IsTypeOfOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE1__TO_STRING:
        setToString((String)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE:
        setConcatenate((ConcatOp)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MTLPackage.OCL_OPERATION_TYPE1__ALL_INS:
        setAllIns(ALL_INS_EDEFAULT);
        return;
      case MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF:
        setIsTypeOf((IsTypeOfOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE1__TO_STRING:
        setToString(TO_STRING_EDEFAULT);
        return;
      case MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE:
        setConcatenate((ConcatOp)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MTLPackage.OCL_OPERATION_TYPE1__ALL_INS:
        return ALL_INS_EDEFAULT == null ? allIns != null : !ALL_INS_EDEFAULT.equals(allIns);
      case MTLPackage.OCL_OPERATION_TYPE1__IS_TYPE_OF:
        return isTypeOf != null;
      case MTLPackage.OCL_OPERATION_TYPE1__TO_STRING:
        return TO_STRING_EDEFAULT == null ? toString != null : !TO_STRING_EDEFAULT.equals(toString);
      case MTLPackage.OCL_OPERATION_TYPE1__CONCATENATE:
        return concatenate != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (allIns: ");
    result.append(allIns);
    result.append(", toString: ");
    result.append(toString);
    result.append(')');
    return result.toString();
  }

} //OCLOperationType1Impl
