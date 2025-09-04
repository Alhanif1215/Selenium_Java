package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class First_PWTest {

	public static void main(String[] args) {

		Playwright pw = Playwright.create();
		BrowserType browserType = pw.chromium();
		Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		page.navigate("https://www.facebook.com/");
		String title = page.title();
		System.out.println(title);
		
		page.close();
		browser.close();
		pw.close();
	}

}
