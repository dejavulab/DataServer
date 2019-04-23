package com.eden.ibn.crawler.hotkey;


import com.eden.ibn.crawler.common.CommonBean;
import lombok.Data;

/**
 * 公共热词接口
 */
@Data
public class HotKeyBean extends CommonBean {


    private String hotKey;       //热词

    /**
     * 热词下的相关信息
     */
    //TODO 是否为list
    private String contentTime;     //内容时间，指从数据中解析出的时间
    private String title;        //标题
    private String content;      //内容
    private String author;       //作者


}
