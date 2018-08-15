package com.sxt.regex.b_exercise;
/**
 * 对邮件地址校验
 * 7236452@qq.com
 * xienbo@sina.com
 * _enbo315@163.com.cn
 * enbo@gmail.cn
 * enbo@gmail.gov.cn
 * 
 * 
 * 
 * 分段处理
 * 
 * @author enbo
 * @date 2018年3月8日
 */
public class Demo3 {

	public static void main(String[] args) {
		//1.  enbo@gmail.gov.cn
		String mail = "7236452@sina.com.ab";
		//String regex = "[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}";
		String regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1   建议：笼统定义  匹配的更宽泛
		boolean flag = mail.matches(regex);
        System.out.println(flag);
	}

}
