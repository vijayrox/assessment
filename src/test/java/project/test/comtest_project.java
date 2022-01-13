package project.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import project.swag;

public class comtest_project {
	
	@Test

	public void clickcuslogin( ) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SUREN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
swag login= new swag();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	swag.loginpag();

	String actualURL= driver.getCurrentUrl();

	String expectedURL= "https://www.saucedemo.com/inventory.html";
	AssertJUnit.assertEquals(actualURL, expectedURL);


	}

	}
