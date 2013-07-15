package com.b5m.plugincms.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * company: ShangHai HuaTeng Software System CO.,LTD.
 * file name：DateUtils.java
 * description：
 * 处理Date的一个工具类
 * create date: 2012-6-30
 * author: xiuqing.weng;
 * JDK version: <1.6.0>
 * project : SupplyChainSysPortal <1.0> <br>
 * modified history  <br>
 *  date           | author  | desc <br>
 */
public class DateUtils {
	public static final String DefaultFormate = "yyyy-MM-dd";
	
	public static Date now(){
		return new Date();
	}

	public static Date parse(String dateStr){
		return parse(dateStr, DefaultFormate);
	}

	public static Date parse(String dateStr, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			return format.parse(dateStr);
		} catch (ParseException e) {
			return null;
		}
	}

	public static String formate(Date date){
		return formate(date, DefaultFormate);
	}

	public static String formate(Date date, String pattern){
		if(date == null) return "";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

	public static Date parse(long time){
		return new Date(time);
	}

	/**
	 * 对指定的日期增加天数
	 * description：
	 * @param date
	 * @param i
	 * @return
	 * @date 2012-8-14
	 * @author zhaoyang.lv
	 */
	public static Date addDays(Date date ,int i){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(5, i);
		return c.getTime();
	}
	
	public static Date toDate(Object o) throws ParseException{
		if(o == null) return null;
		String dateStr = o.toString();
		if(StringUtils.isEmpty(dateStr)) return null;//yyyyMMdd
		String dateFormat = "yyyy-MM-dd";
		if(dateStr.length() == 8) dateFormat = "yyyyMMdd";
		if(dateStr.length() == 10) dateFormat = "yyyy-MM-dd";
		if(dateStr.length() == 19 && dateStr.indexOf("T") < 0) dateFormat = "yyyy-MM-dd HH:mm:ss";
		if(dateStr.length() == 23) dateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
		if(dateStr.indexOf("T") >= 0)  dateFormat = "yyyy-MM-dd'T'hh:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.parse(dateStr);
	}

}
