package ru.levelup.kseniia.alekseeva.qa.homework_5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserCreateForm {
    private WebDriver driver;

    public UserCreateForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "noibiz_name")
    private WebElement namefield;

    @FindBy(name = "noibiz_email")
    private WebElement emailfield;

    @FindBy(name = "noibiz_password")
    private WebElement passwordfield;

    @FindBy(name = "noibiz_birthday")
    private WebElement birthdayfield;

    @FindBy(name = "noibiz_gender")
    private WebElement genderfield;

    @FindBy(xpath = "//input[@value = 'Добавить пользователя']")
    private WebElement addUserFinal;

    @FindBy(xpath = "//input[@placeholder = 'Введите email или имя']")
    private WebElement searchInTable;

    @FindBy(xpath = "//button[text()='Найти']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class = 'content']/table[@class = 'table']/tbody/tr/td")
    private WebElement rowInTableWithEmail;

    public void createTestUser(String name, String email, String password, String birthday) {
        namefield.sendKeys(name);
        emailfield.sendKeys(email);
        passwordfield.sendKeys(password);
        birthdayfield.sendKeys(birthday);
        selectFemaleGender();
        addUserFinal.click();
    }

    public void findCreatedUser(String email) {
        searchInTable.sendKeys(email);
        searchButton.click();
    }

    public String getEmailFromTable() {
        return rowInTableWithEmail.getText();
    }

    private void selectFemaleGender() {
        Select select = new Select(genderfield);
        select.selectByVisibleText("Женский");
    }


}
