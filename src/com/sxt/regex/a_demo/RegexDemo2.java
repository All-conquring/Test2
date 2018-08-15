package com.sxt.regex.a_demo;
/**
 * 
 * @author enbo
 * @date 2018��3��8��
 * 
 * JDK API �ĵ�
 * [abc]    a��b �� c�����ࣩ       
 * [^abc] �κ��ַ������� a��b �� c���񶨣� 
 * [a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
 * [A-Z]
 * [a-d[m-p]]   a-d  m-p == abcdmnop
 * [a-z&&[def]]  d��e �� f��������
 * [a-z&&[^bc]] ==  [ad-z]
 * [a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ�� 
 * 
 * 
 * 
 */
public class RegexDemo2 {

	public static void main(String[] args) {
		//1
		 String str ="aooooooooob";
		 //String regex = "ao?b";//һ�λ�һ��Ҳû��
		 //String regex = "ao*b";//��λ���
		 //String regex = "ao+b";//һ�λ���
		 //String regex = "ao{4}b";//ǡ�� n ��
		 //String regex = "ao{4,}b";//����4��  ����û������
		 String regex = "ao{4,8}b";//����4��  ����8��   [4,8]
		 
		 System.out.println(str.matches(regex));
		 

	}

}
