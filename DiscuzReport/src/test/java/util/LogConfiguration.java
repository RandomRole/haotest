package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by delldell on 2018/5/8.
 */
public class LogConfiguration {
    public static void initLog(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");

        String data = dateFormat.format(new Date());

        final String logFilePath = "./Log/"+data+".log";

        Properties pro = new Properties();

        pro.setProperty("log4j.rootLogger","info,toConsole,toFile");
        pro.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        pro.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm}] [%p] %m%n");

        pro.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        pro.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        pro.setProperty("log4j.appender.toFile.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm}] [%p] %m%n");
        pro.setProperty("log4j.appender.toFile.file",logFilePath);

        PropertyConfigurator.configure(pro);
    }
}
