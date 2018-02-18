package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Browser;

public class ContactUsSuccessPage {

	static WebElement continueButton;

	public static void verifyContactUsSuccess() {

		continueButton = Browser.driver.findElement(By.xpath("//*[@id='content']/div/div/a"));

		assertEquals(true, continueButton.isDisplayed());

	}
}
