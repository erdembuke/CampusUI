Feature: Course Functionality

  Background:
    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

    Scenario: Monitorizing the courses in Home Page
      And Teacher-layout wait for load

      Then Verify that all courses are displayed on Home Page

      Scenario: Monitorizing the details of courses in Course Feature
        And Click on the element in Dialog Content
        |fizikDetailsBtn|

        Then Verify that course cirruculum on displayed page

  Scenario: Sending a text during the live session in Video Conference Feature

    And Click on the element in NavigationTabs
      |calendarTab|

    And Click on the element in Dialog Content
      |courseFizik|
      |joinBtn|
      |joinBtn2|

    And Click on the element in AC
      | listeningBtn |


