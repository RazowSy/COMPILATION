/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Commande#getCommande <em>Commande</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande()
 * @model
 * @generated
 */
public interface Commande extends EObject
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
   * @see #setCommande(EObject)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCommande_Commande()
   * @model containment="true"
   * @generated
   */
  EObject getCommande();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Commande#getCommande <em>Commande</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commande</em>' containment reference.
   * @see #getCommande()
   * @generated
   */
  void setCommande(EObject value);

} // Commande