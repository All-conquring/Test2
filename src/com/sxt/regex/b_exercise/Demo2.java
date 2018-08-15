package com.sxt.regex.b_exercise;

import java.util.TreeSet;

/**
 * 需求2：对ip地址排序（看情况讲解/代码直接讲解演示）
 * 
 * 
 * @author enbo
 * @date 2018年3月8日
 */
public class Demo2 {

	public static void main(String[] args) {
		//1.
	  String ipstr = "192.168.10.55 127.0.0.1 3.3.3.3 105.7.11.65";
	 
	// 1.为了让ip可以按照字符串顺序比较，只要让ip的每一段的位数相同。
	// 所以，补零，按照每一位所需最多0进行补充，每一段都加两个0.
	  ipstr = ipstr.replaceAll("(\\d+)", "00$1");
	// 然后每一段保留数字3位
	  ipstr = ipstr.replaceAll("0*(\\d{3})", "$1");
	  System.out.println(ipstr);
	  
	  // 分割存放在数组中
	  String [] arr = ipstr.split(" +");
	  
	  // 把数据保存到有序的集合中
	  TreeSet<String> ts = new TreeSet<String>();
	  for (String string : arr) {
		//System.out.println(string);
		ts.add(string);
	  }
	  
	  //输出 集合中的数据
	  for (String ip : ts) {
		 System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
	  }

	}

}
