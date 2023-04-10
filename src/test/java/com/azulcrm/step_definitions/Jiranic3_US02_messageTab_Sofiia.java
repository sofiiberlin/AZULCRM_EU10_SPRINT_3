package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.pages.MessageTab_Sofiia;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Jiranic3_US02_messageTab_Sofiia {

    MessageTab_Sofiia MessageTab_Sofiia = new MessageTab_Sofiia();
    LoginPage loginPage = new LoginPage();


    @When("the user fills in the message title")
    public void the_user_fills_in_the_message_title() {
        MessageTab_Sofiia.SendMessageBox.click();
        Driver.getDriver().switchTo().frame(MessageTab_Sofiia.IframeMessage);
        MessageTab_Sofiia.MessageField.click();
        MessageTab_Sofiia.MessageField.sendKeys("Hello");
        Driver.getDriver().switchTo().parentFrame();

    }
        @And("selects at least one recipient")
        public void selectsAtLeastOneRecipient() {
            MessageTab_Sofiia.AddMoreButton.click();
            MessageTab_Sofiia.AllEmployeesLink.click();
            MessageTab_Sofiia.Marketing7Emloyee.click();
            MessageTab_Sofiia.popUpWindowCloseIcon.click();


        }

    @When("the user clicks on the send button")
    public void the_user_clicks_on_the_send_button() {
        MessageTab_Sofiia.SendButton.click();

    }

    @Then("the message should be sent successfully")
    public void the_message_should_be_sent_successfully() {
      Assert.assertTrue(MessageTab_Sofiia.SendMessageBox.isDisplayed());

    }


    @When("the user selects at least one recipient without filling in the message title")
    public void theUserSelectsAtLeastOneRecipientWithoutFillingInTheMessageTitle() {
        MessageTab_Sofiia.SendMessageBox.click();
        MessageTab_Sofiia.AddMoreButton.click();
        MessageTab_Sofiia.AllEmployeesLink.click();
        MessageTab_Sofiia.Marketing7Emloyee.click();
        MessageTab_Sofiia.popUpWindowCloseIcon.click();

    }


    @Then("an error message should be displayed: {string}")
    public void anErrorMessageShouldBeDisplayed(String arg0) {
        Assert.assertTrue(MessageTab_Sofiia.noMessageTitle.isDisplayed());
    }

    @When("the user fills in the message title without selecting any recipient")
    public void theUserFillsInTheMessageTitleWithoutSelectingAnyRecipient() {
        MessageTab_Sofiia.SendMessageBox.click();
        Driver.getDriver().switchTo().frame(MessageTab_Sofiia.IframeMessage);
        MessageTab_Sofiia.MessageField.click();
        MessageTab_Sofiia.MessageField.sendKeys("Hello");
        Driver.getDriver().switchTo().parentFrame();


    }

    @And("selects at least one recipient from the {string} category")
    public void selectsAtLeastOneRecipientFromTheCategory(String arg0) {

        MessageTab_Sofiia.AddMoreButton.click();
        MessageTab_Sofiia.Recent.click();
        MessageTab_Sofiia.marketinginRecent.click();
        MessageTab_Sofiia.popUpWindowCloseIcon.click();
    }

    @Then("the selected recipients should be added to the recipient list")
    public void theSelectedRecipientsShouldBeAddedToTheRecipientList() {
        Assert.assertTrue(MessageTab_Sofiia.checkIfReceipentAdded.isDisplayed());
        
    }

    @Then("the selected group members should be added to the recipient list")
    public void theSelectedGroupMembersShouldBeAddedToTheRecipientList() {
        // there is no group member field
        
    }

    @Then("the selected employees or departments should be added to the recipient list")
    public void theSelectedEmployeesOrDepartmentsShouldBeAddedToTheRecipientList() {
        Assert.assertTrue(MessageTab_Sofiia.Marketing7Emloyee.isDisplayed());
    }

    @When("the user selects multiple recipients from any category")
    public void theUserSelectsMultipleRecipientsFromAnyCategory() {
        MessageTab_Sofiia.SendMessageBox.click();
        MessageTab_Sofiia.AddMoreButton.click();
        MessageTab_Sofiia.AllEmployeesLink.click();
        MessageTab_Sofiia.Marketing7Emloyee.click();
        MessageTab_Sofiia.helpdesk22.click();
        MessageTab_Sofiia.popUpWindowCloseIcon.click();
        
    }

    @Then("all selected recipients should be added to the recipient list")
    public void allSelectedRecipientsShouldBeAddedToTheRecipientList() {
        Assert.assertTrue(MessageTab_Sofiia.Marketing7Emloyee.isDisplayed());
        Assert.assertTrue(MessageTab_Sofiia.helpdesk22.isDisplayed());
        
    }

    @Given("the user has added at least one recipient to the recipient list")
    public void theUserHasAddedAtLeastOneRecipientToTheRecipientList() {
        MessageTab_Sofiia.SendMessageBox.click();
        MessageTab_Sofiia.AddMoreButton.click();
        MessageTab_Sofiia.AllEmployeesLink.click();
        MessageTab_Sofiia.Marketing7Emloyee.click();

    }

    @And("the user is on the compose message page")
    public void theUserIsOnTheComposeMessagePage() {
        MessageTab_Sofiia.popUpWindowCloseIcon.click();

        
    }

    @When("the user clicks on the delete button next to a recipient")
    public void theUserClicksOnTheDeleteButtonNextToARecipient() {
        MessageTab_Sofiia.recepientDeleteButton.click();
        
    }

    @Then("the recipient should be removed from the recipient list")
    public void theRecipientShouldBeRemovedFromTheRecipientList() {
        Assert.assertFalse(MessageTab_Sofiia.Marketing7Emloyee.isDisplayed());
    }

    @And("the user has not selected any specific recipients")
    public void theUserHasNotSelectedAnySpecificRecipients() {
    MessageTab_Sofiia.ToSend.clear();
    }

    @Then("the message should be sent to all employees")
    public void theMessageShouldBeSentToAllEmployees() {
        Assert.assertTrue(MessageTab_Sofiia.AllEmployeesSelection.isDisplayed());
        
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

    @When("user clicks on the recipient field")
    public void user_clicks_on_the_recipient_field() {
        MessageTab_Sofiia.SendMessageBox.click();

    }


    }




