Feature: Test Me parameterisation

  Scenario Outline: Test me login formultiple users
    Given I am launching the TestMe application in chrome
    And I click on signin link
    When I provide username "<Uname>"
    And I provide password "<Pswd>"
    Then I click on logon and verify the login status

    Examples: 
      | Uname  | Pswd   |
      | asdfgh | asdfgh |
      | poiuyt | poiuyt |
      | zxcvbn | zxcvbn |
      | qwerty | qwerty |