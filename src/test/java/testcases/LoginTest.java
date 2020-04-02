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
        GetDriverOption go = new GetDriverOption();
        //driver = go.getDriverOpt(driverOption.CHROME);
        driver = GetDriverOption.getDriverOpt(driverOption.CHROME);
        driver.get("https://www6.pb-santander.com/pre-ebanking-integration/security/Login");
    }

    @Test
    public void test(){
        LoginPage  lp = new LoginPage(driver);
        lp.setUsername("Prueba");
        lp.setPassword("Prueba");
        lp.eBankingAccess();

    }

    @After
    public void tearDown(){

    }

}
