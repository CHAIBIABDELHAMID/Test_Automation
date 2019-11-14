Feature: Navigation Menu

Background: User Is Logged In
	Given Navigate to "amarla" on "qa" Login page and connect
	
	
	

Scenario: Test
	Given This is a test

@test
Scenario Outline: Check All Role Menu
	When Role <role> is selected
	And  The default menu is correct
	When Navigate from menus
	Then Menu is correctly displayed
	Examples:
	| role |
	| STM  |
	| REG  |
	| DIV  |
