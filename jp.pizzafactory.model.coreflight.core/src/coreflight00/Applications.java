/**
 */
package coreflight00;

import coreflight00.cfe.EventServices;
import coreflight00.cfe.ExecutiveServices;
import coreflight00.cfe.SoftwareBus;
import coreflight00.cfe.TableServices;
import coreflight00.cfe.TimeServices;
import coreflight00.cfs.CfdpFileTransfer;
import coreflight00.cfs.Checksum;
import coreflight00.cfs.DataStorage;
import coreflight00.cfs.FileManager;
import coreflight00.cfs.HealthAndSafety;
import coreflight00.cfs.Housekeeping;
import coreflight00.cfs.LimitChecker;
import coreflight00.cfs.MemoryDwell;
import coreflight00.cfs.MemoryManagement;
import coreflight00.cfs.Scheduler;
import coreflight00.cfs.StoredCommanding;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link coreflight00.Applications#getGroup <em>Group</em>}</li>
 *   <li>{@link coreflight00.Applications#getEVENTSERVICES <em>EVENTSERVICES</em>}</li>
 *   <li>{@link coreflight00.Applications#getEXECUTIVESERVICES <em>EXECUTIVESERVICES</em>}</li>
 *   <li>{@link coreflight00.Applications#getSOFTWAREBUS <em>SOFTWAREBUS</em>}</li>
 *   <li>{@link coreflight00.Applications#getTABLESERVICES <em>TABLESERVICES</em>}</li>
 *   <li>{@link coreflight00.Applications#getTIMESERVICES <em>TIMESERVICES</em>}</li>
 *   <li>{@link coreflight00.Applications#getCFDPFILETRANSFER <em>CFDPFILETRANSFER</em>}</li>
 *   <li>{@link coreflight00.Applications#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link coreflight00.Applications#getDATASTORAGE <em>DATASTORAGE</em>}</li>
 *   <li>{@link coreflight00.Applications#getFILEMANAGER <em>FILEMANAGER</em>}</li>
 *   <li>{@link coreflight00.Applications#getHEALTHANDSAFETY <em>HEALTHANDSAFETY</em>}</li>
 *   <li>{@link coreflight00.Applications#getHOUSEKEEPING <em>HOUSEKEEPING</em>}</li>
 *   <li>{@link coreflight00.Applications#getLIMITCHECKER <em>LIMITCHECKER</em>}</li>
 *   <li>{@link coreflight00.Applications#getMEMORYDWELL <em>MEMORYDWELL</em>}</li>
 *   <li>{@link coreflight00.Applications#getMEMORYMANAGEMENT <em>MEMORYMANAGEMENT</em>}</li>
 *   <li>{@link coreflight00.Applications#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link coreflight00.Applications#getSTOREDCOMMANDING <em>STOREDCOMMANDING</em>}</li>
 *   <li>{@link coreflight00.Applications#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.Coreflight00Package#getApplications()
 * @model extendedMetaData="name='Applications' kind='elementOnly'"
 * @generated
 */
public interface Applications extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see coreflight00.Coreflight00Package#getApplications_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>EVENTSERVICES</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfe.EventServices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EVENTSERVICES</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EVENTSERVICES</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_EVENTSERVICES()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EVENT-SERVICES' namespace='http://www.monami-ya.com/coreflight/r0.0/cfe' group='#group:0'"
	 * @generated
	 */
	EList<EventServices> getEVENTSERVICES();

	/**
	 * Returns the value of the '<em><b>EXECUTIVESERVICES</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfe.ExecutiveServices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EXECUTIVESERVICES</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EXECUTIVESERVICES</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_EXECUTIVESERVICES()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EXECUTIVE-SERVICES' namespace='http://www.monami-ya.com/coreflight/r0.0/cfe' group='#group:0'"
	 * @generated
	 */
	EList<ExecutiveServices> getEXECUTIVESERVICES();

	/**
	 * Returns the value of the '<em><b>SOFTWAREBUS</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfe.SoftwareBus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SOFTWAREBUS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SOFTWAREBUS</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_SOFTWAREBUS()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SOFTWARE-BUS' namespace='http://www.monami-ya.com/coreflight/r0.0/cfe' group='#group:0'"
	 * @generated
	 */
	EList<SoftwareBus> getSOFTWAREBUS();

	/**
	 * Returns the value of the '<em><b>TABLESERVICES</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfe.TableServices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TABLESERVICES</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TABLESERVICES</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_TABLESERVICES()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TABLE-SERVICES' namespace='http://www.monami-ya.com/coreflight/r0.0/cfe' group='#group:0'"
	 * @generated
	 */
	EList<TableServices> getTABLESERVICES();

	/**
	 * Returns the value of the '<em><b>TIMESERVICES</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfe.TimeServices}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TIMESERVICES</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TIMESERVICES</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_TIMESERVICES()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TIME-SERVICES' namespace='http://www.monami-ya.com/coreflight/r0.0/cfe' group='#group:0'"
	 * @generated
	 */
	EList<TimeServices> getTIMESERVICES();

	/**
	 * Returns the value of the '<em><b>CFDPFILETRANSFER</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.CfdpFileTransfer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CFDPFILETRANSFER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CFDPFILETRANSFER</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_CFDPFILETRANSFER()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CFDP-FILE-TRANSFER' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<CfdpFileTransfer> getCFDPFILETRANSFER();

	/**
	 * Returns the value of the '<em><b>CHECKSUM</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.Checksum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CHECKSUM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CHECKSUM</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_CHECKSUM()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CHECKSUM' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<Checksum> getCHECKSUM();

	/**
	 * Returns the value of the '<em><b>DATASTORAGE</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.DataStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATASTORAGE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATASTORAGE</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_DATASTORAGE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATA-STORAGE' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<DataStorage> getDATASTORAGE();

	/**
	 * Returns the value of the '<em><b>FILEMANAGER</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.FileManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FILEMANAGER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FILEMANAGER</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_FILEMANAGER()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FILE-MANAGER' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<FileManager> getFILEMANAGER();

	/**
	 * Returns the value of the '<em><b>HEALTHANDSAFETY</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.HealthAndSafety}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HEALTHANDSAFETY</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HEALTHANDSAFETY</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_HEALTHANDSAFETY()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HEALTH-AND-SAFETY' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<HealthAndSafety> getHEALTHANDSAFETY();

	/**
	 * Returns the value of the '<em><b>HOUSEKEEPING</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.Housekeeping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HOUSEKEEPING</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HOUSEKEEPING</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_HOUSEKEEPING()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HOUSEKEEPING' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<Housekeeping> getHOUSEKEEPING();

	/**
	 * Returns the value of the '<em><b>LIMITCHECKER</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.LimitChecker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LIMITCHECKER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LIMITCHECKER</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_LIMITCHECKER()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LIMIT-CHECKER' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<LimitChecker> getLIMITCHECKER();

	/**
	 * Returns the value of the '<em><b>MEMORYDWELL</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.MemoryDwell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEMORYDWELL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEMORYDWELL</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_MEMORYDWELL()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MEMORY-DWELL' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<MemoryDwell> getMEMORYDWELL();

	/**
	 * Returns the value of the '<em><b>MEMORYMANAGEMENT</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.MemoryManagement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MEMORYMANAGEMENT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEMORYMANAGEMENT</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_MEMORYMANAGEMENT()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MEMORY-MANAGEMENT' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<MemoryManagement> getMEMORYMANAGEMENT();

	/**
	 * Returns the value of the '<em><b>SCHEDULER</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.Scheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCHEDULER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCHEDULER</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_SCHEDULER()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SCHEDULER' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<Scheduler> getSCHEDULER();

	/**
	 * Returns the value of the '<em><b>STOREDCOMMANDING</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.cfs.StoredCommanding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>STOREDCOMMANDING</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>STOREDCOMMANDING</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_STOREDCOMMANDING()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='STORED-COMMANDING' namespace='http://www.monami-ya.com/coreflight/r0.0/cfs' group='#group:0'"
	 * @generated
	 */
	EList<StoredCommanding> getSTOREDCOMMANDING();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link coreflight00.Application}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see coreflight00.Coreflight00Package#getApplications_Application()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='APPLICATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Application> getApplication();

} // Applications
