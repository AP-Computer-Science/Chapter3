
import java.util.Scanner;

public class LeapYearVersion2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Enter leap year or type 0 to quit program: ");
            int year = s.nextInt();
            if(year == 0) {
                break;
            }
            if(year < 1582) {
                System.out.println("Year too early.");
            }
            else {
                if((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0)) {
                    System.out.println("It is a leap year.");
                }
                else {
                    System.out.println("Not a leap year.");
                }
            }
        }
    }
}