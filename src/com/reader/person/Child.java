package com.reader.person;

public class Child {
    private String certNum;
    private String childLastName;
    private String childFirstName;
    private String birthDate;
    private String sex;
    private String relation;
    private String school;

	
		        
    public Child(String certNum, String childFirstName, String childLastName, 
                  String birthDate, String sex, String relation, String school) {
              this.certNum = certNum;
              this.childFirstName = childFirstName;
              this.childLastName = childLastName;
              this.birthDate = birthDate;
              this.sex = sex;
              this.relation = relation;
              this.school = school;
              
	      
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getChildLastName() {
        return childLastName;
    }

    public void setChildLastName(String childLastName) {
        this.childLastName = childLastName;
    }

    public String getChildFirstName() {
        return childFirstName;
    }

    public void setChildFirstName(String childFirstName) {
        this.childFirstName = childFirstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
			  
	 
	  
    public String getChild()
	  {
		  return "# " + certNum + "FN " + childFirstName + " LN " + childLastName 
                          + " Sex " + sex + " Birthdate " + birthDate
                          + " Relation " + relation + " School " + school;
    }
	  
	  

}
