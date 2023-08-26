Feature: Select Product
  @itemSelection
  Scenario: Select a specific product
    Given User wants to navigate to a specific product details page
    When User Select a specific product category
    And User clicks on a specific product
    Then Navigate to product details page