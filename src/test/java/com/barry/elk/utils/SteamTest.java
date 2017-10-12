package com.barry.elk.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @author: hants
 * @create: 2017/10/12 11:41
 * desc:
 */
public class SteamTest {

    private static final Logger logger = LoggerFactory.getLogger(SteamTest.class);

    @Test
    public void testPoint(){
        logger.info("=====111======>"+ File.separatorChar);
        logger.info("=====111======>"+ File.separator);
        logger.info("=====222======>"+ File.pathSeparatorChar);
        logger.info("=====333======>"+ File.pathSeparator);
    }

}