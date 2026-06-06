package JavaAssignment02;
import java.util.Scanner;
public class question04 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num01 = num.nextInt();
        boolean even = false;

        if (num01 > 0) {
            even = true;
        }
        System.out.println("Is the number postive: "+ even);
    }
}
