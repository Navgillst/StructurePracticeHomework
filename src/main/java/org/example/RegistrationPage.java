package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils
{
    //Female radio button locator
    private By _femaleRadioButton = By.id("gender-female");

    //First name dialog box locator
    private By _firstName = By.id("FirstName");

    //Last name dialog box locator
    private By _lastName = By.id("LastName");

    //Select Day of birth locator
    private By _day = By.name("DateOfBirthDay");

    //Select Month of birth locator
    private By _month = By.name("DateOfBirthMonth");

    //Select Year of birth locator
    private By _year = By.name("DateOfBirthYear");

    //Email dialog box locator
    private By _email = By.id("Email");

    //Company name dialog box locator
    private By _companyName = By.id("Company");

    //Newsletter check box locator
    private By _newsletter = By.xpath("//input[@type=\"checkbox\"]");

    //Password dialog box locator
    private By _password = By.id("Password");

    //Confirm password dialog box locator
    private By _confirmPassword = By.id("ConfirmPassword");

    //Register button on registration page locator
    private By _register = By.id("register-button");

    //driver is waiting for URL and verifying user is on right page
    public void verifyUserIsOnRegisterPage()
    {
        waitForUrlTOBe("https://demo.nopcommerce.com/register?returnUrl=%2F",10);

       // verifying user is on right page with assert
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));

    }

    //clicking on female radio button
    public void verifyUserIsAbleToClickOnFemaleButton()
    {

        clickOnElement(_femaleRadioButton);
    }

    //inputting firstname
    public void verifyUserIsAbleToInputFirstName()
    {
    typeText(_firstName,"Navpreet");

    }

    //inputting last name
    public void verifyUserIsAbleToInputLastName()
    {

    typeText(_lastName,"Gill");

    }

    //selecting day of the date of birth
    public void verifyUserIsAbleToSelectDate()
    {

        selectFromDropDownByIndex(_day,5);

    }

    //selecting month of the date of birth
    public void verifyUserIsAbleToSelectMonth()
    {
        selectFromDropDownByValue( _month,"3");

    }

    //selecting year of the date of birth
    public void verifyUserIsAbleToSelectYear()
    {
        selectFromDropDownByIndex(_year,9);

    }

    //inputting email address
    public void verifyUserIsAbleToTypeEmailAddress()
    {
        typeText(_email,"navgillst"+getTimeStamp()+"@gmail.com");

    }


    //inputting company name
    public void verifyUserIsAbleToTypeCompanyName()
    {
        typeText(_companyName ,"XYZ Enterprise");

    }

    //clicking on newsletter checkbox to un tick
    public void verifyUserIsAbleToTickNewsletterOnCheckBox()
    {
        clickOnElement(_newsletter);

    }

    //inputting password
    public void verifyUserIsAbleToTypePassword()
    {
        typeText(_password,"Test1234");

    }

    //inputting password again to confirm
    public void verifyUserIsAbleToReTypePassword()
    {
        typeText(_confirmPassword,"Test1234");

    }

    //clicking on register button
    public void verifyUserIsAbleToClickOnRegisterButton()
    {
        clickOnElement(_register);

    }













}
