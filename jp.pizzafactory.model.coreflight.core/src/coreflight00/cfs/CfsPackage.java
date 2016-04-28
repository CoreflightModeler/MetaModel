/**
 */
package coreflight00.cfs;

import coreflight00.Coreflight00Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see coreflight00.cfs.CfsFactory
 * @model kind="package"
 * @generated
 */
public interface CfsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cfs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.monami-ya.com/coreflight/r0.0/cfs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cfs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfsPackage eINSTANCE = coreflight00.cfs.impl.CfsPackageImpl.init();

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.CfsApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.CfsApplicationImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getCfsApplication()
	 * @generated
	 */
	int CFS_APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFS_APPLICATION__SHORT_NAME = Coreflight00Package.APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFS_APPLICATION__UUID = Coreflight00Package.APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFS_APPLICATION_FEATURE_COUNT = Coreflight00Package.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFS_APPLICATION_OPERATION_COUNT = Coreflight00Package.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.CfdpFileTransferImpl <em>Cfdp File Transfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.CfdpFileTransferImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getCfdpFileTransfer()
	 * @generated
	 */
	int CFDP_FILE_TRANSFER = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFDP_FILE_TRANSFER__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFDP_FILE_TRANSFER__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Cfdp File Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFDP_FILE_TRANSFER_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cfdp File Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFDP_FILE_TRANSFER_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.ChecksumImpl <em>Checksum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.ChecksumImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getChecksum()
	 * @generated
	 */
	int CHECKSUM = 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Checksum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Checksum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.DataStorageImpl <em>Data Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.DataStorageImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getDataStorage()
	 * @generated
	 */
	int DATA_STORAGE = 3;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Data Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORAGE_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.FileManagerImpl <em>File Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.FileManagerImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getFileManager()
	 * @generated
	 */
	int FILE_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>File Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MANAGER_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.HealthAndSafetyImpl <em>Health And Safety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.HealthAndSafetyImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getHealthAndSafety()
	 * @generated
	 */
	int HEALTH_AND_SAFETY = 5;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_SAFETY__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_SAFETY__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Health And Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_SAFETY_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Health And Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_SAFETY_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.HousekeepingImpl <em>Housekeeping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.HousekeepingImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getHousekeeping()
	 * @generated
	 */
	int HOUSEKEEPING = 6;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEKEEPING__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEKEEPING__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Housekeeping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEKEEPING_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Housekeeping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEKEEPING_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.LimitCheckerImpl <em>Limit Checker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.LimitCheckerImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getLimitChecker()
	 * @generated
	 */
	int LIMIT_CHECKER = 7;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_CHECKER__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_CHECKER__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Limit Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_CHECKER_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Limit Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_CHECKER_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.MemoryDwellImpl <em>Memory Dwell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.MemoryDwellImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getMemoryDwell()
	 * @generated
	 */
	int MEMORY_DWELL = 8;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_DWELL__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_DWELL__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Memory Dwell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_DWELL_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Memory Dwell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_DWELL_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.MemoryManagementImpl <em>Memory Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.MemoryManagementImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getMemoryManagement()
	 * @generated
	 */
	int MEMORY_MANAGEMENT = 9;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MANAGEMENT__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MANAGEMENT__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Memory Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MANAGEMENT_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Memory Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MANAGEMENT_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.SchedulerImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 10;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.StoredCommandingImpl <em>Stored Commanding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.StoredCommandingImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getStoredCommanding()
	 * @generated
	 */
	int STORED_COMMANDING = 11;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_COMMANDING__SHORT_NAME = CFS_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_COMMANDING__UUID = CFS_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Stored Commanding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_COMMANDING_FEATURE_COUNT = CFS_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stored Commanding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_COMMANDING_OPERATION_COUNT = CFS_APPLICATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link coreflight00.cfs.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfs.impl.DocumentRootImpl
	 * @see coreflight00.cfs.impl.CfsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>CFDPFILETRANSFER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CFDPFILETRANSFER = 3;

	/**
	 * The feature id for the '<em><b>CHECKSUM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHECKSUM = 4;

	/**
	 * The feature id for the '<em><b>DATASTORAGE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATASTORAGE = 5;

	/**
	 * The feature id for the '<em><b>FILEMANAGER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILEMANAGER = 6;

	/**
	 * The feature id for the '<em><b>HEALTHANDSAFETY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEALTHANDSAFETY = 7;

	/**
	 * The feature id for the '<em><b>HOUSEKEEPING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOUSEKEEPING = 8;

	/**
	 * The feature id for the '<em><b>LIMITCHECKER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIMITCHECKER = 9;

	/**
	 * The feature id for the '<em><b>MEMORYDWELL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMORYDWELL = 10;

	/**
	 * The feature id for the '<em><b>MEMORYMANAGEMENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMORYMANAGEMENT = 11;

	/**
	 * The feature id for the '<em><b>SCHEDULER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEDULER = 12;

	/**
	 * The feature id for the '<em><b>STOREDCOMMANDING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STOREDCOMMANDING = 13;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.CfdpFileTransfer <em>Cfdp File Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cfdp File Transfer</em>'.
	 * @see coreflight00.cfs.CfdpFileTransfer
	 * @generated
	 */
	EClass getCfdpFileTransfer();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.CfsApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see coreflight00.cfs.CfsApplication
	 * @generated
	 */
	EClass getCfsApplication();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.Checksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checksum</em>'.
	 * @see coreflight00.cfs.Checksum
	 * @generated
	 */
	EClass getChecksum();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.DataStorage <em>Data Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Storage</em>'.
	 * @see coreflight00.cfs.DataStorage
	 * @generated
	 */
	EClass getDataStorage();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.FileManager <em>File Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Manager</em>'.
	 * @see coreflight00.cfs.FileManager
	 * @generated
	 */
	EClass getFileManager();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.HealthAndSafety <em>Health And Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health And Safety</em>'.
	 * @see coreflight00.cfs.HealthAndSafety
	 * @generated
	 */
	EClass getHealthAndSafety();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.Housekeeping <em>Housekeeping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Housekeeping</em>'.
	 * @see coreflight00.cfs.Housekeeping
	 * @generated
	 */
	EClass getHousekeeping();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.LimitChecker <em>Limit Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit Checker</em>'.
	 * @see coreflight00.cfs.LimitChecker
	 * @generated
	 */
	EClass getLimitChecker();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.MemoryDwell <em>Memory Dwell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Dwell</em>'.
	 * @see coreflight00.cfs.MemoryDwell
	 * @generated
	 */
	EClass getMemoryDwell();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.MemoryManagement <em>Memory Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Management</em>'.
	 * @see coreflight00.cfs.MemoryManagement
	 * @generated
	 */
	EClass getMemoryManagement();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see coreflight00.cfs.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.StoredCommanding <em>Stored Commanding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Commanding</em>'.
	 * @see coreflight00.cfs.StoredCommanding
	 * @generated
	 */
	EClass getStoredCommanding();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see coreflight00.cfs.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link coreflight00.cfs.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link coreflight00.cfs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link coreflight00.cfs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getCFDPFILETRANSFER <em>CFDPFILETRANSFER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CFDPFILETRANSFER</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getCFDPFILETRANSFER()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CFDPFILETRANSFER();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getCHECKSUM <em>CHECKSUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHECKSUM</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getCHECKSUM()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CHECKSUM();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getDATASTORAGE <em>DATASTORAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATASTORAGE</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getDATASTORAGE()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DATASTORAGE();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getFILEMANAGER <em>FILEMANAGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FILEMANAGER</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getFILEMANAGER()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FILEMANAGER();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getHEALTHANDSAFETY <em>HEALTHANDSAFETY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HEALTHANDSAFETY</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getHEALTHANDSAFETY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HEALTHANDSAFETY();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getHOUSEKEEPING <em>HOUSEKEEPING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HOUSEKEEPING</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getHOUSEKEEPING()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HOUSEKEEPING();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getLIMITCHECKER <em>LIMITCHECKER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LIMITCHECKER</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getLIMITCHECKER()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LIMITCHECKER();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getMEMORYDWELL <em>MEMORYDWELL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MEMORYDWELL</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getMEMORYDWELL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MEMORYDWELL();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getMEMORYMANAGEMENT <em>MEMORYMANAGEMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>MEMORYMANAGEMENT</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getMEMORYMANAGEMENT()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MEMORYMANAGEMENT();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getSCHEDULER <em>SCHEDULER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SCHEDULER</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getSCHEDULER()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SCHEDULER();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfs.DocumentRoot#getSTOREDCOMMANDING <em>STOREDCOMMANDING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>STOREDCOMMANDING</em>'.
	 * @see coreflight00.cfs.DocumentRoot#getSTOREDCOMMANDING()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_STOREDCOMMANDING();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CfsFactory getCfsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.CfdpFileTransferImpl <em>Cfdp File Transfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.CfdpFileTransferImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getCfdpFileTransfer()
		 * @generated
		 */
		EClass CFDP_FILE_TRANSFER = eINSTANCE.getCfdpFileTransfer();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.CfsApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.CfsApplicationImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getCfsApplication()
		 * @generated
		 */
		EClass CFS_APPLICATION = eINSTANCE.getCfsApplication();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.ChecksumImpl <em>Checksum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.ChecksumImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getChecksum()
		 * @generated
		 */
		EClass CHECKSUM = eINSTANCE.getChecksum();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.DataStorageImpl <em>Data Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.DataStorageImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getDataStorage()
		 * @generated
		 */
		EClass DATA_STORAGE = eINSTANCE.getDataStorage();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.FileManagerImpl <em>File Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.FileManagerImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getFileManager()
		 * @generated
		 */
		EClass FILE_MANAGER = eINSTANCE.getFileManager();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.HealthAndSafetyImpl <em>Health And Safety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.HealthAndSafetyImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getHealthAndSafety()
		 * @generated
		 */
		EClass HEALTH_AND_SAFETY = eINSTANCE.getHealthAndSafety();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.HousekeepingImpl <em>Housekeeping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.HousekeepingImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getHousekeeping()
		 * @generated
		 */
		EClass HOUSEKEEPING = eINSTANCE.getHousekeeping();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.LimitCheckerImpl <em>Limit Checker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.LimitCheckerImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getLimitChecker()
		 * @generated
		 */
		EClass LIMIT_CHECKER = eINSTANCE.getLimitChecker();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.MemoryDwellImpl <em>Memory Dwell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.MemoryDwellImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getMemoryDwell()
		 * @generated
		 */
		EClass MEMORY_DWELL = eINSTANCE.getMemoryDwell();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.MemoryManagementImpl <em>Memory Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.MemoryManagementImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getMemoryManagement()
		 * @generated
		 */
		EClass MEMORY_MANAGEMENT = eINSTANCE.getMemoryManagement();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.SchedulerImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.StoredCommandingImpl <em>Stored Commanding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.StoredCommandingImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getStoredCommanding()
		 * @generated
		 */
		EClass STORED_COMMANDING = eINSTANCE.getStoredCommanding();

		/**
		 * The meta object literal for the '{@link coreflight00.cfs.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfs.impl.DocumentRootImpl
		 * @see coreflight00.cfs.impl.CfsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>CFDPFILETRANSFER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CFDPFILETRANSFER = eINSTANCE.getDocumentRoot_CFDPFILETRANSFER();

		/**
		 * The meta object literal for the '<em><b>CHECKSUM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHECKSUM = eINSTANCE.getDocumentRoot_CHECKSUM();

		/**
		 * The meta object literal for the '<em><b>DATASTORAGE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATASTORAGE = eINSTANCE.getDocumentRoot_DATASTORAGE();

		/**
		 * The meta object literal for the '<em><b>FILEMANAGER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILEMANAGER = eINSTANCE.getDocumentRoot_FILEMANAGER();

		/**
		 * The meta object literal for the '<em><b>HEALTHANDSAFETY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEALTHANDSAFETY = eINSTANCE.getDocumentRoot_HEALTHANDSAFETY();

		/**
		 * The meta object literal for the '<em><b>HOUSEKEEPING</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HOUSEKEEPING = eINSTANCE.getDocumentRoot_HOUSEKEEPING();

		/**
		 * The meta object literal for the '<em><b>LIMITCHECKER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIMITCHECKER = eINSTANCE.getDocumentRoot_LIMITCHECKER();

		/**
		 * The meta object literal for the '<em><b>MEMORYDWELL</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEMORYDWELL = eINSTANCE.getDocumentRoot_MEMORYDWELL();

		/**
		 * The meta object literal for the '<em><b>MEMORYMANAGEMENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEMORYMANAGEMENT = eINSTANCE.getDocumentRoot_MEMORYMANAGEMENT();

		/**
		 * The meta object literal for the '<em><b>SCHEDULER</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEDULER = eINSTANCE.getDocumentRoot_SCHEDULER();

		/**
		 * The meta object literal for the '<em><b>STOREDCOMMANDING</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STOREDCOMMANDING = eINSTANCE.getDocumentRoot_STOREDCOMMANDING();

	}

} //CfsPackage
