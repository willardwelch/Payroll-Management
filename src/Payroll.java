import PayrollManagement.Manager;
import PayrollManagement.SalesRep;

public class Payroll {

   public static void main(String[] args) {


       //*********Question 3******************
    /*StaffMember staff_member=new StaffMember("Usain","Bolt","Manager",40.80);
     staff_member.setFirstName("Leroy");
     staff_member.setLastName("Mattis");
     staff_member.setDeptNumber("Manager");
     StaffMember staff_member1=new StaffMember("Usain","Bolt","SalesRep",40.80);
     System.out.println("*****StaffMember Object invoked*****");
     staff_member.display();// Displaying staff member  //Question 3
     System.out.println();  */

    //StaffMember sale_manager=new Manager("Raymond","Green","Manager",60.80);
    //StaffMember SRep=new SalesRep("Simone","Lacey","SalesRep",90);

     Manager mng=new Manager("Raymond","Green","Manager",60.80);
     SalesRep s_rep=new SalesRep("Simone","Bailey","SalesRep",80.80);

     s_rep.setSales_Rep();
     s_rep.setSales_Rep();  //Question 4
     System.out.println("*********Displaying the Arraylist*********");   //question 5)
     System.out.println("The Staff in Sales Rep: " +s_rep.getSalesRepList());
     System.out.println();
     mng.setBonus(20000.00);
     mng.setHoursWorked(120.5);
     System.out.println("******Displaying Manager class*******");          //Question 6
     mng.display(); //Displaying Manager

     System.out.println();
     s_rep.setHoursWorked(90.5);
     s_rep.setAllowance(30000);
     System.out.println("***********Displaying Sales Rep Class************"); //Question 6
     s_rep.display();  //Displaying Sales Rep

     System.out.println();
     System.out.println("*******Manager and Sales Rep Salary******");  //Question 8
     System.out.println("Manager Salary: $"+mng.CalculateSalary());
     System.out.println("Sales Rep Salary: $"+s_rep.CalculateSalary());
   }
}