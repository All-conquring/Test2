package com.sxt.regex.b_exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 统计指定文件夹下的java源文件的代码行数
 * @author enbo
 *
 */
public class CodeCounter {
	
	static long normalLines = 0;//正常行
	static long commentLines = 0;//注释行
	static long whiteLines = 0;//空白行
	
	public static void main(String[] args) {
		//1.获得文件夹
		File f = new File("C:\\javacode");
		
		//2.获得子文件夹中的 java文件
		File[] codeFiles = f.listFiles();
		for(File child : codeFiles){
			if(child.getName().matches(".*\\.java$")) {// $代表结尾
				parse(child);
			}
		}
		
		System.out.println("normalLines:" + normalLines);
		System.out.println("commentLines:" + commentLines);
		System.out.println("whiteLines:" + whiteLines);
		
	}

	private static void parse(File f) {
		BufferedReader br = null;
		boolean comment = false;
		try {
			br = new BufferedReader(new FileReader(f));
			String line = "";
			while((line = br.readLine()) != null) {
				line = line.trim();//去掉 注释前的 tab换行
				if(line.matches("^[\\s&&[^\\n]]*$")) {//匹配空白行
					whiteLines ++;
				} else if (line.startsWith("/*") && !line.endsWith("*/")) {//匹配注释开始
					commentLines ++;
					comment = true;	
				} else if (line.startsWith("/*") && line.endsWith("*/")) {
					commentLines ++;
				} else if (true == comment) {
					commentLines ++;
					if(line.endsWith("*/")) {//匹配注释结束
						comment = false;
					}
				} else if (line.startsWith("//")) {
					commentLines ++;//匹配单行注释
				} else {
					normalLines ++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
