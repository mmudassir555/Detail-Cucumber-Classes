Feature: Login Scenarios

  @login @test
  Scenario: Valid admin login
    #Given user is navigated to HRMS application
    # { It's a starting Step of this Scenario and This Step come from Hooks class.
      # In Hooks class have Before Tags that Tag run this step.
      # Before Tag have a Start Method  who come from CommonMethod Class the Method is "openBrowserLunchApplication();"}
    When user enters admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    #Then user closes the browser
     # { It's a starting Step of this Scenario and This Step come from Hooks class.
      # In Hooks class have End Tags that Tag run this step.
      # Before Tag have a Start Method  who come from CommonMethod Class the Method is "openBrowserLunchApplication();"}