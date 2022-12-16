import org.example.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


    public class LoginPageTest extends BaseClass {
        WebDriver driver;

        @BeforeMethod

        public void beforemethod() {
            driver = LaunchSite();
        }


        @Test
        public void test() {

            LoginPage lp = new LoginPage(driver);

            lp.setUsername("jobbers cafe");
            lp.setPass("1234abc");
            lp.clickbtn();


        }

        @AfterMethod
        public void aftermethod() throws InterruptedException {
            closeDriver();
        }
    }

