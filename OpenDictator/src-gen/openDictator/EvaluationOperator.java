/**
 */
package openDictator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluation Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see openDictator.OpenDictatorPackage#getEvaluationOperator()
 * @model
 * @generated
 */
public enum EvaluationOperator implements Enumerator {
	/**
	 * The '<em><b>FORSOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORSOME_VALUE
	 * @generated
	 * @ordered
	 */
	FORSOME(0, "FORSOME", "FORSOME"),

	/**
	 * The '<em><b>FORALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORALL_VALUE
	 * @generated
	 * @ordered
	 */
	FORALL(1, "FORALL", "FORALL"),

	/**
	 * The '<em><b>CONTAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(3, "CONTAINS", "CONTAINS"),

	/**
	 * The '<em><b>EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(4, "EQUALS", "EQUALS"),

	/**
	 * The '<em><b>LARGERTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	LARGERTHAN(5, "LARGERTHAN", "LARGERTHAN"),

	/**
	 * The '<em><b>SMALLERTHAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	SMALLERTHAN(6, "SMALLERTHAN", "SMALLERTHAN");

	/**
	 * The '<em><b>FORSOME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORSOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORSOME_VALUE = 0;

	/**
	 * The '<em><b>FORALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORALL_VALUE = 1;

	/**
	 * The '<em><b>CONTAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 3;

	/**
	 * The '<em><b>EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 4;

	/**
	 * The '<em><b>LARGERTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGERTHAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARGERTHAN_VALUE = 5;

	/**
	 * The '<em><b>SMALLERTHAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLERTHAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALLERTHAN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Evaluation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluationOperator[] VALUES_ARRAY = new EvaluationOperator[] { FORSOME, FORALL, CONTAINS,
			EQUALS, LARGERTHAN, SMALLERTHAN, };

	/**
	 * A public read-only list of all the '<em><b>Evaluation Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluationOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluation Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationOperator get(int value) {
		switch (value) {
		case FORSOME_VALUE:
			return FORSOME;
		case FORALL_VALUE:
			return FORALL;
		case CONTAINS_VALUE:
			return CONTAINS;
		case EQUALS_VALUE:
			return EQUALS;
		case LARGERTHAN_VALUE:
			return LARGERTHAN;
		case SMALLERTHAN_VALUE:
			return SMALLERTHAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EvaluationOperator(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EvaluationOperator
