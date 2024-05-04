package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import telegram.Bookspage;
import telegram.Welcome;

public class Hard_Soft_Assert {
	@Test
	public void books_001() {
		//
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//calling welcome page
		Welcome welcome=new Welcome(driver );
		//calling books link
		welcome.getBooklink().click();
		
		//calling books page
		Bookspage book=new Bookspage(driver);
		String babu=book.getBooklink().getText();
		//hard assert-will stop if execution failied.
		//Assert.assertEquals(actual, "Computers");
		//checking the books page is visible or not
		Assert.fail();
		//soft assert-it will continue if any lines fails
		SoftAssert soft=new SoftAssert();
		
		Assert.fail();		
		soft.assertEquals(babu, "Oooo");
		//close browser
		welcome.getBooklink().click();
		
		driver.quit();
		soft.assertAll();
	
	}

}
