@addBankAccount
Feature: Techfios bank and cash New Account Functionality

Background:
	Given user is on techfios login page
	

Scenario Outline: User should be able to login with valid credentials
 and open a new account	
	When user enters the username as "<username>" and password as "<password>"  
	And  user clicks on login button
	Then user should be able to see the dashboard
	When user clicks on bank and cash 
	When user clicks on new account 
	When user fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"and "<internetBankingUrl>" and clicks on submit 
	Then user should be able to see validate
	
	Examples:
	|username         |password|accountTitle|description|initialBalance|accountNumber|contactPerson|phone    |internetBankingUrl    |
	|demo@techfios.com|abc123  |myAccount   |personal   |1000          |7654321      |John         |987654321|www.bankofamerican.com|