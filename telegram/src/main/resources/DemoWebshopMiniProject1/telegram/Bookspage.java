package telegram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage {
	public Bookspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		
		//Books link
		@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
		private WebElement booklink;
		
		public WebElement getBooklink() {
			return booklink;
		}
		//book name Computing and Internet
		@FindBy(linkText = "Computing and Internet")
		private WebElement computingandinternetbook;

		public WebElement getComputingandinternetbook() {
			return computingandinternetbook;
		}
}
