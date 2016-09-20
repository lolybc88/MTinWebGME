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

import org.xtext.example.webgme.mTL.Filter;
import org.xtext.example.webgme.mTL.InPattern;
import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.OutPattern;
import org.xtext.example.webgme.mTL.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.RuleImpl#getInPatterns <em>In Patterns</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.RuleImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.RuleImpl#getOutPatterns <em>Out Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
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
   * The cached value of the '{@link #getInPatterns() <em>In Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInPatterns()
   * @generated
   * @ordered
   */
  protected EList<InPattern> inPatterns;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected Filter filter;

  /**
   * The cached value of the '{@link #getOutPatterns() <em>Out Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutPatterns()
   * @generated
   * @ordered
   */
  protected EList<OutPattern> outPatterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return MTLPackage.Literals.RULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InPattern> getInPatterns()
  {
    if (inPatterns == null)
    {
      inPatterns = new EObjectContainmentEList<InPattern>(InPattern.class, this, MTLPackage.RULE__IN_PATTERNS);
    }
    return inPatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(Filter newFilter, NotificationChain msgs)
  {
    Filter oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.RULE__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(Filter newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.RULE__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.RULE__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.RULE__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutPattern> getOutPatterns()
  {
    if (outPatterns == null)
    {
      outPatterns = new EObjectContainmentEList<OutPattern>(OutPattern.class, this, MTLPackage.RULE__OUT_PATTERNS);
    }
    return outPatterns;
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
      case MTLPackage.RULE__IN_PATTERNS:
        return ((InternalEList<?>)getInPatterns()).basicRemove(otherEnd, msgs);
      case MTLPackage.RULE__FILTER:
        return basicSetFilter(null, msgs);
      case MTLPackage.RULE__OUT_PATTERNS:
        return ((InternalEList<?>)getOutPatterns()).basicRemove(otherEnd, msgs);
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
      case MTLPackage.RULE__NAME:
        return getName();
      case MTLPackage.RULE__IN_PATTERNS:
        return getInPatterns();
      case MTLPackage.RULE__FILTER:
        return getFilter();
      case MTLPackage.RULE__OUT_PATTERNS:
        return getOutPatterns();
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
      case MTLPackage.RULE__NAME:
        setName((String)newValue);
        return;
      case MTLPackage.RULE__IN_PATTERNS:
        getInPatterns().clear();
        getInPatterns().addAll((Collection<? extends InPattern>)newValue);
        return;
      case MTLPackage.RULE__FILTER:
        setFilter((Filter)newValue);
        return;
      case MTLPackage.RULE__OUT_PATTERNS:
        getOutPatterns().clear();
        getOutPatterns().addAll((Collection<? extends OutPattern>)newValue);
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
      case MTLPackage.RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MTLPackage.RULE__IN_PATTERNS:
        getInPatterns().clear();
        return;
      case MTLPackage.RULE__FILTER:
        setFilter((Filter)null);
        return;
      case MTLPackage.RULE__OUT_PATTERNS:
        getOutPatterns().clear();
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
      case MTLPackage.RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MTLPackage.RULE__IN_PATTERNS:
        return inPatterns != null && !inPatterns.isEmpty();
      case MTLPackage.RULE__FILTER:
        return filter != null;
      case MTLPackage.RULE__OUT_PATTERNS:
        return outPatterns != null && !outPatterns.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
