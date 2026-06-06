package JavaAssignment02;
import java.util.Scanner;

public class question05 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num01 = num.nextInt();

        if (num01 % 2 == 0){
            System.out.println(num01 + " is an even number");
        } else {
            System.out.println(num01 + " is an odd number");
        }
    }
}



