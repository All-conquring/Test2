package com.sxt.regex.b_exercise;
/**
 * ���ʼ���ַУ��
 * 7236452@qq.com
 * xienbo@sina.com
 * _enbo315@163.com.cn
 * enbo@gmail.cn
 * enbo@gmail.gov.cn
 * 
 * 
 * 
 * �ֶδ���
 * 
 * @author enbo
 * @date 2018��3��8��
 */
public class Demo3 {

	public static void main(String[] args) {
		//1.  enbo@gmail.gov.cn
		String mail = "7236452@sina.com.ab";
		//String regex = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}";
		String regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1   ���飺��ͳ����  ƥ��ĸ���
		boolean flag = mail.matches(regex);
        System.out.println(flag);
	}

}
