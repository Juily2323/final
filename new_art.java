package realworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class new_art 
{

		 @FindBy(xpath="(//a[@class='nav-link'])[3]") private WebElement newarticle; 
		 
		 @FindBy(xpath="//input[@placeholder='Article Title']") private WebElement title;
		 
		 @FindBy(xpath="(//input[@type='text'])[2]") private WebElement aboutarticle; 
		 
		 @FindBy(xpath="//textarea") private WebElement textarea;

		 @FindBy(xpath="//input[@placeholder='Enter tags']") private WebElement tag;
		 
		 @FindBy(xpath="//button[@type='button']") private WebElement publish;
		 
		 @FindBy(xpath="(//a[contains(text(),'Home')])[2]") private WebElement homepage;
		 
		 public new_art(WebDriver driver) 
		 {
		 
		 PageFactory.initElements(driver, this);
		 }
		 public void Newarticle() {
			 newarticle.click();
		 }
		 public void Title() {
			 title.sendKeys("hi..");
		 }
		 public void Aboutarticle() {
			 aboutarticle.sendKeys("intro..");
		 }
		 public void Textarea() {
			textarea.sendKeys("hi all...");
		 }
		 public void Tag() {
				tag.sendKeys("welcome...");
			 }
		 public void Publish() throws InterruptedException {
			publish.click();
			
			Thread.sleep(3000);
		 }
		 public void Homepage() {
				homepage.click();
			 }	 
	}