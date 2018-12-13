import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vowels = 0;
        int consonants = 0;
        int punctuations = 0;
        int spaces = 0;
        System.out.print("Enter sentence to analyze: ");
        String sentence = s.nextLine()
                          .toLowerCase();
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            //Check spaces
            if(c == 32) {
                spaces++;
            }
            else if(!(c >= 97 && c <= 122) && !(c >= 65 && c <= 90) && c != 32) {
                punctuations++;
            }
            else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println(vowels + " vowels.");
        System.out.println(consonants + " consonants.");
        System.out.println(spaces + " spaces.");
        System.out.println(punctuations + " punctuations.");
    }
}
