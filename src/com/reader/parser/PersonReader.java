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
			 //convertCsvToJavaParent("ERROR-EMP.csv", personList);
			 //convertCsvToJavaDependent("ERROR-DEP.csv", childList);
			 convertCsvToJavaParent("EMPLOYEE-0212.csv", personList);
			 convertCsvToJavaDependent("DEPENDNT-0212.csv", childList);
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
                writer.append("FirstName,MiddleName,LastName,Email,Username,Password,EmployeeTypeId,Annually,");
                writer.append("BenefName1,BenefName2,BenefRel1,BenefRel2,Class,CohabDate,DayDOBChild1,DayDOBChild2,DayDOBChild3,DayDOBChild4,");
                writer.append("Dental,Dept,Dup,Dup,Dup,Dup,Dup,EffectiveDay,EffectiveMonth,EffectiveYear,EHC,Address,City,");
                writer.append("EmpDOBDay,EmpDOBMonth,EmpDOBYear,EmpEarnings,GenderF,GenderM,Init,EmpNum,EmpOcc,PC,Prov,EmpDay,");
                writer.append("EmpMon,EmpYear,Eng,FNChild1,FNChild2,FNChild3,FNChild4,French,Hourly,Hrs,Init1,Init2,Init3,Init4,");
                writer.append("LNChild1,LNChild2,LNChild3,LNChild4,MSCL,MSD,MSM,MSS,MSSingle,MonthDOBChild1,MonthDOBChild2,MonthDOBChild3,MonthDOBChild4,");
                writer.append("Monthly,Employer,NameSchool1,NameSchool2,NameSchool3,NameSchool4,NewEmp,PartialWavDent,PartDep,PartDep,PartWavEHC,");
                writer.append("ProvNo,ProvYes,RehireDay,RehireYear,RehireMon,Reinstate,RelatChild1,RelatChild2,RelatChild3,RelatChild4,");
                writer.append("SexCh1,SexCh2,SexCh3,SexCh4,Proc1,Proc2,SpDOBDay,SpFN,SPInit,SpLN,SpDOBMon,SpNoDet,SpPlanNo,SpPlanYes,SpSex,SpDOBYear,");
                writer.append("Desig,VisaNo,VisaYes,Weekly,YearDOBCh1,YearDOBCh2,YearDOBCh3,YearDOBCh4");
                writer.append('\n');
                
                for (int i = 0; i < parentListLength; i++) {
                    System.out.println("certnum" + personList.get(i).getCertNum() + " " + personList.get(i).getSalary() 
                                + " " + personList.get(i).getLastName());
                    writer.append(checkNull(personList.get(i).getFirstName()) + ",,");                    
                    writer.append(checkNull(personList.get(i).getLastName()) + ",,,,1,1,,,,,"); //up to benerelation2
                    writer.append(checkNull(personList.get(i).getClassCode()) + ",,"); //cohab
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild1(),1)) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild2(),1)) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild3(),1)) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild4(),1)) + ",");
                    writer.append(checkNull(getMarriedStatus("PartialWaverExtendedHealthCare",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(checkNull(personList.get(i).getDivision()) + ",,,,,,"); //upto duplicate
                    writer.append(checkNull(getDOBPart(personList.get(i).getCoverageDate(),1)) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getCoverageDate(),0))) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getCoverageDate(),2)) + ",");
                    writer.append(checkNull(getMarriedStatus("PartialWaverExtendedHealthCare",personList.get(i).getMaritalStatus())) + ",,,"); //upto city
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirthDate(),1)) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirthDate(),0))) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirthDate(),2)) + ",");
                    writer.append(checkNull(personList.get(i).getSalary()) + ",");
                    writer.append(checkNull(getMarriedStatus("EmployeeGenderFeMale",personList.get(i).getSex())) + ",");
                    writer.append(checkNull(getMarriedStatus("EmployeeGenderMale",personList.get(i).getSex())) + ",,");
                    writer.append(checkNull(personList.get(i).getCertNum()) + ",");
                    writer.append(checkNull(personList.get(i).getOccupation()) + ",,Ontario,"); //upto prov
                    writer.append(checkNull(getDOBPart(personList.get(i).getEmployeeDate(),1)) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getEmployeeDate(),0))) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getEmployeeDate(),2)) + ",1,");
                    writer.append(checkNull(personList.get(i).getFirstNameChild1()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameChild3()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameChild4()) + ",0,0,40,,,,,"); //upto initial
                    writer.append(checkNull(personList.get(i).getLastNameChild1()) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild3()) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild4()) + ",,,"); //upto divorced
                    writer.append(checkNull(getMarriedStatus("MaritalStatusMarried",personList.get(i).getMaritalStatus())) + ",,");
                    writer.append(checkNull(getMarriedStatus("MaritalStatusSingle",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild1(),0))) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild2(),0))) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild3(),0))) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild4(),0))) + ",0,BGM,");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild1()) + ",");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild3()) + ",");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild4()) + ",,");
                    writer.append(checkNull(getMarriedStatus("PartialWaverExtendedHealthCare",personList.get(i).getMaritalStatus())) + ",,,");
                    writer.append(checkNull(getMarriedStatus("PartialWaverExtendedHealthCare",personList.get(i).getMaritalStatus())) + ",0,1,,,,,"); //upto reinstatement
                    writer.append(checkNull(personList.get(i).getRelationshipChild1()) + ",");
                    writer.append(checkNull(personList.get(i).getRelationshipChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getRelationshipChild3()) + ",");
                    writer.append(checkNull(personList.get(i).getRelationshipChild4()) + ",");
                    writer.append(checkNull(personList.get(i).getSexChild1()) + ",");
                    writer.append(checkNull(personList.get(i).getSexChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getSexChild3()) + ",");
                    writer.append(checkNull(personList.get(i).getSexChild4()) + ",,,"); //proceeds
                    writer.append(checkNull(getDOBPart(personList.get(i).getEmployeeDate(),1)) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameSpouse()) + ",,");
                    writer.append(checkNull(personList.get(i).getLastNameSpouse()) + ",");
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateSpouse(),0))) + ",,,,");
                    writer.append(checkNull(personList.get(i).getSexSpouse()) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getEmployeeDate(),0)) + ",,0,1,,"); //upto visa
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild1(),2)) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild2(),2)) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild3(),2)) + ",");
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild4(),2)) + ",");
                    
                    
                    /*writer.append(checkNull(personList.get(i).getDivision()) + ",");
                    writer.append(checkNull(personList.get(i).getCertNum()) + ",,");
                    //System.out.println("1" + personList.get(i).getBirthDate());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirthDate(),2) + ",,,,")); //upto maritalstatusseparated
                    //System.out.println("2" + personList.get(i).getEmployeeDate());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getEmployeeDate(),0))) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild4()) + ",,,,"); //upto rehireyear
                    writer.append(checkNull(personList.get(i).getFirstNameChild3()) + ",,,"); //upto partialwaverdependantdentalcare
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild3()) + ",,");
                    writer.append("1,,"); //english,is_employer
                    //System.out.println("3" + personList.get(i).getBirtDateChild2());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild2(),0))) + ",");
                    //System.out.println("4" + personList.get(i).getBirtDateChild3());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild3(),1)) + ",");
                    //System.out.println("5" + personList.get(i).getBirtDateChild4());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild4(),1)) + ",");
                    writer.append(checkNull(personList.get(i).getClassCode()) + ",");
                    writer.append(checkNull(personList.get(i).getSalary()) + ",,,"); //upto spouseplanyes
                    writer.append(checkNull(personList.get(i).getRelationshipChild1()) + ",");
                    writer.append(checkNull(getMarriedStatus("MaritalStatusDivorced",personList.get(i).getMaritalStatus())) + ",,");
                    writer.append(checkNull(personList.get(i).getSexChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getRelationshipChild3()) + ",");
                    //System.out.println("6" + personList.get(i).getBirtDateChild1());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild1(),0))) + ",");
                    //System.out.println("7" + personList.get(i).getEmployeeDate());
                    writer.append(checkNull(getDOBPart(personList.get(i).getEmployeeDate(),1)) + ",");
                    //System.out.println("1" + personList.get(i).getCoverageDate());
                    writer.append(checkNull(getDOBPart(personList.get(i).getCoverageDate(),0)) + ",0,");
                    //System.out.println("8" + personList.get(i).getBirthDate());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirthDate(),0))) + ",");
                    writer.append(checkNull(personList.get(i).getRelation()) + ","); //beneficiaryRelation
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getRelationshipChild4()) + ",,"); //hours per week
                    //System.out.println("9" + personList.get(i).getBirtDateChild3());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild3(),0))) + ",");
                    writer.append(checkNull(personList.get(i).getSexChild4()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstName()) + ",,,,"); //up to dental
                    writer.append(checkNull(getMarriedStatus("EmployeeGenderFeMale",personList.get(i).getSex())) + ",");
                    writer.append(checkNull(getMarriedStatus("MaritalStatusSingle",personList.get(i).getMaritalStatus())) + ",");
                    //System.out.println("10" + personList.get(i).getBirtDateChild2());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild2(),1)) + ",");
                    writer.append(checkNull(personList.get(i).getLastName()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameSpouse()) + ",,");
                    //System.out.println("11" + personList.get(i).getBirthDate());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirthDate(),1)) + ",,");
                    writer.append(checkNull(personList.get(i).getBeneficiary()) + ",,");
                    writer.append(checkNull(personList.get(i).getFirstNameChild1()) + ",,"); //rehire
                    writer.append(checkNull(getMarriedStatus("PartialWaverExtendedHealthCare",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameSpouse()) + ",");
                    //System.out.println("12" + personList.get(i).getCoverageDate());
                    writer.append(checkNull(getDOBPart(personList.get(i).getCoverageDate(),2)) + ",");
                    writer.append(checkNull(getMarriedStatus("EmployeeGenderMale",personList.get(i).getSex())) + ",");
                    //System.out.println("13" + personList.get(i).getBirtDateChild1());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild1(),2)) + ",");
                    writer.append(checkNull(personList.get(i).getSexSpouse()) + ",,"); //confirmation code
                    writer.append(checkNull(personList.get(i).getFirstNameChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild4()) + ",0,0,0,");
                    writer.append(checkNull(personList.get(i).getSexChild3()) + ",");
                    //System.out.println("14" + personList.get(i).getBirtDateChild2());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild2(),2)) + ","); 
                    writer.append(checkNull(getMarriedStatus("PartialWaverDentalCare",personList.get(i).getMaritalStatus())) + ",");
                    //System.out.println("14.5" + personList.get(i).getBirtDateSpouse());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateSpouse(),0))) + ",,"); //employeecity
                    //System.out.println("15" + personList.get(i).getEmployeeDate());
                    writer.append(checkNull(getDOBPart(personList.get(i).getEmployeeDate(),2)) + ",,,"); //upto spouse no details
                    writer.append(checkNull(personList.get(i).getProvince()) + ",");
                    //System.out.println("16" + personList.get(i).getCoverageDate());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getCoverageDate(),0))) + ",");
                    //System.out.println("16.5" + personList.get(i).getBirtDateSpouse());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateSpouse(),1)) + ",1,,"); //annually,benef2
                    //System.out.println("16.8");
                    writer.append(checkNull(personList.get(i).getSexChild1()) + ",,1,"); //visa,provincialcovered
                    //System.out.println("17" + personList.get(i).getBirtDateChild4());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild4(),2)) + ",,"); //initialchild3
                    //System.out.println("17.5" + personList.get(i).getBirtDateSpouse());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateSpouse(),2)) + ",,"); //postalcode
                    writer.append(checkNull(personList.get(i).getLastNameChild1()) + ",");
                    writer.append(checkNull(personList.get(i).getCertNum()) + ",");
                    //System.out.println("18" + personList.get(i).getBirtDateChild1());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild1(),1)) + ",");
                    writer.append(checkNull(personList.get(i).getOccupation()) + ",,,"); //partialwaiver
                    //System.out.println("19" + personList.get(i).getBirtDateChild4());
                    writer.append(checkNull(getMonth(getDOBPart(personList.get(i).getBirtDateChild4(),0))) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild2()) + ",");
                    writer.append(checkNull(personList.get(i).getNameOfSchoolChild1()) + ",");
                    writer.append(checkNull(getMarriedStatus("MaritalStatusMarried",personList.get(i).getMaritalStatus())) + ",");
                    writer.append(checkNull(personList.get(i).getLastNameChild3()) + ",");
                    writer.append(checkNull(personList.get(i).getFirstNameChild4()) + ",,,"); //upto duplicateinsuranceyes
                    writer.append(checkNull(personList.get(i).getRelationshipChild2()) + ",,,,,"); //upto initialchild1
                    //System.out.println("20" + personList.get(i).getBirtDateChild3());
                    writer.append(checkNull(getDOBPart(personList.get(i).getBirtDateChild3(),2)) + ",,,,,,,"); //upto beneficiary2             
                    */
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
                if(!DOB.equals("")){
                 String[] brokenDOB = DOB.split(splitBy);
                part = brokenDOB[splitter];
                }
                else {
                    part = "";
                }
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
		  int myCount=0;
		  try {  
		  
		   br = new BufferedReader(new FileReader(csvFileToRead));  
		   while ((line = br.readLine()) != null) {  
		    myCount++;
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
		   System.out.println("Total employee count=" + myCount);		   
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
		  int myCount=0;
		  try {  
		  
		   br = new BufferedReader(new FileReader(csvFileToRead));  
		   while ((line = br.readLine()) != null) {  
		    myCount++;
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
                   System.out.println("Total dependent count=" + myCount);
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

