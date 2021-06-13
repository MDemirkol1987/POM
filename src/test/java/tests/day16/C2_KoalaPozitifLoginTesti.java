package tests.day16;

import org.testng.annotations.Test;
import pages.KoalaResortLoginPage;
import utilities.Driver;
import utilities.TestBase;

public class C2_KoalaPozitifLoginTesti extends TestBase {

    @Test
    public void PositiveTest() {
        driver.get("http://qa-environment.koalaresorthotels.com");

        KoalaResortLoginPage koalaResortLoginPage=new KoalaResortLoginPage(Driver.getDriver());

        koalaResortLoginPage.ilkLoginLinki.click();
        koalaResortLoginPage.kullanıcıAdı.sendKeys("manager");
        koalaResortLoginPage.passwordTextBox.sendKeys("Manager1!");
        koalaResortLoginPage.logInButonu.click();

    }

    @Test
    public void NegativeTest(){
        driver.get("http://qa-environment.koalaresorthotels.com");
        KoalaResortLoginPage koalaResortLoginPage=new KoalaResortLoginPage(driver);
        koalaResortLoginPage.ilkLoginLinki.click();
        koalaResortLoginPage.kullanıcıAdı.sendKeys("manager1");
        koalaResortLoginPage.passwordTextBox.sendKeys("Manager1!");
        koalaResortLoginPage.logInButonu.click();
    }
}
