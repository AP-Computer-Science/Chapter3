//Page 78 in text
import java.util.Scanner;

public class StringStuff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = s.nextLine();
        for(int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            System.out.println();
        }
    }
}