package org.iii.www_abc;
import java.io.*;

public class P47_03 {

	public static void main(String[] args)throws IOException {
		System.out.println("你今年幾歲?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		System.out.println("你今年"+ a +"歲。");
		
		
		
	}

}
