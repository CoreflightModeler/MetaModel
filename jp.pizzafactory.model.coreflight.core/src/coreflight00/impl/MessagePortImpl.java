/**
 */
package coreflight00.impl;

import coreflight00.Application;
import coreflight00.Applications;
import coreflight00.Coreflight00Package;
import coreflight00.Identifiable;
import coreflight00.MessagePort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;

import static coreflight00.util.Coreflight00ResourceFactoryImpl.CoreflightURIHandlerImpl.COREFLIGHT_SCHEME;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link coreflight00.impl.MessagePortImpl#getApplicationRef <em>Application Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessagePortImpl extends IdentifiableImpl implements MessagePort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The cached value of the '{@link #getApplicationRef() <em>Application Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationRef()
	 * @generated
	 * @ordered
	 */
	protected Application applicationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Coreflight00Package.Literals.MESSAGE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplicationRef() {
		if (applicationRef != null && applicationRef.eIsProxy()) {
			InternalEObject oldApplicationRef = (InternalEObject)applicationRef;
			applicationRef = (Application)eResolveProxy(oldApplicationRef);
			if (applicationRef != oldApplicationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Coreflight00Package.MESSAGE_PORT__APPLICATION_REF, oldApplicationRef, applicationRef));
			}
		}
		return applicationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplicationRef() {
		return applicationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationRef(Application newApplicationRef) {
		Application oldApplicationRef = applicationRef;
		applicationRef = newApplicationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Coreflight00Package.MESSAGE_PORT__APPLICATION_REF, oldApplicationRef, applicationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Coreflight00Package.MESSAGE_PORT__APPLICATION_REF:
				if (resolve) return getApplicationRef();
				return basicGetApplicationRef();
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
			case Coreflight00Package.MESSAGE_PORT__APPLICATION_REF:
				setApplicationRef((Application)newValue);
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
			case Coreflight00Package.MESSAGE_PORT__APPLICATION_REF:
				setApplicationRef((Application)null);
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
			case Coreflight00Package.MESSAGE_PORT__APPLICATION_REF:
				return applicationRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Treats "coreflight" scheme.
	 * Uses superclass if scheme is not for Coreflight.
	 */
	@Override
	public EObject eResolveProxy(InternalEObject proxy) {
		URI uri = proxy.eProxyURI();
		if (!COREFLIGHT_SCHEME.equals(uri.scheme())) {
			return super.eResolveProxy(proxy);
		}
		String[] paths = uri.fragment().substring(1).split("/");
		EObject root = EcoreUtil.getRootContainer(this);
		EObject result = null;
		for (String shortName : paths) {
			if ("".equals(shortName)) {
				continue;
			}
			boolean found = false;
			for (EObject o : root.eContents()) {
				if (o instanceof Identifiable) {
					if (shortName.equals(((Identifiable)o).getShortName().getLocalPart())) {
						result = o;
						root = o;
						found = true;
						break;
					}
				} else if (o instanceof Applications) {
					for(FeatureMap.Entry entry : ((Applications)o).getGroup()) {
						Object o2 = entry.getValue();
						if (o2 instanceof Identifiable) {
							if (shortName.equals(((Identifiable)o2).getShortName().getLocalPart())) {
								result = (Identifiable)o2;
	
								found = true;
								break;
							}
						}
					}
				}
			}
			if (!found) {
				return proxy;
			}
		}
		return (result == null) ? proxy : result;
	}

} //MessagePortImpl
