
import java.util.Scanner;
       import java.util.Stack;
sahilpublic class PalindromeCheckerApp{

       



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Palindrome Checker App (Stack Based) =====");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase for case-insensitive checking
        String original = input.toLowerCase();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}