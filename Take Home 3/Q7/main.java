package Q7;

class Person {
    private int age;

    public void setAge(int newAge) {
        age = newAge;
    }

    public void printAge() {
        System.out.println(age);
    }
}

public class main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(14);
        p1.printAge();
    }
}
