Feature: Checkout product
  @orderConfirm
  Scenario: Checkout the product to navigate to order confirmation page
    Given User wants to checkout the product
    When User scroll down to next button
    And User clicks on the next button
    Then User navigates to the order confirmation page

