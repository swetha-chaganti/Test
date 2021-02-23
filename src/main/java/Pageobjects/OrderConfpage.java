package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import helpers.Action;

public class OrderConfpage extends testBase{
	
	Action action =new Action();
	@FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
	private WebElement confirmMsg;
	
	public OrderConfpage() {
		 PageFactory.initElements(driver, this);
		 
	}
	
	public String validateconfirmMsg() {
		String validationMsg=confirmMsg.getText();
		return validationMsg;
	}
}
	
	