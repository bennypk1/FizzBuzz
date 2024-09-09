/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void runMain() {
        FizzBuzz.main(new String[0]);
    }
    public static void main(String[] args) {

        // initializers
        int i = 1;

        // loop
        while (i <= 100) {

            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        if ((i %3 == 0) && (i %5 == 0)) {
            System.out.println("FizzBuzz");
        }

        else if (i %3 == 0) {
            System.out.println("Fizz");
            }

        else if (i %5 == 0) {
            System.out.println("Buzz");
        }

        else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
