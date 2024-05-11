Feature: Dash Board Freature
Background: 
Given user has already logged in to application
|username|password|
|admin|admin|

Scenario: Accounts page title
Given user is on Dashboard page
When user gets the title of the page
Then page title should be "POSNIC - Dashboard"

Scenario: Dashboard section count
Given user is on Dashboard page 
Then user gets dashboard section
|Dashboard|
|Sales|
|Customers|
|Purchase|
|Supplier|
|Stocks / Products|
|Payments / Outstandings|
|Reports|
And Dashboard section count should be 8
