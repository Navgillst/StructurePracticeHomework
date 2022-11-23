package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
//CameraAndPhotoPage class inheriting the properties of Utils class

public class CameraAndPhotoPage extends Utils
{
    private By _productTitle = By.xpath("//h2[@class=\"product-title\"]");
    public void productNames()
    {
        List<WebElement> productNameList = driver.findElements(_productTitle);

        for(WebElement element : productNameList)
        {
            System.out.println(element.getText());

        }


    }


}
