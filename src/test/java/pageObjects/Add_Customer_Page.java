package pageObjects;

import elementMapper.Add_Customer_ElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class Add_Customer_Page extends Add_Customer_ElementMapper {

    public Add_Customer_Page(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillName(){
        name.sendKeys("name");
    }

    public void fillLastName(){
        lastName.sendKeys("lastname");
    }

    public void fillContactFirstName(){
        contactFirstName.sendKeys("contactname");
    }



}
