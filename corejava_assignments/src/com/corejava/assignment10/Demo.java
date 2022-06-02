package com.corejava.assignment10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * assignment 03
*/
public class Demo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("quick"	);
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog");

		// Integer[] ar1r = list.stream().toArray(size -> new Integer[size]);
		String[] arr = list.toArray(size -> new String[size]);// size->new String[size]==String[]::new
		System.out.println(Arrays.toString(arr));
	}
}
