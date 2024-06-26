/*
 * generated by Xtext 2.34.0
 */
package org.xtext.openDictator.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.openDictator.ide.contentassist.antlr.internal.InternalOpenDictatorDslParser;
import org.xtext.openDictator.services.OpenDictatorDslGrammarAccess;

public class OpenDictatorDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OpenDictatorDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OpenDictatorDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getInputFileAccess().getGroup(), "rule__InputFile__Group__0");
			builder.put(grammarAccess.getInputFileAccess().getFileLocationAssignment_3(), "rule__InputFile__FileLocationAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OpenDictatorDslGrammarAccess grammarAccess;

	@Override
	protected InternalOpenDictatorDslParser createParser() {
		InternalOpenDictatorDslParser result = new InternalOpenDictatorDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OpenDictatorDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OpenDictatorDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
