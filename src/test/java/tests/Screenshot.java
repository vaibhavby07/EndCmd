package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File scr= tss.getScreenshotAs(OutputType.FILE);
		File dest=new File("E://www.");
		Files.copy(scr,dest);	
		
	}

}
