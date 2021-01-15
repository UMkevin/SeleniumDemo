/**
 * @ClassName demo3
 * @Description demo3
 * @Author Kevin Ge
 * @Date 2020/6/22 15:16
 * @Version 1.0
 */



import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


/*
智能卡开户功能
 */
public class demo3 {
    public WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.ie.driver","F:\\BaiduNetdiskDownload\\BrowserDriver\\IEDriverServer_32.exe");
        driver = new InternetExplorerDriver();

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws Exception
    {
        Actions ac = new Actions(driver); // 为driver 加载 actions
        driver.get("http://10.45.70.63:8080/tms-web/login.html");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("100006");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("111111");
        driver.findElement(By.id("isRemenber")).click();
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);//等待两秒
        //   driver.manage().window().maximize();
        // driver.manage().window().setSize(new Dimension(1440,900));
        List<WebElement> list1 = driver.findElement(By.id("J_Menu")).findElements(By.className("last"));
        WebElement we = list1.get(0);
        ac.moveToElement(we).perform();
        Thread.sleep(2000);
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // WebElement openAccount = we.findElement(By.className("ico09"));
        driver.findElement(By.linkText("Open Account")).click();
        Thread.sleep(3000);//等待两秒
        driver.findElement(By.id("account-add")).click();
        Thread.sleep(2000);//等待两秒



        driver.findElement(By.xpath("//form[@id='etcp-personalInfo-add']/div[2]/div/div/div")).click();
        driver.findElement(By.xpath("//body/ul/li[1]")).click();
        driver.findElement(By.id("idno")).click();
        driver.findElement(By.id("idno")).clear();
        driver.findElement(By.id("idno")).sendKeys("85997666");
        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("kevin");

        //   driver.findElement(By.className("ttt")).click();

        driver.findElement(By.id("mobilephone")).click();
        driver.findElement(By.id("mobilephone")).clear();
        driver.findElement(By.id("mobilephone")).sendKeys("121111119");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("123@qq.com");
        driver.findElement(By.id("address")).click();
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("nanjing");
        Thread.sleep(5000);//等待两秒


        // assertTrue(a,b,"a和b 不同");

        driver.findElement(By.id("accountMgt-add-submitData")).click();



        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//div[3]/div[2]")).click();

//        driver.switchTo().defaultContent();
//
//        try {
//            Thread.sleep(2000);
//        }catch (Exception e){
//
//        }
//
//        driver.findElement(By.className("btn-success")).click();

        // ActionChains(driver).send_keys(Keys.ENTER).perform();



    }
    @After
    public void tearDown() throws Exception {
        //driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}

