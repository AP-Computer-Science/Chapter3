public class StarsD {
    public static void main(String[] args) {
        int times = 0;
        boolean countDown = false;
        for(int i = 0; i < 10; i++) {
            for(int f = 13 - i; f > 0; f--) {
                if(f == 9) {
                    continue;
                }
                System.out.print(" ");
            }
            if(i > 5) {
                for(int f2 = 12 - i; f2 < i + 2; f2++) {
                    System.out.print(" ");
                }
            }
            for(int r = 0; r <= times; r++) {
                System.out.print("*");
            }
            if(times == 8) {
                if(!countDown) {
                    times = 10;
                }
                countDown = true;
            }
            if(countDown) {
                times -= 2;
            }
            else {
                times += 2;
            }
            System.out.println("");
        }
    }
}