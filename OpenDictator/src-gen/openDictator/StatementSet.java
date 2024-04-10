/**
 */
package openDictator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openDictator.StatementSet#getStatementOperator <em>Statement Operator</em>}</li>
 *   <li>{@link openDictator.StatementSet#getStatementset <em>Statementset</em>}</li>
 *   <li>{@link openDictator.StatementSet#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see openDictator.OpenDictatorPackage#getStatementSet()
 * @model
 * @generated
 */
public interface StatementSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link openDictator.StatementOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Operator</em>' attribute.
	 * @see openDictator.StatementOperator
	 * @see #setStatementOperator(StatementOperator)
	 * @see openDictator.OpenDictatorPackage#getStatementSet_StatementOperator()
	 * @model required="true"
	 * @generated
	 */
	StatementOperator getStatementOperator();

	/**
	 * Sets the value of the '{@link openDictator.StatementSet#getStatementOperator <em>Statement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Operator</em>' attribute.
	 * @see openDictator.StatementOperator
	 * @see #getStatementOperator()
	 * @generated
	 */
	void setStatementOperator(StatementOperator value);

	/**
	 * Returns the value of the '<em><b>Statementset</b></em>' containment reference list.
	 * The list contents are of type {@link openDictator.StatementSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statementset</em>' containment reference list.
	 * @see openDictator.OpenDictatorPackage#getStatementSet_Statementset()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatementSet> getStatementset();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link openDictator.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see openDictator.OpenDictatorPackage#getStatementSet_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // StatementSet
