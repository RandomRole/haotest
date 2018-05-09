import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.pageFabiao;
import pageHelper.HelperFabiao;
import pageHelper.HelperHuifu;
import pageHelper.HelperLoginPage;
import testcase.BasicLoginCase;
import util.SeleniumUtil;

/**
 * Created by delldell on 2018/5/8.
 */
public class MoRenFabiao extends BasicLoginCase{


    @Test
    public void faBiao()  {
        //默认发帖
        HelperFabiao.FaBiao(seleniumUtil,"hello world","hello");
      //  Thread.sleep(3000);

        //默认回帖
        HelperHuifu.Huifu(seleniumUtil,"enen");
    }


}
