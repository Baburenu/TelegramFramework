package telegram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {

		public Welcome(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

			
			//Books link
			@FindBy(partialLinkText = "Books")
			private WebElement booklink;
			
			public WebElement getBooklink() {
				return booklink;
			}
		}
			

		
		
			
