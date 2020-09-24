package Tests;

import PageObjects.*;
import org.junit.Test;


public class CreateProgramTest extends BaseTest
{
    @Test
    public void createProgramTest() throws InterruptedException
    {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.openPage();
        MainPage mainpage = loginpage.loginToExtendview("jesusf7654@gmail.com","David3232");
        mainpage.clickOnCreateProgram();
        Step1Page step1page = new Step1Page(driver);
        step1page.fillFields("test- " + step1page.RandomTextGenerator(),"test- " + step1page.RandomTextGenerator());

        Step2Page step2page = new Step2Page(driver);
        step2page.AddExercises();
        step2page.ChooseExercises();
        step2page.ChooseDone();
        step2page.ChooseNext();

        Step3Page step3page = new Step3Page(driver);
        step3page.ChooseApplySettings();
        step3page.ChooseCreate();
    }


}
