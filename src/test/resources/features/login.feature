Feature: Login in Swag Labs app

  Background:
    Given That user open Swag Labs app

  @successful
  Scenario: Login successfull
#    Given That user open Swag Labs app
    When he submit username and password
      | username      | password     |
      | standard_user | secret_sauce |
    Then he should be logged in

  @locked
  Scenario: Login Locked
#    Given That user open Swag Labs app
    When he submit username and password
      | username      | password     |
      | locked_out_user | secret_sauce |
    Then he should be error message