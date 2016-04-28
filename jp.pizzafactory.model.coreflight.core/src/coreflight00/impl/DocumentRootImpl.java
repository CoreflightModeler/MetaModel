/**
 */
package coreflight00.impl;

import coreflight00.Application;
import coreflight00.Applications;
import coreflight00.Coreflight00Package;
import coreflight00.DocumentRoot;
import coreflight00.InterTaskMessageRouter;
import coreflight00.Publisher;
import coreflight00.Subscriber;
import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getApplicationRef <em>Application Ref</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getInterTaskMessageRouter <em>Inter Task Message Router</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getSystem <em>System</em>}</li>
 *   <li>{@link coreflight00.impl.DocumentRootImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final QName SHORT_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Coreflight00Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Coreflight00Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Coreflight00Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Coreflight00Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		return (Application)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION, newApplication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION, newApplication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplicationRef() {
		Application applicationRef = basicGetApplicationRef();
		return applicationRef != null && applicationRef.eIsProxy() ? (Application)eResolveProxy((InternalEObject)applicationRef) : applicationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplicationRef() {
		return (Application)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION_REF, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationRef(Application newApplicationRef) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION_REF, newApplicationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Applications getApplications() {
		return (Applications)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplications(Applications newApplications, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATIONS, newApplications, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplications(Applications newApplications) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATIONS, newApplications);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterTaskMessageRouter getInterTaskMessageRouter() {
		return (InterTaskMessageRouter)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterTaskMessageRouter(InterTaskMessageRouter newInterTaskMessageRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Coreflight00Package.Literals.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER, newInterTaskMessageRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterTaskMessageRouter(InterTaskMessageRouter newInterTaskMessageRouter) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER, newInterTaskMessageRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		return (Publisher)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__PUBLISHER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Publisher newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Coreflight00Package.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getShortName() {
		return (QName)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__SHORT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(QName newShortName) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__SHORT_NAME, newShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber getSubscriber() {
		return (Subscriber)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__SUBSCRIBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriber(Subscriber newSubscriber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Coreflight00Package.Literals.DOCUMENT_ROOT__SUBSCRIBER, newSubscriber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriber(Subscriber newSubscriber) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__SUBSCRIBER, newSubscriber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public coreflight00.System getSystem() {
		return (coreflight00.System)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(coreflight00.System newSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(Coreflight00Package.Literals.DOCUMENT_ROOT__SYSTEM, newSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(coreflight00.System newSystem) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__SYSTEM, newSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return (String)getMixed().get(Coreflight00Package.Literals.DOCUMENT_ROOT__UUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		((FeatureMap.Internal)getMixed()).set(Coreflight00Package.Literals.DOCUMENT_ROOT__UUID, newUuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Coreflight00Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION:
				return basicSetApplication(null, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATIONS:
				return basicSetApplications(null, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER:
				return basicSetInterTaskMessageRouter(null, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__SUBSCRIBER:
				return basicSetSubscriber(null, msgs);
			case Coreflight00Package.DOCUMENT_ROOT__SYSTEM:
				return basicSetSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Coreflight00Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Coreflight00Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case Coreflight00Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION:
				return getApplication();
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION_REF:
				if (resolve) return getApplicationRef();
				return basicGetApplicationRef();
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATIONS:
				return getApplications();
			case Coreflight00Package.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER:
				return getInterTaskMessageRouter();
			case Coreflight00Package.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case Coreflight00Package.DOCUMENT_ROOT__SHORT_NAME:
				return getShortName();
			case Coreflight00Package.DOCUMENT_ROOT__SUBSCRIBER:
				return getSubscriber();
			case Coreflight00Package.DOCUMENT_ROOT__SYSTEM:
				return getSystem();
			case Coreflight00Package.DOCUMENT_ROOT__UUID:
				return getUuid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Coreflight00Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION:
				setApplication((Application)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION_REF:
				setApplicationRef((Application)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATIONS:
				setApplications((Applications)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER:
				setInterTaskMessageRouter((InterTaskMessageRouter)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__SHORT_NAME:
				setShortName((QName)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__SUBSCRIBER:
				setSubscriber((Subscriber)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__SYSTEM:
				setSystem((coreflight00.System)newValue);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__UUID:
				setUuid((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Coreflight00Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Coreflight00Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Coreflight00Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION:
				setApplication((Application)null);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION_REF:
				setApplicationRef((Application)null);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATIONS:
				setApplications((Applications)null);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER:
				setInterTaskMessageRouter((InterTaskMessageRouter)null);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__SUBSCRIBER:
				setSubscriber((Subscriber)null);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__SYSTEM:
				setSystem((coreflight00.System)null);
				return;
			case Coreflight00Package.DOCUMENT_ROOT__UUID:
				setUuid(UUID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Coreflight00Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Coreflight00Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Coreflight00Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION:
				return getApplication() != null;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION_REF:
				return basicGetApplicationRef() != null;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATIONS:
				return getApplications() != null;
			case Coreflight00Package.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER:
				return getInterTaskMessageRouter() != null;
			case Coreflight00Package.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case Coreflight00Package.DOCUMENT_ROOT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? getShortName() != null : !SHORT_NAME_EDEFAULT.equals(getShortName());
			case Coreflight00Package.DOCUMENT_ROOT__SUBSCRIBER:
				return getSubscriber() != null;
			case Coreflight00Package.DOCUMENT_ROOT__SYSTEM:
				return getSystem() != null;
			case Coreflight00Package.DOCUMENT_ROOT__UUID:
				return UUID_EDEFAULT == null ? getUuid() != null : !UUID_EDEFAULT.equals(getUuid());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: "); //$NON-NLS-1$
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
