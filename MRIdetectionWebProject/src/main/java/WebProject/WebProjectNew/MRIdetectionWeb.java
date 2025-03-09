package WebProject.WebProjectNew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MRIdetectionWeb {

	public static WebDriver driver;
	private BeforeClassMRIDetection beforeclassmridetection; 
	private MRIDetectionVariables mridetectionVariables;

	public String ExpectedEmployeeName;

	public void SetupClass() throws Exception {
		beforeclassmridetection.Setup();  
		mridetectionVariables = new MRIDetectionVariables();
	}

	public void URLOpenning() throws InterruptedException{ 
		driver = beforeclassmridetection.getDriver();
		driver.get(mridetectionVariables.URL);

		System.out.println("URL oppened");
	} 

	public void FrameOneIntrodction() throws Exception{ 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(1500); 
		
		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(1000); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(1000); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(1000); 
		
		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500);

		js.executeScript("window.scrollTo(0, 0);");

	}

	public void MenuClick() throws Exception{ 
		Thread.sleep(500);
		driver.findElement(By.xpath(mridetectionVariables.Navigation)).click(); }


	public void HowToDemo() throws Exception{ 

		Thread.sleep(500);
		driver.findElement(By.xpath(mridetectionVariables.HowToDemo)).click(); 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy({top: 100, behavior: 'smooth'});");
		Thread.sleep(1000); 

		driver.findElement(By.xpath(mridetectionVariables.GliomaList)).click(); 
		Thread.sleep(500);

		WebElement ClearButton = driver.findElement(By.xpath(mridetectionVariables.ClearButton));
		driver.findElement(By.xpath(mridetectionVariables.GliomaImageOne)).click(); 
		Thread.sleep(500);
		js.executeScript("window.scrollBy({top: 100, behavior: 'smooth'});");
		Thread.sleep(500);
		ClearButton.click();

		driver.findElement(By.xpath(mridetectionVariables.GliomaList)).click(); 
		driver.findElement(By.xpath(mridetectionVariables.GliomaImageTwo)).click(); 
		Thread.sleep(500);
		js.executeScript("window.scrollBy({top: 100, behavior: 'smooth'});");
		Thread.sleep(500);
		ClearButton.click();

		driver.findElement(By.xpath(mridetectionVariables.GliomaList)).click(); 
		driver.findElement(By.xpath(mridetectionVariables.GliomaImageThree)).click(); 
		Thread.sleep(500);
		js.executeScript("window.scrollBy({top: 100, behavior: 'smooth'});");
		Thread.sleep(500);
		ClearButton.click();

		Thread.sleep(500);
		driver.findElement(By.xpath(mridetectionVariables.NoTumorList)).click(); 

		driver.findElement(By.xpath(mridetectionVariables.NoTumorImageOne)).click(); 
		Thread.sleep(500);
		js.executeScript("window.scrollBy({top: 100, behavior: 'smooth'});");
		Thread.sleep(500);
		ClearButton.click();

		driver.findElement(By.xpath(mridetectionVariables.NoTumorList)).click(); 
		driver.findElement(By.xpath(mridetectionVariables.NoTumorImageTwo)).click(); 
		Thread.sleep(500);
		js.executeScript("window.scrollBy({top: 100, behavior: 'smooth'});");
		Thread.sleep(500);
		ClearButton.click();

		driver.findElement(By.xpath(mridetectionVariables.NoTumorList)).click(); 
		driver.findElement(By.xpath(mridetectionVariables.NoTumorImageThree)).click(); 
		Thread.sleep(500);
		js.executeScript("window.scrollBy({top: 100, behavior: 'smooth'});");
		Thread.sleep(500);
		ClearButton.click();
		Thread.sleep(500);
		js.executeScript("window.scrollTo(0, 0);");

	}

	public void AbutUs() throws Exception{ 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		Thread.sleep(500);
		driver.findElement(By.xpath(mridetectionVariables.Navigation)).click();

		Thread.sleep(500);
		driver.findElement(By.xpath(mridetectionVariables.AboutUs)).click();

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500); 

		js.executeScript("window.scrollBy({top: 200, behavior: 'smooth'});");
		Thread.sleep(500); 

		js.executeScript("window.scrollBy({top: 300, behavior: 'smooth'});");
		Thread.sleep(500); 


		js.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(1000);
		driver.findElement(By.xpath(mridetectionVariables.Navigation)).click();
	}

	public void Introduction() throws Exception{ 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(500);
		driver.findElement(By.xpath(mridetectionVariables.Introduction)).click();
		js.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(10000);
	}

}
