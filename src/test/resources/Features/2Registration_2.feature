Feature: Validating the text fields on the Registration page
@driversetup
 Scenario: Validating FirstName text field
    Given     User is on the Registration Page
    When User fills the First Name in Alphabets only
    Then The First Name will be displayed
    
   Scenario: Validating LastName text field
    Given     User is on the Registration Page
    When User fills the Last Name in Alphabets only
    Then The last Name will be displayed
    
    Scenario: Validating Address text field
    Given     User is on the Registration Page
    When User fills the Address Field using Alpha Numerics and or Symbols
    Then The Address will be displayed
    
    Scenario: Validating Street Name text field
    Given     User is on the Registration Page
    When User fills the StreetName Field using Alpha Numerics and or Symbols
    Then The Street will be displayed
    
    Scenario: Validating House Number text field
    Given     User is on the Registration Page
    When User fills the HouseNumber Field using Alpha Numerics and or Symbols
    Then The HouseNumber will be displayed
    
     Scenario: Validating City Name text field
    Given     User is on the Registration Page
    When    User fills the City Name in Alphabets only
    Then The city will be displayed
    
      Scenario: Validating State dropdown field
    Given     User is on the Registration Page
    When    User selects the respective State Name from the DropBox
    Then The State will be displayed

     Scenario: Validating Zip text field
    Given     User is on the Registration Page
    When User fills the 5 digit Zip code using Numbers only
    Then The Zip will be displayed
    
      Scenario: Validating BirthDate dropdown field
    Given     User is on the Registration Page
    When    User selects date od birth from calender
    Then The DateofBirth will be displayed
    
     Scenario: Validating Phone number text field
    Given     User is on the Registration Page
    When    User fills the valid 10 digit Mobile number in Numerics
    Then The Phone number will be displayed
    
     Scenario: Validating UserName text field
    Given     User is on the Registration Page
    When    User fills the valid unique UserName
    Then The User name  will be displayed
    
     Scenario: Validating password text field
    Given     User is on the Registration Page
    When    User fills the valid Password with 1 Upper case, 1 Numeric and 1 special charecter and 8 charecters
    Then The password will be displayed
    
    Scenario Outline:  Validating Registration Page text field with multiple values
      Given User is on the Registration Page
      When User enter FirstName "<fname>", LastName "<lname>" , Address "<add>" , StreetName "<stName>" , City "<city>" , State "<state>" , Zip "<zip>" , BithDate "<dob>" , PhoneNumber "<phn>" , UserName "<userName>" , Password "<pwd>" , Email "<email>"
      
      Then User Successfully SignUp
    	Examples:

			| fname | lname | add   | stName | city  | state | zip   | dob   | phn   | userName | pwd   | email |
			|||| ||||||   |||
			|123_Invalid|Valid  |Valid  |Valid   |Valid   |Valid |Valid  |Valid  |Valid  |Valid     |Valid  |Valid   |
			|Valid |123_Invalid  |Valid  |Valid   |Valid   |Valid |Valid  |Valid  |Valid  |Valid     |Valid  |Valid   |
			|Valid |Valid  |123_Invalid  |Valid   |Valid   |Valid |Valid  |Valid  |Valid  |Valid     |Valid  |Valid   |
			|Valid |Valid  |Valid  |123_Invalid   |Valid   |Valid |Valid  |Valid  |Valid   |Valid      |Valid  |Valid   |
			|Valid |Valid  |Valid  |Valid   |123_Invalid   |Valid |Valid  |Valid  |Valid  |Valid     |Valid  |Valid   |
			|Valid |Valid  |Valid  |Valid   |Valid   |123_Invalid |Valid  |Valid  |Valid  |Valid     |Valid  |Valid   |
			|Valid |Valid  |Valid  |Valid   |Valid   |Valid |123_Invalid  |Valid  |Valid  |Valid     |Valid  |Valid   |
			|Valid |Valid  |Valid  |Valid   |Valid   |Valid |Valid  |123_Invalid  |Valid  |Valid     |Valid  |Valid   |
			|Valid |Valid  |Valid  |Valid   |Valid   |Valid |Valid  |Valid    |123_Invalid|Valid     |Valid  |Valid   |
			|Valid |Valid  |valid  |Valid   |Valid   |Valid |Valid  |Valid    |Valid  |  |Valid   |Valid   |
			|Chaman |Sharma  |1234  |CLoud  |Wichita   |Kansas |45634  |12-09-2019  |1231232344  |shweta     |123_Invalid  |s@s.com   |
