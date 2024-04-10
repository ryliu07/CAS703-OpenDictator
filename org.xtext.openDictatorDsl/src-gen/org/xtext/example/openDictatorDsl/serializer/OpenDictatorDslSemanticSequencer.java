/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.openDictatorDsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import openDictator.InputFile;
import openDictator.JsonQuery;
import openDictator.OpenDictatorPackage;
import openDictator.Policy;
import openDictator.Statement;
import openDictator.StatementSet;
import openDictator.Value;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.openDictatorDsl.services.OpenDictatorDslGrammarAccess;

@SuppressWarnings("all")
public class OpenDictatorDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OpenDictatorDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OpenDictatorPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OpenDictatorPackage.INPUT_FILE:
				sequence_InputFile(context, (InputFile) semanticObject); 
				return; 
			case OpenDictatorPackage.JSON_QUERY:
				sequence_JsonQuery(context, (JsonQuery) semanticObject); 
				return; 
			case OpenDictatorPackage.POLICY:
				sequence_Policy(context, (Policy) semanticObject); 
				return; 
			case OpenDictatorPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case OpenDictatorPackage.STATEMENT_SET:
				sequence_StatementSet(context, (StatementSet) semanticObject); 
				return; 
			case OpenDictatorPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     InputFile returns InputFile
	 *
	 * Constraint:
	 *     fileLocation=EString
	 * </pre>
	 */
	protected void sequence_InputFile(ISerializationContext context, InputFile semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.INPUT_FILE__FILE_LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.INPUT_FILE__FILE_LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputFileAccess().getFileLocationEStringParserRuleCall_3_0(), semanticObject.getFileLocation());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     JsonQuery returns JsonQuery
	 *
	 * Constraint:
	 *     queryString=EString
	 * </pre>
	 */
	protected void sequence_JsonQuery(ISerializationContext context, JsonQuery semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.JSON_QUERY__QUERY_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.JSON_QUERY__QUERY_STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJsonQueryAccess().getQueryStringEStringParserRuleCall_3_0(), semanticObject.getQueryString());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Policy returns Policy
	 *
	 * Constraint:
	 *     (FailureMessage=EString SuccessMessage=EString id=EString statementset=StatementSet inputfile=InputFile)
	 * </pre>
	 */
	protected void sequence_Policy(ISerializationContext context, Policy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.POLICY__FAILURE_MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.POLICY__FAILURE_MESSAGE));
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.POLICY__SUCCESS_MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.POLICY__SUCCESS_MESSAGE));
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.POLICY__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.POLICY__ID));
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.POLICY__STATEMENTSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.POLICY__STATEMENTSET));
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.POLICY__INPUTFILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.POLICY__INPUTFILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPolicyAccess().getFailureMessageEStringParserRuleCall_3_0(), semanticObject.getFailureMessage());
		feeder.accept(grammarAccess.getPolicyAccess().getSuccessMessageEStringParserRuleCall_5_0(), semanticObject.getSuccessMessage());
		feeder.accept(grammarAccess.getPolicyAccess().getIdEStringParserRuleCall_7_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getPolicyAccess().getStatementsetStatementSetParserRuleCall_9_0(), semanticObject.getStatementset());
		feeder.accept(grammarAccess.getPolicyAccess().getInputfileInputFileParserRuleCall_11_0(), semanticObject.getInputfile());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StatementSet returns StatementSet
	 *
	 * Constraint:
	 *     (statementOperator=StatementOperator (statementset+=StatementSet statementset+=StatementSet*)? statement+=Statement statement+=Statement*)
	 * </pre>
	 */
	protected void sequence_StatementSet(ISerializationContext context, StatementSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     (
	 *         evaluationOperator=EvaluationOperator 
	 *         (prefixEvaluationOperator+=EvaluationOperator prefixEvaluationOperator+=EvaluationOperator*)? 
	 *         jsonquery=JsonQuery 
	 *         value=Value
	 *     )
	 * </pre>
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns Value
	 *
	 * Constraint:
	 *     (type=EString value=EString)
	 * </pre>
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.VALUE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.VALUE__TYPE));
			if (transientValues.isValueTransient(semanticObject, OpenDictatorPackage.Literals.VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OpenDictatorPackage.Literals.VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getTypeEStringParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getValueAccess().getValueEStringParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}