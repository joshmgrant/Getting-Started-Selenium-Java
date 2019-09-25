package com.saucelabs.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class WorkflowTest {

    protected WebDriver driver;

    @Test
    public void workflowTest() {

//        DesiredCapabilities caps = DesiredCapabilities.chrome();
//        caps.setCapability("platform", "Windows 10");
//        caps.setCapability("version", "65.0");
//        caps.setCapability("seleniumVersion", "3.1.0");
//
//        String sauce_username = System.getenv("SAUCE_USERNAME");
//        String sauce_access_key = System.getenv("SAUCE_ACCESS_KEY");
//
//        URL url = null;
//        try {
//            url = new URL("https://" + sauce_username + ":" + sauce_access_key + "@ondemand.saucelabs.com/wd/hub/");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

        driver = new ChromeDriver();

//        driver.get("https://www.saucedemo.com");
//
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector(".btn_action")).click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("/inventory.html"));

        driver.quit();
    }


}
