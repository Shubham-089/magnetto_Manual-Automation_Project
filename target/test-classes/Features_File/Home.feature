Feature: Search and browse products  homepage

  Scenario: Searching for a product
    Given I navigate to the homepage
    When I search for a product "T-shirt"
    Then I should see the product details

  Scenario: Clicking on a product and viewing its details
    Given I navigate to the homepage
    When I click on a product
    Then I should see the product details
