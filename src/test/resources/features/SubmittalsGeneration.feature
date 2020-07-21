@Smoke @Submittals
Feature: Submittals generation
  Scenario: Verify submittal generation process
    Given User opens Hilti US website
    When User navigates to Firestop submittal generator page
    And User starts submittal generation process
    And User selects Firestop systems: (choose three)
    And User creates submittal
    And User deselects Firestop products: (choose one)
    And User selects submittals options: no cover page, do not include page numbers
    And User finalizes submittal generation process
    Then User can download the generated document