@moviesByPartlyBodyValidation
Feature: Find Movie by Title and Validate Response

  @byByPartlyBodyValidation
  Scenario Outline: Find movie by Title and validate statusCode
    When I search by a word "?t=test" and year 2021 validate "<values>" in response
    Examples:
      | values                        |
      | The Beta Test                 |
      | Comedy, Horror, Thriller      |
      | Jim Cummings, PJ McCabe       |
      | English                       |
      | United States, United Kingdom |
      | 4 nominations                 |
