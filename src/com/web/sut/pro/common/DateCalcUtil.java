package com.web.sut.pro.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;


/*
 * 日期计算�?
 * @param dt 日期字符�?格式 yyyy-MM-dd 
 * @param num 增加的天�?天数不限
 * @return 增加天数后的日期 格式yyyy-MM-dd
 * */
public class DateCalcUtil {
	
	public String datecalc(String dt, int num){	
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date myDate = formatter.parse(dt);
			Calendar c = Calendar.getInstance(); 
			c.setTime(myDate);
			c.add(Calendar.DATE, num);
			myDate = c.getTime(); 
			return formatter.format(myDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return "error";
		}
	}
	
}
/*
 * Date dt = new Date();
 * DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 * String time = df.format(dt.getTime()+i*24*60*60*1000);
 * 以上三段代码也可以达到在当前日期上添加日�? i代表多少天�?
 * */
