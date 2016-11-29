/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/box/coroutines")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AdditionalCoroutineBlackBoxCodegenTestGenerated extends AbstractAdditionalCoroutineBlackBoxCodegenTest {
    public void testAllFilesPresentInCoroutines() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/coroutines"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("beginWithException.kt")
    public void testBeginWithException() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/beginWithException.kt");
        doTest(fileName);
    }

    @TestMetadata("beginWithExceptionNoHandleException.kt")
    public void testBeginWithExceptionNoHandleException() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/beginWithExceptionNoHandleException.kt");
        doTest(fileName);
    }

    @TestMetadata("coercionToUnit.kt")
    public void testCoercionToUnit() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/coercionToUnit.kt");
        doTest(fileName);
    }

    @TestMetadata("controllerAccessFromInnerLambda.kt")
    public void testControllerAccessFromInnerLambda() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/controllerAccessFromInnerLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultParametersInSuspend.kt")
    public void testDefaultParametersInSuspend() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/defaultParametersInSuspend.kt");
        doTest(fileName);
    }

    @TestMetadata("emptyClosure.kt")
    public void testEmptyClosure() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/emptyClosure.kt");
        doTest(fileName);
    }

    @TestMetadata("falseUnitCoercion.kt")
    public void testFalseUnitCoercion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/falseUnitCoercion.kt");
        doTest(fileName);
    }

    @TestMetadata("generate.kt")
    public void testGenerate() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/generate.kt");
        doTest(fileName);
    }

    @TestMetadata("handleException.kt")
    public void testHandleException() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/handleException.kt");
        doTest(fileName);
    }

    @TestMetadata("handleResultCallEmptyBody.kt")
    public void testHandleResultCallEmptyBody() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/handleResultCallEmptyBody.kt");
        doTest(fileName);
    }

    @TestMetadata("handleResultNonUnitExpression.kt")
    public void testHandleResultNonUnitExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/handleResultNonUnitExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("handleResultSuspended.kt")
    public void testHandleResultSuspended() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/handleResultSuspended.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineSuspendFunction.kt")
    public void testInlineSuspendFunction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/inlineSuspendFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("inlinedTryCatchFinally.kt")
    public void testInlinedTryCatchFinally() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/inlinedTryCatchFinally.kt");
        doTest(fileName);
    }

    @TestMetadata("innerSuspensionCalls.kt")
    public void testInnerSuspensionCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/innerSuspensionCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("instanceOfContinuation.kt")
    public void testInstanceOfContinuation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/instanceOfContinuation.kt");
        doTest(fileName);
    }

    @TestMetadata("iterateOverArray.kt")
    public void testIterateOverArray() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/iterateOverArray.kt");
        doTest(fileName);
    }

    @TestMetadata("kt12958.kt")
    public void testKt12958() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/kt12958.kt");
        doTest(fileName);
    }

    @TestMetadata("lambdaParameters.kt")
    public void testLambdaParameters() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/lambdaParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("lastExpressionIsLoop.kt")
    public void testLastExpressionIsLoop() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/lastExpressionIsLoop.kt");
        doTest(fileName);
    }

    @TestMetadata("lastStatementInc.kt")
    public void testLastStatementInc() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/lastStatementInc.kt");
        doTest(fileName);
    }

    @TestMetadata("lastStementAssignment.kt")
    public void testLastStementAssignment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/lastStementAssignment.kt");
        doTest(fileName);
    }

    @TestMetadata("lastUnitExpression.kt")
    public void testLastUnitExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/lastUnitExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("manualContinuationImpl.kt")
    public void testManualContinuationImpl() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/manualContinuationImpl.kt");
        doTest(fileName);
    }

    @TestMetadata("multipleInvokeCalls.kt")
    public void testMultipleInvokeCalls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/multipleInvokeCalls.kt");
        doTest(fileName);
    }

    @TestMetadata("multipleInvokeCallsInsideInlineLambda1.kt")
    public void testMultipleInvokeCallsInsideInlineLambda1() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/multipleInvokeCallsInsideInlineLambda1.kt");
        doTest(fileName);
    }

    @TestMetadata("multipleInvokeCallsInsideInlineLambda2.kt")
    public void testMultipleInvokeCallsInsideInlineLambda2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/multipleInvokeCallsInsideInlineLambda2.kt");
        doTest(fileName);
    }

    @TestMetadata("multipleInvokeCallsInsideInlineLambda3.kt")
    public void testMultipleInvokeCallsInsideInlineLambda3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/multipleInvokeCallsInsideInlineLambda3.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedTryCatch.kt")
    public void testNestedTryCatch() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/nestedTryCatch.kt");
        doTest(fileName);
    }

    @TestMetadata("noSuspensionPoints.kt")
    public void testNoSuspensionPoints() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/noSuspensionPoints.kt");
        doTest(fileName);
    }

    @TestMetadata("nonLocalReturnFromInlineLambda.kt")
    public void testNonLocalReturnFromInlineLambda() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/nonLocalReturnFromInlineLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("nonLocalReturnFromInlineLambdaDeep.kt")
    public void testNonLocalReturnFromInlineLambdaDeep() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/nonLocalReturnFromInlineLambdaDeep.kt");
        doTest(fileName);
    }

    @TestMetadata("returnByLabel.kt")
    public void testReturnByLabel() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/returnByLabel.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleException.kt")
    public void testSimpleException() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/simpleException.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleWithHandleResult.kt")
    public void testSimpleWithHandleResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/simpleWithHandleResult.kt");
        doTest(fileName);
    }

    @TestMetadata("statementLikeLastExpression.kt")
    public void testStatementLikeLastExpression() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/statementLikeLastExpression.kt");
        doTest(fileName);
    }

    @TestMetadata("suspendDelegation.kt")
    public void testSuspendDelegation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/suspendDelegation.kt");
        doTest(fileName);
    }

    @TestMetadata("suspendExtension.kt")
    public void testSuspendExtension() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/suspendExtension.kt");
        doTest(fileName);
    }

    @TestMetadata("suspendFromInlineLambda.kt")
    public void testSuspendFromInlineLambda() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/suspendFromInlineLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("suspendInCycle.kt")
    public void testSuspendInCycle() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/suspendInCycle.kt");
        doTest(fileName);
    }

    @TestMetadata("suspendInTheMiddleOfObjectConstruction.kt")
    public void testSuspendInTheMiddleOfObjectConstruction() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/suspendInTheMiddleOfObjectConstruction.kt");
        doTest(fileName);
    }

    @TestMetadata("tryCatchFinallyWithHandleResult.kt")
    public void testTryCatchFinallyWithHandleResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/tryCatchFinallyWithHandleResult.kt");
        doTest(fileName);
    }

    @TestMetadata("tryCatchWithHandleResult.kt")
    public void testTryCatchWithHandleResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/tryCatchWithHandleResult.kt");
        doTest(fileName);
    }

    @TestMetadata("tryFinallyInsideInlineLambda.kt")
    public void testTryFinallyInsideInlineLambda() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/tryFinallyInsideInlineLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("tryFinallyWithHandleResult.kt")
    public void testTryFinallyWithHandleResult() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/tryFinallyWithHandleResult.kt");
        doTest(fileName);
    }

    @TestMetadata("varValueConflictsWithTable.kt")
    public void testVarValueConflictsWithTable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/varValueConflictsWithTable.kt");
        doTest(fileName);
    }

    @TestMetadata("varValueConflictsWithTableSameSort.kt")
    public void testVarValueConflictsWithTableSameSort() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/varValueConflictsWithTableSameSort.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/box/coroutines/controlFlow")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ControlFlow extends AbstractAdditionalCoroutineBlackBoxCodegenTest {
        public void testAllFilesPresentInControlFlow() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/coroutines/controlFlow"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

    }

    @TestMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class IntLikeVarSpilling extends AbstractAdditionalCoroutineBlackBoxCodegenTest {
        public void testAllFilesPresentInIntLikeVarSpilling() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/coroutines/intLikeVarSpilling"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("complicatedMerge.kt")
        public void testComplicatedMerge() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/complicatedMerge.kt");
            doTest(fileName);
        }

        @TestMetadata("i2bResult.kt")
        public void testI2bResult() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/i2bResult.kt");
            doTest(fileName);
        }

        @TestMetadata("loadFromBooleanArray.kt")
        public void testLoadFromBooleanArray() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/loadFromBooleanArray.kt");
            doTest(fileName);
        }

        @TestMetadata("loadFromByteArray.kt")
        public void testLoadFromByteArray() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/loadFromByteArray.kt");
            doTest(fileName);
        }

        @TestMetadata("noVariableInTable.kt")
        public void testNoVariableInTable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/noVariableInTable.kt");
            doTest(fileName);
        }

        @TestMetadata("sameIconst1ManyVars.kt")
        public void testSameIconst1ManyVars() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/sameIconst1ManyVars.kt");
            doTest(fileName);
        }

        @TestMetadata("usedInArrayStore.kt")
        public void testUsedInArrayStore() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/usedInArrayStore.kt");
            doTest(fileName);
        }

        @TestMetadata("usedInMethodCall.kt")
        public void testUsedInMethodCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/usedInMethodCall.kt");
            doTest(fileName);
        }

        @TestMetadata("usedInPutfield.kt")
        public void testUsedInPutfield() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/usedInPutfield.kt");
            doTest(fileName);
        }

        @TestMetadata("usedInVarStore.kt")
        public void testUsedInVarStore() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/intLikeVarSpilling/usedInVarStore.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/box/coroutines/multiModule")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MultiModule extends AbstractAdditionalCoroutineBlackBoxCodegenTest {
        public void testAllFilesPresentInMultiModule() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/coroutines/multiModule"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/multiModule/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("suspendExtension.kt")
        public void testSuspendExtension() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/multiModule/suspendExtension.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/box/coroutines/stackUnwinding")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class StackUnwinding extends AbstractAdditionalCoroutineBlackBoxCodegenTest {
        public void testAllFilesPresentInStackUnwinding() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/coroutines/stackUnwinding"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("exception.kt")
        public void testException() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/stackUnwinding/exception.kt");
            doTest(fileName);
        }

        @TestMetadata("inlineSuspendFunction.kt")
        public void testInlineSuspendFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/stackUnwinding/inlineSuspendFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/stackUnwinding/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("suspendInCycle.kt")
        public void testSuspendInCycle() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/coroutines/stackUnwinding/suspendInCycle.kt");
            doTest(fileName);
        }
    }
}
