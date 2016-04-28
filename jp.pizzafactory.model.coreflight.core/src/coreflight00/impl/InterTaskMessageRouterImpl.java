/**
 */
package coreflight00.impl;

import coreflight00.Coreflight00Package;
import coreflight00.InterTaskMessageRouter;
import coreflight00.Publisher;
import coreflight00.Subscriber;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Task Message Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link coreflight00.impl.InterTaskMessageRouterImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link coreflight00.impl.InterTaskMessageRouterImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link coreflight00.impl.InterTaskMessageRouterImpl#getSubscriber <em>Subscriber</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterTaskMessageRouterImpl extends IdentifiableImpl implements InterTaskMessageRouter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap applications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterTaskMessageRouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Coreflight00Package.Literals.INTER_TASK_MESSAGE_ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getApplications() {
		if (applications == null) {
			applications = new BasicFeatureMap(this, Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublisher() {
		return getApplications().list(Coreflight00Package.Literals.INTER_TASK_MESSAGE_ROUTER__PUBLISHER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscriber> getSubscriber() {
		return getApplications().list(Coreflight00Package.Literals.INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER:
				return ((InternalEList<?>)getSubscriber()).basicRemove(otherEnd, msgs);
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
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__APPLICATIONS:
				if (coreType) return getApplications();
				return ((FeatureMap.Internal)getApplications()).getWrapper();
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__PUBLISHER:
				return getPublisher();
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER:
				return getSubscriber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__APPLICATIONS:
				((FeatureMap.Internal)getApplications()).set(newValue);
				return;
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends Publisher>)newValue);
				return;
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER:
				getSubscriber().clear();
				getSubscriber().addAll((Collection<? extends Subscriber>)newValue);
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
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__APPLICATIONS:
				getApplications().clear();
				return;
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__PUBLISHER:
				getPublisher().clear();
				return;
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER:
				getSubscriber().clear();
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
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__PUBLISHER:
				return !getPublisher().isEmpty();
			case Coreflight00Package.INTER_TASK_MESSAGE_ROUTER__SUBSCRIBER:
				return !getSubscriber().isEmpty();
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
		result.append(" (applications: "); //$NON-NLS-1$
		result.append(applications);
		result.append(')');
		return result.toString();
	}

} //InterTaskMessageRouterImpl
