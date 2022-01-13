package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class swag {
	WebDriver driver;

	WebElement and= driver.findElement(By.id("user-name"));
	WebElement or= driver.findElement(By.id("password"));

	public void loginpag() {

	    and.sendKeys("standard_user");
        or.sendKeys("secret_sauce");
	}
	}




