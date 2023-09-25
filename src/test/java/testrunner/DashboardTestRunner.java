package testrunner;

import config.Setup;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

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
        dashboardPage.createUser("Tester73","xyz","tester73","tester_123");
    }
}
