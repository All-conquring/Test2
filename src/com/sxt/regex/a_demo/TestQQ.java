package com.sxt.regex.a_demo;
/**
 * ����1������һ�����ܶ�QQ�Ž���У�� 
        Ҫ�󣺳���5-15��ֻ���Ǵ����֣�0���ܿ�ͷ
        
        ������ʽ���ڲ��� �ַ�������
 * ͨ��һЩ�ض��ķ��������ֵ�
 * ��������Ϊ������������ʽ������ҪѧϰһЩ���š�
 * 
 * ȱ�㣺���˴��룬���ɶ��Բ�
 * 
 * JDK_API6.0.CHM
        
 * @author enbo
 * @date 2018��3��8��
 */
public class TestQQ {

	public static void main(String[] args) {
		//1
		String qq = "1123311233112";
		//checkQQ(qq);
		
		
		//��������ʽ��ʵ��
		//  \\d  == [0-9]
		String regex = "[1-9][0-9]{4,14}";
		//String regex = "[1-9]\\d{4,14}";
		
		boolean flag = qq.matches(regex);
		if(flag){
			System.out.println("��ϲ�㣡QQ������ȷ");
		}else{
			System.out.println("QQ�����Ϲ���");
		}
		

	}
	
	public static void checkQQ(String qqNum){
		//1.���жϳ���  ""
		if(qqNum != null){
			if(qqNum.length() >=5 && qqNum.length()<=15){
				if(qqNum.startsWith("0")){
					System.out.println("QQ������0��ͷ");
				}else{
					try{
						Long.parseLong(qqNum);
						System.out.println("��ϲ�㣡QQ������ȷ");
					}catch(NumberFormatException ex){
						System.out.println("QQֻ���Ǵ�����");
					}
				}
			}else{
				System.out.println("QQ���Ȳ�����");
			}
		}else{
			System.out.println("QQ����Ϊ��");
		}
		
	}
	
	
	

}
