package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Step3Page extends BasePage
{

    public Step3Page(WebDriver driver)
    {
        super(driver);
    }

    private WebElement getApplySettingsButton() { return this.driver.findElement(By.id("program-flow-apply-settings-button")); }

    private WebElement getCreateButton() {
        return this.driver.findElement(By.id("program_flow_settings_next"));
    }

    private WebElement getRepsDropDownValue2() { return this.driver.findElement(By.cssSelector("#exercise-days-per-week > option:nth-child(2)")); }

    public void ChooseApplySettings()
    {
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(getApplySettingsButton()));
        getApplySettingsButton().click();
    }

    public void ChooseRepsDropDown()
    {
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(getCreateButton()));
        getCreateButton().click();
    }

    public void RepsDropDownValue2()
    {
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(getRepsDropDownValue2()));
        getRepsDropDownValue2().click();
    }

    public void ChooseCreate()
    {
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(getCreateButton()));
        getCreateButton().click();
    }


}
