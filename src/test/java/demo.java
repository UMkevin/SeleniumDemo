//package TestDemo;

/**
 * Author HenryXiao
 * create by 2018-12-08
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class demo {
    @Test
    public void testLogin(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        /*System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();*/
        driver.get("https://m.youximao.tv/#/login");
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        driver.manage().window().maximize();
        driver.findElement(By.name("account")).sendKeys("*****±£√‹");
        driver.findElement(By.name("password")).sendKeys("*****±£√‹");
        driver.findElement(By.className("el-button")).click();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.close();

    }
}

