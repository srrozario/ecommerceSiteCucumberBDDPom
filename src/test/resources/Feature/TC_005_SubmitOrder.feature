Feature: Order submission
  @submitOrder
  Scenario: Submit order to complete the purchase journey
    Given User wants to submit the order
    When User clicks on the place order button
    Then Order submission journey completes
    And Sign out from the site and close the browser