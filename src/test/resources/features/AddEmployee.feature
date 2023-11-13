Feature: Admin Add an Employee in HRM Application

  Background:
    When user enters admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

  @empAdd @test
  Scenario: Adding one employee in the hrms system

    #Given user is navigated to HRMS application
      # { It's a starting Step of this Scenario and This Step come from Hooks class.
      # In Hooks class have Before Tags that Tag run this step.
      # Before Tag have a Start Method  who come from CommonMethod Class the Method is "openBrowserLunchApplication();"}
    When user enters firstName middleName and lastName
    And user clicks on save button
    Then employee added successfully
    #Then user closes the browser
     # { It's a starting Step of this Scenario and This Step come from Hooks class.
      # In Hooks class have End Tags that Tag run this step.
      # Before Tag have a Start Method  who come from CommonMethod Class the Method is "openBrowserLunchApplication();"}

  @2ndempAdd
  Scenario: Adding one employee using feature file

    When user enters "miraj" and "fali" and "moralejo"
    And user clicks on save button
    Then employee added successfully