package com.sxt.regex.b_exercise;

import java.util.TreeSet;

/**
 * ����2����ip��ַ���򣨿��������/����ֱ�ӽ�����ʾ��
 * 
 * 
 * @author enbo
 * @date 2018��3��8��
 */
public class Demo2 {

	public static void main(String[] args) {
		//1.
	  String ipstr = "192.168.10.55 127.0.0.1 3.3.3.3 105.7.11.65";
	 
	// 1.Ϊ����ip���԰����ַ���˳��Ƚϣ�ֻҪ��ip��ÿһ�ε�λ����ͬ��
	// ���ԣ����㣬����ÿһλ�������0���в��䣬ÿһ�ζ�������0.
	  ipstr = ipstr.replaceAll("(\\d+)", "00$1");
	// Ȼ��ÿһ�α�������3λ
	  ipstr = ipstr.replaceAll("0*(\\d{3})", "$1");
	  System.out.println(ipstr);
	  
	  // �ָ�����������
	  String [] arr = ipstr.split(" +");
	  
	  // �����ݱ��浽����ļ�����
	  TreeSet<String> ts = new TreeSet<String>();
	  for (String string : arr) {
		//System.out.println(string);
		ts.add(string);
	  }
	  
	  //��� �����е�����
	  for (String ip : ts) {
		 System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
	  }

	}

}
