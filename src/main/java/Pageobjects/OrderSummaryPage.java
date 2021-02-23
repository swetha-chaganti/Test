package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import helpers.Action;

public class OrderSummaryPage extends testBase {
	
	Action action =new Action();
	@FindBy(xpath = "//*[@id='center_column']/form/p/button")
	private WebElement confirmOrder;
	@FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedtocheckout;
	@FindBy(id="cgv")
	private WebElement terms;
	
	public OrderSummaryPage() {
		 PageFactory.initElements(driver, this);
		//*[@id="center_column"]/form/p/button/span //*[@id="center_column"]/form/p/button
		}
	public void Orderconfirm() {
		action.click(driver, confirmOrder);
		
	}
	public void agreeTerms() {
		action.click(driver, terms);
		action.click(driver, proceedtocheckout);
	}
}