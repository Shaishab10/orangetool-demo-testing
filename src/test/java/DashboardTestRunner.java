import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTestRunner extends Setup {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test(priority = 1)
    public void doLogin(){
        loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin","admin123");
    }

    @Test(priority = 2)
    public void createUser(){
        dashboardPage = new DashboardPage(driver);
        dashboardPage.createUser("Shaishab","Poddar","shaishab","shaishab_123");
    }
}
