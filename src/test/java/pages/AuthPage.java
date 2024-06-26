package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class AuthPage {
    public SelenideElement userNameInput = Selenide.$x("//*[@id='user-name']");
    public SelenideElement passwordInput = Selenide.$x("//*[@id='password']");
    public SelenideElement loginButton = Selenide.$x("//*[@id='login-button']");
    public SelenideElement dataTestError = Selenide.$x("//*[@data-test='error']");
    public SelenideElement login_logo = Selenide.$x("//div[@class='login_logo']");
}
