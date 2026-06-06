package Q3; 
public class Main {
    public static void main(String[] args) {
        StudentResult student1 = new StudentResult(1, "Alice", 85, 90, 80);
        StudentResult student2 = new StudentResult(2, "Bob", 70, 75, 65);
        
        System.out.println(student1.getResultsheet());
        System.out.println(student2.getResultsheet());
        student1.updateMark(95, "maths");
        System.out.println(student1.getResultsheet());
    }
}
