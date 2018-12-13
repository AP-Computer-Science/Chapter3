public class MultiplicationTable {
    public static void main(String[] args) {
        for(int r = 1; r <= 12; r++) {
            for(int c = 1; c <= 12; c++) {
                int m = r * c;
                System.out.print(m + "\t");
            }
                        System.out.println();
        }
        System.out.println();
    }
}