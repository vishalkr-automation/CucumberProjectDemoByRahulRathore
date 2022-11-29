Feature: User Login Feature

Scenario: User Login Scenario
  Given User is at Login Page of the application
  When User login with following userName and password
  |UserNameOne| PasswordOne|
  |UserNameTwo| PasswordTwo|
  |UserNameThree| PasswordThree|
  |UserNameFour| PasswordFour|
  Then User should be login with correct username and password
  
  Scenario Outline: Scenario Description
   Given User enter value1 "<Value1>"
   When User enter value2 "<Value2>"
   Then User enter value3 "<Value3>"
   
   Examples:
   |Value1    |Value2        | Value3|
   |TestData1 |DemoTestData1 | DummyTestData1|
   |TestData2 |DemoTestData1 | DummyTestData1|
   |TestData3 |DemoTestData1 | DummyTestData1|
   
   