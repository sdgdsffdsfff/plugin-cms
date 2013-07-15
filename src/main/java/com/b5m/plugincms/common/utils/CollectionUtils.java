package com.b5m.plugincms.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * file name：CollectionUtils.java
 * description：
 * <br/>
 * <br/>
 * <font>
 * 这个类是用来处理List Map等集合的一个工具类
 * </font>
 * <br/>
 * <br/>
 * author: echo;
 * JDK version: <1.6.0> 
 * project : plugin-cms <1.0> <br>
 * modified history  <br>
 *  date           | author  | desc <br>
 */
public class CollectionUtils {
	
	public static <T> List<T> newList(){
		return new ArrayList<T>();
	}
	
	public static <T> List<T> newList(T... ts){
		List<T> list = newList();
		for(T t : ts){
			list.add(t);
		}
		return list;
	}
	
	public static <K, V> Map<K, V> newMap(){
		return new HashMap<K, V>();
	}
	
	public static <K, V> Map<K, V> newMap(K k, V v){
		Map<K, V> map = newMap();
		map.put(k, v);
		return map;
	}
	
	/**
	 * description：
	 * 获取一个List集合中以pageIndex为开始  pageSize大小的子集合
	 * @param list
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	public static <T> List<T> subPage(List<T> list, int pageSize, int pageIndex){
		int totalSize = list.size();
		int totalPage = totalSize/pageSize;
		if(totalSize % pageSize != 0){
			totalPage = totalPage + 1;
		}
		int toIndex = pageSize * pageIndex;
		if(totalSize < toIndex){
			toIndex = totalSize;
		}
		List<T> sublist = new ArrayList<T>();
		//如果开始的index 比 总数要大 则直接返回为空
		int fromIndex = pageSize * (pageIndex-1);
		if(totalSize < fromIndex){
			return sublist;
		}else{
			for(int i = pageSize * (pageIndex-1); i < toIndex; i++){
				sublist.add(list.get(i));
			}
			return sublist;
		}
	}
	/**
	 * description：
	 * 获取一个List集合中以pageIndex为开始  pageSize大小的子集合
	 * @param list
	 * @param pageSize
	 * @param pageIndex
	 * @return
	 */
	public static <T> List<T> subList(List<T> list, int startIndex, int endIndex){
		int totalSize = list.size();
		List<T> sublist = new ArrayList<T>();
		if(totalSize < startIndex) return sublist;
		if(totalSize < endIndex) endIndex = totalSize;
		if(endIndex < startIndex) return sublist;
		for(int i = startIndex; i < endIndex; i++){
			sublist.add(list.get(i));
		}
		return sublist;
	}
	
	/**
	 * description：
	 * 获取集合以pageSize为每页大小的 总页数
	 * @param list
	 * @param pageSize
	 * @return
	 */
	public static int getTotalPage(List list, int pageSize){
		int totalSize = list.size();
		int totalPage = totalSize/pageSize;
		if(totalSize % pageSize != 0){
			totalPage = totalPage + 1;
		}
		return totalPage;
	}
	
	/**
	 * description：
	 * 判断 o这个对象是否是List对象
	 * @param o
	 * @return
	 */
	public static boolean isList(Object o){
		if(o.getClass().getSimpleName().equals(List.class.getSimpleName())) return true;
		for(Class cls : o.getClass().getInterfaces()){
			if(cls.getSimpleName().equals(List.class.getSimpleName())) return true;
		}
		return false;
	}
	
	/**
	 * description：
	 * 将map 转化成 List
	 * @param map
	 * @return
	 * @date 2012-7-28
	 * @author xiuqing.weng
	 */
	public static <K, V> List<Map<K, V>> toList(Map<K, V> map){
		List<Map<K, V>> list = newList();
		for(K k : map.keySet()){
			Map<K, V> m = newMap();
			m.put(k, map.get(k));
			list.add(m);
		}
		return list;
	}
	
	/**
	 * description：
	 * 取第一个,如果没有,则返回null
	 * @param ts
	 * @return
	 */
	public static <T> T first(List<T> ts){
		if(ts.isEmpty()) return null;
		return ts.get(0);
	}
}
