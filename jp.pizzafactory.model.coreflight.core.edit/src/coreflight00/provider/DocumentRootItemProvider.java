/**
 */
package coreflight00.provider;


import coreflight00.Coreflight00Factory;
import coreflight00.Coreflight00Package;
import coreflight00.DocumentRoot;

import coreflight00.cfe.CfeFactory;

import coreflight00.cfs.CfsFactory;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link coreflight00.DocumentRoot} object.
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

			addApplicationRefPropertyDescriptor(object);
			addShortNamePropertyDescriptor(object);
			addUuidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Application Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_applicationRef_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_applicationRef_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION_REF,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_shortName_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_shortName_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 Coreflight00Package.Literals.DOCUMENT_ROOT__SHORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_uuid_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_uuid_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 Coreflight00Package.Literals.DOCUMENT_ROOT__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION);
			childrenFeatures.add(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATIONS);
			childrenFeatures.add(Coreflight00Package.Literals.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER);
			childrenFeatures.add(Coreflight00Package.Literals.DOCUMENT_ROOT__PUBLISHER);
			childrenFeatures.add(Coreflight00Package.Literals.DOCUMENT_ROOT__SUBSCRIBER);
			childrenFeatures.add(Coreflight00Package.Literals.DOCUMENT_ROOT__SYSTEM);
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
		QName labelValue = ((DocumentRoot)object).getShortName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") : //$NON-NLS-1$
			getString("_UI_DocumentRoot_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION_REF:
			case Coreflight00Package.DOCUMENT_ROOT__SHORT_NAME:
			case Coreflight00Package.DOCUMENT_ROOT__UUID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATION:
			case Coreflight00Package.DOCUMENT_ROOT__APPLICATIONS:
			case Coreflight00Package.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER:
			case Coreflight00Package.DOCUMENT_ROOT__PUBLISHER:
			case Coreflight00Package.DOCUMENT_ROOT__SUBSCRIBER:
			case Coreflight00Package.DOCUMENT_ROOT__SYSTEM:
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
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 Coreflight00Factory.eINSTANCE.createApplication()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfeFactory.eINSTANCE.createEventServices()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfeFactory.eINSTANCE.createExecutiveServices()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfeFactory.eINSTANCE.createSoftwareBus()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfeFactory.eINSTANCE.createTableServices()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfeFactory.eINSTANCE.createTimeServices()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createCfdpFileTransfer()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createChecksum()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createDataStorage()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createFileManager()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createHealthAndSafety()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createHousekeeping()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createLimitChecker()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createMemoryDwell()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createMemoryManagement()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATION,
				 CfsFactory.eINSTANCE.createStoredCommanding()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__APPLICATIONS,
				 Coreflight00Factory.eINSTANCE.createApplications()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__INTER_TASK_MESSAGE_ROUTER,
				 Coreflight00Factory.eINSTANCE.createInterTaskMessageRouter()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__PUBLISHER,
				 Coreflight00Factory.eINSTANCE.createPublisher()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__SUBSCRIBER,
				 Coreflight00Factory.eINSTANCE.createSubscriber()));

		newChildDescriptors.add
			(createChildParameter
				(Coreflight00Package.Literals.DOCUMENT_ROOT__SYSTEM,
				 Coreflight00Factory.eINSTANCE.createSystem()));
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
