Feature: Login scenarios

  @logout-test @Logintest
  Scenario Outline: Validating the logout functionality
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I am on homepage    
    Then I click on "Logout" from menu 
    
    Examples: 
      | username   | password |
      | 1000009148 |        1 |
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

    
 
    
      
      
    
    