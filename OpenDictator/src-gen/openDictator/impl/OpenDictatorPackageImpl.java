/**
 */
package openDictator.impl;

import openDictator.EvaluationOperator;
import openDictator.InputFile;
import openDictator.JsonQuery;
import openDictator.OpenDictatorFactory;
import openDictator.OpenDictatorPackage;
import openDictator.Policy;
import openDictator.Statement;
import openDictator.StatementOperator;
import openDictator.StatementSet;
import openDictator.Value;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenDictatorPackageImpl extends EPackageImpl implements OpenDictatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statementOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see openDictator.OpenDictatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenDictatorPackageImpl() {
		super(eNS_URI, OpenDictatorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenDictatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenDictatorPackage init() {
		if (isInited)
			return (OpenDictatorPackage) EPackage.Registry.INSTANCE.getEPackage(OpenDictatorPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenDictatorPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenDictatorPackageImpl theOpenDictatorPackage = registeredOpenDictatorPackage instanceof OpenDictatorPackageImpl
				? (OpenDictatorPackageImpl) registeredOpenDictatorPackage
				: new OpenDictatorPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOpenDictatorPackage.createPackageContents();

		// Initialize created meta-data
		theOpenDictatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenDictatorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenDictatorPackage.eNS_URI, theOpenDictatorPackage);
		return theOpenDictatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicy_Statementset() {
		return (EReference) policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicy_Inputfile() {
		return (EReference) policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_FailureMessage() {
		return (EAttribute) policyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_SuccessMessage() {
		return (EAttribute) policyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolicy_Id() {
		return (EAttribute) policyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPolicy__Evaluate() {
		return policyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatement_EvaluationOperator() {
		return (EAttribute) statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatement_PrefixEvaluationOperator() {
		return (EAttribute) statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatement_Jsonquery() {
		return (EReference) statementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatement_Value() {
		return (EReference) statementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatement__Evaluate() {
		return statementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJsonQuery() {
		return jsonQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJsonQuery_QueryString() {
		return (EAttribute) jsonQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJsonQuery__Evaluate() {
		return jsonQueryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_Type() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValue_Value() {
		return (EAttribute) valueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputFile() {
		return inputFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputFile_FileLocation() {
		return (EAttribute) inputFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatementSet() {
		return statementSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatementSet_StatementOperator() {
		return (EAttribute) statementSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatementSet_Statementset() {
		return (EReference) statementSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatementSet_Statement() {
		return (EReference) statementSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatementOperator() {
		return statementOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvaluationOperator() {
		return evaluationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenDictatorFactory getOpenDictatorFactory() {
		return (OpenDictatorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		policyEClass = createEClass(POLICY);
		createEReference(policyEClass, POLICY__STATEMENTSET);
		createEReference(policyEClass, POLICY__INPUTFILE);
		createEAttribute(policyEClass, POLICY__FAILURE_MESSAGE);
		createEAttribute(policyEClass, POLICY__SUCCESS_MESSAGE);
		createEAttribute(policyEClass, POLICY__ID);
		createEOperation(policyEClass, POLICY___EVALUATE);

		statementEClass = createEClass(STATEMENT);
		createEAttribute(statementEClass, STATEMENT__EVALUATION_OPERATOR);
		createEAttribute(statementEClass, STATEMENT__PREFIX_EVALUATION_OPERATOR);
		createEReference(statementEClass, STATEMENT__JSONQUERY);
		createEReference(statementEClass, STATEMENT__VALUE);
		createEOperation(statementEClass, STATEMENT___EVALUATE);

		jsonQueryEClass = createEClass(JSON_QUERY);
		createEAttribute(jsonQueryEClass, JSON_QUERY__QUERY_STRING);
		createEOperation(jsonQueryEClass, JSON_QUERY___EVALUATE);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__TYPE);
		createEAttribute(valueEClass, VALUE__VALUE);

		statementSetEClass = createEClass(STATEMENT_SET);
		createEAttribute(statementSetEClass, STATEMENT_SET__STATEMENT_OPERATOR);
		createEReference(statementSetEClass, STATEMENT_SET__STATEMENTSET);
		createEReference(statementSetEClass, STATEMENT_SET__STATEMENT);

		inputFileEClass = createEClass(INPUT_FILE);
		createEAttribute(inputFileEClass, INPUT_FILE__FILE_LOCATION);

		// Create enums
		statementOperatorEEnum = createEEnum(STATEMENT_OPERATOR);
		evaluationOperatorEEnum = createEEnum(EVALUATION_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicy_Statementset(), this.getStatementSet(), null, "statementset", null, 1, 1, Policy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Inputfile(), this.getInputFile(), null, "inputfile", null, 1, 1, Policy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_FailureMessage(), ecorePackage.getEString(), "FailureMessage", null, 1, 1,
				Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_SuccessMessage(), ecorePackage.getEString(), "SuccessMessage", null, 1, 1,
				Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Id(), ecorePackage.getEString(), "id", null, 1, 1, Policy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPolicy__Evaluate(), null, "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_EvaluationOperator(), this.getEvaluationOperator(), "evaluationOperator", null, 1,
				1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_PrefixEvaluationOperator(), this.getEvaluationOperator(),
				"prefixEvaluationOperator", null, 0, 2, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Jsonquery(), this.getJsonQuery(), null, "jsonquery", null, 1, 1, Statement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Value(), this.getValue(), null, "value", null, 1, 1, Statement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getStatement__Evaluate(), ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jsonQueryEClass, JsonQuery.class, "JsonQuery", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonQuery_QueryString(), ecorePackage.getEString(), "queryString", null, 1, 1,
				JsonQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getJsonQuery__Evaluate(), this.getValue(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Type(), ecorePackage.getEString(), "type", null, 1, 1, Value.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, Value.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementSetEClass, StatementSet.class, "StatementSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatementSet_StatementOperator(), this.getStatementOperator(), "statementOperator", null, 1,
				1, StatementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStatementSet_Statementset(), this.getStatementSet(), null, "statementset", null, 0, -1,
				StatementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatementSet_Statement(), this.getStatement(), null, "statement", null, 1, -1,
				StatementSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputFileEClass, InputFile.class, "InputFile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputFile_FileLocation(), ecorePackage.getEString(), "fileLocation", null, 1, 1,
				InputFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statementOperatorEEnum, StatementOperator.class, "StatementOperator");
		addEEnumLiteral(statementOperatorEEnum, StatementOperator.AND);
		addEEnumLiteral(statementOperatorEEnum, StatementOperator.OR);
		addEEnumLiteral(statementOperatorEEnum, StatementOperator.NOT);

		initEEnum(evaluationOperatorEEnum, EvaluationOperator.class, "EvaluationOperator");
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.FORSOME);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.FORALL);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.CONTAINS);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.EQUALS);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.LARGERTHAN);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.SMALLERTHAN);

		// Create resource
		createResource(eNS_URI);
	}

} //OpenDictatorPackageImpl
