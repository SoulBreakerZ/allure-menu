package com.citi.sgway.util.allure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@Tag("UnitTest")
@ExtendWith(MockitoExtension.class)
public class MenuTest {

    private static final Logger LOGGER = LogManager.getLogger(MenuTest.class);

    @Test
    public void makeTest(){

        LOGGER.info("INIT TEST");
        Assertions.assertTrue(1+1 == 2);
    }
}
