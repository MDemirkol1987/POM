package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.FacebookLoginPage;
import utilities.TestBase;

public class C1_FacebookLoginTest extends TestBase {
    public void gelenekselTest(){
        driver.get("http://facebook.com");
        WebElement emailTextBox = driver.findElement(By.id("email"));
        emailTextBox.sendKeys("mehmet@gmail.com");

        WebElement passwordTextBox = driver.findElement(By.id("pass"));
        passwordTextBox.sendKeys("12345");

        driver.findElement(By.xpath("//button[@name='login']"));

    }

    @Test
    public void pageIleTest(){

        driver.get("http://facebook.com");

        FacebookLoginPage facebookLoginPage=new FacebookLoginPage(driver);

        facebookLoginPage.emailTextBox.sendKeys("mehmet@gmail.com");
        facebookLoginPage.passwordTextBox.sendKeys("12345");
        facebookLoginPage.loginButonu.click();


    }
}
