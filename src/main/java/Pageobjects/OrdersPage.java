package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import helpers.Action;

public class OrdersPage extends testBase {
	
	Action action =new Action();
	@FindBy(xpath="//td[@class='cart_unit']/span/span[1]")
	private WebElement unitPrice;
	@FindBy(id="total_price")
	private WebElement totalPrice;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceedToCheckOut;
	public OrdersPage() {
		 PageFactory.initElements(driver, this);

		}
	public double getUnitPrice() {
		String UT=unitPrice.getText();
		//AFter getting the price we have to remove the $ sign from the price so this will be done by regular expression 
		String unit=UT.replaceAll("[^a-z A-Z 0-9]","");
		//now we have to convert to double 
		double finalunitPrice=Double.parseDouble(unit);
		return finalunitPrice/100; // we get unit price in double i.e 1652 so /100 will be 16.51
	}
	public double getTotalPrice() {
		String TP=totalPrice.getText();
		String tot=TP.replaceAll("[^a-z A-Z 0-9]","");
		double doubletotalPrice=Double.parseDouble(tot);
		return doubletotalPrice/100;
		
	}
	public AuthenticationPage clickOnCheckOut() {
		action.click(driver, proceedToCheckOut);
		return new AuthenticationPage();
}
}
