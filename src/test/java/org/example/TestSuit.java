package org.example;
//Importing org.testng.annotations.Test package
import org.testng.annotations.Test;

//TestSuit class inheriting the properties of BaseTest
public class TestSuit extends BaseTest
{

    //Test annotation to run test with using main method
    @Test
    public void registrationDetails()
    {
        //Methods from HomePage class are being called with its object
        homepage.verifyRegisterButtonIsPresent();
        homepage.clickOnRegisterButton();


        //Methods from RegistrationPage class are being called with its object
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.register();


        //Method from RegisterResultPage class are being called with its object
        registerResultPage.verifyUserIsAbleToSeeRegisteredMessage();

    }


}
