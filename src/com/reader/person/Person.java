package com.reader.person;

import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Person {
    private String division;
    private String certNum;
    private String lastName;
    private String firstName;
    private String province;
    private String employeeDate;
    private String coverageDate;
    private String birthDate;
    private String classCode;
    private String salary;
    private String beneficiary;
    private String relation;
    private String sex;
    private String maritalStatus;
    private String occupation;
    private String salaryType;
    private String firstNameChild1;
    private String lastNameChild1;
    private String birtDateChild1;
    private String sexChild1;
    private String nameOfSchoolChild1;
    private String relationshipChild1;
    private String firstNameChild2;
    private String lastNameChild2;
    private String birtDateChild2;
    private String sexChild2;
    private String nameOfSchoolChild2;
    private String relationshipChild2;
    private String firstNameChild3;
    private String lastNameChild3;
    private String birtDateChild3;
    private String sexChild3;
    private String nameOfSchoolChild3;
    private String relationshipChild3;
    private String firstNameChild4;
    private String lastNameChild4;
    private String birtDateChild4;
    private String sexChild4;
    private String nameOfSchoolChild4;
    private String relationshipChild4;
    private String firstNameSpouse;
    private String lastNameSpouse;
    private String birtDateSpouse;
    private String sexSpouse;

     
	        
    public Person(String division, String certNum, String lastName, String firstName, String province, String employeeDate,
        String coverageDate, String birthDate, String classCode, String salary, String beneficiary,
        String relation, String sex, String maritalStatus, String occupation, String salaryType) {
	    this.division = division;
            this.certNum = certNum;
            this.lastName = lastName;
            this.firstName = firstName;
            this.province = province;
            this.employeeDate = employeeDate;
            this.coverageDate = coverageDate;
            this.birthDate = birthDate;
            this.classCode = classCode;
            this.salary = salary;
            this.beneficiary = beneficiary;
            this.relation = relation;
            this.sex = sex;
            this.maritalStatus = maritalStatus;
            this.occupation = occupation;
            this.salaryType = salaryType;
            
	  }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getEmployeeDate() {
        return employeeDate;
    }

    public void setEmployeeDate(String employeeDate) {
        this.employeeDate = employeeDate;
    }

    public String getCoverageDate() {
        return coverageDate;
    }

    public void setCoverageDate(String coverageDate) {
        this.coverageDate = coverageDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public String getFirstNameChild1() {
        return firstNameChild1;
    }

    public void setFirstNameChild1(String firstNameChild1) {
        this.firstNameChild1 = firstNameChild1;
    }

    public String getLastNameChild1() {
        return lastNameChild1;
    }

    public void setLastNameChild1(String lastNameChild1) {
        this.lastNameChild1 = lastNameChild1;
    }

    public String getBirtDateChild1() {
        return birtDateChild1;
    }

    public void setBirtDateChild1(String birtDateChild1) {
        this.birtDateChild1 = birtDateChild1;
    }

    public String getSexChild1() {
        return sexChild1;
    }

    public void setSexChild1(String sexChild1) {
        this.sexChild1 = sexChild1;
    }

    public String getNameOfSchoolChild1() {
        return nameOfSchoolChild1;
    }

    public void setNameOfSchoolChild1(String nameOfSchoolChild1) {
        this.nameOfSchoolChild1 = nameOfSchoolChild1;
    }

    public String getRelationshipChild1() {
        return relationshipChild1;
    }

    public void setRelationshipChild1(String relationshipChild1) {
        this.relationshipChild1 = relationshipChild1;
    }

    public String getFirstNameChild2() {
        return firstNameChild2;
    }

    public void setFirstNameChild2(String firstNameChild2) {
        this.firstNameChild2 = firstNameChild2;
    }

    public String getLastNameChild2() {
        return lastNameChild2;
    }

    public void setLastNameChild2(String lastNameChild2) {
        this.lastNameChild2 = lastNameChild2;
    }

    public String getBirtDateChild2() {
        return birtDateChild2;
    }

    public void setBirtDateChild2(String birtDateChild2) {
        this.birtDateChild2 = birtDateChild2;
    }

    public String getSexChild2() {
        return sexChild2;
    }

    public void setSexChild2(String sexChild2) {
        this.sexChild2 = sexChild2;
    }

    public String getNameOfSchoolChild2() {
        return nameOfSchoolChild2;
    }

    public void setNameOfSchoolChild2(String nameOfSchoolChild2) {
        this.nameOfSchoolChild2 = nameOfSchoolChild2;
    }

    public String getRelationshipChild2() {
        return relationshipChild2;
    }

    public void setRelationshipChild2(String relationshipChild2) {
        this.relationshipChild2 = relationshipChild2;
    }

    public String getFirstNameChild3() {
        return firstNameChild3;
    }

    public void setFirstNameChild3(String firstNameChild3) {
        this.firstNameChild3 = firstNameChild3;
    }

    public String getLastNameChild3() {
        return lastNameChild3;
    }

    public void setLastNameChild3(String lastNameChild3) {
        this.lastNameChild3 = lastNameChild3;
    }

    public String getBirtDateChild3() {
        return birtDateChild3;
    }

    public void setBirtDateChild3(String birtDateChild3) {
        this.birtDateChild3 = birtDateChild3;
    }

    public String getSexChild3() {
        return sexChild3;
    }

    public void setSexChild3(String sexChild3) {
        this.sexChild3 = sexChild3;
    }

    public String getNameOfSchoolChild3() {
        return nameOfSchoolChild3;
    }

    public void setNameOfSchoolChild3(String nameOfSchoolChild3) {
        this.nameOfSchoolChild3 = nameOfSchoolChild3;
    }

    public String getRelationshipChild3() {
        return relationshipChild3;
    }

    public void setRelationshipChild3(String relationshipChild3) {
        this.relationshipChild3 = relationshipChild3;
    }

    public String getFirstNameChild4() {
        return firstNameChild4;
    }

    public void setFirstNameChild4(String firstNameChild4) {
        this.firstNameChild4 = firstNameChild4;
    }

    public String getLastNameChild4() {
        return lastNameChild4;
    }

    public void setLastNameChild4(String lastNameChild4) {
        this.lastNameChild4 = lastNameChild4;
    }

    public String getBirtDateChild4() {
        return birtDateChild4;
    }

    public void setBirtDateChild4(String birtDateChild4) {
        this.birtDateChild4 = birtDateChild4;
    }

    public String getSexChild4() {
        return sexChild4;
    }

    public void setSexChild4(String sexChild4) {
        this.sexChild4 = sexChild4;
    }

    public String getNameOfSchoolChild4() {
        return nameOfSchoolChild4;
    }

    public void setNameOfSchoolChild4(String nameOfSchoolChild4) {
        this.nameOfSchoolChild4 = nameOfSchoolChild4;
    }

    public String getRelationshipChild4() {
        return relationshipChild4;
    }

    public void setRelationshipChild4(String relationshipChild4) {
        this.relationshipChild4 = relationshipChild4;
    }

    public String getFirstNameSpouse() {
        return firstNameSpouse;
    }

    public void setFirstNameSpouse(String firstNameSpouse) {
        this.firstNameSpouse = firstNameSpouse;
    }

    public String getLastNameSpouse() {
        return lastNameSpouse;
    }

    public void setLastNameSpouse(String lastNameSpouse) {
        this.lastNameSpouse = lastNameSpouse;
    }

    public String getBirtDateSpouse() {
        return birtDateSpouse;
    }

    public void setBirtDateSpouse(String birtDateSpouse) {
        this.birtDateSpouse = birtDateSpouse;
    }

    public String getSexSpouse() {
        return sexSpouse;
    }

    public void setSexSpouse(String sexSpouse) {
        this.sexSpouse = sexSpouse;
    }
	  
	  
	  
    public String getPerson() throws Throwable
    {
        
        String classFields;
        classFields = "";
        String valueField;
        String nameField;
        for (Field field : this.getClass().getDeclaredFields()){
            nameField = field.getName();
            try {
                if(getInstanceField(this, nameField) == null) {
                    valueField = "";
                }
                else valueField = getInstanceField(this, nameField).toString();
                classFields = nameField + "=" + valueField + " " + classFields;
            } catch (Throwable ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return classFields;
    }
    public static Object getInstanceField(Object instance, String fieldName)throws Throwable{
        Field field = instance.getClass().getDeclaredField(fieldName);
        return field.get(instance);
    }
	  // getter, equals, hashcode
	        
	  
	  
}
