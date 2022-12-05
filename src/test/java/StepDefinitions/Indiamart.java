package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Indiamart {
	WebDriver driver = null;
	
	@Given("user on the browser")
	public void user_on_the_browser() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("user enter the url {string}")
	public void user_enter_the_url(String string) throws IOException {
	    driver.get("https://www.indiamart.com/");
	    driver.manage().window().maximize();
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
	    System.out.println("the Screenshot is taken");
	    
	} 



	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
	    
	}
	
	@When("user clicks on the the Pharmaceutical Drug, Medicine, Medical Care & Consultation")
	public void user_clicks_on_the_the_pharmaceutical_drug_medicine_medical_care_consultation() throws IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"," ");
		driver.findElement(By.xpath("//a[contains(text(),'Pharmaceutical Drug, Medicine, Medical Care & Cons')]")).click();
		 TakesScreenshot ts = (TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source, new File("./Screenshots/Screen1.png"));
		    System.out.println("the Screenshot is taken");
		//driver.navigate().back();
		
	  
	}
	
	@Then("user clicks on the Pharmaceutical Medicine")
	public void user_clicks_on_the_pharmaceutical_medicine() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"," ");
		driver.findElement(By.xpath("//a[normalize-space()='Pharmaceutical Medicine']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen2.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@When("user clicks on the Cough Syrup")
	public void user_clicks_on_the_cough_syrup() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"," ");
		driver.findElement(By.xpath("//a[normalize-space()='Cough Syrup']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen3.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Then("user clicks on the Pharmaceutical Tablets")
	public void user_clicks_on_the_pharmaceutical_tablets() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"," ");
		driver.findElement(By.xpath("//a[contains(text(),'Pharmaceutical Drug, Medicine, Medical Care & Cons')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Pharmaceutical Tablets']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen4.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@When("user clicks on the Pharmaceutical Drug")
	public void user_clicks_on_the_pharmaceutical_drug() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,525)"," ");
		driver.findElement(By.xpath("//a[normalize-space()='Pharmaceutical Drug']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen5.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Then("user clicks on the Hospital and Medical Equipment")
	public void user_clicks_on_the_hospital_and_medical_equipment() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)"," ");
		driver.findElement(By.xpath(" //a[normalize-space()='Hospital and Medical Equipment']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen6.png"));
	    System.out.println("the Screenshot is taken");
		//driver.navigate().back();
	}

	@When("user clicks on the Pulse Oximeter, Glucometer & POCT Devices")
	public void user_clicks_on_the_pulse_oximeter_glucometer_poct_devices() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen7.png"));
	    System.out.println("the Screenshot is taken");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)"," ");
		driver.findElement(By.xpath("//a[normalize-space()='Pulse Oximeter, Glucometer & POCT Devices']")).click();
		driver.navigate().back();
		
	}

	@Then("user clicks on the Medical Equipment")
	public void user_clicks_on_the_medical_equipment() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)"," ");
		driver.findElement(By.xpath("//a[normalize-space()='Medical Equipment']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen8.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@When("user clicks on the Medical Equipment & Accessories")
	public void user_clicks_on_the_medical_equipment_accessories() throws IOException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)"," ");
		driver.findElement(By.xpath(" //a[normalize-space()='Hospital and Medical Equipment']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Medical Equipment & Accessories']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen9.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@Then("user clicks on the Medical Instruments")
	public void user_clicks_on_the_medical_instruments() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)"," ");
		driver.findElement(By.xpath("//a[normalize-space()='Medical Instruments']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen10.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		driver.navigate().back();
	}

	@When("user clicks on the Industrial Plants, Machinery & Equipment")
	public void user_clicks_on_the_industrial_plants_machinery_equipment() throws IOException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,550)"," ");
		driver.findElement(By.xpath("//a[normalize-space()='Industrial Plants, Machinery & Equipment']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen11.png"));
	    System.out.println("the Screenshot is taken");
	}

	@Then("user clicks on the Industrial Machinery")
	public void user_clicks_on_the_industrial_machinery() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)"," ");
		driver.findElement(By.xpath(" //a[normalize-space()='Industrial Machinery']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen12.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();

	}

	@When("user clicks on the SPM Machine")
	public void user_clicks_on_the_spm_machine() throws IOException {
		driver.findElement(By.xpath(" //ul[1]//li[1]//span[1]//a[2]")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen13.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	
	}

	@Then("user clicks on the Industrial Washing Machine")
	public void user_clicks_on_the_industrial_washing_machine() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Industrial Washing Machine']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen14.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@When("user clicks on the Pressure Washer")
	public void user_clicks_on_the_pressure_washer() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Pressure Washer']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen15.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		driver.navigate().back();
	}

	@Then("user clicks on the Industrial & Engineering Products, Spares and Supplies")
	public void user_clicks_on_the_industrial_engineering_products_spares_and_supplies() throws IOException {
		driver.findElement(By.xpath("//a[contains(text(),'Industrial & Engineering Products, Spares and Supp')]")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen16.png"));
	    System.out.println("the Screenshot is taken");
	}

	@When("user clicks on the Submersible Pump")
	public void user_clicks_on_the_submersible_pump() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Submersible Pump']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen17.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@Then("user clicks on the Water Pumps")
	public void user_clicks_on_the_water_pumps() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Water Pumps']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen18.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@When("user clicks on the Electric Pump")
	public void user_clicks_on_the_electric_pump() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Electric Pump']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen19.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@Then("user clicks on the Pressure Pumps")
	public void user_clicks_on_the_pressure_pumps() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Pressure Pumps']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen20.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		driver.navigate().back();
	}

	@When("user clicks on the Food, Agriculture & Farming")
	public void user_clicks_on_the_food_agriculture_farming() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Food, Agriculture & Farming']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen21.png"));
	    System.out.println("the Screenshot is taken");
	
	}

	@Then("user clicks on the Food Additive")
	public void user_clicks_on_the_food_additive() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Food Additive']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen22.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@When("user clicks on the Food Flavour")
	public void user_clicks_on_the_food_flavour() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Food Flavour']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen23.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@Then("user clicks on the Food Acidulant")
	public void user_clicks_on_the_food_acidulant() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Food Acidulant']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen24.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}

	@When("user clicks on the Sweetener")
	public void user_clicks_on_the_sweetener() throws IOException {
		driver.findElement(By.xpath("//a[normalize-space()='Sweetener']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen25.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	}


}
