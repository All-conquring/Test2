package com.sxt.regex.a_demo;
/**
 * 需求1：定义一个功能对QQ号进行校验 
        要求：长度5-15，只能是纯数字，0不能开头
        
        正则表达式用于操作 字符串数据
 * 通过一些特定的符号来体现的
 * 所以我们为了掌握正则表达式，必须要学习一些符号。
 * 
 * 缺点：简化了代码，但可读性差
 * 
 * JDK_API6.0.CHM
        
 * @author enbo
 * @date 2018年3月8日
 */
public class TestQQ {

	public static void main(String[] args) {
		//1
		String qq = "1123311233112";
		//checkQQ(qq);
		
		
		//用正则表达式来实现
		//  \\d  == [0-9]
		String regex = "[1-9][0-9]{4,14}";
		//String regex = "[1-9]\\d{4,14}";
		
		boolean flag = qq.matches(regex);
		if(flag){
			System.out.println("恭喜你！QQ号码正确");
		}else{
			System.out.println("QQ不符合规则");
		}
		

	}
	
	public static void checkQQ(String qqNum){
		//1.先判断长度  ""
		if(qqNum != null){
			if(qqNum.length() >=5 && qqNum.length()<=15){
				if(qqNum.startsWith("0")){
					System.out.println("QQ不能以0开头");
				}else{
					try{
						Long.parseLong(qqNum);
						System.out.println("恭喜你！QQ号码正确");
					}catch(NumberFormatException ex){
						System.out.println("QQ只能是纯数字");
					}
				}
			}else{
				System.out.println("QQ长度不符合");
			}
		}else{
			System.out.println("QQ不能为空");
		}
		
	}
	
	
	

}
