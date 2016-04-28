/**
 */
package coreflight00.cfe;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see coreflight00.cfe.CfePackage
 * @generated
 */
public interface CfeFactory extends EFactory {
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
	CfeFactory eINSTANCE = coreflight00.cfe.impl.CfeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Services</em>'.
	 * @generated
	 */
	EventServices createEventServices();

	/**
	 * Returns a new object of class '<em>Executive Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executive Services</em>'.
	 * @generated
	 */
	ExecutiveServices createExecutiveServices();

	/**
	 * Returns a new object of class '<em>Software Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Bus</em>'.
	 * @generated
	 */
	SoftwareBus createSoftwareBus();

	/**
	 * Returns a new object of class '<em>Table Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Services</em>'.
	 * @generated
	 */
	TableServices createTableServices();

	/**
	 * Returns a new object of class '<em>Time Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Services</em>'.
	 * @generated
	 */
	TimeServices createTimeServices();

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
	CfePackage getCfePackage();

} //CfeFactory
