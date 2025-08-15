package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.commonHelper.AssertionHelper;
import utilities.commonHelper.ElementHelper;
import utilities.driverManger.DriverManger;

public class OrderPage {
    WebDriver driver;

    By searchText = By.xpath("//input[@id='SrchTxt']");
    By searchButton = By.id("SearchButton");
    By customerName = By.xpath("//table//tbody//tr//td[1]/a");

    public OrderPage() {
        this.driver = DriverManger.getDriver();
    }
    public void enterKeyword(String Text) {
        ElementHelper.sendText(Text,driver, searchText);

    }
    public void clickOnSearchButton() {
        ElementHelper.click(driver, searchButton);
    }
    public void assertCustomerName(String expectedName) {
        AssertionHelper.assertEqual(ElementHelper.getText(driver, customerName), expectedName);
    }

}
