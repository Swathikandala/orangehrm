package Mainclass.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Test
//@Parameters ({"url"})
public class logintestmaven {
	
	 public void LoginTest() 
	  {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\Browsers\\chromedriver.exe");
		
		System.out.println("firest commit");
		 System.out.println("second commit");
		 
		 System.out.println("third commit1");
		  
		  WebDriver driver=new ChromeDriver();
		    
		 App l = PageFactory.initElements(driver, App.class);
		driver.get("http://opensource.demo.orangehrmlive.com");
		 //driver.get(url);
		l.loginpage("Admin","admin");
	  }
}
