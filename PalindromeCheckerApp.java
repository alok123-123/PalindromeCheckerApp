import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Method 1: Array / Two-pointer approach
    public static boolean checkUsingArray(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean checkUsingStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Measure Array approach time
        long startTime1 = System.nanoTime();
        boolean result1 = checkUsingArray(input);
        long endTime1 = System.nanoTime();

        // Measure Stack approach time
        long startTime2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long endTime2 = System.nanoTime();

        System.out.println("\nArray Method Result: " + result1);
        System.out.println("Array Method Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("\nStack Method Result: " + result2);
        System.out.println("Stack Method Time: " + (endTime2 - startTime2) + " ns");

        sc.close();
    }
}