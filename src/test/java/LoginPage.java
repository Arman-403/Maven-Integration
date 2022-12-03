import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

        WebDriver driver;

        @FindBy(how= How.XPATH, using="//input[@id='email']") private WebElement username;

        @FindBy(id = "pass") private WebElement pass;

        @FindBy(xpath = "(//button[normalize-space()='Log in'])[1]") private WebElement submit;

        public LoginPage(WebDriver d) {
            driver = d;
            PageFactory.initElements(d, this);
        }

        public void setUsername(String uName) {
            username.sendKeys(uName);
        }
        public void setPass(String pas) {
            pass.sendKeys(pas);
        }
        public void clickbtn() {
            submit.click();

    }
}
