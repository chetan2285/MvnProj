package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstcryTshirtSort {

	
	public WebDriver driver;
	
		
   
    By Sort = By.xpath("//div[text()='Select']");
    By SortName = By.xpath("//a[text()='Name']");
    
     
	
		
	public FirstcryTshirtSort(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
				
		
	}
	

	public WebElement getSort()
	{
		return driver.findElement(Sort);
	}
	
	 
	public WebElement getSortName()
	{
		return driver.findElement(SortName);
	}
    
		
	
}
