package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import helpers.Action;

public class addtoCartPage extends testBase{
	Action action =new Action();
	
	@FindBy(css="#quantity_wanted")
	public WebElement quanityneeded;
	@FindBy(xpath="//*[@id='group_1']")
	public WebElement Selectsize;
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	private WebElement addtocartBtn;
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/h2")
	private WebElement addtocartMsg;
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedtocheckout;
	
	public addtoCartPage() {
		PageFactory.initElements(driver, this);
		}
	public void addProdtoCart() throws InterruptedException {
		action.type(quanityneeded, "2");
		action.fluentWait(driver, Selectsize, 5);
		action.selectByValue(Selectsize, "2");
		action.click(driver, addtocartBtn);
		Thread.sleep(3000);
	}
	public boolean validateCart() {
		action.fluentWait(driver, addtocartMsg, 10);
		 return action.isDisplayed(driver, addtocartMsg);
		
	}
	public void checkOut() {
		action.click(driver, proceedtocheckout);
	}
}
