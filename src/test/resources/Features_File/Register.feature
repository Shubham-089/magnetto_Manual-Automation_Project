Feature: User Registration on Magento Site

  Scenario: Successful Registration
    Given User is on the registration page
    When User enters first name "shubham"
    And User enters last name "Patil"
    And User enters email "yetondeshubham865@gmail.com"
    And User enters password "Pass@12345"
    And User enters confirm password "Pass@12345"
    And User clicks on create account button
    Then User should be registered successfully
