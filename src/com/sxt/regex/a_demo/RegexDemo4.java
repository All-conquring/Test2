package com.sxt.regex.a_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**

ҵ�񣺻�ȡ�������ַ���ɵĵ���
String str = "da jia hao,ming tian bu fang jia";

Pattern ָ��Ϊ�ַ�����������ʽ�������ȱ�����Ϊ�����ʵ����Ȼ�󣬿ɽ��õ���ģʽ���ڴ��� Matcher ��
������������ʽ���ö�������������ַ�����ƥ�䡣ִ��ƥ�����漰������״̬��פ����ƥ�����У���
�Զ��ƥ�������Թ���ͬһģʽ�� 
	
��1�������������ж���ķ�װ
     Pattern p = Pattern.compile("a*b");
��2��ͨ����������matcher�������ַ������������ȡҪ���ַ���������ƥ��������Matcher��
     Matcher m = p.matcher("aaaaab");
��3��ͨ��Matcherƥ��������ķ������ַ������в�����
     boolean b = m.matches();

ע�⣺�������Ҫ��ȡ�����������������ݣ�һ������ Pattern

 * @author enbo
 * @date 2018��3��8��
 */
public class RegexDemo4 {

	public static void main(String[] args) {
		//1.
		String str = "da jia hao,ming tian bu fang jia";
		String regex = "\\b[a-zA-Z]{3}\\b";       //  \\b Ϊ���ʱ߽�--------------->��˼
		Pattern p = Pattern.compile(regex);     //������ʽ�ı����ʾ��ʽ
		
		Matcher m = p.matcher(str);   //  ͨ������ Pattern �� character sequence ִ��ƥ�����������
		
		//boolean flag = m.matches();// �ж��Ƿ����
		//System.out.println(flag);
		//boolean flag = m.find();
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.start()+" - "+m.end());
			//flag = m.find();
		}
		
	}

}
