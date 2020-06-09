package com.leiyang;


import org.apache.log4j.Logger;

public class HelloWorld {
//    static Logger logger = Logger.getLogger("A1");
    static Logger logger = Logger.getRootLogger();

    public static void main(String args[]) {
        logger.debug("this is debug");
        logger.info("this is info");
        System.out.println("hello world!");
    }
}
