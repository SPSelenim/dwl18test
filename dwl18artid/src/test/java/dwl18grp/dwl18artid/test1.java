package dwl18grp.dwl18artid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	 WebDriver driver=null;
	 
	@Test
  public void f() {
	  System.out.println("First Test NG1-Updated_Final_SubFinal - DOOONe");
	  System.setProperty("webdriver.chrome.driver","C:\\Satish\\RPMXAUTOMATION2\\RPMXV1\\RPMX_4\\BrowserDrivers\\chromedriver.exe");
	   
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
 driver.manage().window().maximize();
 driver.close();
  }
}
