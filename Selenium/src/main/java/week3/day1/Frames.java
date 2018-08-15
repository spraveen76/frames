package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");//parameter is passed 
		driver.findElementByXPath("//*[text()='Try it']").click();
		Alert myalert = driver.switchTo().alert();
		//System.out.println(.getText());
		System.out.println(myalert.getText());
		myalert.sendKeys("praveen");
		myalert.accept();
		driver.switchTo().defaultContent();
		//driver.findElementByXPath("//*[@id=\"tryhome\"]").click();
		
		
		
		

	}

}
