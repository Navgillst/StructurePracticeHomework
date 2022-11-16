package org.example;
//Importing org.testng.annotations.Test package
import org.testng.annotations.Test;

//TestSuit class inheriting the properties of BaseTest
public class TestSuit extends BaseTest
{

    //Test annotation to run test with using main method
    @Test
    public void registrationPage_Test()
    {
        //Methods from HomePage class are being called with its object
        homepage.verifyRegisterButtonIsPresent();

        homepage.clickOnRegisterButton();


        //Methods from RegistrationPage class are being called with its object
        registrationPage.verifyUserIsOnRegisterPage();

        registrationPage.verifyUserIsAbleToClickOnFemaleButton();

        registrationPage.verifyUserIsAbleToSelectDate();

        registrationPage.verifyUserIsAbleToInputFirstName();

        registrationPage.verifyUserIsAbleToInputLastName();

        registrationPage.verifyUserIsAbleToSelectMonth();

        registrationPage.verifyUserIsAbleToSelectYear();

        registrationPage.verifyUserIsAbleToTypeEmailAddress();

        registrationPage.verifyUserIsAbleToTypeCompanyName();

        registrationPage.verifyUserIsAbleToTickNewsletterOnCheckBox();

        registrationPage.verifyUserIsAbleToTypePassword();

        registrationPage.verifyUserIsAbleToReTypePassword();

        registrationPage.verifyUserIsAbleToClickOnRegisterButton();


        //Method from RegisterResultPage class are being called with its object
        registerResultPage.verifyUserIsAbleToSeeRegisteredMessage();

    }


}
