public class Multiples {
    public static void main(String[] args) {
        int n = 1;
        int counter = 0;

        while (n < 1000) {
            if (n%3 == 0 | n%5 == 0) {
                counter++;
            }
            n++;
        }
        System.out.println(counter);
    }
}
