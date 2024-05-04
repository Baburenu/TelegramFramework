package telegram;

import java.sql.Driver;

import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage1 {
	
		public Welcomepage1(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
		//Gift cards
		@FindBy(partialLinkText = "Gift Cards")
		private WebElement Giftcards;
		
		@FindBy(xpath = " //div[@class=\"page-title\"]")

}
