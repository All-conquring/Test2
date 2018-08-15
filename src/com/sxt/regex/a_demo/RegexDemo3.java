package com.sxt.regex.a_demo;

import java.util.regex.Pattern;

/**
 * �ֻ�У��
 * ������ʽ���ַ����ĳ���������
   * 1��ƥ��
   *    ��ʵʹ�õľ���String���е�matches()����
   * 2���и�
   *    ��ʵʹ�õľ���String���е�split()����
   * 3���滻
   *    ��ʵʹ�õľ���String���е�replaceAll()����
   * 4����ȡ

          ���ܵ㣺��ʵʹ�õľ���String���е�matches()����
 * 
 * @author enbo
 * @date 2018��3��8��
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		//TestMatches();
		//TestSplit();
		TestReplaceAll();
		
	}
	
	
	/**
	   * 3���滻
	   *    ��ʵʹ�õľ���String���е�replaceAll()����
	   *    
	 */
	private static void TestReplaceAll() {
		String str = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
		//str = str.replaceAll("(.)\\1+", "#");//ʹ�� # �滻
		str = str.replaceAll("(.)\\1+", "$1");//ʹ�õ��������滻�������������
		System.out.println(str);
		
		System.err.println("------------------------");
		String tel = "15856567788";// 158****7788
		tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
		System.out.println(tel);
		
	}
	
	/**
	 * 2���и�
   *    ��ʵʹ�õľ���String���е�split()����
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
		// ע��   Ҫ��  ת�����
		String str2 = "zhangsan.xiaoqiang.zhaoliu";
		String[] arr2 = str2.split("\\.");
		System.out.println(arr2.length);
		for (String strs : arr2) {
			System.out.println(strs);
		}
		
		System.out.println("------------------------");
		//��  (�е���� - ѡ��)
		String str3 = "zhangsanttttxiaoqiangmmmmmmzhaoliu";
		//String[] arr3 = str3.split("t+|m+");
		
		// ��һλ������Ҫ�����ã�������ĸ�ǰ�����һ���ģ�  tttt  mmmmmm   1�����һ��  1����ͨ����  ���Լ� \\1
		// ֱ�������ֱ�� ������    1 �� �����һ��
		String[] arr3 = str3.split("(.)\\1+");//��
		for (String strs : arr3) {
			System.out.println(strs);
		}
	}
	
	
	
    /**
     *  1��ƥ��
   *    ��ʵʹ�õľ���String���е�matches()����
   *    �����ֻ�������֤
     */
	private static void TestMatches() {
		//1.�ֻ�
		String num = "15388965864";
		
		//String regex = "^1[345789][0-9]{9}";
		String regex = "^1[345789]\\d{9}";
		
		System.out.println(num.matches(regex));
		System.out.println("-------------------");
		//2.����  
		//   ����-7/8���ֵ绰����     021-88567889  021-8856788
		//   0731-88567889  0731-8856788
		String zjNum = "021-68896557";
		String regex2 = "^0[1-9][0-9]{1,2}-[1-9][0-9]{6,7}";
		System.out.println(zjNum.matches(regex2));
		//boolean b = Pattern.matches("a*b", "aaaaab");
		//Pattern.matches(regex2, zjNum);
	}

}
