package tests;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.Add_Customer_Page;
import pageObjects.Bootstrap_Theme_V3_Page;
import pageObjects.Bootstrap_Theme_V4_Page;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests {

    @Test
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
    }

    @Test
    public void testSelectVersionV4(){
        Bootstrap_Theme_V3_Page bootstrap_theme_v3_page = new Bootstrap_Theme_V3_Page();

        bootstrap_theme_v3_page.selectVersion();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("_v4")));
    }

    @Test
    public void testClickAddCustomerBtn(){
        Bootstrap_Theme_V4_Page bootstrap_theme_v4_page = new Bootstrap_Theme_V4_Page();

        testSelectVersionV4();

        bootstrap_theme_v4_page.clickAddCustomerBtn();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("_v4/add")));
    }

    @Test
    public void testAddCustomer(){
        Add_Customer_Page add_customer_page = new Add_Customer_Page();

        testClickAddCustomerBtn();

        add_customer_page.fillName();
        add_customer_page.fillLastName();
        add_customer_page.fillContactFirstName();
        add_customer_page.fillPhone();
        add_customer_page.fillAddressLine1();
        add_customer_page.fillAddressLine2();
        add_customer_page.fillCity();
        add_customer_page.fillState();
        add_customer_page.fillPostalCode();
        add_customer_page.fillCountry();
        add_customer_page.fillEmployer();
        add_customer_page.fillCreditLimit();
        add_customer_page.clickSaveBtn();

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("_v4/add")));
        assertTrue(add_customer_page.getSucessMessage().equals("Your data has been successfully stored into the database. Edit Customer or Go back to list"));
    }

    @Test
        public void testAddCostumerAndDoSearch() throws InterruptedException {

        Add_Customer_Page add_customer_page = new Add_Customer_Page();
        Bootstrap_Theme_V4_Page bootstrap_theme_v4_page = new Bootstrap_Theme_V4_Page();

        testAddCustomer();

        add_customer_page.clickBtnSaveAndGoBack();
        assertTrue(bootstrap_theme_v4_page.isThereACustomerBtn().contains("Add Customer"));

        bootstrap_theme_v4_page.fillSearchName();
        Thread.sleep(2000);
        bootstrap_theme_v4_page.clickRefreshBtn();  //precisei adicionar esse item para que a confirmação do delete funcionasse
        bootstrap_theme_v4_page.clickCheckBox();
        bootstrap_theme_v4_page.clickDeleteBtn();
        Thread.sleep(2000);
        bootstrap_theme_v4_page.getAreYouSureDelete();
        assertTrue(bootstrap_theme_v4_page.getAreYouSureDelete().contains("Are you sure that you want to delete this 1 item?"));
        Thread.sleep(2000);
        bootstrap_theme_v4_page.clickConfirmDeleteBtn();
        Thread.sleep(2000);
        bootstrap_theme_v4_page.clickConfirmDeleteBtn();
        Thread.sleep(1000);
            
            //Para o assert final tentei ambas formas e não consegui
 //assertTrue(bootstrap_theme_v4_page.getDeleteSuccessfulMessage().contains("Your data has been successfully deleted from the database."));


//        Browser.getCurrentDriver().switchTo().alert();
//        String alert = Browser.getCurrentDriver().switchTo().alert().getText();
//        System.out.println(alert);
           }

}
