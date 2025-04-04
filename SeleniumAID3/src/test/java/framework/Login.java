package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	String build_path;
	void testcase01(){
		WebDriver cr=new ChromeDriver();
		cr.manage().window().maximize();
		cr.get(build_path);
		WebElement uid=cr.findElement(By.xpath("//input[@name='id']"));
		uid.sendKeys("sadar");
		// password text field
		WebElement pw=cr.findElement(By.xpath("//input[@name='pass']"));
		pw.sendKeys("sadar");
		WebElement login_button=cr.findElement(By.xpath("//input[@value='Login']"));
		login_button.click();
		String actual_result=cr.getTitle();
		System.out.println(actual_result);
		String expected_result;
		expected_result="MainHMR";
		if(actual_result.equals(expected_result)) {
			System.out.println("TC 01 is Pass");
			
		}
		else 
		{
			System.out.println("TC 01 is Fail");
		}
		cr.quit();
		
	}
	void testcase02(){
		WebDriver cr=new ChromeDriver();
		cr.manage().window().maximize();
		cr.get(build_path);
		WebElement uid=cr.findElement(By.xpath("//input[@name='id']"));
		uid.sendKeys("sadar");
		// password text field
		WebElement pw=cr.findElement(By.xpath("//input[@name='pass']"));
		pw.sendKeys("SADAR");
		WebElement login_button=cr.findElement(By.xpath("//input[@value='Login']"));
		login_button.click();
		String actual_result=cr.switchTo().alert().getText();
		System.out.println(actual_result);
		String expected_result="Invalid Password";
		if(actual_result.equals(expected_result)) {
			System.out.println("TC02 is Pass");
		}
		else {
			System.out.println("TC 02 is Fail");
		}
		cr.switchTo().alert().accept();
		cr.quit();
	}
	void testcase03(){
		System.out.println("Test Comment ");
		
	}

}
