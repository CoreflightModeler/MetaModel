/**
 */
package coreflight00.cfs;

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
 *   <li>{@link coreflight00.cfs.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getCFDPFILETRANSFER <em>CFDPFILETRANSFER</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getDATASTORAGE <em>DATASTORAGE</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getFILEMANAGER <em>FILEMANAGER</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getHEALTHANDSAFETY <em>HEALTHANDSAFETY</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getHOUSEKEEPING <em>HOUSEKEEPING</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getLIMITCHECKER <em>LIMITCHECKER</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getMEMORYDWELL <em>MEMORYDWELL</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getMEMORYMANAGEMENT <em>MEMORYMANAGEMENT</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link coreflight00.cfs.DocumentRoot#getSTOREDCOMMANDING <em>STOREDCOMMANDING</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.cfs.CfsPackage#getDocumentRoot()
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
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_Mixed()
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
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>CFDPFILETRANSFER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CFDPFILETRANSFER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CFDPFILETRANSFER</em>' containment reference.
	 * @see #setCFDPFILETRANSFER(CfdpFileTransfer)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_CFDPFILETRANSFER()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CFDP-FILE-TRANSFER' namespace='##targetNamespace'"
	 * @generated
	 */
	CfdpFileTransfer getCFDPFILETRANSFER();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getCFDPFILETRANSFER <em>CFDPFILETRANSFER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CFDPFILETRANSFER</em>' containment reference.
	 * @see #getCFDPFILETRANSFER()
	 * @generated
	 */
	void setCFDPFILETRANSFER(CfdpFileTransfer value);

	/**
	 * Returns the value of the '<em><b>CHECKSUM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CHECKSUM</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CHECKSUM</em>' containment reference.
	 * @see #setCHECKSUM(Checksum)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_CHECKSUM()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CHECKSUM' namespace='##targetNamespace'"
	 * @generated
	 */
	Checksum getCHECKSUM();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getCHECKSUM <em>CHECKSUM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CHECKSUM</em>' containment reference.
	 * @see #getCHECKSUM()
	 * @generated
	 */
	void setCHECKSUM(Checksum value);

	/**
	 * Returns the value of the '<em><b>DATASTORAGE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATASTORAGE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATASTORAGE</em>' containment reference.
	 * @see #setDATASTORAGE(DataStorage)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_DATASTORAGE()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATA-STORAGE' namespace='##targetNamespace'"
	 * @generated
	 */
	DataStorage getDATASTORAGE();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getDATASTORAGE <em>DATASTORAGE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATASTORAGE</em>' containment reference.
	 * @see #getDATASTORAGE()
	 * @generated
	 */
	void setDATASTORAGE(DataStorage value);

	/**
	 * Returns the value of the '<em><b>FILEMANAGER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FILEMANAGER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FILEMANAGER</em>' containment reference.
	 * @see #setFILEMANAGER(FileManager)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_FILEMANAGER()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FILE-MANAGER' namespace='##targetNamespace'"
	 * @generated
	 */
	FileManager getFILEMANAGER();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getFILEMANAGER <em>FILEMANAGER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FILEMANAGER</em>' containment reference.
	 * @see #getFILEMANAGER()
	 * @generated
	 */
	void setFILEMANAGER(FileManager value);

	/**
	 * Returns the value of the '<em><b>HEALTHANDSAFETY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HEALTHANDSAFETY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HEALTHANDSAFETY</em>' containment reference.
	 * @see #setHEALTHANDSAFETY(HealthAndSafety)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_HEALTHANDSAFETY()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HEALTH-AND-SAFETY' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthAndSafety getHEALTHANDSAFETY();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getHEALTHANDSAFETY <em>HEALTHANDSAFETY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HEALTHANDSAFETY</em>' containment reference.
	 * @see #getHEALTHANDSAFETY()
	 * @generated
	 */
	void setHEALTHANDSAFETY(HealthAndSafety value);

	/**
	 * Returns the value of the '<em><b>HOUSEKEEPING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HOUSEKEEPING</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HOUSEKEEPING</em>' containment reference.
	 * @see #setHOUSEKEEPING(Housekeeping)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_HOUSEKEEPING()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HOUSEKEEPING' namespace='##targetNamespace'"
	 * @generated
	 */
	Housekeeping getHOUSEKEEPING();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getHOUSEKEEPING <em>HOUSEKEEPING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HOUSEKEEPING</em>' containment reference.
	 * @see #getHOUSEKEEPING()
	 * @generated
	 */
	void setHOUSEKEEPING(Housekeeping value);

	/**
	 * Returns the value of the '<em><b>LIMITCHECKER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LIMITCHECKER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LIMITCHECKER</em>' containment reference.
	 * @see #setLIMITCHECKER(LimitChecker)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_LIMITCHECKER()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LIMIT-CHECKER' namespace='##targetNamespace'"
	 * @generated
	 */
	LimitChecker getLIMITCHECKER();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getLIMITCHECKER <em>LIMITCHECKER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LIMITCHECKER</em>' containment reference.
	 * @see #getLIMITCHECKER()
	 * @generated
	 */
	void setLIMITCHECKER(LimitChecker value);

	/**
	 * Returns the value of the '<em><b>MEMORYDWELL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEMORYDWELL</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEMORYDWELL</em>' containment reference.
	 * @see #setMEMORYDWELL(MemoryDwell)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_MEMORYDWELL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MEMORY-DWELL' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryDwell getMEMORYDWELL();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getMEMORYDWELL <em>MEMORYDWELL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEMORYDWELL</em>' containment reference.
	 * @see #getMEMORYDWELL()
	 * @generated
	 */
	void setMEMORYDWELL(MemoryDwell value);

	/**
	 * Returns the value of the '<em><b>MEMORYMANAGEMENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEMORYMANAGEMENT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEMORYMANAGEMENT</em>' containment reference.
	 * @see #setMEMORYMANAGEMENT(MemoryManagement)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_MEMORYMANAGEMENT()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MEMORY-MANAGEMENT' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryManagement getMEMORYMANAGEMENT();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getMEMORYMANAGEMENT <em>MEMORYMANAGEMENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEMORYMANAGEMENT</em>' containment reference.
	 * @see #getMEMORYMANAGEMENT()
	 * @generated
	 */
	void setMEMORYMANAGEMENT(MemoryManagement value);

	/**
	 * Returns the value of the '<em><b>SCHEDULER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCHEDULER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCHEDULER</em>' containment reference.
	 * @see #setSCHEDULER(Scheduler)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_SCHEDULER()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SCHEDULER' namespace='##targetNamespace'"
	 * @generated
	 */
	Scheduler getSCHEDULER();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getSCHEDULER <em>SCHEDULER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCHEDULER</em>' containment reference.
	 * @see #getSCHEDULER()
	 * @generated
	 */
	void setSCHEDULER(Scheduler value);

	/**
	 * Returns the value of the '<em><b>STOREDCOMMANDING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STOREDCOMMANDING</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STOREDCOMMANDING</em>' containment reference.
	 * @see #setSTOREDCOMMANDING(StoredCommanding)
	 * @see coreflight00.cfs.CfsPackage#getDocumentRoot_STOREDCOMMANDING()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='STORED-COMMANDING' namespace='##targetNamespace'"
	 * @generated
	 */
	StoredCommanding getSTOREDCOMMANDING();

	/**
	 * Sets the value of the '{@link coreflight00.cfs.DocumentRoot#getSTOREDCOMMANDING <em>STOREDCOMMANDING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STOREDCOMMANDING</em>' containment reference.
	 * @see #getSTOREDCOMMANDING()
	 * @generated
	 */
	void setSTOREDCOMMANDING(StoredCommanding value);

} // DocumentRoot
