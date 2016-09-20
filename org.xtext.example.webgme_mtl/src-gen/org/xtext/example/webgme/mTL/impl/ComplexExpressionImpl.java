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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.webgme.mTL.ComplexExpression;
import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.SimpleExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl#getPrefixNot <em>Prefix Not</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl#getInfixOp <em>Infix Op</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.ComplexExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexExpressionImpl extends MinimalEObjectImpl.Container implements ComplexExpression
{
  /**
   * The default value of the '{@link #getPrefixNot() <em>Prefix Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixNot()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_NOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefixNot() <em>Prefix Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixNot()
   * @generated
   * @ordered
   */
  protected String prefixNot = PREFIX_NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected SimpleExpression left;

  /**
   * The cached value of the '{@link #getInfixOp() <em>Infix Op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfixOp()
   * @generated
   * @ordered
   */
  protected EList<String> infixOp;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<SimpleExpression> right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexExpressionImpl()
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
    return MTLPackage.Literals.COMPLEX_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefixNot()
  {
    return prefixNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefixNot(String newPrefixNot)
  {
    String oldPrefixNot = prefixNot;
    prefixNot = newPrefixNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.COMPLEX_EXPRESSION__PREFIX_NOT, oldPrefixNot, prefixNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(SimpleExpression newLeft, NotificationChain msgs)
  {
    SimpleExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.COMPLEX_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(SimpleExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.COMPLEX_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.COMPLEX_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.COMPLEX_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInfixOp()
  {
    if (infixOp == null)
    {
      infixOp = new EDataTypeEList<String>(String.class, this, MTLPackage.COMPLEX_EXPRESSION__INFIX_OP);
    }
    return infixOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SimpleExpression> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<SimpleExpression>(SimpleExpression.class, this, MTLPackage.COMPLEX_EXPRESSION__RIGHT);
    }
    return right;
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
      case MTLPackage.COMPLEX_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case MTLPackage.COMPLEX_EXPRESSION__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
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
      case MTLPackage.COMPLEX_EXPRESSION__PREFIX_NOT:
        return getPrefixNot();
      case MTLPackage.COMPLEX_EXPRESSION__LEFT:
        return getLeft();
      case MTLPackage.COMPLEX_EXPRESSION__INFIX_OP:
        return getInfixOp();
      case MTLPackage.COMPLEX_EXPRESSION__RIGHT:
        return getRight();
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
      case MTLPackage.COMPLEX_EXPRESSION__PREFIX_NOT:
        setPrefixNot((String)newValue);
        return;
      case MTLPackage.COMPLEX_EXPRESSION__LEFT:
        setLeft((SimpleExpression)newValue);
        return;
      case MTLPackage.COMPLEX_EXPRESSION__INFIX_OP:
        getInfixOp().clear();
        getInfixOp().addAll((Collection<? extends String>)newValue);
        return;
      case MTLPackage.COMPLEX_EXPRESSION__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends SimpleExpression>)newValue);
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
      case MTLPackage.COMPLEX_EXPRESSION__PREFIX_NOT:
        setPrefixNot(PREFIX_NOT_EDEFAULT);
        return;
      case MTLPackage.COMPLEX_EXPRESSION__LEFT:
        setLeft((SimpleExpression)null);
        return;
      case MTLPackage.COMPLEX_EXPRESSION__INFIX_OP:
        getInfixOp().clear();
        return;
      case MTLPackage.COMPLEX_EXPRESSION__RIGHT:
        getRight().clear();
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
      case MTLPackage.COMPLEX_EXPRESSION__PREFIX_NOT:
        return PREFIX_NOT_EDEFAULT == null ? prefixNot != null : !PREFIX_NOT_EDEFAULT.equals(prefixNot);
      case MTLPackage.COMPLEX_EXPRESSION__LEFT:
        return left != null;
      case MTLPackage.COMPLEX_EXPRESSION__INFIX_OP:
        return infixOp != null && !infixOp.isEmpty();
      case MTLPackage.COMPLEX_EXPRESSION__RIGHT:
        return right != null && !right.isEmpty();
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
    result.append(" (prefixNot: ");
    result.append(prefixNot);
    result.append(", infixOp: ");
    result.append(infixOp);
    result.append(')');
    return result.toString();
  }

} //ComplexExpressionImpl
