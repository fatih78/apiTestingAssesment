@moviesByTitle
Feature: Find Movie by Title

  @byTitle
  Scenario: Find movie by Title and validate statusCode
    When I search by a word "?t=test" and year 2021 statuscode is 200
    When I search by a word "blabla" and year 2021 statuscode is 400
