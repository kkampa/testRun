package com.reader.parser;

 
	  
import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List;  
import com.reader.person.*;  

 
public class PersonReader {
	 public void csvConverter(){
		 //String csvFileToRead = "";
		 List<Person> personList = new ArrayList<Person>();
		 List<Child> childList = new ArrayList<Child>();
		 try {
			 convertCsvToJavaParent("persons.csv", personList);
			 convertCsvToJavaDependent("child.csv", childList);
			 
			 //printChildList(childList);
			 combineChildParent(personList, childList);
			 printPersonList(personList); 
		 }
		 catch (Exception e){
			 e.printStackTrace();
		 }
		 finally{
			 //nothing
		 }
		 
	 }
	 
	 public void combineChildParent(List<Person> personList, List<Child> childList) throws Exception{
		 int parentListLength = personList.size();
                 int childCount = 0;
		 int childListLength = childList.size();
		 //go through parent then children of each)
		 for (int i = 0; i < parentListLength; i++) {
                         childCount = 0;
                         //System.out.println("person " + personList.get(i).getLastname() + " " + personList.get(i).getEmployeeNum());
			 for (int j = 0; j < childListLength; j++){
                            // System.out.println(childList.get(j).getChildLastname() + ", " + childList.get(j).getchildFirstname() + " " + childList.get(j).getEmployeeNum());
				 if (personList.get(i).getEmployeeNum().contains(childList.get(j).getEmployeeNum())) 
				 {
					 
					 if (childCount==0) {
						 //System.out.println("i=" + i + " j=" + j + " childCount=" + childCount);
						 //System.out.println("Found" + personList.get(i).getFirstname() + " " + personList.get(i).getLastname() 
						//		 + " " + childList.get(j).getchildFirstname() + " " + childList.get(j).getChildLastname());
						 
						 personList.get(i).setChildFirstname1(childList.get(j).getchildFirstname());
						 personList.get(i).setChildLastname1(childList.get(j).getChildLastname());
						 personList.get(i).setChildType1(childList.get(j).getChildType());
                                                 
                                                 childCount = 1;
					 }
					 else if (childCount==1) {
						 personList.get(i).setChildFirstname2(childList.get(j).getchildFirstname());
						 personList.get(i).setChildLastname2(childList.get(j).getChildLastname());
						 personList.get(i).setChildType2(childList.get(j).getChildType());
                                                 childCount = 2;
					 }
					 else if (childCount==2) {
						 personList.get(i).setChildFirstname3(childList.get(j).getchildFirstname());
						 personList.get(i).setChildLastname3(childList.get(j).getChildLastname());
						 personList.get(i).setChildType3(childList.get(j).getChildType());
                                                 childCount = 3;
					 }
					 
				 }
			 }
			 
		 
		 }
	 }
	 
	 public void convertCsvToJavaParent(String fileName, List<Person> personList) throws Exception{  
		  String csvFileToRead = fileName;  
		  BufferedReader br = null;  
		  String line = "";  
		  String splitBy = ";";  
		  //List<Person> personList = new ArrayList<Person>();  
		  
		  try {  
		  
		   br = new BufferedReader(new FileReader(csvFileToRead));  
		   while ((line = br.readLine()) != null) {  
		  
		    // split on comma(',')  
		    String[] persons = line.split(splitBy);  
		  
		    // create car object to store values  
		    Person personObject = new Person(persons[0], persons[1], persons[2], persons[3]);  
	  
		    // adding car objects to a list  
		    personList.add(personObject);  
		  
		   }  
		   		   
		   //read in the dependents
		   
		   //combine the object into one
		  
		  } catch (FileNotFoundException e) {  
		   e.printStackTrace();  
		  } catch (IOException e) {  
		   e.printStackTrace();  
		  } finally {  
		   if (br != null) {  
		    try {  
		     br.close();  
		    } catch (IOException e) {  
		     e.printStackTrace();  
		    }  
		   }  
		  }
		  
		 }  
	 
	 public void convertCsvToJavaDependent(String fileName, List<Child> childList) throws Exception{  
		  String csvFileToRead = fileName;  
		  BufferedReader br = null;  
		  String line = "";  
		  String splitBy = ";";  
		  //List<Person> personList = new ArrayList<Person>();  
		  
		  try {  
		  
		   br = new BufferedReader(new FileReader(csvFileToRead));  
		   while ((line = br.readLine()) != null) {  
		  
		    // split on comma(',')  
		    String[] persons = line.split(splitBy);  
		  
		    // create car object to store values  
		    Child childObject = new Child(persons[0], persons[1], persons[2], persons[3]);  
	  
		    // adding car objects to a list  
		    childList.add(childObject);  
		  
		   }  
		   // print values stored in carList  
		   //printPersonList(personList);  
		   
		   //read in the dependents
		   
		   //combine the object into one
		  
		  } catch (FileNotFoundException e) {  
		   e.printStackTrace();  
		  } catch (IOException e) {  
		   e.printStackTrace();  
		  } finally {  
		   if (br != null) {  
		    try {  
		     br.close();  
		    } catch (IOException e) {  
		     e.printStackTrace();  
		    }  
		   }  
		  }
		  
		 }  
	  
	 public void printPersonList(List<Person> personListToPrint) {  
	  for (int i = 0; i < personListToPrint.size(); i++) {  
	   System.out.println("People " + personListToPrint.get(i).getPerson());  
	  }  
	 }
	 
	 public void printChildList(List<Child> personListToPrint) {  
		  for (int i = 0; i < personListToPrint.size(); i++) {  
		   System.out.println("People " + personListToPrint.get(i).getChild());  
		  }  
		 } 
}  

