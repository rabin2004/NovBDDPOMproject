package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class LoginSuccessPage extends Main{
	
	@FindBy(xpath="//table[@width='492']")
	WebElement lognSuccessMsg;
	
	public LoginSuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLoginSuccessMsg() {
		return lognSuccessMsg.isDisplayed();
	}
	
	public String getLoginSuccessPageTitle() {
		return driver.getTitle();
	}

}
