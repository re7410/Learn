package org.iii.www_abc;

import java.io.*;

public class P47_04 {

	public static void main(String[] args)throws IOException {
		
		System.out.println("請輸入元週率的值:");
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str = br.readLine();
		//為何string不須轉換為int就可以輸出數值呢?
		
		System.out.println("圓周率的值是；" + str + "。"); 
	}

}
