package PayrollManagement;

public class Manager extends StaffMember {
    private double Bonus;


    public Manager(String firstName, String lastName, String deptNumber,double hoursWorked){
        super(firstName,lastName,deptNumber,hoursWorked);
    }



    public void setBonus(double bonus) {
        this.Bonus = bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void display(){
        super.display();
        System.out.println("Bonus :"+getBonus());
    }
}
