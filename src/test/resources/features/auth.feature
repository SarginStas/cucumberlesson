Feature: Auth

  Scenario: Successful authorisation
    Given open "https://www.saucedemo.com/"
    When user input login "standard_user"
    And user input password "secret_sauce"
    And user click Login
    Then user sees Title
    And Title has text "Products"

  Scenario: Unsuccessful authorisation AR
    Given open "https://www.saucedemo.com/"
    When user input login "locked_out_user"
    And user input password "secret_sauce"
    And user click Login
    Then user sees Error
    And Error has text "Epic sadface: Sorry, this user has been locked out."