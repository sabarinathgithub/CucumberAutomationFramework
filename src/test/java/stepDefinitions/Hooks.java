package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeMobileHook() {
		System.out.println("*******Before Mobile Hook method*******");
	}
	
	@After("@MobileTest")
	public void AfterMobileHook() {
		System.out.println("######After Mobile Hook method######");
	}
	
	@Before("@WebTest")
	public void beforeWebHook() {
		System.out.println("*******Before Web Hook method*******");
	}
	
	@After("@WebTest")
	public void AfterWebHook() {
		System.out.println("######After Web Hook method######");
	}

}
