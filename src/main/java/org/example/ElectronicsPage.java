package org.example;
//importing org.openqa.selenium.By package
import org.openqa.selenium.By;
//ElectronicsPage class inheriting the properties of Utils
public class ElectronicsPage extends Utils
{

    //Camera and photo locator
    private By _cameraAndPhoto = By.linkText("Camera & photo");


    public void navigateToCameraAndPhoto()

  {
      //clicking on camera and photo
      clickOnElement(_cameraAndPhoto);
  }

}
