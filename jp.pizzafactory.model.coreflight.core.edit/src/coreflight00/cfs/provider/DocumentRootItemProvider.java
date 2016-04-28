/**
 */
package coreflight00.cfs.provider;


import coreflight00.cfs.CfsFactory;
import coreflight00.cfs.CfsPackage;
import coreflight00.cfs.DocumentRoot;

import coreflight00.provider.CoreflightEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link coreflight00.cfs.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__CFDPFILETRANSFER);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__CHECKSUM);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__DATASTORAGE);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__FILEMANAGER);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__HEALTHANDSAFETY);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__HOUSEKEEPING);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__LIMITCHECKER);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYDWELL);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYMANAGEMENT);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__SCHEDULER);
			childrenFeatures.add(CfsPackage.Literals.DOCUMENT_ROOT__STOREDCOMMANDING);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case CfsPackage.DOCUMENT_ROOT__CFDPFILETRANSFER:
			case CfsPackage.DOCUMENT_ROOT__CHECKSUM:
			case CfsPackage.DOCUMENT_ROOT__DATASTORAGE:
			case CfsPackage.DOCUMENT_ROOT__FILEMANAGER:
			case CfsPackage.DOCUMENT_ROOT__HEALTHANDSAFETY:
			case CfsPackage.DOCUMENT_ROOT__HOUSEKEEPING:
			case CfsPackage.DOCUMENT_ROOT__LIMITCHECKER:
			case CfsPackage.DOCUMENT_ROOT__MEMORYDWELL:
			case CfsPackage.DOCUMENT_ROOT__MEMORYMANAGEMENT:
			case CfsPackage.DOCUMENT_ROOT__SCHEDULER:
			case CfsPackage.DOCUMENT_ROOT__STOREDCOMMANDING:
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
				(CfsPackage.Literals.DOCUMENT_ROOT__CFDPFILETRANSFER,
				 CfsFactory.eINSTANCE.createCfdpFileTransfer()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__CHECKSUM,
				 CfsFactory.eINSTANCE.createChecksum()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__DATASTORAGE,
				 CfsFactory.eINSTANCE.createDataStorage()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__FILEMANAGER,
				 CfsFactory.eINSTANCE.createFileManager()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__HEALTHANDSAFETY,
				 CfsFactory.eINSTANCE.createHealthAndSafety()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__HOUSEKEEPING,
				 CfsFactory.eINSTANCE.createHousekeeping()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__LIMITCHECKER,
				 CfsFactory.eINSTANCE.createLimitChecker()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYDWELL,
				 CfsFactory.eINSTANCE.createMemoryDwell()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__MEMORYMANAGEMENT,
				 CfsFactory.eINSTANCE.createMemoryManagement()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__SCHEDULER,
				 CfsFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(CfsPackage.Literals.DOCUMENT_ROOT__STOREDCOMMANDING,
				 CfsFactory.eINSTANCE.createStoredCommanding()));
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
