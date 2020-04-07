package uk.wcht.org.pages;

import org.openqa.selenium.By;
import uk.wcht.org.utility.Utility;

/*
Created By Bhavesh
*/public class YourAccountPage extends Utility {

By welcomeText = By.xpath("//span[contains(text(),\"It's easy to manage your tenancy with an online ac\")]");
By registerLink = By.xpath("//a[contains(text(),'Register')]");

public String getWelcomeText(){
    return getTextFromElement(welcomeText);
}
public void clickOnRegisterLink(){
    clickOnElement(registerLink);
}
}
