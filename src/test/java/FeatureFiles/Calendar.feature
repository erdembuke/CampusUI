
Feature: Calendar functionality

Background:
  Given Navigate to Campus
  When Enter "teacher" username and password with ApachePOI
  Then User should login successfully

  Scenario: Planning a course

    Given Click on the element in NavigationTabs
      |calendarTab|

    And Click on the element in Dialog Content
      |addBtn|

    And Click on the element in Dialog Content
      |coursePopUpBtn|

    And Click on the element in Dialog Content
      |kimya11BTestPopUp|

    And Click on the element in Dialog Content
      |periodsPopUpBtn|

    And Click on the element in Dialog Content
      |period_11_00|

    When Click on the element in Dialog Content
      |saveBtn|

    Then Success message should be displayed