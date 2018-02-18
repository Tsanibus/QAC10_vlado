package shopMainPage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pageObjects.ContactUsPage;
import pageObjects.ContactUsSuccessPage;
import pageObjects.ShopHomePage;
import utils.Browser;

public class ContactUsTest {

	@Before
	public void setUp() {
		Browser.start();	
	}

	@After
	public void tearDown() {
		Browser.stop();
	}

	@Test
	public void positiveSubmition() {

		ShopHomePage.goTo();
		ShopHomePage.verifyMainPage();
		ShopHomePage.clickContact();
		ContactUsPage.verifyContactUs();
		ContactUsPage.submitInput("My name","myname@abv.bg","En taro Adun, executor");
		
		ContactUsSuccessPage.verifyContactUsSuccess();
	}

}
