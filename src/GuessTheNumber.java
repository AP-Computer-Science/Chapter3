import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int guesses = 2;
        int randomNum = (int)(Math.random() * 101);
        for(int i = 0; i <= guesses; i++) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter you guess: ");
            int guess = s.nextInt();
            if(guess == randomNum) {
                System.out.println("You did it!");
                break;
            }
            else if(guess > randomNum) {
                System.out.println("Too high!" + " you have " + (guesses - i) + " guesses left!");
            }
            else if(guess < randomNum) {
                System.out.println("Too low!" + " you have " + (guesses - i) + " guesses left!");
            }
        }
    }
}