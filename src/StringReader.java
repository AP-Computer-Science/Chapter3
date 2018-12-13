import java.util.Scanner;

public class StringReader {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = s.nextLine();
        for(int i = 0; i < inputString.length(); i++) {
            System.out.println(inputString.charAt(i));
        }
    }
}