Feature: As a user,I should be able to send messages by clicking on Message tab under

  Background:
    Given the user logs in successfully

  @AZUL10-515
  Scenario: US01 As a user,I should be able to send messages by clicking on Message tab under Active Stream.
    When the user fills in the message title
    And selects at least one recipient
    And the user clicks on the send button
    Then the message should be sent successfully

     @AZUL10-517
  Scenario: US02 User tries to send a message without filling in the message title
    When the user selects at least one recipient without filling in the message title
    And the user clicks on the send button
    Then an error message should be displayed: "The message title is not specified."

    @AZUL10-518
  Scenario:  US03 User tries to send a message without selecting any recipient
    When the user fills in the message title without selecting any recipient
    And the user clicks on the send button
    Then an error message should be displayed: "Please specify at least one person."

       @AZUL10-519
  Scenario: US04 User selects recipients from the "Recent" category
    When  user clicks on the recipient field
    And selects at least one recipient from the "Recent" category
    Then the selected recipients should be added to the recipient list

         @AZUL10-520
  Scenario: US05 User selects recipients from the "My Groups" category
    When the user clicks on the recipient field
    And selects at least one recipient from the "My Groups" category
    Then the selected group members should be added to the recipient list

            @AZUL10-521
  Scenario:  US06 User selects recipients from the "Employees and departments" category
    When the user clicks on the recipient field
    And selects at least one recipient from the "Employees and departments" category
    Then the selected employees or departments should be added to the recipient list

         @AZUL10-522
  Scenario:  US07 User adds multiple recipients to the recipient list
    When the user selects multiple recipients from any category
    Then all selected recipients should be added to the recipient list
         @AZUL10-523
  Scenario:  US08 User deletes a recipient from the recipient list
    Given the user has added at least one recipient to the recipient list
    And the user is on the compose message page
    When the user clicks on the delete button next to a recipient
    Then the recipient should be removed from the recipient list

        @AZUL10-524
  Scenario:  US09 User sends a message to all employees
    And the user has not selected any specific recipients
    When the user clicks on the send button
    Then the message should be sent to all employees

            @AZUL10-525
  Scenario:  US10 User changes the default delivery setting to a specific group of employees
    And the user has not selected any specific recipients
    When the user selects a specific group of employees as the delivery option
    Then the message should be sent only to the selected group of employees

           @AZUL10-526
  Scenario:  US11 User cancels sending a message
    And the user has filled in the mandatory fields
    When the user clicks on the cancel button
    Then the message should not be sent and the user should be redirected to the previous page
          @AZUL10-527
  Scenario:  US12 User deletes a sent message
    Given the user has sent at least one message
    When the user navigates to the sent messages page
    And selects a message to delete
    Then the message should be deleted








