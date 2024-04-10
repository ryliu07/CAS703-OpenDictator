/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.openDictatorDsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.openDictatorDsl.ui.internal.OpenDictatorDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OpenDictatorDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(OpenDictatorDslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		OpenDictatorDslActivator activator = OpenDictatorDslActivator.getInstance();
		return activator != null ? activator.getInjector(OpenDictatorDslActivator.ORG_XTEXT_EXAMPLE_OPENDICTATORDSL_OPENDICTATORDSL) : null;
	}

}