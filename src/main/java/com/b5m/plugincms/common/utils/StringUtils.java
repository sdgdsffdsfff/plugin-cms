package com.b5m.plugincms.common.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.DecimalFormat;

/**
 * @Company B5M.com
 * @description
 * 操作字符串的 工具类
 * @author echo
 * @since 2013-7-12
 * @email echo.weng@b5m.com
 */
public class StringUtils {
	public static String fillNull(String str){
		return (str == null || isNaN(str) ? "" : str).trim(); 
	}
	
	public static String fillNull(Object o){
		if(o == null) return "";
		return fillNull(o.toString());
	}
	
	public static BigDecimal toBigDecimal(Object o){
		if(o == null) return null;
		if(isEmpty(o.toString())) return null;
		return new BigDecimal(o.toString());
	}
	
	public static boolean isNaN(String str){
		if("NaN".equals(str)) return true;
		return false;
	}
	
	public static String toStrNotNull(Object o){
		if(null != o) return o.toString();
		return "";
	}
	
	public static boolean isEmpty(String str) {
		if(str == null) return true;
		str = str.trim();
		return "".equals(str);
	}
	
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
	
	public static String toString(BigDecimal value){
		if(value == null) return "0.00"; 
		return toCurrencyString(value.toString());
	}
	
	/**
	 * description：
	 * 转化为币种
	 * @param value
	 * @return
	 * @date 2012-8-15
	 * @author xiuqing.weng
	 */
	public static String toCurrencyString(String value){
		if(value == null) return "0.00";
		DecimalFormat decimalFormat = new DecimalFormat("###,##0.00");
		return decimalFormat.format(Double.valueOf(value));
	}
	
	/**
	 * description：
	 * 通过文件路径地址获取文件名
	 * @param filePath
	 * @return
	 * @date 2012-8-14
	 * @author xiuqing.weng
	 */
	public static String getFileName(String filePath){
		String url = filePath;
		if(url.indexOf("\\") >= 0) url = url.substring(url.lastIndexOf("\\") + 1);//如果是以\\结尾的按\\进行截取
		if(url.indexOf("/") >= 0) url = url.substring(url.lastIndexOf("/") + 1);//如果是以/结尾的按/进行截取
		try {
			return URLDecoder.decode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return url;
		}
	}
	
}
