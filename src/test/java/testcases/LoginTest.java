package testcases;

import com.GetDriverOption;
import com.driverOption;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    LoginPage lp;

    @Before
    public void setUp(){
        driver=GetDriverOption.getDriverOpt(driverOption.CHROME);
        driver.get("https://www6.pb-santander.com/pre-ebanking-integration/security/Login");
    }

    @Test
    public void test(){
        lp = new LoginPage(driver);
        lp.setUsername("Prueba");
        lp.setPassword("Prueba");
        lp.eBankingAccess();

    }

    @Test
    public void tearDown(){

    }

}
