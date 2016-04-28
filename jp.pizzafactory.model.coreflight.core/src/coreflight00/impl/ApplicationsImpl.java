/**
 */
package coreflight00.impl;

import coreflight00.Application;
import coreflight00.Applications;
import coreflight00.Coreflight00Package;
import coreflight00.cfe.EventServices;
import coreflight00.cfe.ExecutiveServices;
import coreflight00.cfe.SoftwareBus;
import coreflight00.cfe.TableServices;
import coreflight00.cfe.TimeServices;
import coreflight00.cfs.CfdpFileTransfer;
import coreflight00.cfs.Checksum;
import coreflight00.cfs.DataStorage;
import coreflight00.cfs.FileManager;
import coreflight00.cfs.HealthAndSafety;
import coreflight00.cfs.Housekeeping;
import coreflight00.cfs.LimitChecker;
import coreflight00.cfs.MemoryDwell;
import coreflight00.cfs.MemoryManagement;
import coreflight00.cfs.Scheduler;
import coreflight00.cfs.StoredCommanding;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getEVENTSERVICES <em>EVENTSERVICES</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getEXECUTIVESERVICES <em>EXECUTIVESERVICES</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getSOFTWAREBUS <em>SOFTWAREBUS</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getTABLESERVICES <em>TABLESERVICES</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getTIMESERVICES <em>TIMESERVICES</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getCFDPFILETRANSFER <em>CFDPFILETRANSFER</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getCHECKSUM <em>CHECKSUM</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getDATASTORAGE <em>DATASTORAGE</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getFILEMANAGER <em>FILEMANAGER</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getHEALTHANDSAFETY <em>HEALTHANDSAFETY</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getHOUSEKEEPING <em>HOUSEKEEPING</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getLIMITCHECKER <em>LIMITCHECKER</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getMEMORYDWELL <em>MEMORYDWELL</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getMEMORYMANAGEMENT <em>MEMORYMANAGEMENT</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getSCHEDULER <em>SCHEDULER</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getSTOREDCOMMANDING <em>STOREDCOMMANDING</em>}</li>
 *   <li>{@link coreflight00.impl.ApplicationsImpl#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationsImpl extends MinimalEObjectImpl.Container implements Applications {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Coreflight00Package.Literals.APPLICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Coreflight00Package.APPLICATIONS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventServices> getEVENTSERVICES() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__EVENTSERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutiveServices> getEXECUTIVESERVICES() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__EXECUTIVESERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareBus> getSOFTWAREBUS() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__SOFTWAREBUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableServices> getTABLESERVICES() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__TABLESERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeServices> getTIMESERVICES() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__TIMESERVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CfdpFileTransfer> getCFDPFILETRANSFER() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__CFDPFILETRANSFER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Checksum> getCHECKSUM() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__CHECKSUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStorage> getDATASTORAGE() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__DATASTORAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileManager> getFILEMANAGER() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__FILEMANAGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealthAndSafety> getHEALTHANDSAFETY() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__HEALTHANDSAFETY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Housekeeping> getHOUSEKEEPING() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__HOUSEKEEPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LimitChecker> getLIMITCHECKER() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__LIMITCHECKER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryDwell> getMEMORYDWELL() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__MEMORYDWELL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryManagement> getMEMORYMANAGEMENT() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__MEMORYMANAGEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scheduler> getSCHEDULER() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__SCHEDULER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoredCommanding> getSTOREDCOMMANDING() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__STOREDCOMMANDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Application> getApplication() {
		return getGroup().list(Coreflight00Package.Literals.APPLICATIONS__APPLICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Coreflight00Package.APPLICATIONS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__EVENTSERVICES:
				return ((InternalEList<?>)getEVENTSERVICES()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__EXECUTIVESERVICES:
				return ((InternalEList<?>)getEXECUTIVESERVICES()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__SOFTWAREBUS:
				return ((InternalEList<?>)getSOFTWAREBUS()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__TABLESERVICES:
				return ((InternalEList<?>)getTABLESERVICES()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__TIMESERVICES:
				return ((InternalEList<?>)getTIMESERVICES()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__CFDPFILETRANSFER:
				return ((InternalEList<?>)getCFDPFILETRANSFER()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__CHECKSUM:
				return ((InternalEList<?>)getCHECKSUM()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__DATASTORAGE:
				return ((InternalEList<?>)getDATASTORAGE()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__FILEMANAGER:
				return ((InternalEList<?>)getFILEMANAGER()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__HEALTHANDSAFETY:
				return ((InternalEList<?>)getHEALTHANDSAFETY()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__HOUSEKEEPING:
				return ((InternalEList<?>)getHOUSEKEEPING()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__LIMITCHECKER:
				return ((InternalEList<?>)getLIMITCHECKER()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__MEMORYDWELL:
				return ((InternalEList<?>)getMEMORYDWELL()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__MEMORYMANAGEMENT:
				return ((InternalEList<?>)getMEMORYMANAGEMENT()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__SCHEDULER:
				return ((InternalEList<?>)getSCHEDULER()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__STOREDCOMMANDING:
				return ((InternalEList<?>)getSTOREDCOMMANDING()).basicRemove(otherEnd, msgs);
			case Coreflight00Package.APPLICATIONS__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
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
			case Coreflight00Package.APPLICATIONS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Coreflight00Package.APPLICATIONS__EVENTSERVICES:
				return getEVENTSERVICES();
			case Coreflight00Package.APPLICATIONS__EXECUTIVESERVICES:
				return getEXECUTIVESERVICES();
			case Coreflight00Package.APPLICATIONS__SOFTWAREBUS:
				return getSOFTWAREBUS();
			case Coreflight00Package.APPLICATIONS__TABLESERVICES:
				return getTABLESERVICES();
			case Coreflight00Package.APPLICATIONS__TIMESERVICES:
				return getTIMESERVICES();
			case Coreflight00Package.APPLICATIONS__CFDPFILETRANSFER:
				return getCFDPFILETRANSFER();
			case Coreflight00Package.APPLICATIONS__CHECKSUM:
				return getCHECKSUM();
			case Coreflight00Package.APPLICATIONS__DATASTORAGE:
				return getDATASTORAGE();
			case Coreflight00Package.APPLICATIONS__FILEMANAGER:
				return getFILEMANAGER();
			case Coreflight00Package.APPLICATIONS__HEALTHANDSAFETY:
				return getHEALTHANDSAFETY();
			case Coreflight00Package.APPLICATIONS__HOUSEKEEPING:
				return getHOUSEKEEPING();
			case Coreflight00Package.APPLICATIONS__LIMITCHECKER:
				return getLIMITCHECKER();
			case Coreflight00Package.APPLICATIONS__MEMORYDWELL:
				return getMEMORYDWELL();
			case Coreflight00Package.APPLICATIONS__MEMORYMANAGEMENT:
				return getMEMORYMANAGEMENT();
			case Coreflight00Package.APPLICATIONS__SCHEDULER:
				return getSCHEDULER();
			case Coreflight00Package.APPLICATIONS__STOREDCOMMANDING:
				return getSTOREDCOMMANDING();
			case Coreflight00Package.APPLICATIONS__APPLICATION:
				return getApplication();
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
			case Coreflight00Package.APPLICATIONS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Coreflight00Package.APPLICATIONS__EVENTSERVICES:
				getEVENTSERVICES().clear();
				getEVENTSERVICES().addAll((Collection<? extends EventServices>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__EXECUTIVESERVICES:
				getEXECUTIVESERVICES().clear();
				getEXECUTIVESERVICES().addAll((Collection<? extends ExecutiveServices>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__SOFTWAREBUS:
				getSOFTWAREBUS().clear();
				getSOFTWAREBUS().addAll((Collection<? extends SoftwareBus>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__TABLESERVICES:
				getTABLESERVICES().clear();
				getTABLESERVICES().addAll((Collection<? extends TableServices>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__TIMESERVICES:
				getTIMESERVICES().clear();
				getTIMESERVICES().addAll((Collection<? extends TimeServices>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__CFDPFILETRANSFER:
				getCFDPFILETRANSFER().clear();
				getCFDPFILETRANSFER().addAll((Collection<? extends CfdpFileTransfer>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__CHECKSUM:
				getCHECKSUM().clear();
				getCHECKSUM().addAll((Collection<? extends Checksum>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__DATASTORAGE:
				getDATASTORAGE().clear();
				getDATASTORAGE().addAll((Collection<? extends DataStorage>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__FILEMANAGER:
				getFILEMANAGER().clear();
				getFILEMANAGER().addAll((Collection<? extends FileManager>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__HEALTHANDSAFETY:
				getHEALTHANDSAFETY().clear();
				getHEALTHANDSAFETY().addAll((Collection<? extends HealthAndSafety>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__HOUSEKEEPING:
				getHOUSEKEEPING().clear();
				getHOUSEKEEPING().addAll((Collection<? extends Housekeeping>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__LIMITCHECKER:
				getLIMITCHECKER().clear();
				getLIMITCHECKER().addAll((Collection<? extends LimitChecker>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__MEMORYDWELL:
				getMEMORYDWELL().clear();
				getMEMORYDWELL().addAll((Collection<? extends MemoryDwell>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__MEMORYMANAGEMENT:
				getMEMORYMANAGEMENT().clear();
				getMEMORYMANAGEMENT().addAll((Collection<? extends MemoryManagement>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__SCHEDULER:
				getSCHEDULER().clear();
				getSCHEDULER().addAll((Collection<? extends Scheduler>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__STOREDCOMMANDING:
				getSTOREDCOMMANDING().clear();
				getSTOREDCOMMANDING().addAll((Collection<? extends StoredCommanding>)newValue);
				return;
			case Coreflight00Package.APPLICATIONS__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends Application>)newValue);
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
			case Coreflight00Package.APPLICATIONS__GROUP:
				getGroup().clear();
				return;
			case Coreflight00Package.APPLICATIONS__EVENTSERVICES:
				getEVENTSERVICES().clear();
				return;
			case Coreflight00Package.APPLICATIONS__EXECUTIVESERVICES:
				getEXECUTIVESERVICES().clear();
				return;
			case Coreflight00Package.APPLICATIONS__SOFTWAREBUS:
				getSOFTWAREBUS().clear();
				return;
			case Coreflight00Package.APPLICATIONS__TABLESERVICES:
				getTABLESERVICES().clear();
				return;
			case Coreflight00Package.APPLICATIONS__TIMESERVICES:
				getTIMESERVICES().clear();
				return;
			case Coreflight00Package.APPLICATIONS__CFDPFILETRANSFER:
				getCFDPFILETRANSFER().clear();
				return;
			case Coreflight00Package.APPLICATIONS__CHECKSUM:
				getCHECKSUM().clear();
				return;
			case Coreflight00Package.APPLICATIONS__DATASTORAGE:
				getDATASTORAGE().clear();
				return;
			case Coreflight00Package.APPLICATIONS__FILEMANAGER:
				getFILEMANAGER().clear();
				return;
			case Coreflight00Package.APPLICATIONS__HEALTHANDSAFETY:
				getHEALTHANDSAFETY().clear();
				return;
			case Coreflight00Package.APPLICATIONS__HOUSEKEEPING:
				getHOUSEKEEPING().clear();
				return;
			case Coreflight00Package.APPLICATIONS__LIMITCHECKER:
				getLIMITCHECKER().clear();
				return;
			case Coreflight00Package.APPLICATIONS__MEMORYDWELL:
				getMEMORYDWELL().clear();
				return;
			case Coreflight00Package.APPLICATIONS__MEMORYMANAGEMENT:
				getMEMORYMANAGEMENT().clear();
				return;
			case Coreflight00Package.APPLICATIONS__SCHEDULER:
				getSCHEDULER().clear();
				return;
			case Coreflight00Package.APPLICATIONS__STOREDCOMMANDING:
				getSTOREDCOMMANDING().clear();
				return;
			case Coreflight00Package.APPLICATIONS__APPLICATION:
				getApplication().clear();
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
			case Coreflight00Package.APPLICATIONS__GROUP:
				return group != null && !group.isEmpty();
			case Coreflight00Package.APPLICATIONS__EVENTSERVICES:
				return !getEVENTSERVICES().isEmpty();
			case Coreflight00Package.APPLICATIONS__EXECUTIVESERVICES:
				return !getEXECUTIVESERVICES().isEmpty();
			case Coreflight00Package.APPLICATIONS__SOFTWAREBUS:
				return !getSOFTWAREBUS().isEmpty();
			case Coreflight00Package.APPLICATIONS__TABLESERVICES:
				return !getTABLESERVICES().isEmpty();
			case Coreflight00Package.APPLICATIONS__TIMESERVICES:
				return !getTIMESERVICES().isEmpty();
			case Coreflight00Package.APPLICATIONS__CFDPFILETRANSFER:
				return !getCFDPFILETRANSFER().isEmpty();
			case Coreflight00Package.APPLICATIONS__CHECKSUM:
				return !getCHECKSUM().isEmpty();
			case Coreflight00Package.APPLICATIONS__DATASTORAGE:
				return !getDATASTORAGE().isEmpty();
			case Coreflight00Package.APPLICATIONS__FILEMANAGER:
				return !getFILEMANAGER().isEmpty();
			case Coreflight00Package.APPLICATIONS__HEALTHANDSAFETY:
				return !getHEALTHANDSAFETY().isEmpty();
			case Coreflight00Package.APPLICATIONS__HOUSEKEEPING:
				return !getHOUSEKEEPING().isEmpty();
			case Coreflight00Package.APPLICATIONS__LIMITCHECKER:
				return !getLIMITCHECKER().isEmpty();
			case Coreflight00Package.APPLICATIONS__MEMORYDWELL:
				return !getMEMORYDWELL().isEmpty();
			case Coreflight00Package.APPLICATIONS__MEMORYMANAGEMENT:
				return !getMEMORYMANAGEMENT().isEmpty();
			case Coreflight00Package.APPLICATIONS__SCHEDULER:
				return !getSCHEDULER().isEmpty();
			case Coreflight00Package.APPLICATIONS__STOREDCOMMANDING:
				return !getSTOREDCOMMANDING().isEmpty();
			case Coreflight00Package.APPLICATIONS__APPLICATION:
				return !getApplication().isEmpty();
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ApplicationsImpl
