package org.example;

//importing org.openqa.selenium.chrome.ChromeDriver package
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


//DriverManager class inheriting the properties of Utils class
public class DriverManager extends Utils
{
    //To open browser
    public void openBrowser()
    {
        //set driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
        //opening Chrome browser
        driver = new ChromeDriver();
        //Keeping the browser in full screen mode
        driver.manage().window().maximize();
        //Navigating to demo.nopcommerce.com website with get() method through the object driver
        driver. get("https://demo.nopcommerce.com/");

    }

    //To close browser
    public void closeBrowser()

    {
       //To close browser
        driver.quit();
    }


}
