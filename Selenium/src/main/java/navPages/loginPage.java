package navPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public loginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	  
	      //login PageObjets WebElements

	@FindBy(id="txtUsername")
	private WebElement userNameTxt;
	@FindBy (id="txtPassword")
	private WebElement passwordTxt;
	@FindBy (id="btnLogin")
	private WebElement btnLogin;
	@FindBy (xpath="//*[@id=\"spanMessage\"]")
	private WebElement errorMsj;

	
	public void login(String user , String password) {
		
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
			
		
	}

	
	public boolean loginIncorrect(String user, String password) {
		
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		
		boolean errMsj = errorMsj.getText().contains("Invalid credentials");
		return errMsj;
		
	}
	
}
	

