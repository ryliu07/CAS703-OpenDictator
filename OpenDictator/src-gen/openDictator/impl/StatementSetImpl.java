/**
 */
package openDictator.impl;

import java.util.Collection;

import openDictator.OpenDictatorPackage;
import openDictator.Statement;
import openDictator.StatementOperator;
import openDictator.StatementSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openDictator.impl.StatementSetImpl#getStatementOperator <em>Statement Operator</em>}</li>
 *   <li>{@link openDictator.impl.StatementSetImpl#getStatementset <em>Statementset</em>}</li>
 *   <li>{@link openDictator.impl.StatementSetImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementSetImpl extends MinimalEObjectImpl.Container implements StatementSet {
	/**
	 * The default value of the '{@link #getStatementOperator() <em>Statement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOperator()
	 * @generated
	 * @ordered
	 */
	protected static final StatementOperator STATEMENT_OPERATOR_EDEFAULT = StatementOperator.AND;

	/**
	 * The cached value of the '{@link #getStatementOperator() <em>Statement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOperator()
	 * @generated
	 * @ordered
	 */
	protected StatementOperator statementOperator = STATEMENT_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatementset() <em>Statementset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementset()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementSet> statementset;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenDictatorPackage.Literals.STATEMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatementOperator getStatementOperator() {
		return statementOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatementOperator(StatementOperator newStatementOperator) {
		StatementOperator oldStatementOperator = statementOperator;
		statementOperator = newStatementOperator == null ? STATEMENT_OPERATOR_EDEFAULT : newStatementOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.STATEMENT_SET__STATEMENT_OPERATOR,
					oldStatementOperator, statementOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StatementSet> getStatementset() {
		if (statementset == null) {
			statementset = new EObjectContainmentEList<StatementSet>(StatementSet.class, this,
					OpenDictatorPackage.STATEMENT_SET__STATEMENTSET);
		}
		return statementset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this,
					OpenDictatorPackage.STATEMENT_SET__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OpenDictatorPackage.STATEMENT_SET__STATEMENTSET:
			return ((InternalEList<?>) getStatementset()).basicRemove(otherEnd, msgs);
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd, msgs);
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
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT_OPERATOR:
			return getStatementOperator();
		case OpenDictatorPackage.STATEMENT_SET__STATEMENTSET:
			return getStatementset();
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT:
			return getStatement();
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
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT_OPERATOR:
			setStatementOperator((StatementOperator) newValue);
			return;
		case OpenDictatorPackage.STATEMENT_SET__STATEMENTSET:
			getStatementset().clear();
			getStatementset().addAll((Collection<? extends StatementSet>) newValue);
			return;
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends Statement>) newValue);
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
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT_OPERATOR:
			setStatementOperator(STATEMENT_OPERATOR_EDEFAULT);
			return;
		case OpenDictatorPackage.STATEMENT_SET__STATEMENTSET:
			getStatementset().clear();
			return;
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT:
			getStatement().clear();
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
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT_OPERATOR:
			return statementOperator != STATEMENT_OPERATOR_EDEFAULT;
		case OpenDictatorPackage.STATEMENT_SET__STATEMENTSET:
			return statementset != null && !statementset.isEmpty();
		case OpenDictatorPackage.STATEMENT_SET__STATEMENT:
			return statement != null && !statement.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (statementOperator: ");
		result.append(statementOperator);
		result.append(')');
		return result.toString();
	}

} //StatementSetImpl
