Feature: Adding products to the cart

  Scenario: Add a product to the cart
    Given I navigate to the product page
    When I add the product to the cart
    Then I should see the product in my cart

