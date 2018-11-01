import java.util.Scanner;
import java.text.DecimalFormat;
public class SlotMachine {
    public static void main(String[] args) {
        final double PAYOUT_ODDS = 2.0;
        final double BONUS_MULTIPLIER = PAYOUT_ODDS * 2.0;
        final double MIN_LIMIT = 4.0;
        final double MAX_LIMIT = 10000000000000.0;
        final double COMP_FREE_DRINK = 10.0;
        final double COMP_FREE_MOVIE = 32.0;
        final double COMP_FREE_VACATION = 1.0;
        int wheel1;
        int wheel2;
        int wheel3;
        int timesPlayed = 0;
        int compTimesPlayed = 0;
        double money = 63246234643.00;
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
                wheel1 = (int)(Math.random() * 10);
                wheel2 = (int)(Math.random() * 10);
                //wheel3 = (int)(Math.random() * 10);
                System.out.println("The wheels have turned: " + wheel1 + wheel2);
                if((wheel1 == wheel2)
                        && (wheel2 == wheel1)) {
                        //&& (wheel3 == wheel1 && wheel3 == wheel2)) {
                    if(wheel1 == 0) {
                        System.out.println("You got the JACKPOT!!!!!!!!!!!!!!!!!!!");
                        money += bet * BONUS_MULTIPLIER;
                    }
                    else {
                        System.out.println("You won!!!!!!");
                        money += bet * PAYOUT_ODDS;
                    }
                }
                else {
                    money -= bet;
                    System.out.println("You Lose!!!");
                    //Calculate comps
                    int c = (int)(Math.random() * 50);
                    if(c == COMP_FREE_DRINK) {
                        System.out.println("I feel bad for you, here get yourself a drink!");
                        money += 5;
                        compTimesPlayed = 0;
                    }
                    else if(c == COMP_FREE_MOVIE) {
                        System.out.println("You have been playing for a while, go relax with a good movie!");
                        money += 10;
                    }
                    else if(c == COMP_FREE_VACATION && compTimesPlayed > 100) {
                        System.out.println("You are truly a devoted gambler. The casino will give you a free trip to the Bhamas!!!");
                        money += 500;
                    }
                }
                timesPlayed++;
                compTimesPlayed++;
            }
            else if(answer == 'N') {
                System.out.println("Fine!");
                System.out.println("You have " + df.format(money));
                break;
            }
            else {
                System.out.println("Not valid choice smarty.");
            }
        }
    }
}
