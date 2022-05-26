package com.corejava.assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		

		Map<Integer, Double> hashmap = new HashMap<Integer, Double>();
		Random random = new Random();
	
		for (int i = 1; i <= 10; i++) {

			hashmap.put((Integer)random.nextInt(50),(Double)random.nextDouble(50.00));
		}

		for (Entry<Integer, Double> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}

/*
 * HashMap<Integer, Double> companies = new HashMap<>();
 * companies.putAll(12,90.0); companies.put("Paypal", "North San Jose");
 * companies.put("Google", "Mountain View"); companies.put("Yahoo",
 * "Santa Clara"); companies.put("Twitter", "San Francisco");
 * 
 * // Get a random entry from the HashMap. Object[] crunchifyKeys =
 * companies.keySet().toArray(); Object key = crunchifyKeys[new
 * Random().nextInt(crunchifyKeys.length)];
 * System.out.println("**** Random Value **** \n" + key + " :: " +
 * companies.get(key));
 * 
 * List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String,
 * String>>(companies.entrySet());
 * 
 * // How to Shuffle a List?? // Each time you get a
 * different order...
 * System.out.println("\n***** Now Let's start shuffling list *****");
 * Collections.shuffle(list); for (Map.Entry<String, String> entry : list) {
 * System.out.println(entry.getKey() + " :: " + entry.getValue());
 */