Feature:


  Scenario: Validate team has only 4 foreign players
    Given I have the response
    Then Validate team has 4 foreign player


    Scenario: Validate atleast one wicket keeper is in team
      Given I have the response
      Then Atleast 1 wicket keeper in team
