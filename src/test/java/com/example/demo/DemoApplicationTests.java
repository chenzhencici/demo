package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private static final Log log = LogFactory.getLog(DemoApplicationTests.class);

    @Test
    public void contextLoads() {

        log.trace("trace 级别的日志");
        log.debug("debug 级别的日志");
        log.info("info 级别的日志");
        log.warn("warn 级别的日志");
        log.error("error 级别的日志");

    }

}
