package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());

    public WomenPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    // Mouse Hover on Women Menu
    WebElement womenMenu;

    @CacheLookup
    @FindBy(linkText = "Tops")
    // Mouse Hover on Tops
    WebElement tops;

    @CacheLookup
    @FindBy(linkText = "Jackets")
    // Click on Jackets
    WebElement clickOnJackets;

    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement selectByFilterProductName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectByFilterPrice;

    public void mouseHoverOnWomen() {

        log.info("Mouse hover on women" + womenMenu.toString());
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTop() {

        log.info("Mouse hover on top" + tops.toString());
        mouseHoverToElement(tops);
    }
    public void clickOnJacket(){

        log.info("Click on Jackets" + clickOnJackets.toString());
        clickOnElement(clickOnJackets);
    }
    public void selectFiletrFromDropDownList() {

        log.info("Click on continue button" + selectByFilterProductName.toString());
        clickOnElement(selectByFilterProductName);
    }
    public  void setSelectByFilterPrice(){

        log.info("Click on continue button" + selectByFilterPrice.toString());
        selectByValueFromDropDown(selectByFilterPrice,"price");
    }
}
