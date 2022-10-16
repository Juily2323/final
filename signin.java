package realworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class signin {
		 @FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement signin;
		 
	     @FindBy(xpath="//input[@type='email']") private WebElement email;
		 
		 @FindBy(xpath="//input[@type='password']") private WebElement password;
		 
		 @FindBy(xpath="//button[@type='submit']") private WebElement submit;
		 
		
		 public signin(WebDriver driver) 
		 {
		 PageFactory.initElements(driver, this);
		 }
		 
		 public void Signin() {
			signin.click();
		 }
		
		 public void Email() {
			 email.sendKeys("jborkar4@gmail.com");
		 }
		 public void Password() {
			 password.sendKeys("jb");
		 }
		 public void Submit() {
			 submit.click();
		 }
	}
