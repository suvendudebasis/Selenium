package browsercommands_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommand_Program {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver co=new ChromeDriver();
		co.manage().window().maximize();
		co.get("https://www.redbus.in/");
		String  title=co.getTitle();
		Thread.sleep(3000);
		System.out.println(title);
		String url=co.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(url);
		co.navigate().to("https://www.facebook.com/login.php/");
		Thread.sleep(3000);
		co.navigate().back();
		Thread.sleep(3000);
		co.navigate().forward();
		co.navigate().refresh();
		co.close();

	}

}
