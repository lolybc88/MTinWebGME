/*
 * generated by Xtext
 */
package org.xtext.example.webgme.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.webgme.ui.internal.MTLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MTLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MTLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MTLActivator.getInstance().getInjector(MTLActivator.ORG_XTEXT_EXAMPLE_WEBGME_MTL);
	}
	
}
