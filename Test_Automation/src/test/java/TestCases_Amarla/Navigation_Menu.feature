Feature: Navigation Menu

Background: User Is Logged In
	Given Navigate to "amarla" on "qa" Login page
	When Submit username and password
	Then Homepage is Displayed
	
	
	
@test
Scenario: Test
	Given This is a test
	
Scenario: Check STM Role Menu
	Given Role "STM" is selected
	And Default page is displayed
	When Navigate from menus
	Then Menu is correctly displayed

