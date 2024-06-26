Feature: Auth

  Scenario: Successful authorisation
    Given open "https://www.saucedemo.com/"
    When user input login "standard_user"
    And user input password "secret_sauce"
    And user click Login
    Then user sees Title
    And Title has text "Products"