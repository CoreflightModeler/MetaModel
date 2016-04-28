/**
 * Copyright (C) 2016 Monami-ya LLC, Japan
 */
package coreflight00.cfs.tests;

import coreflight00.cfs.CfsFactory;
import coreflight00.cfs.Housekeeping;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Housekeeping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HousekeepingTest extends CfsApplicationTest {

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
		TestRunner.run(HousekeepingTest.class);
	}

	/**
	 * Constructs a new Housekeeping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HousekeepingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Housekeeping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Housekeeping getFixture() {
		return (Housekeeping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CfsFactory.eINSTANCE.createHousekeeping());
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

} //HousekeepingTest
