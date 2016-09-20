/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.webgme.mTL.Assignation;
import org.xtext.example.webgme.mTL.AssocRoleName;
import org.xtext.example.webgme.mTL.ComplexExpression;
import org.xtext.example.webgme.mTL.MTLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.AssignationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.AssignationImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.AssignationImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignationImpl extends MinimalEObjectImpl.Container implements Assignation
{
  /**
   * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected String attribute = ATTRIBUTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected ComplexExpression expr;

  /**
   * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationship()
   * @generated
   * @ordered
   */
  protected AssocRoleName relationship;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignationImpl()
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
    return MTLPackage.Literals.ASSIGNATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(String newAttribute)
  {
    String oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.ASSIGNATION__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(ComplexExpression newExpr, NotificationChain msgs)
  {
    ComplexExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.ASSIGNATION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(ComplexExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.ASSIGNATION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.ASSIGNATION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.ASSIGNATION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssocRoleName getRelationship()
  {
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationship(AssocRoleName newRelationship, NotificationChain msgs)
  {
    AssocRoleName oldRelationship = relationship;
    relationship = newRelationship;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.ASSIGNATION__RELATIONSHIP, oldRelationship, newRelationship);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationship(AssocRoleName newRelationship)
  {
    if (newRelationship != relationship)
    {
      NotificationChain msgs = null;
      if (relationship != null)
        msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.ASSIGNATION__RELATIONSHIP, null, msgs);
      if (newRelationship != null)
        msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.ASSIGNATION__RELATIONSHIP, null, msgs);
      msgs = basicSetRelationship(newRelationship, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.ASSIGNATION__RELATIONSHIP, newRelationship, newRelationship));
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
      case MTLPackage.ASSIGNATION__EXPR:
        return basicSetExpr(null, msgs);
      case MTLPackage.ASSIGNATION__RELATIONSHIP:
        return basicSetRelationship(null, msgs);
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
      case MTLPackage.ASSIGNATION__ATTRIBUTE:
        return getAttribute();
      case MTLPackage.ASSIGNATION__EXPR:
        return getExpr();
      case MTLPackage.ASSIGNATION__RELATIONSHIP:
        return getRelationship();
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
      case MTLPackage.ASSIGNATION__ATTRIBUTE:
        setAttribute((String)newValue);
        return;
      case MTLPackage.ASSIGNATION__EXPR:
        setExpr((ComplexExpression)newValue);
        return;
      case MTLPackage.ASSIGNATION__RELATIONSHIP:
        setRelationship((AssocRoleName)newValue);
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
      case MTLPackage.ASSIGNATION__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
        return;
      case MTLPackage.ASSIGNATION__EXPR:
        setExpr((ComplexExpression)null);
        return;
      case MTLPackage.ASSIGNATION__RELATIONSHIP:
        setRelationship((AssocRoleName)null);
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
      case MTLPackage.ASSIGNATION__ATTRIBUTE:
        return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
      case MTLPackage.ASSIGNATION__EXPR:
        return expr != null;
      case MTLPackage.ASSIGNATION__RELATIONSHIP:
        return relationship != null;
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
    result.append(" (attribute: ");
    result.append(attribute);
    result.append(')');
    return result.toString();
  }

} //AssignationImpl
