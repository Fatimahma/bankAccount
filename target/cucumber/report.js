$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddBankAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@addBankAccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "user enters the username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user should be able to see validate",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 19,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "myAccount",
        "personal",
        "1000",
        "7654321",
        "John",
        "987654321",
        "www.bankofamerican.com"
      ],
      "line": 20,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3570710500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddBankAccountStepDef.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 1268811800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@addBankAccount"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user enters the username as \"demo@techfios.com\" and password as \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user fill up the form entering \"myAccount\"and \"personal\"and \"1000\"and \"7654321\"and \"John\"and \"987654321\"and \"www.bankofamerican.com\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user should be able to see validate",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 29
    },
    {
      "val": "abc123",
      "offset": 65
    }
  ],
  "location": "AddBankAccountStepDef.user_enters_the_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 156472000,
  "status": "passed"
});
formatter.match({
  "location": "AddBankAccountStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1150289600,
  "status": "passed"
});
formatter.match({
  "location": "AddBankAccountStepDef.user_should_be_able_to_see_the_dashboard()"
});
formatter.result({
  "duration": 494365500,
  "status": "passed"
});
formatter.match({
  "location": "AddBankAccountStepDef.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 216740200,
  "status": "passed"
});
formatter.match({
  "location": "AddBankAccountStepDef.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 613844000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "myAccount",
      "offset": 32
    },
    {
      "val": "personal",
      "offset": 47
    },
    {
      "val": "1000",
      "offset": 61
    },
    {
      "val": "7654321",
      "offset": 71
    },
    {
      "val": "John",
      "offset": 84
    },
    {
      "val": "987654321",
      "offset": 94
    },
    {
      "val": "www.bankofamerican.com",
      "offset": 109
    }
  ],
  "location": "AddBankAccountStepDef.user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2246436000,
  "status": "passed"
});
formatter.match({
  "location": "AddBankAccountStepDef.user_should_be_able_to_see_validate()"
});
formatter.result({
  "duration": 212581300,
  "status": "passed"
});
});