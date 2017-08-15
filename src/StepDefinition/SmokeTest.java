package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class SmokeTest {

	WebDriver driver;
	

@Given("^Open firefox and start application$")
public void Open_firefox_and_start_application() throws Throwable {
   
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nageeb\\ToolsQA\\OnlineShop\\geckodriver.exe");
	driver =new FirefoxDriver(); 
}

@Given("^User is on kano website$")
public void User_is_on_kano_website() throws Throwable {
    driver.get("https://kano.me");
}

@When("^I add computer kit bundle to basket$")
public void I_add_computer_kit_bundle_to_basket() throws Throwable {
	
	driver.findElement(By.id("store-icon")).click();
	driver.findElement(By.xpath(".//*[@id='ProductListing']/div/div[1]/div/div[3]/a/div/h3")).click();
	//*[@id='ProductListing']/div/div[1]/div/div[3]/a/div/h3
	driver.findElement(By.id("BundleDisplay-actionPrimary--kano-complete")).click();
}

@Then("^kit is added to basket with correct information$")
public void kit_is_added_to_basket_with_correct_information() throws Throwable {
	
	String my_page=driver.getPageSource();
	System.out.println("Shopping shows following product is in the basket: " +my_page);

	Assert.assertTrue(my_page.contains("Computer Kit Bundle"));
	System.out.println("I can confirm the item has been added to the basket");
	
	Thread.sleep(5000);
	
	
	driver.close();

}

@Given("^change to another country$")
public void change_to_another_country() throws Throwable {
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("region-pointer")).click();
	driver.findElement(By.xpath(".//*[@id='navbar']/div/div[4]/kano-cart/div/ul/li[3]/img")).click();
	driver.findElement(By.xpath(".//*[@id='ButtonLink--75']")).click();
	
	Thread.sleep(2000);
	
	}

@Given("^User is on kano projects website$")
public void User_is_on_kano_projects_website() throws Throwable {
	driver.get("https://world.kano.me/projects");

}

@When("^I will now verify the text on the homepage$")
public void I_will_now_verify_the_text_on_the_homepage() throws Throwable {
	Thread.sleep(2000);
	
	 String exp = "World";
	 
	 String act = driver.findElement(By.className("menu-item-label style-scope kano-primary-links")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	 }
	}

	
	
@Then("^should have the correct page on hompage$")
public void should_have_the_correct_page_on_hompage() throws Throwable {
	
	
	}


@When("^user clicks on make$")
public void user_clicks_on_make() throws Throwable {
	driver.get("https://world.kano.me/projects");   
}

@Then("^user is directed to the project page$")
public void user_is_directed_to_the_project_page() throws Throwable {
	Assert.assertEquals("Kano World", driver.getTitle()); 
	
}

@Then("^World is displayed correctly on the nav bar$")
public void World_is_displayed_correctly_on_the_nav_bar() throws Throwable {
	 String exp = "World";
	 
	 String act = driver.findElement(By.xpath(".//*[@id='primary-nav-items']/li[1]/a/span")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	 }
	
}

@Then("^Make is displayed correctly on the nav bar$")
public void Make_is_displayed_correctly_on_the_nav_bar() throws Throwable {
 String exp = "Make";
	 
	 String act = driver.findElement(By.xpath(".//*[@id='primary-nav-items']/li[2]/a/span")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	 }
}

@Then("^Shop is displayed correctly on the nav bar$")
public void Shop_is_displayed_correctly_on_the_nav_bar() throws Throwable {
 String exp = "Shop";
	 
	 String act = driver.findElement(By.xpath(".//*[@id='primary-nav-items']/li[3]/a/span")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	 }
}

@Then("^Connected Kanos present on the footer$")
public void Connected_Kanos_present_on_the_footer() throws Throwable {
 String exp = "Connected Kanos";
	 
	 String act = driver.findElement(By.xpath(".//*[@id='info']/p")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	 }
}

@Then("^Online Today present on the footer$")
public void Online_Today_present_on_the_footer() throws Throwable {
 String exp = "Online Today";
	 
	 String act = driver.findElement(By.xpath(".//*[@id='info']/p")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	 }
}

@Then("^Lines of code present on the footer$")
public void Lines_of_code_present_on_the_footer() throws Throwable {
	String exp = "Lines of code";
	 
	 String act = driver.findElement(By.xpath(".//*[@id='info']/p")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	 }
}

@Then("^Creations shared present on the footer$")
public void Creations_shared_present_on_the_footer() throws Throwable {
	String exp = "Creations shared";
	 
	 String act = driver.findElement(By.xpath(".//*[@id='info']/p")).getText();
	 if(act.contains(exp)){
	     System.out.println(exp + "is present");
	 }else{
	     System.out.println(exp + "is not present");
	     
}
}
}

