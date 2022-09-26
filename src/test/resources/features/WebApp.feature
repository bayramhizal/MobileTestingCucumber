Feature:App WebView
  Scenario: WebView
    Given App should install
    And users go on homepage
    And user should click button "API Demos"
    Then user on "API Demos" page
    And user click "Views"
    Then user on "Views" page
    And user click "WebView"