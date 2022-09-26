Feature: Popup
  Scenario: Popup Test
    Given App should install
    And users go on homepage
    And user should click button "api demos"
    Then user on "api demos" page
    And user click "views"
    Then user on "views" page
    And user click"Popup Menu"
    And user click make popup menu
    And user click "Search"
    Then takescreenshot
    Then verify popup message