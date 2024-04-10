/**
 */
package openDictator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openDictator.Statement#getEvaluationOperator <em>Evaluation Operator</em>}</li>
 *   <li>{@link openDictator.Statement#getPrefixEvaluationOperator <em>Prefix Evaluation Operator</em>}</li>
 *   <li>{@link openDictator.Statement#getJsonquery <em>Jsonquery</em>}</li>
 *   <li>{@link openDictator.Statement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see openDictator.OpenDictatorPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link openDictator.EvaluationOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Operator</em>' attribute.
	 * @see openDictator.EvaluationOperator
	 * @see #setEvaluationOperator(EvaluationOperator)
	 * @see openDictator.OpenDictatorPackage#getStatement_EvaluationOperator()
	 * @model required="true"
	 * @generated
	 */
	EvaluationOperator getEvaluationOperator();

	/**
	 * Sets the value of the '{@link openDictator.Statement#getEvaluationOperator <em>Evaluation Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Operator</em>' attribute.
	 * @see openDictator.EvaluationOperator
	 * @see #getEvaluationOperator()
	 * @generated
	 */
	void setEvaluationOperator(EvaluationOperator value);

	/**
	 * Returns the value of the '<em><b>Prefix Evaluation Operator</b></em>' attribute list.
	 * The list contents are of type {@link openDictator.EvaluationOperator}.
	 * The literals are from the enumeration {@link openDictator.EvaluationOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Evaluation Operator</em>' attribute list.
	 * @see openDictator.EvaluationOperator
	 * @see openDictator.OpenDictatorPackage#getStatement_PrefixEvaluationOperator()
	 * @model upper="2"
	 * @generated
	 */
	EList<EvaluationOperator> getPrefixEvaluationOperator();

	/**
	 * Returns the value of the '<em><b>Jsonquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsonquery</em>' containment reference.
	 * @see #setJsonquery(JsonQuery)
	 * @see openDictator.OpenDictatorPackage#getStatement_Jsonquery()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JsonQuery getJsonquery();

	/**
	 * Sets the value of the '{@link openDictator.Statement#getJsonquery <em>Jsonquery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsonquery</em>' containment reference.
	 * @see #getJsonquery()
	 * @generated
	 */
	void setJsonquery(JsonQuery value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see openDictator.OpenDictatorPackage#getStatement_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link openDictator.Statement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluate();

} // Statement
