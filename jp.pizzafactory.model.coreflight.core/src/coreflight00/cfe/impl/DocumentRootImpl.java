/**
 */
package coreflight00.cfe.impl;

import coreflight00.cfe.CfePackage;
import coreflight00.cfe.DocumentRoot;
import coreflight00.cfe.EventServices;
import coreflight00.cfe.ExecutiveServices;
import coreflight00.cfe.SoftwareBus;
import coreflight00.cfe.TableServices;
import coreflight00.cfe.TimeServices;

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
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getEVENTSERVICES <em>EVENTSERVICES</em>}</li>
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getEXECUTIVESERVICES <em>EXECUTIVESERVICES</em>}</li>
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getSOFTWAREBUS <em>SOFTWAREBUS</em>}</li>
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getTABLESERVICES <em>TABLESERVICES</em>}</li>
 *   <li>{@link coreflight00.cfe.impl.DocumentRootImpl#getTIMESERVICES <em>TIMESERVICES</em>}</li>
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
		return CfePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CfePackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventServices getEVENTSERVICES() {
		return (EventServices)getMixed().get(CfePackage.Literals.DOCUMENT_ROOT__EVENTSERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVENTSERVICES(EventServices newEVENTSERVICES, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfePackage.Literals.DOCUMENT_ROOT__EVENTSERVICES, newEVENTSERVICES, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVENTSERVICES(EventServices newEVENTSERVICES) {
		((FeatureMap.Internal)getMixed()).set(CfePackage.Literals.DOCUMENT_ROOT__EVENTSERVICES, newEVENTSERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutiveServices getEXECUTIVESERVICES() {
		return (ExecutiveServices)getMixed().get(CfePackage.Literals.DOCUMENT_ROOT__EXECUTIVESERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXECUTIVESERVICES(ExecutiveServices newEXECUTIVESERVICES, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfePackage.Literals.DOCUMENT_ROOT__EXECUTIVESERVICES, newEXECUTIVESERVICES, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEXECUTIVESERVICES(ExecutiveServices newEXECUTIVESERVICES) {
		((FeatureMap.Internal)getMixed()).set(CfePackage.Literals.DOCUMENT_ROOT__EXECUTIVESERVICES, newEXECUTIVESERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBus getSOFTWAREBUS() {
		return (SoftwareBus)getMixed().get(CfePackage.Literals.DOCUMENT_ROOT__SOFTWAREBUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSOFTWAREBUS(SoftwareBus newSOFTWAREBUS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfePackage.Literals.DOCUMENT_ROOT__SOFTWAREBUS, newSOFTWAREBUS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSOFTWAREBUS(SoftwareBus newSOFTWAREBUS) {
		((FeatureMap.Internal)getMixed()).set(CfePackage.Literals.DOCUMENT_ROOT__SOFTWAREBUS, newSOFTWAREBUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableServices getTABLESERVICES() {
		return (TableServices)getMixed().get(CfePackage.Literals.DOCUMENT_ROOT__TABLESERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTABLESERVICES(TableServices newTABLESERVICES, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfePackage.Literals.DOCUMENT_ROOT__TABLESERVICES, newTABLESERVICES, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTABLESERVICES(TableServices newTABLESERVICES) {
		((FeatureMap.Internal)getMixed()).set(CfePackage.Literals.DOCUMENT_ROOT__TABLESERVICES, newTABLESERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeServices getTIMESERVICES() {
		return (TimeServices)getMixed().get(CfePackage.Literals.DOCUMENT_ROOT__TIMESERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTIMESERVICES(TimeServices newTIMESERVICES, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfePackage.Literals.DOCUMENT_ROOT__TIMESERVICES, newTIMESERVICES, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTIMESERVICES(TimeServices newTIMESERVICES) {
		((FeatureMap.Internal)getMixed()).set(CfePackage.Literals.DOCUMENT_ROOT__TIMESERVICES, newTIMESERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CfePackage.DOCUMENT_ROOT__EVENTSERVICES:
				return basicSetEVENTSERVICES(null, msgs);
			case CfePackage.DOCUMENT_ROOT__EXECUTIVESERVICES:
				return basicSetEXECUTIVESERVICES(null, msgs);
			case CfePackage.DOCUMENT_ROOT__SOFTWAREBUS:
				return basicSetSOFTWAREBUS(null, msgs);
			case CfePackage.DOCUMENT_ROOT__TABLESERVICES:
				return basicSetTABLESERVICES(null, msgs);
			case CfePackage.DOCUMENT_ROOT__TIMESERVICES:
				return basicSetTIMESERVICES(null, msgs);
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
			case CfePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CfePackage.DOCUMENT_ROOT__EVENTSERVICES:
				return getEVENTSERVICES();
			case CfePackage.DOCUMENT_ROOT__EXECUTIVESERVICES:
				return getEXECUTIVESERVICES();
			case CfePackage.DOCUMENT_ROOT__SOFTWAREBUS:
				return getSOFTWAREBUS();
			case CfePackage.DOCUMENT_ROOT__TABLESERVICES:
				return getTABLESERVICES();
			case CfePackage.DOCUMENT_ROOT__TIMESERVICES:
				return getTIMESERVICES();
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
			case CfePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CfePackage.DOCUMENT_ROOT__EVENTSERVICES:
				setEVENTSERVICES((EventServices)newValue);
				return;
			case CfePackage.DOCUMENT_ROOT__EXECUTIVESERVICES:
				setEXECUTIVESERVICES((ExecutiveServices)newValue);
				return;
			case CfePackage.DOCUMENT_ROOT__SOFTWAREBUS:
				setSOFTWAREBUS((SoftwareBus)newValue);
				return;
			case CfePackage.DOCUMENT_ROOT__TABLESERVICES:
				setTABLESERVICES((TableServices)newValue);
				return;
			case CfePackage.DOCUMENT_ROOT__TIMESERVICES:
				setTIMESERVICES((TimeServices)newValue);
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
			case CfePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CfePackage.DOCUMENT_ROOT__EVENTSERVICES:
				setEVENTSERVICES((EventServices)null);
				return;
			case CfePackage.DOCUMENT_ROOT__EXECUTIVESERVICES:
				setEXECUTIVESERVICES((ExecutiveServices)null);
				return;
			case CfePackage.DOCUMENT_ROOT__SOFTWAREBUS:
				setSOFTWAREBUS((SoftwareBus)null);
				return;
			case CfePackage.DOCUMENT_ROOT__TABLESERVICES:
				setTABLESERVICES((TableServices)null);
				return;
			case CfePackage.DOCUMENT_ROOT__TIMESERVICES:
				setTIMESERVICES((TimeServices)null);
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
			case CfePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CfePackage.DOCUMENT_ROOT__EVENTSERVICES:
				return getEVENTSERVICES() != null;
			case CfePackage.DOCUMENT_ROOT__EXECUTIVESERVICES:
				return getEXECUTIVESERVICES() != null;
			case CfePackage.DOCUMENT_ROOT__SOFTWAREBUS:
				return getSOFTWAREBUS() != null;
			case CfePackage.DOCUMENT_ROOT__TABLESERVICES:
				return getTABLESERVICES() != null;
			case CfePackage.DOCUMENT_ROOT__TIMESERVICES:
				return getTIMESERVICES() != null;
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
