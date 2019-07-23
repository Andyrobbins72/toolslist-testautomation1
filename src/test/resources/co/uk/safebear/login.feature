Feature: Login
  In order to access the website
  As a user
  I want to know if my login is successful

  Rules:
  * The user must be informed if the login information is incorrect
  * The user must be informed if the login is successful

  Glossary:
  * User: someone who wants to create a tools list using our application
  * Supporters: this is what the customer calls 'Admin' users

  Background: Logout
    Given I am logged out

    #Start with a tag to denote 'category' of test
    #Outline - runs more than once whereas a Scenario is very specific
    #Use what rather than how when writing scenarios
    #Some tools to think about...
    #Jam - manage all feature files in a way that BAs can understand
    #Xray - allows you manage your AC within jira and plug it into your feature files

  @high-impact
  Scenario Outline: a valid user logs into the application
    #Given I am logged out
    When I enter username "<username>" and password "<password>"
    Then the user is informed that the login is successful
    Examples:
      | username | password |
      | tester   | letmein  |
      | tester1  | letmein  |
      | tester2  | letmein  |

  @to-do
  Scenario: an invalid user attampts to log in
    #Given I am logged out
    When I enter username "attacker" and password "dontletmein"
    Then the user is informed that the login is unsuccessful

  @to-do
  Scenario: user attempts to log in with no password
    #Given i am logged out
    When i enter a username "tester" only
    Then the user is informed
