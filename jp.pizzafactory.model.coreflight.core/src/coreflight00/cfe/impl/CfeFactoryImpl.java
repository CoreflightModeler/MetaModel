/**
 */
package coreflight00.cfe.impl;

import coreflight00.cfe.*;

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
public class CfeFactoryImpl extends EFactoryImpl implements CfeFactory {
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
	public static CfeFactory init() {
		try {
			CfeFactory theCfeFactory = (CfeFactory)EPackage.Registry.INSTANCE.getEFactory(CfePackage.eNS_URI);
			if (theCfeFactory != null) {
				return theCfeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CfeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfeFactoryImpl() {
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
			case CfePackage.EVENT_SERVICES: return createEventServices();
			case CfePackage.EXECUTIVE_SERVICES: return createExecutiveServices();
			case CfePackage.SOFTWARE_BUS: return createSoftwareBus();
			case CfePackage.TABLE_SERVICES: return createTableServices();
			case CfePackage.TIME_SERVICES: return createTimeServices();
			case CfePackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventServices createEventServices() {
		EventServicesImpl eventServices = new EventServicesImpl();
		return eventServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutiveServices createExecutiveServices() {
		ExecutiveServicesImpl executiveServices = new ExecutiveServicesImpl();
		return executiveServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBus createSoftwareBus() {
		SoftwareBusImpl softwareBus = new SoftwareBusImpl();
		return softwareBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableServices createTableServices() {
		TableServicesImpl tableServices = new TableServicesImpl();
		return tableServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeServices createTimeServices() {
		TimeServicesImpl timeServices = new TimeServicesImpl();
		return timeServices;
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
	public CfePackage getCfePackage() {
		return (CfePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CfePackage getPackage() {
		return CfePackage.eINSTANCE;
	}

} //CfeFactoryImpl
