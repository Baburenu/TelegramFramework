package Demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage1 {

			public Welcomepage1(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			//log in to Home page
		    @FindBy(partialLinkText = "Log in")
		    private WebElement Loginbutton;
		    
		    
		    public WebElement getLoginbutton() {
				return Loginbutton;
			}

			public WebElement getEmailtextfield() {
				return emailtextfield;
			}

			public WebElement getPasswordtextfield() {
				return passwordtextfield;
			}

			public WebElement getSubmitbutton() {
				return Submitbutton;
			}

			public WebElement getBooks() {
				return Books;
			}

			public WebElement getDropdownbutton() {
				return dropdownbutton;
			}

			public WebElement getBookimage() {
				return Bookimage;
			}

			public WebElement getAddtocart() {
				return Addtocart;
			}

			public WebElement getShoppingcart() {
				return Shoppingcart;
			}

			public WebElement getCheckboxcomputingandinternet() {
				return Checkboxcomputingandinternet;
			}

			public WebElement getCountryselect() {
				return countryselect;
			}

			public WebElement getStateselect() {
				return stateselect;
			}

			public WebElement getEstimateshipping() {
				return estimateshipping;
			}

			public WebElement getTermscheckbox() {
				return termscheckbox;
			}

			public WebElement getCheckoutbutton() {
				return checkoutbutton;
			}

			public WebElement getEmailid() {
				return emailid;
			}

			public WebElement getPassword() {
				return Password;
			}

			public WebElement getLoginsignup() {
				return Loginsignup;
			}

			public WebElement getFirstname() {
				return firstname;
			}

			public WebElement getLastname() {
				return Lastname;
			}

			public WebElement getCompanyname() {
				return companyname;
			}

			public WebElement getCountryname() {
				return countryname;
			}

			public WebElement getStatename() {
				return statename;
			}

			public WebElement getCityname() {
				return cityname;
			}

			public WebElement getCityaddress1() {
				return cityaddress1;
			}

			public WebElement getCityaddres2() {
				return cityaddres2;
			}

			public WebElement getPostalcode() {
				return postalcode;
			}

			public WebElement getPhonenumber() {
				return phonenumber;
			}

			public WebElement getFaxnumber() {
				return faxnumber;
			}

			public WebElement getSitemap() {
				return sitemap;
			}

			public WebElement getShipping() {
				return shipping;
			}

			public WebElement getPrivacynotice() {
				return privacynotice;
			}

			public WebElement getConditions() {
				return conditions;
			}

			public WebElement getAboutus() {
				return aboutus;
			}

			public WebElement getContactus() {
				return contactus;
			}
			//email id
		    @FindBy(partialLinkText = "Log in")
		    private WebElement emailtextfield;
		    
		    //password
			@FindBy(xpath = "id=\"Password\"//input[@type=\"password\"]")
			private WebElement passwordtextfield;
		    
			//submit button/log in button
			@FindBy(xpath = "//input[@value=\"Log in\"]")
			private WebElement Submitbutton;
			
			//click on Books button
			@FindBy(partialLinkText = "Books")
			private WebElement Books;
			
			//click on drop down
			@FindBy(id = "products-orderby")
			private WebElement dropdownbutton;
			
			//click Book image
			@FindBy(xpath = "[alt=\"Picture of Computing and Internet\"]")
			private WebElement Bookimage;
			
			//Click on add to cart
			@FindBy(xpath = "//input[@id=\"small-searchterms\"]")
			private WebElement Addtocart;
			
		    //Click on shopping cart	
			@FindBy(xpath = "//span[.=\"Shopping cart\"]")
			private WebElement Shoppingcart;
			
			//click on computing and checkbox
			@FindBy(xpath = "//input[@type=\"button\"]")
			private WebElement Checkboxcomputingandinternet;
			
			//select on country select 
			@FindBy(id = "id=\"CountryId\"")
			private WebElement countryselect;
			
			//select state/province
			@FindBy(id = "StateProvinceId")
			private WebElement stateselect;
			
			//click on estimate shipping button
			@FindBy(xpath = "//input[@name=\"estimateshipping\"]")
			private WebElement estimateshipping;
			
			//click on terms check box
			@FindBy(id = "name=\"termsofservice\"")
			private WebElement termscheckbox;
			
			//click on checkout button
			@FindBy(id = "name=\"checkout\"")
			private WebElement checkoutbutton;
			
			//Enter email id to email text field in signup page
			@FindBy(id = "Email")
		    private WebElement emailid;
			
			//enter password to password textfield in signup page
			@FindBy(id = "Password")
		    private WebElement Password;
		    
		    //click on login button to submit
		    @FindBy(xpath = "//input[@onclick=\"setLocation('/cart')\"]")
		    private WebElement Loginsignup;
		    
		    //Billing address Enter First name in to name text field sign up
		    @FindBy(id = "id=\"BillingNewAddress_FirstName\"")
		    private WebElement firstname;
		    
		    //Billing address Enter Last name in to name text field sign up
		    @FindBy(id = "id=\"BillingNewAddress_LastName\"")
		    private WebElement Lastname;
		    
		    //Billing address Enter company name in to name text field sign up
		    @FindBy(id="BillingNewAddress_Company")
		    private WebElement companyname;
		    
		    //Billing address Enter country name in to name text field sign up
		    @FindBy(id = "id=\"BillingNewAddress_CountryId\"")
		    private WebElement countryname;
		    
		    //Billing address Enter state name in to name text field sign up
		    @FindBy(id = "id=\"BillingNewAddress_StateProvinceId\"") 
		    private WebElement statename;
		    
		    //Billing address enter city name in to city name text field
		    @FindBy(id = "id=\"BillingNewAddress_City\"")
		    private WebElement cityname;
		    
		    //Billing address enter address in to address1 text field
		    @FindBy(id = "id=\"BillingNewAddress_Address1\"")
		    private WebElement cityaddress1;
		    
		    //Billiong address enter address in to address2 text field 
		    @FindBy(id = "id=\"BillingNewAddress_Address2\"")
		    private WebElement cityaddres2;
		    
		    //Billing address enter postal code in to postal text field
		    @FindBy(id = "id=\"BillingNewAddress_ZipPostalCode\"")
		    private WebElement postalcode;
		    
		    //Billing address enter phone number in to phone number text field
		    @FindBy(id = "id=\"BillingNewAddress_PhoneNumber\"")
		    private WebElement phonenumber;
		    
		    //Billing address enter fax number in to fax number text field
		    @FindBy(id = "id=\"BillingNewAddress_FaxNumber\"")
		    private WebElement faxnumber;
		    
		    //click on site map button
		    @FindBy(xpath = "//script[@src=\"https://ssl.google-analytics.com/ga.js\"]")
		    private WebElement sitemap;
		    
		    //click on shipping & returns
		    @FindBy(linkText = "Shipping & Returns")
		    private WebElement shipping;
		    
		    //click on privacy notice 
		    @FindBy(linkText = "Shipping & Returns")
		    private WebElement privacynotice;
		    
		    //click on conditions
		    @FindBy(linkText = "Conditions of Use")
		    private WebElement conditions;
		    
		    //click on About us
		    @FindBy(linkText = "About us")
		    private WebElement aboutus;
		    
		    //click on contact us 
		    @FindBy(linkText = "Contact us")
		    private WebElement contactus;
		    



}
