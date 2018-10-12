public class NewCounter {
    public static void main(String[] args) {
        final int LIMIT = 5;
        int count = 0;
        
        while (count < LIMIT) {
            count = count + 1;
            System.out.println(count);
        }
        System.out.println("Done");
    }
}
