Feature: Login page feature
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "POSNIC - Login to Control Panel"

Scenario: Forget password link
Given user is on login page
Then forgot your password link should  be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "admin"
And user enters password "admin"
And user clicks in Login button
Then user gets the title of the page
And  page title should be "POSNIC - Dashboard"
