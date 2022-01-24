package com.Q1;


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
		 
		 List<MerchandiseInventory> listMerchandize= new ArrayList<>();
		 String line= null;
		 
		 try(BufferedReader Scanner= new BufferedReader(new FileReader(new File("data.txt")))){
			 
			 while((line= Scanner.readLine())!=null) {
				 String[] tokens= line.split(" ");
				 itemCode= tokens[0];
				 quantity= Integer.parseInt(tokens[1]);
				 unitPrice=Double.parseDouble(tokens[2]);
				 listMerchandize.add(new MerchandiseInventory(itemCode,quantity,unitPrice));
			 }
		 }catch(FileNotFoundException ex) {
			 ex.printStackTrace();
		 }catch(IOException ex)
		 {
			 ex.printStackTrace();
		 }
		 
		 Collections.sort(listMerchandize,(o1,o2)->o1.getItemCode().compareTo(o2.getItemCode()));
	///	 listMerchandize.forEach((Item)->System.out.println(Item)) ;
		 for(MerchandiseInventory m: listMerchandize) {
				System.out.println(m);
			}

		 System.out.println("");
//		 
//		Collections.sort(listMerchandize,(o1,o2)->o2.getUnitPrice().compareTo(o1.getUnitPrice()));
//		
//		 listMerchandize.forEach((Item)-> System.out.println(Item)) ;
//		
		

	}

}
