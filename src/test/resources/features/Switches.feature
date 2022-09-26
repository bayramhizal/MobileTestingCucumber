@Switches
Feature: API Demos Switches
  Background:
     Given App should install
    And users go on homepage
    And user should click button api demos
    Then user on api demos page
    And user click preferences button
    Then user on preferences page
    And user click switch
  Scenario: Switch test
    And user click checkbox
    Then user click switch button
    Then takescreenshot
    Scenario: Switch button checks
      And checkbox should checked
      And first switchbutton should close
      And second switchbutton should be opened
      Then takescreenshot


