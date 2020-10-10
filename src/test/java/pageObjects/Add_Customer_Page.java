package pageObjects;

import elementMapper.Add_Customer_ElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

import java.util.Scanner;

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

    public void fillPhone(){
        phone.sendKeys("982505020");
    }

    public void fillAddressLine1(){
        addressLine1.sendKeys("address");
    }

    public void fillAddressLine2(){
        addressLine2.sendKeys("address");
    }

    public void fillCity(){
        city.sendKeys("city");
    }

    public void fillState(){
        state.sendKeys("state");
    }

    public void fillPostalCode(){
        postalCode.sendKeys("00000");
    }

    public void fillCountry(){
        country.sendKeys("country");
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
}
