package JavaAssignment02;
import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        String grade = "None";
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num01 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num02 = num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num03 = num3.nextInt();

        int total;
        total = num01 + num02 + num03;
        
        float average;
        average = total/3;

        if (average >= 75) {
           grade = "Distinction"; 
        } else if (average > 60) {
            grade = "Credit";
        } else if (average > 50) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("Total marks:"+ total );
        System.out.println("Average marks:"+ average);
        System.out.println("Grade: "+ grade);

    }
}




