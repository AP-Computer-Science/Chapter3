import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        if(number == 0)
            System.out.println("Number is zero!");
        else {
            if(number % 2 == 0)
                System.out.println("Your number is even!");
            else
                System.out.println("Your number is odd.");
        }
    }
}