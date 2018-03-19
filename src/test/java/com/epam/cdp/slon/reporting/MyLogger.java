package com.epam.cdp.slon.reporting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {

    private static final Logger LOGGER = LogManager.getLogger(MyLogger.class);

    public static void info(String message) {
        LOGGER.info(message);
    }

    public static void error(String message, Throwable throwable) {
        LOGGER.error(message, throwable);
    }

    public static void debug(String message) {
        LOGGER.debug(message);
    }

}