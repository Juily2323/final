package realworld;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_realworld 
{
		signup su;
		signin si;
		global_feed gl;
		new_art art;
		logout log;
		
		public WebDriver driver;
		 @BeforeClass
		public void browser() throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","F:\\selenium\\104\\chromedriver.exe");
				
				driver=new ChromeDriver();
				
				driver.get("https://demo.realworld.io/#/");
				
				driver.manage().window().maximize();
				
				System.out.println("browser open");
				
		 
			Thread.sleep(3000);
//			su =new signup(driver);
//			su.Signup();
//			su.Username();
//			su.Email();
//			su.Password();
//			su.Submit();
//			Thread.sleep(3000);
		}
		
		@BeforeMethod
		public void signin() throws InterruptedException{
			si= new signin(driver);
			si.Signin();
			si.Email();
			si.Password();
			si.Submit();
			Thread.sleep(3000);
			System.out.println("signin ");
		}
		
		@Test(priority=1)
		public void newart() throws InterruptedException {
			art = new new_art(driver);
			art.Newarticle();
			art.Title();
			art.Aboutarticle();
			art.Textarea();
			art.Tag();
			art.Publish();
			System.out.println("article publish");
			Thread.sleep(3000);
			art.Homepage();
			Thread.sleep(3000);
		}
			@AfterMethod
			public void globalfeed() throws InterruptedException {
				gl= new global_feed(driver);
				gl.Globalfeed();
				Thread.sleep(3000);
				gl.Articlelink();
				Thread.sleep(3000);
				gl.Comment();
				
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
				 
				gl.Post();
				Thread.sleep(3000);
				System.out.println("comment and post");
				gl.Favbtn();
				Thread.sleep(5000);
				gl.Followbtn();
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-300)");
				System.out.println("favourite and follow");
				 
				
			}
			
			@AfterClass
			public void logout() throws InterruptedException {
	 			log=new logout(driver);
				Thread.sleep(3000);
				log.Homepage();
				Thread.sleep(5000);
				log.Populartag();
				System.out.println("tag displayed");
				Thread.sleep(3000);
				log.Setting();
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");
				Thread.sleep(3000);
				log.Logout();
				System.out.println("logout");
			
		
		}
	}
