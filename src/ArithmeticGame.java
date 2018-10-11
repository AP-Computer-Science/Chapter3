import java.util.Scanner;

public class ArithmeticGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i <= 10; i++) {
            int randValue = (int)(Math.random() * 4);
            //Addition
            if(randValue == 0) {
                int v1 = (int)(Math.random() * 101);
                int v2 = (int)(Math.random() * 101);
                System.out.print(v1 + " + " + v2 + ":");
                int result = v1 + v2;
                if(s.nextInt() == result) {
                    System.out.println("Correct!");
                    score++;
                }
                else {
                    System.out.println("Incorrect. The correct answer is " + result);
                }
            }
            //Subtraction
            else if(randValue == 1) {
                int v1 = (int)(Math.random() * 101);
                int v2 = (int)(Math.random() * 101);
                if(v2 >= v1) {
                    System.out.print(v1 + " - " + v2 + ":");
                    int result = v1 - v2;
                    if(s.nextInt() == result) {
                        System.out.println("Correct!");
                        score++;
                    }
                    else {
                       System.out.println("Incorrect. The correct answer is " + result); 
                    }
                }
            }
            //Multiplication
            else if(randValue == 2) {
                int v1 = (int)(Math.random() * 101);
                int v2 = (int)(Math.random() * 101);
                System.out.print(v1 + " * " + v2 + ":");
                int result = v1 * v2;
                if(s.nextInt() == result) {
                    System.out.println("Correct!");
                    score++;
                }
                else {
                    System.out.println("Incorrect. The correct answer is " + result);
                }
            }
            //Division
            else if(randValue == 3) {
                int v1 = (int)(Math.random() * 101);
                int v2 = (int)(Math.random() * 101);
                if(v2 % v1 == 0) {
                    
                }
                System.out.print(v1 + " / " + v2 + ":");
            }
        }
    }
}
