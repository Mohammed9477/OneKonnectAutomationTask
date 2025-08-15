package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.commonHelper.ElementHelper;
import utilities.driverManger.DriverManger;

public class FormPage {

    WebDriver driver;
    By PartnerContactName = By.id("partnerContactName");
    By PartnerContactEmail = By.id("partnerContactEmail");
    By PartnerContactPhone = By.id("partnerContactPhone");
    By CustomerName = By.id("CustomerName");
    By CustomerID = By.id("CustomerCode");
    By CustomerContactEmail = By.id("ContactEmail");
    By CustomerContactName = By.id("ContactName");
    By CustomerStrAddress = By.id("CustomerAdd");
    By CustomerCity = By.id("CustomerCity");
    By CustomerState = By.id("StateID");
    By CustomerZip = By.id("PrimaryCode");
    By CompanyName = By.id("CompName_0");
    By CompanyAddress = By.id("CompAddress_0");
    By CompanyCity = By.id("CompCity_0");
    By CompanyState = By.id("CompStateID_0");
    By CompanyFedralID = By.id("CompFedralTaxID_0");
    By NumOfEmployees = By.id("EmployeesNumber");
    By NumOfCarriers = By.id("ConnectionsNumber");
    By PlanYearStartDate = By.id("PlanYearStartDate");
    By CarrierName = By.id("CarrierName_0");
    By CarrierContactName = By.id("ContactName_0");
    By CarrierContactEmail = By.id("ContactEmail_0");
    By IncludeSelection = By.id("CobraMembers_0");
    By PlanType = By.xpath("//label[normalize-space()='Life']");
    By SubmitButton = By.cssSelector("#UASub");
    By ConfirmButton = By.xpath("//button[@id='confirm_id']");
    By SuccessButton = By.xpath("//button[@id='success_id']");

    public FormPage() {
        this.driver = DriverManger.getDriver();
    }

    public void enterPartnerContactName(String name) {
        ElementHelper.sendText(name, driver, PartnerContactName);
    }
    public void enterPartnerContactEmail(String email) {
        ElementHelper.sendText(email, driver, PartnerContactEmail);
    }
    public void enterPartnerContactPhone(String phone) {
        ElementHelper.sendText(phone, driver, PartnerContactPhone);
    }
    public void enterCustomerName(String name) {
        ElementHelper.sendText(name, driver, CustomerName);
    }
    public void enterCustomerID(String id) {
        ElementHelper.sendText(id, driver, CustomerID);
    }
    public void enterCustomerContactEmail(String email) {
        ElementHelper.sendText(email, driver, CustomerContactEmail);
    }
    public void enterCustomerContactName(String name) {
        ElementHelper.sendText(name, driver, CustomerContactName);
    }
    public void enterCustomerStrAddress(String address) {
        ElementHelper.sendText(address, driver, CustomerStrAddress);
    }
    public void enterCustomerCity(String city) {
        ElementHelper.sendText(city, driver, CustomerCity);
    }
    public void selectCustomerState(String state) {
        ElementHelper.selectTextFromDropDownByText(state, driver, CustomerState);
    }
    public void enterCustomerZip(String zip) {
        ElementHelper.sendText(zip, driver, CustomerZip);
    }
    public void enterCompanyName(String carrier) {
        ElementHelper.sendText(carrier, driver, CompanyName);
    }
    public void enterCompanyAddress(String address) {
        ElementHelper.sendText(address, driver, CompanyAddress);
    }
    public void enterCompanyCity(String city) {
        ElementHelper.sendText(city, driver, CompanyCity);
    }
    public void selectCompanyState(String state) {
        ElementHelper.selectTextFromDropDownByText(state, driver, CompanyState);
    }
    public void enterCompanyFedralID(String fedralID) {
        ElementHelper.sendText(fedralID, driver, CompanyFedralID);
    }
    public void enterNumOfCarriers(String num) {
        ElementHelper.sendText(num, driver, NumOfCarriers);
    }
    public void enterNumOfEmployees(String num) {
        ElementHelper.sendText(num, driver, NumOfEmployees);
    }
    public void enterPlanYearStartDate(String date) {
        ElementHelper.sendText(date, driver, PlanYearStartDate);
    }
    public void enterCarrierName(String name) {
        ElementHelper.sendText(name, driver, CarrierName);
    }
    public void enterCarrierContactName(String name) {
        ElementHelper.sendText(name, driver, CarrierContactName);
    }
    public void enterCarrierContactEmail(String email) {
        ElementHelper.sendText(email, driver, CarrierContactEmail);
    }
    public void selectIncludeSelection(String selection) {
        ElementHelper.selectTextFromDropDownByText(selection, driver, IncludeSelection);
    }

    public void selectPlanType(String type) {
    ElementHelper.jsClick(driver, PlanType);
    }
    public void clickSubmitButton() {
        ElementHelper.jsClick(driver, SubmitButton);
    }
    public void clickConfirm() {
        ElementHelper.jsClick(driver, ConfirmButton);
    }
    public void successButton() {
        ElementHelper.jsClick(driver, SuccessButton);
    }

}
