Feature: auth
  As a user
  I want to be able to authenticate
  So that I can access protected areas of the application

  Scenario: validate user can login
    Given user is on the login page
    When user enters valid credentials
    And user clicks on the login button
    Then user should be redirected to the homepage

  Scenario: validate user can logout
    Given user is logged in
    When user clicks on the logout button
    Then user should be redirected to the login page
