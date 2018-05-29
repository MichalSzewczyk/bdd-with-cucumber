Feature: Small duck should not be flying and quacking
  Small duck should behave in shy way - no flying and quacking

  Scenario: Duck should not quack
    Given there is 1 duck
    When duck is asked to quack
    Then duck no quack