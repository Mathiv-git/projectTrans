package pageFactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class TransbotLogin {
	@FindBy(id="UserName")
	public static WebElement userName;
	@FindBy(id="UserPassword")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/form/div/div/div/div/div/div[2]/div[3]/button")
	public static WebElement Signin;
	/*@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/div[1]/header/ul/li[1]/div/i")
	public static WebElement UserConfigicon;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/div/ul/li[4]/a")
	public static WebElement stdValueicon;*/
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/div/div/div[1]/div/div/span/div/div[3]/button")
	public static WebElement addProject;
	@FindBy(id="ProjectName")
	public static WebElement projectName1;
	@FindBy(id="ProjectDescription")
	public static WebElement projectDescription;
	@FindBy(id="ProjectCode")
	public static WebElement ProjectCode;
	@FindBy(id="SponsorName")
	public static WebElement sponserName;
	@FindBy(xpath="//*[@id=\"UserID\"]/div/div/div")
	public static WebElement userRole;
	@FindBy(xpath="//div[contains(@class,'ant-select-dropdown')]//ul/li")
	public static List<WebElement> selectList;

	

	//*[@id="8d92d063-084f-4c32-92f1-25741d96d11e"]/ul
	
	
	

}
	/*@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/section/section/main/div/div/div[2]/section/div/div[2]/div/div/form/div[2]/div/button[3]")
	public static WebElement Add;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/section/div[1]/header/ul/li[4]/div/div/img")
	public static WebElement Logouticon;
	@FindBy(name="Logout")
	public static WebElement Logout;*/
	
	
	
	

