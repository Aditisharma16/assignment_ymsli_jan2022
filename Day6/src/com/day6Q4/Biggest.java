package com.day6Q4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Biggest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayList<Double> numbers = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(new File("data.txt")))){
			String line = null;
			while((line=reader.readLine())!=null) {
				numbers.add(Double.parseDouble(line));
			}
		}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			Collections.sort(numbers);
		for(double d:numbers) {
		System.out.println(d);
	}
		
		double largest=numbers.get(numbers.size()-1);
		
		System.out.println("Largest number is : "+largest);
	}

}

