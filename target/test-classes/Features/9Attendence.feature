Feature: Attendence 

Scenario: Click attendence button 
Given user is at Manage Batch Page with NoOfClasses in Descending order 
When user click on Attendence button on Menu Bar 
Then user lands on Attendence page 

Scenario: Validating Attendence Page 
Given user is at Attendence page 
When user see window with text- Attendence Works 
Then user click on logout
And user lands on Login page   
