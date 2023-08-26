Feature: LoginTest
  @login
  Scenario Outline: User login
    Given User lands on the login page
    When Click on the sign-in button
    And Insert user '<email>' and '<password>'
    And Clicks on the add customer button
    Then Go to the next page
    Examples:
      | email               | password |
      |sajibstream@gmail.com|July2023  |
