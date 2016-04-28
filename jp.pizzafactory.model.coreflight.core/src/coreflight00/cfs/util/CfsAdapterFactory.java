/**
 */
package coreflight00.cfs.util;

import coreflight00.Application;
import coreflight00.Identifiable;

import coreflight00.cfs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see coreflight00.cfs.CfsPackage
 * @generated
 */
public class CfsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CfsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CfsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CfsSwitch<Adapter> modelSwitch =
		new CfsSwitch<Adapter>() {
			@Override
			public Adapter caseCfdpFileTransfer(CfdpFileTransfer object) {
				return createCfdpFileTransferAdapter();
			}
			@Override
			public Adapter caseCfsApplication(CfsApplication object) {
				return createCfsApplicationAdapter();
			}
			@Override
			public Adapter caseChecksum(Checksum object) {
				return createChecksumAdapter();
			}
			@Override
			public Adapter caseDataStorage(DataStorage object) {
				return createDataStorageAdapter();
			}
			@Override
			public Adapter caseFileManager(FileManager object) {
				return createFileManagerAdapter();
			}
			@Override
			public Adapter caseHealthAndSafety(HealthAndSafety object) {
				return createHealthAndSafetyAdapter();
			}
			@Override
			public Adapter caseHousekeeping(Housekeeping object) {
				return createHousekeepingAdapter();
			}
			@Override
			public Adapter caseLimitChecker(LimitChecker object) {
				return createLimitCheckerAdapter();
			}
			@Override
			public Adapter caseMemoryDwell(MemoryDwell object) {
				return createMemoryDwellAdapter();
			}
			@Override
			public Adapter caseMemoryManagement(MemoryManagement object) {
				return createMemoryManagementAdapter();
			}
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseStoredCommanding(StoredCommanding object) {
				return createStoredCommandingAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.CfdpFileTransfer <em>Cfdp File Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.CfdpFileTransfer
	 * @generated
	 */
	public Adapter createCfdpFileTransferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.CfsApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.CfsApplication
	 * @generated
	 */
	public Adapter createCfsApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.Checksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.Checksum
	 * @generated
	 */
	public Adapter createChecksumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.DataStorage <em>Data Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.DataStorage
	 * @generated
	 */
	public Adapter createDataStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.FileManager <em>File Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.FileManager
	 * @generated
	 */
	public Adapter createFileManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.HealthAndSafety <em>Health And Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.HealthAndSafety
	 * @generated
	 */
	public Adapter createHealthAndSafetyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.Housekeeping <em>Housekeeping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.Housekeeping
	 * @generated
	 */
	public Adapter createHousekeepingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.LimitChecker <em>Limit Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.LimitChecker
	 * @generated
	 */
	public Adapter createLimitCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.MemoryDwell <em>Memory Dwell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.MemoryDwell
	 * @generated
	 */
	public Adapter createMemoryDwellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.MemoryManagement <em>Memory Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.MemoryManagement
	 * @generated
	 */
	public Adapter createMemoryManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.StoredCommanding <em>Stored Commanding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.StoredCommanding
	 * @generated
	 */
	public Adapter createStoredCommandingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfs.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CfsAdapterFactory
