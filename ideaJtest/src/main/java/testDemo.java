/**
 * Created by delldell on 2018/4/20.
 * 1找驱动的位置
 * 2设置系统键值对
 * 3创建一个驱动
 * 4让驱动去找对应的页面
 * 5找对应的元素
 * 6进行具体的操作
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDemo {
    public static void main(String[] args) throws InterruptedException{
        //1找驱动的位置
        String path="D:\\测试\\linux\\chrome&driver\\chromedriver.exe";
        //2设置系统键值对
        System.setProperty("webdriver.chrome.driver","D:\\测试\\linux\\chrome&driver\\chromedriver.exe");
        //3实例化
        WebDriver chDv = new ChromeDriver();
        //4让驱动去找对应的页面
        chDv.get("F:\\谷歌\\light\\index.html");
        //5找对应的元素
        WebElement element = chDv.findElement(By.className("switch"));
        //6操作元素
        for(int i=1;i<=5;i++){
            Thread.sleep(2000);
            element.click();
        }


    }
}
