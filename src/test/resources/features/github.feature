Feature: Github

  @GithubArinal
  Scenario: User can search username arinal
    Given Arinal is on github home page
    And Arinal search for "teukuarinal"
    When Arinal click user button with username "teukuarinal" and name "Teuku Arinal"
    Then Arinal see Profile with name "Teuku Arinal"

  @GithubElang
  Scenario: User can search username elang
    Given Elang is on github home page
    And Elang search for "elangbayu"
    When Elang click user button with username "elangbayu" and name "Elang Segara"
    Then Elang see Profile with name "Elang Segara"

  @GithubExamples
  Scenario Outline: User can search username examples
    Given <user> is on github home page
    And <user> search for "<username>"
    When <user> click user button with username "<username>" and name "<name>"
    Then <user> see Profile with name "<name>"
    Examples:
      | user   | username    | name         |
      | Arinal | teukuarinal | Teuku Arinal |
      | Elang  | elangbayu   | Elang Segara |
