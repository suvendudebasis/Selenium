package login_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC01 {

	public static void main(String[] args) {
		WebDriver cr=new ChromeDriver();
		cr.manage().window().maximize();
		cr.get("https://bsadar.github.io/hmrbuild1/Loging.html");
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

}
