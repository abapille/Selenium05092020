package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.variablesGlobales;
import driverSetup.driverSetup;
import navPages.loginPage;

public class TC_01_correctLogin {
	
	WebDriver driver = driverSetup.setupDriver();
	
	//Login PageObjet
	loginPage login = new loginPage(driver);
	
	
	@BeforeTest
	public void starWebDriver () {
	 driver.get(variablesGlobales.HOME_PAGE);
	 driver.manage().window().maximize();
	
	}
	
	
  @Test
  public void TC_01() {
	  
	  login.login(variablesGlobales.USER_ADMIN, variablesGlobales.PASSWORD_ADMIN);
	  
  }
	  
	  
	  
	  @AfterTest
	  public void closeDriver() {
		  driver.quit();
	  

	  
  }


}
