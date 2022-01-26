@moviesByResponseValidation
Feature: Find Movie by Title and Validate Complete Body Response

  @byResponseValidation
  Scenario: Find movie by Title and validate body
    When I search by a word "?t=test" and year 2021 validate "The Beta Test" in response
    Then scheme validation is correct for url "?t=test"

