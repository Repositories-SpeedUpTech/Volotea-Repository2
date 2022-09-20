Feature: check list
  As QA
  I want to Select the number of passengers
  To verify the selection function number of people traveling

  Background: cookies
    Given the user is on the volotea page
    When to close cookies

  Scenario Outline: check list
    When click on the passenger '<Adult>','<Child>','<Babys>'
    When the user enter '<Start>' and the user enter '<Finish>'
    Then the use user can view flight details
    Examples:
      | Adult | Child | Babys | Start    | Finish   |
      | 1     | 1     | 1     | Alicante | Asturias |
