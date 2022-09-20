Feature: destination countries
  As QA
  I want to Select the destination countries
  To verify the selection

  Background: cookies
    Given the user is on the volotea page
    When to close cookies

  Scenario Outline: country box
    When the user enter '<Start>' and the user enter '<Finish>'
    Then the user should see the name '<Country>'
    Examples:
      | Start    | Finish   | Country |
      | Alicante | Asturias | ESPAÑA  |




