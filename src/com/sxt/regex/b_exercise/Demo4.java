package com.sxt.regex.b_exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {

	public static void main(String[] args) throws Exception {
//		//1.本地
//		BufferedReader br = new BufferedReader(new FileReader("c:\\mail.html"));
		
		//web版本
		URL url = new URL("www.baidu.com");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String str = "";
		while((str = br2.readLine()) != null){
			checkEmail(str);
		}
		
		br2.close();
	}
	
	public static void checkEmail(String info){
		//1@1.1   建议：笼统定义  匹配的更宽泛
		String regex = "\\w+@\\w+(\\.\\w+)+";
		Pattern p = Pattern.compile(regex);
		//2
		Matcher match = p.matcher(info);
		while(match.find()){
			System.out.println(match.group());
		}
	}
}
