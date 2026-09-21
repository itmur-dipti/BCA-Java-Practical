import java.util.Scanner;

public class cal {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("enter operation");
        String operation=sc.next();
        System.out.print("enter digit 1:");
        int a =sc.nextInt();
        System.out.print("enter digit 2:");
        int b =sc.nextInt();
           switch(operation){
            case "D":
                System.out.println("Divition:"+(a/b));
                break;
            case "M":
                System.out.println("multiplication:"+(a*b));
                break;
            case"A":
                System.out.println("Addition:"+(a+b));
                break;
            case"S":
                System.out.println("Substraction:"+(a-b));
                break;

        }
        }}