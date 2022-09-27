Feature: LMS Website Registration page

  @driversetup
  Scenario: Validating the heading of Registration form
    Given User is on LMS website
    When User lands on Registration page
    Then User sees the heading on the form as "Registration Form"

  Scenario: Validating Login Button visibility
    Given User is on the Register Page
    When User selects the Log in button
    Then User sees a button with text "Log in" on the form

  Scenario: Validating the Login button functionality
    Given User is on the Register Page
    When User selects the Log in button
    Then User lands on Log in page

  Scenario: Validating the Sign Up button visibility
    Given User is on LMS website
    When User lands on Registration page
    Then User sees a button with text "Sign Up" on the form
