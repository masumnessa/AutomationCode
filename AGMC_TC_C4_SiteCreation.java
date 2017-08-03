//import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AGMC_TC_C4_SiteCreation {
	

	public static void main(String[] args) {

//Test case C4: Site Creation
		
WebDriver driver = new FirefoxDriver();
driver.get("http://10.73.135.19/AppGuardMC/login.aspx");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath(".//*[@id='Login1_UserName']")).sendKeys("admin");
driver.findElement(By.xpath(".//*[@id='Login1_Password']")).sendKeys("PA$$word11");
driver.findElement(By.xpath(".//*[@id='Login1_LoginButton']")).click();
		
driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_NavBar1_item_3_cell']")).click(); // clicking on  the Site
driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_btnNewSite']")).click();// Adding the site 
		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the name of the site ");
//		obj.nextLine();
//		System.out.println("The site name is "+obj);
		

driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_AddSiteFormView_tbSiteName']")).sendKeys("Administrator Site "); // Giving it a name
		
Select Selectone = new Select (driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_AddSiteFormView_ddlTemplate']")));
Selectone .selectByIndex(6);
		
driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_AddSiteFormView_tbAgentPassword']")).sendKeys("abc123456"); //password must be more than 8 carecter
driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_AddSiteFormView_tbAgentconfirmPassword']")).sendKeys("abc123456");// re-confirm the password
Select Selecttwo = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_AddSiteFormView_ddlVersion']")));
Selecttwo.selectByIndex(1); 
driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_mainContent_AddSiteFormView_btnAddSite']")).click();
//	driver.findElement(By.xpath(".//*[@id='ctl00_loginstatus']")).click();
//	driver.close();
//	driver.quit();
System.out.println("Administrator Site has been created successfully and now go back to the site page");


	}

}
