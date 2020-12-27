Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is launch
    And user is on login page
    When user enters <username> and <password>
    And user invoks login button
    Then user is navigated to the home page

    Examples: 
      | username       | password |
      | Jessy Mendiola |    12345 |
      | Kc             |    12345 |
      | Yoo Seung Ho   |    12345 |
