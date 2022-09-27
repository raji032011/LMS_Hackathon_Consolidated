Feature: Pagination & Order 

Scenario: Naviagte to First Page 
Given user is at Manage Batch Page 
When user click next link of Pagination  
Then validate user is at First page 

Scenario:Naviagte to Previous Page 
Given user is at Batch Page with First page details 
When user click < Previous for Pagination 
Then validate user is at Second Page 

Scenario:Naviagte to Last Page 
Given user is at Batch Page with Second page details 
When user click last link for pagination 
Then validate user is at last Page 

Scenario:Naviagte back First Page 
Given user is on Last Page of Batch Details 
When user click on  First link for pagination   
Then validate is on First page of Batch 

Scenario: Ascending Order by Batch Name 
Given user is at Manage Details page with Batch Name 
When user click on Batch Name 
Then validate Batch Name in Ascending order

Scenario: Ascending Order by Batch Description 
Given user is at Manage Details page with Batch Description 
When user click on Batch Description 
Then validate Batch Description in Ascending order

Scenario: Ascending Order by Batch Status
Given user is at Manage Details page with Batch Status 
When user click on Batch Status 
Then validate Batch Status in Ascending order

Scenario: Ascending Order by No Of Classes
Given user is at Manage Details page with NoOfClasses 
When user click on NoOfClasses 
Then validate NoOfClasses in Ascending order

Scenario: Descending Order by Batch Name 
Given user is at Manage Details page with Batch Name 
When user click on Batch Name 
Then validate Batch Name in Descending order

Scenario: Descending Order by Batch Description 
Given user is at Manage Details page with Batch Description 
When user click on Batch Description 
Then validate Batch Description in Descending order

Scenario: Descending Order by Batch Status 
Given user is at Manage Details page with Batch Status 
When user click on Batch Status 
Then validate Batch Status in Descending order

Scenario: Descending Order by No Of Classes
Given user is at Manage Details page with NoOfClasses
When user click on NoOfClasses 
Then validate Batch NoOfClasses in Descending order
