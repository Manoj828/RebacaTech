package com.qa.reb.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.reb.base.TestBase;
import com.qa.reb.pages.HomePage;


public class HomePageTest extends TestBase {

	HomePage homepage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	
   @BeforeMethod()
   public void setup()
  {
	Initialisation();
	homepage = new HomePage();
	
  }
	

  @Test(priority=1)
  public void LogoTest()
  {
	 Assert.assertTrue(homepage.VerifyLogo());
  } 

  @Test(priority=2)
  public void TitleTest()
  {
	 String Title= homepage.VerifyTitle();
	 Assert.assertEquals(Title,"Rebaca Technologies | 5G Core Network and OTT Solution Provider", "Title is not matching");
  } 
  
  @Test(priority=3) 
  public void HeaderLinkTest()
  {
	Assert.assertTrue(homepage.VerifyWhoWeAreLink());
	Assert.assertTrue(homepage.VerifyWhatWeDoLink());
	Assert.assertTrue(homepage.VerifyWorkWithUsLink());
	Assert.assertTrue(homepage.VerifyWhatWeBlogLink());	
  } 
 
  @Test(priority=4) 
  public void WhoWeAre_SubLinkTest() 
  {
	Assert.assertTrue(homepage.VerifyWhoSubLink1());
	Assert.assertTrue(homepage.VerifyWhoSubLink2());
	Assert.assertTrue(homepage.VerifyWhoSubLink3());
  }  

  @Test(priority=5) 
  public void WhatWeDo_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifyWhatSubLink1());
	Assert.assertTrue(homepage.VerifyWhatSubLink1());
  }  
   
  @Test(priority=6) 
  public void WorkWithUs_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifyWorkSubLink1());
	Assert.assertTrue(homepage.VerifyWorkSubLink2());
  }  

  @Test(priority=7) 
  public void WhatWeBlog_SubLinkTest()
  {
	Assert.assertTrue(homepage.VerifyBlogSubLink1());
	Assert.assertTrue(homepage.VerifyBlogSubLink2());
  }  
  
 
   @AfterMethod()
   public void tearup()
   {
	 driver.quit();
   }

	
	
	
}
