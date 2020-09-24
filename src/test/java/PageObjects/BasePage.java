package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



    public class BasePage
    {
        protected WebDriverWait wait;
        protected WebDriver driver;

        public BasePage(WebDriver driver)
        {
            wait = new WebDriverWait(driver,30);
            this.driver = driver;
        }
    }

