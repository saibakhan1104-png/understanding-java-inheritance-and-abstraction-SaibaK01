public class AdministrativeOfficer extends Employee {
    private String officeSection;

    AdministrativeOfficer(String memberId, String name, double salary,String officeSection) {
        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    public void manageOffice() {
        System.out.println(name + " manages " + officeSection);
    }
    @Override
    void performDuty() {
        System.out.println(name + " handles administrative tasks.");
    }
}