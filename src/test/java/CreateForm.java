import Pages.DashboardPage;
import Pages.FormPage;
import Pages.OrderPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.commonHelper.ElementHelper;
import utilities.datareaders.DataProviderUtils;
import utilities.extentReport.ExtentReportListener;


@Listeners(ExtentReportListener.class)
public class CreateForm extends BaseTest {

    FormPage formPage;
    DashboardPage dashboardPage;
    OrderPage orderPage;
    @BeforeTest
    public void setUp() {
        formPage = new FormPage();
        dashboardPage = new DashboardPage();
        orderPage = new OrderPage();
    }

    @Test(dataProvider = "FormData", dataProviderClass = DataProviderUtils.class)
    public void createForm(String PartnerContactName,String PartnerContactEmail, String PartnerContactPhone, String CustomerName,
                           String CustomerID, String CustomerContactName,String CustomerContactEmail, String CustomerStrAddress,
                           String CustomerCity,String CustomerState ,String CustomerZip, String CompanyName,String CompanyAddress,
                            String CompanyCity,String CompanyState,String CompanyFedralID, String NumOfCarriers,String NumOfEmployees, String PlanYearStartDate,
                           String CarrierName, String CarrierContactName,
                           String CarrierContactEmail, String selectInclude,String selectPlan) throws InterruptedException {

        // Step 1-2: Open the EDI form
        dashboardPage.clickPlusButton();
        dashboardPage.clickEDILink();

        // Step 3: Fill mandatory fields
        formPage.enterPartnerContactName(PartnerContactName);
        formPage.enterPartnerContactEmail(PartnerContactEmail);
        formPage.enterPartnerContactPhone(PartnerContactPhone);
        formPage.enterCustomerName(CustomerName);
        formPage.enterCustomerID(CustomerID);
        formPage.enterCustomerContactEmail(CustomerContactEmail);
        formPage.enterCustomerContactName(CustomerContactName);
        formPage.enterCustomerStrAddress(CustomerStrAddress);
        formPage.enterCustomerCity(CustomerCity);
        formPage.selectCustomerState(CustomerState);
        formPage.enterCustomerZip(CustomerZip);
        formPage.enterCompanyName(CompanyName);
        formPage.enterCompanyAddress(CompanyAddress);
        formPage.enterCompanyCity(CompanyCity);
        formPage.selectCompanyState(CompanyState);
        formPage.enterCompanyFedralID(CompanyFedralID);
        formPage.enterNumOfCarriers(NumOfCarriers);
        formPage.enterNumOfEmployees(NumOfEmployees);
        formPage.enterPlanYearStartDate(PlanYearStartDate);
        formPage.enterCarrierName(CarrierName);
        formPage.enterCarrierContactName(CarrierContactName);
        formPage.enterCarrierContactEmail(CarrierContactEmail);
        formPage.selectIncludeSelection(selectInclude);
        formPage.selectPlanType(selectPlan);

        // Step 4: Click on Submit button
        formPage.clickSubmitButton();
        formPage.clickConfirm();
        formPage.successButton();

        // Step 5-7: Verify order in history
        dashboardPage.clickOrderHistory();
        orderPage.enterKeyword(PartnerContactName);
        orderPage.clickOnSearchButton();
        orderPage.assertCustomerName(PartnerContactName);


    }

}
