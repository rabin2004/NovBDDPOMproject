package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class HomePage extends Main {
	// create webElement from the page & define functionality for the element
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="submit")
	WebElement submitBtn;
	@FindBy(linkText="REGISTER")
	WebElement registerLink;
	@FindBy(xpath = "//td[@width='112']/span")
	WebElement loginUnsuccessfulErrorMsg;
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	// load all element into driver 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		userName.sendKeys(username);
	}
	
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public void hitEnterForSubmitBtn() {
		submitBtn.sendKeys(Keys.ENTER);
	}
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	public String homePageTitle() {
		return driver.getTitle();
	}
	
	public String homePageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean validateLoginUnsuccessfulErrorMsg() {
		return loginUnsuccessfulErrorMsg.isDisplayed();
	}
	
	public void clickSignOnLink() {
		signOnLink.click();
	}

}
