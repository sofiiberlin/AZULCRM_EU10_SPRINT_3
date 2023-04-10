package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessageTab_Sofiia extends BasePage {

    @FindBy (xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement   Recent;
    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement MessageField;

    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement IframeMessage;

    @FindBy (xpath = "//span[@class=\"feed-add-post-micro-title\"]")
    public WebElement SendMessageBox;

    @FindBy (xpath = "//span[@class=\"feed-add-post-destination-text\"]")
    public WebElement AllEmployeesSelection;

    @FindBy (xpath = "//a[@id=\"bx-destination-tag\"]")
    public WebElement AddMoreButton;

    @FindBy (xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement AllEmployeesLink;

    @FindBy (xpath = "(//div[.='marketing7@cybertekschool.com'])[3]")
    public WebElement Marketing7Emloyee;

    @FindBy (xpath = "(//div[.='marketing7@cybertekschool.com'])[1]")
    public WebElement marketinginRecent;

    @FindBy (xpath = "(//span[.='marketing7@cybertekschool.com'])[2]")
    public WebElement checkIfReceipentAdded;

    @FindBy (xpath = "//div[.='helpdesk22@cybertekschool.com']")
    public WebElement helpdesk22;

    @FindBy (xpath="//input[@id='feed-add-post-destination-input']")
    public WebElement ToSend;

    @FindBy (xpath = "//button[@id=\"blog-submit-button-save\"]")
    public WebElement SendButton;

    @FindBy (xpath = "//span[@class=\"popup-window-close-icon\"]")
    public WebElement popUpWindowCloseIcon;

    @FindBy (xpath = "//button[@id=\"blog-submit-button-cancel\"]")
    public WebElement CancelButton;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement recepientDeleteButton;

    @FindBy (xpath = "//div[@class=\"feed-add-error\"]")
    public WebElement ErrorMessage;

    @FindBy (xpath = "//span[.='The message title is not specified']")
    public WebElement noMessageTitle;



}
