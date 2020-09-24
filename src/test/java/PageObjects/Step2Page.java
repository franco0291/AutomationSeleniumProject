package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Step2Page extends BasePage{

    public Step2Page(WebDriver driver) {super(driver);}

    private WebElement getAddExercisesButton(){ return this.driver.findElement(By.cssSelector("div.col-12>button.btn-block")); }

    private WebElement getexerciseselectorbutton(){return this.driver.findElement(By.cssSelector("div:nth-child(1)>div>div.search-col:nth-child(1)>div.card>div.card-body > div"));}

    private WebElement getDonebutton(){return this.driver.findElement(By.xpath("//*[@id=\"program-add-exercise-tab\"]/div/div[1]/div/div[2]/button"));}

    private WebElement getNextbutton(){return this.driver.findElement(By.id("program_flow_cart_next"));}

    public void AddExercises() throws InterruptedException
    {
        wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.visibilityOf(getAddExercisesButton()));
        getAddExercisesButton().click();
    }

    public void ChooseExercises()
    {
        wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.visibilityOf(getexerciseselectorbutton()));
        getexerciseselectorbutton().click();
    }

    public void ChooseDone()
    {
        wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.visibilityOf(getDonebutton()));
        getDonebutton().click();
    }

    public void ChooseNext()
    {
        wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.visibilityOf(getNextbutton()));
        getNextbutton().click();
    }

        }





