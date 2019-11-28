Feature: Navigation Menu

Background: User Is Logged In
	Given Navigate to "amarla" on "qa" Login page and connect
	
	
	

Scenario: Test
	Given This is a test

@test
Scenario Outline: Check All Roles Menu
	When Role <role> is selected
	And  The default page is displayed
	When Navigate from menus
	Then Menu is correctly displayed
	Examples:
	| role |
	| REG  |
	| COR  |
	| DIV  |
	| REG  |