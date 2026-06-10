public class Employee extends UniversityMember{
    protected double Salary;
    Employee(String memberId,String name,double Salary){
        super(memberId,name);
        this.Salary=Salary;
    }
    public void showSalary(){
        System.out.println("Salary of the member: "+Salary);
    }

    @Override
    void performDuty() {
        System.out.println("Performs general duties.");
    }
}
