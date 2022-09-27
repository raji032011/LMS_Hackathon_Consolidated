Feature: Manage Batch

Scenario: Manage Batch Page
Given user is at Manage program page
When user click on Batch button 
Then user is at Manage Batch page 

Scenario: Validating Delete button on Batch Page
Given user display Manage program page
When user enter Batch button 
And user validate Delete button is Disable 

Scenario: Manage Batch Search Box 
Given user is at Batch Page 
When user enter Batch Name in search box
Then records of Batch Name is displayed

Scenario: Batch Details Page 
Given user is at Batch page with search record 
When user clicks on Edit button 
Then  user lands on Batch Details page 

Scenario Outline: Edit Batch Details Page 
Given user is on Batch Details 
When user edit Name and status 
And click <Button> button 
Then user can see message <Message Displayed>

Examples:
    | Button     |  Message Displayed         |
    | Cancel     |  									      	|
    | Save			 | Successfully Batch Updated |

Scenario: validate Edit Batch 
Given user is on Batch Page with edited record
When user clear the search box 
And user enter the edited data
Then user should see the edited record
And user clear search -user is at Manage batch page 

Scenario: Delete Manage Batch 
Given user is at Manage Batch Page with multiple check boxes 
When user click multiple check boxes to delete Batch 
Then user click on Delete button next to search box 

Scenario: Confirm Deletion Popup 
Given user is at Confirm deletion popup Page 
When user click on Yes button 
Then user see the message- Successfully Deleted

