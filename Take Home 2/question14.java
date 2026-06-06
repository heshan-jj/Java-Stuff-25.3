package JavaAssignment02;
import java.util.Scanner;
public class question14 {
    public static void main(String[]args) {

        Scanner getnum1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = getnum1.nextInt();

        Scanner getnum2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num2 = getnum1.nextInt();

        Scanner getnum3 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num3 = getnum1.nextInt();

        int max = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("Larget number is: " + max);
    }
}



