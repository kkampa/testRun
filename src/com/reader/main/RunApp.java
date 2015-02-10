package com.reader.main;
import com.reader.parser.*;
import com.reader.person.*;

public class RunApp {
	public static void main(String[] args) {  
	  
	  // reading data from a csv file  
	  System.out.println("Reading data from csv :");  
	  
	  System.out.println("Reading data from csv and convert to java object:");  
	  PersonReader csvToJavaObject = new PersonReader();  
	  csvToJavaObject.csvConverter();
	  //csvToJavaObject.convertCsvToJava();  
	 }  
}  

