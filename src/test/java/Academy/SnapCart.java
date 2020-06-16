package Academy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SnapSort;
import pageObjects.SortProdupageCart;
import resources.base;

public class SnapCart extends base {

	// VerifyTitle
	// AutoSuggestivedropdown
	// Sort
	// Price Comparison of a product on Product listing & Product detail page
	// Change Quantity in cart & Remove item, check cart is empty or not.

	public WebDriver driver;
	String Pc;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void CartSaree() throws InterruptedException

	{

		SortProdupageCart spc = new SortProdupageCart(driver);

		spc.getAddCartBtn().click();
		log.info("Clicked on Add to cart button");

		spc.getCart().click();
		log.info("Clicked on Cart");

		// spc.getCartQty().click();
		// spc.getCartQty3().click();

		spc.getCartRemove().click();
		log.info("Clicked ON Romove");

		Thread.sleep(3000);
		String title = spc.getCartRemovedTitle().getText();
		System.out.println(title);
		log.info("Got Remove Field Text");

		Assert.assertEquals(title, "Shopping Cart is empty!");

		log.info("Cart is Empty");

		
	}
	

	@AfterTest(enabled = false)
	public void teardown() {

		driver.close();

	}

}
