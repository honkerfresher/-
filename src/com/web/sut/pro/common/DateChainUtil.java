package com.web.sut.pro.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateChainUtil {
	public Map<String, Object> getWeekDay() {
		  Map<String,Object> map = new HashMap<String,Object>();
		  Calendar cal =Calendar.getInstance();
		  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		  cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); //获取本周一的日期
		  map.put("mon", df.format(cal.getTime()));
		  //这种输出的是上个星期周日的日期，因为老外那边把周日当成第一天
		  cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		  //增加一个星期，才是我们中国人理解的本周日的日期
		  cal.add(Calendar.WEEK_OF_YEAR, 1);
		  map.put("sun", df.format(cal.getTime()));
		  return map;
	}
	public Map<String, Object> getMonthDate(){
		Map<String,Object> map = new HashMap<String,Object>();
		// 获取Calendar  
		Calendar calendar = Calendar.getInstance(); 
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd 00:00:00");  
		// 设置时间,当前时间不用设置  
		// calendar.setTime(new Date());  
		calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DATE)); 
		map.put("monthF", format.format(calendar.getTime()));
		// 设置日期为本月最大日期  
		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));  
		// 打印  
		map.put("monthL", format.format(calendar.getTime()));
		return map;
	}
	/**
   * 得到本季度第一天的日期
   * @Methods Name getFirstDayOfQuarter
   * @return Date
   */
	public Date getFirstDayOfQuarter(Date date)   {   
  	Calendar cDay = Calendar.getInstance();   
      cDay.setTime(date);
      int curMonth = cDay.get(Calendar.MONTH);
      if (curMonth >= Calendar.JANUARY && curMonth <= Calendar.MARCH){  
      	cDay.set(Calendar.MONTH, Calendar.JANUARY);
      }
      if (curMonth >= Calendar.APRIL && curMonth <= Calendar.JUNE){  
      	cDay.set(Calendar.MONTH, Calendar.APRIL);
      }
      if (curMonth >= Calendar.JULY && curMonth <= Calendar.AUGUST) {  
      	cDay.set(Calendar.MONTH, Calendar.JULY);
      }
      if (curMonth >= Calendar.OCTOBER && curMonth <= Calendar.DECEMBER) {  
      	cDay.set(Calendar.MONTH, Calendar.OCTOBER);
      }
      cDay.set(Calendar.DAY_OF_MONTH, cDay.getActualMinimum(Calendar.DAY_OF_MONTH));
      return cDay.getTime();   
	}
	/**
   * 得到本季度最后一天的日期
   * @Methods Name getLastDayOfQuarter
   * @return Date
   */
	public Date getLastDayOfQuarter(Date date)   {   
  	Calendar cDay = Calendar.getInstance();   
      cDay.setTime(date);
      int curMonth = cDay.get(Calendar.MONTH);
      if (curMonth >= Calendar.JANUARY && curMonth <= Calendar.MARCH){  
      	cDay.set(Calendar.MONTH, Calendar.MARCH);
      }
      if (curMonth >= Calendar.APRIL && curMonth <= Calendar.JUNE){  
      	cDay.set(Calendar.MONTH, Calendar.JUNE);
      }
      if (curMonth >= Calendar.JULY && curMonth <= Calendar.AUGUST) {  
      	cDay.set(Calendar.MONTH, Calendar.AUGUST);
      }
      if (curMonth >= Calendar.OCTOBER && curMonth <= Calendar.DECEMBER) {  
      	cDay.set(Calendar.MONTH, Calendar.DECEMBER);
      }
      cDay.set(Calendar.DAY_OF_MONTH, cDay.getActualMaximum(Calendar.DAY_OF_MONTH));
      return cDay.getTime();   
	}

}
