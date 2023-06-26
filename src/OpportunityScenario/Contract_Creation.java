package OpportunityScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.screenshot;

public class Contract_Creation {

	By MarkStatus =By.xpath("//span[.='Mark Status as Complete']"); 
	By opportunity = By.xpath("(//one-app-nav-bar-item-root[@role='listitem']//a)[2]");
	By ClickName = By.xpath("(//a[@data-special-link='true'])[1]");
	By MarkStage = By.xpath("//span[contains(text(),'Mark Stage as Complete')]"); 
	By Closeopportunity =By.xpath("//div//div//div//div//div//select[@class='stepAction required-field select']");
	By Save =By.xpath("//button[@title='Save']");
	By Contract = By.xpath("//span[text()='Contracts']");
	By ID=By.xpath("//th//span//a[@data-navigable='true']");
	By Activited =By.xpath("//span[text()='Activated']");
	By Markstatuscomplete =By.xpath("//div//button[.='Mark Status as Complete']");
	By Order =By.xpath("//span[normalize-space()='Orders']"); 
    By Recently =By.xpath("//span[text()='Recently Viewed']");
    By Allorder =By.xpath("(//a[@role='option'])[3]");
    
	WebDriver driver;

	public Contract_Creation (WebDriver driver) {
		this.driver = driver;
	}



	public void Contract_tab_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Contract);
		js.executeScript("arguments[0].click();", m);
		System.out.println("Contract has been created" );
	}
	public void ID_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(ID);
		js.executeScript("arguments[0].click();", m);
	}
	public void Activited_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Activited);
		js.executeScript("arguments[0].click();", m);
	}

	public void Markstatus_complete() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Markstatuscomplete);
		js.executeScript("arguments[0].click();", m);
	}


	public void Order_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Order);
		js.executeScript("arguments[0].click();", m);
	}
	
	public void Recently_Click() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement m = driver.findElement(Recently);
		js.executeScript("arguments[0].click();", m);
	}
	
	public void Allorder_view(String strAllorder) throws InterruptedException {
		Thread.sleep(4000); 
		// TODO Auto-generated method stub
		driver.findElement(Recently).sendKeys(strAllorder);	  
	}

	
	public void Screen2() {

		screenshot.captureScreenshot(driver, "19. Contract Creation");
	}

	public void Screen() {

		screenshot.captureScreenshot(driver, "20.Activated Contract");
	}
	public void Screen1() throws Exception {
		Thread.sleep(5000);
		screenshot.captureScreenshot(driver, "21.Order Creation");
	}
	public void Contract_Create(String  strAllorder) throws Exception {

		//COntract Tab 
		this.Contract_tab_Click();
		//Screen Shot
		this.Screen2();
		//Click ID
		this.ID_Click();
		//Activeited the Contract
		this.Activited_Click();
		//
		this.Markstatus_complete();
		//Screen Shot
		this.Screen();
		//View All
		this.Order_Click();
		//Recently
		this.Recently_Click();
		//Allorder
		 Allorder_view(strAllorder);
		//Screen Shot
		this.Screen1();
	}
}


