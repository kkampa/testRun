package com.reader.person;

public class Person {
	  private String employeenum;
	  private String firstname;
	  private String lastname;
	  private String childfirstname1;
	  private String childlastname1;
	  private String childtype1;
	  private String childfirstname2;
	  private String childlastname2;
	  private String childtype2;
	  private String childfirstname3;
	  private String childlastname3;
	  private String childtype3;
	  private String age;
	        
	  public Person(String employeenum, String firstname, String lastname, String age) {
	    this.employeenum = employeenum;
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.age = age;
	  }
	  
	  public String getEmployeeNum()
	  {
		  return employeenum; 
	  }
	  
	  public void setEmployeeNum(String employeenum)
	  {
		  this.employeenum = employeenum;
	  }
	  
	  public String getLastname()
	  {
		  return lastname; 
	  }
	  
	  public void setLastname(String lastname)
	  {
		  this.lastname = lastname;
	  }
	  	   
	  public String getFirstname()
	  {
		  return firstname; 
	  }
	  
	  public void setFirstname(String firstname)
	  {
		  this.firstname = firstname;
	  }
	  
	  
	  public String getAge()
	  {
		  return age;
	  }
	  
	  public void setAge(String age)
	  {
		  this.age = age;
	  }
	  
	  public String getChildLastname1()
	  {
		  return childlastname1; 
	  }
	  
	  public void setChildLastname1(String childlastname)
	  {
		  this.childlastname1 = childlastname;
	  }
	  
	  public String getchildFirstname1()
	  {
		  return childfirstname1; 
	  }
	  
	  public void setChildFirstname1(String childfirstname)
	  {
		  this.childfirstname1 = childfirstname;
	  }
	  
	  public String getChildType1()
	  {
		  return childtype1;
	  }
	  
	  public void setChildType1(String childtype)
	  {
		  this.childtype1 = childtype;
	  }
	  
	  public String getChildLastname2()
	  {
		  return childlastname2; 
	  }
	  
	  public void setChildLastname2(String childlastname)
	  {
		  this.childlastname2 = childlastname;
	  }
	  
	  public String getchildFirstname2()
	  {
		  return childfirstname2; 
	  }
	  
	  public void setChildFirstname2(String childfirstname)
	  {
		  this.childfirstname2 = childfirstname;
	  }
	  
	  public String getChildType2()
	  {
		  return childtype2;
	  }
	  
	  public void setChildType2(String childtype)
	  {
		  this.childtype2 = childtype;
	  }
	  
	  public String getChildLastname3()
	  {
		  return childlastname3; 
	  }
	  
	  public void setChildLastname3(String childlastname)
	  {
		  this.childlastname3 = childlastname;
	  }
	  
	  public String getchildFirstname3()
	  {
		  return childfirstname3; 
	  }
	  
	  public void setChildFirstname3(String childfirstname)
	  {
		  this.childfirstname3 = childfirstname;
	  }
	  
	  public String getChildType3()
	  {
		  return childtype3;
	  }
	  
	  public void setChildType3(String childtype)
	  {
		  this.childtype3 = childtype;
	  }
	  
	  public String getPerson()
	  {
		  return "# " + employeenum + "FN " + firstname + " LN " + lastname + " Age " + age
				  + " child1 " + childfirstname1 + " " + childlastname1 + " " + childtype1
				  + " child2 " + childfirstname2 + " " + childlastname2 + " " + childtype2
				  + " child3 " + childfirstname3 + " " + childlastname3 + " " + childtype3;
	  }
	  // getter, equals, hashcode
	        
	  @Override
	  public String toString() {
	    return String.format("%s %s %s years", firstname, lastname, age);
	  }
	  
}
