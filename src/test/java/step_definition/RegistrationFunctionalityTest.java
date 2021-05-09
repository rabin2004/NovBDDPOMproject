package step_definition;

import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.RegisterPage;
import pageFactory.RegisterSuccessPage;

public class RegistrationFunctionalityTest extends Main{
	HomePage hp;
	RegisterPage rp;
	RegisterSuccessPage rsp;
	
	public RegistrationFunctionalityTest() {
		super();
		hp = new HomePage();
		rp = new RegisterPage();
		rsp = new RegisterSuccessPage();
	}

	@Given("user is in register page")
	public void user_is_in_register_page() {
	    hp.clickRegisterLink();
	    Assert.assertEquals(rp.getRegisterPageTitle(), "Register: Mercury Tours");
	}

	@When("user provides {string}, {string} and {string}")
	public void user_provides_username_password_and_confirmPassword(String username, 
			String password, String confirmPassword) {
	    rp.enterUserName(username);
	    rp.enterPassword(password);
	    rp.enterConfirmPassword(confirmPassword); 
	}

	@Then("{string} should be able to register")
	public void username_should_be_able_to_register(String username) {
	    Assert.assertEquals(rsp.getRegistrationSuccessMsg(), "Note: Your user name is "+username+".");
	}

}
