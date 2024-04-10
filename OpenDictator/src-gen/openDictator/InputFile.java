/**
 */
package openDictator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link openDictator.InputFile#getFileLocation <em>File Location</em>}</li>
 * </ul>
 *
 * @see openDictator.OpenDictatorPackage#getInputFile()
 * @model
 * @generated
 */
public interface InputFile extends EObject {

	/**
	 * Returns the value of the '<em><b>File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Location</em>' attribute.
	 * @see #setFileLocation(String)
	 * @see openDictator.OpenDictatorPackage#getInputFile_FileLocation()
	 * @model required="true"
	 * @generated
	 */
	String getFileLocation();

	/**
	 * Sets the value of the '{@link openDictator.InputFile#getFileLocation <em>File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Location</em>' attribute.
	 * @see #getFileLocation()
	 * @generated
	 */
	void setFileLocation(String value);
} // InputFile
