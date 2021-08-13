$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desktoppage.feature");
formatter.feature({
  "line": 2,
  "name": "Desktops",
  "description": "",
  "id": "desktops",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CompleteTest"
    }
  ]
});
formatter.before({
  "duration": 2590025700,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on Retail Website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on Show all desktop page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageTestStepDef.user_is_on_Retail_Website()"
});
formatter.result({
  "duration": 1974295400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageTestStepDef.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 101045400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageTestStepDef.user_click_on_Show_all_desktop_page()"
});
formatter.result({
  "duration": 677370400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User add canon EOS 5D from desktops tab to the cart",
  "description": "",
  "id": "desktops;user-add-canon-eos-5d-from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@AddCanonEOS5D"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User click ADD TO CART option on \u0027Canon EOS 5D\u0027 item",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User select color from dropdown \u0027Red\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User should see a message \u0027Success: You have added Canon EOS 5D to your shopping cart!\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 44
    }
  ],
  "location": "DesktopsPageTestStepDef.user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int)"
});
formatter.result({
  "duration": 104133100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageTestStepDef.user_select_color_from_dropdown_Red(WebElement)"
});
formatter.result({
  "duration": 308700,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027stepDefinitions.DesktopsPageTestStepDef.user_select_color_from_dropdown_Red(WebElement) in file:/C:/Users/Shirshah%20Ahmadzai/eclipse-workspace/com.capstone.bdd.framework/target/test-classes/\u0027 with pattern [^User select color from dropdown \u0027Red\u0027$] is declared with 1 parameters. However, the gherkin step has 0 arguments []. \nStep: And User select color from dropdown \u0027Red\u0027\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DesktopsPageTestStepDef.user_click_add_to_Cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 61
    }
  ],
  "location": "DesktopsPageTestStepDef.user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 662534600,
  "status": "passed"
});
});