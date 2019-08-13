public class GraduateStudent extends  Student{
    private String studyLevel;
    private String thesisAdvider;
    
    public void oralExmination(){
        System.out.println("oralExmination");
    }
    public void thesisExamination(){
        System.out.println("thesisExamination");
    }

    @Override
    public void payment() {
        System.out.println("payment by package");
    }
}//end class
