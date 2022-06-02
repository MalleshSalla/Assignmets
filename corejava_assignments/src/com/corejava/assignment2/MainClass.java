package com.corejava.assignment2;

public class MainClass {
	public static void main(String[] args) {

		Persistence p1 = new FilePersist();
		p1.persist();
		Persistence p2 = new DatabasePersist();
		p2.persist();
	}
}
