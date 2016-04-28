/**
 */
package coreflight00.cfe;

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
 *   <li>{@link coreflight00.cfe.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link coreflight00.cfe.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link coreflight00.cfe.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link coreflight00.cfe.DocumentRoot#getEVENTSERVICES <em>EVENTSERVICES</em>}</li>
 *   <li>{@link coreflight00.cfe.DocumentRoot#getEXECUTIVESERVICES <em>EXECUTIVESERVICES</em>}</li>
 *   <li>{@link coreflight00.cfe.DocumentRoot#getSOFTWAREBUS <em>SOFTWAREBUS</em>}</li>
 *   <li>{@link coreflight00.cfe.DocumentRoot#getTABLESERVICES <em>TABLESERVICES</em>}</li>
 *   <li>{@link coreflight00.cfe.DocumentRoot#getTIMESERVICES <em>TIMESERVICES</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.cfe.CfePackage#getDocumentRoot()
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
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_Mixed()
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
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>EVENTSERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EVENTSERVICES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EVENTSERVICES</em>' containment reference.
	 * @see #setEVENTSERVICES(EventServices)
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_EVENTSERVICES()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EVENT-SERVICES' namespace='##targetNamespace'"
	 * @generated
	 */
	EventServices getEVENTSERVICES();

	/**
	 * Sets the value of the '{@link coreflight00.cfe.DocumentRoot#getEVENTSERVICES <em>EVENTSERVICES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EVENTSERVICES</em>' containment reference.
	 * @see #getEVENTSERVICES()
	 * @generated
	 */
	void setEVENTSERVICES(EventServices value);

	/**
	 * Returns the value of the '<em><b>EXECUTIVESERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EXECUTIVESERVICES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EXECUTIVESERVICES</em>' containment reference.
	 * @see #setEXECUTIVESERVICES(ExecutiveServices)
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_EXECUTIVESERVICES()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EXECUTIVE-SERVICES' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecutiveServices getEXECUTIVESERVICES();

	/**
	 * Sets the value of the '{@link coreflight00.cfe.DocumentRoot#getEXECUTIVESERVICES <em>EXECUTIVESERVICES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EXECUTIVESERVICES</em>' containment reference.
	 * @see #getEXECUTIVESERVICES()
	 * @generated
	 */
	void setEXECUTIVESERVICES(ExecutiveServices value);

	/**
	 * Returns the value of the '<em><b>SOFTWAREBUS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SOFTWAREBUS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SOFTWAREBUS</em>' containment reference.
	 * @see #setSOFTWAREBUS(SoftwareBus)
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_SOFTWAREBUS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SOFTWARE-BUS' namespace='##targetNamespace'"
	 * @generated
	 */
	SoftwareBus getSOFTWAREBUS();

	/**
	 * Sets the value of the '{@link coreflight00.cfe.DocumentRoot#getSOFTWAREBUS <em>SOFTWAREBUS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SOFTWAREBUS</em>' containment reference.
	 * @see #getSOFTWAREBUS()
	 * @generated
	 */
	void setSOFTWAREBUS(SoftwareBus value);

	/**
	 * Returns the value of the '<em><b>TABLESERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TABLESERVICES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TABLESERVICES</em>' containment reference.
	 * @see #setTABLESERVICES(TableServices)
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_TABLESERVICES()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TABLE-SERVICES' namespace='##targetNamespace'"
	 * @generated
	 */
	TableServices getTABLESERVICES();

	/**
	 * Sets the value of the '{@link coreflight00.cfe.DocumentRoot#getTABLESERVICES <em>TABLESERVICES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TABLESERVICES</em>' containment reference.
	 * @see #getTABLESERVICES()
	 * @generated
	 */
	void setTABLESERVICES(TableServices value);

	/**
	 * Returns the value of the '<em><b>TIMESERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TIMESERVICES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TIMESERVICES</em>' containment reference.
	 * @see #setTIMESERVICES(TimeServices)
	 * @see coreflight00.cfe.CfePackage#getDocumentRoot_TIMESERVICES()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TIME-SERVICES' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeServices getTIMESERVICES();

	/**
	 * Sets the value of the '{@link coreflight00.cfe.DocumentRoot#getTIMESERVICES <em>TIMESERVICES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TIMESERVICES</em>' containment reference.
	 * @see #getTIMESERVICES()
	 * @generated
	 */
	void setTIMESERVICES(TimeServices value);

} // DocumentRoot
