package PayrollManagement;

public class SalesRep extends StaffMember
{
    private double Allowance;


    public SalesRep(String firstName, String lastName, String deptNumber,double hoursWorked){
         super(firstName,lastName,deptNumber,hoursWorked);

    }

    public void setAllowance(double allowance) {
        this.Allowance = allowance;
    }

    public double getAllowance() {
        return this.Allowance;
    }

    public void display()
    {
         super.display();
        System.out.println("Allowance: $"+getAllowance());
    }

    @Override
    public double CalculateSalary() {
        double salary=0.00;
          salary = ((this.getHoursWorked() * 1500));

        return salary;
    }
}
