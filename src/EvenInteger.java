import java.util.Scanner;

public class EvenInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int end = s.nextInt();
        if(end < 2) {
            System.out.println("Below 2.");
        }
        else {
            int sum = 0;
            for(int i = 2; i <= end; i++) {
                if(i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
