Feature: check list
  As QA
  I want to Select the number of passengers
  To verify the selection function number of people traveling

  Background: cookies
    Given the user is on the volotea page
    When to close cookies

  Scenario Outline: check list
    When click on the passenger '<Adult>','<Child>','<Babys>'
    Then check that the number of passenger
    Examples:
      | Adult | Child | Babys |
      | 1     | 0     | 0     |
      | 0     | 0     | 0     |
      | 6     | 6     | 3     |



