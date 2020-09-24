package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;


public class Step1Page extends BasePage {

    public Step1Page(WebDriver driver) {
        super(driver);
    }

    public static final String SOURCES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

    private WebElement getProgramNameField(){
        return this.driver.findElement(By.id("program-name"));
    }

    private WebElement getProgramGoalField(){ return this.driver.findElement(By.id("program-goal")); }

    private WebElement getPage1NextButton(){ return this.driver.findElement(By.cssSelector("#program_flow_info_next")); }

    public String RandomTextGenerator()
    {
       return generateString(new Random(), SOURCES, 6);
    }

    public void fillFields(String Programfield, String GoalField)
    {
        wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(getPage1NextButton()));
        getProgramNameField().sendKeys(Programfield);
        getProgramGoalField().sendKeys(GoalField);
        getPage1NextButton().click();
    }

    public String generateString(Random random, String characters, int length)
    {
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }

}
