/**
 */
package coreflight00;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link coreflight00.ApplicationRef#getRefUUID <em>Ref UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.Coreflight00Package#getApplicationRef()
 * @model extendedMetaData="name='ApplicationRef' kind='elementOnly'"
 * @generated
 */
public interface ApplicationRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref UUID</em>' attribute.
	 * @see #setRefUUID(String)
	 * @see coreflight00.Coreflight00Package#getApplicationRef_RefUUID()
	 * @model id="true" dataType="coreflight00.UUID" required="true"
	 *        extendedMetaData="kind='element' name='REF-UUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefUUID();

	/**
	 * Sets the value of the '{@link coreflight00.ApplicationRef#getRefUUID <em>Ref UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref UUID</em>' attribute.
	 * @see #getRefUUID()
	 * @generated
	 */
	void setRefUUID(String value);

} // ApplicationRef
