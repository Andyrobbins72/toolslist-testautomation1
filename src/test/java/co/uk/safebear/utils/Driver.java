package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    private static final String BROWSER = System.getProperty("browser", "chrome");

    public static String getUrl() {
        return URL;
    }

    public static WebDriver getDriver() {

        ChromeOptions chromeOptions;
        FirefoxOptions firefoxOptions;

        switch (BROWSER.toUpperCase()) {

            case "CHROME":

                //tell the user which browser we're running our tests on
                System.out.println(" Executing on CHROME");

                //use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();

                //return our Driver
                return new ChromeDriver();

            case "FIREFOX":

                //tell the user which browser we're running our tests on
                System.out.println(" Executing on FIREFOX");

                //use 'WebDriverManager' to setup our chromedriver
                WebDriverManager.firefoxdriver().setup();

                //return our Driver
                return new FirefoxDriver();

            default:
                throw new IllegalArgumentException("The Browser type is undefined");

        }
    }
}