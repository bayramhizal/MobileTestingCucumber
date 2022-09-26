Feature:App Demos Swipe
  Scenario: Swipe test
    Given App should install
    And users go on homepage
    And user should click button "API Demos"
    Then user on "API Demos" page
    And user click "Views"
    Then user on "Views" page
    And user click "Expandable List"
    Then user on "Views/Expandable List" page
    And user click "1.Custom Adapter"
    And user click "People Names"
    And user click "Chuck" long
    Then user on "Sample Menu" page