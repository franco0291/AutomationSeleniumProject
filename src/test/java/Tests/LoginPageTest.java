package Tests;

import PageObjects.BasePage;
import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.junit.Assert;
import org.junit.Test;


public class LoginPageTest extends BaseTest
{

    @Test
    public void LoginTest()
    {
    LoginPage loginpage = new LoginPage(driver);
    loginpage.openPage();
    MainPage mainpage = loginpage.loginToExtendview("jesusf7654@gmail.com","David3232");
    Assert.assertTrue(mainpage.isMain());

    }
}
