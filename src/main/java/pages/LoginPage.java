package pages;

import com.GetDriverOption;
import okio.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {
 WebDriver driver;
    @FindBy(id = "userLoginName")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "loginButton_label")
    private WebElement bankingAccessBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUsername(String setUser){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        username.sendKeys(setUser);
    }

    public void setPassword(String setPass){
        password.sendKeys(setPass);
    }

    public void eBankingAccess(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        bankingAccessBtn.click();
    }


}
