package com.reader.person;

public class Child {
	private String employeenum;
	private String childfirstname;
	private String childlastname;
	private String childtype;
	
		        
	  public Child(String employeenum, String childfirstname, String childlastname, String childtype) {
	      this.employeenum = employeenum;
		  this.childfirstname = childfirstname;
		  this.childlastname = childlastname;
		  this.childtype = childtype;
	  }
			  
	  public String getEmployeeNum()
	  {
		  return employeenum; 
	  }
	  
	  public void setEmployeeNum(String employeenum)
	  {
		  this.employeenum = employeenum;
	  }
	  
	  public String getChildLastname()
	  {
		  return childlastname; 
	  }
	  
	  public void setChildLastname(String childlastname)
	  {
		  this.childlastname = childlastname;
	  }
	  
	    
	  public String getchildFirstname()
	  {
		  return childfirstname; 
	  }
	  
	  public void setChildFirstname(String childfirstname)
	  {
		  this.childfirstname = childfirstname;
	  }
	  
	  public String getChildType()
	  {
		  return childtype;
	  }
	  
	  public void setChildType(String childtype)
	  {
		  this.childtype = childtype;
	  }
	  
	  public String getChild()
	  {
		  return "# " + employeenum + "FN " + childfirstname + " LN " + childlastname + " Type " + childtype;
	  }
	  
	  // getter, equals, hashcode
	        
	  @Override
	  public String toString() {
	    return String.format("%s %s %s years", childfirstname, childlastname, childtype);
	  }

}
