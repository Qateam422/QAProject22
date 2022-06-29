package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.MyFilesPage;



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
    public void loginTest(){
        // test cases
    }


    @AfterSuite
    public void aftersuite(){
        // quite
    }

}