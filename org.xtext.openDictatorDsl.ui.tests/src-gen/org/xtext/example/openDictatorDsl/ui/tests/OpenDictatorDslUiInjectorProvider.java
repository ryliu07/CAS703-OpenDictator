/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.openDictatorDsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.openDictatorDsl.ui.internal.OpenDictatorDslActivator;

public class OpenDictatorDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return OpenDictatorDslActivator.getInstance().getInjector("org.xtext.example.openDictatorDsl.OpenDictatorDsl");
	}

}
