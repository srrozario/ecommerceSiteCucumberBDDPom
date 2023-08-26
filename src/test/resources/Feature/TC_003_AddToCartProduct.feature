Feature: Add to cart product
  @addToCart
  Scenario: Add to cart a selected product
    Given User wants to add to cart a specific product
    When User scroll down to the add to cart button
    And User selects color and size
    And User clicks on the add to cart button
    And User scroll up to top
    And User clicks on the proceed to checkout button
    Then User navigates to the checkout page