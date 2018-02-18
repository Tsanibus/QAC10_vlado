package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Browser;

public class ContactUsPage {

	static WebElement yourName;
	static WebElement emailAddress;
	static WebElement enquiry;
	static WebElement submitButton;

	public static void verifyContactUs() {
		yourName = Browser.driver.findElement(By.id("input-name"));
		emailAddress = Browser.driver.findElement(By.id("input-email"));
		enquiry = Browser.driver.findElement(By.id("input-enquiry"));
		submitButton = Browser.driver.findElement(By.xpath("//*[@id='content']/form/div/div/input"));

		assertEquals(true, yourName.isDisplayed());
		assertEquals(true, emailAddress.isDisplayed());
		assertEquals(true, enquiry.isDisplayed());
		assertEquals(true, submitButton.isDisplayed());
	}

	public static void submitInput(String name, String email, String enquiryText) {
		yourName = Browser.driver.findElement(By.id("input-name"));
		emailAddress = Browser.driver.findElement(By.id("input-email"));
		enquiry = Browser.driver.findElement(By.id("input-enquiry"));
		submitButton = Browser.driver.findElement(By.xpath("//*[@id='content']/form/div/div/input"));

		yourName.sendKeys(name);
		emailAddress.sendKeys(email);
		enquiry.sendKeys(enquiryText);
		submitButton.click();

	}
}
