/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.ExprSimple;
import org.xtext.example.mydsl.myDsl.Lexpr;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lexpr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LexprImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.LexprImpl#getLexpr <em>Lexpr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LexprImpl extends MinimalEObjectImpl.Container implements Lexpr
{
  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected ExprSimple e1;

  /**
   * The cached value of the '{@link #getLexpr() <em>Lexpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexpr()
   * @generated
   * @ordered
   */
  protected Lexpr lexpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LexprImpl()
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
    return MyDslPackage.Literals.LEXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(ExprSimple newE1, NotificationChain msgs)
  {
    ExprSimple oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LEXPR__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(ExprSimple newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LEXPR__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LEXPR__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LEXPR__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lexpr getLexpr()
  {
    return lexpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLexpr(Lexpr newLexpr, NotificationChain msgs)
  {
    Lexpr oldLexpr = lexpr;
    lexpr = newLexpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.LEXPR__LEXPR, oldLexpr, newLexpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLexpr(Lexpr newLexpr)
  {
    if (newLexpr != lexpr)
    {
      NotificationChain msgs = null;
      if (lexpr != null)
        msgs = ((InternalEObject)lexpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LEXPR__LEXPR, null, msgs);
      if (newLexpr != null)
        msgs = ((InternalEObject)newLexpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.LEXPR__LEXPR, null, msgs);
      msgs = basicSetLexpr(newLexpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.LEXPR__LEXPR, newLexpr, newLexpr));
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
      case MyDslPackage.LEXPR__E1:
        return basicSetE1(null, msgs);
      case MyDslPackage.LEXPR__LEXPR:
        return basicSetLexpr(null, msgs);
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
      case MyDslPackage.LEXPR__E1:
        return getE1();
      case MyDslPackage.LEXPR__LEXPR:
        return getLexpr();
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
      case MyDslPackage.LEXPR__E1:
        setE1((ExprSimple)newValue);
        return;
      case MyDslPackage.LEXPR__LEXPR:
        setLexpr((Lexpr)newValue);
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
      case MyDslPackage.LEXPR__E1:
        setE1((ExprSimple)null);
        return;
      case MyDslPackage.LEXPR__LEXPR:
        setLexpr((Lexpr)null);
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
      case MyDslPackage.LEXPR__E1:
        return e1 != null;
      case MyDslPackage.LEXPR__LEXPR:
        return lexpr != null;
    }
    return super.eIsSet(featureID);
  }

} //LexprImpl
