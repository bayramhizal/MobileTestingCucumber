@Ready
Feature: Ready Method
  Scenario: ready method
    Given App should install
    And users go on homepage
    And  user click "API Demos"
    Then user on "API demos" page
    And user click "Views"
    Then user on "Views" page
    And user click "Drag and Drop"
