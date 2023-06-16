Feature: Starting a Live Session with Calendar

  Scenario: Add new live session

    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

    And Click on the element in NavigationTabs
      | calendarTab |

    And Click on the element in Dialog Content
      | addBtn            |
      | courseBtn         |
      | chooseCourseFizik |
      | periodsBtn        |
      | periodsL4Btn      |
      | saveBtn           |
    Then Success message should be displayed
    Then Count of Fizik courses on the teacher's Calendar

  Scenario: Student should see the teacher's add a new live session

    Given Navigate to Campus
    When Enter "student" username and password with ApachePOI
    Then User should login successfully

    And Click on the element in NavigationTabs
      | calendarTab |

    And Click on the element in Dialog Content
      | calendarIcon |

    Then Count of Fizik courses on the student's Calendar
    Then Verify count of the courses the teacher and the student
