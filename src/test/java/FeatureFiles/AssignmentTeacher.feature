Feature: Search Functionality

  Background:
    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

  Scenario: Monitorizing assignments in Assign Feature
   And Teacher-layout wait for load

   And Click on the element in NavigationTabs
     |assignmentTab|

    And Click on the element in Dialog Content
      |plus|

    And Select Course from drop down menu

    And User fill out the form in Dialog Content

    And Fill the Text Description

    And Click on the element in Dialog Content
      |saveBtn|
      |apply|

    Then Success message should be displayed
