/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.http.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.http.HttpBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpContextMapperType;
import org.switchyard.tools.models.switchyard1_0.http.HttpMessageComposerType;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;

import org.switchyard.tools.models.switchyard1_0.switchyard.impl.SwitchYardBindingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl#getHttpContextMapper <em>Http Context Mapper</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.http.impl.HttpBindingTypeImpl#getHttpMessageComposer <em>Http Message Composer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpBindingTypeImpl extends SwitchYardBindingTypeImpl implements HttpBindingType {
    /**
     * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextPath()
     * @generated
     * @ordered
     */
    protected String contextPath = CONTEXT_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected static final String ADDRESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAddress()
     * @generated
     * @ordered
     */
    protected String address = ADDRESS_EDEFAULT;

    /**
     * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected static final String METHOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected String method = METHOD_EDEFAULT;

    /**
     * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContentType()
     * @generated
     * @ordered
     */
    protected static final String CONTENT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContentType()
     * @generated
     * @ordered
     */
    protected String contentType = CONTENT_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getHttpContextMapper() <em>Http Context Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHttpContextMapper()
     * @generated
     * @ordered
     */
    protected HttpContextMapperType httpContextMapper;

    /**
     * The cached value of the '{@link #getHttpMessageComposer() <em>Http Message Composer</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHttpMessageComposer()
     * @generated
     * @ordered
     */
    protected HttpMessageComposerType httpMessageComposer;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HttpBindingTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return HttpPackage.Literals.HTTP_BINDING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContextPath() {
        return contextPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextPath(String newContextPath) {
        String oldContextPath = contextPath;
        contextPath = newContextPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH, oldContextPath, contextPath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAddress(String newAddress) {
        String oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__ADDRESS, oldAddress, address));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMethod() {
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMethod(String newMethod) {
        String oldMethod = method;
        method = newMethod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__METHOD, oldMethod, method));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContentType(String newContentType) {
        String oldContentType = contentType;
        contentType = newContentType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE, oldContentType, contentType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpContextMapperType getHttpContextMapper() {
        return httpContextMapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHttpContextMapper(HttpContextMapperType newHttpContextMapper, NotificationChain msgs) {
        HttpContextMapperType oldHttpContextMapper = httpContextMapper;
        httpContextMapper = newHttpContextMapper;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER, oldHttpContextMapper, newHttpContextMapper);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHttpContextMapper(HttpContextMapperType newHttpContextMapper) {
        if (newHttpContextMapper != httpContextMapper) {
            NotificationChain msgs = null;
            if (httpContextMapper != null)
                msgs = ((InternalEObject)httpContextMapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER, null, msgs);
            if (newHttpContextMapper != null)
                msgs = ((InternalEObject)newHttpContextMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER, null, msgs);
            msgs = basicSetHttpContextMapper(newHttpContextMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER, newHttpContextMapper, newHttpContextMapper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HttpMessageComposerType getHttpMessageComposer() {
        return httpMessageComposer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHttpMessageComposer(HttpMessageComposerType newHttpMessageComposer, NotificationChain msgs) {
        HttpMessageComposerType oldHttpMessageComposer = httpMessageComposer;
        httpMessageComposer = newHttpMessageComposer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER, oldHttpMessageComposer, newHttpMessageComposer);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHttpMessageComposer(HttpMessageComposerType newHttpMessageComposer) {
        if (newHttpMessageComposer != httpMessageComposer) {
            NotificationChain msgs = null;
            if (httpMessageComposer != null)
                msgs = ((InternalEObject)httpMessageComposer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER, null, msgs);
            if (newHttpMessageComposer != null)
                msgs = ((InternalEObject)newHttpMessageComposer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER, null, msgs);
            msgs = basicSetHttpMessageComposer(newHttpMessageComposer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER, newHttpMessageComposer, newHttpMessageComposer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER:
                return basicSetHttpContextMapper(null, msgs);
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER:
                return basicSetHttpMessageComposer(null, msgs);
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                return getContextPath();
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                return getAddress();
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                return getMethod();
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                return getContentType();
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER:
                return getHttpContextMapper();
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER:
                return getHttpMessageComposer();
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                setAddress((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                setMethod((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                setContentType((String)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER:
                setHttpContextMapper((HttpContextMapperType)newValue);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER:
                setHttpMessageComposer((HttpMessageComposerType)newValue);
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                setContextPath(CONTEXT_PATH_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                setAddress(ADDRESS_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                setMethod(METHOD_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                setContentType(CONTENT_TYPE_EDEFAULT);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER:
                setHttpContextMapper((HttpContextMapperType)null);
                return;
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER:
                setHttpMessageComposer((HttpMessageComposerType)null);
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
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
                return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
                return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
                return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_CONTEXT_MAPPER:
                return httpContextMapper != null;
            case HttpPackage.HTTP_BINDING_TYPE__HTTP_MESSAGE_COMPOSER:
                return httpMessageComposer != null;
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
        result.append(" (contextPath: ");
        result.append(contextPath);
        result.append(", address: ");
        result.append(address);
        result.append(", method: ");
        result.append(method);
        result.append(", contentType: ");
        result.append(contentType);
        result.append(')');
        return result.toString();
    }

    @Override
    public EStructuralFeature getDocumentFeature() {
        return HttpPackageImpl.eINSTANCE.getDocumentRoot_BindingHTTP();
    }
} //HttpBindingTypeImpl
