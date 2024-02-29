package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.manage().window().fullscreen();
    }

    @Test(priority = 1)
    public void getUrl(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://mvnrepository.com/");
        System.out.println("Printing url: "+url);
    }

    @Test(priority = 2)
    public void getTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Maven Repository: Search/Browse/Explore");
        System.out.println("Printing title: "+title);
    }

    @AfterTest
    public void closeBrowser(){
       driver.close();
    }
}
