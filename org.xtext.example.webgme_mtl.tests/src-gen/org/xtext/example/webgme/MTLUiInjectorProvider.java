/*
* generated by Xtext
*/
package org.xtext.example.webgme;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MTLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.webgme.ui.internal.MTLActivator.getInstance().getInjector("org.xtext.example.webgme.MTL");
	}
	
}
