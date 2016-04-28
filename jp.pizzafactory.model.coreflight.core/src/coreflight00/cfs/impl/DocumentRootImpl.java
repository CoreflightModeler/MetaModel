/**
 */
package coreflight00.cfs.impl;

import coreflight00.cfs.CfdpFileTransfer;
import coreflight00.cfs.CfsPackage;
import coreflight00.cfs.Checksum;
import coreflight00.cfs.DataStorage;
import coreflight00.cfs.DocumentRoot;
import coreflight00.cfs.FileManager;
import coreflight00.cfs.HealthAndSafety;
import coreflight00.cfs.Housekeeping;
import coreflight00.cfs.LimitChecker;
import coreflight00.cfs.MemoryDwell;
import coreflight00.cfs.MemoryManagement;
import coreflight00.cfs.Scheduler;
import coreflight00.cfs.StoredCommanding;
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
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getCFDPFILETRANSFER <em>CFDPFILETRANSFER</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getDATASTORAGE <em>DATASTORAGE</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getFILEMANAGER <em>FILEMANAGER</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getHEALTHANDSAFETY <em>HEALTHANDSAFETY</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getHOUSEKEEPING <em>HOUSEKEEPING</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getLIMITCHECKER <em>LIMITCHECKER</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getMEMORYDWELL <em>MEMORYDWELL</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getMEMORYMANAGEMENT <em>MEMORYMANAGEMENT</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link coreflight00.cfs.impl.DocumentRootImpl#getSTOREDCOMMANDING <em>STOREDCOMMANDING</em>}</li>
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
		return CfsPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CfsPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CfsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CfsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfdpFileTransfer getCFDPFILETRANSFER() {
		return (CfdpFileTransfer)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__CFDPFILETRANSFER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCFDPFILETRANSFER(CfdpFileTransfer newCFDPFILETRANSFER, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__CFDPFILETRANSFER, newCFDPFILETRANSFER, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFDPFILETRANSFER(CfdpFileTransfer newCFDPFILETRANSFER) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__CFDPFILETRANSFER, newCFDPFILETRANSFER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checksum getCHECKSUM() {
		return (Checksum)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__CHECKSUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCHECKSUM(Checksum newCHECKSUM, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__CHECKSUM, newCHECKSUM, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCHECKSUM(Checksum newCHECKSUM) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__CHECKSUM, newCHECKSUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStorage getDATASTORAGE() {
		return (DataStorage)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__DATASTORAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDATASTORAGE(DataStorage newDATASTORAGE, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__DATASTORAGE, newDATASTORAGE, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATASTORAGE(DataStorage newDATASTORAGE) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__DATASTORAGE, newDATASTORAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileManager getFILEMANAGER() {
		return (FileManager)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__FILEMANAGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFILEMANAGER(FileManager newFILEMANAGER, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__FILEMANAGER, newFILEMANAGER, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFILEMANAGER(FileManager newFILEMANAGER) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__FILEMANAGER, newFILEMANAGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthAndSafety getHEALTHANDSAFETY() {
		return (HealthAndSafety)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__HEALTHANDSAFETY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHEALTHANDSAFETY(HealthAndSafety newHEALTHANDSAFETY, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__HEALTHANDSAFETY, newHEALTHANDSAFETY, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHEALTHANDSAFETY(HealthAndSafety newHEALTHANDSAFETY) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__HEALTHANDSAFETY, newHEALTHANDSAFETY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Housekeeping getHOUSEKEEPING() {
		return (Housekeeping)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__HOUSEKEEPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHOUSEKEEPING(Housekeeping newHOUSEKEEPING, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__HOUSEKEEPING, newHOUSEKEEPING, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHOUSEKEEPING(Housekeeping newHOUSEKEEPING) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__HOUSEKEEPING, newHOUSEKEEPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitChecker getLIMITCHECKER() {
		return (LimitChecker)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__LIMITCHECKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLIMITCHECKER(LimitChecker newLIMITCHECKER, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__LIMITCHECKER, newLIMITCHECKER, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLIMITCHECKER(LimitChecker newLIMITCHECKER) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__LIMITCHECKER, newLIMITCHECKER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryDwell getMEMORYDWELL() {
		return (MemoryDwell)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYDWELL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEMORYDWELL(MemoryDwell newMEMORYDWELL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYDWELL, newMEMORYDWELL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMEMORYDWELL(MemoryDwell newMEMORYDWELL) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYDWELL, newMEMORYDWELL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryManagement getMEMORYMANAGEMENT() {
		return (MemoryManagement)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYMANAGEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEMORYMANAGEMENT(MemoryManagement newMEMORYMANAGEMENT, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYMANAGEMENT, newMEMORYMANAGEMENT, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMEMORYMANAGEMENT(MemoryManagement newMEMORYMANAGEMENT) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYMANAGEMENT, newMEMORYMANAGEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getSCHEDULER() {
		return (Scheduler)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__SCHEDULER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCHEDULER(Scheduler newSCHEDULER, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__SCHEDULER, newSCHEDULER, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCHEDULER(Scheduler newSCHEDULER) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__SCHEDULER, newSCHEDULER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredCommanding getSTOREDCOMMANDING() {
		return (StoredCommanding)getMixed().get(CfsPackage.Literals.DOCUMENT_ROOT__STOREDCOMMANDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTOREDCOMMANDING(StoredCommanding newSTOREDCOMMANDING, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CfsPackage.Literals.DOCUMENT_ROOT__STOREDCOMMANDING, newSTOREDCOMMANDING, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTOREDCOMMANDING(StoredCommanding newSTOREDCOMMANDING) {
		((FeatureMap.Internal)getMixed()).set(CfsPackage.Literals.DOCUMENT_ROOT__STOREDCOMMANDING, newSTOREDCOMMANDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CfsPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CfsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CfsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CfsPackage.DOCUMENT_ROOT__CFDPFILETRANSFER:
				return basicSetCFDPFILETRANSFER(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__CHECKSUM:
				return basicSetCHECKSUM(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__DATASTORAGE:
				return basicSetDATASTORAGE(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__FILEMANAGER:
				return basicSetFILEMANAGER(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__HEALTHANDSAFETY:
				return basicSetHEALTHANDSAFETY(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__HOUSEKEEPING:
				return basicSetHOUSEKEEPING(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__LIMITCHECKER:
				return basicSetLIMITCHECKER(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__MEMORYDWELL:
				return basicSetMEMORYDWELL(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__MEMORYMANAGEMENT:
				return basicSetMEMORYMANAGEMENT(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__SCHEDULER:
				return basicSetSCHEDULER(null, msgs);
			case CfsPackage.DOCUMENT_ROOT__STOREDCOMMANDING:
				return basicSetSTOREDCOMMANDING(null, msgs);
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
			case CfsPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CfsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CfsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CfsPackage.DOCUMENT_ROOT__CFDPFILETRANSFER:
				return getCFDPFILETRANSFER();
			case CfsPackage.DOCUMENT_ROOT__CHECKSUM:
				return getCHECKSUM();
			case CfsPackage.DOCUMENT_ROOT__DATASTORAGE:
				return getDATASTORAGE();
			case CfsPackage.DOCUMENT_ROOT__FILEMANAGER:
				return getFILEMANAGER();
			case CfsPackage.DOCUMENT_ROOT__HEALTHANDSAFETY:
				return getHEALTHANDSAFETY();
			case CfsPackage.DOCUMENT_ROOT__HOUSEKEEPING:
				return getHOUSEKEEPING();
			case CfsPackage.DOCUMENT_ROOT__LIMITCHECKER:
				return getLIMITCHECKER();
			case CfsPackage.DOCUMENT_ROOT__MEMORYDWELL:
				return getMEMORYDWELL();
			case CfsPackage.DOCUMENT_ROOT__MEMORYMANAGEMENT:
				return getMEMORYMANAGEMENT();
			case CfsPackage.DOCUMENT_ROOT__SCHEDULER:
				return getSCHEDULER();
			case CfsPackage.DOCUMENT_ROOT__STOREDCOMMANDING:
				return getSTOREDCOMMANDING();
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
			case CfsPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__CFDPFILETRANSFER:
				setCFDPFILETRANSFER((CfdpFileTransfer)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__CHECKSUM:
				setCHECKSUM((Checksum)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__DATASTORAGE:
				setDATASTORAGE((DataStorage)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__FILEMANAGER:
				setFILEMANAGER((FileManager)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__HEALTHANDSAFETY:
				setHEALTHANDSAFETY((HealthAndSafety)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__HOUSEKEEPING:
				setHOUSEKEEPING((Housekeeping)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__LIMITCHECKER:
				setLIMITCHECKER((LimitChecker)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__MEMORYDWELL:
				setMEMORYDWELL((MemoryDwell)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__MEMORYMANAGEMENT:
				setMEMORYMANAGEMENT((MemoryManagement)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__SCHEDULER:
				setSCHEDULER((Scheduler)newValue);
				return;
			case CfsPackage.DOCUMENT_ROOT__STOREDCOMMANDING:
				setSTOREDCOMMANDING((StoredCommanding)newValue);
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
			case CfsPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CfsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CfsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CfsPackage.DOCUMENT_ROOT__CFDPFILETRANSFER:
				setCFDPFILETRANSFER((CfdpFileTransfer)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__CHECKSUM:
				setCHECKSUM((Checksum)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__DATASTORAGE:
				setDATASTORAGE((DataStorage)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__FILEMANAGER:
				setFILEMANAGER((FileManager)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__HEALTHANDSAFETY:
				setHEALTHANDSAFETY((HealthAndSafety)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__HOUSEKEEPING:
				setHOUSEKEEPING((Housekeeping)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__LIMITCHECKER:
				setLIMITCHECKER((LimitChecker)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__MEMORYDWELL:
				setMEMORYDWELL((MemoryDwell)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__MEMORYMANAGEMENT:
				setMEMORYMANAGEMENT((MemoryManagement)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__SCHEDULER:
				setSCHEDULER((Scheduler)null);
				return;
			case CfsPackage.DOCUMENT_ROOT__STOREDCOMMANDING:
				setSTOREDCOMMANDING((StoredCommanding)null);
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
			case CfsPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CfsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CfsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CfsPackage.DOCUMENT_ROOT__CFDPFILETRANSFER:
				return getCFDPFILETRANSFER() != null;
			case CfsPackage.DOCUMENT_ROOT__CHECKSUM:
				return getCHECKSUM() != null;
			case CfsPackage.DOCUMENT_ROOT__DATASTORAGE:
				return getDATASTORAGE() != null;
			case CfsPackage.DOCUMENT_ROOT__FILEMANAGER:
				return getFILEMANAGER() != null;
			case CfsPackage.DOCUMENT_ROOT__HEALTHANDSAFETY:
				return getHEALTHANDSAFETY() != null;
			case CfsPackage.DOCUMENT_ROOT__HOUSEKEEPING:
				return getHOUSEKEEPING() != null;
			case CfsPackage.DOCUMENT_ROOT__LIMITCHECKER:
				return getLIMITCHECKER() != null;
			case CfsPackage.DOCUMENT_ROOT__MEMORYDWELL:
				return getMEMORYDWELL() != null;
			case CfsPackage.DOCUMENT_ROOT__MEMORYMANAGEMENT:
				return getMEMORYMANAGEMENT() != null;
			case CfsPackage.DOCUMENT_ROOT__SCHEDULER:
				return getSCHEDULER() != null;
			case CfsPackage.DOCUMENT_ROOT__STOREDCOMMANDING:
				return getSTOREDCOMMANDING() != null;
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
