public class MoreOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Logical
        boolean result = (x < y) && (x > 0);
        System.out.println("Logical AND result: " + result);

        // Assignment
        x += 3;  // x = x + 3
        System.out.println("After x += 3, x = " + x);

        // Ternary
        int max = (x > y) ? x : y;
        System.out.println("Max value: " + max);
    }
}
