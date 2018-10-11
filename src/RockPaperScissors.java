import java.util.Scanner;

public class RockPaperScissors {
    public enum Values {
        Rock, Paper, Scissors
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int computerScore = 0;
        int yourScore = 0;
        System.out.println("Welcome to \"Rock, Paper, Scissors.\" This is a three match.");
        while(true) {
            System.out.print("Enter rock, paper or scissors: ");
            char input = s.next()
                    .toUpperCase()
                    .trim()
                    .charAt(0);
            int random = (int)(Math.random() * 3);
            Values computer = Values.Paper;
            if(random == 0) {
                computer = Values.Paper;
            }
            else if(random == 1) {
                computer = Values.Rock;
            }
            else if(random == 2) {
                computer = Values.Scissors;
            }
            System.out.println("The computer pciked " + computer);
            if(input == 'R' && computer == Values.Paper) {
                System.out.println("You lose.");
                computerScore++;
            }
            else if(input == 'R' && computer == Values.Rock) {
                System.out.println("Tie!");
            }
            else if(input == 'R' && computer == Values.Scissors) {
                System.out.println("You win!");
                yourScore++;
            }
            else if(input == 'P' && computer == Values.Paper) {
                System.out.println("Tie!");
            }
            else if(input == 'P' && computer == Values.Rock) {
                System.out.println("You win!");
                yourScore++;
            }
            else if(input == 'P' && computer == Values.Scissors) {
                System.out.println("You lose!");
                computerScore++;
            }
            else if(input == 'S' && computer == Values.Paper) {
                System.out.println("You win!");
                yourScore++;
            }
            else if(input == 'S' && computer == Values.Rock) {
                System.out.println("You lose!");
                computerScore++;
            }
            else if(input == 'S' && computer == Values.Scissors) {
                System.out.println("Tie!");
            }
            else {
                System.out.println("Please enter a valid value!");
            }
            //Determine winner
            if(computerScore == 3) {
                System.out.println("Boo! The computer won.");
                break;
            }
            else if(yourScore == 3) {
                System.out.println("Yay! you win!");
                break;
            }
            else {
                System.out.println("Computer score: " + computerScore + ", your score: " + yourScore);
            }
        }
    }
}
