package tests.day16;

import org.testng.annotations.Test;
import pages.KoalaResortLoginPage;
import utilities.TestBase;

public class C3_KoalaNegatifTest extends TestBase {
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
