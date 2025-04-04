package findElement_Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FindElement_Program {

	public static void main(String[] args) {
		//ChromeDriver cr=new ChromeDriver();
		EdgeDriver cr=new EdgeDriver();
		cr.manage().window().maximize();
		
		cr.get("https://bsadar.github.io/hmrbuild1/Loging.html");
		WebElement uid=cr.findElement(By.xpath("//input[@name='id']"));
		uid.sendKeys("sadar");
		// password text field
		WebElement pw=cr.findElement(By.xpath("//input[@name='pass']"));
		pw.sendKeys("sadar");
		WebElement login_button=cr.findElement(By.xpath("//input[@value='Login']"));
		login_button.click();
		cr.findElement(By.xpath("//b[normalize-space()='Station Halts to monitor']")).click();
		cr.findElement(By.xpath("/html[1]/body[1]/div[3]/a[1]/button[1]")).click();
		cr.findElement(By.xpath("//b[normalize-space()='Update Profile&Skills']")).click();
		//System.out.println(cr.getTitle());
		cr.findElement(By.xpath("//input[@id='EID']")).sendKeys("1001");
		cr.findElement(By.xpath("//input[@id='fname']")).sendKeys("Suvendu");
		cr.findElement(By.xpath("//input[@id='lname']")).sendKeys("Nayak");
		cr.findElement(By.xpath("//input[@id='sex-0']")).click();
		cr.findElement(By.xpath("//input[@id='exp-3']")).click();
		cr.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/13/2025");
		cr.findElement(By.xpath("//option[normalize-space()='Automatic Train Supervission']")).click();
		cr.findElement(By.xpath("//option[normalize-space()='Train Management System']")).click();
		cr.findElement(By.xpath("//option[normalize-space()='Signal Analytics']")).click();
		cr.findElement(By.xpath("//option[normalize-space()='Signal Principles']")).click();
		List<WebElement> e=cr.findElements(By.xpath("//select[@id='continents']"));
			
//		Iterator<WebElement> it=e.iterator();
//		while(it.hasNext()) {
//			
//		System.out.println(it.next().getText());
//		if(it.next().getText()=="KukatPAlly") {
//			
//			break;
//			
//		}
//		}
//		for(WebElement w:e) {
//			System.out.println(w.getText());
//			if(w.getText()=="Nagaole") {
//				w.click();
//			break;	
//			}
//		}
//		for (int i=0;i<e.size();i++) {
//			
//			if(e.get(i).getText()=="Nagaole") {
//			 
//				System.out.println(e.get(i));
//				
//			}
//		}
		WebElement dropdownelement=cr.findElement(By.xpath("//select[@id='continents']"));
		Select Lf=new Select(dropdownelement);
		Lf.selectByVisibleText("Nagaole");
		Lf.selectByIndex(2);
		Lf.selectByValue("Dilsuk nagar");
		List<WebElement> ls=Lf.getOptions();
		System.out.println(ls);
		for(WebElement w:ls) {
			System.out.println(w.getText());
			if(w.getText()=="Secuderbad") {
				w.click();
			break;	
			}
			
		}
		
		
		

}
}
