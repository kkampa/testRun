package com.reader.parser;

 
	  
import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List;  
import com.reader.person.*;  
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class PersonReader {
	 public void csvConverter(){
		 //String csvFileToRead = "";
		 List<Person> personList = new ArrayList<Person>();
		 List<Child> childList = new ArrayList<Child>();
		 try {
			 convertCsvToJavaParent("ERROR-EMP.csv", personList);
			 convertCsvToJavaDependent("DEPENDNT0212.csv", childList);
			 
			 //printChildList(childList);
			 combineChildParent(personList, childList);
			 //printPersonList(personList); 
                         createCSV(personList, "Cissec.csv");
		 }
		 catch (Exception e){
			 e.printStackTrace();
		 }
		 finally{
			 //nothing
		 }
		 
	 }
	 public void createCSV(List<Person> personList, String csvFileName) throws Exception{
             int parentListLength = personList.size();
             try
            {
                FileWriter writer = new FileWriter(csvFileName);
 
                for (int i = 0; i < parentListLength; i++) {
                    System.out.println("certnum" + personList.get(i).getCertNum() + " " + personList.get(i).getSalary() 
                                + " " + personList.get(i).getLastName());
                    writer.append(personList.get(i).getDivision() + ",");
                    writer.append(personList.get(i).getCertNum() + ",,");
                    writer.append(getDOBPart(personList.get(i).getBirthDate(),2) + ",,,,"); //upto maritalstatusseparated
                    writer.append(getMonth(getDOBPart(personList.get(i).getEmployeeDate(),0)) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild4()) + ",,,,"); //upto rehireyear
                    writer.append(checkNull(personList.get(i).getFirstNameChild3()) + ",,,"); //upto partialwaverdependantdentalcare
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild3()) + ",,");
                    writer.append("1,,"); //english,is_employer
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild2(),0))) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild3(),1)) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild4(),1)) + ",");
                    writer.append(checkNull(personList.get(i).getClassCode()) + ",");
                    writer.append(checkNull(personList.get(i).getSalary()) + ",,,"); //upto spouseplanyes
                    writer.append(checkNull(personList.get(i).getRelationshipChild1()) + ",");
                    writer.append(checkNull(getMarriedStatus("MaritalStatusDivorced",personList.get(i).getMaritalStatus())) + ",,");
                    writer.append(checkNull(personList.get(i).getSexChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getRelationshipChild3()) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild1(),0))) + ",");
                    writer.append(getDOBPart(personList.get(i).getEmployeeDate(),1) + ",");
                    writer.append(getDOBPart(personList.get(i).getCoverageDate(),0) + ",0,");
                    writer.append(getMonth(getDOBPart(personList.get(i).getBirthDate(),0)) + ",");
                    writer.append(checkNull(personList.get(i).getRelation()) + ","); //beneficiaryRelation
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getRelationshipChild4()) + ",,"); //hours per week
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild3(),0))) + ",");
                    writer.append(checkNull(personList.get(i).getSexChild4()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstName()) + ",,,,"); //up to dental
                    writer.append(checkNull(getMarriedStatus("EmployeeGenderFeMale",personList.get(i).getSex())) + ",");
                    writer.append(checkNull(getMarriedStatus("MaritalStatusSingle",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild2(),1)) + ",");
                    writer.append(checkNull(personList.get(i).getLastName()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameSpouse()) + ",,");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirthDate(),1)) + ",,");
                    writer.append(checkNull(personList.get(i).getBeneficiary()) + ",,");
                    writer.append(checkNull(personList.get(i).getFirstNameChild1()) + ",,"); //rehire
                    writer.append(checkNull(getMarriedStatus("PartialWaverExtendedHealthCare",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameSpouse()) + ",");
                    writer.append(getDOBPart(personList.get(i).getCoverageDate(),2) + ",");
                    writer.append(checkNull(getMarriedStatus("EmployeeGenderMale",personList.get(i).getSex())) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild1(),2)) + ",");
                    writer.append(checkNull(personList.get(i).getSexSpouse()) + ",,"); //confirmation code
                    writer.append(checkNull(personList.get(i).getFirstNameChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild4()) + ",0,0,0,");
                    writer.append(checkNull(personList.get(i).getSexChild3()) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild2(),2)) + ","); 
                    writer.append(checkNull(getMarriedStatus("PartialWaverDentalCare",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(getMonth(getDOBPart(personList.get(i).getBirtDateSpouse(),0)) + ",,"); //employeecity
                    writer.append(checkNull(getDOBPart(personList.get(i).getEmployeeDate(),2)) + ",,,"); //upto spouse no details
                    writer.append(checkNull(personList.get(i).getProvince()) + ",");
                    writer.append(getMonth(getDOBPart(personList.get(i).getCoverageDate(),0)) + ",");
                    writer.append(getDOBPart(personList.get(i).getBirtDateSpouse(),1) + ",1,,"); //annually,benef2
                    writer.append(checkNull(personList.get(i).getSexChild1()) + ",,1,"); //visa,provincialcovered
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild4(),2)) + ",,"); //initialchild3
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateSpouse(),2)) + ",,"); //postalcode
                    writer.append(checkNull(personList.get(i).getLastNameChild1()) + ",");
                    writer.append(checkNull(personList.get(i).getCertNum()) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild1(),1)) + ",");
                    writer.append(checkNull(personList.get(i).getOccupation()) + ",,,"); //partialwaiver
                    writer.append(getMonth(getDOBPart(personList.get(i).getBirtDateChild4(),0)) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild1()) + ",");
                    writer.append(checkNull(getMarriedStatus("MaritalStatusMarried",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild3()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameChild4()) + ",,,"); //upto duplicateinsuranceyes
                    writer.append(checkNull(personList.get(i).getRelationshipChild2()) + ",,,,,"); //upto initialchild1
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild3(),2)) + ",,,,,,,"); //upto beneficiary2             
                    writer.append('\n');
 
                }
 
                writer.flush();
                writer.close();
            }
            catch(IOException e)
            {
	     e.printStackTrace();
            } 
             
         }
         
         private String getMarriedStatus(String fieldName, String fieldValue){
             String returnString = "0";
             switch (fieldName){
                 case "MaritalStatusSingle":
                     if (fieldValue.equals("S")) {
                         returnString = "1";
                     }
                     break;
                 case "MaritalStatusDivorced":
                     
                     break;
                 case "MaritalStatusMarried":
                     if (fieldValue.equals("M")){
                         returnString = "1";
                     }
                     break;
                 case "PartialWaverExtendedHealthCare":
                     if (fieldValue.equals("P")){
                         returnString = "1";
                     }
                     break;
                  case "PartialWaverDentalCare":
                     if (fieldValue.equals("P")){
                         returnString = "1";
                     }
                     break;
                 case "EmployeeGenderFeMale":
                     if (fieldValue.equals("F")){
                         returnString = "1";
                     }
                     break;
                 case "EmployeeGenderMale":
                     if (fieldValue.equals("M")){
                         returnString = "1";
                     }
                     break;
             }
             return returnString;
         }
         
         private String getMonth(String month){
            
            String monthString;
            //System.out.println(month);
            switch (month) {
                case "1":  monthString = "Jan";
                     break;
                case "2":  monthString = "Feb";
                     break;
                case "3":  monthString = "Mar";
                     break;
                case "4":  monthString = "Apr";
                     break;
                case "5":  monthString = "May";
                     break;
                case "6":  monthString = "Jun";
                     break;
                case "7":  monthString = "Jul";
                     break;
                case "8":  monthString = "Aug";
                         break;
                case "9":  monthString = "Sep";
                     break;
                case "10": monthString = "Oct";
                     break;
                case "11": monthString = "Nov";
                     break;
                case "12": monthString = "Dec";
                     break;
                default: monthString = "";
                     break;
            }
            return monthString;
         }
         
         private String checkNull(String toCheck){
             if (toCheck == null){
                 return "";
             }
             else return toCheck;
         }
         
         private String getDOBPart(String DOB, int splitter){
             String part;
             String splitBy = "/"; 
             if(DOB!=null){
                String[] brokenDOB = DOB.split(splitBy);
                part = brokenDOB[splitter];
             }
             else {
                 part = "";
             }
             
             return part;
         }
         
	 public void combineChildParent(List<Person> personList, List<Child> childList) throws Exception{
		 int parentListLength = personList.size();
                 int childCount = 0;
		 int childListLength = childList.size();
		 //go through parent then children of each)
		 for (int i = 0; i < parentListLength; i++) {
                         childCount = 0;
                         //System.out.println("person " 
                         //        + personList.get(i).getLastName() + " " + personList.get(i).getCertNum());
			 
                         for (int j = 0; j < childListLength; j++){
                            //System.out.println(childList.get(j).getChildLastName() 
                            //        + ", " + childList.get(j).getChildFirstName() 
                            //        + " " + childList.get(j).getCertNum());
                            
                            if (personList.get(i).getCertNum().contains(childList.get(j).getCertNum())) 
				{
                                    //System.out.println(childLitDepType().toUpperCase().trim())) {
                                     
                                    //+ ", " + childList.get(j).getChildFirstName() 
                                    //+ " " + childList.get(j).getCertNum()
                                    //+ " " + childList.get(j).getDepType()); 
                                    //System.out.println(childList.get(j).getDepType().toUpperCase());
                                    if ("SP".equals(childList.get(j).getDepType().toUpperCase().trim())) {
                                        
                                        personList.get(i).setFirstNameSpouse(childList.get(j).getChildFirstName());
                                        personList.get(i).setLastNameSpouse(childList.get(j).getChildLastName());
                                        personList.get(i).setBirtDateSpouse(childList.get(j).getBirthDate());
                                        personList.get(i).setSexSpouse(childList.get(j).getSex());
                                        //System.out.println("Spouse" + childList.get(j).getChildLastName()
                                        //        + ", " + childList.get(j).getChildFirstName()
                                        //        + " " + childList.get(j).getCertNum());
                                    }
                                    if ("CH".equals(childList.get(j).getDepType().toUpperCase().trim()) && childCount==0) {
						 //System.out.println("i=" + i + " j=" + j + " childCount=" + childCount);
						 //System.out.println("Found" + personList.get(i).getFirstname() + " " + personList.get(i).getLastname() 
						//		 + " " + childList.get(j).getchildFirstname() + " " + childList.get(j).getChildLastname());
						 
					personList.get(i).setFirstNameChild1(childList.get(j).getChildFirstName());
                                        personList.get(i).setLastNameChild1(childList.get(j).getChildLastName());
                                        personList.get(i).setBirtDateChild1(childList.get(j).getBirthDate());
                                        personList.get(i).setSexChild1(childList.get(j).getSex());
                                        personList.get(i).setRelationshipChild1(childList.get(j).getRelation());
                                        personList.get(i).setNameOfSchoolChild1(childList.get(j).getSchool());         
                                        childCount = 1;
                                    }
                                    else if ("CH".equals(childList.get(j).getDepType().toUpperCase().trim()) && childCount==1) {
					personList.get(i).setFirstNameChild2(childList.get(j).getChildFirstName());
                                        personList.get(i).setLastNameChild2(childList.get(j).getChildLastName());
                                        personList.get(i).setBirtDateChild2(childList.get(j).getBirthDate());
                                        personList.get(i).setSexChild2(childList.get(j).getSex());
                                        personList.get(i).setRelationshipChild2(childList.get(j).getRelation());
                                        personList.get(i).setNameOfSchoolChild2(childList.get(j).getSchool());
                                        childCount = 2;
                                    }
                                    else if ("CH".equals(childList.get(j).getDepType().toUpperCase().trim()) && childCount==2) {
					personList.get(i).setFirstNameChild3(childList.get(j).getChildFirstName());
                                        personList.get(i).setLastNameChild3(childList.get(j).getChildLastName());
                                        personList.get(i).setBirtDateChild3(childList.get(j).getBirthDate());
                                        personList.get(i).setSexChild3(childList.get(j).getSex());
                                        personList.get(i).setRelationshipChild3(childList.get(j).getRelation());
                                        personList.get(i).setNameOfSchoolChild3(childList.get(j).getSchool());
                                        childCount = 3;
                                    }
                                    else if ("CH".equals(childList.get(j).getDepType().toUpperCase().trim()) && childCount==3) {
					personList.get(i).setFirstNameChild4(childList.get(j).getChildFirstName());
                                        personList.get(i).setLastNameChild4(childList.get(j).getChildLastName());
                                        personList.get(i).setBirtDateChild4(childList.get(j).getBirthDate());
                                        personList.get(i).setSexChild4(childList.get(j).getSex());
                                        personList.get(i).setRelationshipChild4(childList.get(j).getRelation());
                                        personList.get(i).setNameOfSchoolChild4(childList.get(j).getSchool());
                                        childCount = 4;
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
		  //System.out.println(line);
		    // split on comma(',')  
		    String[] persons = line.split(splitBy);  
                    /*System.out.println(persons[1] + " " + 
                            persons[2] + " " + persons[4] + " " + persons[5] + " " +
                            persons[8] + " " + persons[11] + " " + persons[12] + " " +
                            persons[13] + " " + persons[14] + " " + persons[15] + " " +
                            persons[18] + " " + persons[19] + " " + persons[22] + " " +
                            persons[23] + " " + persons[31] + " " + persons[35]);
                    */
		  
		    // create car object to store values  
		    Person personObject = new Person(persons[1], 
                            persons[2], persons[4], persons[5],
                            persons[8], persons[11], persons[12],
                            persons[13], persons[14], persons[15],
                            persons[18], persons[19], persons[22],
                            persons[23], persons[31], persons[35]);  
	  
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
		    /*System.out.println(persons[3] + " " + 
                            persons[5] + " " +  
                            persons[4] + " " +  
                            persons[6] + " " + 
                            persons[8] + " " + 
                            persons[13] + " " + 
                            persons[14]);
                     */
		    // create car object to store values 
                    //String certNum, String childFirstName, String childLastName, 
                  //String birthDate, String sex, String relation, String school
		    Child childObject = new Child(persons[0],
                            persons[3], 
                            persons[5], 
                            persons[4], 
                            persons[6],
                            persons[8],
                            persons[13],
                            persons[14]);  
	  
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
              try {  
                  System.out.println("People " + personListToPrint.get(i).getPerson());
              } catch (Throwable ex) {
                  Logger.getLogger(PersonReader.class.getName()).log(Level.SEVERE, null, ex);
              }
	  }  
	 }
	 
	 public void printChildList(List<Child> personListToPrint) {  
		  for (int i = 0; i < personListToPrint.size(); i++) {  
		   System.out.println("People " + personListToPrint.get(i).getChild());  
		  }  
		 } 
}  

