public class help {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate the factorial for a different number
        long factorial = factorial(number);
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
