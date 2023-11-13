Feature: Employee Search

  Background:
   # Given user is navigated to HRMS application
     # { It's a starting Step of this Scenario and This Step come from Hooks class.
      # In Hooks class have Before Tags that Tag run this step.
      # Before Tag have a Start Method  who come from CommonMethod Class the Method is "openBrowserLunchApplication();"}
    When user enters admin username and password
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on Employee List option

  @searchById @test
  Scenario: Search an employee by ID
    # { All "same/Common" scenario are write in "BackGround Keyword" until Scenario: will change
        # Given user is navigated to HRMS application
        # When user enters admin username and password
        # And user clicks on login button
        # Then admin user is successfully logged in
        # When user clicks on PIM option
        # And user clicks on Employee List option
    # }
    When user enters employee id
    And user clicks on search button
    Then user should be able to see employee details
    #Then user closes the browser
     # { It's a starting Step of this Scenario and This Step come from Hooks class.
      # In Hooks class have End Tags that Tag run this step.
      # Before Tag have a Start Method  who come from CommonMethod Class the Method is "openBrowserLunchApplication();"}

  @searchByName
  Scenario: Search an employee by Name
      # { All "same/Common" scenario are write in BackGround Keyword until Scenario: will change
        # Given user is navigated to HRMS application
        # When user enters admin username and password
        # And user clicks on login button
        # Then admin user is successfully logged in
        # When user clicks on PIM option
        # And user clicks on Employee List option
    # }
    When user enters employee name
    And user clicks on search button
    Then user should be able to see employee details
    #Then user closes the browser
     # { It's a starting Step of this Scenario and This Step come from Hooks class.
      # In Hooks class have End Tags that Tag run this step.
      # Before Tag have a Start Method  who come from CommonMethod Class the Method is "openBrowserLunchApplication();"}