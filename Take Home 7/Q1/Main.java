package Q1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add("F", "Y"));

        System.out.println(calc.add(2, 4));

        System.out.println(calc.add(69.99, 79.99));

        System.out.println(calc.add(2, 2, 2));
    }
}
