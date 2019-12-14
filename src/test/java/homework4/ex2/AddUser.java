package homework4.ex2;

import homework4.SeleniumDriverBase;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AddUser extends SeleniumDriverBase {

    @Test
    public void addUser() {

        String userName = "email.test7890@yandex.ru";
        String password = "start123";
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
        //4.Create new user
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.linkText("Добавить пользователя")).click();
        driver.findElement(By.name("noibiz_name")).sendKeys(RandomStringUtils.randomAlphabetic(8));
        String email = (RandomStringUtils.randomAlphabetic(6) + "@" + RandomStringUtils.randomAlphabetic(3) + ".com").toLowerCase();
        driver.findElement(By.name("noibiz_email")).sendKeys(email);
        driver.findElement(By.name("noibiz_password")).sendKeys("qwerty");
        driver.findElement(By.name("noibiz_birthday")).sendKeys("12042019");
        Select select = new Select(driver.findElement(By.name("noibiz_gender")));
        select.selectByVisibleText("Женский");
        driver.findElement(By.name("noibiz_date_start")).sendKeys("12042019");
        driver.findElement(By.name("noibiz_hobby")).sendKeys("Плавание");
        driver.findElement(By.name("noibiz_name1")).sendKeys(RandomStringUtils.randomAlphabetic(8));
        driver.findElement(By.name("noibiz_surname1")).sendKeys(RandomStringUtils.randomAlphabetic(8));
        driver.findElement(By.xpath("//input[@data-myname = 'noibiz_fathername1']")).sendKeys(RandomStringUtils.randomAlphabetic(8));
        driver.findElement(By.name("noibiz_cat")).sendKeys("Кошка");
        driver.findElement(By.name("noibiz_dog")).sendKeys("Собака");
        driver.findElement(By.name("noibiz_parrot")).sendKeys("Попугайчик");
        driver.findElement(By.name("noibiz_cavy")).sendKeys("Морская свинка");
        driver.findElement(By.name("noibiz_hamster")).sendKeys("Хомячок");
        driver.findElement(By.name("noibiz_squirrel")).sendKeys("Белочка");
        driver.findElement(By.name("noibiz_phone")).sendKeys("4589766555");
        driver.findElement(By.name("noibiz_adres")).sendKeys("Москва Садовая 20");
        driver.findElement(By.name("noibiz_inn")).sendKeys("1111111");
        driver.findElement(By.xpath("//input[@value = 'Добавить пользователя']")).click();
        //5.Find new user in the table
        driver.findElement(By.xpath("//input[@placeholder = 'Введите email или имя']")).sendKeys(email);
        driver.findElement(By.xpath("//button[text()='Найти']")).click();
        String emailFromTable = driver.findElement(By.xpath("//div[@class = 'content']/table[@class = 'table']/tbody/tr/td")).getText();
        softAssertion.assertTrue(emailFromTable.equals(email));
        softAssertion.assertAll();

    }


}
