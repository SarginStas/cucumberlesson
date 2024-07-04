package cucumber;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.*;

import org.openqa.selenium.chrome.ChromeOptions;
import pages.AuthPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    AuthPage authPage = new AuthPage();
    MainPage mainPage = new MainPage();

    @Given("open {string}")
    public void openUrl(String url) {
        Configuration.browserSize = "1280x800";
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open(url);
    }

    @When("user input login {string}")
    public void userInputLogin(String login) {
        authPage.userNameInput.sendKeys(login);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        authPage.passwordInput.sendKeys(password);
    }

    @And("user click Login")
    public void userInputLogin() {
        authPage.loginButton.click();
    }

    @Then("user sees Title")
    public void userSeesTitle() {
        mainPage.title.shouldBe(visible);
    }

    @And("Title has text {string}")
    public void titleHasText(String text) {
        assertEquals(mainPage.title.getText(), text);
    }

    @Then("user sees Error")
    public void userSeesError() {
        authPage.dataTestError.shouldBe(visible);
    }
    @And("Error has text {string}")
    public void errorHasText(String text) {
        assertEquals(authPage.dataTestError.getText(), text);
    }

}
