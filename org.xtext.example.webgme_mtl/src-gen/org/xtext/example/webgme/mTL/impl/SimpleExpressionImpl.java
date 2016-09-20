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

import org.xtext.example.webgme.mTL.ComplexExpression;
import org.xtext.example.webgme.mTL.IfSentence;
import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.Navig;
import org.xtext.example.webgme.mTL.Navigation;
import org.xtext.example.webgme.mTL.ResolveExp;
import org.xtext.example.webgme.mTL.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#get_string <em>string</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#get_integer <em>integer</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#get_double <em>double</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#get_boolean <em>boolean</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#getIsNull <em>Is Null</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#getNavigation <em>Navigation</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#getIfSentence <em>If Sentence</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#getColectionType <em>Colection Type</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#getElems <em>Elems</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#getNav <em>Nav</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.SimpleExpressionImpl#getResolve <em>Resolve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleExpressionImpl extends MinimalEObjectImpl.Container implements SimpleExpression
{
  /**
   * The default value of the '{@link #get_string() <em>string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_string()
   * @generated
   * @ordered
   */
  protected static final String _STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #get_string() <em>string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_string()
   * @generated
   * @ordered
   */
  protected String _string = _STRING_EDEFAULT;

  /**
   * The default value of the '{@link #get_integer() <em>integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_integer()
   * @generated
   * @ordered
   */
  protected static final int _INTEGER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #get_integer() <em>integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_integer()
   * @generated
   * @ordered
   */
  protected int _integer = _INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #get_double() <em>double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_double()
   * @generated
   * @ordered
   */
  protected static final String _DOUBLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #get_double() <em>double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_double()
   * @generated
   * @ordered
   */
  protected String _double = _DOUBLE_EDEFAULT;

  /**
   * The default value of the '{@link #get_boolean() <em>boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_boolean()
   * @generated
   * @ordered
   */
  protected static final String _BOOLEAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #get_boolean() <em>boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #get_boolean()
   * @generated
   * @ordered
   */
  protected String _boolean = _BOOLEAN_EDEFAULT;

  /**
   * The default value of the '{@link #getIsNull() <em>Is Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsNull()
   * @generated
   * @ordered
   */
  protected static final String IS_NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIsNull() <em>Is Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsNull()
   * @generated
   * @ordered
   */
  protected String isNull = IS_NULL_EDEFAULT;

  /**
   * The cached value of the '{@link #getNavigation() <em>Navigation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigation()
   * @generated
   * @ordered
   */
  protected Navig navigation;

  /**
   * The cached value of the '{@link #getIfSentence() <em>If Sentence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfSentence()
   * @generated
   * @ordered
   */
  protected IfSentence ifSentence;

  /**
   * The default value of the '{@link #getColectionType() <em>Colection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColectionType()
   * @generated
   * @ordered
   */
  protected static final String COLECTION_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColectionType() <em>Colection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColectionType()
   * @generated
   * @ordered
   */
  protected String colectionType = COLECTION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElems() <em>Elems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElems()
   * @generated
   * @ordered
   */
  protected EList<ComplexExpression> elems;

  /**
   * The cached value of the '{@link #getNav() <em>Nav</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNav()
   * @generated
   * @ordered
   */
  protected EList<Navigation> nav;

  /**
   * The cached value of the '{@link #getResolve() <em>Resolve</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResolve()
   * @generated
   * @ordered
   */
  protected ResolveExp resolve;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleExpressionImpl()
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
    return MTLPackage.Literals.SIMPLE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String get_string()
  {
    return _string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_string(String new_string)
  {
    String old_string = _string;
    _string = new_string;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__STRING, old_string, _string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int get_integer()
  {
    return _integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_integer(int new_integer)
  {
    int old_integer = _integer;
    _integer = new_integer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__INTEGER, old_integer, _integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String get_double()
  {
    return _double;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_double(String new_double)
  {
    String old_double = _double;
    _double = new_double;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__DOUBLE, old_double, _double));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String get_boolean()
  {
    return _boolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void set_boolean(String new_boolean)
  {
    String old_boolean = _boolean;
    _boolean = new_boolean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__BOOLEAN, old_boolean, _boolean));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIsNull()
  {
    return isNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNull(String newIsNull)
  {
    String oldIsNull = isNull;
    isNull = newIsNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__IS_NULL, oldIsNull, isNull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navig getNavigation()
  {
    return navigation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNavigation(Navig newNavigation, NotificationChain msgs)
  {
    Navig oldNavigation = navigation;
    navigation = newNavigation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__NAVIGATION, oldNavigation, newNavigation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNavigation(Navig newNavigation)
  {
    if (newNavigation != navigation)
    {
      NotificationChain msgs = null;
      if (navigation != null)
        msgs = ((InternalEObject)navigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.SIMPLE_EXPRESSION__NAVIGATION, null, msgs);
      if (newNavigation != null)
        msgs = ((InternalEObject)newNavigation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.SIMPLE_EXPRESSION__NAVIGATION, null, msgs);
      msgs = basicSetNavigation(newNavigation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__NAVIGATION, newNavigation, newNavigation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSentence getIfSentence()
  {
    return ifSentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfSentence(IfSentence newIfSentence, NotificationChain msgs)
  {
    IfSentence oldIfSentence = ifSentence;
    ifSentence = newIfSentence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE, oldIfSentence, newIfSentence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfSentence(IfSentence newIfSentence)
  {
    if (newIfSentence != ifSentence)
    {
      NotificationChain msgs = null;
      if (ifSentence != null)
        msgs = ((InternalEObject)ifSentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE, null, msgs);
      if (newIfSentence != null)
        msgs = ((InternalEObject)newIfSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE, null, msgs);
      msgs = basicSetIfSentence(newIfSentence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE, newIfSentence, newIfSentence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColectionType()
  {
    return colectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColectionType(String newColectionType)
  {
    String oldColectionType = colectionType;
    colectionType = newColectionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__COLECTION_TYPE, oldColectionType, colectionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexExpression> getElems()
  {
    if (elems == null)
    {
      elems = new EObjectContainmentEList<ComplexExpression>(ComplexExpression.class, this, MTLPackage.SIMPLE_EXPRESSION__ELEMS);
    }
    return elems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Navigation> getNav()
  {
    if (nav == null)
    {
      nav = new EObjectContainmentEList<Navigation>(Navigation.class, this, MTLPackage.SIMPLE_EXPRESSION__NAV);
    }
    return nav;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResolveExp getResolve()
  {
    return resolve;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResolve(ResolveExp newResolve, NotificationChain msgs)
  {
    ResolveExp oldResolve = resolve;
    resolve = newResolve;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__RESOLVE, oldResolve, newResolve);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolve(ResolveExp newResolve)
  {
    if (newResolve != resolve)
    {
      NotificationChain msgs = null;
      if (resolve != null)
        msgs = ((InternalEObject)resolve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.SIMPLE_EXPRESSION__RESOLVE, null, msgs);
      if (newResolve != null)
        msgs = ((InternalEObject)newResolve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.SIMPLE_EXPRESSION__RESOLVE, null, msgs);
      msgs = basicSetResolve(newResolve, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.SIMPLE_EXPRESSION__RESOLVE, newResolve, newResolve));
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
      case MTLPackage.SIMPLE_EXPRESSION__NAVIGATION:
        return basicSetNavigation(null, msgs);
      case MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE:
        return basicSetIfSentence(null, msgs);
      case MTLPackage.SIMPLE_EXPRESSION__ELEMS:
        return ((InternalEList<?>)getElems()).basicRemove(otherEnd, msgs);
      case MTLPackage.SIMPLE_EXPRESSION__NAV:
        return ((InternalEList<?>)getNav()).basicRemove(otherEnd, msgs);
      case MTLPackage.SIMPLE_EXPRESSION__RESOLVE:
        return basicSetResolve(null, msgs);
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
      case MTLPackage.SIMPLE_EXPRESSION__STRING:
        return get_string();
      case MTLPackage.SIMPLE_EXPRESSION__INTEGER:
        return get_integer();
      case MTLPackage.SIMPLE_EXPRESSION__DOUBLE:
        return get_double();
      case MTLPackage.SIMPLE_EXPRESSION__BOOLEAN:
        return get_boolean();
      case MTLPackage.SIMPLE_EXPRESSION__IS_NULL:
        return getIsNull();
      case MTLPackage.SIMPLE_EXPRESSION__NAVIGATION:
        return getNavigation();
      case MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE:
        return getIfSentence();
      case MTLPackage.SIMPLE_EXPRESSION__COLECTION_TYPE:
        return getColectionType();
      case MTLPackage.SIMPLE_EXPRESSION__ELEMS:
        return getElems();
      case MTLPackage.SIMPLE_EXPRESSION__NAV:
        return getNav();
      case MTLPackage.SIMPLE_EXPRESSION__RESOLVE:
        return getResolve();
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
      case MTLPackage.SIMPLE_EXPRESSION__STRING:
        set_string((String)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__INTEGER:
        set_integer((Integer)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__DOUBLE:
        set_double((String)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__BOOLEAN:
        set_boolean((String)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__IS_NULL:
        setIsNull((String)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__NAVIGATION:
        setNavigation((Navig)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE:
        setIfSentence((IfSentence)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__COLECTION_TYPE:
        setColectionType((String)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__ELEMS:
        getElems().clear();
        getElems().addAll((Collection<? extends ComplexExpression>)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__NAV:
        getNav().clear();
        getNav().addAll((Collection<? extends Navigation>)newValue);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__RESOLVE:
        setResolve((ResolveExp)newValue);
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
      case MTLPackage.SIMPLE_EXPRESSION__STRING:
        set_string(_STRING_EDEFAULT);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__INTEGER:
        set_integer(_INTEGER_EDEFAULT);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__DOUBLE:
        set_double(_DOUBLE_EDEFAULT);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__BOOLEAN:
        set_boolean(_BOOLEAN_EDEFAULT);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__IS_NULL:
        setIsNull(IS_NULL_EDEFAULT);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__NAVIGATION:
        setNavigation((Navig)null);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE:
        setIfSentence((IfSentence)null);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__COLECTION_TYPE:
        setColectionType(COLECTION_TYPE_EDEFAULT);
        return;
      case MTLPackage.SIMPLE_EXPRESSION__ELEMS:
        getElems().clear();
        return;
      case MTLPackage.SIMPLE_EXPRESSION__NAV:
        getNav().clear();
        return;
      case MTLPackage.SIMPLE_EXPRESSION__RESOLVE:
        setResolve((ResolveExp)null);
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
      case MTLPackage.SIMPLE_EXPRESSION__STRING:
        return _STRING_EDEFAULT == null ? _string != null : !_STRING_EDEFAULT.equals(_string);
      case MTLPackage.SIMPLE_EXPRESSION__INTEGER:
        return _integer != _INTEGER_EDEFAULT;
      case MTLPackage.SIMPLE_EXPRESSION__DOUBLE:
        return _DOUBLE_EDEFAULT == null ? _double != null : !_DOUBLE_EDEFAULT.equals(_double);
      case MTLPackage.SIMPLE_EXPRESSION__BOOLEAN:
        return _BOOLEAN_EDEFAULT == null ? _boolean != null : !_BOOLEAN_EDEFAULT.equals(_boolean);
      case MTLPackage.SIMPLE_EXPRESSION__IS_NULL:
        return IS_NULL_EDEFAULT == null ? isNull != null : !IS_NULL_EDEFAULT.equals(isNull);
      case MTLPackage.SIMPLE_EXPRESSION__NAVIGATION:
        return navigation != null;
      case MTLPackage.SIMPLE_EXPRESSION__IF_SENTENCE:
        return ifSentence != null;
      case MTLPackage.SIMPLE_EXPRESSION__COLECTION_TYPE:
        return COLECTION_TYPE_EDEFAULT == null ? colectionType != null : !COLECTION_TYPE_EDEFAULT.equals(colectionType);
      case MTLPackage.SIMPLE_EXPRESSION__ELEMS:
        return elems != null && !elems.isEmpty();
      case MTLPackage.SIMPLE_EXPRESSION__NAV:
        return nav != null && !nav.isEmpty();
      case MTLPackage.SIMPLE_EXPRESSION__RESOLVE:
        return resolve != null;
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
    result.append(" (_string: ");
    result.append(_string);
    result.append(", _integer: ");
    result.append(_integer);
    result.append(", _double: ");
    result.append(_double);
    result.append(", _boolean: ");
    result.append(_boolean);
    result.append(", isNull: ");
    result.append(isNull);
    result.append(", colectionType: ");
    result.append(colectionType);
    result.append(')');
    return result.toString();
  }

} //SimpleExpressionImpl
