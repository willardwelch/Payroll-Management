package PayrollManagement;

public class StaffMember {

    private String firstName;
    private  String  lastName;
    private String deptNumber;
    private  double hoursWorked;

    public Manager Mange=new Manager(15.00);
    public SalesRep SRep=new SalesRep(8000);

    StaffMember(String f_name,String l_name,String dept,double hours){

          this.firstName=f_name;
          this.lastName=l_name;
          this.deptNumber=dept;
          this.hoursWorked=hours;
    }
    public void Display(){
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
           salary = (this.getHoursWorked() * 2500) + Mange.getBonus();
       }

      if (this.deptNumber.equals("SalesRep")){
          salary = ((this.getHoursWorked() * 1500) + SRep.getAllowance());
        }

           return salary;
   }
}
