package com.sxt.regex.b_exercise;
/**
 * ����1�����ƿڳԣ�����...����...��Ҫ...ҪҪҪҪ...ҪҪҪҪ...ѧѧѧѧѧ...������....�̳̳̳�
 * @author enbo
 * @date 2018��3��8��
 */
public class Demo1 {

	public static void main(String[] args) {
		//1
       String info = "����...����...��Ҫ...ҪҪҪҪ...ҪҪҪҪ...ѧѧѧѧѧ...������....�̳̳̳�";
	
       info = info.replaceAll("\\.", "");
       
       info = info.replaceAll("(.)\\1+", "$1");
       
       System.out.println(info);
	
	}

}
