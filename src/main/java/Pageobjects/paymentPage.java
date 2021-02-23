package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import helpers.Action;

public class paymentPage extends testBase {
	Action action =new Action();
	@FindBy(xpath = "//a[contains(text(),'Pay by bank wire')]")
	private WebElement bankWireMethod;
	@FindBy(xpath = "//a[contains(text(),'Pay by check')]")
	private WebElement payByCheckMethod;
	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]") 
	 WebElement confirmOrder;
	
	/*
	 * @FindBy(xpath="//button/span[contains(text(),'Proceed to checkout')]")
	 * private WebElement orderConfirmation;
	 * 
	 * @FindBy(id="cgv") private WebElement terms;
	 * 
	 * @FindBy(xpath = "//span[contains(text(),'I confirm my order')]") private
	 * WebElement confirmOrder;
	 */
	public paymentPage() {
		 PageFactory.initElements(driver, this);

		}

public OrderSummaryPage clickonbankwirepaym() {
	action.click(driver, bankWireMethod);
	action.click(driver, confirmOrder);
	return new OrderSummaryPage();
	
}

}
