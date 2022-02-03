package com.q1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		System.out.println("------printing map------");

		// 1. print map using stream

		System.out.println("print map using stream");
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
		
		

		// 2. print only that records that contain key contains raj
		
		System.out.println("Records that contain key raj");
		map.entrySet().stream().filter(m -> m.getKey() == "raj").forEach(System.out::println);
		
		

		// 3. print map sorted by key
		System.out.println("Print map sorted by key");
		map.entrySet().stream().sorted(Comparator.comparing(m -> m.getKey())).forEach(System.out::println);

		
		
		// 4. print map sorted by values

		System.out.println("Print map sorted by key");
		map.entrySet().stream().sorted(Comparator.comparing(m -> m.getValue())).forEach(System.out::println);
		
		

		// 5. print map reverse sorted by the key		
		System.out.println("Map reverse sorted by the key");
		map.entrySet().stream().sorted(Collections.reverseOrder(Comparator.comparing(m -> m.getKey())))
				.forEach(System.out::println);

		
		
		
		Map<Student, Integer> map1 = new HashMap<>();
		map1.put(new Student(109, "raj", 95), 95);
		map1.put(new Student(61, "keta", 78), 78);
		map1.put(new Student(11, "gunika", 98), 98);
		map1.put(new Student(19, "keshav", 97), 97);

		// Print all records sorted as per name of the student

		System.out.println("records sorted by name");
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
				.forEach(s -> System.out.println(s));

		// Print all records as per id of the student

		System.out.println("All recods as per id");
		map1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getId)))
				.forEach(s -> System.out.println(s));

	}
}
