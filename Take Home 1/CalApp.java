public class CalApp {
    public static void main(String [] args){
        Calculator c1 = new Calculator();

        //gonna call the method here
        c1.printMag();

        //non param return
        int sum = c1.addNumber();
        System.out.println("Sum is: "+ sum);

        //param-non return
        c1.subNumber(10, 20);

        //param-return
        int mul = c1.multiplyNumber(50, 2);
        System.out.println("Multiplication is: "+ mul);
    }
}
