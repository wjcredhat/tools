/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.bpm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.soa.sca.sca1_1.model.sca.CommonExtensionBase;
import org.eclipse.soa.sca.sca1_1.model.sca.ExtendableType;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.switchyard.tools.models.switchyard1_0.bpm.*;
import org.switchyard.tools.models.switchyard1_0.commonrules.AuditType1;
import org.switchyard.tools.models.switchyard1_0.commonrules.CommonImplementationType;

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
 * @see org.switchyard.tools.models.switchyard1_0.bpm.BPMPackage
 * @generated
 */
public class BPMSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static BPMPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BPMSwitch() {
        if (modelPackage == null) {
            modelPackage = BPMPackage.eINSTANCE;
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
            case BPMPackage.ACTION_TYPE1: {
                ActionType1 actionType1 = (ActionType1)theEObject;
                T result = caseActionType1(actionType1);
                if (result == null) result = caseCommonExtensionBase(actionType1);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.AUDIT_TYPE: {
                AuditType auditType = (AuditType)theEObject;
                T result = caseAuditType(auditType);
                if (result == null) result = caseAuditType1(auditType);
                if (result == null) result = caseCommonExtensionBase(auditType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.BPM_IMPLEMENTATION_TYPE: {
                BPMImplementationType bpmImplementationType = (BPMImplementationType)theEObject;
                T result = caseBPMImplementationType(bpmImplementationType);
                if (result == null) result = caseCommonImplementationType(bpmImplementationType);
                if (result == null) result = caseImplementation(bpmImplementationType);
                if (result == null) result = caseCommonExtensionBase(bpmImplementationType);
                if (result == null) result = caseExtendableType(bpmImplementationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.DOCUMENT_ROOT: {
                DocumentRoot documentRoot = (DocumentRoot)theEObject;
                T result = caseDocumentRoot(documentRoot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.MAPPING_TYPE: {
                MappingType mappingType = (MappingType)theEObject;
                T result = caseMappingType(mappingType);
                if (result == null) result = caseCommonRules_MappingType(mappingType);
                if (result == null) result = caseCommonExtensionBase(mappingType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.PARAMETERS_TYPE: {
                ParametersType parametersType = (ParametersType)theEObject;
                T result = caseParametersType(parametersType);
                if (result == null) result = caseCommonExtensionBase(parametersType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.RESOURCE_TYPE: {
                ResourceType resourceType = (ResourceType)theEObject;
                T result = caseResourceType(resourceType);
                if (result == null) result = caseSwitchyard_ResourceType(resourceType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.RESULTS_TYPE: {
                ResultsType resultsType = (ResultsType)theEObject;
                T result = caseResultsType(resultsType);
                if (result == null) result = caseCommonExtensionBase(resultsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.TASK_HANDLER_TYPE: {
                TaskHandlerType taskHandlerType = (TaskHandlerType)theEObject;
                T result = caseTaskHandlerType(taskHandlerType);
                if (result == null) result = caseCommonExtensionBase(taskHandlerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BPMPackage.EVENT_LISTENER_TYPE: {
                EventListenerType eventListenerType = (EventListenerType)theEObject;
                T result = caseEventListenerType(eventListenerType);
                if (result == null) result = caseCommonRules_EventListenerType(eventListenerType);
                if (result == null) result = caseCommonExtensionBase(eventListenerType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Action Type1</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action Type1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseActionType1(ActionType1 object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Audit Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Audit Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAuditType(AuditType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBPMImplementationType(BPMImplementationType object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMappingType(MappingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParametersType(ParametersType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResourceType(ResourceType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Results Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Results Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseResultsType(ResultsType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Task Handler Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Task Handler Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTaskHandlerType(TaskHandlerType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Event Listener Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Listener Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEventListenerType(EventListenerType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Common Extension Base</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonExtensionBase(CommonExtensionBase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Audit Type1</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Audit Type1</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuditType1(AuditType1 object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extendable Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extendable Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtendableType(ExtendableType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseImplementation(Implementation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Common Implementation Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Common Implementation Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonImplementationType(CommonImplementationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mapping Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonRules_MappingType(org.switchyard.tools.models.switchyard1_0.commonrules.MappingType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSwitchyard_ResourceType(org.switchyard.tools.models.switchyard1_0.switchyard.ResourceType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event Listener Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event Listener Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommonRules_EventListenerType(org.switchyard.tools.models.switchyard1_0.commonrules.EventListenerType object) {
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

} //BPMSwitch
