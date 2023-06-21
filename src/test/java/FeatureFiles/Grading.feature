Feature: Grading functionality

  Background:
    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

  Scenario: Giving notes to students

    Given Click on the element in NavigationTabs
      | gradingTab |

    And Click on the element in Dialog Content
      | courseTermGrades  |
      | courseBtn         |
      | chooseCourseFizik |
      | noteStudent_3_11B |

    And User sending the keys in Dialog Content
      | noteBox | Good Job |

    And Click on the element in Dialog Content
      | paperPlaneBtn |

    And close message box and open again

    Then Verify that message has been sent successfully
      | Good Job |



