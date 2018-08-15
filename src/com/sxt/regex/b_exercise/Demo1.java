package com.sxt.regex.b_exercise;
/**
 * 需求1：治疗口吃：我我...我我...我要...要要要要...要要要要...学学学学学...编编编编编....程程程程
 * @author enbo
 * @date 2018年3月8日
 */
public class Demo1 {

	public static void main(String[] args) {
		//1
       String info = "我我...我我...我要...要要要要...要要要要...学学学学学...编编编编编....程程程程";
	
       info = info.replaceAll("\\.", "");
       
       info = info.replaceAll("(.)\\1+", "$1");
       
       System.out.println(info);
	
	}

}
