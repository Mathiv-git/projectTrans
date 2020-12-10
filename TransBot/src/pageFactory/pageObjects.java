package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageObjects {
	
	@FindBy(id="username")
	public static WebElement userName;
	@FindBy(id="password")
	public static WebElement password;
	@FindBy(xpath="//button[text()='Sign in']")
	public static WebElement login;
	
	

}
