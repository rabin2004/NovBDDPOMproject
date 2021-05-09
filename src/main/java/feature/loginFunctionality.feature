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
Feature: Login functionality
  User will be able to access application providing valid credentials. 

  @tag1
  Scenario: Postive login functionality test by clicking submit button
  	Given user is in home page
  	When user provides valid username
  	And provides valid password
  	And clicks submit button
  	Then user should be able to login
  	
  Scenario: Postive login functionality test by hitting enter
  	Given user is in home page
  	When user provides valid username
  	And provides valid password
  	And hits enter
  	Then user should be able to login
  	
  Scenario: Negative login functionality test using invalid username and invalid password
  	Given user is in home page
  	When user provides invalid username
  	And provides invalid password
  	And hits enter
  	Then user should not be able to login
  	
  Scenario: Postive login functionality test in Sign-On page
  	Given user is in Sign on page
  	When user provides valid username
  	And provides valid password
  	And clicks submit button
  	Then user should be able to login
  	
  Scenario Outline: Postive login functionality test using multiple datas
  	Given user is in home page
  	When user provides valid "<username>"
  	And provides valid "<password>"
  	And clicks submit button
  	Then user should be able to login
  	
  	Examples:
  	|username|password|
  	|test123|123|
  	|test		|123|
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
