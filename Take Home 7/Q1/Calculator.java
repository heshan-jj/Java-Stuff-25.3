package Q1;

public class Calculator {
   
    int add (int a, int b){
        System.out.println("Int Sum: ");
        return a + b;
    }
    double add ( double a, double b){
        System.out.println("Double Sum: ");
        return a + b;
    }
    int add(int a, int b, int c){
        System.out.println("Three int sums: ");
        return a + b + c ;
    }
    String add (String a, String b){
        System.out.println("String Join:");
        return "a" + "b";
    }
}
