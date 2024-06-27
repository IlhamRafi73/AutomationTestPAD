Feature: Project


  Scenario: validate user can login
    Given user is on the login page
    When user enters valid credentials
    And user clicks on the login button
    Then user should be redirected to the homepage

  Scenario: add project
    Given user is on dashboard
    When user navigates to project page
    And user click button add project
    And user submit a project
    Then the new project should appear on project page

  Scenario: delete project
    Given user is on project page
    When user click button delete project
    And confirm to delete data
    Then deleted data is not displayed

  Scenario: validate user can logout
    Given user is logged in
    When user clicks on the logout button
    Then user should be redirected to the login page