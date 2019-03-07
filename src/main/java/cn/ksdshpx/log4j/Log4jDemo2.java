package cn.ksdshpx.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2019/3/7
 * Time: 11:16
 * Description:各种日志附加器的演示
 */
public class Log4jDemo2 {
    public static void main(String[] args) {
        //创建日志记录工具
        Logger logger = LogManager.getLogger(Log4jDemo2.class);
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.fatal("fatal message");
    }
}
