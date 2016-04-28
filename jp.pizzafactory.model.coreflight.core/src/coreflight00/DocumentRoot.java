/**
 */
package coreflight00;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link coreflight00.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getApplication <em>Application</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getApplicationRef <em>Application Ref</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getApplications <em>Applications</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getInterTaskMessageRouter <em>Inter Task Message Router</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getShortName <em>Short Name</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getSystem <em>System</em>}</li>
 *   <li>{@link coreflight00.DocumentRoot#getUuid <em>Uuid</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.Coreflight00Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(Application)
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_Application()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='APPLICATION' namespace='##targetNamespace'"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Application Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Ref</em>' reference.
	 * @see #setApplicationRef(Application)
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_ApplicationRef()
	 * @model upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='APPLICATION-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	Application getApplicationRef();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getApplicationRef <em>Application Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Ref</em>' reference.
	 * @see #getApplicationRef()
	 * @generated
	 */
	void setApplicationRef(Application value);

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
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_Applications()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='APPLICATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	Applications getApplications();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getApplications <em>Applications</em>}' containment reference.
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
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_InterTaskMessageRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='INTER-TASK-MESSAGE-ROUTER' namespace='##targetNamespace'"
	 * @generated
	 */
	InterTaskMessageRouter getInterTaskMessageRouter();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getInterTaskMessageRouter <em>Inter Task Message Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Task Message Router</em>' containment reference.
	 * @see #getInterTaskMessageRouter()
	 * @generated
	 */
	void setInterTaskMessageRouter(InterTaskMessageRouter value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Publisher)
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PUBLISHER' namespace='##targetNamespace'"
	 * @generated
	 */
	Publisher getPublisher();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(QName)
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_ShortName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.QName" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SHORT-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getShortName();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(QName value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' containment reference.
	 * @see #setSubscriber(Subscriber)
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_Subscriber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SUBSCRIBER' namespace='##targetNamespace'"
	 * @generated
	 */
	Subscriber getSubscriber();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getSubscriber <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' containment reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Subscriber value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(coreflight00.System)
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_System()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SYSTEM' namespace='##targetNamespace'"
	 * @generated
	 */
	coreflight00.System getSystem();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(coreflight00.System value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see coreflight00.Coreflight00Package#getDocumentRoot_Uuid()
	 * @model unique="false" dataType="coreflight00.UUID" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link coreflight00.DocumentRoot#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // DocumentRoot
