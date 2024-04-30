Feature: My Profile scenarios

  @regression @Myprofile @PersonalDetails
  Scenario Outline: Validating the My profile modules functionality
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I am on homepage
    Then I click on "My Profile" from menu
    And I click on "<Modulename>"
    Then I am on "<Modulename>" page

    Examples: 
      | username   | password | Modulename |
      | 1000009148 |        1 | Personal   |

  @regression @Myprofile @ParentDetails
  Scenario Outline: Validating the Parent modules functionality
    When I click on "<Modulename>"
    Then I am on "<Modulename>" page

    Examples: 
      | Modulename |
      | Parent     |

  @regression @Myprofile @Disciplinary
  Scenario Outline: Validating the My profile modules functionality
    When I click on "<Modulename>"
    Then I am on "<Modulename>" page

    Examples: 
      | Modulename   |
      | Disciplinary |

  @regression @Myprofile @Documents
  Scenario Outline: Validating the Documents modules functionality
    When I click on "<Modulename>"
    Then I am on "<Modulename>" page

    Examples: 
      | Modulename   |
      | Disciplinary |

  @regression @Myprofile @FeePayer
  Scenario Outline: Validating the Documents modules functionality
    When I click on "<Modulename>"
    Then I am on "<Modulename>" page

    Examples: 
      | Modulename |
      | Fee Payer  |

  @regression @Myprofile @MedicalCondtions
  Scenario Outline: Validating the Documents modules functionality
    When I click on "<Modulename>"
    Then I am on "<Modulename>" page
    And I click on Add button
    Then I add medical condtions with "<condtiontype>"
    Then I click on "Logout" from menu 

    Examples: 
      | Modulename | condtiontype |
      | Medical    | Fit          |
