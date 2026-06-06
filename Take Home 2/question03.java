package JavaAssignment02;
import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num01 = num.nextInt();

        boolean divisibleby5 = false, divisibleby3 = false, result = false;


        if (num01 % 5 == 0) {
            divisibleby5 = true;
        }
        if (num01 % 3 == 0) {
            divisibleby3 = true;
        }

        if (divisibleby3 == divisibleby5) {
            result = true;
        }
        System.out.println("Is the number divisible by 3:"+ divisibleby3);
        System.out.println("Is the number divisible by 5:"+ divisibleby5);
        System.out.println("Is the number divisible by both 3 & 5:" + result);

    }
        
}
