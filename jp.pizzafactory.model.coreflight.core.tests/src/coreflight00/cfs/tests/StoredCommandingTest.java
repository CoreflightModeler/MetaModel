/**
 */
package coreflight00.cfs.tests;

import coreflight00.cfs.CfsFactory;
import coreflight00.cfs.StoredCommanding;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stored Commanding</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoredCommandingTest extends CfsApplicationTest {

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
		TestRunner.run(StoredCommandingTest.class);
	}

	/**
	 * Constructs a new Stored Commanding test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoredCommandingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stored Commanding test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StoredCommanding getFixture() {
		return (StoredCommanding)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CfsFactory.eINSTANCE.createStoredCommanding());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StoredCommandingTest
