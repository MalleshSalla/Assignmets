package com.corejava.assignment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/*
 * assignment 04
*/
public class StudentList {
	public static void main(String[] args) {
		var path = "C://Users//SMALLESH//Desktop//Html//StudentList.txt";
		try {
						
			String data = Files.readString(Path.of(path)); // reading the text file 
			
			System.out.println(data);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}