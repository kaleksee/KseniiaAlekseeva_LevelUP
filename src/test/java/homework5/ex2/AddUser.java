package homework5.ex2;

import homework4.SeleniumDriverBaseUsersBugred;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects.HomePage;
import ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects.LoginForm;
import ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects.UserAccount;
import ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects.UserCreateForm;

import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AddUser extends SeleniumDriverBaseUsersBugred {
    @Test
    public void addUser() {
        //1.Open test site and initiate elements
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginForm loginForm = new LoginForm(driver);
        UserAccount userAccount = new UserAccount(driver);
        UserCreateForm userCreateForm = new UserCreateForm(driver);
        Properties testProperties = new Properties();
        try {
            testProperties.load(this.getClass().getClassLoader().getResourceAsStream("data/useraddtest.properties"));
        } catch (IOException e) {
            System.out.println("Read properties file error");
            e.printStackTrace();
        }
        //2.Check site title
        assertThat("Title страницы неверный", driver.getTitle().equals("Users"));
        //3.Login
        homePage.enterButtonClick();
        loginForm.authorize(testProperties.getProperty("useraddtest.username"), testProperties.getProperty("useraddtest.password"));
        //4.Create new user
        userAccount.clickAddUserButton();
        String name = testProperties.getProperty("useraddtest.newname");
        String email = testProperties.getProperty("useraddtest.newemail");
        String password = testProperties.getProperty("useraddtest.newpassword");
        String birthday = testProperties.getProperty("useraddtest.birthday");
        userCreateForm.createTestUser(name, email, password, birthday);
        //5.Find new user in the table
        userCreateForm.findCreatedUser(email);
        assertThat(userCreateForm.getEmailFromTable(), equalTo(email));
        //6.Logout
        userAccount.logout();
    }
}
