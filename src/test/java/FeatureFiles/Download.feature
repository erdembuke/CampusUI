Feature: Search Functionality

  Background:
    Given Navigate to Campus
    When Enter "student" username and password with ApachePOI
    Then User should login successfully

  Scenario: Download Click Test
    And Click on the element in NavigationTabs
      | calendarTab |
      | previous |
    And Click on the element in Dialog Content
      | courseFizik |
      | attachmentBtn |
    Then Verify the download button clickable

    And Click on the element in AC
      | downloadButton |
