package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage {

    @FindBy(id = "customer.firstName")
    public WebElement firstNameInput;

    @FindBy(id= "customer.lastName")
    public WebElement lastNameInput;

    @FindBy(id = "customer.address.street")
    public WebElement addressInput;

    @FindBy(id = "customer.address.city")
    public WebElement cityInput;

    @FindBy(id = "customer.address.state")
    public WebElement stateInput;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCodeInput;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumberInput;

    @FindBy(id = "customer.ssn")
    public WebElement ssnInput;

    @FindBy(id = "customer.username")
    public WebElement userNameInput;

    @FindBy(id = "customer.password")
    public WebElement passwordInput;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    public WebElement submitAccountRegistrationButton;

   public RegisterAccountPage typeIntoFirstNameInput(String firstName){
        LOGGER.info("Type user first name into firstNameInput");
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegisterAccountPage typeIntoLastNameInput(String lastName){
        LOGGER.info("Type user last name into firstNameInput");
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public RegisterAccountPage typeIntoAddressInput (String address){
        LOGGER.info("Type user address into addressInput");
        addressInput.sendKeys(address);
        return this;
    }

    public RegisterAccountPage typeIntoCityInput(String city){
       LOGGER.info("Type user address into addressInput");
       cityInput.sendKeys(city);
       return this;
    }

    public RegisterAccountPage typeIntoStateInput(String state){
        LOGGER.info("Type user state into stateInput");
        stateInput.sendKeys(state);
        return this;
    }

    public RegisterAccountPage typeIntoZipCodeInput(String zipCode){
        LOGGER.info("Type user zip code into zipCodeInput");
        zipCodeInput.sendKeys(zipCode);
        return this;
    }

    public RegisterAccountPage typeIntoPhoneNumberInput(String phoneNumber){
        LOGGER.info("Type user phone number into phoneNumberInput");
        phoneNumberInput.sendKeys(phoneNumber);
        return this;
    }

    public RegisterAccountPage typeIntoSSNInput(String ssnNumber){
        LOGGER.info("Type user SSN into ssnNumber");
        ssnInput.sendKeys(ssnNumber);
        return this;
    }

    public RegisterAccountPage typeIntoUserNameInput(String userName){
        LOGGER.info("Type user name into userNameInput");
        userNameInput.sendKeys(userName);
        return this;
    }

    public RegisterAccountPage typeIntoPasswordInput(String password){
        LOGGER.info("Type user password into passwordInput");
        passwordInput.sendKeys(password);
        return this;
    }

    public RegisterAccountPage typeIntoConfirmPasswordInput(String password){
        LOGGER.info("Type user password into confirmPasswordInput");
        confirmPasswordInput.sendKeys(password);
        return this;
    }

    public AccountServicesPage submitAccountRegistration(){
        LOGGER.info("Submit account registration by clicking button");
        submitAccountRegistrationButton.click();
        return new AccountServicesPage();
    }
}

