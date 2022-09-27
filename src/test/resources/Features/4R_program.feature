Feature: Verify program details form

Background:

Given User is on Program to add a new program

 Scenario: Validate Add New Program
    
    When User clicks new program button
    Then User lands on Program Details form
 
  Scenario: Empty form submission
    When User clicks Save button without entering data
    Then User gets message Name is required
 
  Scenario: Enter Program Name
    When User enters Name in text box
    Then User can see Name entered
 