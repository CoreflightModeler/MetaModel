/**
 */
package coreflight00;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see coreflight00.Coreflight00Factory
 * @model kind="package"
 * @generated
 */
public interface Coreflight00Package extends EPackage {
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
	String eNAME = "coreflight00";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.monami-ya.com/coreflight/r0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Coreflight00Package eINSTANCE = coreflight00.impl.Coreflight00PackageImpl.init();

	/**
	 * The meta object id for the '{@link coreflight00.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.IdentifiableImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 3;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__SHORT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__UUID = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.ApplicationImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__UUID = IDENTIFIABLE__UUID;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.ApplicationsImpl <em>Applications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.ApplicationsImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getApplications()
	 * @generated
	 */
	int APPLICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>EVENTSERVICES</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__EVENTSERVICES = 1;

	/**
	 * The feature id for the '<em><b>EXECUTIVESERVICES</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__EXECUTIVESERVICES = 2;

	/**
	 * The feature id for the '<em><b>SOFTWAREBUS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__SOFTWAREBUS = 3;

	/**
	 * The feature id for the '<em><b>TABLESERVICES</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__TABLESERVICES = 4;

	/**
	 * The feature id for the '<em><b>TIMESERVICES</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__TIMESERVICES = 5;

	/**
	 * The feature id for the '<em><b>CFDPFILETRANSFER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__CFDPFILETRANSFER = 6;

	/**
	 * The feature id for the '<em><b>CHECKSUM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__CHECKSUM = 7;

	/**
	 * The feature id for the '<em><b>DATASTORAGE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__DATASTORAGE = 8;

	/**
	 * The feature id for the '<em><b>FILEMANAGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__FILEMANAGER = 9;

	/**
	 * The feature id for the '<em><b>HEALTHANDSAFETY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__HEALTHANDSAFETY = 10;

	/**
	 * The feature id for the '<em><b>HOUSEKEEPING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__HOUSEKEEPING = 11;

	/**
	 * The feature id for the '<em><b>LIMITCHECKER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__LIMITCHECKER = 12;

	/**
	 * The feature id for the '<em><b>MEMORYDWELL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__MEMORYDWELL = 13;

	/**
	 * The feature id for the '<em><b>MEMORYMANAGEMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__MEMORYMANAGEMENT = 14;

	/**
	 * The feature id for the '<em><b>SCHEDULER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__SCHEDULER = 15;

	/**
	 * The feature id for the '<em><b>STOREDCOMMANDING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__STOREDCOMMANDING = 16;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS__APPLICATION = 17;

	/**
	 * The number of structural features of the '<em>Applications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Applications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.DocumentRootImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Application Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICATION_REF = 4;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICATIONS = 5;

	/**
	 * The feature id for the '<em><b>Inter Task Message Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER = 6;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER = 7;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHORT_NAME = 8;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBSCRIBER = 9;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UUID = 11;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.InterTaskMessageRouterImpl <em>Inter Task Message Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.InterTaskMessageRouterImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getInterTaskMessageRouter()
	 * @generated
	 */
	int INTER_TASK_MESSAGE_ROUTER = 4;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TASK_MESSAGE_ROUTER__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TASK_MESSAGE_ROUTER__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TASK_MESSAGE_ROUTER__APPLICATIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TASK_MESSAGE_ROUTER__PUBLISHER = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Inter Task Message Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TASK_MESSAGE_ROUTER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Inter Task Message Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TASK_MESSAGE_ROUTER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.MessagePortImpl <em>Message Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.MessagePortImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getMessagePort()
	 * @generated
	 */
	int MESSAGE_PORT = 5;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Application Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT__APPLICATION_REF = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.PublisherImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 6;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__SHORT_NAME = MESSAGE_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__UUID = MESSAGE_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Application Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__APPLICATION_REF = MESSAGE_PORT__APPLICATION_REF;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = MESSAGE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = MESSAGE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.SubscriberImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 7;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__SHORT_NAME = MESSAGE_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__UUID = MESSAGE_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Application Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__APPLICATION_REF = MESSAGE_PORT__APPLICATION_REF;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = MESSAGE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = MESSAGE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link coreflight00.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see coreflight00.impl.SystemImpl
	 * @see coreflight00.impl.Coreflight00PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SHORT_NAME = IDENTIFIABLE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__UUID = IDENTIFIABLE__UUID;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__APPLICATIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inter Task Message Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INTER_TASK_MESSAGE_ROUTER = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>UUID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see coreflight00.impl.Coreflight00PackageImpl#getUUID()
	 * @generated
	 */
	int UUID = 9;


