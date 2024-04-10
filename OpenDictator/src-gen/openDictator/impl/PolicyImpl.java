/**
 */
package openDictator.impl;

import java.lang.reflect.InvocationTargetException;
import openDictator.InputFile;
import openDictator.OpenDictatorPackage;
import openDictator.Policy;
import openDictator.StatementSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openDictator.impl.PolicyImpl#getStatementset <em>Statementset</em>}</li>
 *   <li>{@link openDictator.impl.PolicyImpl#getInputfile <em>Inputfile</em>}</li>
 *   <li>{@link openDictator.impl.PolicyImpl#getFailureMessage <em>Failure Message</em>}</li>
 *   <li>{@link openDictator.impl.PolicyImpl#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link openDictator.impl.PolicyImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy {
	/**
	 * The cached value of the '{@link #getStatementset() <em>Statementset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementset()
	 * @generated
	 * @ordered
	 */
	protected StatementSet statementset;
	/**
	 * The cached value of the '{@link #getInputfile() <em>Inputfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputfile()
	 * @generated
	 * @ordered
	 */
	protected InputFile inputfile;

	/**
	 * The default value of the '{@link #getFailureMessage() <em>Failure Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFailureMessage() <em>Failure Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMessage()
	 * @generated
	 * @ordered
	 */
	protected String failureMessage = FAILURE_MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSuccessMessage() <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSuccessMessage() <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessMessage()
	 * @generated
	 * @ordered
	 */
	protected String successMessage = SUCCESS_MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenDictatorPackage.Literals.POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatementSet getStatementset() {
		return statementset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatementset(StatementSet newStatementset, NotificationChain msgs) {
		StatementSet oldStatementset = statementset;
		statementset = newStatementset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OpenDictatorPackage.POLICY__STATEMENTSET, oldStatementset, newStatementset);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatementset(StatementSet newStatementset) {
		if (newStatementset != statementset) {
			NotificationChain msgs = null;
			if (statementset != null)
				msgs = ((InternalEObject) statementset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.POLICY__STATEMENTSET, null, msgs);
			if (newStatementset != null)
				msgs = ((InternalEObject) newStatementset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.POLICY__STATEMENTSET, null, msgs);
			msgs = basicSetStatementset(newStatementset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.POLICY__STATEMENTSET,
					newStatementset, newStatementset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputFile getInputfile() {
		return inputfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputfile(InputFile newInputfile, NotificationChain msgs) {
		InputFile oldInputfile = inputfile;
		inputfile = newInputfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OpenDictatorPackage.POLICY__INPUTFILE, oldInputfile, newInputfile);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputfile(InputFile newInputfile) {
		if (newInputfile != inputfile) {
			NotificationChain msgs = null;
			if (inputfile != null)
				msgs = ((InternalEObject) inputfile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.POLICY__INPUTFILE, null, msgs);
			if (newInputfile != null)
				msgs = ((InternalEObject) newInputfile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.POLICY__INPUTFILE, null, msgs);
			msgs = basicSetInputfile(newInputfile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.POLICY__INPUTFILE, newInputfile,
					newInputfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFailureMessage() {
		return failureMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureMessage(String newFailureMessage) {
		String oldFailureMessage = failureMessage;
		failureMessage = newFailureMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.POLICY__FAILURE_MESSAGE,
					oldFailureMessage, failureMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuccessMessage() {
		return successMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessMessage(String newSuccessMessage) {
		String oldSuccessMessage = successMessage;
		successMessage = newSuccessMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.POLICY__SUCCESS_MESSAGE,
					oldSuccessMessage, successMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.POLICY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void evaluate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OpenDictatorPackage.POLICY__STATEMENTSET:
			return basicSetStatementset(null, msgs);
		case OpenDictatorPackage.POLICY__INPUTFILE:
			return basicSetInputfile(null, msgs);
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
		case OpenDictatorPackage.POLICY__STATEMENTSET:
			return getStatementset();
		case OpenDictatorPackage.POLICY__INPUTFILE:
			return getInputfile();
		case OpenDictatorPackage.POLICY__FAILURE_MESSAGE:
			return getFailureMessage();
		case OpenDictatorPackage.POLICY__SUCCESS_MESSAGE:
			return getSuccessMessage();
		case OpenDictatorPackage.POLICY__ID:
			return getId();
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
		case OpenDictatorPackage.POLICY__STATEMENTSET:
			setStatementset((StatementSet) newValue);
			return;
		case OpenDictatorPackage.POLICY__INPUTFILE:
			setInputfile((InputFile) newValue);
			return;
		case OpenDictatorPackage.POLICY__FAILURE_MESSAGE:
			setFailureMessage((String) newValue);
			return;
		case OpenDictatorPackage.POLICY__SUCCESS_MESSAGE:
			setSuccessMessage((String) newValue);
			return;
		case OpenDictatorPackage.POLICY__ID:
			setId((String) newValue);
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
		case OpenDictatorPackage.POLICY__STATEMENTSET:
			setStatementset((StatementSet) null);
			return;
		case OpenDictatorPackage.POLICY__INPUTFILE:
			setInputfile((InputFile) null);
			return;
		case OpenDictatorPackage.POLICY__FAILURE_MESSAGE:
			setFailureMessage(FAILURE_MESSAGE_EDEFAULT);
			return;
		case OpenDictatorPackage.POLICY__SUCCESS_MESSAGE:
			setSuccessMessage(SUCCESS_MESSAGE_EDEFAULT);
			return;
		case OpenDictatorPackage.POLICY__ID:
			setId(ID_EDEFAULT);
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
		case OpenDictatorPackage.POLICY__STATEMENTSET:
			return statementset != null;
		case OpenDictatorPackage.POLICY__INPUTFILE:
			return inputfile != null;
		case OpenDictatorPackage.POLICY__FAILURE_MESSAGE:
			return FAILURE_MESSAGE_EDEFAULT == null ? failureMessage != null
					: !FAILURE_MESSAGE_EDEFAULT.equals(failureMessage);
		case OpenDictatorPackage.POLICY__SUCCESS_MESSAGE:
			return SUCCESS_MESSAGE_EDEFAULT == null ? successMessage != null
					: !SUCCESS_MESSAGE_EDEFAULT.equals(successMessage);
		case OpenDictatorPackage.POLICY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case OpenDictatorPackage.POLICY___EVALUATE:
			evaluate();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (FailureMessage: ");
		result.append(failureMessage);
		result.append(", SuccessMessage: ");
		result.append(successMessage);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PolicyImpl
