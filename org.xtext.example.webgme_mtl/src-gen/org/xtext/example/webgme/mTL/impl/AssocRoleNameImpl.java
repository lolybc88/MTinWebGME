/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.webgme.mTL.AssocRoleName;
import org.xtext.example.webgme.mTL.MTLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assoc Role Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.AssocRoleNameImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.AssocRoleNameImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.AssocRoleNameImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssocRoleNameImpl extends MinimalEObjectImpl.Container implements AssocRoleName
{
  /**
   * The default value of the '{@link #getChildren() <em>Children</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected static final String CHILDREN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected String children = CHILDREN_EDEFAULT;

  /**
   * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected static final String PARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected String parent = PARENT_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssocRoleNameImpl()
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
    return MTLPackage.Literals.ASSOC_ROLE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChildren()
  {
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildren(String newChildren)
  {
    String oldChildren = children;
    children = newChildren;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.ASSOC_ROLE_NAME__CHILDREN, oldChildren, children));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(String newParent)
  {
    String oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.ASSOC_ROLE_NAME__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.ASSOC_ROLE_NAME__NAME, oldName, name));
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
      case MTLPackage.ASSOC_ROLE_NAME__CHILDREN:
        return getChildren();
      case MTLPackage.ASSOC_ROLE_NAME__PARENT:
        return getParent();
      case MTLPackage.ASSOC_ROLE_NAME__NAME:
        return getName();
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
      case MTLPackage.ASSOC_ROLE_NAME__CHILDREN:
        setChildren((String)newValue);
        return;
      case MTLPackage.ASSOC_ROLE_NAME__PARENT:
        setParent((String)newValue);
        return;
      case MTLPackage.ASSOC_ROLE_NAME__NAME:
        setName((String)newValue);
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
      case MTLPackage.ASSOC_ROLE_NAME__CHILDREN:
        setChildren(CHILDREN_EDEFAULT);
        return;
      case MTLPackage.ASSOC_ROLE_NAME__PARENT:
        setParent(PARENT_EDEFAULT);
        return;
      case MTLPackage.ASSOC_ROLE_NAME__NAME:
        setName(NAME_EDEFAULT);
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
      case MTLPackage.ASSOC_ROLE_NAME__CHILDREN:
        return CHILDREN_EDEFAULT == null ? children != null : !CHILDREN_EDEFAULT.equals(children);
      case MTLPackage.ASSOC_ROLE_NAME__PARENT:
        return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
      case MTLPackage.ASSOC_ROLE_NAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (children: ");
    result.append(children);
    result.append(", parent: ");
    result.append(parent);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AssocRoleNameImpl
