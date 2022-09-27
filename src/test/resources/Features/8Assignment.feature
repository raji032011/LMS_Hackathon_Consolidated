Feature: Assignment

Scenario: Click Assigment button
Given user is at user page with 7 button on menu bar
When user click on assigment button
Then user lands on assignment page

Scenario: Validating asssigment page
Given user is on asssigment page with
When user validate manage Assignment text on page
And user see text Showing 1 os 3 of 3 Entries
Then user should see the SearchBox with text search

Scenario: Validating by asssigment name
Given user is on Assisgment page
When  user search assigment by name
Then user see the search assisgmnet name data

Scenario: To click Edit button
Given user is on Assigment page with  entries
When user click on Edit button
Then user see Assigment Details form popup

Scenario: Edit Grade and assigment description
Given user is at Assigment form
When user edited assigment description and grade
Then user click save button user lands on Manage Assigment page


Scenario: Delete confirm page Assigment
Given user is at assigmnet page2
When user click delete button
Then user see confirm Deletion form

Scenario: Assigment Delete Msg
Given user is at confirm Deletion form with two button
When user click on yes button
Then user see msg - Succssfull Assigment deleted
