public class Reduce {
    /**
     * PRECONDITION: n >= 0
     * @param n is the number
     * @return returns an integer representing the number of steps it took to reduce to 0
     */
    public static int reduce(int n) {
        int steps = 0;
        int reducer = n;

        while (reducer > 0) {
            if (reducer % 2 == 0) {
                reducer = reducer / 2;
            }
            else {
                reducer = reducer - 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(reduce(100));
    }
}
