
Feature: Calendar functionality

  Background:
    Given Navigate to Campus
    When Enter "teacher" username and password with ApachePOI
    Then User should login successfully

  Scenario: Planning a course

    And Teacher-layout wait for load
    And Click on the element in NavigationTabs
      |calendarTab|

    And Click on the element in Dialog Content
      |addBtn|
      |coursePopUpBtn|
      |kimya11BTestPopUp|
      |periodsPopUpBtn|
      |period_11_00|
      |saveBtn|

    Then Success message should be displayed

  Scenario: Monitorizing weekly and monthly basis courses in Calendar Feature

    And Teacher-layout wait for load

    And Click on the element in NavigationTabs
      |calendarTab|

    And Click on the element in Dialog Content
      |calendarBtn|

    Then Verify that all courses are displayed on weekly basis
