package Tests;

import PageObjects.*;
import org.junit.Assert;
import org.junit.Test;


public class CatalogTest extends BaseTest
{
    @Test
    public void CategoryExercisesExistTest()
    {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.openPage();
        MainPage mainpage = loginpage.loginToExtendview("jesusf7654@gmail.com","David3232");
        CatalogPage catalogpage = new CatalogPage(driver);
        mainpage.clickOnCatalogButton();
        catalogpage.clickExerciseTabButton();
        Assert.assertTrue(catalogpage.isEveryCatagoryLoading());
    }

    @Test
    public void RefreshTest()
    {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.openPage();
        MainPage mainpage = loginpage.loginToExtendview("jesusf7654@gmail.com", "David3232");
        CatalogPage catalogpage = new CatalogPage(driver);
        mainpage.clickOnCatalogButton();
        catalogpage.ClickonSearchElement();
        catalogpage.clickOnRefresh();
        catalogpage.ClickonSearchElement();

    }
}
