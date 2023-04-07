package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Jiranic3_US02_messageTab_Sofiia {


    @When("the user fills in the message title and selects at least one recipient")
    public void the_user_fills_in_the_message_title_and_selects_at_least_one_recipient() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks on the send button")
    public void the_user_clicks_on_the_send_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the message should be sent successfully")
    public void the_message_should_be_sent_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("the user selects at least one recipient without filling in the message title")
    public void theUserSelectsAtLeastOneRecipientWithoutFillingInTheMessageTitle() {

    }


    @Then("an error message should be displayed: {string}")
    public void anErrorMessageShouldBeDisplayed(String arg0) {
    }

    @When("the user fills in the message title without selecting any recipient")
    public void theUserFillsInTheMessageTitleWithoutSelectingAnyRecipient() {
        
    }

    @When("the user clicks on the recipient field")
    public void theUserClicksOnTheRecipientField() {
        
    }

    @And("selects at least one recipient from the {string} category")
    public void selectsAtLeastOneRecipientFromTheCategory(String arg0) {
        
    }

    @Then("the selected recipients should be added to the recipient list")
    public void theSelectedRecipientsShouldBeAddedToTheRecipientList() {
        
    }

    @Then("the selected group members should be added to the recipient list")
    public void theSelectedGroupMembersShouldBeAddedToTheRecipientList() {
        
    }

    @Then("the selected employees or departments should be added to the recipient list")
    public void theSelectedEmployeesOrDepartmentsShouldBeAddedToTheRecipientList() {
        
    }

    @When("the user selects multiple recipients from any category")
    public void theUserSelectsMultipleRecipientsFromAnyCategory() {
        
    }

    @Then("all selected recipients should be added to the recipient list")
    public void allSelectedRecipientsShouldBeAddedToTheRecipientList() {
        
    }

    @Given("the user has added at least one recipient to the recipient list")
    public void theUserHasAddedAtLeastOneRecipientToTheRecipientList() {
        
    }

    @And("the user is on the compose message page")
    public void theUserIsOnTheComposeMessagePage() {
        
    }

    @When("the user clicks on the delete button next to a recipient")
    public void theUserClicksOnTheDeleteButtonNextToARecipient() {
        
    }

    @Then("the recipient should be removed from the recipient list")
    public void theRecipientShouldBeRemovedFromTheRecipientList() {
        
        
    }

    @And("the user has not selected any specific recipients")
    public void theUserHasNotSelectedAnySpecificRecipients() {
    }

    @Then("the message should be sent to all employees")
    public void theMessageShouldBeSentToAllEmployees() {
        
    }

    @When("the user selects a specific group of employees as the delivery option")
    public void theUserSelectsASpecificGroupOfEmployeesAsTheDeliveryOption() {
        
    }

    @Then("the message should be sent only to the selected group of employees")
    public void theMessageShouldBeSentOnlyToTheSelectedGroupOfEmployees() {
        
    }

    @And("the user has filled in the mandatory fields")
    public void theUserHasFilledInTheMandatoryFields() {
        
    }

    @When("the user clicks on the cancel button")
    public void theUserClicksOnTheCancelButton() {
        
    }

    @Then("the message should not be sent and the user should be redirected to the previous page")
    public void theMessageShouldNotBeSentAndTheUserShouldBeRedirectedToThePreviousPage() {
        
    }

    @Given("the user has sent at least one message")
    public void theUserHasSentAtLeastOneMessage() {
        
    }

    @When("the user navigates to the sent messages page")
    public void theUserNavigatesToTheSentMessagesPage() {
        
    }

    @And("selects a message to delete")
    public void selectsAMessageToDelete() {
        
    }

    @Then("the message should be deleted")
    public void theMessageShouldBeDeleted() {
    }
}



