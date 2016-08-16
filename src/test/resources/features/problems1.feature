@all
Feature:
  Problem 1 -  "Multiples of 3 and 5"

  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.

  Scenario: Get the sum of all multiples below 10
    Given that the maximum number is 10
    Then sum would be 23

  Scenario: Get the sum of all multiples below 11
    Given that the maximum number is 11
    Then sum would be 33

  Scenario: Get the sum of all multiples below 1000
    Given that the maximum number is 1000
    Then sum would be 233168

