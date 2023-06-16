Feature: Taking an excel report of grades with Grading Feature

  Background:
    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

  Scenario: Taking an excel report of grades

    And Click on the element in NavigationTabs
      | gradingTab |

    And Click on the element in Dialog Content
      | courseTermGrades  |
      | courseBtn         |
      | chooseCourseFizik |
      | excelExportBtn    |