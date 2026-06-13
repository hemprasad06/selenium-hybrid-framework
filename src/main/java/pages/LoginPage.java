package pages;

import driver.DriverFactory;
import org.openqa.selenium.By;

public class LoginPage {
    private By usernameTextbox = By.id("username");
    private By passwordTextbox = By.id("password");
    private By loginButton = By.id("loginbutton");

    public void enterUsername(String username)
    {
        DriverFactory.getDriver().findElement(usernameTextbox).sendKeys(username);

    }

    public void enterpassword(String password)
    {
        DriverFactory.getDriver().findElement(passwordTextbox).sendKeys(password);
    }

    public void clickLoginButton()
    {
        DriverFactory.getDriver().findElement(loginButton).click();
    }
}
