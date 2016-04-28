/**
 */
package coreflight00.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see coreflight00.util.Coreflight00ResourceImpl
 * @generated
 */
public class Coreflight00ResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (C) 2016 Monami-ya LLC, Japan"; //$NON-NLS-1$

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coreflight00ResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Resource createResource(URI uri) {
		XMLResource result = new Coreflight00ResourceImpl(uri);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		
		XMLResource.URIHandler handler = new CoreflightURIHandlerImpl();
		result.getDefaultLoadOptions().put(XMLResource.OPTION_URI_HANDLER, handler);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, handler);

		return result;
	}

	/**
	 * Customized URI handler. Treats "coreflight" URI scheme.
	 * 
	 * @author monaka
	 *
	 */
	public class CoreflightURIHandlerImpl extends URIHandlerImpl {
		public static final String COREFLIGHT_SCHEME = "coreflight";

		@Override
		public URI resolve(URI uri) {
			if (uri.scheme() == null && uri.fragment() == null && uri.path().charAt(0) == '/') {
				return URI.createURI(COREFLIGHT_SCHEME + "://#" + uri.path());
			} else {
				return super.resolve(uri);
			}
		}

		@Override
		public URI deresolve(URI uri) {
			URI tmp = uri.deresolve(getBaseURI());
			if (tmp.scheme() == null && tmp.fragment() != null) {
				return URI.createURI(uri.fragment());
			} else {
				return super.deresolve(uri);
			}
		}
	}
} //Coreflight00ResourceFactoryImpl
