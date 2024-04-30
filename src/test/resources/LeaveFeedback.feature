Feature: Leave a feedback Scearios

  @LeaveFeedback @regression
  Scenario Outline: Validating the My profile modules functionality
    Given I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I am on homepage
    And I click on "Leave a Feedback" from menu
    Then I am on "FEEDBACK" Screen
    And I give rating and enter feedback to the app
    And I click on submit button
    And I click on "Logout" from menu
   
     
    Examples: 
      | username   | password | 
      | 1000009148 |        1 | 
