package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class RegisterPage extends Main{
	
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(name="phone")
	WebElement phoneNumber;
	@FindBy(id="userName")
	WebElement emailAdd;
	@FindBy(id="email")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public boolean validateSubmitBtn() {
		return submitBtn.isEnabled();
	}
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
	
	public void enterFirstName(String FirstName) {
		firstName.sendKeys(FirstName);
	}
	
	public void enterLastName(String LastName) {
		lastName.sendKeys(LastName);
	}
	
	public void enterPhoneNumber(String PhoneNumber) {
		phoneNumber.sendKeys(PhoneNumber);
	}
	
	public void enterEmailAdd(String EmailAdd) {
		emailAdd.sendKeys(EmailAdd);
	}
	
	public void enterUserName(String UserName) {
		userName.sendKeys(UserName);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void enterConfirmPassword(String ConfirmPassword) {
		confirmPassword.sendKeys(ConfirmPassword);
	}
	
	
	
	
	
	
	

}
