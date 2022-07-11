package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class UtilityClass extends TestBase {

	
public static void TakePhoto(String name) throws IOException
{
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\vinod\\eclipse-workspace\\ZerodhaProject26Feb\\ScreenShots\\"+name+".jpeg");
	FileHandler.copy(source, dest);
}
}