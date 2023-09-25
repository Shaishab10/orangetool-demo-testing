package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage{

    @FindBy(className = "oxd-main-menu-item--name")
   List<WebElement>  menuItems;

    @FindBy(className = "oxd-button")
    List<WebElement> buttons;

    @FindBy(className = "oxd-input")
    List<WebElement> formTextFields;

    @FindBy(className = "oxd-switch-input")
    WebElement btnSwitch;

    public DashboardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void createUser(String firstName, String lastName, String username, String password){
        menuItems.get(1).click();   //click pim
        buttons.get(2).click();     //click add user
        formTextFields.get(1).sendKeys(firstName); //firstname
        formTextFields.get(3).sendKeys(lastName);   //lastname
        btnSwitch.click();      //click login details switch
        formTextFields.get(5).sendKeys(username);       //username
        formTextFields.get(6).sendKeys(password);    //pass
        formTextFields.get(7).sendKeys(password);   //confirm pass
        buttons.get(1).click();     // save data
    }
}
