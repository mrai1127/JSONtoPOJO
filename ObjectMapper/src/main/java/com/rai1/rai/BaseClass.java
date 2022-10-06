package com.rai1.rai;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class BaseClass {
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;
    
    static WebDriver driver = null;
    public static Logger logger = null;
    
    public static void loadLog4j() {
    	String log4Jpath = System.getProperty("user.dir") + "/log4j.properties";
    	PropertyConfigurator.configure(log4Jpath); 
    }
}
