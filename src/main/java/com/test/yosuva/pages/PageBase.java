package com.test.yosuva.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.yosuva.Util.DriverManager;

import java.util.List;
/**
 * Created by Yosuva on 03-05-2021.
 */
public class PageBase {

    WebDriver driver;

    public PageBase(DriverManager manager){
        this.driver = manager.getDriver();
    }

    public WebElement getWebElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> getWebElementsVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
}
