
@tag
Feature: Cheks theLogin facebook functionality
  Background:
  Given user is on the facebook page
  
  @tag1
  Scenario: Login FaceBook
    When  User enters user name and passwordn
    Then user clicks login button
    @tag2
 Scenario: Register the details in facebook page   
    When  User enter details
    Then user clicks register button
    @tag3
     Scenario: user clicks the create page in facebook
    When  User Clicks the create a page
    
    