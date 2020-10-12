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

    public String isThereACustomerBtn(){
        return addCustomerBtn.getText();
    }

    public void fillSearchName(){
        searchName.sendKeys("Daiane");
    }

    public void clickCheckBox(){
        checkBox.click();
    }

    public void clickDeleteBtn(){
        deleteBtn.click();
    }

    public String getAreYouSureDelete(){
        return areYouSureDelete.getText();
    }

    public void clickConfirmDeleteBtn(){
        confirmDeleteBtn.click();
    }


    public String getDeleteSuccessfulMessage(){
        return deleteSuccessfulMessage.getText();
    }

}
