package testNg_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	String build_path="https://bsadar.github.io/hmrbuild1/Loging.html";
	WebDriver bo;
	 @BeforeMethod
	  public void buildexecution() {
		 bo=new ChromeDriver();
		//bo=new FirefoxDriver();
		 bo.get(build_path);
	  }

	  @AfterMethod
	  public void buildClose() {
		  bo.quit();
	  }

  @Test(description="verify log in functionality with valid values ",enabled=true,priority=1,groups="login")
  public void testcase01() {
	  
		WebElement uid=bo.findElement(By.xpath("//input[@name='id']"));
		uid.sendKeys("sadar");
		// password text field
		WebElement pw=bo.findElement(By.xpath("//input[@name='pass']"));
		pw.sendKeys("sadar");
		WebElement login_button=bo.findElement(By.xpath("//input[@value='Login']"));
		login_button.click();
		String actual_result=bo.getTitle();
		System.out.println(actual_result);
		String expected_result;
		expected_result="MainHMR";
		Assert.assertEquals(actual_result, expected_result); // Test Annotations used to compare 
		bo.quit();
	}
  
  @Test(description="verify log in functionality with valid username and invalid password ",enabled=true,priority=2,groups="login")
  public void testcase02() throws InterruptedException {
	  WebElement uid=bo.findElement(By.xpath("//input[@name='id']"));
		uid.sendKeys("sadar");
		// password text field
		WebElement pw=bo.findElement(By.xpath("//input[@name='pass']"));
		pw.sendKeys("SADAR");
		WebElement login_button=bo.findElement(By.xpath("//input[@value='Login']"));
		login_button.click();
		String actual_result=bo.switchTo().alert().getText();
		System.out.println(actual_result);
		String expected_result="Invalid Password";
		Assert.assertEquals(actual_result, expected_result);
		Thread.sleep(3000);
		bo.switchTo().alert().accept();
		Thread.sleep(3000);
		bo.quit();
	  
		
	}
  }
  
 
