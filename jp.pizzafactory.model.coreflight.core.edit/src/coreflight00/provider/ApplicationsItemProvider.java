/**
 */
package coreflight00.provider;


import coreflight00.Applications;
import coreflight00.Coreflight00Factory;
import coreflight00.Coreflight00Package;

import coreflight00.cfe.CfeFactory;

import coreflight00.cfs.CfsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link coreflight00.Applications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Coreflight00Package.Literals.APPLICATIONS__GROUP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Applications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Applications")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Applications_type"); //$NON-NLS-1$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Applications.class)) {
			case Coreflight00Package.APPLICATIONS__GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__EVENTSERVICES,
					 CfeFactory.eINSTANCE.createEventServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__EXECUTIVESERVICES,
					 CfeFactory.eINSTANCE.createExecutiveServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__SOFTWAREBUS,
					 CfeFactory.eINSTANCE.createSoftwareBus())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__TABLESERVICES,
					 CfeFactory.eINSTANCE.createTableServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__TIMESERVICES,
					 CfeFactory.eINSTANCE.createTimeServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__CFDPFILETRANSFER,
					 CfsFactory.eINSTANCE.createCfdpFileTransfer())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__CHECKSUM,
					 CfsFactory.eINSTANCE.createChecksum())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__DATASTORAGE,
					 CfsFactory.eINSTANCE.createDataStorage())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__FILEMANAGER,
					 CfsFactory.eINSTANCE.createFileManager())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__HEALTHANDSAFETY,
					 CfsFactory.eINSTANCE.createHealthAndSafety())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__HOUSEKEEPING,
					 CfsFactory.eINSTANCE.createHousekeeping())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__LIMITCHECKER,
					 CfsFactory.eINSTANCE.createLimitChecker())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__MEMORYDWELL,
					 CfsFactory.eINSTANCE.createMemoryDwell())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__MEMORYMANAGEMENT,
					 CfsFactory.eINSTANCE.createMemoryManagement())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__SCHEDULER,
					 CfsFactory.eINSTANCE.createScheduler())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__STOREDCOMMANDING,
					 CfsFactory.eINSTANCE.createStoredCommanding())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 Coreflight00Factory.eINSTANCE.createApplication())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfeFactory.eINSTANCE.createEventServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfeFactory.eINSTANCE.createExecutiveServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfeFactory.eINSTANCE.createSoftwareBus())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfeFactory.eINSTANCE.createTableServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfeFactory.eINSTANCE.createTimeServices())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createCfdpFileTransfer())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createChecksum())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createDataStorage())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createFileManager())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createHealthAndSafety())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createHousekeeping())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createLimitChecker())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createMemoryDwell())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createMemoryManagement())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createScheduler())));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.APPLICATIONS__GROUP,
				 FeatureMapUtil.createEntry
					(Coreflight00Package.Literals.APPLICATIONS__APPLICATION,
					 CfsFactory.eINSTANCE.createStoredCommanding())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == Coreflight00Package.Literals.APPLICATIONS__EVENTSERVICES ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__APPLICATION ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__EXECUTIVESERVICES ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__SOFTWAREBUS ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__TABLESERVICES ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__TIMESERVICES ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__CFDPFILETRANSFER ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__CHECKSUM ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__DATASTORAGE ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__FILEMANAGER ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__HEALTHANDSAFETY ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__HOUSEKEEPING ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__LIMITCHECKER ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__MEMORYDWELL ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__MEMORYMANAGEMENT ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__SCHEDULER ||
			childFeature == Coreflight00Package.Literals.APPLICATIONS__STOREDCOMMANDING;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CoreflightEditPlugin.INSTANCE;
	}

}
