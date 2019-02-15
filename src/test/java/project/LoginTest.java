package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void LogintTest() {
	  System.out.println("Login Test");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\RamyaPulletikurthi\\Downloads\\Selenium Required Files\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  System.out.println(driver.getTitle());
  }
}
