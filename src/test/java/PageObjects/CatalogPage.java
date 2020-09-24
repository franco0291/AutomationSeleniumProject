package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CatalogPage extends BasePage
{

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getCreateProgramButton(){ return this.driver.findElement(By.id("[style='font-size: 25px;']"));}

    private WebElement getExercisetTabButton(){ return this.driver.findElement(By.id("pills-exercises-tab"));}

    private WebElement getRefreshButton(){ return this.driver.findElement(By.cssSelector("#catalog-refresh-button > h6"));}

    private WebElement getCatalogElement(){ return this.driver.findElement(By.id("search-term-programs"));}

    public void clickExerciseTabButton()
    {
        try
            {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-overlay")));
            }
        catch(Exception e)
            {
            e.printStackTrace();
            }

        wait.until(ExpectedConditions.elementToBeClickable(By.id("pills-exercises-tab")));
        getExercisetTabButton().click();
    }


    public boolean isCatalog()
    {
        try
        {
            getCreateProgramButton().isDisplayed();
        }
        catch(TimeoutException xx)
        {
            return false;
        }
        return true;

    }


    public boolean isEveryCatagoryLoading()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".exercises-activity > b")));
        int getNumberOfCategories = driver.findElements(By.cssSelector(".exercises-activity > b")).size();
        boolean isAllCategoriesLoading = true;
        for (int i = 2; i <= getNumberOfCategories; i++)
        {
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".exercises-activity:nth-child("+i+") > b")));

            try
            {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-overlay")));
            }

            catch(Exception e)
            {
                e.printStackTrace();
            }

            WebElement Category = driver.findElement(By.cssSelector(".exercises-activity:nth-child(" + i + ") > b"));
            Category.click();

            try
            {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div:nth-child(1)>div>div.search-col:nth-child(1)>div.card>div.card-body > div")));
                WebElement categoryElementOnPage = driver.findElement(By.cssSelector("div:nth-child(1)>div>div.search-col:nth-child(1)>div.card>div.card-body > div"));
            }
            catch (Exception e)
            {
                isAllCategoriesLoading = false;
                break;
            }

        }
        return isAllCategoriesLoading;
    }

    public void clickOnRefresh()
    {

        try
        {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-overlay")));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#catalog-refresh-button > h6")));
        getRefreshButton().click();
    }

    public void ClickonSearchElement()
    {
        try
        {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loading-overlay")));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.id("search-term-programs")));
        getCatalogElement().click();

    }
}
