Feature: Login/Sign up

@sanity
@regression
  Scenario: Google signin
    Given the home page of the website
    When click login/signup
    And click google
    And enter invalid email id as "abc@gmail.com"
    Then capture the error message displayed
