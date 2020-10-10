package tests;

import elementMapper.Bootstrap_Theme_V4_ElementMapper;
import org.junit.Test;
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

    }

}
