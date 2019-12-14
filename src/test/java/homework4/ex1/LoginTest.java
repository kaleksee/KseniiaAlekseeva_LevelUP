package homework4.ex1;

import homework4.SeleniumDriverBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends SeleniumDriverBase {

    @Test
    public void registrationTest() {
        String userName = "email.test7890@yandex.ru";
        String password = "start123";
        String name = "kseniiaemail.test7890@yandex.ru";
        SoftAssert softAssertion = new SoftAssert();
        //1.Open test site
        driver.get("http://users.bugred.ru/");
        //2.Check site title
        softAssertion.assertTrue(driver.getTitle().equals("Users"));
        //3.Login
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        driver.findElement(By.name("login")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value = 'Авторизоваться']")).click();
        //4.Check user Button contains user name
        String userButtonText = driver.findElement(By.xpath("//li[@id = 'fat-menu']/a")).getText();
        softAssertion.assertTrue(userButtonText.equals(name));
        softAssertion.assertAll();
        //5.Logout
        driver.findElement(By.cssSelector(".dropdown-toggle")).click();
        driver.findElement(By.linkText("Выход")).click();

    }


}
