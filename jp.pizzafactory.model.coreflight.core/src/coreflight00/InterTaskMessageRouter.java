/**
 */
package coreflight00;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Task Message Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link coreflight00.InterTaskMessageRouter#getApplications <em>Applications</em>}</li>
 *   <li>{@link coreflight00.InterTaskMessageRouter#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link coreflight00.InterTaskMessageRouter#getSubscriber <em>Subscriber</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.Coreflight00Package#getInterTaskMessageRouter()
 * @model extendedMetaData="name='InterTaskMessageRouter' kind='elementOnly'"
 * @generated
 */
public interface InterTaskMessageRouter extends Identifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' attribute list.
	 * @see coreflight00.Coreflight00Package#getInterTaskMessageRouter_Applications()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='applications:2'"
	 * @generated
	 */
	FeatureMap getApplications();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getInterTaskMessageRouter_Publisher()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PUBLISHER' namespace='##targetNamespace' group='#applications:2'"
	 * @generated
	 */
	EList<Publisher> getPublisher();

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getInterTaskMessageRouter_Subscriber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SUBSCRIBER' namespace='##targetNamespace' group='#applications:2'"
	 * @generated
	 */
	EList<Subscriber> getSubscriber();

} // InterTaskMessageRouter