	/**
	 * Returns the meta object for class '{@link coreflight00.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see coreflight00.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for class '{@link coreflight00.Applications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applications</em>'.
	 * @see coreflight00.Applications
	 * @generated
	 */
	EClass getApplications();

	/**
	 * Returns the meta object for the attribute list '{@link coreflight00.Applications#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see coreflight00.Applications#getGroup()
	 * @see #getApplications()
	 * @generated
	 */
	EAttribute getApplications_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getEVENTSERVICES <em>EVENTSERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EVENTSERVICES</em>'.
	 * @see coreflight00.Applications#getEVENTSERVICES()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_EVENTSERVICES();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getEXECUTIVESERVICES <em>EXECUTIVESERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EXECUTIVESERVICES</em>'.
	 * @see coreflight00.Applications#getEXECUTIVESERVICES()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_EXECUTIVESERVICES();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getSOFTWAREBUS <em>SOFTWAREBUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SOFTWAREBUS</em>'.
	 * @see coreflight00.Applications#getSOFTWAREBUS()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_SOFTWAREBUS();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getTABLESERVICES <em>TABLESERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TABLESERVICES</em>'.
	 * @see coreflight00.Applications#getTABLESERVICES()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_TABLESERVICES();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getTIMESERVICES <em>TIMESERVICES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TIMESERVICES</em>'.
	 * @see coreflight00.Applications#getTIMESERVICES()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_TIMESERVICES();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getCFDPFILETRANSFER <em>CFDPFILETRANSFER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CFDPFILETRANSFER</em>'.
	 * @see coreflight00.Applications#getCFDPFILETRANSFER()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_CFDPFILETRANSFER();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getCHECKSUM <em>CHECKSUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CHECKSUM</em>'.
	 * @see coreflight00.Applications#getCHECKSUM()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_CHECKSUM();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getDATASTORAGE <em>DATASTORAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATASTORAGE</em>'.
	 * @see coreflight00.Applications#getDATASTORAGE()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_DATASTORAGE();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getFILEMANAGER <em>FILEMANAGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FILEMANAGER</em>'.
	 * @see coreflight00.Applications#getFILEMANAGER()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_FILEMANAGER();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getHEALTHANDSAFETY <em>HEALTHANDSAFETY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HEALTHANDSAFETY</em>'.
	 * @see coreflight00.Applications#getHEALTHANDSAFETY()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_HEALTHANDSAFETY();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getHOUSEKEEPING <em>HOUSEKEEPING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HOUSEKEEPING</em>'.
	 * @see coreflight00.Applications#getHOUSEKEEPING()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_HOUSEKEEPING();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getLIMITCHECKER <em>LIMITCHECKER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>LIMITCHECKER</em>'.
	 * @see coreflight00.Applications#getLIMITCHECKER()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_LIMITCHECKER();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getMEMORYDWELL <em>MEMORYDWELL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MEMORYDWELL</em>'.
	 * @see coreflight00.Applications#getMEMORYDWELL()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_MEMORYDWELL();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getMEMORYMANAGEMENT <em>MEMORYMANAGEMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MEMORYMANAGEMENT</em>'.
	 * @see coreflight00.Applications#getMEMORYMANAGEMENT()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_MEMORYMANAGEMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getSCHEDULER <em>SCHEDULER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SCHEDULER</em>'.
	 * @see coreflight00.Applications#getSCHEDULER()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_SCHEDULER();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getSTOREDCOMMANDING <em>STOREDCOMMANDING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>STOREDCOMMANDING</em>'.
	 * @see coreflight00.Applications#getSTOREDCOMMANDING()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_STOREDCOMMANDING();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.Applications#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application</em>'.
	 * @see coreflight00.Applications#getApplication()
	 * @see #getApplications()
	 * @generated
	 */
	EReference getApplications_Application();

