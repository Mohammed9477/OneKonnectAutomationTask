import Pages.DashboardPage;
import Pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonHelper.AssertionHelper;
import utilities.datareaders.DataProviderUtils;
import utilities.extentReport.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class Login extends BaseTest{
    DashboardPage dashboardPage;
    LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }

    @Test(dataProvider = "LoginData", dataProviderClass = DataProviderUtils.class)
    public void loginTest(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        loginPage.assertDashboard("https://devtesting.onekonnect.com/eBNPartnerPortal_test2/PartnerOrders/PartnerDashBoard");

    }


}
