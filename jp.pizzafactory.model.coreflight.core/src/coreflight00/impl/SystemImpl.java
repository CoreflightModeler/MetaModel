/**
 */
package coreflight00.impl;

import coreflight00.Applications;
import coreflight00.Coreflight00Package;
import coreflight00.InterTaskMessageRouter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link coreflight00.impl.SystemImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link coreflight00.impl.SystemImpl#getInterTaskMessageRouter <em>Inter Task Message Router</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends IdentifiableImpl implements coreflight00.System {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected Applications applications;

	/**
	 * The cached value of the '{@link #getInterTaskMessageRouter() <em>Inter Task Message Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterTaskMessageRouter()
	 * @generated
	 * @ordered
	 */
	protected InterTaskMessageRouter interTaskMessageRouter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Coreflight00Package.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Applications getApplications() {
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplications(Applications newApplications, NotificationChain msgs) {
		Applications oldApplications = applications;
		applications = newApplications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Coreflight00Package.SYSTEM__APPLICATIONS, oldApplications, newApplications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplications(Applications newApplications) {
		if (newApplications != applications) {
			NotificationChain msgs = null;
			if (applications != null)
				msgs = ((InternalEObject)applications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Coreflight00Package.SYSTEM__APPLICATIONS, null, msgs);
			if (newApplications != null)
				msgs = ((InternalEObject)newApplications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Coreflight00Package.SYSTEM__APPLICATIONS, null, msgs);
			msgs = basicSetApplications(newApplications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Coreflight00Package.SYSTEM__APPLICATIONS, newApplications, newApplications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterTaskMessageRouter getInterTaskMessageRouter() {
		return interTaskMessageRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterTaskMessageRouter(InterTaskMessageRouter newInterTaskMessageRouter, NotificationChain msgs) {
		InterTaskMessageRouter oldInterTaskMessageRouter = interTaskMessageRouter;
		interTaskMessageRouter = newInterTaskMessageRouter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER, oldInterTaskMessageRouter, newInterTaskMessageRouter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterTaskMessageRouter(InterTaskMessageRouter newInterTaskMessageRouter) {
		if (newInterTaskMessageRouter != interTaskMessageRouter) {
			NotificationChain msgs = null;
			if (interTaskMessageRouter != null)
				msgs = ((InternalEObject)interTaskMessageRouter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER, null, msgs);
			if (newInterTaskMessageRouter != null)
				msgs = ((InternalEObject)newInterTaskMessageRouter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER, null, msgs);
			msgs = basicSetInterTaskMessageRouter(newInterTaskMessageRouter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER, newInterTaskMessageRouter, newInterTaskMessageRouter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Coreflight00Package.SYSTEM__APPLICATIONS:
				return basicSetApplications(null, msgs);
			case Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER:
				return basicSetInterTaskMessageRouter(null, msgs);
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
			case Coreflight00Package.SYSTEM__APPLICATIONS:
				return getApplications();
			case Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER:
				return getInterTaskMessageRouter();
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
			case Coreflight00Package.SYSTEM__APPLICATIONS:
				setApplications((Applications)newValue);
				return;
			case Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER:
				setInterTaskMessageRouter((InterTaskMessageRouter)newValue);
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
			case Coreflight00Package.SYSTEM__APPLICATIONS:
				setApplications((Applications)null);
				return;
			case Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER:
				setInterTaskMessageRouter((InterTaskMessageRouter)null);
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
			case Coreflight00Package.SYSTEM__APPLICATIONS:
				return applications != null;
			case Coreflight00Package.SYSTEM__INTER_TASK_MESSAGE_ROUTER:
				return interTaskMessageRouter != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
