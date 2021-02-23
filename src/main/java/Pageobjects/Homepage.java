package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import helpers.Action;

public class Homepage extends testBase{
	Action action =new Action();
	@FindBy(id="search_query_top")
	private WebElement SearchproductBox;
	@FindBy(name="submit_search")
	private WebElement SearchButton;
	@FindBy(xpath="//*[@id='center_column']//img")
	private WebElement productResult;
	
public Homepage() {
		PageFactory.initElements(driver, this);
		}
	
	public String getCurrenturl() {
		String homepageURL=driver.getCurrentUrl();
		return homepageURL;
		
	}

public void SearchProduct() {
	
	action.type(SearchproductBox, "Dresses");
	action.click(driver, SearchButton);
	
//  SearchproductBox.sendKeys("Dresses");
//	SearchButton.click();
	
	}

public void isProductAvailable() throws Exception {
	 action.isDisplayed(driver, productResult);	
	action.scrollByVisibilityOfElement(driver, productResult);
	
	action.JSClick(driver, productResult);
	Thread.sleep(2000);
}
public void clickonProd(){
	
}
}