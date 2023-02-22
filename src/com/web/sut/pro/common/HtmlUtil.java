package com.web.sut.pro.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author lkt
 * 时间 2018/9/9 16:25
 * */
public class HtmlUtil {

	private final static int CONNECT_TIMEOUT = 1000;
    private final static String DEFAULT_ENCODING = "UTF-8";
    
    public String postData(String urlStr, String data){
        return postData(urlStr, data, null);
    }
    
    private static String postData(String urlStr, String data, @SuppressWarnings({"SameParameterValue", "unused"}) String contentType) {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlStr);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            conn.setConnectTimeout(30 * CONNECT_TIMEOUT);
            conn.setReadTimeout(30 * CONNECT_TIMEOUT);
            
            //if(StringUtils.isNotBlank(contentType))
            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(), DEFAULT_ENCODING);

            if(data == null) {
                data = "";
            }

            writer.write(data); 
            writer.flush();
            writer.close();  

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), DEFAULT_ENCODING));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\r\n");
            }

            return sb.toString();
        } catch (IOException e) {

            System.out.println("HtmlUtil文件异常");
        } finally {

            try {

                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {

                System.out.println("HtmlUtil文件异常");
            }
        }
        return null;
    }
}
