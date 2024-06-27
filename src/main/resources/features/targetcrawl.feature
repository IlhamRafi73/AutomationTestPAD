Feature: Target Crawling

  Scenario: validate user can login
    Given user is on the login page
    When user enters valid credentials
    And user clicks on the login button
    Then user should be redirected to the homepage

  Scenario: Add target crawling
    Given user has selected a project
    When user navigates to target crawling page
    And user click button add target crawl
    And user submit a target crawl
    Then the new target crawl should appear on target crawling page

#  Scenario: Delete target crawling
#    Given user is on target crawling page
#    When user click button delete target crawl
#    And confirm to delete target crawl
#    Then Then deleted data is not displayed
