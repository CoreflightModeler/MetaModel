/**
 */
package coreflight00;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link coreflight00.MessagePort#getApplicationRef <em>Application Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.Coreflight00Package#getMessagePort()
 * @model abstract="true"
 *        extendedMetaData="name='MessagePort' kind='elementOnly'"
 * @generated
 */
public interface MessagePort extends Identifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Application Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Ref</em>' reference.
	 * @see #setApplicationRef(Application)
	 * @see coreflight00.Coreflight00Package#getMessagePort_ApplicationRef()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='APPLICATION-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	Application getApplicationRef();

	/**
	 * Sets the value of the '{@link coreflight00.MessagePort#getApplicationRef <em>Application Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Ref</em>' reference.
	 * @see #getApplicationRef()
	 * @generated
	 */
	void setApplicationRef(Application value);

} // MessagePort
