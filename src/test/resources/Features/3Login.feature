Feature: Login Page
@driversetup
  Scenario: Validating the url
    Given user is  on browser
    When user opens LMS Website
    Then user is on Login Page

  Scenario Outline: Validating with different login credentials
     Given User lands on Login Page
     When User enters email "<emailid>", password "<Pwd>" and Error "<error>"
     Then User successfully  login
     Examples:
    |emailid |Pwd |error      |
    |   | |Please enter fields|
    |lms| |Please enter fields|
    |   |lms|Please enter fields|
    |lms|lms|Please enter fields|
   
   
    
   
    