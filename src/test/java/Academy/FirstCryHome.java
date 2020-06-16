package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.FirstcryHome;
import pageObjects.FirstcryTshirtSort;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class FirstCryHome extends base {
	public WebDriver driver;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Navigated to Home page");

	}

	@Test(enabled = false)
	public void VerifyHomeTitle() {

		String HomeTitle = driver.getTitle();
		log.info("Got title of Home page");

		Assert.assertEquals("Baby Products Online India, Kids Online Shopping, Baby Care Products at Firstcry.com",
				HomeTitle);

		log.info("Title Verified Successfully ");

	}

	@Test(enabled = false)
	public void SortIteam() throws InterruptedException {

		FirstcryHome fsh = new FirstcryHome(driver);

		fsh.getSearchBox().click();
		log.info("clicked On SearchBox");

		fsh.getSearchBox().sendKeys("tshi");

		Thread.sleep(6000);

		// fsh.getSearchBox().sendKeys(Keys.DOWN);

		fsh.getSearchBox().sendKeys(Keys.DOWN);
		fsh.getSearchBox().sendKeys(Keys.DOWN);
		fsh.getSearchBox().sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		FirstcryTshirtSort sr = new FirstcryTshirtSort(driver);
		
		sr.getSort().click();
		
		sr.getSortName().click();
		

	//	Actions ac = new Actions(driver);

	//	ac.moveToElement(sr.getSort());
		
		
	}

	
	@AfterTest(enabled = false)
	public void teardown() {

		driver.close();

	}

}
