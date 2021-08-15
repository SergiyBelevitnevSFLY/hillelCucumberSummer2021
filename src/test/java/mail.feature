Feature: mail

  Scenario:
    Given I am valid user on start of i.ua page
    When I try to login with
      |hillel.summer2021@i.ua|Summer202!|
    Then I've logged in successfully
    And I go to mail page
    Then Able to get messages
