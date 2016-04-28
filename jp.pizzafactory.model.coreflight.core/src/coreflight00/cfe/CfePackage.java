/**
 */
package coreflight00.cfe;

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
 * @see coreflight00.cfe.CfeFactory
 * @model kind="package"
 * @generated
 */
public interface CfePackage extends EPackage {
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
	String eNAME = "cfe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.monami-ya.com/coreflight/r0.0/cfe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cfe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CfePackage eINSTANCE = coreflight00.cfe.impl.CfePackageImpl.init();

	/**
	 * The meta object id for the '{@link coreflight00.cfe.impl.CfeApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfe.impl.CfeApplicationImpl
	 * @see coreflight00.cfe.impl.CfePackageImpl#getCfeApplication()
	 * @generated
	 */
	int CFE_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFE_APPLICATION__SHORT_NAME = Coreflight00Package.APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFE_APPLICATION__UUID = Coreflight00Package.APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFE_APPLICATION_FEATURE_COUNT = Coreflight00Package.APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CFE_APPLICATION_OPERATION_COUNT = Coreflight00Package.APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfe.impl.EventServicesImpl <em>Event Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfe.impl.EventServicesImpl
	 * @see coreflight00.cfe.impl.CfePackageImpl#getEventServices()
	 * @generated
	 */
	int EVENT_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SERVICES__SHORT_NAME = CFE_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SERVICES__UUID = CFE_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Event Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SERVICES_FEATURE_COUNT = CFE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SERVICES_OPERATION_COUNT = CFE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfe.impl.ExecutiveServicesImpl <em>Executive Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfe.impl.ExecutiveServicesImpl
	 * @see coreflight00.cfe.impl.CfePackageImpl#getExecutiveServices()
	 * @generated
	 */
	int EXECUTIVE_SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIVE_SERVICES__SHORT_NAME = CFE_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIVE_SERVICES__UUID = CFE_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Executive Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIVE_SERVICES_FEATURE_COUNT = CFE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executive Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTIVE_SERVICES_OPERATION_COUNT = CFE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfe.impl.SoftwareBusImpl <em>Software Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfe.impl.SoftwareBusImpl
	 * @see coreflight00.cfe.impl.CfePackageImpl#getSoftwareBus()
	 * @generated
	 */
	int SOFTWARE_BUS = 3;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_BUS__SHORT_NAME = CFE_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_BUS__UUID = CFE_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Software Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_BUS_FEATURE_COUNT = CFE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Software Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_BUS_OPERATION_COUNT = CFE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfe.impl.TableServicesImpl <em>Table Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfe.impl.TableServicesImpl
	 * @see coreflight00.cfe.impl.CfePackageImpl#getTableServices()
	 * @generated
	 */
	int TABLE_SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SERVICES__SHORT_NAME = CFE_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SERVICES__UUID = CFE_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Table Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SERVICES_FEATURE_COUNT = CFE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SERVICES_OPERATION_COUNT = CFE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.cfe.impl.TimeServicesImpl <em>Time Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfe.impl.TimeServicesImpl
	 * @see coreflight00.cfe.impl.CfePackageImpl#getTimeServices()
	 * @generated
	 */
	int TIME_SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERVICES__SHORT_NAME = CFE_APPLICATION__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERVICES__UUID = CFE_APPLICATION__UUID;

	/**
	 * The number of structural features of the '<em>Time Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERVICES_FEATURE_COUNT = CFE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERVICES_OPERATION_COUNT = CFE_APPLICATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link coreflight00.cfe.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.cfe.impl.DocumentRootImpl
	 * @see coreflight00.cfe.impl.CfePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 6;

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
	 * The feature id for the '<em><b>EVENTSERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENTSERVICES = 3;

	/**
	 * The feature id for the '<em><b>EXECUTIVESERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXECUTIVESERVICES = 4;

	/**
	 * The feature id for the '<em><b>SOFTWAREBUS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOFTWAREBUS = 5;

	/**
	 * The feature id for the '<em><b>TABLESERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLESERVICES = 6;

	/**
	 * The feature id for the '<em><b>TIMESERVICES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIMESERVICES = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link coreflight00.cfe.CfeApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see coreflight00.cfe.CfeApplication
	 * @generated
	 */
	EClass getCfeApplication();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfe.EventServices <em>Event Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Services</em>'.
	 * @see coreflight00.cfe.EventServices
	 * @generated
	 */
	EClass getEventServices();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfe.ExecutiveServices <em>Executive Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executive Services</em>'.
	 * @see coreflight00.cfe.ExecutiveServices
	 * @generated
	 */
	EClass getExecutiveServices();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfe.SoftwareBus <em>Software Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Bus</em>'.
	 * @see coreflight00.cfe.SoftwareBus
	 * @generated
	 */
	EClass getSoftwareBus();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfe.TableServices <em>Table Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Services</em>'.
	 * @see coreflight00.cfe.TableServices
	 * @generated
	 */
	EClass getTableServices();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfe.TimeServices <em>Time Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Services</em>'.
	 * @see coreflight00.cfe.TimeServices
	 * @generated
	 */
	EClass getTimeServices();

