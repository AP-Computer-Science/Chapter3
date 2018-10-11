
public class Looping {
    public static void main(String[] args) {
        int counter = 100;
        while(counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        for(int c = 100; c >= 1; c--) {
            System.out.println(c);
        }
    }
}
