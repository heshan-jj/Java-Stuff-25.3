package Q2;

class student {
    int studentID, age;
    double gpa;
    String name;

    student(int studentID, int age, double gpa, String name){
        this.studentID = studentID;
        this.age = age;
        this.gpa = gpa;
        this.name = name;
    }

    void introduce(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student ID: "+studentID);
        System.out.println("GPA: "+gpa);
    }
    void updategpa(double newgpa){
        this.gpa = newgpa;
        System.out.println("Updated gpa to: "+gpa);
    }
}

public class main {
    public static void main(String[] args) {
        student s1 = new student(1001, 19, 3.6, "Heshan");
        student s2 = new student(1002, 19, 3.6, "Hasitha");
        
        s1.introduce();
        s2.introduce();

        s2.updategpa(6.70);
    
    }


}
