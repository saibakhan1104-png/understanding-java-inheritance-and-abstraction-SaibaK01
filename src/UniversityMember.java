abstract class UniversityMember {
    protected String memberId;
    protected String name;
    UniversityMember(String memberId,String name){
        this.memberId=memberId;
        this.name=name;

    }
    public void DisplayBasicInfo(){
        System.out.println("Name of the member: "+name);
        System.out.println("Member ID :"+memberId);
    }
    abstract void performDuty();
}
