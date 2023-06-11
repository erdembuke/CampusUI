Feature: Search Functionality

  Scenario: Monitorizing assignments in Assign Feature
      Given Navigate to Campus
      When Enter "student" username and password with ApachePOI
      Then User should login successfully

      Given Click on the element in NavigationTabs
        |assignmentTab|

      And Click on the element in Dialog Content
      |fizikAssignment|

      Then Verify that homeworks is published on diplayed page

    Scenario: Searching Assignments with different sections
      Given Navigate to Campus
      When Enter "teacher" username and password with ApachePOI
      Then User should login successfully

      Given Click on the element in NavigationTabs
      |assignmentTab|

      And Enter "Test" to the name section

      And Select Course from drop down menu

      And Select Type from drop down menu

      And Select Grade Level from drop down menu

      And Click on the element in Dialog Content
      |searchBtn|

      Then Verify that Assignment is displayed on the page