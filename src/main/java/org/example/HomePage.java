package org.example;
//importing org.openqa.selenium.By package
import org.openqa.selenium.By;

//importing org.testng.Assert package
import org.testng.Assert;

//HomePage class inheriting the properties of Utils class
public class HomePage extends Utils
{
    //Register locator on homepage
    private By _registrationButton = By.className("ico-register");


    public void verifyRegisterButtonIsPresent()
    {
        //driver is waiting for URL
        waitForUrlTOBe("https://demo.nopcommerce.com/",10);

        //verifying Register Button Is Present
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","Register Button is not present");

    }

    //clicking on register button on homepage
    public void clickOnRegisterButton()
    {
        clickOnElement(_registrationButton);
    }
}
