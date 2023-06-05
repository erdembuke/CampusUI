# All login scenarios. Teacher & Student & Admin

  Feature: Login Functionality

    Scenario: Login as a Teacher

      Given Navigate to Campus
      When Enter "teacher" username and password with ApachePOI
      Then User should login successfully

      Scenario: Login as a Student
        Given Navigate to Campus
        When Enter "student" username and password with ApachePOI
        Then User should login successfully

        Scenario: Login as an Admin

          Given Navigate to Campus
          When Enter "admin" username and password with ApachePOI
          Then User should login successfully





