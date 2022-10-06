package com.rai1.rai;

public class Login {
	@FindBy(how = How.XPATH, using = "// *[@id= 'txtUsername']")
	private static WebElement txtUserName;
	
	@FindBy(how = How.XPATH, using = "// *[@id= 'txtPassword']")
	private static WebElement txtPAssword;
	
	@FindBy(how = How.XPATH, using = "// *[@id= 'btnLogin']")
	private static WebElement btnLogin;

}
