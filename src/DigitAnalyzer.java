import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int evenCounter = 0;
        int oddCounter = 0;
        int zeroCounter = 0;
        System.out.print("Enter number: ");
        String integer = s.next();
        for(int i = 0; i < integer.length(); i++) {
            char current = integer.charAt(i);
            if(current == '2' || current == '4' || current == '6' || current == '8') {
                evenCounter++;
            } 
            else if(current == '1' || current == '3' || current == '5' || current == '7' || current == '9') {
                oddCounter++;
            }
            else if(current == '0') {
                zeroCounter++;
            }
        }
        System.out.println(evenCounter + " of even numbers, " + oddCounter + " of odd numbers, " + zeroCounter + " of zeros.");
    }
}