/**
 */
package openDictator.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import openDictator.EvaluationOperator;
import openDictator.JsonQuery;
import openDictator.OpenDictatorPackage;
import openDictator.Statement;
import openDictator.Value;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openDictator.impl.StatementImpl#getEvaluationOperator <em>Evaluation Operator</em>}</li>
 *   <li>{@link openDictator.impl.StatementImpl#getPrefixEvaluationOperator <em>Prefix Evaluation Operator</em>}</li>
 *   <li>{@link openDictator.impl.StatementImpl#getJsonquery <em>Jsonquery</em>}</li>
 *   <li>{@link openDictator.impl.StatementImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement {
	/**
	 * The default value of the '{@link #getEvaluationOperator() <em>Evaluation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationOperator EVALUATION_OPERATOR_EDEFAULT = EvaluationOperator.FORSOME;

	/**
	 * The cached value of the '{@link #getEvaluationOperator() <em>Evaluation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationOperator()
	 * @generated
	 * @ordered
	 */
	protected EvaluationOperator evaluationOperator = EVALUATION_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrefixEvaluationOperator() <em>Prefix Evaluation Operator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixEvaluationOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationOperator> prefixEvaluationOperator;

	/**
	 * The cached value of the '{@link #getJsonquery() <em>Jsonquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsonquery()
	 * @generated
	 * @ordered
	 */
	protected JsonQuery jsonquery;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenDictatorPackage.Literals.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvaluationOperator getEvaluationOperator() {
		return evaluationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvaluationOperator(EvaluationOperator newEvaluationOperator) {
		EvaluationOperator oldEvaluationOperator = evaluationOperator;
		evaluationOperator = newEvaluationOperator == null ? EVALUATION_OPERATOR_EDEFAULT : newEvaluationOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.STATEMENT__EVALUATION_OPERATOR,
					oldEvaluationOperator, evaluationOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvaluationOperator> getPrefixEvaluationOperator() {
		if (prefixEvaluationOperator == null) {
			prefixEvaluationOperator = new EDataTypeUniqueEList<EvaluationOperator>(EvaluationOperator.class, this,
					OpenDictatorPackage.STATEMENT__PREFIX_EVALUATION_OPERATOR);
		}
		return prefixEvaluationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonQuery getJsonquery() {
		return jsonquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsonquery(JsonQuery newJsonquery, NotificationChain msgs) {
		JsonQuery oldJsonquery = jsonquery;
		jsonquery = newJsonquery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OpenDictatorPackage.STATEMENT__JSONQUERY, oldJsonquery, newJsonquery);
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
	public void setJsonquery(JsonQuery newJsonquery) {
		if (newJsonquery != jsonquery) {
			NotificationChain msgs = null;
			if (jsonquery != null)
				msgs = ((InternalEObject) jsonquery).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.STATEMENT__JSONQUERY, null, msgs);
			if (newJsonquery != null)
				msgs = ((InternalEObject) newJsonquery).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.STATEMENT__JSONQUERY, null, msgs);
			msgs = basicSetJsonquery(newJsonquery, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.STATEMENT__JSONQUERY,
					newJsonquery, newJsonquery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OpenDictatorPackage.STATEMENT__VALUE, oldValue, newValue);
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
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.STATEMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OpenDictatorPackage.STATEMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.STATEMENT__VALUE, newValue,
					newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean evaluate() {
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
		case OpenDictatorPackage.STATEMENT__JSONQUERY:
			return basicSetJsonquery(null, msgs);
		case OpenDictatorPackage.STATEMENT__VALUE:
			return basicSetValue(null, msgs);
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
		case OpenDictatorPackage.STATEMENT__EVALUATION_OPERATOR:
			return getEvaluationOperator();
		case OpenDictatorPackage.STATEMENT__PREFIX_EVALUATION_OPERATOR:
			return getPrefixEvaluationOperator();
		case OpenDictatorPackage.STATEMENT__JSONQUERY:
			return getJsonquery();
		case OpenDictatorPackage.STATEMENT__VALUE:
			return getValue();
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
		case OpenDictatorPackage.STATEMENT__EVALUATION_OPERATOR:
			setEvaluationOperator((EvaluationOperator) newValue);
			return;
		case OpenDictatorPackage.STATEMENT__PREFIX_EVALUATION_OPERATOR:
			getPrefixEvaluationOperator().clear();
			getPrefixEvaluationOperator().addAll((Collection<? extends EvaluationOperator>) newValue);
			return;
		case OpenDictatorPackage.STATEMENT__JSONQUERY:
			setJsonquery((JsonQuery) newValue);
			return;
		case OpenDictatorPackage.STATEMENT__VALUE:
			setValue((Value) newValue);
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
		case OpenDictatorPackage.STATEMENT__EVALUATION_OPERATOR:
			setEvaluationOperator(EVALUATION_OPERATOR_EDEFAULT);
			return;
		case OpenDictatorPackage.STATEMENT__PREFIX_EVALUATION_OPERATOR:
			getPrefixEvaluationOperator().clear();
			return;
		case OpenDictatorPackage.STATEMENT__JSONQUERY:
			setJsonquery((JsonQuery) null);
			return;
		case OpenDictatorPackage.STATEMENT__VALUE:
			setValue((Value) null);
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
		case OpenDictatorPackage.STATEMENT__EVALUATION_OPERATOR:
			return evaluationOperator != EVALUATION_OPERATOR_EDEFAULT;
		case OpenDictatorPackage.STATEMENT__PREFIX_EVALUATION_OPERATOR:
			return prefixEvaluationOperator != null && !prefixEvaluationOperator.isEmpty();
		case OpenDictatorPackage.STATEMENT__JSONQUERY:
			return jsonquery != null;
		case OpenDictatorPackage.STATEMENT__VALUE:
			return value != null;
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
		case OpenDictatorPackage.STATEMENT___EVALUATE:
			return evaluate();
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
		result.append(" (evaluationOperator: ");
		result.append(evaluationOperator);
		result.append(", prefixEvaluationOperator: ");
		result.append(prefixEvaluationOperator);
		result.append(')');
		return result.toString();
	}

} //StatementImpl
