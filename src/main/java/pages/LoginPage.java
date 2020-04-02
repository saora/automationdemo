package pages;

import com.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class LoginPage extends PageObject {
 WebDriver driver;
    @FindBy(id = "userLoginName")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "loginButton_label")
    private WebElement bankingAccessBtn;

    @FindBy(id = "dijit_form_RadioButton_0")
    private WebElement rdoButtonSecurityQ;

    @FindBy(xpath = "//span[starts-with(@id, 'SelectChallengeMethodsDialog')]/span[3]")
    private WebElement BtnAccept1;
    //ID: SelectChallengeMethodsDialog_T1K0wlDO_button_label

    @FindBy(xpath = "//input[starts-with(@id,'AnswerSecurityQuestionsDialog')]")
    private List<WebElement> textboxAnswer;

    @FindBy(xpath = "//*[starts-with(@id, 'AnswerSecurityQuestionsDialog_')]/div[2]/div[1]")
    private WebElement firstQ;

    @FindBy(xpath = "//*[starts-with(@id, 'AnswerSecurityQuestionsDialog_')]/div[2]/div[3]")
    private WebElement secondQ;

    @FindBy(xpath = "//span[starts-with(@id,'AnswerSecurityQuestionsDialog')]/span[3]")
    private WebElement acceptAnswer;

    @FindBy(id = "continueButton_label")
    private WebElement continueButton;


    public LoginPage(WebDriver driver){
    super(driver);

    }

    public void setUsername(String setUser){
        typeOnElement(username, setUser);
    }

    public void setPassword(String setPass){
        typeOnElement(password, setPass);
    }

    public void eBankingAccess(){
        clickOnElement(bankingAccessBtn);
    }

    public void setSecurityOption(){
        clickOnElement(rdoButtonSecurityQ);
    }

    public void acceptOnModalOne(){
        clickOnElement(BtnAccept1);
    }

    public void answerFirstQuestion(){
        String setAnswerOne = getQuestion(firstQ);
        typeOnSelectedElements(textboxAnswer,"TextBox_0",setAnswerOne);
        System.out.println("QUESTION ONE: "+firstQ.getText());
        System.out.println("ANSWER ONE: "+getQuestion(firstQ));
    }

    public void answerSecondQuestion(){
        String setAnswerTwo = getQuestion(secondQ);
        typeOnSelectedElements(textboxAnswer,"TextBox_1",setAnswerTwo);
        System.out.println("QUESTION TWO: "+secondQ.getText());
        System.out.println("ANSWER TWO: "+getQuestion(secondQ));
    }

    public void acceptOnSecondModal(){
        acceptAnswer.click();
    }

    public void clickOnContinue(){
       continueButton.click();
    }

    public static String getQuestion(WebElement element){
        String answer = "";
        if(element.getText().equals("What is your mother's middle name?")||element.getText().equals("What is your father's middle name?")){
            answer="name";
        }else if(element.getText().equals("What is the first name of the maid of honor at your wedding?")||element.getText().equals("What is the first name of the best man at your wedding?")){
            answer="wedding";
        }else if(element.getText().equals("What was the name of the town your grandmother lived in? (Enter full city name only)")||element.getText().equals("What was the name of the town your grandmother lived in? (Enter full city name only)")){
            answer="lived";
        }
        return answer;
    }


}
