Feature: login
#

#  Scenario:
#    Given I am valid user on start of i.ua page
#    When I try to login with valid credentials
#    Then I've logged in successfully
#  @Login
#  Scenario Outline:
#    Given I am valid user on start of i.ua page
#    When I try to login with <username> and <password>
#    Then I've logged in successfully
#    Examples:
#      |password|username|
#      |"Summer202!" |   "hillel.summer2021@i.ua" |
#      |"hillel.summer2021@i.ua"|"Summer202"      |
  Scenario:
    Given I am valid user on start of i.ua page
    When I try to login with
      |hillel.summer2021@i.ua|Summer202!|
    Then I've logged in successfully

