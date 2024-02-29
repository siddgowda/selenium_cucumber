package tests;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest extends BaseTest {


    @Test(priority = 1)
    public void getUrl() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://mvnrepository.com/");
        System.out.println("Printing url: " + url);
    }

    @Test(priority = 2)
    public void getTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Maven Repository: Search/Browse/Explore");
        System.out.println("Printing title: " + title);
    }


}
