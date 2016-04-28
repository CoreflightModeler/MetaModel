/**
 */
package coreflight00.cfe.util;

import coreflight00.Application;
import coreflight00.Identifiable;

import coreflight00.cfe.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see coreflight00.cfe.CfePackage
 * @generated
 */
public class CfeSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CfePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfeSwitch() {
		if (modelPackage == null) {
			modelPackage = CfePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CfePackage.CFE_APPLICATION: {
				CfeApplication cfeApplication = (CfeApplication)theEObject;
				T result = caseCfeApplication(cfeApplication);
				if (result == null) result = caseApplication(cfeApplication);
				if (result == null) result = caseIdentifiable(cfeApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfePackage.EVENT_SERVICES: {
				EventServices eventServices = (EventServices)theEObject;
				T result = caseEventServices(eventServices);
				if (result == null) result = caseCfeApplication(eventServices);
				if (result == null) result = caseApplication(eventServices);
				if (result == null) result = caseIdentifiable(eventServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfePackage.EXECUTIVE_SERVICES: {
				ExecutiveServices executiveServices = (ExecutiveServices)theEObject;
				T result = caseExecutiveServices(executiveServices);
				if (result == null) result = caseCfeApplication(executiveServices);
				if (result == null) result = caseApplication(executiveServices);
				if (result == null) result = caseIdentifiable(executiveServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfePackage.SOFTWARE_BUS: {
				SoftwareBus softwareBus = (SoftwareBus)theEObject;
				T result = caseSoftwareBus(softwareBus);
				if (result == null) result = caseCfeApplication(softwareBus);
				if (result == null) result = caseApplication(softwareBus);
				if (result == null) result = caseIdentifiable(softwareBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfePackage.TABLE_SERVICES: {
				TableServices tableServices = (TableServices)theEObject;
				T result = caseTableServices(tableServices);
				if (result == null) result = caseCfeApplication(tableServices);
				if (result == null) result = caseApplication(tableServices);
				if (result == null) result = caseIdentifiable(tableServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfePackage.TIME_SERVICES: {
				TimeServices timeServices = (TimeServices)theEObject;
				T result = caseTimeServices(timeServices);
				if (result == null) result = caseCfeApplication(timeServices);
				if (result == null) result = caseApplication(timeServices);
				if (result == null) result = caseIdentifiable(timeServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CfePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCfeApplication(CfeApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventServices(EventServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executive Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executive Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutiveServices(ExecutiveServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareBus(SoftwareBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableServices(TableServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeServices(TimeServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CfeSwitch
