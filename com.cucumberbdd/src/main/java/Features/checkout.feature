Feature: Checkout process

Scenario Outline: Checkout item and finish the order

Given User is on the login page
When Title of the login page is free crm
Then User enters "<username>" and "<password>"
And user clicks on login button
Then User is on home page
Then Navigate to name drop down
Then Select the first item to add to cart
Then Click on the cart
Then Tap on checkout
Then Enters "<First Name>" and "<Last Name>" and "<Zip/Postal Code>"
Then Tap on Continue
Then Tap on Finish
Then Verify order placed
Then User hits on open button
Then User clicks on logout
Then Close the browser

Examples: 

		| username | password | First Name | Last Name | Zip/Postal Code |
		| standard_user | secret_sauce | Sai | Vanapalli | 17050 |
