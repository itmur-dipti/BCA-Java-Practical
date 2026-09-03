import java.util.Scanner;

public class Experiment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Displaying output
        System.out.println("\nHello, " + name + "!");
        System.out.println("Your marks are: " + marks);

        // Conditional statement
        if (marks >= 40) {
            System.out.println("You are Pass.");
        } else {
            System.out.println("You are Fail.");
        }

        sc.close();
    }
}
