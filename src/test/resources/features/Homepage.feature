Feature:  validate as a user will able to select the Dresses and perform operations 

  Scenario: 
  	Given I am on the Home page URL "http://automationpractice.com/index.php"
    When I search the product "Dresses" in search bar
    Then validate the product is displayed on the page
    Then user should be able to add the product to the cart
    And I should be able to validate the mesage on the cart 
    Then I click on Proceed to Checkout button 
    And I validate the unit price 
    And I validate the total price 
    Then I click on checkout button
    Then I login to order the product
    And  I confirm order 
    Then click on agree terms and confirm 
    Then select the payment method and confirm order
    Then validate the order confirmation message 
   
    
    
   
  