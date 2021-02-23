package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import helpers.Action;

public class AuthenticationPage extends testBase {
	Action action =new Action();
	@FindBy(xpath = "//*[@id='email']")
	private WebElement Email;
	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement Passwrd;
	@FindBy(id="SubmitLogin")
	private WebElement SubmitButton;
	
	public AuthenticationPage() {
		 PageFactory.initElements(driver, this);

		}
public void enterCrendentials() {
	action.type(Email, "utest8505@gmail.com");
	action.type(Passwrd, "Test@789");
	action.click(driver, SubmitButton);
}
}
