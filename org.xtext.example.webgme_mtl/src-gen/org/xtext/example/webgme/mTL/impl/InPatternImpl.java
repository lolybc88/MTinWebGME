/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.webgme.mTL.InPattern;
import org.xtext.example.webgme.mTL.MTLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.InPatternImpl#getInElem <em>In Elem</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.InPatternImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InPatternImpl extends MinimalEObjectImpl.Container implements InPattern
{
  /**
   * The default value of the '{@link #getInElem() <em>In Elem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInElem()
   * @generated
   * @ordered
   */
  protected static final String IN_ELEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInElem() <em>In Elem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInElem()
   * @generated
   * @ordered
   */
  protected String inElem = IN_ELEM_EDEFAULT;

  /**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InPatternImpl()
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
    return MTLPackage.Literals.IN_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInElem()
  {
    return inElem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInElem(String newInElem)
  {
    String oldInElem = inElem;
    inElem = newInElem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.IN_PATTERN__IN_ELEM, oldInElem, inElem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(String newClassName)
  {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.IN_PATTERN__CLASS_NAME, oldClassName, className));
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
      case MTLPackage.IN_PATTERN__IN_ELEM:
        return getInElem();
      case MTLPackage.IN_PATTERN__CLASS_NAME:
        return getClassName();
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
      case MTLPackage.IN_PATTERN__IN_ELEM:
        setInElem((String)newValue);
        return;
      case MTLPackage.IN_PATTERN__CLASS_NAME:
        setClassName((String)newValue);
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
      case MTLPackage.IN_PATTERN__IN_ELEM:
        setInElem(IN_ELEM_EDEFAULT);
        return;
      case MTLPackage.IN_PATTERN__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
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
      case MTLPackage.IN_PATTERN__IN_ELEM:
        return IN_ELEM_EDEFAULT == null ? inElem != null : !IN_ELEM_EDEFAULT.equals(inElem);
      case MTLPackage.IN_PATTERN__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
    result.append(" (inElem: ");
    result.append(inElem);
    result.append(", className: ");
    result.append(className);
    result.append(')');
    return result.toString();
  }

} //InPatternImpl
