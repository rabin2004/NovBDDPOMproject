package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class SignOnPage extends Main{

	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public SignOnPage() {
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
}
