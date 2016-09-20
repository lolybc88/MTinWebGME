/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.webgme.mTL.AssocRoleName;
import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.Navigation;
import org.xtext.example.webgme.mTL.OCLOperationType1;
import org.xtext.example.webgme.mTL.OCLOperationType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.NavigationImpl#getAttName <em>Att Name</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.NavigationImpl#getAssocRole <em>Assoc Role</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.NavigationImpl#getOpType1 <em>Op Type1</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.NavigationImpl#getOpType2 <em>Op Type2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationImpl extends MinimalEObjectImpl.Container implements Navigation
{
  /**
   * The default value of the '{@link #getAttName() <em>Att Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttName()
   * @generated
   * @ordered
   */
  protected static final String ATT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttName() <em>Att Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttName()
   * @generated
   * @ordered
   */
  protected String attName = ATT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssocRole() <em>Assoc Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssocRole()
   * @generated
   * @ordered
   */
  protected AssocRoleName assocRole;

  /**
   * The cached value of the '{@link #getOpType1() <em>Op Type1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpType1()
   * @generated
   * @ordered
   */
  protected OCLOperationType1 opType1;

  /**
   * The cached value of the '{@link #getOpType2() <em>Op Type2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpType2()
   * @generated
   * @ordered
   */
  protected OCLOperationType2 opType2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigationImpl()
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
    return MTLPackage.Literals.NAVIGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttName()
  {
    return attName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttName(String newAttName)
  {
    String oldAttName = attName;
    attName = newAttName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIGATION__ATT_NAME, oldAttName, attName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssocRoleName getAssocRole()
  {
    return assocRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssocRole(AssocRoleName newAssocRole, NotificationChain msgs)
  {
    AssocRoleName oldAssocRole = assocRole;
    assocRole = newAssocRole;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIGATION__ASSOC_ROLE, oldAssocRole, newAssocRole);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssocRole(AssocRoleName newAssocRole)
  {
    if (newAssocRole != assocRole)
    {
      NotificationChain msgs = null;
      if (assocRole != null)
        msgs = ((InternalEObject)assocRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.NAVIGATION__ASSOC_ROLE, null, msgs);
      if (newAssocRole != null)
        msgs = ((InternalEObject)newAssocRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.NAVIGATION__ASSOC_ROLE, null, msgs);
      msgs = basicSetAssocRole(newAssocRole, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIGATION__ASSOC_ROLE, newAssocRole, newAssocRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLOperationType1 getOpType1()
  {
    return opType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpType1(OCLOperationType1 newOpType1, NotificationChain msgs)
  {
    OCLOperationType1 oldOpType1 = opType1;
    opType1 = newOpType1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIGATION__OP_TYPE1, oldOpType1, newOpType1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpType1(OCLOperationType1 newOpType1)
  {
    if (newOpType1 != opType1)
    {
      NotificationChain msgs = null;
      if (opType1 != null)
        msgs = ((InternalEObject)opType1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.NAVIGATION__OP_TYPE1, null, msgs);
      if (newOpType1 != null)
        msgs = ((InternalEObject)newOpType1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.NAVIGATION__OP_TYPE1, null, msgs);
      msgs = basicSetOpType1(newOpType1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIGATION__OP_TYPE1, newOpType1, newOpType1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLOperationType2 getOpType2()
  {
    return opType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpType2(OCLOperationType2 newOpType2, NotificationChain msgs)
  {
    OCLOperationType2 oldOpType2 = opType2;
    opType2 = newOpType2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIGATION__OP_TYPE2, oldOpType2, newOpType2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpType2(OCLOperationType2 newOpType2)
  {
    if (newOpType2 != opType2)
    {
      NotificationChain msgs = null;
      if (opType2 != null)
        msgs = ((InternalEObject)opType2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.NAVIGATION__OP_TYPE2, null, msgs);
      if (newOpType2 != null)
        msgs = ((InternalEObject)newOpType2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.NAVIGATION__OP_TYPE2, null, msgs);
      msgs = basicSetOpType2(newOpType2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIGATION__OP_TYPE2, newOpType2, newOpType2));
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
      case MTLPackage.NAVIGATION__ASSOC_ROLE:
        return basicSetAssocRole(null, msgs);
      case MTLPackage.NAVIGATION__OP_TYPE1:
        return basicSetOpType1(null, msgs);
      case MTLPackage.NAVIGATION__OP_TYPE2:
        return basicSetOpType2(null, msgs);
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
      case MTLPackage.NAVIGATION__ATT_NAME:
        return getAttName();
      case MTLPackage.NAVIGATION__ASSOC_ROLE:
        return getAssocRole();
      case MTLPackage.NAVIGATION__OP_TYPE1:
        return getOpType1();
      case MTLPackage.NAVIGATION__OP_TYPE2:
        return getOpType2();
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
      case MTLPackage.NAVIGATION__ATT_NAME:
        setAttName((String)newValue);
        return;
      case MTLPackage.NAVIGATION__ASSOC_ROLE:
        setAssocRole((AssocRoleName)newValue);
        return;
      case MTLPackage.NAVIGATION__OP_TYPE1:
        setOpType1((OCLOperationType1)newValue);
        return;
      case MTLPackage.NAVIGATION__OP_TYPE2:
        setOpType2((OCLOperationType2)newValue);
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
      case MTLPackage.NAVIGATION__ATT_NAME:
        setAttName(ATT_NAME_EDEFAULT);
        return;
      case MTLPackage.NAVIGATION__ASSOC_ROLE:
        setAssocRole((AssocRoleName)null);
        return;
      case MTLPackage.NAVIGATION__OP_TYPE1:
        setOpType1((OCLOperationType1)null);
        return;
      case MTLPackage.NAVIGATION__OP_TYPE2:
        setOpType2((OCLOperationType2)null);
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
      case MTLPackage.NAVIGATION__ATT_NAME:
        return ATT_NAME_EDEFAULT == null ? attName != null : !ATT_NAME_EDEFAULT.equals(attName);
      case MTLPackage.NAVIGATION__ASSOC_ROLE:
        return assocRole != null;
      case MTLPackage.NAVIGATION__OP_TYPE1:
        return opType1 != null;
      case MTLPackage.NAVIGATION__OP_TYPE2:
        return opType2 != null;
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
    result.append(" (attName: ");
    result.append(attName);
    result.append(')');
    return result.toString();
  }

} //NavigationImpl
