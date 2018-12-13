
public class StarsB {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for(int f = 8; f >= i - 1; f--) {
                System.out.print(" ");
            }
            for(int c = 1; c <= i - 1; c++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
