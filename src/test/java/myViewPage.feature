Feature: I want to check the existence of all buttons in the My view page

  @smoke
  Scenario:  Check Report Issue button
    Given I am on the MantisBT Home Page
    When I click Report Issue button
    Then I should see new issue page