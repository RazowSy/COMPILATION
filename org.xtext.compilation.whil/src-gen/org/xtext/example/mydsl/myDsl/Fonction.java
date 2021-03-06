/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getCommandes <em>Commandes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Fonction#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction()
 * @model
 * @generated
 */
public interface Fonction extends EObject
{
  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(Input)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_In()
   * @model containment="true"
   * @generated
   */
  Input getIn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(Input value);

  /**
   * Returns the value of the '<em><b>Commandes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commandes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commandes</em>' containment reference.
   * @see #setCommandes(Commandes)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_Commandes()
   * @model containment="true"
   * @generated
   */
  Commandes getCommandes();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getCommandes <em>Commandes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commandes</em>' containment reference.
   * @see #getCommandes()
   * @generated
   */
  void setCommandes(Commandes value);

  /**
   * Returns the value of the '<em><b>Out</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out</em>' containment reference.
   * @see #setOut(Output)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFonction_Out()
   * @model containment="true"
   * @generated
   */
  Output getOut();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Fonction#getOut <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out</em>' containment reference.
   * @see #getOut()
   * @generated
   */
  void setOut(Output value);

} // Fonction
