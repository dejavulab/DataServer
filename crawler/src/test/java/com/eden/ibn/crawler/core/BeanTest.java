package com.eden.ibn.crawler.core;

import com.eden.ibn.crawler.hotkey.HotKeyBean;
import org.junit.Test;

public class BeanTest {

    @Test
    public void test() {
        HotKeyBean bean = new HotKeyBean();
        bean.getContent();
        bean.getUuid();
    }
}
