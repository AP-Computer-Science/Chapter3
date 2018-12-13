import java.lang.reflect.Array;
import java.util.Scanner;
public class PalinDromeTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter word to check: ");
        String forward = s.nextLine()
                          .toUpperCase()
                          .trim();
        String backwards = "";
        for(int r = forward.length() - 1; r >= 0; r--) {
            if(!(forward.charAt(r) >= 65 && forward.charAt(r) <= 90)) {
                //System.out.println("Punctuation Check occurred");
                forward = forward.replace(forward.charAt(r), (char)0);
            }
            else {
                backwards += forward.charAt(r);
            }
        }
        String newForward = "";
        //Delete spaces
        for(int r = 0; r <= forward.length() - 1; r++) {
            if(forward.charAt(r) != 0) {
                newForward += forward.charAt(r);
            }
        }
        //System.out.println(newForward);
        //System.out.println(backwards);
        if(backwards.equals(newForward)) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }
    }
}
