package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.MyFilesPage;

import java.util.Random;

public class Tests {
    WebDriver driver;
    LoginPage login;
    Dashboard dashboard;
    MyFilesPage myFilesPage;

    @BeforeSuite
    public void startTestSuite() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        // driver.get("URL");
        // login("username, "Password");
    }


    @Test
// test cases

    @AfterSuite
    // quite
}