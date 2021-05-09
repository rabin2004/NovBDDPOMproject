package step_definition;

import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginSuccessPage;
import pageFactory.SignOnPage;

public class LoginFunctionalityTest extends Main{
	HomePage hp;
	LoginSuccessPage lsp;
	SignOnPage sop;
	
	public LoginFunctionalityTest() {
		super();
		hp = new HomePage();
		lsp = new LoginSuccessPage();
		sop = new SignOnPage();
	}
	
	@Given("user is in home page")
	public void user_is_in_home_page() {
	   Assert.assertEquals(hp.homePageUrl(), prop.getProperty("url"));
	}

	@When("user provides valid username")
	public void user_provides_valid_username() {
	   hp.enterUsername("test123");
	}

	@And("provides valid password")
	public void provides_valid_password() {
		hp.enterPassword("123");
	}

	@And("clicks submit button")
	public void clicks_submit_button() {
	   hp.clickSubmitBtn();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	   Assert.assertTrue(lsp.validateLoginSuccessMsg());
	}
	
	@And("hits enter")
	public void hits_enter() {
	    hp.hitEnterForSubmitBtn();
	}
	
	@When("user provides invalid username")
	public void user_provides_invalid_username() {
		hp.enterUsername("tom123");
	}

	@When("provides invalid password")
	public void provides_invalid_password() {
		hp.enterPassword("t12345");
	}

	@Then("user should not be able to login")
	public void user_should_not_be_able_to_login() {
	    Assert.assertTrue(hp.validateLoginUnsuccessfulErrorMsg());
	}
	
	@Given("user is in Sign on page")
	public void user_is_in_sign_on_page() {
		Assert.assertEquals(hp.homePageUrl(), prop.getProperty("url"));
		hp.clickSignOnLink();
	}
	
	@When("user provides valid {string}")
	public void user_provides_valid_username(String username) {
		sop.enterUsername(username);
	}

	@And("provides valid {string}")
	public void provides_valid_password(String password) {
		sop.enterPassword(password);
	}

}
