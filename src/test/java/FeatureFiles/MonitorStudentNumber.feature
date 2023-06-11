Feature: Monitorizing the number of studens in Home Page

  Background:
    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

    Scenario: Navigate through burger menu to see students
      Given Click on the element in NavigationTabs
      |burgerMenu|
      And Click on the element in Dialog Content
      |burgerStudent|
      |burgerStudent2|

      Then Verify the number of student from bottom of the page

