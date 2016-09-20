/**
 */
package org.xtext.example.webgme.mTL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.webgme.mTL.CollectOp;
import org.xtext.example.webgme.mTL.ExistsOp;
import org.xtext.example.webgme.mTL.ForAllOp;
import org.xtext.example.webgme.mTL.IndexOfOp;
import org.xtext.example.webgme.mTL.IntersectionOp;
import org.xtext.example.webgme.mTL.MTLPackage;
import org.xtext.example.webgme.mTL.OCLOperationType2;
import org.xtext.example.webgme.mTL.SelectOp;
import org.xtext.example.webgme.mTL.UnionOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Operation Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getForall <em>Forall</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getExists <em>Exists</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getCollect <em>Collect</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getFirst <em>First</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getLast <em>Last</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getIndexOf <em>Index Of</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getIntersection <em>Intersection</em>}</li>
 *   <li>{@link org.xtext.example.webgme.mTL.impl.OCLOperationType2Impl#getIsUndefined <em>Is Undefined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLOperationType2Impl extends MinimalEObjectImpl.Container implements OCLOperationType2
{
  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getForall() <em>Forall</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForall()
   * @generated
   * @ordered
   */
  protected ForAllOp forall;

  /**
   * The cached value of the '{@link #getExists() <em>Exists</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExists()
   * @generated
   * @ordered
   */
  protected ExistsOp exists;

  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected SelectOp select;

  /**
   * The cached value of the '{@link #getCollect() <em>Collect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollect()
   * @generated
   * @ordered
   */
  protected CollectOp collect;

  /**
   * The default value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected static final String FIRST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected String first = FIRST_EDEFAULT;

  /**
   * The default value of the '{@link #getLast() <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLast()
   * @generated
   * @ordered
   */
  protected static final String LAST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLast() <em>Last</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLast()
   * @generated
   * @ordered
   */
  protected String last = LAST_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndexOf() <em>Index Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexOf()
   * @generated
   * @ordered
   */
  protected IndexOfOp indexOf;

  /**
   * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnion()
   * @generated
   * @ordered
   */
  protected UnionOp union;

  /**
   * The cached value of the '{@link #getIntersection() <em>Intersection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntersection()
   * @generated
   * @ordered
   */
  protected IntersectionOp intersection;

  /**
   * The default value of the '{@link #getIsUndefined() <em>Is Undefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsUndefined()
   * @generated
   * @ordered
   */
  protected static final String IS_UNDEFINED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIsUndefined() <em>Is Undefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsUndefined()
   * @generated
   * @ordered
   */
  protected String isUndefined = IS_UNDEFINED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OCLOperationType2Impl()
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
    return MTLPackage.Literals.OCL_OPERATION_TYPE2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAllOp getForall()
  {
    return forall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForall(ForAllOp newForall, NotificationChain msgs)
  {
    ForAllOp oldForall = forall;
    forall = newForall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__FORALL, oldForall, newForall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForall(ForAllOp newForall)
  {
    if (newForall != forall)
    {
      NotificationChain msgs = null;
      if (forall != null)
        msgs = ((InternalEObject)forall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__FORALL, null, msgs);
      if (newForall != null)
        msgs = ((InternalEObject)newForall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__FORALL, null, msgs);
      msgs = basicSetForall(newForall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__FORALL, newForall, newForall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistsOp getExists()
  {
    return exists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExists(ExistsOp newExists, NotificationChain msgs)
  {
    ExistsOp oldExists = exists;
    exists = newExists;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__EXISTS, oldExists, newExists);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExists(ExistsOp newExists)
  {
    if (newExists != exists)
    {
      NotificationChain msgs = null;
      if (exists != null)
        msgs = ((InternalEObject)exists).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__EXISTS, null, msgs);
      if (newExists != null)
        msgs = ((InternalEObject)newExists).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__EXISTS, null, msgs);
      msgs = basicSetExists(newExists, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__EXISTS, newExists, newExists));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectOp getSelect()
  {
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelect(SelectOp newSelect, NotificationChain msgs)
  {
    SelectOp oldSelect = select;
    select = newSelect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__SELECT, oldSelect, newSelect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelect(SelectOp newSelect)
  {
    if (newSelect != select)
    {
      NotificationChain msgs = null;
      if (select != null)
        msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__SELECT, null, msgs);
      if (newSelect != null)
        msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__SELECT, null, msgs);
      msgs = basicSetSelect(newSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__SELECT, newSelect, newSelect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectOp getCollect()
  {
    return collect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollect(CollectOp newCollect, NotificationChain msgs)
  {
    CollectOp oldCollect = collect;
    collect = newCollect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__COLLECT, oldCollect, newCollect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollect(CollectOp newCollect)
  {
    if (newCollect != collect)
    {
      NotificationChain msgs = null;
      if (collect != null)
        msgs = ((InternalEObject)collect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__COLLECT, null, msgs);
      if (newCollect != null)
        msgs = ((InternalEObject)newCollect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__COLLECT, null, msgs);
      msgs = basicSetCollect(newCollect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__COLLECT, newCollect, newCollect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(String newFirst)
  {
    String oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLast()
  {
    return last;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLast(String newLast)
  {
    String oldLast = last;
    last = newLast;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__LAST, oldLast, last));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexOfOp getIndexOf()
  {
    return indexOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexOf(IndexOfOp newIndexOf, NotificationChain msgs)
  {
    IndexOfOp oldIndexOf = indexOf;
    indexOf = newIndexOf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF, oldIndexOf, newIndexOf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndexOf(IndexOfOp newIndexOf)
  {
    if (newIndexOf != indexOf)
    {
      NotificationChain msgs = null;
      if (indexOf != null)
        msgs = ((InternalEObject)indexOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF, null, msgs);
      if (newIndexOf != null)
        msgs = ((InternalEObject)newIndexOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF, null, msgs);
      msgs = basicSetIndexOf(newIndexOf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF, newIndexOf, newIndexOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionOp getUnion()
  {
    return union;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnion(UnionOp newUnion, NotificationChain msgs)
  {
    UnionOp oldUnion = union;
    union = newUnion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__UNION, oldUnion, newUnion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnion(UnionOp newUnion)
  {
    if (newUnion != union)
    {
      NotificationChain msgs = null;
      if (union != null)
        msgs = ((InternalEObject)union).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__UNION, null, msgs);
      if (newUnion != null)
        msgs = ((InternalEObject)newUnion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__UNION, null, msgs);
      msgs = basicSetUnion(newUnion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__UNION, newUnion, newUnion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntersectionOp getIntersection()
  {
    return intersection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntersection(IntersectionOp newIntersection, NotificationChain msgs)
  {
    IntersectionOp oldIntersection = intersection;
    intersection = newIntersection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION, oldIntersection, newIntersection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntersection(IntersectionOp newIntersection)
  {
    if (newIntersection != intersection)
    {
      NotificationChain msgs = null;
      if (intersection != null)
        msgs = ((InternalEObject)intersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION, null, msgs);
      if (newIntersection != null)
        msgs = ((InternalEObject)newIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION, null, msgs);
      msgs = basicSetIntersection(newIntersection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION, newIntersection, newIntersection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIsUndefined()
  {
    return isUndefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsUndefined(String newIsUndefined)
  {
    String oldIsUndefined = isUndefined;
    isUndefined = newIsUndefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MTLPackage.OCL_OPERATION_TYPE2__IS_UNDEFINED, oldIsUndefined, isUndefined));
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
      case MTLPackage.OCL_OPERATION_TYPE2__FORALL:
        return basicSetForall(null, msgs);
      case MTLPackage.OCL_OPERATION_TYPE2__EXISTS:
        return basicSetExists(null, msgs);
      case MTLPackage.OCL_OPERATION_TYPE2__SELECT:
        return basicSetSelect(null, msgs);
      case MTLPackage.OCL_OPERATION_TYPE2__COLLECT:
        return basicSetCollect(null, msgs);
      case MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF:
        return basicSetIndexOf(null, msgs);
      case MTLPackage.OCL_OPERATION_TYPE2__UNION:
        return basicSetUnion(null, msgs);
      case MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION:
        return basicSetIntersection(null, msgs);
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
      case MTLPackage.OCL_OPERATION_TYPE2__SIZE:
        return getSize();
      case MTLPackage.OCL_OPERATION_TYPE2__FORALL:
        return getForall();
      case MTLPackage.OCL_OPERATION_TYPE2__EXISTS:
        return getExists();
      case MTLPackage.OCL_OPERATION_TYPE2__SELECT:
        return getSelect();
      case MTLPackage.OCL_OPERATION_TYPE2__COLLECT:
        return getCollect();
      case MTLPackage.OCL_OPERATION_TYPE2__FIRST:
        return getFirst();
      case MTLPackage.OCL_OPERATION_TYPE2__LAST:
        return getLast();
      case MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF:
        return getIndexOf();
      case MTLPackage.OCL_OPERATION_TYPE2__UNION:
        return getUnion();
      case MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION:
        return getIntersection();
      case MTLPackage.OCL_OPERATION_TYPE2__IS_UNDEFINED:
        return getIsUndefined();
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
      case MTLPackage.OCL_OPERATION_TYPE2__SIZE:
        setSize((String)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__FORALL:
        setForall((ForAllOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__EXISTS:
        setExists((ExistsOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__SELECT:
        setSelect((SelectOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__COLLECT:
        setCollect((CollectOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__FIRST:
        setFirst((String)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__LAST:
        setLast((String)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF:
        setIndexOf((IndexOfOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__UNION:
        setUnion((UnionOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION:
        setIntersection((IntersectionOp)newValue);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__IS_UNDEFINED:
        setIsUndefined((String)newValue);
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
      case MTLPackage.OCL_OPERATION_TYPE2__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__FORALL:
        setForall((ForAllOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__EXISTS:
        setExists((ExistsOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__SELECT:
        setSelect((SelectOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__COLLECT:
        setCollect((CollectOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__FIRST:
        setFirst(FIRST_EDEFAULT);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__LAST:
        setLast(LAST_EDEFAULT);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF:
        setIndexOf((IndexOfOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__UNION:
        setUnion((UnionOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION:
        setIntersection((IntersectionOp)null);
        return;
      case MTLPackage.OCL_OPERATION_TYPE2__IS_UNDEFINED:
        setIsUndefined(IS_UNDEFINED_EDEFAULT);
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
      case MTLPackage.OCL_OPERATION_TYPE2__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case MTLPackage.OCL_OPERATION_TYPE2__FORALL:
        return forall != null;
      case MTLPackage.OCL_OPERATION_TYPE2__EXISTS:
        return exists != null;
      case MTLPackage.OCL_OPERATION_TYPE2__SELECT:
        return select != null;
      case MTLPackage.OCL_OPERATION_TYPE2__COLLECT:
        return collect != null;
      case MTLPackage.OCL_OPERATION_TYPE2__FIRST:
        return FIRST_EDEFAULT == null ? first != null : !FIRST_EDEFAULT.equals(first);
      case MTLPackage.OCL_OPERATION_TYPE2__LAST:
        return LAST_EDEFAULT == null ? last != null : !LAST_EDEFAULT.equals(last);
      case MTLPackage.OCL_OPERATION_TYPE2__INDEX_OF:
        return indexOf != null;
      case MTLPackage.OCL_OPERATION_TYPE2__UNION:
        return union != null;
      case MTLPackage.OCL_OPERATION_TYPE2__INTERSECTION:
        return intersection != null;
      case MTLPackage.OCL_OPERATION_TYPE2__IS_UNDEFINED:
        return IS_UNDEFINED_EDEFAULT == null ? isUndefined != null : !IS_UNDEFINED_EDEFAULT.equals(isUndefined);
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
    result.append(" (size: ");
    result.append(size);
    result.append(", first: ");
    result.append(first);
    result.append(", last: ");
    result.append(last);
    result.append(", isUndefined: ");
    result.append(isUndefined);
    result.append(')');
    return result.toString();
  }

} //OCLOperationType2Impl
