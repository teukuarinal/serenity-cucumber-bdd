# Getting started with Serenity and Cucumber

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

### The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
      + starter
        + helpers
        + stepdefinitions
    + resources
      + features                  Feature files
        github.feature
```

### The sample scenario
Sample project uses the sample Cucumber scenario. In this scenario, Arinal (who likes to search for username) is performing a search on the internet:

```Gherkin
Feature: Github search user

  Scenario: User can search username arinal
    Given Arinal is on github home page
    And Arinal search for "teukuarinal"
    When Arinal click user button with username "teukuarinal" and name "Teuku Arinal"
    Then Arinal see Profile with name "Teuku Arinal"
```

### How much scenario in this Project ?
This project have 3 scenario:
1. Searching username "teuku arinal"
2. Searching username "elangbayu"
3. Searching username by Scenario Outline (With Examples Table)

### How to run the Project ?
1. If you want to run all scenario use:
   ```
   mvn clean verify
   ```
2. If you want to run just one project use:
   ```
   mvn clean verify -D"cucumber.filter.tags=@GithubArinal"
   ```
   or
   ```
   mvn clean verify -D"cucumber.filter.tags=@GithubElang"
   ```
   or
   ```
   mvn clean verify -D"cucumber.filter.tags=@GithubExamples"
   ```

# Thankyou for visiting my Project :)
