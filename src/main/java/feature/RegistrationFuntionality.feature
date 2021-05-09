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
@tag
Feature: Registration funcitionality
  New user should be able to register to the application using this functionality

  @tag2
  Scenario Outline: Positive registration functionality
  	Given user is in register page
  	When user provides "<username>", "<password>" and "<confirmPassword>"
  	And clicks submit button
  	Then "<username>" should be able to register
  	
    Examples: 
      | username  | password | confirmPassword  |
      | tom12 | 123 | 123 |
      | david12 | 123 | 123 |
