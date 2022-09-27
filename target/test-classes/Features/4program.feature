Feature: Verify the Program page

 Background: 
  Given User is on  homepage
  
  
       Scenario: Verify Search Feature
       When User is able to see search box
	     Then Text box used for search has text as Search
	    
  
  	  Scenario: Verify the default state of Delete button
  	   When User clicks on delete button
	     Then User should see the Delete button as Disabled  
  
	    Scenario: Verify that number of records rows of data in the table displayed
	     When User counts the number of rows
	     Then Verify that number of records rows of data in the table displayed on the page are 5
	    
	
	  Scenario: Verify the text below the table
	    When User scrolls down
	    Then User should see the text as Showing x to y of z entries below the table and x starting record number on that page and y ending record number on that page and z Total number of records
	
	    Scenario: Verify the footer
	    When User scrolls down to look at the footer
	     Then User should see the footer as In total there are z programs and z Total number of records 
	    