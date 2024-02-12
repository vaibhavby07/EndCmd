package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args, String WindowHandle)
	{
		WebDriver driver=new ChromeDriver();
		Set<String> parentWindow=driver.getWindowHandles(); //parent window
		driver.findElement(By.xpath(""));
		
		for(String windowHandle:driver.getWindowHandles());  //child window
		{
		//	if (!windowHandle.equals(parentWindow))
				driver.switchTo().window(WindowHandle);
		}
	}

}
