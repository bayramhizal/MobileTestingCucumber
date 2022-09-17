@Drag
Feature:APP Action Touch
  Scenario: Drag and drop
    Given App should install
    And users go on homepage
    And user should click button api demos
    Then user on api demos page
    And user click views button
    Then user on views screen
    And user click drag and drop button
    When user leave firstball on secondball
    Then  user sees forthball
    And takescreenshot
