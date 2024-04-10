/**
 */
package openDictator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openDictator.Policy#getStatementset <em>Statementset</em>}</li>
 *   <li>{@link openDictator.Policy#getInputfile <em>Inputfile</em>}</li>
 *   <li>{@link openDictator.Policy#getFailureMessage <em>Failure Message</em>}</li>
 *   <li>{@link openDictator.Policy#getSuccessMessage <em>Success Message</em>}</li>
 *   <li>{@link openDictator.Policy#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see openDictator.OpenDictatorPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject {
	/**
	 * Returns the value of the '<em><b>Statementset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statementset</em>' containment reference.
	 * @see #setStatementset(StatementSet)
	 * @see openDictator.OpenDictatorPackage#getPolicy_Statementset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatementSet getStatementset();

	/**
	 * Sets the value of the '{@link openDictator.Policy#getStatementset <em>Statementset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statementset</em>' containment reference.
	 * @see #getStatementset()
	 * @generated
	 */
	void setStatementset(StatementSet value);

	/**
	 * Returns the value of the '<em><b>Inputfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputfile</em>' containment reference.
	 * @see #setInputfile(InputFile)
	 * @see openDictator.OpenDictatorPackage#getPolicy_Inputfile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputFile getInputfile();

	/**
	 * Sets the value of the '{@link openDictator.Policy#getInputfile <em>Inputfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputfile</em>' containment reference.
	 * @see #getInputfile()
	 * @generated
	 */
	void setInputfile(InputFile value);

	/**
	 * Returns the value of the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Message</em>' attribute.
	 * @see #setFailureMessage(String)
	 * @see openDictator.OpenDictatorPackage#getPolicy_FailureMessage()
	 * @model required="true"
	 * @generated
	 */
	String getFailureMessage();

	/**
	 * Sets the value of the '{@link openDictator.Policy#getFailureMessage <em>Failure Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Message</em>' attribute.
	 * @see #getFailureMessage()
	 * @generated
	 */
	void setFailureMessage(String value);

	/**
	 * Returns the value of the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Message</em>' attribute.
	 * @see #setSuccessMessage(String)
	 * @see openDictator.OpenDictatorPackage#getPolicy_SuccessMessage()
	 * @model required="true"
	 * @generated
	 */
	String getSuccessMessage();

	/**
	 * Sets the value of the '{@link openDictator.Policy#getSuccessMessage <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Message</em>' attribute.
	 * @see #getSuccessMessage()
	 * @generated
	 */
	void setSuccessMessage(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see openDictator.OpenDictatorPackage#getPolicy_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link openDictator.Policy#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // Policy
