Feature: Small duck should not be flying and quacking
  Small duck should behave in shy way - no flying and quacking

  Background:
    Given all dependencies injected
    And test driver configured

  Scenario: Duck should not quack
    Given there is a duck
    When duck is asked to quack
    Then duck no quack