	/**
	 * Returns the meta object for class '{@link coreflight00.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see coreflight00.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link coreflight00.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see coreflight00.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link coreflight00.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see coreflight00.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link coreflight00.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see coreflight00.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.DocumentRoot#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see coreflight00.DocumentRoot#getApplication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Application();

	/**
	 * Returns the meta object for the reference '{@link coreflight00.DocumentRoot#getApplicationRef <em>Application Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Ref</em>'.
	 * @see coreflight00.DocumentRoot#getApplicationRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ApplicationRef();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.DocumentRoot#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applications</em>'.
	 * @see coreflight00.DocumentRoot#getApplications()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Applications();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.DocumentRoot#getInterTaskMessageRouter <em>Inter Task Message Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Task Message Router</em>'.
	 * @see coreflight00.DocumentRoot#getInterTaskMessageRouter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterTaskMessageRouter();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.DocumentRoot#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see coreflight00.DocumentRoot#getPublisher()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link coreflight00.DocumentRoot#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see coreflight00.DocumentRoot#getShortName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ShortName();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.DocumentRoot#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscriber</em>'.
	 * @see coreflight00.DocumentRoot#getSubscriber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Subscriber();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.DocumentRoot#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see coreflight00.DocumentRoot#getSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_System();

	/**
	 * Returns the meta object for the attribute '{@link coreflight00.DocumentRoot#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see coreflight00.DocumentRoot#getUuid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Uuid();

	/**
	 * Returns the meta object for class '{@link coreflight00.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see coreflight00.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link coreflight00.Identifiable#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see coreflight00.Identifiable#getShortName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link coreflight00.Identifiable#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see coreflight00.Identifiable#getUuid()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Uuid();

	/**
	 * Returns the meta object for class '{@link coreflight00.InterTaskMessageRouter <em>Inter Task Message Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Task Message Router</em>'.
	 * @see coreflight00.InterTaskMessageRouter
	 * @generated
	 */
	EClass getInterTaskMessageRouter();

	/**
	 * Returns the meta object for the attribute list '{@link coreflight00.InterTaskMessageRouter#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Applications</em>'.
	 * @see coreflight00.InterTaskMessageRouter#getApplications()
	 * @see #getInterTaskMessageRouter()
	 * @generated
	 */
	EAttribute getInterTaskMessageRouter_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.InterTaskMessageRouter#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see coreflight00.InterTaskMessageRouter#getPublisher()
	 * @see #getInterTaskMessageRouter()
	 * @generated
	 */
	EReference getInterTaskMessageRouter_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link coreflight00.InterTaskMessageRouter#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscriber</em>'.
	 * @see coreflight00.InterTaskMessageRouter#getSubscriber()
	 * @see #getInterTaskMessageRouter()
	 * @generated
	 */
	EReference getInterTaskMessageRouter_Subscriber();

	/**
	 * Returns the meta object for class '{@link coreflight00.MessagePort <em>Message Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port</em>'.
	 * @see coreflight00.MessagePort
	 * @generated
	 */
	EClass getMessagePort();

	/**
	 * Returns the meta object for the reference '{@link coreflight00.MessagePort#getApplicationRef <em>Application Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application Ref</em>'.
	 * @see coreflight00.MessagePort#getApplicationRef()
	 * @see #getMessagePort()
	 * @generated
	 */
	EReference getMessagePort_ApplicationRef();

	/**
	 * Returns the meta object for class '{@link coreflight00.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see coreflight00.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for class '{@link coreflight00.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see coreflight00.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for class '{@link coreflight00.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see coreflight00.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.System#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applications</em>'.
	 * @see coreflight00.System#getApplications()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Applications();

	/**
	 * Returns the meta object for the containment reference '{@link coreflight00.System#getInterTaskMessageRouter <em>Inter Task Message Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Task Message Router</em>'.
	 * @see coreflight00.System#getInterTaskMessageRouter()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_InterTaskMessageRouter();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UUID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UUID' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='36' pattern='[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}'"
	 * @generated
	 */
	EDataType getUUID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Coreflight00Factory getCoreflight00Factory();

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
		 * The meta object literal for the '{@link coreflight00.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.ApplicationImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.ApplicationsImpl <em>Applications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.ApplicationsImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getApplications()
		 * @generated
		 */
		EClass APPLICATIONS = eINSTANCE.getApplications();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATIONS__GROUP = eINSTANCE.getApplications_Group();

