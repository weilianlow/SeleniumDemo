#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@regression
Feature: Google Page Navigation
  I want to use this template for my feature file

  Background: 
		Given User is at Page "https://www.google.com.sg"

  @seleniumie
  Scenario Outline: Google Search 1
    When User enters "<value>" in search textfield
    And User clicks on search button
    And User clicks on images hyperlink
    Then images will be shown in grid format

    Examples: 
      | value       |
      | Hello World |
 
  @seleniumchrome
  Scenario Outline: Google Search 2
    When User enters "<value>" in search textfield
    And User clicks on search button
    And User clicks on images hyperlink
    Then images will be shown in grid format

    Examples: 
      | value       |
      | Hello World |
