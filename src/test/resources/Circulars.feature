Feature: Circulars Scearios
#Dependent on core ERP data.
  @Circulars @regression
  Scenario Outline: Validating the Circular module funtionality
    Given I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I am on homepage
    And I select "Circulars"
    Then I am on "CIRCULARS" Screen
    And I select the "<data number>" from circulars
    Then I am on "CIRCULAR DETAILS" Screen
    And I click back "<number of times>" times
    Then I click on "Logout" from menu
       
    Examples: 
      | username   | password | data number |number of times|
      | 1000009148 |        1 |   3         |2              |
