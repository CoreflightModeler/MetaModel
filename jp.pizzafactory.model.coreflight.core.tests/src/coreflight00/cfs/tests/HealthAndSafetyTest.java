/**
 */
package coreflight00.cfs.tests;

import coreflight00.cfs.CfsFactory;
import coreflight00.cfs.HealthAndSafety;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Health And Safety</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthAndSafetyTest extends CfsApplicationTest {

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
		TestRunner.run(HealthAndSafetyTest.class);
	}

	/**
	 * Constructs a new Health And Safety test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthAndSafetyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Health And Safety test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HealthAndSafety getFixture() {
		return (HealthAndSafety)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CfsFactory.eINSTANCE.createHealthAndSafety());
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

} //HealthAndSafetyTest
