Feature: linked list feature

  Background: 
    Given user already logged to home page by signin
      | username  | password |
      | success  | wefour04 |

  Scenario: Linked list page
    Given user is on home page
    When user clicks on the get started button Linkedlist section
    Then linked list opens up
   
    Given User is on linklistPage
    When User clicks on "Introduction" button
    Then User should be redircted to "Introduction" page
    When User gets linked list Section
      | Introduction         |
      | Creating linked list |
      | Types of Linked list |
      | Implementation       |
      | Traversal            |
      | Insertion            |
      | Deletion             |
      | practice question    |
    And linked list section count should be 8
    When User clicks on Try Here button
    Then User should be redirected to next page
    When User enters the text in the TextBox "print(Hello)"
    And Clicks on the Run button
    Then Result is displayed on the console
