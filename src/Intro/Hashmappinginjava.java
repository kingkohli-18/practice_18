package Intro;

import java.util.HashMap;

public class Hashmappinginjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[]= {1,2,1,4,2,3,4,5,6,7,1,2,4,5,6,7,9};
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		
		for (int i : ch)
		{
			//hm.put(i, hm.getOrDefault(i, 0)+1);
			//System.out.println(i);
			if(hm.containsKey(i))
			{
			hm.put(i, hm.get(i)+1);
			
			}
			else
				
				hm.put(i, 1);
		
		}
		System.out.println(hm);// displaying elements frequency of the elements
		for(int count: hm.keySet())
		{
		if(hm.get(count)>1)

	System.out.println(count);  //displaying repeated elements 
		System.out.println("hiiii")
		//Write a program to find the first non-repeated character in a string using a HashMap
}
	

}}
