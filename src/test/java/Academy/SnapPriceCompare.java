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
import resources.base;

public class SnapPriceCompare extends base {

	// VerifyTitle
	// AutoSuggestivedropdown
	// Sort
	// Price Comparison of a product on Product listing & Product detail page

	public WebDriver driver;
	String Pc;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void SortSaree()

	{

		SnapSort sp = new SnapSort(driver);

		String Lp = sp.getListingPrice().getAttribute("display-price");

		System.out.println(Lp);

		log.info("Got Price in listing page");

		sp.getListingPrice().click();

		String Home = driver.getWindowHandle();

		Set<String> productPages = driver.getWindowHandles();

		Iterator<String> it = productPages.iterator();

		while (it.hasNext()) {

			String child = (String) it.next();

			if (!Home.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				
				log.info("Switched to Product Page");

				String Pc = sp.getProdpagePrice().getText();
				log.info("Got Price in Product page");
				
				System.out.println(Pc);
				
				Assert.assertEquals(Lp, Pc);
				
				log.info("Test Case Passed");

			}

		}

		
		

	}

	@AfterTest(enabled = false)
	public void teardown() {

		driver.close();

	}

}
