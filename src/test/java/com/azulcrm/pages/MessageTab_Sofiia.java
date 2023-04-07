package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessageTab_Sofiia extends BasePage {

    @FindBy (xpath = "//a[@title=\"Activity Stream\"]")
    public WebElement ActivityStream;

    @FindBy (xpath = "//span[@class=\"pagetitle-item\"]")
    public WebElement MyTask;

    @FindBy (xpath = "//a[@id=\"destLastTab_mention43850789\"]")
    public WebElement   Recent;

    @FindBy (xpath = "//a[@id=\"destGroupTab_destination3850762\"]")
    public WebElement MyGroup;

    @FindBy (xpath = "//a[@id=\"destDepartmentTab_mention43850789\"]")
    public WebElement EmployeesAndDepartment;

    @FindBy (xpath = "//span[.=\"Message\"]")
    public WebElement MessageTab;

    @FindBy (xpath = "//body[@class=\"vsc-initialized\"]")
    public WebElement MessageField;

    @FindBy (xpath = "//span[@class=\"feed-add-post-destination-text\"]")
    public WebElement AllEmployeesSelection;

    @FindBy (xpath = "//a[@class=\"feed-add-destination-link\"]")
    public WebElement AddMoreButton;

    @FindBy (xpath="//input[@id=\"feed-add-post-destination-input\"]")
    public WebElement ToSend;

    @FindBy (xpath = "//button[@id=\"blog-submit-button-save\"]")
    public WebElement SendButton;

    @FindBy (xpath = "//button[@id=\"blog-submit-button-cancel\"]")
    public WebElement CancelButton;

    @FindBy (xpath = "//div[@class=\"feed-add-error\"]")
    public WebElement ErrorMessage;

    @FindBy (xpath = "//span[@class=\"feed-add-info-text\"]")
    public WebElement InfoTextError;



}
