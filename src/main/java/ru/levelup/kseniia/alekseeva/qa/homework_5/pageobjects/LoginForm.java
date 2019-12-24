package ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginForm {
    private WebDriver driver;

    @FindBy(name = "login")
    private WebElement loginTextField;

    @FindBy(name = "password")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@value = 'Авторизоваться']")
    private WebElement authorisationButton;


    public LoginForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void authorize(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, 15, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(loginTextField));
        loginTextField.sendKeys(username);
        wait.until(ExpectedConditions.elementToBeClickable(passwordTextField));
        passwordTextField.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(authorisationButton));
        authorisationButton.click();
    }

}
