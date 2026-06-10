public class AcademicStuff extends Employee{
    protected String department;
    AcademicStuff(String memberId,String name,double Salary,String department){
        super(memberId,name,Salary);
        this.department=department;
    }
 public void showDept(){
     System.out.println(name+" is a teacher of  "+department+" department");
 }
    @Override
    void performDuty() {
        System.out.println(name+ " Teaches Student in the class");
    }
}
