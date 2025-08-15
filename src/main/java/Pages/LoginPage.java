package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.commonHelper.AssertionHelper;
import utilities.commonHelper.ElementHelper;
import utilities.driverManger.DriverManger;

import java.sql.Driver;

public class LoginPage {
    WebDriver driver;

    By usernameField = By.id("UserName");
    By passwordField = By.id("Password");
    By loginButton = By.className("submitbtn");

    public LoginPage() {
        this.driver = DriverManger.getDriver();
    }
    public void enterUsername(String username) {
        ElementHelper.sendText(username,driver,usernameField);
    }
    public void enterPassword(String password) {
        ElementHelper.sendText(password,driver,passwordField);
    }
    public void clickLoginButton() {
        ElementHelper.click(driver, loginButton);
    }

    public void assertDashboard(String URL) {
        AssertionHelper.assertUrl(driver, URL);
    }

}
