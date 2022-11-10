package main;

import facilities.*;

import java.util.List;

public class PrintInfo {

	public static void print(List<Appliance> list) {
		
		list.forEach(System.out::println);
	}
}
