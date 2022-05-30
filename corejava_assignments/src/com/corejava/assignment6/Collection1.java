package com.corejava.assignment6;

import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set; 

public class Collection1 {

	public static void main(String[] args) {
		
	
		TreeMap<Long, String> treemap=new TreeMap<Long,String>(Collections.reverseOrder());
		treemap.put(9877894316L, "Ayush");
		treemap.put(9896546465L, "Awani");
		treemap.put(9834513542L, "Shreya");
		treemap.put(9846544456L, "Rinshu");
		treemap.put(9886746444L, "Mohan");
		
		//System.out.println();
		System.out.println(treemap);
		
		Set<Long> k=treemap.keySet();// a) fetching all keys and print them
		System.out.println(k);       
		
		Collection<String> values = treemap.values(); //  fetching all values and print them
		System.out.println(values);
	
		Set<Map.Entry<Long, String>> entries = treemap.entrySet();
		System.out.println(entries);
		
		System.out.println();
		
		for(Map.Entry<Long,String> e:treemap.entrySet()) {
	         System.out.println(e.getKey()+" , "+e.getValue());
	      }
		
	}
}