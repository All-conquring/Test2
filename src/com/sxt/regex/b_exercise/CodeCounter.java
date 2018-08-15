package com.sxt.regex.b_exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * ͳ��ָ���ļ����µ�javaԴ�ļ��Ĵ�������
 * @author enbo
 *
 */
public class CodeCounter {
	
	static long normalLines = 0;//������
	static long commentLines = 0;//ע����
	static long whiteLines = 0;//�հ���
	
	public static void main(String[] args) {
		//1.����ļ���
		File f = new File("C:\\javacode");
		
		//2.������ļ����е� java�ļ�
		File[] codeFiles = f.listFiles();
		for(File child : codeFiles){
			if(child.getName().matches(".*\\.java$")) {// $������β
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
				line = line.trim();//ȥ�� ע��ǰ�� tab����
				if(line.matches("^[\\s&&[^\\n]]*$")) {//ƥ��հ���
					whiteLines ++;
				} else if (line.startsWith("/*") && !line.endsWith("*/")) {//ƥ��ע�Ϳ�ʼ
					commentLines ++;
					comment = true;	
				} else if (line.startsWith("/*") && line.endsWith("*/")) {
					commentLines ++;
				} else if (true == comment) {
					commentLines ++;
					if(line.endsWith("*/")) {//ƥ��ע�ͽ���
						comment = false;
					}
				} else if (line.startsWith("//")) {
					commentLines ++;//ƥ�䵥��ע��
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