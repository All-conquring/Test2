package com.sxt.regex.a_demo;

import java.util.regex.Pattern;

/**
 * 手机校验
 * 正则表达式对字符串的常见操作：
   * 1、匹配
   *    其实使用的就是String类中的matches()方法
   * 2、切割
   *    其实使用的就是String类中的split()方法
   * 3、替换
   *    其实使用的就是String类中的replaceAll()方法
   * 4、获取

          技能点：其实使用的就是String类中的matches()方法
 * 
 * @author enbo
 * @date 2018年3月8日
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		//TestMatches();
		//TestSplit();
		TestReplaceAll();
		
	}
	
	
	/**
	   * 3、替换
	   *    其实使用的就是String类中的replaceAll()方法
	   *    
	 */
	private static void TestReplaceAll() {
		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
		//str = str.replaceAll("(.)\\1+", "#");//使用 # 替换
		str = str.replaceAll("(.)\\1+", "$1");//使用单个自身替换多个连续的自身
		System.out.println(str);
		
		System.err.println("------------------------");
		String tel = "15856567788";// 158****7788
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		System.out.println(tel);
		
	}
	
	/**
	 * 2、切割
   *    其实使用的就是String类中的split()方法
   *    
	 */
	private static void TestSplit() {
		String str = "zhangsan    xiaoqiang      zhaoliu";
		//String[] arr = str.split(" ");
		String[] arr = str.split(" +");
		for (String strs : arr) {
			System.out.println(strs);
		}
		
		System.out.println("------------------------");
		// 注意   要加  转义符号
		String str2 = "zhangsan.xiaoqiang.zhaoliu";
		String[] arr2 = str2.split("\\.");
		System.out.println(arr2.length);
		for (String strs : arr2) {
			System.out.println(strs);
		}
		
		System.out.println("------------------------");
		//组  (有点抽象 - 选讲)
		String str3 = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
		//String[] arr3 = str3.split("t+|m+");
		
		// 第一位的内容要被复用（即后面的跟前面的是一样的）  tttt  mmmmmm   1代表第一组  1是普通数字  所以加 \\1
		// 直接用数字编号 代表组    1 就 代表第一组
		String[] arr3 = str3.split("(.)\\1+");//组
		for (String strs : arr3) {
			System.out.println(strs);
		}
	}
	
	
	
    /**
     *  1、匹配
   *    其实使用的就是String类中的matches()方法
   *    需求：手机号码验证
     */
	private static void TestMatches() {
		//1.手机
		String num = "15388965864";
		
		//String regex = "^1[345789][0-9]{9}";
		String regex = "^1[345789]\\d{9}";
		
		System.out.println(num.matches(regex));
		System.out.println("-------------------");
		//2.座机  
		//   区号-7/8数字电话号码     021-88567889  021-8856788
		//   0731-88567889  0731-8856788
		String zjNum = "021-68896557";
		String regex2 = "^0[1-9][0-9]{1,2}-[1-9][0-9]{6,7}";
		System.out.println(zjNum.matches(regex2));
		//boolean b = Pattern.matches("a*b", "aaaaab");
		//Pattern.matches(regex2, zjNum);
	}

}
