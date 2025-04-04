package login_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC05 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver cr=new ChromeDriver();
		cr.manage().window().maximize();
		cr.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		WebElement uid=cr.findElement(By.xpath("//input[@name='id']"));
		uid.sendKeys(" ");
		// password text field
		WebElement pw=cr.findElement(By.xpath("//input[@name='pass']"));
		pw.sendKeys("sadar");
		WebElement login_button=cr.findElement(By.xpath("//input[@value='Login']"));
		login_button.click();
		Thread.sleep(3000);
		String actual_result=cr.switchTo().alert().getText();
		System.out.println(actual_result);
		String expected_result="Invalid UserID";
		if(actual_result.equals(expected_result)) {
			System.out.println("TC05 is Pass");
		}
		else {
			System.out.println("TC 05 is Fail");
		}
		cr.switchTo().alert().accept();
		cr.quit();


	}

}
