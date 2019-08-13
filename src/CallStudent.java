public class CallStudent {
    public static void main(String[] args) {
       System.out.println("Hello World....:.....");
       Student nasrin = new Student();
       System.out.println("Object nasrin ="+nasrin);
       nasrin.addCousse();
       nasrin.dropCourse();
       nasrin.payment();
       nasrin.enrollment();
       System.out.println("======");
       
       //crete objict GraduateStudent
       GraduateStudent yaya = new GraduateStudent();
       System.out.println("Object yaya ="+yaya);
       yaya.oralExmination();
       yaya.thesisExamination();
       yaya.enrollment();
       yaya.payment();
       yaya.addCousse();
       yaya.dropCourse();
    }
}
