
@tag
Feature: linked list feature

  @tag1
  Scenario: Linked list page
    Given user is in home page after logged in
    When user clicks get start btn
    When user select linked list from drop down menu
    Then user is redirected to linked list page
    
       