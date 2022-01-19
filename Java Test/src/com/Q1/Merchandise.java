package com.Q1;


import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Merchandise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String itemCode;
		 int quantity;
		 double unitPrice;
		 
		 List<MerchandiseInventory> ListMerchandize= new ArrayList<>();
		 String line= null;
		 
		 try(BufferedReader Scanner= new BufferedReader(new FileReader(new File("data.txt")))){
			 
			 while((line= Scanner.readLine())!=null) {
				 String[] tokens= line.split(" ");
				 itemCode= tokens[0];
				 quantity= Integer.parseInt(tokens[1]);
				 unitPrice=Double.parseDouble(tokens[2]);
				 ListMerchandize.add(new MerchandiseInventory(itemCode,quantity,unitPrice));
			 }
		 }catch(FileNotFoundException ex) {
			 ex.printStackTrace();
		 }catch(IOException ex)
		 {
			 ex.printStackTrace();
		 }
		 
		 Collections.sort(ListMerchandize,(o1,o2)->o1.getItemCode().compareTo(o2.getItemCode()));
		 ListMerchandize.forEach((Item)->System.out.println(Item)) ;

		 System.out.println("");
		 
		Collections.sort(ListMerchandize,(o1,o2)->o2.getUnitPrice().compareTo(o1.getUnitPrice()));
		
		 ListMerchandize.forEach((Item)-> System.out.println(Item)) ;
		
		

	}

}
