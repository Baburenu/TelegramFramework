package testscripts;

import java.security.PublicKey;
import java.time.Duration;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import telegram.Bookspage;
import telegram.Welcome;

public class F_T_BookTest {

@Test(invocationCount = 5, threadPoolSize = 3)
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
			Bo book=new Bookspage(driver);
			//checking the books page is visible or not
			if (book.getBooklink().getText().equals("babu")) {
				System.out.println("test pass");
			}
			else {
				System.out.println("test fail");
			}
			
			//close browser
			driver.quit();
		
		}
  // second script
@Test(invocationCount = 5, threadPoolSize = 3 )
	public void booktest_002() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//calling welcome page
		Welcome welcome=new Welcome(driver);
		//calling books link
		welcome.getBooklink().click();
		
		//calling books page
		Bookspage book=new Bookspage(driver);
		
		//checking computing and internetbook
		if (book.getComputingandinternetbook().getText().equals("computing and internetbook")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test failed");
		}
		driver.quit();
	}
	

	}


