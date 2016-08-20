package org.iii.www_abc;

import java.io.*;

public class P53_03 {

	public static void main(String[] args)throws IOException {
		
		System.out.println("請輸入兩個整數:");
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		 int a = Integer.parseInt(str1);
		 int b = Integer.parseInt(str2);
		//在此string就一定要轉換為int型別,才可以對數值做運算
		
		System.out.println("圓周率的值是；" + (a+b)+ "。"); 
	}

}
