/**
 */
package coreflight00.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import coreflight00.Applications;
import coreflight00.DocumentRoot;
import coreflight00.Identifiable;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see coreflight00.util.Coreflight00ResourceFactoryImpl
 * @generated
 */
public class Coreflight00ResourceImpl extends XMLResourceImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public Coreflight00ResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public String getURIFragment(EObject eObject) {
		List<String> list = new ArrayList<String>();
		
		for (EObject o = eObject; o != null; o = o.eContainer()) {
			if (o instanceof Identifiable) {
				String s = ((Identifiable)o).getShortName().getLocalPart();
				list.add(0, s);
			} else if (o instanceof DocumentRoot) {
				list.add(0, "");
			} else if (!(o instanceof Applications)) {
				list.add(0, "???"); //Should not be happened
			}
		}
		return String.join("/", list);
	}

} //Coreflight00ResourceImpl
