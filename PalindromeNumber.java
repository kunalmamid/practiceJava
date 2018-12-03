import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int n) {

        //Calculate Devisor
        int devisor = 1;

        while (n / devisor >= 10) {
            devisor *= 10;
        }

        while (n != 0)
        {
            int leading = n / devisor;
            int trailing = n % 10;

        if (leading != trailing)
            return false;


        n = (n % devisor) / 10;

        // Reduce Devisor
            devisor = devisor / 100;

        }
       return true;
    }

    private static final Scanner S = new Scanner(System.in);
    public static void main(String[] args) {

        int input = S.nextInt();

       boolean bool = isPalindrome(input);
       if(bool)
           System.out.println("This si Palindrome");
       else
           System.out.println("Not a palindrom");
    }
}
