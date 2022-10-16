package realworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout 
{
		 @FindBy(xpath="(//a[contains(text(),'Home')])[2]") private WebElement homepage;
		 
		 @FindBy(xpath="(//a[@ng-bind='tagName'])[2]") private WebElement populartag;
		 
		 @FindBy(xpath="(//a[@class='nav-link'])[4]") private WebElement setting;
		 
		 @FindBy(xpath="/html/body/div/div/div/div/div/div/button") private WebElement logout;

		 public logout(WebDriver driver) 
		 {
		 PageFactory.initElements(driver, this);
		 }
		
		 public void Homepage() {
			homepage.click();
		 }
		 public void Populartag() {
	     populartag.click();
			 }
		 public void Setting() {
			 setting.click();
		 }
		 public void Logout() {
			logout.click();
		 }
	}