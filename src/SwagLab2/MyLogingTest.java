package SwagLab2;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyLogingTest {
	
	WebDriver driver = new ChromeDriver();

	
	@BeforeTest
	public void mySetup() {
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
}
	
	@Test (priority = 1)
	public void LoginPage() throws InterruptedException {
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
		
		String Username = "standard_user";
		String Password = "secret_sauce";
		
		WebElement UsernameInput = driver.findElement(By.id("user-name"));
		WebElement PasswordInput = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		
		UsernameInput.sendKeys(Username);
		PasswordInput.sendKeys(Password);
		LoginButton.click();
		
		}
	
	@Test (priority = 2)
	public void AddtToCartItem() throws InterruptedException {
		
//		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//		Thread.sleep(1000);
		
		List<WebElement> AddtToCartButtons = driver.findElements(By.className("btn"));
		
		for(int i = 0; i < AddtToCartButtons.size(); i++) {
			
			AddtToCartButtons.get(i).click();
			
		}
		
	}	

	@Test (priority = 3)
	public void RemoveTheItem() throws InterruptedException {
		
//		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("continue-shopping")).click();
//		Thread.sleep(1000);
//   	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		
List<WebElement> RemoveToCartButtons = driver.findElements(By.className("btn_secondary"));
		
		for(int i = 0; i < RemoveToCartButtons.size(); i++) {
			
			RemoveToCartButtons.get(i).click();
		}
			
	}	
	
	@Test (priority = 4)
	public void socialMedai() {
		
//		WebElement faceBookPage = driver.findElement(By.partialLinkText("facebook"));
//		faceBookPage.click();
		
		WebElement twitterPage = driver.findElement(By.linkText("Twitter"));
		twitterPage.click();
		
		WebElement faceBookPage = driver.findElement(By.linkText("Facebook"));
		faceBookPage.click();
		
		WebElement linkedInPage = driver.findElement(By.linkText("LinkedIn"));
		linkedInPage.click();
		
	}
	
	
	
	
	}
