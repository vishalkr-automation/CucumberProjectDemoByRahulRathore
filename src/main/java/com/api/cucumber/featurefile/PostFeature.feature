Feature: Post feature of facebook
  This will test post functionality at the user wall
  
  Background: Common step
    Given user should be logged in
    And should be present at its wall

  Scenario: Post a text on user wall
    When I type text in th text box
    And click on Post Button
    Then The message should I Posted

  Scenario: Post a video on user wall
    When User supply the youtube link in the text box
    And click on Post Button
    Then The video should get posted on the user wall
    And Video should have proper Thumbnail
