package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortProdupageCart {

	
	public WebDriver driver;
	
		
	By AddCartBtn =By.xpath("//*[@id='add-cart-button-id']");
	By Cart =By.xpath("//*[@class='cartTextSpan']");
	
	By CartQty =By.xpath("//*[contains(@class,'styledSelect')]");
	By CartQty3 =By.xpath("//*[@class='options cart-dropdown']/ul/li[3]");
	By CartRemove =By.xpath("//*[@class='remove-item-shortlist']");
	By CartRemovedTitle =By.xpath("//*[@class='cart-heading clearfix']");
	
	
	
	public SortProdupageCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}



	public WebElement getAddCartBtn()
	{
		return driver.findElement(AddCartBtn);
	}
	
		
	public WebElement getCart()
	{
		return driver.findElement(Cart);
	}
	
		
	public WebElement getCartQty()
	{
		return driver.findElement(CartQty);
	}
	
	
	public WebElement getCartQty3()
	{
		return driver.findElement(CartQty3);
	}
	
	
	public WebElement getCartRemove()
	{
		return driver.findElement(CartRemove);
	}
	
	
	public WebElement getCartRemovedTitle()
	{
		return driver.findElement(CartRemovedTitle);
	}
	
	
	
}
