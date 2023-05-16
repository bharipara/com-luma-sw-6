package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenTestSteps {
    @When("^I Mouse Hover on Women Menu$")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().mouseHoverOnWomen();
    }

    @And("^I Mouse Hover on Tops$")
    public void iMouseHoverOnTops() {
        new WomenPage().mouseHoverOnTop();
    }

    @And("^I Click on Jackets$")
    public void iClickOnJackets() {
        new WomenPage().clickOnJacket();
    }

    @And("^I Select Sort By filter “Product Name”$")
    public void iSelectSortByFilterProductName() {
        new WomenPage().selectFiletrFromDropDownList();
    }

    @And("^I Verify the products name display in alphabetical order$")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder() {

    }

    @And("^I Select Sort By filter “Price”$")
    public void iSelectSortByFilterPrice() {
        new WomenPage().setSelectByFilterPrice();
    }

    @Then("^I Verify the products price display in Low to High$")
    public void iVerifyTheProductsPriceDisplayInLowToHigh() {
        new WomenPage().setSelectByFilterPrice();
    }


}
