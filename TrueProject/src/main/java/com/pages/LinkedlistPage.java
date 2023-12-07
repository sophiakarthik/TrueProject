
package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LinkedlistPage {
	private WebDriver driver;
	
	//my locators
	 
	     private By getstartedbtn= By.xpath("/html/body/div[3]/div[3]/div/div/a");
	    private By titlist=By.xpath("/html/body/div[2]/h4");
	   private By intro=By.xpath("//body/div[2]/ul[1]/a");
	   private By checkintrotitle=By.xpath("/html/body/div[2]/div/div[2]/strong/p"); 
	   private By tryherebtn=By.xpath("/html/body/div[2]/div/div[2]/a");
	   private By tryeditortxtbox=By.xpath("//div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span[1]");
	   private By runbtn=By.xpath("//*[@id=\"answer_form\"]/button");
	   private By consoleoout=By.xpath("//*[@id=\"output\"]");
	   private By create=By.xpath("//body/div[2]/ul[2]/a");
	private By types=By.xpath("//body/div[2]/ul[3]/a");
	private By implement=By.xpath("//body/div[2]/ul[4]/a");
	private By traver=By.xpath("//body/div[2]/ul[5]/a");
	private By insertn=By.xpath("//body/div[2]/ul[6]/a");
	private By deletn=By.xpath("//body/div[2]/ul[7]/a");
	//private By pracques=By.xpath("//*[@id=\"content\"]/a");
	        private By linklistsect=By.cssSelector("div#content a");

//2.constructor of the page class
public LinkedlistPage(WebDriver driver)  {
	this.driver=driver;
	
}
//3.page actions -features of the page in the form of methods
public int linkedlistcount() {
	return driver.findElements(linklistsect).size();
}
public List<String> linklistsections() {
	
	List<String> linkList = new ArrayList<String>();
	List<WebElement> listheaderlist=driver.findElements(linklistsect);
	
	for (WebElement e :listheaderlist) {
		String text = e.getText();
		System.out.println(text);
		linkList.add(text);
	}
	return linkList;
}
public void getstarted() {
	driver.findElement(getstartedbtn).click();
}
public String getlinkedlisttitle() {
	return driver.getTitle();
}

public String introtitle() {
	return driver.getTitle();
}

public void introduction() {
	driver.findElement(intro).click();
}
public void chkintroPage() {

	if (driver.getCurrentUrl() == "https://dsportalapp.herokuapp.com/linked-list/introduction/") {
		System.out.println("Introduction Page is displayed");
	}	
}
public void tryhere() {
	System.out.println("I did in try here page....");
	driver.findElement(tryherebtn).click();
}
public void TryEditorPage() {
	driver.getCurrentUrl();
	System.out.println("User is on the try editor page :"+ driver.getCurrentUrl());
    System.out.println("Current Title of the page is:"+ driver.getTitle());
}
public void entrTextInTryEditorTxtBox() {
	Actions action = new Actions(driver);
	WebElement ele = driver.findElement(tryeditortxtbox);
	WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	Wait.until(ExpectedConditions.visibilityOf(ele));
	
	String TextToInput = "print 'Hello'";
	action.sendKeys(ele, TextToInput).perform();
	System.out.println("I entered text box");
	
}
public void RunBtn() {
	driver.findElement(runbtn).click();
}
public void consoleoutput() {
String output =	driver.findElement(consoleoout).getText();
System.out.println(output);
}

 
public void createlist() {
	driver.findElement(create).click();
}

public void chkcreatelist() {
	driver.getTitle();
	System.out.println("Create list page title is: "+driver.getTitle());
}
	public void typesoflist() {
		driver.findElement(types).click();
	} 
	public void implementoflist() {
		driver.findElement(implement).click();
	}
	public void traversal() {
		driver.findElement(traver).click();
	}
	public void insertion() {
		driver.findElement(insertn).click();
	}
	public void deletion() {
		driver.findElement(deletn).click();
	}

	}

 