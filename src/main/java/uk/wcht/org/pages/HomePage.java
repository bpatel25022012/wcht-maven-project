package uk.wcht.org.pages;

import org.openqa.selenium.By;
import uk.wcht.org.utility.Utility;

/*
Created By Bhavesh
*/public class HomePage extends Utility {

    By yourAccount = By.xpath("//span[contains(text(),'Your account')]");
    By yourHome = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your home')]");
    By yourCommunity = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your community')]");
    By findAHome = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Find a home')]");
    By aboutUs = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'About us')]");
    By helpSupport = By.xpath("//a[contains(text(),'Help & support')]");

    public void clickOnYourAccount(){
        clickOnElement(yourAccount);
    }
    public void clickOnYourHome(){
        clickOnElement(yourHome);
    }
    public void clickOnYourCommunity(){
        clickOnElement(yourCommunity);
    }
    public void clickOnFindAHome(){
        clickOnElement(findAHome);
    }
    public void clickOnAboutUs(){
        clickOnElement(aboutUs);
    }
    public void clickOnHelpSupport(){
        clickOnElement(helpSupport);
    }
}
