@AppDem
Feature: API Demo test

  Scenario: Text box data send
    Given App should install
    And users go on homepage
    And user should click button api demos
    Then user on api demos page
    And user click preferences button
    Then user on preferences page
    And user click preferences dependecies
    And user check wifi
    And user click wifi settings
    Then user sees wifi settings popup
    And user write test "text"
    And user click ok button


