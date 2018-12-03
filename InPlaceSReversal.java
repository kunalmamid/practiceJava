import java.util.Scanner;

public class InPlaceSReversal {

    public static void isReverse(String s){
        char[] arr = s.toCharArray();

        for (int i=0,j=s.length() -1; i < j ; i++,j--)
        {
            char temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        System.out.println(String.valueOf(arr));

        for (int i =0; i<s.length(); i++)
        {
            System.out.print(arr[i]);
        }

    }
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String input = scan.nextLine().trim();


        isReverse(input);
    }
}
