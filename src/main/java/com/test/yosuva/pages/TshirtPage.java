package com.test.yosuva.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.test.yosuva.Util.DriverManager;

import java.util.List;

/**
 * Created by Yosuva on 03-05-2021.
 */
public class TshirtPage extends PageBase {

    public TshirtPage(DriverManager context) {
        super(context);
    }

    public WebElement tshirtTab(){
        return getWebElementVisible(By.xpath("(//a[@title='T-shirts'])[2]"));
    }
    
    public void HoverOnProductImage(){
    Actions actions = new Actions(driver);
	WebElement menuOption = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	actions.moveToElement(menuOption).perform();
    }

    public WebElement addToCart() {
        return getWebElementVisible(By.xpath("//*[text()='Add to cart']"));
    }

    public WebElement proceedToCheckout() {
        return getWebElementVisible(By.xpath("(//*[contains(text(),'Proceed to checkout')])[last()]"));
    }

    public WebElement agreeTermsAndCondition() {
        return getWebElementVisible(By.id("cgv"));
    }

    public WebElement payByCheck() {
        return getWebElementVisible(By.xpath("//a[@title='Pay by check.']"));
    }

    public WebElement confirmOrder() {
        return getWebElementVisible(By.xpath("//*[text()='I confirm my order']"));
    }

    public WebElement backToOrder() {
        return getWebElementVisible(By.xpath("//a[@title='Back to orders']"));
    }

    public List<WebElement> orders() {
        return getWebElementsVisible(By.xpath("//*[@class='color-myaccount']"));
    }

}
