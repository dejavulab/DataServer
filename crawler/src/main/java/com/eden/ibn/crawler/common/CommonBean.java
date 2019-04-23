package com.eden.ibn.crawler.common;


import lombok.Data;

/**
 * bean的共有属性
 */
@Data
public class CommonBean {

    private String uuid;     //唯一id
    private String currentTime;     //当前时间，指抓取时间

    private String source;  //来源

}
