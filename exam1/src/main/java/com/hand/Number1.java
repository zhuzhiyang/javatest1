package com.hand;

import java.util.ArrayList;
import java.util.List;

public class Number1 {

	public static void main(String[] args) {
		int count = 0;
		int temp = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 101; i < 201; i++) {
			temp=0;
			for (int j = 1; j <= i; j++) {
				if (i >= j) {
					if (i % j != 0) {
						temp++;
					}

				}

			}
			if (temp == i - 2) {
				list.add(i);
				count++;
				
			}
		}
		System.out.println("共有" + count + "个素数");
		for (int i = 0; i < list.size(); i++) {
			Integer a = list.get(i);
			System.out.println(a);

		}

	}

}
