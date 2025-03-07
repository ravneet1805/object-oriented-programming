
// 3. Create a PalindromeChecker class with an attribute text.
// Add methods to:
//   - Check if the text is a palindrome.
//   - Display the result.

import java.util.Scanner;

public class PalindromeChecker {
    String text;
    
    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }
    
    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;
        while(left < right) {
            if(text.charAt(left) != text.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    
    // Method to display the result
    public void displayResult() {
        if(isPalindrome())
            System.out.println("The text \"" + text + "\" is a palindrome.");
        else
            System.out.println("The text \"" + text + "\" is not a palindrome.");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to check for palindrome: ");
        String input = in.next();
        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();
    }
}
