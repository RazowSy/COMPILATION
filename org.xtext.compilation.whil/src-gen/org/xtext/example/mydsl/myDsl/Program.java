/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Program#getFonctions <em>Fonctions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Fonctions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Fonction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fonctions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fonctions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getProgram_Fonctions()
   * @model containment="true"
   * @generated
   */
  EList<Fonction> getFonctions();

} // Program
