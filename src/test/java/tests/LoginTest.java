package tests;

import base.BaseTest;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LoginTest extends BaseTest
{
@Test
    public void loginTest()
{
    DriverFactory.getDriver().get("https://www.saucedemo.com/");
    DriverFactory.getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
    DriverFactory.getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
    DriverFactory.getDriver().findElement(By.id("login-button")).click();

    String title = DriverFactory.getDriver().getTitle();
    System.out.println(title);

}
}