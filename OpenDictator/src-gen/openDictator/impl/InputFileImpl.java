/**
 */
package openDictator.impl;

import openDictator.InputFile;
import openDictator.OpenDictatorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link openDictator.impl.InputFileImpl#getFileLocation <em>File Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputFileImpl extends MinimalEObjectImpl.Container implements InputFile {
	/**
	 * The default value of the '{@link #getFileLocation() <em>File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_LOCATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFileLocation() <em>File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileLocation()
	 * @generated
	 * @ordered
	 */
	protected String fileLocation = FILE_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenDictatorPackage.Literals.INPUT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileLocation() {
		return fileLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileLocation(String newFileLocation) {
		String oldFileLocation = fileLocation;
		fileLocation = newFileLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenDictatorPackage.INPUT_FILE__FILE_LOCATION,
					oldFileLocation, fileLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OpenDictatorPackage.INPUT_FILE__FILE_LOCATION:
			return getFileLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OpenDictatorPackage.INPUT_FILE__FILE_LOCATION:
			setFileLocation((String) newValue);
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
		case OpenDictatorPackage.INPUT_FILE__FILE_LOCATION:
			setFileLocation(FILE_LOCATION_EDEFAULT);
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
		case OpenDictatorPackage.INPUT_FILE__FILE_LOCATION:
			return FILE_LOCATION_EDEFAULT == null ? fileLocation != null : !FILE_LOCATION_EDEFAULT.equals(fileLocation);
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
		result.append(" (fileLocation: ");
		result.append(fileLocation);
		result.append(')');
		return result.toString();
	}

} //InputFileImpl
