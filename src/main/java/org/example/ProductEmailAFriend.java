package org.example;
//importing org.openqa.selenium.By package
import org.openqa.selenium.By;

//importing org.testng.Assert package
import org.testng.Assert;

//ProductEmailAFriend class inheriting the properties of Utils class
public class ProductEmailAFriend extends Utils
{

    //actual message locator
    private By _actualText = By.xpath("//div[@class=\"result\"]");
    public void verifyEmailMessage()
    {
        //getting actual text by its locator
        String actualMessage = getTextFromElement(_actualText);

        //putting expected text to variable
        String expectedMessage = "Your message has been sent.";

        //comparing the expected text with actual
        Assert.assertEquals(actualMessage,expectedMessage,"Email Message is valid");

    }

}
