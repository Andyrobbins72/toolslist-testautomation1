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

        ChromeOptions chromeOptions = null;
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

            case "CHROME_HEADLESS":

                //tell the user which browser we're running our tests on
                System.out.println(" Executing on CHROME_HEADLESS");

                chromeOptions = new ChromeOptions();

                //Set chrome to run headless
                chromeOptions.addArguments("headless");

                //make sure the window size is large and maximised
                //so nothing disappears off screen and can't be found
                chromeOptions.addArguments("window-size-1920,1080");
                chromeOptions.addArguments("start-maximised");

                //setup our chromedriver
                WebDriverManager.chromedriver().setup();

                //return the chromedriver with the chromeoptions set
                return new ChromeDriver(chromeOptions);


            default:
                throw new IllegalArgumentException("The Browser type is undefined");

        }
    }
}