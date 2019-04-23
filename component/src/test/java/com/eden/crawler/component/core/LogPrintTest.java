package com.eden.crawler.component.core;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class LogPrintTest {


    @Test
    public void logFormat() {
        log.info("test format , {}","info");
        log.debug("test format ,{}", "格式");
    }
}
