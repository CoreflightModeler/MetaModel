/**
 */
package coreflight00.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>coreflight00</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Coreflight00Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Coreflight00Tests("coreflight00 Tests"); //$NON-NLS-1$
		suite.addTestSuite(ApplicationsTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(InterTaskMessageRouterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coreflight00Tests(String name) {
		super(name);
	}

} //Coreflight00Tests
