@APPSwipe
  Feature:App Demos Swipe
    Scenario: Swipe test
      Given App should install
      And users go on homepage
      And user should click button "API Demos"
      Then user on "API Demos" page
      And user click "Views"
      Then user on "Views" page
      And user click "Date Widgets"
      Then user on "Views/Date Widgets" page
      And user click "2. Inline"
      And user click 9
      And user from 15 to 45 swipe


