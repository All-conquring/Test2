package com.sxt.regex.a_demo;
/**
 * 
 * @author enbo
 * @date 2018年3月8日
 * 
 * JDK API 文档
 * [abc]    a、b 或 c（简单类）       
 * [^abc] 任何字符，除了 a、b 或 c（否定） 
 * [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
 * [A-Z]
 * [a-d[m-p]]   a-d  m-p == abcdmnop
 * [a-z&&[def]]  d、e 或 f（交集）
 * [a-z&&[^bc]] ==  [ad-z]
 * [a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去） 
 * 
 * 
 * 
 */
public class RegexDemo2 {

	public static void main(String[] args) {
		//1
		 String str ="aooooooooob";
		 //String regex = "ao?b";//一次或一次也没有
		 //String regex = "ao*b";//零次或多次
		 //String regex = "ao+b";//一次或多次
		 //String regex = "ao{4}b";//恰好 n 次
		 //String regex = "ao{4,}b";//至少4次  至多没有限制
		 String regex = "ao{4,8}b";//至少4次  至多8次   [4,8]
		 
		 System.out.println(str.matches(regex));
		 

	}

}
