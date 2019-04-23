package com.eden.ibn.crawler.news;

import com.eden.ibn.crawler.common.CommonBean;

/**
 * 新闻类的实体
 */
public class NewsBean extends CommonBean {

    public String uuid;     //


    public String currentTime;     //当前时间，指抓取时间

    /**
     * 热词下的相关信息
     */
    //TODO 是否为list
    public String contentTime;     //内容时间，指从数据中解析出的时间
    public String title;        //标题
    public String content;      //内容
    public String source;       //来源
    public String author;       //作者
    public String type;         //类型

}
