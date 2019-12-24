package homework5.ex1;

import homework4.SeleniumDriverBaseUsersBugred;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects.HomePage;
import ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects.LoginForm;
import ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects.UserAccount;

import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest extends SeleniumDriverBaseUsersBugred {
    @Test
    public void successLogin() {
        //1.Open test site and initiate elements
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginForm loginForm = new LoginForm(driver);
        UserAccount userAccount = new UserAccount(driver);
        Properties testProperties = new Properties();
        try {
            testProperties.load(this.getClass().getClassLoader().getResourceAsStream("data/logintest.properties"));
        } catch (IOException e) {
            System.out.println("Read properties file error");
            e.printStackTrace();
        }
        //2.Check site title
        assertThat("Title страницы неверный", driver.getTitle().equals("Users"));
        //3.Login
        homePage.enterButtonClick();
        loginForm.authorize(testProperties.getProperty("logintestdata.username"), testProperties.getProperty("logintestdata.password"));
        //4.Check user Button contains user name
        assertThat(userAccount.getUserAccountText(), equalTo(testProperties.getProperty("logintestdata.name")));
        //5.Logout
        userAccount.logout();
    }
}
