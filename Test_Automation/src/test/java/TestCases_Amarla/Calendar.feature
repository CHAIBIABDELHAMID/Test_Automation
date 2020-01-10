Feature: Calendar

Background: User Is Logged In
	Given Navigate to "amarla" on "qa" Login page and connect
	Then  Home page is displayed
	
	
	
@Calendar
Scenario Outline: Calendar Default Display For role COR,DIV
	Given Role <role> is selected
	Then Calendar menu is selected
	And Page Title is displayed
	And Navigation buttons are displayed
	And Variance color display default color
	And Pencil icon is displayed
	And Displayin is displayed
	And Colored by is displayed
	And Segment is displayed
	And Legends are displayed
	Examples:
	| role |
	| COR  |
	| DIV  |
	
	
@Calendar
Scenario: Calendar Default Display For role STM
	Given Select role "STM"
	Then Calendar menu is selected
	And Page Title is displayed
	And Navigation buttons are displayed
	And Summary table is displayed
	And Variance color display default color
	And Pencil icon is displayed
	And Displayin is displayed
	And Colored by is displayed
	And Legends are displayed	
	
@Calendar
Scenario: Calendar Default Display For role REG
	Given Select role "REG"
	Then Calendar menu is selected
	And Page Title is displayed
	And Navigation buttons are displayed
	And Summary table is displayed
	And Variance color display default color
	And Pencil icon is displayed
	And Displayin is displayed
	And Colored by is displayed
	And Legends are displayed
	
@Calendar
Scenario Outline: Weeks are displayed from Week1 to Week52
	Given Role <role> is selected
	Then Weeks are displayed from Week1 to Week52
	Examples:
	| role |
	| COR  |
	| DIV  |
	| REG  |
	| STM  |
@Calendar	
Scenario: Weather icons display weather in celsuis
	Given Select role "STM"
	Then  Weather icons are displayed for all days
	And   Weather is in Celsuis
	
@Calendar		
Scenario: Fiscal month navigation
	Given Select role "STM"
	Then Navigation buttons are displayed
	When Click on next month
	Then Next month is displayed
	When Click on previous month
	Then Previous month is displayed
	When Click on next year
	Then Next year is displayed
	When Click on last year
	Then Last year is displayed

@Calendar
Scenario: Store Day for today
	Given Select role "STM"
	Then Today is highlighted Bold
	When Click on today from the calendar
	Then Store Day page for today is displayed
	
	@test
Scenario: Store Day for yesterday is displayed
	Given Select role "STM"
	Then Today is highlighted Bold
	When Click on yesterday from the calendar
	Then Store Day page for yesterday is displayed