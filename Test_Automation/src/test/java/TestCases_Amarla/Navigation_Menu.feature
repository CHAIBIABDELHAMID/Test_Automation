Feature: Navigation Menu

Background: User Is Logged In
	Given Navigate to "amarla" on "qa" Login page
	When Submit username and password
	Then Homepage is Displayed
	
	
	
@test
Scenario: Test
	Given This is a test

@test
Scenario Outline: Check STM Role Menu
	Given Role <role> is selected
	And Default page is displayed
	When Navigate from menus
	Then Menu is correctly displayed
	Examples:
	| role |
	| STM  |
	| REG  |
	| DIV  |
