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

        driver = new ChromeDriver();

        driver.quit();
    }


}