	/**
	 * Returns the meta object for class '{@link coreflight00.cfe.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see coreflight00.cfe.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link coreflight00.cfe.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link coreflight00.cfe.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link coreflight00.cfe.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfe.DocumentRoot#getEVENTSERVICES <em>EVENTSERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EVENTSERVICES</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getEVENTSERVICES()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EVENTSERVICES();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfe.DocumentRoot#getEXECUTIVESERVICES <em>EXECUTIVESERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EXECUTIVESERVICES</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getEXECUTIVESERVICES()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EXECUTIVESERVICES();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfe.DocumentRoot#getSOFTWAREBUS <em>SOFTWAREBUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SOFTWAREBUS</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getSOFTWAREBUS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SOFTWAREBUS();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfe.DocumentRoot#getTABLESERVICES <em>TABLESERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TABLESERVICES</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getTABLESERVICES()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TABLESERVICES();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.cfe.DocumentRoot#getTIMESERVICES <em>TIMESERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TIMESERVICES</em>'.
	 * @see coreflight00.cfe.DocumentRoot#getTIMESERVICES()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TIMESERVICES();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CfeFactory getCfeFactory();

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
		 * The meta object literal for the '{@link coreflight00.cfe.impl.CfeApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfe.impl.CfeApplicationImpl
		 * @see coreflight00.cfe.impl.CfePackageImpl#getCfeApplication()
		 * @generated
		 */
		EClass CFE_APPLICATION = eINSTANCE.getCfeApplication();

		/**
		 * The meta object literal for the '{@link coreflight00.cfe.impl.EventServicesImpl <em>Event Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfe.impl.EventServicesImpl
		 * @see coreflight00.cfe.impl.CfePackageImpl#getEventServices()
		 * @generated
		 */
		EClass EVENT_SERVICES = eINSTANCE.getEventServices();

		/**
		 * The meta object literal for the '{@link coreflight00.cfe.impl.ExecutiveServicesImpl <em>Executive Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfe.impl.ExecutiveServicesImpl
		 * @see coreflight00.cfe.impl.CfePackageImpl#getExecutiveServices()
		 * @generated
		 */
		EClass EXECUTIVE_SERVICES = eINSTANCE.getExecutiveServices();

		/**
		 * The meta object literal for the '{@link coreflight00.cfe.impl.SoftwareBusImpl <em>Software Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfe.impl.SoftwareBusImpl
		 * @see coreflight00.cfe.impl.CfePackageImpl#getSoftwareBus()
		 * @generated
		 */
		EClass SOFTWARE_BUS = eINSTANCE.getSoftwareBus();

		/**
		 * The meta object literal for the '{@link coreflight00.cfe.impl.TableServicesImpl <em>Table Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfe.impl.TableServicesImpl
		 * @see coreflight00.cfe.impl.CfePackageImpl#getTableServices()
		 * @generated
		 */
		EClass TABLE_SERVICES = eINSTANCE.getTableServices();

		/**
		 * The meta object literal for the '{@link coreflight00.cfe.impl.TimeServicesImpl <em>Time Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfe.impl.TimeServicesImpl
		 * @see coreflight00.cfe.impl.CfePackageImpl#getTimeServices()
		 * @generated
		 */
		EClass TIME_SERVICES = eINSTANCE.getTimeServices();

		/**
		 * The meta object literal for the '{@link coreflight00.cfe.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.cfe.impl.DocumentRootImpl
		 * @see coreflight00.cfe.impl.CfePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>EVENTSERVICES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVENTSERVICES = eINSTANCE.getDocumentRoot_EVENTSERVICES();

		/**
		 * The meta object literal for the '<em><b>EXECUTIVESERVICES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXECUTIVESERVICES = eINSTANCE.getDocumentRoot_EXECUTIVESERVICES();

		/**
		 * The meta object literal for the '<em><b>SOFTWAREBUS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOFTWAREBUS = eINSTANCE.getDocumentRoot_SOFTWAREBUS();

		/**
		 * The meta object literal for the '<em><b>TABLESERVICES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TABLESERVICES = eINSTANCE.getDocumentRoot_TABLESERVICES();

		/**
		 * The meta object literal for the '<em><b>TIMESERVICES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIMESERVICES = eINSTANCE.getDocumentRoot_TIMESERVICES();

	}

} //CfePackage
