package login_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC06 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver cr=new ChromeDriver();
		cr.manage().window().maximize();
		cr.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		WebElement uid=cr.findElement(By.xpath("//input[@name='id']"));
		uid.sendKeys(" ");
		// password text field
		WebElement pw=cr.findElement(By.xpath("//input[@name='pass']"));
		pw.sendKeys("sadar");
		WebElement reset_button=cr.findElement(By.xpath("//input[@type='Reset']"));
		reset_button.click();
		Thread.sleep(3000);
		String uid_text=uid.getText();
		System.out.println(uid_text);
		String pwd_text=pw.getText();
		System.out.println(pwd_text);
		String expected_result="";
		if(uid_text.equals(expected_result) && pwd_text.equals(expected_result)) {
			System.out.println("TC06 is Pass");
		}
		else {
			System.out.println("TC 05 is Fail");
		}
		
		cr.quit();


	}

}
