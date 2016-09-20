/**
 */
package org.xtext.example.webgme.mTL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.Navig;
import org.xtext.example.webgme.mTL.Navigation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navig</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.NavigImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.NavigImpl#getNavigation <em>Navigation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigImpl extends MinimalEObjectImpl.Container implements Navig
{
  /**
   * The default value of the '{@link #getAttr() <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected static final String ATTR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected String attr = ATTR_EDEFAULT;

  /**
   * The cached value of the '{@link #getNavigation() <em>Navigation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigation()
   * @generated
   * @ordered
   */
  protected EList<Navigation> navigation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigImpl()
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
    return MTLPackage.Literals.NAVIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(String newAttr)
  {
    String oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.NAVIG__ATTR, oldAttr, attr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Navigation> getNavigation()
  {
    if (navigation == null)
    {
      navigation = new EObjectContainmentEList<Navigation>(Navigation.class, this, MTLPackage.NAVIG__NAVIGATION);
    }
    return navigation;
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
      case MTLPackage.NAVIG__NAVIGATION:
        return ((InternalEList<?>)getNavigation()).basicRemove(otherEnd, msgs);
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
      case MTLPackage.NAVIG__ATTR:
        return getAttr();
      case MTLPackage.NAVIG__NAVIGATION:
        return getNavigation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MTLPackage.NAVIG__ATTR:
        setAttr((String)newValue);
        return;
      case MTLPackage.NAVIG__NAVIGATION:
        getNavigation().clear();
        getNavigation().addAll((Collection<? extends Navigation>)newValue);
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
      case MTLPackage.NAVIG__ATTR:
        setAttr(ATTR_EDEFAULT);
        return;
      case MTLPackage.NAVIG__NAVIGATION:
        getNavigation().clear();
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
      case MTLPackage.NAVIG__ATTR:
        return ATTR_EDEFAULT == null ? attr != null : !ATTR_EDEFAULT.equals(attr);
      case MTLPackage.NAVIG__NAVIGATION:
        return navigation != null && !navigation.isEmpty();
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
    result.append(" (attr: ");
    result.append(attr);
    result.append(')');
    return result.toString();
  }

} //NavigImpl
