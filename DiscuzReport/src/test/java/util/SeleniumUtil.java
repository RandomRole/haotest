package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import java.util.List;


/**
 * Created by delldell on 2018/5/7.
 */
public class SeleniumUtil {
    public static Logger logger = Logger.getLogger(SeleniumUtil.class);

   // public BrowserEngine browserEngine;
    public WebDriver driver = null;


    public WebDriver getBrowser(){
//        if(driver.equals("Chrome")){
//         //   driver = new ChromeDriver();
//            logger.info("启动了chromeDriver...");
//        }
//        else if(driver.equals("firefox")){
//         //   driver = new FirefoxDriver();
//            logger.info("启动了firefox...");
//        }
//        else{
//            logger.error("不能识别的驱动");
//        }
//        return driver;
        String browser = BrowserEngine.browserName;
        if(browser.equals("Firefox")){
            System.setProperty("webdriver.","");
            driver = new FirefoxDriver();
            logger.info("启动了firefox...");
        }
        else if(browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","D:\\测试\\linux\\chrome&driver\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("启动了ChromeDriver...");
        }
        driver.get(BrowserEngine.serverURL);
        logger.info("打开的网址："+BrowserEngine.serverURL);
        driver.manage().window().maximize();

        //Thread.sleep(3000);
        return driver;
    }

//    public void getUrl(String url){
//        driver.get(url);
//        logger.info("打开的网址："+url);
//    }

    public WebElement findElement(By by){
        WebElement ele = null;
        try{
            ele = driver.findElement(by);
            logger.info("找到元素");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("元素未找到");
        }
        return ele;
    }
    public List<WebElement> findElements(By by){
        logger.info("返回一组元素");
        return driver.findElements(by);
    }

    public String getLocatorByElement(WebElement ele,String elementType){
        String text = ele.toString();
        String excel = null;
        try{
            excel = text.substring(text.indexOf(elementType)+1,text.length()-1);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("元素定位值返回失败");
        }
        return excel;
    }

    public void clear(By by){
        WebElement ele = findElement(by);
        ele.clear();
        logger.info("清空了内容");
    }

    public void sendKeys(By by,String keys){
        WebElement ele = findElement(by);
        ele.clear();
        ele.sendKeys(keys);
        logger.info("输入的文本内容是："+keys);
    }

    public void click(By by){
//        try {
            WebElement ele = findElement(by);
            ele.click();
            logger.info("点击了该元素");
//        }catch (StaleElementReferenceException e){
//            e.printStackTrace();
//            logger.info("没有点击元素");
//        }

    }

    public String getText(By by){
        WebElement ele = findElement(by);
        String text = ele.getText();
        logger.info("获取的内容是："+text);
        return text;
    }

    public void assertPage(String page){
        String actual = driver.getTitle();
        try {
            Assert.assertEquals(page,actual);

        }
        catch (AssertionError e){
            e.printStackTrace();
            logger.error("实际是："+actual);
        }
        logger.info("是预期页面");
    }
    public boolean isExist(By element){
        try{
            driver.findElement(element);
            return true;
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("不存在");
        }
        return false;
    }

    public void assertForText(String actual,String excepted){
        try {
            Assert.assertEquals(actual,excepted);
        }catch (AssertionError e){
            e.printStackTrace();
            logger.error("实际是："+actual);
        }
        logger.info("是预期页面");
    }
}
