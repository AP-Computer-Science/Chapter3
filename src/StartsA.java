public class StartsA {
    public static void main(String[] args) {
        for(int r = 10; r > 0; r--) {
            for(int c = 0; c < r - 1; c++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}