Feature: Manageuser Page

Scenario: Manage User Page
Given user is at Manage Batch page1
When user click on User button 
Then user is at Manage User page2 

Scenario: Validating Delete button on User Page
Given user display user program page
When user enter user button 
And user validate Delete button is Disable1 

Scenario: verifying for heading fields of user
Given User is on the Manage user page
When user clicks user button1 
Then User verify for the different header fields of users 

Scenario: Manage User Search Box 
Given user is at user Page 
When user enter username in search box
Then Matching records of username is displayed  

Scenario: Userdetails Page
Given user is at userpage with search record 
When user clicks on Edit button1
Then  user lands on userdetails page 

Scenario: Userdetails page verification
Given user is at user details page
When user verifies for submit and cancel button
Then  user clicks cancel button

Scenario: Adding new user in manage user page
Given user is at user details page to add new user
When user clicks Add new button
Then  User details window for adding user is displayed

Scenario: Add new user cancel funtionality
Given user is at user details page after clicking Add user
When user clicks x button at the 
Then  User details window for adding user is closed


