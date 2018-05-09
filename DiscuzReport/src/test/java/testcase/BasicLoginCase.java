package testcase;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageHelper.HelperLoginPage;
import util.BrowserEngine;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by delldell on 2018/5/8.
 */
public class BasicLoginCase {

    public SeleniumUtil seleniumUtil;


    @BeforeMethod
    public void setUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","D:\\测试\\linux\\chrome&driver\\chromedriver.exe");
//        PropertyConfigurator.configure("./log4j.properties");
//        driver = seleniumUtil.getDriver("chrome");
//        driver.manage().window().maximize();
//        seleniumUtil.getUrl("http://127.0.0.1/Discuz_X3.2_SC_GBK/upload/forum.php");


        LogConfiguration.initLog();
        seleniumUtil = new SeleniumUtil();
        seleniumUtil.getBrowser();
        HelperLoginPage.login(seleniumUtil,"admin","123456");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void testDown() throws InterruptedException {
        ///html/body/div[6]/div/div[1]/div/p[1]/a[7]
        //seleniumUtil.click(By.xpath("/html/body/div[6]/div/div[1]/div/p[1]/a[7]"));
      //  Thread.sleep(3000);
       // driver.quit();
    }
}
