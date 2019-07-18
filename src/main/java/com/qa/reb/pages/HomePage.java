package com.qa.reb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.reb.base.TestBase;
import com.qa.reb.util.TestUtil;

public class HomePage extends TestBase{

	//Page Factory - Object repo
	@FindBy(xpath="//img[@alt='rebaca']") 
	WebElement logo; 
	 
	@FindBy(xpath="//a[contains(text(),'WHO WE ARE')]") // List of Elements available in Home Page
	WebElement WhoWeAreLink;
	
	@FindBy(xpath="//a[contains(text(),'Corporate')]") 
	WebElement WhoSubLink1;
	
	@FindBy(xpath="//a[contains(text(),'Quality')]") 
	WebElement WhoSubLink2;
	
	@FindBy(xpath="//a[contains(text(),'Infrastructure')]") 
	WebElement WhoSubLink3;
	
	@FindBy(xpath="//a[contains(text(),'what we do')]") 
	WebElement WhatWeDoLink;
	
	@FindBy(xpath="//a[contains(text(),'Services')]") 
	WebElement WhatSubLink1;
	
	@FindBy(xpath="//span[contains(text(),'Solutions')]") 
	WebElement WhatSubLink2;
	
	@FindBy(xpath="//a[contains(text(),'work with us')]") 
	WebElement WorkWithUsLink;
	
	@FindBy(xpath="//a[contains(text(),'Culture')]") 
	WebElement WorkSubLink1;
	
	@FindBy(xpath="//a[contains(text(),'Benefits')]") 
	WebElement WorkSubLink2;
	
	@FindBy(xpath="//a[contains(text(),'Openings')]") 
	WebElement WorkSubLink3;
	
	@FindBy(xpath="//a[contains(text(),'What We Blog')]") 
	WebElement WhatWeBlogLink;
	
	@FindBy(xpath="//a[contains(text(),'News')]") 
	WebElement BlogSubLink1;
	
	@FindBy(xpath="//a[contains(text(),'Blog')]") 
	WebElement BlogSubLink2;
	
	
	
	//Initializing the Page Objects:
	public HomePage(){ 
	PageFactory.initElements(driver, this);
	}
	
		
	//Actions:
	public boolean VerifyLogo()
	{
		return logo.isDisplayed();
	}
	
	public String VerifyTitle()
	{
		return driver.getTitle();
	}
	

	public boolean  VerifyWhoWeAreLink() 	// methods for header links	of homepage
	{
		return WhoWeAreLink.isDisplayed();
		
	}
	
	public boolean VerifyWhatWeDoLink()
	{
		return WhatWeDoLink.isDisplayed();
	}
	
	public boolean VerifyWorkWithUsLink()
	{
		return WorkWithUsLink.isDisplayed();
	}
	
	public boolean VerifyWhatWeBlogLink()
	{
		return WhatWeBlogLink.isDisplayed();
	}
	
	
	public boolean VerifyWhoSubLink1()   // methods for sub links of "Who We Are"
	{
	   TestUtil.Action(WhoWeAreLink);
	   TestUtil.Wait(WhoSubLink1);	
	   return WhoSubLink1.isDisplayed();	
	}
	
	public boolean VerifyWhoSubLink2()
	{
	    return WhoSubLink2.isDisplayed();	   
	}
	

	public boolean VerifyWhoSubLink3()
	{
	  	 return WhoSubLink3.isDisplayed();	   
	}
	
	
	public boolean VerifyWhatSubLink1()  // methods for sub links of "What We Do"
	{
	   TestUtil.Action(WhatWeDoLink);
	   TestUtil.Wait(WhatSubLink1);	
	   return WhatSubLink1.isDisplayed();	   
	}
	
	public boolean VerifyWhatSubLink2()
	{
	   return WhatSubLink2.isDisplayed();	   
	}
	
	public boolean VerifyWorkSubLink1()  // methods for Header sub links of "Work With Us"
	{
	   TestUtil.Action(WorkWithUsLink);
	   TestUtil.Wait(WorkSubLink1);	
	   return WorkSubLink1.isDisplayed();	   
	}
	
	public boolean VerifyWorkSubLink2()
	{
	   return WorkSubLink2.isDisplayed();	   
	}
	
	public boolean VerifyBlogSubLink1()  // methods for sub links of "What We Blog" 
	{
	   TestUtil.Action(WhatWeBlogLink);
	   TestUtil.Wait(BlogSubLink1);
	   return BlogSubLink1.isDisplayed();	   
	}
	
	public boolean VerifyBlogSubLink2()
	{
	   return BlogSubLink2.isDisplayed();	   
	}
	
	
	
		
	
}
