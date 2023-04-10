package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Konga {
	public WebDriver driver;
	public Map<String, Object> vars;
	JavascriptExecutor js;

	
	
	@BeforeMethod
	@BeforeTest
	public void setUp () {
	System.setProperty("webdriver.chrome.driver", "/Users/preciousibeagwa/Downloads/chromedriver_mac64 (3)/chromedriver");
	 driver = new ChromeDriver ();
	 js = (JavascriptExecutor) driver;
}
	
	
	@Test
	public void signUp() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      driver.get("https://az-staging.konga.com/");
	      
	      driver.manage().window().setSize(new Dimension(1440, 900));
	     
	      driver.findElement(By.linkText("Login / Signup")).click();
	      Thread.sleep(3000);
	      
	      driver.findElement(By.linkText("Don’t have an account? Sign Up")).click();
	     // js.executeScript("window.scrollTo(0,0)");

	      driver.findElement(By.id("firstname")).click();
	      driver.findElement(By.id("firstname")).sendKeys("Wale");
	      driver.findElement(By.id("lastname")).click();
	      driver.findElement(By.id("lastname")).sendKeys("David");
	      driver.findElement(By.id("email")).click();
	      driver.findElement(By.id("email")).sendKeys("david@gmail.com");
	      driver.findElement(By.id("phone")).click();
	      driver.findElement(By.id("phone")).sendKeys("08087804008");
	      driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).click();
	      driver.findElement(By.cssSelector(".\\_460b6_SNRLa > #password")).sendKeys("sandra");
	      driver.findElement(By.linkText("Show")).click();
	      driver.findElement(By.cssSelector(".\\_2f3a3_3JCsL")).click();
	      Thread.sleep(3000);
	      
	      WebElement signupButton = driver.findElement(By.xpath("//h4[@class='_42f5e_1Twsa']"));
	      Assert.assertTrue(signupButton.getText().equalsIgnoreCase("Enter the PIN sent to your phone"));
	      System.out.println(signupButton.getText());

	      driver.findElement(By.id("pin")).click();

	      driver.findElement(By.id("pin")).sendKeys("1234");
	      driver.findElement(By.cssSelector(".\\_83d7e_2rg5_")).click();
	      System.out.println("Successful SignUp");
	      driver.quit();
	     
	}

	@Test
	public void login ()throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	driver.get("https://www.konga.com/");
	  driver.manage().window().setSize(new Dimension(1440, 900));
	 
	  
	 driver.findElement(By.linkText("Login / Signup")).click();
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).sendKeys("ibeagwaify20@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("favour");
	    driver.findElement(By.cssSelector(".\\_988cf_1aDdJ")).click();
	    Thread.sleep(3000);
	   
	    WebElement loginButton = driver.findElement(By.xpath("//p[@class='_12da4_1baq-']"));
	    
	   Assert.assertTrue(loginButton.getText().equalsIgnoreCase("Login Successful"));
	   
	   {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
	 
		    driver.findElement(By.linkText("My Account")).click();
		    driver.findElement(By.linkText("Logout")).click();
		   
		   driver.get("https://az-staging.konga.com/");
		   driver.quit();
	}
	
	
	@Test 
	public void addToCart () throws InterruptedException {
	
	driver.get("https://www.konga.com/");
	
	driver.manage().window().setSize(new Dimension(1440, 900));
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	  
	driver.findElement(By.linkText("Login / Signup")).click();
	
	{
		WebElement element = driver.findElement(By.linkText("Login / Signup"));
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
	}

	{
		WebElement element = driver.findElement(By.tagName("body"));
		Actions builder = new Actions(driver);
		builder.moveToElement(element, 0, 0).perform();
	}
	
	driver.findElement(By.id("username")).click();


	driver.findElement(By.id("username")).sendKeys("precious.ibeagwa@konga.com");
	driver.findElement(By.id("password")).click();
	driver.findElement(By.id("password")).sendKeys("favour");
	driver.findElement(By.cssSelector(".\\_988cf_1aDdJ")).click();
	Thread.sleep(2000);

	    driver.findElement(By.linkText("Phones and Tablets")).click();
	    Thread.sleep(5000);

	    driver.findElement(By.linkText("Price - Low To High")).click();
	    
	    Thread.sleep(2000);

	    js.executeScript("window.scrollTo(0,625)");

	    driver.findElement(By.xpath("//button[@class='_0a08a_3czMG']")).click();
	    WebElement addToCart = driver.findElement(By.xpath("//a[@href='/checkout/complete-order']"));
	  
	   System.out.println(addToCart.getText());
	   // System.out.println(addToCart.getText());

	    driver.findElement(By.cssSelector(".bbe45_3oExY:nth-child(2) form")).click();
	    driver.findElement(By.cssSelector(".bbe45_3oExY:nth-child(2) .\\_0a08a_3czMG")).click();
	    driver.quit();
	}
	
	  //@AfterTest
	     //   public void afterTest () {
		  
		 // driver.quit();
		//  EmailUtils emailUtils = new EmailUtils();
		  
	 // }
	
	@Test
	public void categories() throws InterruptedException {
		driver.get("https://www.konga.com/");
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.findElement(By.linkText("All Categories")).click();
		Thread.sleep(3000);
		{
		      WebElement element = driver.findElement(By.cssSelector(".\\_73477_1JLsr"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		driver.findElement(By.cssSelector(".\\_4730d_1wcu1 > a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".e27b2_1kz0Y:nth-child(2) li:nth-child(2) label")).click();

		js.executeScript("window.scrollTo(0,417)");
		driver.quit();
	}
	@Test
	public void businessVerticles() throws InterruptedException {
		driver.get("https://www.konga.com/");
		driver.manage().window().setSize(new Dimension(1440, 900));
		//vars.put("window_handles", driver.getWindowHandles());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='kongaPay.']")).click();
		Thread.sleep(4000);
		//vars.put("win8083", waitForWindow(2000));
		//vars.put("root", driver.getWindowHandle());
		Thread.sleep(4000);
		//driver.switchTo().window(vars.get("win8083").toString());
		
		String expectedUrl = "https://www.kongapay.com/";
		String actualUrl = driver.getCurrentUrl();
		//if (expectedUrl.equalsIgnoreCase(actualUrl))

		//	System.out.println ("Successful redirected to kongaPAY");
		//else 
			//System.out.println("Not successfully directed to KongaPay");
		
		driver.quit();
	}
	
    @Test
	public void googleLogin() throws InterruptedException {
		driver.get("https://www.konga.com/");
		driver.manage().window().setSize(new Dimension(1440, 900));
		driver.findElement(By.linkText("Login / Signup")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("google_container")).click();
		driver.findElement(By.cssSelector("#google_container > .f5e10_VzEXF")).click();
		driver.findElement(By.linkText("My Profile")).click();
		driver.findElement(By.linkText("Order History")).click();
		js.executeScript("window.scrollTo(0,0)");
		driver.findElement(By.linkText("View Details")).click();
		driver.quit();
	
	}
	
	@Test
	  public void forgotPassword() throws InterruptedException {
	    driver.get("https://www.konga.com/");
	    driver.manage().window().setSize(new Dimension(1440, 900));
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Login / Signup")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Forgot Password?")).click();
	    
	    Thread.sleep(1000);
	    WebElement forgotPassword = driver.findElement(By.xpath("//h4[@class='_42f5e_1Twsa']"));
	    Assert.assertTrue(forgotPassword.getText().equalsIgnoreCase("Forgot Password"));
	    System.out.println(forgotPassword.getText());
	    
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("precious.ibeagwa@konga.com");
	    driver.findElement(By.cssSelector(".fd68f_3wAfg")).click();
	    driver.quit();
	    
	}
}