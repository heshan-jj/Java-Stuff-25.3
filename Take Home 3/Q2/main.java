package Q2;

class calculator {
    int num1, num2;
    
    void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}

public class main {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.add(999, 1);
    }
}
