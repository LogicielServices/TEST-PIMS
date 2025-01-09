package Services;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

@Epic("Dashboard Testing")
@Feature("Account Management")
public class dashboardTests {

    @Test
    @Story("Signup and Account Deletion")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test to create and delete a user account on the dashboard")
    public void HomeTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://automationexercise.com/");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Signup / Login")).click();
            page.getByPlaceholder("Name").fill("Muzammil Hussain");
            page.getByPlaceholder("Name").press("Tab");
            page.locator("form").filter(new Locator.FilterOptions().setHasText("Signup")).getByPlaceholder("Email Address").fill("muzammil@gmail.com");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Signup")).click();
            page.getByText("Mr.").click();
            page.getByLabel("Password *").fill("Hassan");
            page.locator("#days").selectOption("1");
            page.locator("#months").selectOption("1");
            page.locator("#years").selectOption("2000");
            page.locator("#form form div").filter(new Locator.FilterOptions().setHasText("Sign up for our newsletter!")).click();
            page.getByLabel("Receive special offers from").check();
            page.getByLabel("First name *").fill("Muzammil");
            page.getByLabel("Last name *").fill("Hussain");
            page.getByLabel("Company", new Page.GetByLabelOptions().setExact(true)).fill("Logiciel");
            page.getByLabel("Address * (Street address, P.").fill("Karachi");
            page.getByLabel("Address 2").fill("Karachi");
            page.getByLabel("Country *").selectOption("United States");
            page.getByLabel("State *").fill("Texas");
            page.getByLabel("City *").fill("Texas");
            page.locator("#zipcode").fill("23456");
            page.getByLabel("Mobile Number *").fill("03119988776");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Account")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Continue")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Delete Account")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Continue")).click();
        }
    }
}
