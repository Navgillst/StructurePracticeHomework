package org.example;
//importing org.openqa.selenium.By package
import org.openqa.selenium.Alert;
//importing org.openqa.selenium.By package
import org.openqa.selenium.By;
//importing org.testng.Assert package
import org.openqa.selenium.WebElement;
//importing org.openqa.selenium.support.ui.ExpectedConditions package
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//importing org.testng.Assert package
import org.testng.Assert;
//importing java.time.Duration package
import java.time.Duration;
//importing java.util.List package
import java.util.List;

//HomePage class inheriting the properties of Utils class
public class HomePage extends Utils
{

    //Register locator on homepage
    private By _registrationButton = By.className("ico-register");

    //Electronics locator
    private By _electronicsCategory = By.linkText("Electronics");

    //Currency field locator
    private By _currency = By.id("customerCurrency");

    //vote button locator
    private By _voteButton =By.id("vote-poll-1");

    //Facebook logo locator
    private By _facebookHomePage = By.xpath("//li[@class=\"facebook\"]/a\n");

    //Nop Commerce new release details button locator
    private By _detailsButton = By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a");

    //Apple mac-book pro picture locator
    private By _appleMacBookPro = By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]");


    public void verifyRegisterButtonIsPresent()
    {
        //driver is waiting for URL
        waitForUrlTOBe("https://demo.nopcommerce.com/", 10);

        //verifying Register Button Is Present
        Assert.assertEquals(getTextFromElement(_registrationButton), "Register", "Register Button is not present");

    }

    //clicking on register button on homepage
    public void clickOnRegisterButton() {
        clickOnElement(_registrationButton);
    }

    //clicking on electronics
    public void navigateToElectronics()
    {
        //clicking on electronics
        clickOnElement(_electronicsCategory);

    }

    public void verifyCorrectCurrencySymbolDisplayIsUSD()
    {
        //selecting the US Dollar Currency from drop down
        selectFromDropDownByVisibleText(_currency,"US Dollar");
        //price list of all the products
        List<WebElement> currency =  driver.findElements(By.className("prices"));
        //loop is running through prices of all products
        for (WebElement element : currency)
        {
            //condition to verify all prices contain dollar sign
            Assert.assertTrue(element.getText().contains("$"));
            //printing the price list of all products
            System.out.println(element.getText());
        }
    }
    public void verifyCorrectCurrencySymbolDisplayIsEuro()
    {
        //selecting the Euro Currency from drop down
        selectFromDropDownByVisibleText(_currency,"Euro");
        //price list of all the products
        List<WebElement> currency =  driver.findElements(By.className("prices"));
        //loop is running through prices of all products
        for (WebElement element : currency)
        {
            //condition to verify all prices contain Euro sign
            Assert.assertTrue(element.getText().contains("€"));
            //printing the price list of all products
            System.out.println(element.getText());
        }
    }


    //clicking on vote button any verifying if alert is present
    public void acceptIfAlertPresent()
    {
        //clicking on vote button
        clickOnElement(_voteButton);

        //waiting 10 seconds for next element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
            //waiting for alert and checking if alert present
            wait.until(ExpectedConditions.alertIsPresent());

            //switching to alert
            Alert alert = driver.switchTo().alert();

            //accepting alert
            alert.accept();

        }
        //catching exception if no alert present
        catch (Exception e)
        {
            System.out.println("No alert");
        }

    }

    public  void clickOnNopCommerceNewReleaseDetailsButton()
    {
        //clicking on details button
        clickOnElement(_detailsButton);


    }
    public void facebookLogo()
    {
        //clicking on facebook logo on homepage
        clickOnElement(_facebookHomePage);

    }


    public void clickOnAppleMacBookPro()
    {
        //Navigates to the 'picture of Apple Macbook' page by clicking on picture
        clickOnElement(_appleMacBookPro);
    }

}
