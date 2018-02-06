/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commandes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commandes#getCommande <em>Commande</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commandes#getCommandes <em>Commandes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandes()
 * @model
 * @generated
 */
public interface Commandes extends EObject
{
  /**
   * Returns the value of the '<em><b>Commande</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commande</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commande</em>' containment reference.
   * @see #setCommande(Commande)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandes_Commande()
   * @model containment="true"
   * @generated
   */
  Commande getCommande();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commandes#getCommande <em>Commande</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commande</em>' containment reference.
   * @see #getCommande()
   * @generated
   */
  void setCommande(Commande value);

  /**
   * Returns the value of the '<em><b>Commandes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Commande}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commandes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commandes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommandes_Commandes()
   * @model containment="true"
   * @generated
   */
  EList<Commande> getCommandes();

} // Commandes