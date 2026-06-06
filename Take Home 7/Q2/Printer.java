package Q2;

public class Printer {
    String printData(String text){
        System.out.println("Printing Text");
        return text;
    }
    int printData(int number){
        System.out.println("Printing Number: ");
        return number;
    }
    void printData(String text, int copies){
        System.out.println("Printing " + copies + " copies of " + text);
    }
    boolean printData(boolean isDuplex){
        System.out.println("Duplex printing is: ");
        return isDuplex;
    }
}
