package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SnapSort {

	public WebDriver driver;

	By Prices = By.xpath("//*[@class='lfloat product-price']");

	By Price = By.xpath("//*[@id='display-price-626198093265']");

	By ListingPrice = By.xpath("//*[@id='display-price-639470304971']");    
	
	By ProdpagePrice = By.xpath("//*[@class='payBlkBig']");   //price on Product page

	public SnapSort(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public List<WebElement> getPrices()

	{
		return driver.findElements(Prices);

	}

	public WebElement getPrice()

	{
		return driver.findElement(Price);

	}

	public WebElement getListingPrice()

	{
		return driver.findElement(ListingPrice);

	}

	public WebElement getProdpagePrice()

	{
		return driver.findElement(ProdpagePrice);

	}
	
	
	
	
}
