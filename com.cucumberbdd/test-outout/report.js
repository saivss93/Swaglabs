$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/SaiVanapalli/eclipse-workspace/com.cucumberbdd/src/main/java/Features/checkout.feature");
formatter.feature({
  "line": 1,
  "name": "Checkout process",
  "description": "",
  "id": "checkout-process",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Checkout item and finish the order",
  "description": "",
  "id": "checkout-process;checkout-item-and-finish-the-order",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of the login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Navigate to name drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Select the first item to add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Tap on checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enters \"\u003cFirst Name\u003e\" and \"\u003cLast Name\u003e\" and \"\u003cZip/Postal Code\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Tap on Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Tap on Finish",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify order placed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User hits on open button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User clicks on logout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "checkout-process;checkout-item-and-finish-the-order;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "First Name",
        "Last Name",
        "Zip/Postal Code"
      ],
      "line": 24,
      "id": "checkout-process;checkout-item-and-finish-the-order;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "Sai",
        "Vanapalli",
        "17050"
      ],
      "line": 25,
      "id": "checkout-process;checkout-item-and-finish-the-order;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "Checkout item and finish the order",
  "description": "",
  "id": "checkout-process;checkout-item-and-finish-the-order;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of the login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Navigate to name drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Select the first item to add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Tap on checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Enters \"Sai\" and \"Vanapalli\" and \"17050\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Tap on Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Tap on Finish",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify order placed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User hits on open button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User clicks on logout",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 8528403328,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.title_of_the_login_page_is_free_crm()"
});
formatter.result({
  "duration": 45336066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 13
    },
    {
      "val": "secret_sauce",
      "offset": 33
    }
  ],
  "location": "StepDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 276507669,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3056897868,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 2014129658,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.navigate_to_name_drop_down()"
});
formatter.result({
  "duration": 2336510919,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.select_the_first_item_to_add_to_cart()"
});
formatter.result({
  "duration": 2241409897,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_the_cart()"
});
formatter.result({
  "duration": 2281075492,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.tap_on_checkout()"
});
formatter.result({
  "duration": 2274934761,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sai",
      "offset": 8
    },
    {
      "val": "Vanapalli",
      "offset": 18
    },
    {
      "val": "17050",
      "offset": 34
    }
  ],
  "location": "StepDef.enters_and_and(String,String,String)"
});
formatter.result({
  "duration": 2170358408,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.tap_on_Continue()"
});
formatter.result({
  "duration": 2208893518,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.tap_on_Finish()"
});
formatter.result({
  "duration": 2256311183,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.verify_order_placed()"
});
formatter.result({
  "duration": 24745820,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_hits_on_open_button()"
});
formatter.result({
  "duration": 2237954018,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_clicks_on_logout()"
});
formatter.result({
  "duration": 2186676771,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.close_the_browser()"
});
formatter.result({
  "duration": 2564631798,
  "status": "passed"
});
});