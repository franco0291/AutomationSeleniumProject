package Tests;
import PageObjects.CatalogPage;
import PageObjects.LoginPage;
import PageObjects.MainPage;
import org.junit.Assert;
import org.junit.Test;



public class MainTest extends BaseTest
{

    @Test
    public void clickOnClientButtonTest()
    {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.openPage();
        MainPage mainpage = loginpage.loginToExtendview("jesusf7654@gmail.com","David3232");
        mainpage.clickOnCatalogButton();
        CatalogPage catalogpage = new CatalogPage(driver);
        Assert.assertTrue(catalogpage.isCatalog());
    }

}

