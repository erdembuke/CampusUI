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

          Scenario: Login as a Teacher (Negative-1)

            Given Navigate to Campus
            When Enter "invalidT1" username and password with ApachePOI
            Then Invalid username or password message should be displayed

            Scenario: Login as a Teacher (Negative-2)

              Given Navigate to Campus
              When Enter "invalidT2" username and password with ApachePOI
              Then Invalid username or password message should be displayed

              Scenario: Login as a Student (Negative-1)

                Given Navigate to Campus
                When Enter "invalidS1" username and password with ApachePOI
                Then User should login successfully

                Scenario: Login as a Student (Negative-2)

                  Given Navigate to Campus
                  When Enter "invalidS2" username and password with ApachePOI
                  Then User should login successfully

                  Scenario: Login as an Admin (Negative-1)

                    Given Navigate to Campus
                    When Enter "invalidA1" username and password with ApachePOI
                    Then User should login successfully

                    Scenario: Login as an Admin (Negative-2)

                      Given Navigate to Campus
                      When Enter "invalidA2" username and password with ApachePOI
                      Then User should login successfully






