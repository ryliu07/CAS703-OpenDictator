/**
 */
package openDictator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openDictator.JsonQuery#getQueryString <em>Query String</em>}</li>
 * </ul>
 *
 * @see openDictator.OpenDictatorPackage#getJsonQuery()
 * @model
 * @generated
 */
public interface JsonQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query String</em>' attribute.
	 * @see #setQueryString(String)
	 * @see openDictator.OpenDictatorPackage#getJsonQuery_QueryString()
	 * @model required="true"
	 * @generated
	 */
	String getQueryString();

	/**
	 * Sets the value of the '{@link openDictator.JsonQuery#getQueryString <em>Query String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query String</em>' attribute.
	 * @see #getQueryString()
	 * @generated
	 */
	void setQueryString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Value evaluate();

} // JsonQuery
