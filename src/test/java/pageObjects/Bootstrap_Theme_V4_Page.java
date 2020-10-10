package pageObjects;

import elementMapper.Bootstrap_Theme_V4_ElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class Bootstrap_Theme_V4_Page extends Bootstrap_Theme_V4_ElementMapper {

    public Bootstrap_Theme_V4_Page(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickAddCustomerBtn(){
        addCustomerBtn.click();
    }

}
