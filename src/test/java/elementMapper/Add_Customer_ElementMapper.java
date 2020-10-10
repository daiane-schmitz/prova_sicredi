package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Customer_ElementMapper {

    @FindBy(id = "field-customerName")
    public WebElement name;

    @FindBy(id = "field-contactLastName")
    public WebElement lastName;

    @FindBy(id = "field-contactFirstName")
    public WebElement contactFirstName;

    @FindBy(id = "field-phone")
    public WebElement phone;

    @FindBy(id = "field-addressLine1")
    public WebElement addressLine1;

    @FindBy(id = "field-addressLine2")
    public WebElement addressLine2;

    @FindBy(id = "field-city")
    public WebElement city;

    @FindBy(id = "field-state")
    public WebElement state;

    @FindBy(id = "field-postalCode")
    public WebElement postalCode;

    @FindBy(id = "field-country")
    public WebElement country;

    @FindBy(css = "#field_salesRepEmployeeNumber_chosen > a > div > b")
    public WebElement clickEmployeer;

    @FindBy(css = "#field_salesRepEmployeeNumber_chosen > div > div > input[type=text]")
    public WebElement nameEmployeer;


    @FindBy(id = "field-creditLimit")
    public WebElement creditLimit;

    @FindBy(id = "form-button-save")
    public WebElement btnSave;

    @FindBy(css= "#report-success > p")
    public WebElement sucessMessage;
}
