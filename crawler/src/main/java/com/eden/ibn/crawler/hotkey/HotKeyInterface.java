package com.eden.ibn.crawler.hotkey;


/**
 * 热词
 * <p>
 * 此接口的实现类应该是每次调用都实例化一次
 * <p>
 * 只有{@linkplain #start()}应该被外部所调用，其他方法均应该在类内部
 */
public interface HotKeyInterface {

    /**
     * 开始方法
     */
    public void start();


    /**
     * 获得热词的内容
     */
    public String getContent();


    /**
     * 数据上传
     */
    public void upload();


    /**
     * 数据解析
     */
    public HotKeyBean parse();
}
