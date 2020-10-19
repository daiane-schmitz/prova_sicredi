package pageObjects;

import elementMapper.Add_Customer_ElementMapper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;


public class Add_Customer_Page extends Add_Customer_ElementMapper {

    public Add_Customer_Page(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillName(){
        name.sendKeys("Teste Sicredi");
    }

    public void fillLastName(){
        lastName.sendKeys("Teste");
    }

    public void fillContactFirstName(){
        contactFirstName.sendKeys("Daiane");
    }

    public void fillPhone(){
        phone.sendKeys("51 9999-9999");
    }

    public void fillAddressLine1(){
        addressLine1.sendKeys("Av Assis Brasil, 3970");
    }

    public void fillAddressLine2(){
        addressLine2.sendKeys("Torre D");
    }

    public void fillCity(){
        city.sendKeys("Porto Alegre");
    }

    public void fillState(){
        state.sendKeys("RS");
    }

    public void fillPostalCode(){
        postalCode.sendKeys("91000-000");
    }

    public void fillCountry(){
        country.sendKeys("Brasil");
    }

    public void fillEmployer(){
        clickEmployeer.click();
        nameEmployeer.sendKeys("Fixter");
        nameEmployeer.sendKeys(Keys.ENTER);
    }

    public void fillCreditLimit(){
        creditLimit.sendKeys("200");
    }

    public void clickSaveBtn(){
        btnSave.click();
    }

    public String getSucessMessage(){
        return sucessMessage.getText();
    }

    public void clickBtnSaveAndGoBack(){
        btnSaveAndGoBack.click();
    }

}
