package cn.ksdshpx.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/3/6
 * Time: 14:40
 * Description:Log4j1.x使用演示
 */
public class Log4jDemo1 {
    public static void main(String[] args) {
        //创建日志记录工具
        Logger logger = LogManager.getLogger(Log4jDemo1.class);
        logger.debug("this is debug message!");
        logger.info("this is info message!");
        logger.warn("this is warn message!");
        logger.error("this is error message!");
    }
}
