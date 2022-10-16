package realworld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup 
{
	//@FindBy(xpath="(//a[contains(text(),'account')])[2])") private WebElement needac; // need an account
	 
		 @FindBy(xpath="//a[contains(text(),'Sign up')]") private WebElement signup;
		 
		 @FindBy(xpath="//input[@placeholder='Username']") private WebElement user; 
		 
		 @FindBy(xpath="//input[@type='email']") private WebElement email;
		 
		 @FindBy(xpath="//input[@type='password']") private WebElement password;
		 
		 @FindBy(xpath="//button[@type='submit']") private WebElement submit;
		 
		 public signup(WebDriver driver) 
		 {
		 
		 PageFactory.initElements(driver, this);
		 }
		 public void Signup() {
			 signup.click();
		 }
		 public void Username() {
			 user.sendKeys("sadd1");
		 }
		 public void Email() {
			 email.sendKeys("sadd1@gmail.com");
		 }
		 public void Password() {
			 password.sendKeys("sadd1");
		 }
		 public void Submit() {
			 submit.click();
		 }
}
