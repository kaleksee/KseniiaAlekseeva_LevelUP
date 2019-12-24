package ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement enterButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterButtonClick() {
        WebDriverWait wait = new WebDriverWait(driver, 15, 2000);
        wait.until(ExpectedConditions.elementToBeClickable(enterButton));
        enterButton.click();
    }


}
