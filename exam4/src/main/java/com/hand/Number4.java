package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number4 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		    Integer[] i1=new Integer[50];
		    Integer[] i2=new Integer[50];
		    Integer[] i3=new Integer[50];
		    Integer[] i4=new Integer[50];
		    Integer[] i5=new Integer[50];
		    Integer[] i6=new Integer[50];
		    Integer[] i7=new Integer[50];
		    Integer[] i8=new Integer[50];
		    Integer[] i9=new Integer[50];
        for (int i = 0; i < 50; i++) {
        	int j=(int)(Math.random()*100);
			list.add(j);
		}
        int h1=0;
        int h2=0;
        int h3=0;
        int h4=0;
        int h5=0;
        int h6=0;
        int h7=0;
        int h8=0;
        int h9=0;
        
        
         Map<Integer,Integer[]> maps=new HashMap<Integer,Integer[]>();
         for (int i = 0; i < list.size(); i++) {
			    int num=list.get(i);
			    int result=num/10;
	
			    if(result==1)
			    {
			    	
			    	i1[h1]=num;
			    	h1++;
			    }
			    if(result==2)
			    {
			    
			    	i2[h2]=num;
			    	h2++;
			    }
			    if(result==3)
			    {
			    	
			    	i3[h3]=num;
			    	h3++;
			    }
			    if(result==4)
			    {
			    	
			    	i4[h4]=num;
			    	h4++;
			    }
			    if(result==5)
			    {
			    	
			    	i5[h5]=num;
			    	h5++;
			    }
			    if(result==6)
			    {
			    	
			    	i6[h6]=num;
			    	h6++;
			    }
			    if(result==7)
			    {
			    	
			    	i7[h7]=num;
			    	h7++;
			    }
			    if(result==8)
			    {
			    	
			    	i8[h8]=num;
			    	h8++;
			    }
			    if(result==9)
			    {
			    	
			    	i9[h9]=num;
			    	h9++;
			    }   	
		}
         maps.put(1, i1);
         maps.put(2, i2);
         maps.put(3, i3);
         maps.put(4, i4);
         maps.put(5, i5);
         maps.put(6, i6);
         maps.put(7, i7);
         maps.put(8, i8);
         maps.put(9, i9);
         System.out.print("随机生成的50个数分别为");
         for (int i = 0; i < list.size(); i++) {
			   int z=list.get(i);
			  
			   System.out.print(z+",");
			  
		}
         System.out.println();
         for (int i = 1; i < 10; i++) {
        	 Integer res[]=new Integer[50];
        	 for(int z=0;z<maps.get(i).length;z++)
        	 {
        		 res[z]=maps.get(i)[z];
        	 }
        	 
        	 System.out.print("Map中的数据为"+i+"=>");
        	 for (int j = 0; j < res.length ; j++) {
        		 if(res[j]!=null)
        		 {
                  System.out.print(res[j]+",");
        		 }
        		 
			}
        	 System.out.println();
			
		}
	}
}
