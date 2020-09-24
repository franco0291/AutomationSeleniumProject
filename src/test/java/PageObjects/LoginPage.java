package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage
{

    public LoginPage(WebDriver driver) {
    super(driver);
    }

    public void openPage() {
        this.driver.get("https://extendview-staging.herokuapp.com/login/");
    }

    private WebElement getEmail()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='text']")));
        return driver.findElement(By.cssSelector("[type='text']"));
    }

    private WebElement getPassword() {
        return this.driver.findElement(By.cssSelector("[type='password']"));
    }

    private WebElement getLoginButton() { return this.driver.findElement(By.cssSelector("[type='submit']")); }

    public MainPage loginToExtendview(String username, String password)
    {
        getEmail().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
}
