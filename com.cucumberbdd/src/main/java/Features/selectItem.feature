Feature: Add to cart functionality

Scenario Outline: Select item by descending order and add the item to the cart

Given User is on the login page
When Title of the login page is free crm
Then User enters "<username>" and "<password>"
And user clicks on login button
Then User is on home page
Then Navigate to name drop down
Then Select the first item to add to cart
Then Deselect the item added to cart
Then User hits on open button
Then User clicks on logout
Then Close the browser


Examples: 

		| username | password | 
		| standard_user | secret_sauce | 


