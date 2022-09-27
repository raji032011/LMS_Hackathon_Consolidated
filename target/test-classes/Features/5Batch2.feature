Feature: Batch Add New Batch

Scenario: Click New Batch button
Given user is at Manage Batch page with ANew Batch button  
When user clicks on ANew Batch button 
Then Batch Details Page popup with all empty fields

Scenario: Enter Empty Username
Given user is at New Add Batch Details Page 
When user enter empty username - click save button 
Then message display - Name is required 

Scenario: Click cancel button on New Batch 
Given user is at New Add Batch Details Page1 
When user  click cancel button 
Then Batch Details popup is disappears

Scenario: Add New Batch Details 
Given user is at Batch Details adding all details in popup page 
When user enters all details 
Then user clicks on save button 
And user see message -Successful batch created

Scenario: Verify New Batch Added
Given user is at Manage Batch page2
When user verify  Add batch in search box 
Then user should see new batch data on Manage batch page 