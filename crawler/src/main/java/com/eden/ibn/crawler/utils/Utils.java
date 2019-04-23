package com.eden.ibn.crawler.utils;

import java.io.*;
import java.util.Base64;

public class Utils {

    /**
     * 将图片转换成baseUrl64的字符串
     */
    public static String ImageToBase64ByLocal(String imgFile) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理


        InputStream in = null;
        byte[] data = null;

        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFile);

            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.getUrlEncoder().encodeToString(data);
    }

    public static String toBase64UrlSafeStr(InputStream in) {
        byte[] data = null;

        // 读取图片字节数组
        try {

            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.getUrlEncoder().encodeToString(data);
    }


    public static String toBase64Url(InputStream inputStream) {
        byte[] data = null;
        try {
            data = inputStreamToByte(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Base64.getUrlEncoder().encodeToString(data);

    }

    public static byte[] inputStreamToByte(InputStream is) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(is);
        byte[] a = new byte[1000];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = bis.read(a)) != -1) {
            bos.write(a, 0, len);
        }
        bis.close();
        bos.close();
        return bos.toByteArray();
    }

}
