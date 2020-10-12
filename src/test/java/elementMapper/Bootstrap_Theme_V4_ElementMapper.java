package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bootstrap_Theme_V4_ElementMapper {

    @FindBy (css = "div.floatL.t5 > a")
    public WebElement addCustomerBtn;

    @FindBy(css = "td:nth-child(3) > input")
    public WebElement searchName;

    @FindBy(css = "td.no-border-right > div > input")
    public WebElement checkBox;

    @FindBy(css = "td.no-border-left > div.floatL > a")
    public WebElement deleteBtn;

    @FindBy(css = "p.alert-delete-multiple-one")
    public WebElement areYouSureDelete;

    @FindBy(css = "body > div.container-fluid.gc-container > div.row > div.delete-multiple-confirmation.modal.fade.in.show > div > div > div.modal-footer > button.btn.btn-danger.delete-multiple-confirmation-button")
    public WebElement confirmDeleteBtn;

    @FindBy(xpath = "/html/body/div[3]/span[3]/p")
    public WebElement deleteSuccessfulMessage;
}
