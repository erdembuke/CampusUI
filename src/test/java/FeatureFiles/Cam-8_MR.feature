Feature: Uploading file in system as an attachment to the courses

  Scenario: Upload PDF file to the system as attach

    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

    And Click on the element in NavigationTabs
      | calendarTab |

    And Click on the element in Dialog Content
      | courseFizik    |
      | attachmentBtn  |
      | addAttach      |
      | typeBtn        |
      | homeWorkBtn    |
      | selectItemBtn  |
      | fromMyFilesBtn |
      | uploadFile     |
      | selectBtn      |
    Then Success message should be displayed
    Then Count of files attachment on the teacher's Course Meeting

  Scenario: Student should see PDF file to the system as attach

    Given Navigate to Campus
    When Enter "student" username and password with ApachePOI
    Then User should login successfully

    And Click on the element in NavigationTabs
      | calendarTab |
    And Click on the element in Dialog Content
      | courseFizik   |
      | attachmentBtn |
    Then Count of files attachment on the student's Course Meeting
    Then Verify count of the attachment files the teacher and the student