package StepD;



import org.testng.Assert;

import Base.testBase;
import Pageobjects.AuthenticationPage;
import Pageobjects.Homepage;
import Pageobjects.OrderConfpage;
import Pageobjects.OrderSummaryPage;
import Pageobjects.OrdersPage;
import Pageobjects.addtoCartPage;
import Pageobjects.paymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStep extends testBase{
	Homepage home = new Homepage();
	addtoCartPage cartpage=new addtoCartPage();
	AuthenticationPage auth=new AuthenticationPage();
	OrdersPage orderpage=new OrdersPage();
	OrderSummaryPage sumary=new OrderSummaryPage();
OrderConfpage confirmation=new OrderConfpage();
	paymentPage payment=new paymentPage();
	@Given("I am on the Home page URL {string}")
	public void i_am_on_the_home_page_url(String url) {
		driver.get(url);
		home.getCurrenturl();
	   
	}
	@When("I search the product {string} in search bar")
	public void i_search_the_product_in_search_bar(String string) {
	   home.SearchProduct();
	}

	@Then("validate the product is displayed on the page")
	public void validate_the_product_is_displayed_on_the_page() throws Exception {
		home.isProductAvailable();
	}

	@Then("user should be able to add the product to the cart")
	public void user_should_be_able_to_add_the_product_to_the_cart() throws InterruptedException {
		cartpage.addProdtoCart();
	}
	@And("I should be able to validate the mesage on the cart")
	public void i_should_be_able_to_validate_the_mesage_on_the_cart() {
		boolean ress=cartpage.validateCart();
		Assert.assertTrue(ress);
	}
	@Then("I click on Proceed to Checkout button")
	public void i_click_on_proceed_to_checkout_button() {
		cartpage.checkOut();
	}
	@Then("I validate the unit price")
	public void i_validate_the_unit_price() {
		orderpage.getUnitPrice();
	}

	@Then("I validate the total price")
	public void i_validate_the_total_price() {
		orderpage.getTotalPrice();
	}


	@Then("I click on checkout button")
	public void i_click_on_checkout_button() {
		orderpage.clickOnCheckOut();
		
	}
	@Then("I login to order the product")
	public void i_login_to_order_the_product() {
		auth.enterCrendentials();
	}
	@Then("I confirm order")
	public void i_confirm_order() {
		sumary.Orderconfirm();
	}

	@Then("click on agree terms and confirm")
	public void click_on_agree_terms_and_confirm() {
		sumary.agreeTerms();
	}

	@Then("select the payment method and confirm order")
	public void select_the_payment_method_and_confirm_order() {
		payment.clickonbankwirepaym();
	}

	@Then("validate the order confirmation message")
	public void validate_the_order_confirmation_message() {
		String actualMsg=confirmation.validateconfirmMsg();
		String expectedMsg="Your order on My Store is complete.";
		Assert.assertEquals(actualMsg, expectedMsg);
	    
	}


	   
	

}
