/**
 */
package coreflight00;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link coreflight00.System#getApplications <em>Applications</em>}</li>
 *   <li>{@link coreflight00.System#getInterTaskMessageRouter <em>Inter Task Message Router</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.Coreflight00Package#getSystem()
 * @model extendedMetaData="name='System' kind='elementOnly'"
 * @generated
 */
public interface System extends Identifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference.
	 * @see #setApplications(Applications)
	 * @see coreflight00.Coreflight00Package#getSystem_Applications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='APPLICATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	Applications getApplications();

	/**
	 * Sets the value of the '{@link coreflight00.System#getApplications <em>Applications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applications</em>' containment reference.
	 * @see #getApplications()
	 * @generated
	 */
	void setApplications(Applications value);

	/**
	 * Returns the value of the '<em><b>Inter Task Message Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Task Message Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Task Message Router</em>' containment reference.
	 * @see #setInterTaskMessageRouter(InterTaskMessageRouter)
	 * @see coreflight00.Coreflight00Package#getSystem_InterTaskMessageRouter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='INTER-TASK-MESSAGE-ROUTER' namespace='##targetNamespace'"
	 * @generated
	 */
	InterTaskMessageRouter getInterTaskMessageRouter();

	/**
	 * Sets the value of the '{@link coreflight00.System#getInterTaskMessageRouter <em>Inter Task Message Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Task Message Router</em>' containment reference.
	 * @see #getInterTaskMessageRouter()
	 * @generated
	 */
	void setInterTaskMessageRouter(InterTaskMessageRouter value);

} // System
