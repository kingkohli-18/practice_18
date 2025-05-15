package Intro;

import java.util.HashMap;

public class practice1_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the first non-repeated character in a string using a HashMap
		String W="swiss";
		boolean found=false;
		
		char ch[]=W.toCharArray();
		char last = 0;
		HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
		for(char c:ch) 
		{
			if (hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c, 1);
		}
		System.out.println(hm);
		for(char i: ch)
		{
			if(hm.get(i)==1)
			{
				//System.out.println(i);
		//found=true;
		 last=i;
			}
			
		}
		System.out.println(last);
	}

}
