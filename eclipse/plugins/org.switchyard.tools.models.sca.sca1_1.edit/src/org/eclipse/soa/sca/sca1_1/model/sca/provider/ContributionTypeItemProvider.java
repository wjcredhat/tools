/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.ContributionType;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.soa.sca.sca1_1.model.sca.ContributionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContributionTypeItemProvider
	extends CommonExtensionBaseItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ScaPackage.eINSTANCE.getContributionType_Deployable());
			childrenFeatures.add(ScaPackage.eINSTANCE.getContributionType_ImportBaseGroup());
			childrenFeatures.add(ScaPackage.eINSTANCE.getContributionType_ExportBaseGroup());
			childrenFeatures.add(ScaPackage.eINSTANCE.getContributionType_Any());
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
	 * This returns ContributionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContributionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ContributionType_type");
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

		switch (notification.getFeatureID(ContributionType.class)) {
			case ScaPackage.CONTRIBUTION_TYPE__DEPLOYABLE:
			case ScaPackage.CONTRIBUTION_TYPE__IMPORT_BASE_GROUP:
			case ScaPackage.CONTRIBUTION_TYPE__EXPORT_BASE_GROUP:
			case ScaPackage.CONTRIBUTION_TYPE__ANY:
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
				(ScaPackage.eINSTANCE.getContributionType_Deployable(),
				 ScaFactory.eINSTANCE.createDeployableType()));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ImportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Import(),
					 ScaFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ImportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImportC(),
					 ScaFactory.eINSTANCE.createCImport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ImportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImportCpp(),
					 ScaFactory.eINSTANCE.createCPPImport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ImportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImportJava(),
					 ScaFactory.eINSTANCE.createJavaImportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ExportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Export(),
					 ScaFactory.eINSTANCE.createExportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ExportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ExportC(),
					 ScaFactory.eINSTANCE.createCExport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ExportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ExportCpp(),
					 ScaFactory.eINSTANCE.createCPPExport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_ExportBaseGroup(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ExportJava(),
					 ScaFactory.eINSTANCE.createJavaExportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FROM,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA,
					 AddressingFactory.eINSTANCE.createMetadataType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION,
					 AddressingFactory.eINSTANCE.createProblemActionType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME,
					 AddressingFactory.eINSTANCE.createAttributedQNameType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS,
					 AddressingFactory.eINSTANCE.createReferenceParametersType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO,
					 AddressingFactory.eINSTANCE.createRelatesToType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER,
					 AddressingFactory.eINSTANCE.createAttributedUnsignedLongType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getContributionType_Any(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__TO,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));
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
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ACTION ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FROM ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
