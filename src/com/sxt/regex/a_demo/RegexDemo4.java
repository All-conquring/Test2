package com.sxt.regex.a_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**

业务：获取由三个字符组成的单词
String str = "da jia hao,ming tian bu fang jia";

Pattern 指定为字符串的正则表达式必须首先被编译为此类的实例。然后，可将得到的模式用于创建 Matcher 对
象，依照正则表达式，该对象可以与任意字符序列匹配。执行匹配所涉及的所有状态都驻留在匹配器中，所
以多个匹配器可以共享同一模式。 
	
（1）将正则规则进行对象的封装
     Pattern p = Pattern.compile("a*b");
（2）通过正则对象的matcher方法将字符串相关联。获取要对字符串操作的匹配器对象Matcher。
     Matcher m = p.matcher("aaaaab");
（3）通过Matcher匹配器对象的方法对字符串进行操作。
     boolean b = m.matches();

注意：如果是需要获取符合正则条件的数据，一般是用 Pattern

 * @author enbo
 * @date 2018年3月8日
 */
public class RegexDemo4 {

	public static void main(String[] args) {
		//1.
		String str = "da jia hao,ming tian bu fang jia";
		String regex = "\\b[a-zA-Z]{3}\\b";       //  \\b 为单词边界--------------->意思
		Pattern p = Pattern.compile(regex);     //正则表达式的编译表示形式
		
		Matcher m = p.matcher(str);   //  通过解释 Pattern 对 character sequence 执行匹配操作的引擎
		
		//boolean flag = m.matches();// 判断是否符合
		//System.out.println(flag);
		//boolean flag = m.find();
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.start()+" - "+m.end());
			//flag = m.find();
		}
		
	}

}
