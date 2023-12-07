Feature: feature to open dsago url and get started

  Scenario: validate dsalgo url
    Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter credentials username as "success"
    And user left password box empty ""
    And user click login button
    Then it should display message

  Scenario: validate dsalgo url sec case
    Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter credentials username as empty ""
    And user enter password as "wefour04"
    And user click login button
    Then it should display message for second case

  Scenario: validate dsalgo url third case
    Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter wrong username as empty "wrongusernam"
    And user enter wrong password as "wrongpassnam"
    And user click login button
    Then it should display message for third case

  Scenario: validate dsalgo url fourth case
    Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter correct username as empty "success"
    And user enter correct password as "wefour04"
    And user click login button
    Then it should go to home page by showing username on top

  