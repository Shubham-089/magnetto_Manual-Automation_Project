Feature: Add product to cart and verify 

  Scenario: Add product to cart
    Given I navigate to the homepage
    When I search for a product "T-shirt"
    And I click on a product
    Then I should see the product details
    When I add the product to the cart
    Then I should see the product in my cart

  Scenario: Verify product price
    Given I navigate to the homepage
    When I search for a product "T-shirt"
    And I click on a product
    Then I should see the product details
    When I add the product to the cart
    Then I should see the product price "$29.99"
