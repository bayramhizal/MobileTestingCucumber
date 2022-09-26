
Feature: Api demos scroll
 Background: scroll
#  Scenario: scroll test
  Given App should install
  And users go on homepage
  And user should click button "API Demos"
  Then user on "API Demos" page
   And user click "Views"
  Then user on "Views" page

   Scenario:Scrolling test
    And user click switches screen
    Scenario: Scrollling Test uiscrollable
     And user click "Switches" button
     @tests
     Scenario: scroll with reusable method
      And  user click "Switches" buttons