		/**
		 * The meta object literal for the '<em><b>EVENTSERVICES</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__EVENTSERVICES = eINSTANCE.getApplications_EVENTSERVICES();

		/**
		 * The meta object literal for the '<em><b>EXECUTIVESERVICES</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__EXECUTIVESERVICES = eINSTANCE.getApplications_EXECUTIVESERVICES();

		/**
		 * The meta object literal for the '<em><b>SOFTWAREBUS</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__SOFTWAREBUS = eINSTANCE.getApplications_SOFTWAREBUS();

		/**
		 * The meta object literal for the '<em><b>TABLESERVICES</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__TABLESERVICES = eINSTANCE.getApplications_TABLESERVICES();

		/**
		 * The meta object literal for the '<em><b>TIMESERVICES</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__TIMESERVICES = eINSTANCE.getApplications_TIMESERVICES();

		/**
		 * The meta object literal for the '<em><b>CFDPFILETRANSFER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__CFDPFILETRANSFER = eINSTANCE.getApplications_CFDPFILETRANSFER();

		/**
		 * The meta object literal for the '<em><b>HOUSEKEEPING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__HOUSEKEEPING = eINSTANCE.getApplications_HOUSEKEEPING();

		/**
		 * The meta object literal for the '<em><b>LIMITCHECKER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__LIMITCHECKER = eINSTANCE.getApplications_LIMITCHECKER();

		/**
		 * The meta object literal for the '<em><b>MEMORYDWELL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__MEMORYDWELL = eINSTANCE.getApplications_MEMORYDWELL();

		/**
		 * The meta object literal for the '<em><b>MEMORYMANAGEMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__MEMORYMANAGEMENT = eINSTANCE.getApplications_MEMORYMANAGEMENT();

		/**
		 * The meta object literal for the '<em><b>SCHEDULER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__SCHEDULER = eINSTANCE.getApplications_SCHEDULER();

		/**
		 * The meta object literal for the '<em><b>STOREDCOMMANDING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__STOREDCOMMANDING = eINSTANCE.getApplications_STOREDCOMMANDING();

		/**
		 * The meta object literal for the '<em><b>CHECKSUM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__CHECKSUM = eINSTANCE.getApplications_CHECKSUM();

		/**
		 * The meta object literal for the '<em><b>DATASTORAGE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__DATASTORAGE = eINSTANCE.getApplications_DATASTORAGE();

		/**
		 * The meta object literal for the '<em><b>FILEMANAGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__FILEMANAGER = eINSTANCE.getApplications_FILEMANAGER();

		/**
		 * The meta object literal for the '<em><b>HEALTHANDSAFETY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__HEALTHANDSAFETY = eINSTANCE.getApplications_HEALTHANDSAFETY();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATIONS__APPLICATION = eINSTANCE.getApplications_Application();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.DocumentRootImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICATION = eINSTANCE.getDocumentRoot_Application();

		/**
		 * The meta object literal for the '<em><b>Application Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICATION_REF = eINSTANCE.getDocumentRoot_ApplicationRef();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICATIONS = eINSTANCE.getDocumentRoot_Applications();

		/**
		 * The meta object literal for the '<em><b>Inter Task Message Router</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER = eINSTANCE.getDocumentRoot_InterTaskMessageRouter();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PUBLISHER = eINSTANCE.getDocumentRoot_Publisher();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SHORT_NAME = eINSTANCE.getDocumentRoot_ShortName();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBSCRIBER = eINSTANCE.getDocumentRoot_Subscriber();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYSTEM = eINSTANCE.getDocumentRoot_System();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__UUID = eINSTANCE.getDocumentRoot_Uuid();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.IdentifiableImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__SHORT_NAME = eINSTANCE.getIdentifiable_ShortName();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__UUID = eINSTANCE.getIdentifiable_Uuid();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.InterTaskMessageRouterImpl <em>Inter Task Message Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.InterTaskMessageRouterImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getInterTaskMessageRouter()
		 * @generated
		 */
		EClass INTER_TASK_MESSAGE_ROUTER = eINSTANCE.getInterTaskMessageRouter();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_TASK_MESSAGE_ROUTER__APPLICATIONS = eINSTANCE.getInterTaskMessageRouter_Applications();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_TASK_MESSAGE_ROUTER__PUBLISHER = eINSTANCE.getInterTaskMessageRouter_Publisher();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER = eINSTANCE.getInterTaskMessageRouter_Subscriber();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.MessagePortImpl <em>Message Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.MessagePortImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getMessagePort()
		 * @generated
		 */
		EClass MESSAGE_PORT = eINSTANCE.getMessagePort();

		/**
		 * The meta object literal for the '<em><b>Application Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_PORT__APPLICATION_REF = eINSTANCE.getMessagePort_ApplicationRef();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.PublisherImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.SubscriberImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '{@link coreflight00.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see coreflight00.impl.SystemImpl
		 * @see coreflight00.impl.Coreflight00PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__APPLICATIONS = eINSTANCE.getSystem_Applications();

		/**
		 * The meta object literal for the '<em><b>Inter Task Message Router</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__INTER_TASK_MESSAGE_ROUTER = eINSTANCE.getSystem_InterTaskMessageRouter();

		/**
		 * The meta object literal for the '<em>UUID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see coreflight00.impl.Coreflight00PackageImpl#getUUID()
		 * @generated
		 */
		EDataType UUID = eINSTANCE.getUUID();

	}

} //Coreflight00Package
