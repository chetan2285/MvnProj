package Academy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

public class SnapSortTest extends base {
	
	//VerifyTitle
	//AutoSuggestivedropdown
	//Sort
	

	public WebDriver driver;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void SortSaree()

	{

		SnapSort sp = new SnapSort(driver);

		List<WebElement> Ac = sp.getPrices();

		// System.out.println(Ac.get(2).getText());

		ArrayList<String> ActualPrices = new ArrayList<String>();

		for (WebElement ft : Ac) {

			String act = ft.getText();

			String pr = act.substring(4);

			ActualPrices.add(pr);

		}

		System.out.println(ActualPrices);

		TreeSet<String> SortedPrices = new TreeSet<String>();

		SortedPrices.addAll(ActualPrices);

		System.out.println("Sorted");
		System.out.println(SortedPrices);

		log.info("Sorted List Created");

		Assert.assertEquals(ActualPrices, SortedPrices);

		log.info("Test Case Passed");

	}

	@AfterTest(enabled = false)
	public void teardown() {

		driver.close();

	}

}
