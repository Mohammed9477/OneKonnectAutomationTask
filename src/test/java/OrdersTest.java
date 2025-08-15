import Pages.DashboardPage;
import Pages.FormPage;
import Pages.OrderPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrdersTest {
    OrderPage orderPage;
    DashboardPage dashboardPage;

    @BeforeTest
    public void setUp() {
        orderPage = new OrderPage();
        dashboardPage = new DashboardPage();
    }

    @Test()
    public void viewOrders() {
        dashboardPage.clickOrderHistory();
        orderPage.enterKeyword("Samy");
        orderPage.clickOnSearchButton();
        orderPage.assertCustomerName("Samy");

    }
}
