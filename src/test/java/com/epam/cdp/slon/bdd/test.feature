Feature: AP Creation


Scenario: Buyer User create Topic
	Given Buyer Login and navigates to AM
	When Buyer choose template
	And enters all required fields
	And clicks on [Save] Button
	Thaan new Topic is created
