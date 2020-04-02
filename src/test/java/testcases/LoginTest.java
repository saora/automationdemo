package testcases;

import com.GetDriverOption;
import com.driverOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;

    @Before
    public void setUp(){
        driver = GetDriverOption.getDriverOpt(driverOption.CHROME);
        driver.get("https://www6.pb-santander.com/pre-ebanking-integration/security/Login");
    }

    @Test
    public void test(){
        LoginPage  lp = new LoginPage(driver);
        lp.setUsername("AF68XT18");
        lp.setPassword("Miami123");
        lp.eBankingAccess();
        lp.setSecurityOption();
        lp.acceptOnModalOne();
        lp.answerFirstQuestion();
        lp.answerSecondQuestion();
        lp.acceptOnSecondModal();
        lp.clickOnContinue();
    }

    @After
    public void tearDown(){

    }

}
