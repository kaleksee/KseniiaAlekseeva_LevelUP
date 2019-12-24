package ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserAccount {
    private WebDriver driver;

    @FindBy(xpath = "//li[@id = 'fat-menu']/a")
    private WebElement userButtonWithAvatar;

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    @FindBy(linkText = "Выход")
    private WebElement exit;

    @FindBy(linkText = "Пользователи")
    private WebElement usersButton;

    @FindBy(linkText = "Добавить пользователя")
    private WebElement addUserButton;


    public UserAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUserAccountText() {
        WebDriverWait wait = new WebDriverWait(driver, 15, 2000);
        wait.until(ExpectedConditions.visibilityOf(userButtonWithAvatar));
        return userButtonWithAvatar.getText();
    }

    public void logout() {
        userButton.click();
        exit.click();
    }

    public void clickAddUserButton() {
        usersButton.click();
        addUserButton.click();
    }
}
