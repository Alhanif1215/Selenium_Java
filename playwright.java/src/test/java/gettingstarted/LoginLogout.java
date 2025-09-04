package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class LoginLogout {

	public static void main(String[] args) {

		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		PlaywrightAssertions.assertThat(page).hasTitle("Learn Automation Courses");
		page.waitForTimeout(2000);
		
		page.locator("#email1").fill("admin@email.com");
		page.locator("xpath=//input[@name='password1']").fill("admin@123");
		page.waitForTimeout(2000);

		page.getByText("Sign in").and(page.locator(".submit-btn")).click();
		
		page.waitForTimeout(2000);
		page.close();
		browser.close();
	}

}
