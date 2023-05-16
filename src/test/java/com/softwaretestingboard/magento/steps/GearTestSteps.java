package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GearTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Mouse Hover on Gear Menu$")
    public void iMouseHoverOnGearMenu() {
        new GearPage().mouseHoverOnGear();
    }

    @And("^I Click on Bags$")
    public void iClickOnBags() {
        new GearPage().clickOnBags();
    }

    @And("^I Click on Product Name ‘Overnight Duffle’$")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductName();
    }

    @Then("^I Verify the text ‘Overnight Duffle’$")
    public void iVerifyTheTextOvernightDuffle() {
        new GearPage().getProductNameText();
    }

    @And("^I Change Qty (\\d+)$")
    public void iChangeQty(int arg0) {
        new GearPage().changeQty5();
    }

    @And("^I Click on ‘Add to Cart’ Button\\.$")
    public void iClickOnAddToCartButton() {
        new GearPage().clickOnAddToCart();
    }

    @Then("^I Verify the text ‘You added Overnight Duffle to your shopping cart\\.’$")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        new GearPage().getTextAddedDuffleToCart();
    }

    @And("^I Click on ‘shopping cart’ Link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new GearPage().clickOnShoppingCart();
    }

    @Then("^I Verify the product name ‘Cronus Yoga Pant’$")
    public void iVerifyTheProductNameCronusYogaPant() {
        new GearPage().getProductNameText();
    }

    @Then("^I Verify the Qty is ‘(\\d+)’$")
    public void iVerifyTheQtyIs(int arg0) {
        new GearPage().getQty3Text();
    }

    @Then("^I Verify the product price ‘\\$(\\d+)\\.(\\d+)’$")
    public void iVerifyTheProductPrice$(int arg0, int arg1) {
        new GearPage().getProductPrice();
    }

    @And("^I can Change Qty to ‘(\\d+)’$")
    public void iCanChangeQtyTo(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        new GearPage().changeQty5();
    }

    @And("^I Click on ‘Update Shopping Cart’ button$")
    public void iClickOnUpdateShoppingCartButton() {
        new GearPage().clickOnShoppingCart();
    }
}
