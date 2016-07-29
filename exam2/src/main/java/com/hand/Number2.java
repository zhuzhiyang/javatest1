package com.hand;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		int out=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入工资");
		double salary=sc.nextDouble();
		if(salary-3500<=1500)
		{
			 out=3;
			System.out.println("你的税率为"+out+"%");
		}
		else if(salary-3500>1500&&salary-3500<=4500)
		{
			out=10;
			System.out.println("你的税率为"+out+"%");
		}
		else if(salary-3500>4500&&salary-3500<=9000)
		{
			out=20;
			System.out.println("你的税率为"+out+"%");
		}
		else if(salary-35000>4500&&salary-3500<=55000)
		{
			out=30;
			System.out.println("你的税率为"+out+"%");
		}
		else if(salary-55000>4500&&salary-3500<=80000)
		{
			out=35;
			System.out.println("你的税率为"+out+"%");
		}
		else if(salary-55000>80000)
		{
			out=45;
			System.out.println("你的税率为"+out+"%");
		}

	}

}
