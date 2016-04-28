/**
 */
package coreflight00.cfe.util;

import coreflight00.Application;
import coreflight00.Identifiable;

import coreflight00.cfe.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see coreflight00.cfe.CfePackage
 * @generated
 */
public class CfeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CfePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CfePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CfeSwitch<Adapter> modelSwitch =
		new CfeSwitch<Adapter>() {
			@Override
			public Adapter caseCfeApplication(CfeApplication object) {
				return createCfeApplicationAdapter();
			}
			@Override
			public Adapter caseEventServices(EventServices object) {
				return createEventServicesAdapter();
			}
			@Override
			public Adapter caseExecutiveServices(ExecutiveServices object) {
				return createExecutiveServicesAdapter();
			}
			@Override
			public Adapter caseSoftwareBus(SoftwareBus object) {
				return createSoftwareBusAdapter();
			}
			@Override
			public Adapter caseTableServices(TableServices object) {
				return createTableServicesAdapter();
			}
			@Override
			public Adapter caseTimeServices(TimeServices object) {
				return createTimeServicesAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfe.CfeApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfe.CfeApplication
	 * @generated
	 */
	public Adapter createCfeApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfe.EventServices <em>Event Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfe.EventServices
	 * @generated
	 */
	public Adapter createEventServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfe.ExecutiveServices <em>Executive Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfe.ExecutiveServices
	 * @generated
	 */
	public Adapter createExecutiveServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfe.SoftwareBus <em>Software Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfe.SoftwareBus
	 * @generated
	 */
	public Adapter createSoftwareBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfe.TableServices <em>Table Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfe.TableServices
	 * @generated
	 */
	public Adapter createTableServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfe.TimeServices <em>Time Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfe.TimeServices
	 * @generated
	 */
	public Adapter createTimeServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.cfe.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.cfe.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link coreflight00.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see coreflight00.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CfeAdapterFactory
