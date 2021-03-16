package com.example.SpringBasic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUsername;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void Login(String username, String password) {
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);

    }

    public HomePage clickLogin() {
        btnLogin.submit();
        System.out.println("click Login");
        return new HomePage();
    }


}
