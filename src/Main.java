import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<UniversityMember> member = new ArrayList<>();
        member.add(new Professor("101", "Dr. Rahman", 100000, "ICT",
                "Cyber Security", 20, 500000));

        member.add(new AdministrativeOfficer("1201", "Mr. Ahmed", 50000, "Student Affairs"));
        System.out.println("\n=== University Members Details ===\n");

        for (int i=0;i< member.size();i++) {
            UniversityMember mem = member.get(i);
            mem.DisplayBasicInfo();
            mem.performDuty();

            if (mem instanceof Employee) {
                Employee e = (Employee) mem;
                e.showSalary();
            }

            if (mem instanceof AcademicStuff) {
                AcademicStuff a = (AcademicStuff) mem;
                a.showDept();
            }

            if (mem instanceof Professor) {
                Professor p = (Professor) mem;
                p.ResearchArea();
            }

            if (mem instanceof AdministrativeOfficer) {
                AdministrativeOfficer ao = (AdministrativeOfficer) mem;
                ao.manageOffice();
            }

        }
    }
}