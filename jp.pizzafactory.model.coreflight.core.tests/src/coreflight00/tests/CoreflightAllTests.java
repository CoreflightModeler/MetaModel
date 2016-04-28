/**
 */
package coreflight00.tests;

import coreflight00.cfe.tests.CfeTests;
import coreflight00.cfs.tests.CfsTests;
import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Coreflight</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreflightAllTests extends TestSuite {

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
		TestSuite suite = new CoreflightAllTests("Coreflight Tests"); //$NON-NLS-1$
		suite.addTest(Coreflight00Tests.suite());
		suite.addTest(CfeTests.suite());
		suite.addTest(CfsTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreflightAllTests(String name) {
		super(name);
	}

} //CoreflightAllTests
