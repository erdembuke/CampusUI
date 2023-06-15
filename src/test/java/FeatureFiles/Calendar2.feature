Feature: Calendar functionality

  Background:
    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully


    Scenario: Calendar Button Functionality Tests

      And Teacher-layout wait for load
      And Click on the element in NavigationTabs
        |calendarTab|

      And click on course meeting
      |fizikBtn|

      And make sure all buttons are clickable
