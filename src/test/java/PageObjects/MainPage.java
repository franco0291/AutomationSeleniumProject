package PageObjects;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage
{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getCatalogButton(){ return this.driver.findElement(By.id("exercise-catalog-nav-link")); }

    private WebElement getCreateProgramButton(){ return this.driver.findElement(By.cssSelector("a[href='/web/catalog-programs/new/']")); }

    public void clickOnCatalogButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("exercise-catalog-nav-link")));
        getCatalogButton().click();
    }

    public void clickOnCreateProgram()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/web/catalog-programs/new/']")));
        getCreateProgramButton().click();
    }

    public boolean isMain()
    {
        try
        {
            getCatalogButton().isDisplayed();
        } catch (TimeoutException xx)
        {
            return false;
        }
        return true;
    }


}
