/**
 */
package coreflight00;

import javax.xml.namespace.QName;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link coreflight00.Identifiable#getShortName <em>Short Name</em>}</li>
 *   <li>{@link coreflight00.Identifiable#getUuid <em>Uuid</em>}</li>
 * </ul>
 * </p>
 *
 * @see coreflight00.Coreflight00Package#getIdentifiable()
 * @model abstract="true"
 *        extendedMetaData="name='Identifiable' kind='elementOnly'"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(QName)
	 * @see coreflight00.Coreflight00Package#getIdentifiable_ShortName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='SHORT-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getShortName();

	/**
	 * Sets the value of the '{@link coreflight00.Identifiable#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(QName value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see coreflight00.Coreflight00Package#getIdentifiable_Uuid()
	 * @model dataType="coreflight00.UUID" required="true"
	 *        extendedMetaData="kind='element' name='UUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link coreflight00.Identifiable#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Identifiable
