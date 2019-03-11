package cn.ksdshpx.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/3/11
 * Time: 11:16
 * Description:各种日志附加器的演示
 */
public class Log4jDemo3 {
    public static void main(String[] args) {
        //创建日志记录工具
        Logger logger = LogManager.getLogger(Log4jDemo3.class);
        for (int i = 0; i < 100; i++) {
            logger.trace("第" + i + "条---trace message");
            logger.debug("第" + i + "条debug message");
            logger.info("第" + i + "条info message");
            logger.warn("第" + i + "条warn message");
            logger.error("第" + i + "条error message");
            logger.fatal("第" + i + "条fatal message");
        }
    }
}
