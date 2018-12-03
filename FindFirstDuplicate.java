import java.util.HashSet;
import java.util.Scanner;

public class FindFirstDuplicate {

    public static void duplicateFind(int[] arr){
      int min = -1;

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = arr.length -1 ; i >= 0; i--)
        {
            if (hs.contains(arr[i])){
                min=i;
            }
            else{
                hs.add(arr[i]);
            }
        }

        if (min != -1)
            System.out.println("The first repeating element is " + arr[min]);
        else
            System.out.println("There are no repeating elements");
    }

    private static final Scanner S = new Scanner(System.in);
    public static void main(String[] args) {

     String[] items = S.nextLine().split(" ");
     int [] input = new int[items.length];

     for(int i=0; i < items.length; i++)
     {
         input[i] = Integer.parseInt(items[i]);
     }

     duplicateFind(input);

    }
}
