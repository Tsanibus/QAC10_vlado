package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Browser;

public class ShopHomePage {

	private static final String URL = "http://shop.pragmatic.bg";
	static WebElement contactUs;
	static WebElement returns;
	static WebElement siteMap;
	static WebElement contact;

	public static void goTo() {
		Browser.driver.get(URL);
	}

	public static void verifyMainPage() {
		contactUs = Browser.driver.findElement(By.xpath("//footer/div/div/div[2]/ul/li[1]/a"));
		returns = Browser.driver.findElement(By.xpath("//footer/div/div/div[2]/ul/li[2]/a"));
		siteMap = Browser.driver.findElement(By.xpath("//footer/div/div/div[2]/ul/li[3]/a"));

		assertEquals("Contact Us", contactUs.getText());
		assertEquals("Returns", returns.getText());
		assertEquals("Site Map", siteMap.getText());
	}

	public static void clickContact() {
		contact = Browser.driver.findElement(By.xpath("//footer/div/div/div[2]/ul/li[1]/a"));
		contact.click();
	}

}
