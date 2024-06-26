package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class MainPage {
    public SelenideElement title = Selenide.$x("//span[@class='title']");
    public SelenideElement backpackAddToCartButton = Selenide.$x("//*[@id='add-to-cart-sauce-labs-backpack']");
    public SelenideElement backpackRemoveButton = Selenide.$x("//*[@id='remove-sauce-labs-backpack']");
    public SelenideElement shoppingCartBadge = Selenide.$x("//*[@data-test='shopping-cart-badge']");
    public SelenideElement buttonBurgerMenu = Selenide.$x("//*[@id='react-burger-menu-btn']");
    public SelenideElement logoutSidebarLink = Selenide.$x("//*[@id='logout_sidebar_link']");
    public SelenideElement shopping_cart_link = Selenide.$x("//*[@data-test='shopping-cart-badge']");
    public SelenideElement add_to_cart_backpack = Selenide.$x("//*[@data-test='add-to-cart-sauce-labs-backpack']");
    public SelenideElement burger_menu = Selenide.$x("//*[@id='react-burger-menu-btn']");
    public SelenideElement logout = Selenide.$x("//*[@id='logout_sidebar_link']");
}

