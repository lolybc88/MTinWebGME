/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.webgme.mTL.ComplexExpression;
import org.xtext.example.webgme.mTL.IfSentence;
import org.xtext.example.webgme.mTL.MTLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.IfSentenceImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.IfSentenceImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.IfSentenceImpl#getElsebody <em>Elsebody</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfSentenceImpl extends MinimalEObjectImpl.Container implements IfSentence
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected ComplexExpression cond;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ComplexExpression body;

  /**
   * The cached value of the '{@link #getElsebody() <em>Elsebody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsebody()
   * @generated
   * @ordered
   */
  protected ComplexExpression elsebody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfSentenceImpl()
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
    return MTLPackage.Literals.IF_SENTENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(ComplexExpression newCond, NotificationChain msgs)
  {
    ComplexExpression oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.IF_SENTENCE__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(ComplexExpression newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.IF_SENTENCE__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.IF_SENTENCE__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.IF_SENTENCE__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ComplexExpression newBody, NotificationChain msgs)
  {
    ComplexExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.IF_SENTENCE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(ComplexExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.IF_SENTENCE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.IF_SENTENCE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.IF_SENTENCE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression getElsebody()
  {
    return elsebody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsebody(ComplexExpression newElsebody, NotificationChain msgs)
  {
    ComplexExpression oldElsebody = elsebody;
    elsebody = newElsebody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.IF_SENTENCE__ELSEBODY, oldElsebody, newElsebody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsebody(ComplexExpression newElsebody)
  {
    if (newElsebody != elsebody)
    {
      NotificationChain msgs = null;
      if (elsebody != null)
        msgs = ((InternalEObject)elsebody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.IF_SENTENCE__ELSEBODY, null, msgs);
      if (newElsebody != null)
        msgs = ((InternalEObject)newElsebody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.IF_SENTENCE__ELSEBODY, null, msgs);
      msgs = basicSetElsebody(newElsebody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.IF_SENTENCE__ELSEBODY, newElsebody, newElsebody));
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
      case MTLPackage.IF_SENTENCE__COND:
        return basicSetCond(null, msgs);
      case MTLPackage.IF_SENTENCE__BODY:
        return basicSetBody(null, msgs);
      case MTLPackage.IF_SENTENCE__ELSEBODY:
        return basicSetElsebody(null, msgs);
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
      case MTLPackage.IF_SENTENCE__COND:
        return getCond();
      case MTLPackage.IF_SENTENCE__BODY:
        return getBody();
      case MTLPackage.IF_SENTENCE__ELSEBODY:
        return getElsebody();
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
      case MTLPackage.IF_SENTENCE__COND:
        setCond((ComplexExpression)newValue);
        return;
      case MTLPackage.IF_SENTENCE__BODY:
        setBody((ComplexExpression)newValue);
        return;
      case MTLPackage.IF_SENTENCE__ELSEBODY:
        setElsebody((ComplexExpression)newValue);
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
      case MTLPackage.IF_SENTENCE__COND:
        setCond((ComplexExpression)null);
        return;
      case MTLPackage.IF_SENTENCE__BODY:
        setBody((ComplexExpression)null);
        return;
      case MTLPackage.IF_SENTENCE__ELSEBODY:
        setElsebody((ComplexExpression)null);
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
      case MTLPackage.IF_SENTENCE__COND:
        return cond != null;
      case MTLPackage.IF_SENTENCE__BODY:
        return body != null;
      case MTLPackage.IF_SENTENCE__ELSEBODY:
        return elsebody != null;
    }
    return super.eIsSet(featureID);
  }

} //IfSentenceImpl
