package transBotpackage;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pageFactory.TransbotLogin;
import pageFactory.pageObjects;
import pomfiles.MouseAction;
import pomfiles.Screenshot;
import pomfiles.logFiles;

public class TransbotClass {
	public WebDriver driver;
	Screenshot getScreen=new Screenshot();
	logFiles logs=new logFiles();
	String logLocation=".//test-output";
	MouseAction mouse = new MouseAction();
	
	
	
	//String screenshot_location="C:\\Users\\mvaratharaj\\eclipse-workspace\\project9\\";
	
	@BeforeMethod 
	public void setup() throws InterruptedException {
		System.out.println("success");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mvaratharaj\\eclipse-workspace\\project4\\excfiles\\chromedriver.exe");
		logs.writeLog(logLocation, "INFO", "Open Chrome Browser");
		driver=new ChromeDriver();

		
		
		
	}
	
	
		
	
	@Test
	public  void test5() throws InterruptedException {
		
		
		System.out.println("Text 5");
		driver.get("http://172.16.1.246:8032/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, TransbotLogin.class);
		
		Thread.sleep(2002);
		TransbotLogin.userName.sendKeys("admin");
		TransbotLogin.password.sendKeys("admin");
		Thread.sleep(2002);
		TransbotLogin.Signin.click();
		Thread.sleep(2002);
		
		getScreen.Take_ScreenShot("test5_1");
		
		
		/*TransbotLogin.UserConfigicon.click();
		TransbotLogin.stdValueicon.click();
		String expectedUrl1="http://172.16.1.246:8032/trans/StandardValueLevelConfiguration";*/
		TransbotLogin.addProject.click();
		Thread.sleep(2002);
		
		TransbotLogin.projectName1.sendKeys("Test2");
		TransbotLogin.projectDescription.sendKeys("Test2");
		TransbotLogin.ProjectCode.sendKeys("Test2");
		TransbotLogin.sponserName.sendKeys("Test2");
		Thread.sleep(2000);
		TransbotLogin.userRole.click();
		Thread.sleep(5002);
		
		int listSize= TransbotLogin.selectList.size();
		String [] options= {"PINK","Newuser"};
		int num=0;
		for(int i=0; i<listSize; i++)
		{
			mouse.mouse_Scroll(driver, TransbotLogin.selectList.get(i));
			
			for(int j=0; j<options.length ;j++) 
			{
				if(TransbotLogin.selectList.get(i).getText().equalsIgnoreCase(options[j]))
				{
					TransbotLogin.selectList.get(i).click();	
					num +=1;
				}	
			}
			if(num == options.length)
			{
				break;
			}
		}
		
//		Actions select= new Actions(driver);
//		select.keyDown(Keys.CONTROL)
//		.click(TransbotLogin.selectList.get(0))
//		.click(TransbotLogin.selectList.get(1)).build().perform();
		
		
		
		
		//*[@id="8d92d063-084f-4c32-92f1-25741d96d11e"]/ul

		/*TransbotLogin.Logouticon.click();
		Thread.sleep(2002);
		TransbotLogin.Logout.click();
		Thread.sleep(2002);
		String expectedUrl="http://172.16.1.246:8032/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);*/
			
		
		
	}
	/*@Test(dependsOnMethods = {"test5"}, enabled=false)
	public void test6() throws Exception {
		driver.get("http://172.16.1.246:8032");
		System.out.println("Text6 ");
		PageFactory.initElements(driver, TransbotLogin.class);
		
		TransbotLogin.userName.sendKeys("admin5");
		Thread.sleep(2002);
		
		TransbotLogin.password.sendKeys("admin");
		Thread.sleep(2002);
		TransbotLogin.Signin.click();
		driver.manage().window().maximize();
		
		
		/*TransbotLogin.UserConfigicon.click();
		
	    TransbotLogin.stdValueicon.click();
		
		String expectedUrl="http://172.16.1.246:8032/trans/StandardValueLevelConfiguration";
		String actualUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl,expectedUrl);
	}*/

	
	
	@AfterMethod
	public void method() throws InterruptedException {
		System.out.println("Test over");
		
		Thread.sleep(1000);
		driver.close();
	}
	

	
	
	

}
