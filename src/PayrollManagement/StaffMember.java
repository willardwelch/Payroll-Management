package PayrollManagement;

import java.util.ArrayList;
import java.util.List;

public  class StaffMember {

    private String firstName;
    private String  lastName;
    private String deptNumber;
    private  double hoursWorked;

    ArrayList<SalesRep> Sales_Rep;

    public void setSales_Rep()  //To set Students list
    {
        //Create three Student objects
        SalesRep Sales_rep1 = new SalesRep("Abe","Lincoln","SalesRep",55);
        SalesRep Sales_rep2 = new SalesRep("Malcom","Marshall","SalesRep",75);
        SalesRep Sales_rep3 = new SalesRep("Shelly-Ann","Fraser","SalesRep",85);
        SalesRep Sales_rep4 = new SalesRep("Merlene","Ottey","SalesRep",45);
        SalesRep Sales_rep5 = new SalesRep("Joel","Garner","SalesRep",85);


        ArrayList<SalesRep> new_Sales_Rep = new ArrayList<>();
        new_Sales_Rep.add(Sales_rep1);
        new_Sales_Rep.add(Sales_rep2);
        new_Sales_Rep.add(Sales_rep3);
        new_Sales_Rep.add(Sales_rep4);
        new_Sales_Rep.add(Sales_rep5);

        this.Sales_Rep = new_Sales_Rep;
    }

    public List<String> getSalesRepList() //To get students list
    {
        List<SalesRep> sale_reps_1 = this.Sales_Rep;
        List<String> names = new ArrayList<>();
        for(SalesRep student : sale_reps_1)
        {
            names.add(student.getFirstName()+" "+ student.getLastName());
        }
        return names;
    }

   public StaffMember(String f_name,String l_name,String dept,double hours){

          this.firstName=f_name;
          this.lastName=l_name;
          this.deptNumber=dept;
          this.hoursWorked=hours;
    }
    public void display(){
        System.out.println("Name: "+ firstName+" "+lastName);
        System.out.println("Department: "+deptNumber);
        System.out.println("Hours worked: "+getHoursWorked());
        System.out.println("Salary: $"+CalculateSalary());

    }

   public void setFirstName(String FirstName){
        this.firstName=FirstName;
   }

   public String getFirstName()
   {
       return this.firstName;
   }
   public void setLastName(String LastName){
        this.lastName=LastName;
   }

   public String getLastName()
   {
       return this.lastName;
   }

   public void setDeptNumber(String Dept){
        this.deptNumber=Dept;
   }

   public String getDeptNumber(){
        return this.deptNumber;
   }

   public void setHoursWorked(double hours){
        this.hoursWorked=hours;
   }

   public double getHoursWorked(){
        return this.hoursWorked;
   }

   public double CalculateSalary()
   {
        double salary=0.00;
       if (this.deptNumber.equals("Manager")){
           salary = (this.getHoursWorked() * 2500) ;
       }

      if (this.deptNumber.equals("SalesRep")){
          salary = ((this.getHoursWorked() * 1500));
        }

           return salary;
   }
}
