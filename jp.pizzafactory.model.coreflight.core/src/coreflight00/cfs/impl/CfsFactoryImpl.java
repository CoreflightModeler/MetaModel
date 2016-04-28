/**
 */
package coreflight00.cfs.impl;

import coreflight00.cfs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CfsFactoryImpl extends EFactoryImpl implements CfsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CfsFactory init() {
		try {
			CfsFactory theCfsFactory = (CfsFactory)EPackage.Registry.INSTANCE.getEFactory(CfsPackage.eNS_URI);
			if (theCfsFactory != null) {
				return theCfsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CfsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CfsPackage.CFDP_FILE_TRANSFER: return createCfdpFileTransfer();
			case CfsPackage.CHECKSUM: return createChecksum();
			case CfsPackage.DATA_STORAGE: return createDataStorage();
			case CfsPackage.FILE_MANAGER: return createFileManager();
			case CfsPackage.HEALTH_AND_SAFETY: return createHealthAndSafety();
			case CfsPackage.HOUSEKEEPING: return createHousekeeping();
			case CfsPackage.LIMIT_CHECKER: return createLimitChecker();
			case CfsPackage.MEMORY_DWELL: return createMemoryDwell();
			case CfsPackage.MEMORY_MANAGEMENT: return createMemoryManagement();
			case CfsPackage.SCHEDULER: return createScheduler();
			case CfsPackage.STORED_COMMANDING: return createStoredCommanding();
			case CfsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfdpFileTransfer createCfdpFileTransfer() {
		CfdpFileTransferImpl cfdpFileTransfer = new CfdpFileTransferImpl();
		return cfdpFileTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checksum createChecksum() {
		ChecksumImpl checksum = new ChecksumImpl();
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStorage createDataStorage() {
		DataStorageImpl dataStorage = new DataStorageImpl();
		return dataStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileManager createFileManager() {
		FileManagerImpl fileManager = new FileManagerImpl();
		return fileManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthAndSafety createHealthAndSafety() {
		HealthAndSafetyImpl healthAndSafety = new HealthAndSafetyImpl();
		return healthAndSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Housekeeping createHousekeeping() {
		HousekeepingImpl housekeeping = new HousekeepingImpl();
		return housekeeping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitChecker createLimitChecker() {
		LimitCheckerImpl limitChecker = new LimitCheckerImpl();
		return limitChecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryDwell createMemoryDwell() {
		MemoryDwellImpl memoryDwell = new MemoryDwellImpl();
		return memoryDwell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryManagement createMemoryManagement() {
		MemoryManagementImpl memoryManagement = new MemoryManagementImpl();
		return memoryManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createScheduler() {
		SchedulerImpl scheduler = new SchedulerImpl();
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredCommanding createStoredCommanding() {
		StoredCommandingImpl storedCommanding = new StoredCommandingImpl();
		return storedCommanding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfsPackage getCfsPackage() {
		return (CfsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CfsPackage getPackage() {
		return CfsPackage.eINSTANCE;
	}

} //CfsFactoryImpl
