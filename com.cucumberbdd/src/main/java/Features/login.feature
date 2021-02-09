Feature: Test functionality of the project.

@regression
Scenario Outline: Test login feature of the web application.

Given User is on the login page
When Title of the login page is free crm
Then User enters "<username>" and "<password>"
And user clicks on login button
Then User is on home page
Then User hits on open button
Then User clicks on logout
Then Close the browser


Examples: 

		| username | password |
		| standard_user | secret_sauce |
		| problem_user | secret_sauce |
		| performance_glitch_user | secret_sauce |
	