package project.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class combase_project {
	 WebDriver driver;
	 
	 @BeforeMethod
	 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\wwwaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.saucedemo.com/inventory.html");
	 }
	 @AfterMethod
	 public void login() {
	 driver.close();
	}
	}
	 
