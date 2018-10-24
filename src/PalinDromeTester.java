import java.lang.reflect.Array;
import java.util.Scanner;
public class PalinDromeTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter word to check: ");
        String forward = s.nextLine()
                          .toUpperCase();
        for(int r = 0; r < forward.length(); r++) {
            char c = forward.charAt(r);
        }
        String backwards = "";
        for(int r = forward.length() - 1; r >= 0; r--) {
            backwards += forward.charAt(r);
            if(!(forward.charAt(r) >= 65) && !(forward.charAt(r) <= 90)) {
                
            }
        }
        System.out.println(forward);
        System.out.println(backwards);
        if(backwards.equals(forward)) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
}
