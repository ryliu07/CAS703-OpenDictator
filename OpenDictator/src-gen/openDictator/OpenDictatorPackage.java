/**
 */
package openDictator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see openDictator.OpenDictatorFactory
 * @model kind="package"
 * @generated
 */
public interface OpenDictatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openDictator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/openDictator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openDictator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenDictatorPackage eINSTANCE = openDictator.impl.OpenDictatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link openDictator.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.impl.PolicyImpl
	 * @see openDictator.impl.OpenDictatorPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 0;

	/**
	 * The feature id for the '<em><b>Statementset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__STATEMENTSET = 0;

	/**
	 * The feature id for the '<em><b>Inputfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__INPUTFILE = 1;

	/**
	 * The feature id for the '<em><b>Failure Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__FAILURE_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__SUCCESS_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__ID = 4;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY___EVALUATE = 0;

	/**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link openDictator.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.impl.StatementImpl
	 * @see openDictator.impl.OpenDictatorPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Evaluation Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__EVALUATION_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Prefix Evaluation Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PREFIX_EVALUATION_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Jsonquery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__JSONQUERY = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT___EVALUATE = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link openDictator.impl.JsonQueryImpl <em>Json Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.impl.JsonQueryImpl
	 * @see openDictator.impl.OpenDictatorPackageImpl#getJsonQuery()
	 * @generated
	 */
	int JSON_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_QUERY__QUERY_STRING = 0;

	/**
	 * The number of structural features of the '<em>Json Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_QUERY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_QUERY___EVALUATE = 0;

	/**
	 * The number of operations of the '<em>Json Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_QUERY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link openDictator.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.impl.ValueImpl
	 * @see openDictator.impl.OpenDictatorPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openDictator.impl.InputFileImpl <em>Input File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.impl.InputFileImpl
	 * @see openDictator.impl.OpenDictatorPackageImpl#getInputFile()
	 * @generated
	 */
	int INPUT_FILE = 5;

	/**
	 * The meta object id for the '{@link openDictator.impl.StatementSetImpl <em>Statement Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.impl.StatementSetImpl
	 * @see openDictator.impl.OpenDictatorPackageImpl#getStatementSet()
	 * @generated
	 */
	int STATEMENT_SET = 4;

	/**
	 * The feature id for the '<em><b>Statement Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SET__STATEMENT_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Statementset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SET__STATEMENTSET = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SET__STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Statement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_SET_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__FILE_LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Input File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openDictator.StatementOperator <em>Statement Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.StatementOperator
	 * @see openDictator.impl.OpenDictatorPackageImpl#getStatementOperator()
	 * @generated
	 */
	int STATEMENT_OPERATOR = 6;

	/**
	 * The meta object id for the '{@link openDictator.EvaluationOperator <em>Evaluation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openDictator.EvaluationOperator
	 * @see openDictator.impl.OpenDictatorPackageImpl#getEvaluationOperator()
	 * @generated
	 */
	int EVALUATION_OPERATOR = 7;

	/**
	 * Returns the meta object for class '{@link openDictator.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see openDictator.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link openDictator.Policy#getStatementset <em>Statementset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statementset</em>'.
	 * @see openDictator.Policy#getStatementset()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Statementset();

	/**
	 * Returns the meta object for the containment reference '{@link openDictator.Policy#getInputfile <em>Inputfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputfile</em>'.
	 * @see openDictator.Policy#getInputfile()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Inputfile();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.Policy#getFailureMessage <em>Failure Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Message</em>'.
	 * @see openDictator.Policy#getFailureMessage()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_FailureMessage();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.Policy#getSuccessMessage <em>Success Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Message</em>'.
	 * @see openDictator.Policy#getSuccessMessage()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_SuccessMessage();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.Policy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see openDictator.Policy#getId()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Id();

	/**
	 * Returns the meta object for the '{@link openDictator.Policy#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see openDictator.Policy#evaluate()
	 * @generated
	 */
	EOperation getPolicy__Evaluate();

	/**
	 * Returns the meta object for class '{@link openDictator.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see openDictator.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.Statement#getEvaluationOperator <em>Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Operator</em>'.
	 * @see openDictator.Statement#getEvaluationOperator()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_EvaluationOperator();

	/**
	 * Returns the meta object for the attribute list '{@link openDictator.Statement#getPrefixEvaluationOperator <em>Prefix Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prefix Evaluation Operator</em>'.
	 * @see openDictator.Statement#getPrefixEvaluationOperator()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_PrefixEvaluationOperator();

	/**
	 * Returns the meta object for the containment reference '{@link openDictator.Statement#getJsonquery <em>Jsonquery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jsonquery</em>'.
	 * @see openDictator.Statement#getJsonquery()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Jsonquery();

	/**
	 * Returns the meta object for the containment reference '{@link openDictator.Statement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see openDictator.Statement#getValue()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Value();

	/**
	 * Returns the meta object for the '{@link openDictator.Statement#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see openDictator.Statement#evaluate()
	 * @generated
	 */
	EOperation getStatement__Evaluate();

	/**
	 * Returns the meta object for class '{@link openDictator.JsonQuery <em>Json Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Query</em>'.
	 * @see openDictator.JsonQuery
	 * @generated
	 */
	EClass getJsonQuery();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.JsonQuery#getQueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query String</em>'.
	 * @see openDictator.JsonQuery#getQueryString()
	 * @see #getJsonQuery()
	 * @generated
	 */
	EAttribute getJsonQuery_QueryString();

	/**
	 * Returns the meta object for the '{@link openDictator.JsonQuery#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see openDictator.JsonQuery#evaluate()
	 * @generated
	 */
	EOperation getJsonQuery__Evaluate();

	/**
	 * Returns the meta object for class '{@link openDictator.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see openDictator.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.Value#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see openDictator.Value#getType()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see openDictator.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for class '{@link openDictator.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input File</em>'.
	 * @see openDictator.InputFile
	 * @generated
	 */
	EClass getInputFile();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.InputFile#getFileLocation <em>File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Location</em>'.
	 * @see openDictator.InputFile#getFileLocation()
	 * @see #getInputFile()
	 * @generated
	 */
	EAttribute getInputFile_FileLocation();

	/**
	 * Returns the meta object for class '{@link openDictator.StatementSet <em>Statement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Set</em>'.
	 * @see openDictator.StatementSet
	 * @generated
	 */
	EClass getStatementSet();

	/**
	 * Returns the meta object for the attribute '{@link openDictator.StatementSet#getStatementOperator <em>Statement Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Operator</em>'.
	 * @see openDictator.StatementSet#getStatementOperator()
	 * @see #getStatementSet()
	 * @generated
	 */
	EAttribute getStatementSet_StatementOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link openDictator.StatementSet#getStatementset <em>Statementset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statementset</em>'.
	 * @see openDictator.StatementSet#getStatementset()
	 * @see #getStatementSet()
	 * @generated
	 */
	EReference getStatementSet_Statementset();

	/**
	 * Returns the meta object for the containment reference list '{@link openDictator.StatementSet#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see openDictator.StatementSet#getStatement()
	 * @see #getStatementSet()
	 * @generated
	 */
	EReference getStatementSet_Statement();

	/**
	 * Returns the meta object for enum '{@link openDictator.StatementOperator <em>Statement Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statement Operator</em>'.
	 * @see openDictator.StatementOperator
	 * @generated
	 */
	EEnum getStatementOperator();

	/**
	 * Returns the meta object for enum '{@link openDictator.EvaluationOperator <em>Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Operator</em>'.
	 * @see openDictator.EvaluationOperator
	 * @generated
	 */
	EEnum getEvaluationOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenDictatorFactory getOpenDictatorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link openDictator.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.impl.PolicyImpl
		 * @see openDictator.impl.OpenDictatorPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Statementset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__STATEMENTSET = eINSTANCE.getPolicy_Statementset();

		/**
		 * The meta object literal for the '<em><b>Inputfile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__INPUTFILE = eINSTANCE.getPolicy_Inputfile();

		/**
		 * The meta object literal for the '<em><b>Failure Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__FAILURE_MESSAGE = eINSTANCE.getPolicy_FailureMessage();

		/**
		 * The meta object literal for the '<em><b>Success Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__SUCCESS_MESSAGE = eINSTANCE.getPolicy_SuccessMessage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__ID = eINSTANCE.getPolicy_Id();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY___EVALUATE = eINSTANCE.getPolicy__Evaluate();

		/**
		 * The meta object literal for the '{@link openDictator.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.impl.StatementImpl
		 * @see openDictator.impl.OpenDictatorPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Evaluation Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__EVALUATION_OPERATOR = eINSTANCE.getStatement_EvaluationOperator();

		/**
		 * The meta object literal for the '<em><b>Prefix Evaluation Operator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__PREFIX_EVALUATION_OPERATOR = eINSTANCE.getStatement_PrefixEvaluationOperator();

		/**
		 * The meta object literal for the '<em><b>Jsonquery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__JSONQUERY = eINSTANCE.getStatement_Jsonquery();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__VALUE = eINSTANCE.getStatement_Value();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATEMENT___EVALUATE = eINSTANCE.getStatement__Evaluate();

		/**
		 * The meta object literal for the '{@link openDictator.impl.JsonQueryImpl <em>Json Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.impl.JsonQueryImpl
		 * @see openDictator.impl.OpenDictatorPackageImpl#getJsonQuery()
		 * @generated
		 */
		EClass JSON_QUERY = eINSTANCE.getJsonQuery();

		/**
		 * The meta object literal for the '<em><b>Query String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_QUERY__QUERY_STRING = eINSTANCE.getJsonQuery_QueryString();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JSON_QUERY___EVALUATE = eINSTANCE.getJsonQuery__Evaluate();

		/**
		 * The meta object literal for the '{@link openDictator.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.impl.ValueImpl
		 * @see openDictator.impl.OpenDictatorPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__TYPE = eINSTANCE.getValue_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '{@link openDictator.impl.InputFileImpl <em>Input File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.impl.InputFileImpl
		 * @see openDictator.impl.OpenDictatorPackageImpl#getInputFile()
		 * @generated
		 */
		EClass INPUT_FILE = eINSTANCE.getInputFile();

		/**
		 * The meta object literal for the '<em><b>File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_FILE__FILE_LOCATION = eINSTANCE.getInputFile_FileLocation();

		/**
		 * The meta object literal for the '{@link openDictator.impl.StatementSetImpl <em>Statement Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.impl.StatementSetImpl
		 * @see openDictator.impl.OpenDictatorPackageImpl#getStatementSet()
		 * @generated
		 */
		EClass STATEMENT_SET = eINSTANCE.getStatementSet();

		/**
		 * The meta object literal for the '<em><b>Statement Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_SET__STATEMENT_OPERATOR = eINSTANCE.getStatementSet_StatementOperator();

		/**
		 * The meta object literal for the '<em><b>Statementset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_SET__STATEMENTSET = eINSTANCE.getStatementSet_Statementset();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_SET__STATEMENT = eINSTANCE.getStatementSet_Statement();

		/**
		 * The meta object literal for the '{@link openDictator.StatementOperator <em>Statement Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.StatementOperator
		 * @see openDictator.impl.OpenDictatorPackageImpl#getStatementOperator()
		 * @generated
		 */
		EEnum STATEMENT_OPERATOR = eINSTANCE.getStatementOperator();

		/**
		 * The meta object literal for the '{@link openDictator.EvaluationOperator <em>Evaluation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openDictator.EvaluationOperator
		 * @see openDictator.impl.OpenDictatorPackageImpl#getEvaluationOperator()
		 * @generated
		 */
		EEnum EVALUATION_OPERATOR = eINSTANCE.getEvaluationOperator();

	}

} //OpenDictatorPackage
