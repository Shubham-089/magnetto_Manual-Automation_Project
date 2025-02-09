Feature: Checkout process 

  Scenario: Verify payment method options
    Given I proceed to checkout
    Then I should see available payment options
