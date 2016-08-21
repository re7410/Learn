package org.iii.www_abc;
import java.io.*;
public class P155_04 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("請輸入5個人的分數:");

		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			String str = br.readLine();
			 a[i] = Integer.parseInt(str);
			// 輸入並顯示輸入值
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("第" + (i + 1) + "個人的分數是" + a[i] + "分。");
			// 描述第幾人分數為多少
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp; // temp上面有 int過了
					// 由高至低作排序 氣泡排序法
					
				}

			}
		}
		System.out.println("最高分是" + a[0] + "分。");
	}
}
