Feature: Search
  As a user
  I want to search for existing tools and add new or delete tools

  Rules:
  * The user must be shown all tools on login
  * The user must be shown tools that match the search criteria entered
  * The user must be informed if no tools match the search criteria entered
  * The user must be allowed to add a new tool
  * The user must be allowed to delete a tool

  Glossary:
  * User: someone who wants to create a tools list using our application
  * Supporters: this is what the customer calls 'Admin' users

  Background: Logout
    Given I am logged in

  @high-impact
  Scenario Outline: a user searches for an existing tool
    #Given I am logged in
    When I search for tool "<tools>"
    Then the user is shown the tools that match
    Examples:
      | tools     |
      | test      |
      | newtool   |
      | testname  |

  @high-impact
  Scenario: a user searches for a tool but no tool found
    #Given I am logged in
    When I search for tool "notool"
    Then the user is informed that no tools are found

  @low-impact
  Scenario: a user adds a new tool
    #Given I am logged in
    When I add a new tool
    Then the new tool is successfully created

  @low-impact
  Scenario: a user deletes an existing tool
    #Given I am logged in
    When I delete a new tool
    Then the tool is successfully deleted