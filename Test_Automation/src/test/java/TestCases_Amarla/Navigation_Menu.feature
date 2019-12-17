Feature: Navigation Menu

Background: User Is Logged In
	Given Navigate to "amarla" on "qa" Login page and connect
	Then  Home page is displayed
	
	



@Associate_Navigation
Scenario Outline: Associate Navigation
	When Role <role> is selected
	And  The default page is displayed
	When Navigate from menus
	Then Menu is correctly displayed
	Examples:
	| role |
	| REG  |
	| COR  |
	| DIV  |
	| STM  |