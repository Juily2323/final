package realworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class global_feed 
{
		
		@FindBy(xpath="//a[contains(text(),'Global')]") private WebElement globalfeed;
		 
		 @FindBy(xpath="//h1[contains(text(),'Create')]") private WebElement articlelink;
		 
		 @FindBy(xpath="//textarea") private WebElement comment;
		 
		 @FindBy(xpath="//button[contains(text(),'Post')]") private WebElement post;

		 @FindBy(xpath="(//span[@class='ng-binding ng-scope'])[2]") private WebElement favbtn;
		 
		 @FindBy(xpath="(//i[@class='ion-plus-round'])[2]") private WebElement followbtn;

		 public global_feed(WebDriver driver) 
		 {
		 PageFactory.initElements(driver, this);
		 }
		
		 public void Globalfeed() {
			 globalfeed.click();
		 }
		 public void Articlelink() {
			 articlelink.click();
		 }
		 public void Comment() {
			 comment.sendKeys("HELLO ONE");
			  
		 }
		 public void  Post() {
			 post.click();
		 }

		 public void Favbtn () {
			 favbtn.click();
		 }
		 public void Followbtn () {
			 followbtn.click();
			
		 }
	}