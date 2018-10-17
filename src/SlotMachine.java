import java.util.Scanner;
import java.text.DecimalFormat;
public class SlotMachine {
    public static void main(String[] args) {
        final double PAYOUT_ODDS = 2;
        final double BONUS_MULTIPLIER = PAYOUT_ODDS * 2;
        final double MIN_LIMIT = 4;
        final double MAX_LIMIT = 1000000;
        int wheel1;
        int wheel2;
        int wheel3;
        double money = 100.00;
        DecimalFormat df = (DecimalFormat)DecimalFormat.getCurrencyInstance();
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("You have " + df.format(money));
            System.out.print("Spin? [Y/N]: ");
            char answer = s.next().toUpperCase()
                                   .trim()
                                   .charAt(0);
            if(answer == 'Y')
            {
                System.out.print("Enter your bet: ");
                double bet = s.nextDouble();
                if(bet < MIN_LIMIT) {
                    System.out.println("Your bet is below the limit.");
                    continue;
                }
                else if(bet > MAX_LIMIT) {
                    System.out.println("Your bet is above the limit.");
                    continue;
                }
                money -= bet;
                wheel1 = (int)(Math.random() * 10);
                wheel2 = (int)(Math.random() * 10);
                wheel3 = (int)(Math.random() * 10);
                System.out.println("The wheels have turned: " + wheel1 + wheel2 + wheel3);
                if((wheel1 == wheel2 && wheel1 == wheel3)
                        && (wheel2 == wheel3 && wheel2 == wheel1)
                        && (wheel3 == wheel1 && wheel3 == wheel2)) {
                    if(wheel1 == 0) {
                        System.out.println("You got the JACKPOT!!!!!!!!!!!!!!!!!!!");
                        money += bet * BONUS_MULTIPLIER;
                    }
                    System.out.println("You won!!!!!!");
                    money += bet * PAYOUT_ODDS;
                }
                else {
                    System.out.println("You Lose!!!");
                }
            }
            else {
                System.out.println("Fine!");
                System.out.println("You have " + df.format(money));
                break;
            }
        }
    }
}
