/**
 */
package coreflight00.cfs.util;

import coreflight00.Application;
import coreflight00.Identifiable;

import coreflight00.cfs.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see coreflight00.cfs.CfsPackage
 * @generated
 */
public class CfsSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CfsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfsSwitch() {
		if (modelPackage == null) {
			modelPackage = CfsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CfsPackage.CFDP_FILE_TRANSFER: {
				CfdpFileTransfer cfdpFileTransfer = (CfdpFileTransfer)theEObject;
				T result = caseCfdpFileTransfer(cfdpFileTransfer);
				if (result == null) result = caseCfsApplication(cfdpFileTransfer);
				if (result == null) result = caseApplication(cfdpFileTransfer);
				if (result == null) result = caseIdentifiable(cfdpFileTransfer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.CFS_APPLICATION: {
				CfsApplication cfsApplication = (CfsApplication)theEObject;
				T result = caseCfsApplication(cfsApplication);
				if (result == null) result = caseApplication(cfsApplication);
				if (result == null) result = caseIdentifiable(cfsApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.CHECKSUM: {
				Checksum checksum = (Checksum)theEObject;
				T result = caseChecksum(checksum);
				if (result == null) result = caseCfsApplication(checksum);
				if (result == null) result = caseApplication(checksum);
				if (result == null) result = caseIdentifiable(checksum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.DATA_STORAGE: {
				DataStorage dataStorage = (DataStorage)theEObject;
				T result = caseDataStorage(dataStorage);
				if (result == null) result = caseCfsApplication(dataStorage);
				if (result == null) result = caseApplication(dataStorage);
				if (result == null) result = caseIdentifiable(dataStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.FILE_MANAGER: {
				FileManager fileManager = (FileManager)theEObject;
				T result = caseFileManager(fileManager);
				if (result == null) result = caseCfsApplication(fileManager);
				if (result == null) result = caseApplication(fileManager);
				if (result == null) result = caseIdentifiable(fileManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.HEALTH_AND_SAFETY: {
				HealthAndSafety healthAndSafety = (HealthAndSafety)theEObject;
				T result = caseHealthAndSafety(healthAndSafety);
				if (result == null) result = caseCfsApplication(healthAndSafety);
				if (result == null) result = caseApplication(healthAndSafety);
				if (result == null) result = caseIdentifiable(healthAndSafety);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.HOUSEKEEPING: {
				Housekeeping housekeeping = (Housekeeping)theEObject;
				T result = caseHousekeeping(housekeeping);
				if (result == null) result = caseCfsApplication(housekeeping);
				if (result == null) result = caseApplication(housekeeping);
				if (result == null) result = caseIdentifiable(housekeeping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.LIMIT_CHECKER: {
				LimitChecker limitChecker = (LimitChecker)theEObject;
				T result = caseLimitChecker(limitChecker);
				if (result == null) result = caseCfsApplication(limitChecker);
				if (result == null) result = caseApplication(limitChecker);
				if (result == null) result = caseIdentifiable(limitChecker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.MEMORY_DWELL: {
				MemoryDwell memoryDwell = (MemoryDwell)theEObject;
				T result = caseMemoryDwell(memoryDwell);
				if (result == null) result = caseCfsApplication(memoryDwell);
				if (result == null) result = caseApplication(memoryDwell);
				if (result == null) result = caseIdentifiable(memoryDwell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.MEMORY_MANAGEMENT: {
				MemoryManagement memoryManagement = (MemoryManagement)theEObject;
				T result = caseMemoryManagement(memoryManagement);
				if (result == null) result = caseCfsApplication(memoryManagement);
				if (result == null) result = caseApplication(memoryManagement);
				if (result == null) result = caseIdentifiable(memoryManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T result = caseScheduler(scheduler);
				if (result == null) result = caseCfsApplication(scheduler);
				if (result == null) result = caseApplication(scheduler);
				if (result == null) result = caseIdentifiable(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.STORED_COMMANDING: {
				StoredCommanding storedCommanding = (StoredCommanding)theEObject;
				T result = caseStoredCommanding(storedCommanding);
				if (result == null) result = caseCfsApplication(storedCommanding);
				if (result == null) result = caseApplication(storedCommanding);
				if (result == null) result = caseIdentifiable(storedCommanding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfsPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cfdp File Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cfdp File Transfer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCfdpFileTransfer(CfdpFileTransfer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCfsApplication(CfsApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checksum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checksum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecksum(Checksum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStorage(DataStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileManager(FileManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health And Safety</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health And Safety</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthAndSafety(HealthAndSafety object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Housekeeping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Housekeeping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHousekeeping(Housekeeping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimitChecker(LimitChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Dwell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Dwell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryDwell(MemoryDwell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryManagement(MemoryManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stored Commanding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stored Commanding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoredCommanding(StoredCommanding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CfsSwitch
