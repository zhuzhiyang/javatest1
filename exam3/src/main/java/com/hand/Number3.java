package com.hand;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result=0;
		int dayresult;
		System.out.println("请输入日期");
		String day=sc.next();
		Integer m0=Integer.parseInt(day.substring(0, 4));
		Integer m1=Integer.parseInt(day.substring(5, 6));
		Integer m2=Integer.parseInt(day.substring(6, 7));
		Integer m3=Integer.parseInt(day.substring(8, 9));
		Integer m4=Integer.parseInt(day.substring(9, 10));
		if(m3==0)
		{
			dayresult=m4;
			System.out.println(dayresult);
		}
		else{
			dayresult=m3*10+m4;
		}
			
		if(m1==0)
		{ 
			if(m2==1)
			{	
				result=dayresult;
			}
			if(m2==2)
			{
				result=31+dayresult;
			}
			if(m2==3)
			{
				result=31+29+dayresult;
			}
		    if(m2==4)
		    {
		    	result=31+29+31+dayresult;
		    }
		    if(m2==5)
		    {
		    	result=31+29+31+30+dayresult;
		    }
		    if(m2==6)
		    {
		    	result=31+29+31+30+31+dayresult;
		    }
		    if(m2==7)
		    {
		    	result=31+29+31+30+31+30+dayresult;
		    }
		    if(m2==8)
		    {
		    	result=31+29+31+30+31+30+31+dayresult;
		    }
		    if(m2==9)
		    {
		    	result=31+29+31+30+31+30+31+31+dayresult;
		    }
		}
		else
		{
			if(m2==0)
			{	
				result=31+29+31+30+31+30+31+31+30+dayresult;
			}
			if(m2==1)
			{
				result=31+29+31+30+31+30+31+31+30+31+dayresult;
			}
			if(m2==2)
			{
				result=31+29+31+30+31+30+31+31+30+31+30+dayresult;
			}
		}
		if((m0%4!=0||m0%100==0)&&m0%400!=0)
		{
			result=result-1;
		}
     System.out.println("你输入的日期为当前的第"+result+"天");
	}

}
