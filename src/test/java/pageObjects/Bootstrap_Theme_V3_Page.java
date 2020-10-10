package pageObjects;

import elementMapper.Bootstrap_Theme_V3_ElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class Bootstrap_Theme_V3_Page extends Bootstrap_Theme_V3_ElementMapper {

    public Bootstrap_Theme_V3_Page(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void selectVersion() {
        Select selectVersionElement = new Select(versionSelector);
        selectVersionElement.selectByValue("bootstrap_theme_v4");
    }

}
