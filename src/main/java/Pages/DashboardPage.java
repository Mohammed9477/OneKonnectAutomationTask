package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.commonHelper.AssertionHelper;
import utilities.commonHelper.ElementHelper;
import utilities.driverManger.DriverManger;

public class DashboardPage {

    WebDriver driver;

    By OrderHistory = By.xpath("//a[@href='/eBNPartnerPortal_test2/PartnerOrders/ViewPartnerOrders']");
    By PlusButton = By.xpath("//a[@class='dropdown-toggle support_icon_H']");
    By EDILink = By.xpath("//a[contains(@href,'AddOrder?partnerid=40438')]");

    public DashboardPage() {
        this.driver = DriverManger.getDriver();
    }
    public void clickOrderHistory() {
        ElementHelper.click(driver, OrderHistory);
    }
    public void clickPlusButton() {
        ElementHelper.click(driver, PlusButton);
    }
    public void clickEDILink() {
        ElementHelper.click(driver, EDILink);
    }
    public void assertDashboard(String URL) {
        AssertionHelper.assertUrl(driver, URL);
    }



}
