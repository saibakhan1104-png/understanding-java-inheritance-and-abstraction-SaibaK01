public class Professor extends AcademicStuff{
    private String researchArea;
    private int numOfpublications;
    private double researchGrant;
    Professor(String memberId,String name,double Salary,String department,String researchArea,
              int numOfpublications,double researchGrant){
        super(memberId, name, Salary, department);
        this.researchArea=researchArea;
        this.numOfpublications=numOfpublications;
        this.researchGrant=researchGrant;

    }
    public void ResearchArea(){
        System.out.println("Research paper :"+researchArea);
        System.out.println("Number of publications :"+numOfpublications);
        System.out.println("Research Grant :"+researchGrant);
    }

    @Override
    void performDuty() {
        System.out.println(name+" is conducting class and supervising the research paper.");
    }
}
