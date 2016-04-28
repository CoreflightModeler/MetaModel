/**
 */
package coreflight00.cfs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see coreflight00.cfs.CfsPackage
 * @generated
 */
public interface CfsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfsFactory eINSTANCE = coreflight00.cfs.impl.CfsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cfdp File Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cfdp File Transfer</em>'.
	 * @generated
	 */
	CfdpFileTransfer createCfdpFileTransfer();

	/**
	 * Returns a new object of class '<em>Checksum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checksum</em>'.
	 * @generated
	 */
	Checksum createChecksum();

	/**
	 * Returns a new object of class '<em>Data Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Storage</em>'.
	 * @generated
	 */
	DataStorage createDataStorage();

	/**
	 * Returns a new object of class '<em>File Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Manager</em>'.
	 * @generated
	 */
	FileManager createFileManager();

	/**
	 * Returns a new object of class '<em>Health And Safety</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health And Safety</em>'.
	 * @generated
	 */
	HealthAndSafety createHealthAndSafety();

	/**
	 * Returns a new object of class '<em>Housekeeping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Housekeeping</em>'.
	 * @generated
	 */
	Housekeeping createHousekeeping();

	/**
	 * Returns a new object of class '<em>Limit Checker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limit Checker</em>'.
	 * @generated
	 */
	LimitChecker createLimitChecker();

	/**
	 * Returns a new object of class '<em>Memory Dwell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Dwell</em>'.
	 * @generated
	 */
	MemoryDwell createMemoryDwell();

	/**
	 * Returns a new object of class '<em>Memory Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Management</em>'.
	 * @generated
	 */
	MemoryManagement createMemoryManagement();

	/**
	 * Returns a new object of class '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduler</em>'.
	 * @generated
	 */
	Scheduler createScheduler();

	/**
	 * Returns a new object of class '<em>Stored Commanding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stored Commanding</em>'.
	 * @generated
	 */
	StoredCommanding createStoredCommanding();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CfsPackage getCfsPackage();

} //CfsFactory
