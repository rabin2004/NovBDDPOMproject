package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class RegisterSuccessPage extends Main{
	
	@FindBy(xpath="//table[@width='492']/tbody/tr[3]/td/p[3]/font")
	WebElement regsitrationSuccessMsg;
	
	public RegisterSuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateRegistrationSuccessMsg() {
		return regsitrationSuccessMsg.isDisplayed();
	}
	
	public String getRegistrationSuccessMsg() {
		return regsitrationSuccessMsg.getText();
	}
	

}
