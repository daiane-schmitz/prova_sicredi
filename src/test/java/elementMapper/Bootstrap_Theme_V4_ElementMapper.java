package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bootstrap_Theme_V4_ElementMapper {

    @FindBy(css = "div.floatL.t5 > a")
    public WebElement addCustomerBtn;

    @FindBy(css = "td:nth-child(3) > input")
    public WebElement searchName;

    @FindBy(css = "div.floatR.l5 > a > i")
    public WebElement refreshBtn;

    @FindBy(css = "td.no-border-right > div > input")
    public WebElement checkBox;

    @FindBy(css = "td.no-border-left > div.floatL > a > i")
    public WebElement deleteBtn;

    @FindBy(css = "p.alert-delete-multiple-one")
    public WebElement areYouSureDelete;

    @FindBy(css = "div.modal-footer > button.btn.btn-danger.delete-multiple-confirmation-button")
    public WebElement confirmDeleteBtn;

    @FindBy(css = "body > script:nth-child(13)")
    public WebElement deleteSuccessfulMessage;
}
