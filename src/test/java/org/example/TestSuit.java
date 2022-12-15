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
        registrationPage.clickOnRegisterSubmit();


        //Method from RegisterResultPage class are being called with its object
        registerResultPage.verifyUserIsAbleToSeeRegisteredMessage();

    }

    //Test annotation to run test with using main method
    @Test
    public void  printingProductName()
    {
        homepage.navigateToElectronics();
        electronicsPage.navigateToCameraAndPhoto();
        cameraAndPhotoPage.productNames();
        //cameraAndPhotoPage.addToCart();
        cameraAndPhotoPage.addTocartButtoncheck();


    }

    //Test annotation to run test with using main method
    @Test
    //checking if correct currency symbol display for each product
    public void currencySymbol()
    {
        homepage.verifyCorrectCurrencySymbolDisplayIsUSD();
        homepage.verifyCorrectCurrencySymbolDisplayIsEuro();
    }

    //Test annotation to run test with using main method
    @Test
    //verifying if alert present then accepting alert
    public void handleAlert()
    {
        homepage.acceptIfAlertPresent();

    }

    //Test annotation to run test with using main method
    @Test
    //commenting on demo nopcommerce new release
    public void newReleaseComment()
    {
        homepage.clickOnNopCommerceNewReleaseDetailsButton();
        newReleaseCommentPage.addComment();
        newReleaseCommentPage.verifyActualCommentMessageIsEqualToExpectedCommentMessage();

    }


    //Test annotation to run test with using main method
    @Test
    public void facebook()
    {
        //clicking on facebook logo
        homepage.facebookLogo();
        //giving handle to new tab and bring the handle back
        facebookPage.newTab();
    }


    //Test annotation to run test with using main method
    @Test
    //Referring Apple MacBook pro 13-inch to a friend
    public void referProductToAFriend()
    {
        homepage.clickOnRegisterButton();

        registrationPage.register();

        registerResultPage.verifyUserIsAbleToSeeRegisteredMessage();

        registerResultPage.clickOnContinue();

        homepage.clickOnAppleMacBookPro();

        appleMacBookProPage.emailAFriend();

        productEmailAFriend.verifyEmailMessage();

    }

    @Test
    public void hoverFunctionality()
    {
        homepage.hoverActionComputer();
    }

    @Test
    public void searchFunctionality()
    {
        homepage.searchBar();
        nikePage.verifySearchFunctionality();
    }


}
