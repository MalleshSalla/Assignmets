package com.corejava.assignment3;

public class StringBufferEx2 {
	public static void main(String[] args) {

		StringBuffer st1 = new StringBuffer("it is used to at the specified index position");
		st1.insert(14, "insert text ");
		System.out.println(st1);
	}
}
