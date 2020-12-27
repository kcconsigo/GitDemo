Feature: Check login functionality

  Scenario: 
    Given user is on the page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the web page
