package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenTestSteps {
    @When("^I Mouse Hover on Men Menu$")
    public void iMouseHoverOnMenMenu() {
        new MenPage().mouseHoverOnMenMenu();
    }

    @And("^I Mouse Hover on Bottoms$")
    public void iMouseHoverOnBottoms() {
        new MenPage().mouseHoverOnBottoms();
    }

    @And("^I Click on Pants$")
    public void iClickOnPants() {
        new MenPage().clickOnPants();
    }

    @And("^I Mouse Hover on product name‘Cronus Yoga Pant’ and click on size (\\d+)\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize(int arg0) {
        new MenPage().clickOnCronousSize32();
    }

    @And("^I Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new MenPage().clickOnCronousBlack();
    }

    @And("^I Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(2000);
        new MenPage().mouseHoverOnCronusYogaAndClickAddCart();

    }

    @Then("^I Verify the text‘You added Cronus Yoga Pant to your shopping cart\\.’$")
    public void iVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        new MenPage().getSuccessMsgText();
    }

    @Then("^I Verify the text ‘Shopping Cart\\.’$")
    public void iVerifyTheTextShoppingCart() {
        new MenPage().getShoppingCartText();
    }

    @Then("^I Verify the product size ‘(\\d+)’$")
    public void iVerifyTheProductSize(int arg0) {
        new MenPage().getProductSize();
    }

    @Then("^I Verify the product colour ‘Black’$")
    public void iVerifyTheProductColourBlack() {
        new MenPage().getProductColour();
    }
}
