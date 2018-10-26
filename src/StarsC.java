
public class StarsC {
    public static void main(String[] args) {
        for(int i = 0; i <= 12; i++) {
            for(int f = 0; f < i; f++) {
                System.out.print(" ");
            }
            for(int c = 10; c >= i - 1; c--) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}